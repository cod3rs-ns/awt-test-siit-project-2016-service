package rs.acs.uns.sw.sct.users;

import com.querydsl.core.types.Predicate;
import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static rs.acs.uns.sw.sct.search.UserPredicates.search;

/**
 * Service Implementation for managing Report.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    /**
     * Get one user by email.
     *
     * @param email the email of the user
     * @return user
     */
    public User getUserByEmail(String email) {
        return userRepository.findOneByEmail(email);
    }

    /**
     * Get one user by id.
     *
     * @param id the id of the user
     * @return user
     */
    public User getUserById(Long id) {
        return userRepository.findOne(id);
    }

    /**
     * Get one user by username.
     *
     * @param username the id of the user
     * @return user
     */
    public User getUserByUsername(String username) {
        return userRepository.findOneByUsername(username);
    }


    /**
     * Get all users by company id.
     *
     * @param pageable  the pagination information
     * @param companyId id of one company
     * @return the list of entities
     */
    @Transactional(readOnly = true)
    public Page<User> findAllByCompany(Long companyId, Pageable pageable) {
        return userRepository.findByCompany_Id(companyId, pageable);
    }

    /**
     * Get all the realEstates.
     *
     * @param status   deleted or not deleted
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Transactional(readOnly = true)
    public Page<User> findAllByStatus(Boolean status, Pageable pageable) {
        return userRepository.findAllByDeleted(status, pageable);
    }

    /**
     * Get all users by company membership request status.
     *
     * @param pageable        the pagination information
     * @param companyId       id of one company
     * @param companyVerified status of membership for company
     * @return the list of entities
     */
    @Transactional(readOnly = true)
    public Page<User> findAllByCompanyMembershipStatus(Long companyId, String companyVerified, Pageable pageable) {
        return userRepository.findByCompany_IdAndCompanyVerified(companyId, companyVerified, pageable);
    }


    /**
     * Save new user.
     *
     * @param newUser the user to save
     * @return the persisted user
     */
    public User save(User newUser) {

        // FIXME @bblagojevic Not sure if we need this

        User user = userRepository.findOneByUsername(newUser.getUsername());
        if (user == null || !newUser.getPassword().equals(user.getPassword())) {
            if (newUser != null && newUser.getPassword() != null) {
                BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
                String hashedPassword = passwordEncoder.encode(newUser.getPassword());
                newUser.setPassword(hashedPassword);
            }
        }

        return userRepository.save(newUser);
    }



    /**
     * Get one User by id.
     *
     * @param id the id of the user
     * @return user
     */
    @Transactional(readOnly = true)
    public User findOne(Long id) {
        return userRepository.findOne(id);
    }

    /**
     * Find all users that satisfied criteria defined by query params.
     *
     * @param username    user username
     * @param email       user email
     * @param firstName   user first name
     * @param lastName    user last name
     * @param phoneNumber user phone number
     * @param companyName company name of user
     * @param pageable    the pagination information
     */
    @Transactional(readOnly = true)
    public List<User> findBySearchTerm(String username, String email, String firstName,
                                       String lastName, String phoneNumber, String companyName, Pageable pageable) {
        Predicate searchPredicate = search(username, email, firstName, lastName, phoneNumber, companyName);
        Iterable<User> searchResults = userRepository.findAll(searchPredicate, pageable);
        return IteratorUtils.toList(searchResults.iterator());
    }
}
