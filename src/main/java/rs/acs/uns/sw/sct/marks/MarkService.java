package rs.acs.uns.sw.sct.marks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Mark.
 */
@Service
@Transactional
public class MarkService {

    @Autowired
    private MarkRepository markRepository;

    /**
     * Save a mark.
     *
     * @param mark the entity to save
     * @return the persisted entity
     */
    public Mark save(Mark mark) {
        return markRepository.save(mark);
    }

    /**
     * Get all the marks.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Transactional(readOnly = true)
    public Page<Mark> findAll(Pageable pageable) {
        return markRepository.findAll(pageable);
    }

    /**
     * Get all the marks by announcement id.
     *
     * @param pageable       the pagination information
     * @param announcementId id of one announcement
     * @return the list of entities
     */
    @Transactional(readOnly = true)
    public Page<Mark> findAllByAnnouncement(Long announcementId, Pageable pageable) {
        return markRepository.findByAnnouncement_Id(announcementId, pageable);
    }

    /**
     * Get all the marks by user id.
     *
     * @param pageable    the pagination information
     * @param userId      id of one user
     * @return the list of entities
     */
    @Transactional(readOnly = true)
    public Page<Mark> findAllByUser(Long userId, Pageable pageable) {
        return markRepository.findByGradedAnnouncer_Id(userId, pageable);
    }

    /**
     * Get one mark by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Transactional(readOnly = true)
    public Mark findOne(Long id) {
        return markRepository.findOne(id);
    }

    /**
     * Delete the  mark by id.
     *
     * @param id the id of the entity
     */
    public void delete(Long id) {
        markRepository.delete(id);
    }
}
