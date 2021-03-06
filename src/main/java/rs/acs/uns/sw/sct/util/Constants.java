package rs.acs.uns.sw.sct.util;

/**
 * App wide used constants.
 */
public final class Constants {

    private Constants() {

    }

    /**
     * Constants representing USER roles.
     */
    public static final class Roles {
        public static final String ADVERTISER = "advertiser";
        public static final String VERIFIER = "verifier";
        public static final String ADMIN = "admin";

        private Roles() {
        }
    }

    /**
     * Constants representing ENTITY names.
     */
    public static final class EntityNames {
        public static final String ANNOUNCEMENT = "announcement";
        public static final String COMMENT = "comment";
        public static final String COMPANY = "company";
        public static final String MARK = "mark";
        public static final String USER = "user";
        public static final String REAL_ESTATE = "real_estate";
        public static final String REPORT = "report";

        private EntityNames() {
        }
    }

    /**
     * Constants representing COMPANY statuses.
     */
    public static final class CompanyStatus {
        public static final String ACCEPTED = "accepted";
        public static final String REJECTED = "rejected";
        public static final String PENDING = "pending";

        private CompanyStatus() {
        }
    }

    /**
     * Constants representing REPORT statuses.
     */
    public static final class ReportStatus {
        public static final String ACCEPTED = "accepted";
        public static final String REJECTED = "rejected";
        public static final String PENDING = "pending";

        private ReportStatus() {
        }
    }

    /**
     * Constants representing Verified statuses.
     */
    public static final class VerifiedStatuses {
        public static final String VERIFIED = "verified";
        public static final String NOT_VERIFIED = "not-verified";

        private VerifiedStatuses() {
        }
    }

    /**
     * Constants representing file paths for image upload.
     */
    public static final class FilePaths {
        public static final String IMAGES_URL = "http://localhost:8091/api/images/";
        public static final String ANNOUNCEMENTS = "announcements";
        public static final String COMPANIES = "companies";
        public static final String USERS = "users";
        public static final String REAL_ESTATES = "real_estates";
        private FilePaths() {
        }
    }

    /**
     * Constants for Sending Emails functionality.
     */
    public static final class MailParameters {
        public static final long TOKEN_EXPIRE_TIME = 1800000;
        public static final String TOKEN_CONFIRM_LINK = "http://localhost:8091/api/registration-confirm?token=";
        public static final String HOST_NAME = "smtp.gmail.com";
        public static final int HOST_PORT = 587;
        public static final String AUTH_USER = "bacovakuhinja@gmail.com";
        public static final String AUTH_PASS = "jedanjebaco";
        public static final String ANNOUNCEMENT_CLIENT = "http://localhost:8080/index.html#!/announcement/";

        private MailParameters(){
        }
    }

    /**
     * Constants for Verification through email.
     */
    public static final class VerificationPages {
        public static final String SUCCESS = "http://localhost:8080/#/registration-confirm-success";
        public static final String WRONG = "http://localhost:8080/#/registration-wrong-token";
        public static final String EXPIRED = "http://localhost:8080/#/registration-token-expired";

        private VerificationPages(){
        }
    }
}