# KsiazkiREST migration

* Spring Boot 2.1.11 -> 3.5.16 (intermediate migration), Java 8 -> 21, javax -> jakarta.
* Replaced unsupported Springfox and JJWT 0.9.1 with JJWT 0.12.6.
* Requires DB_URL, DB_USERNAME, DB_PASSWORD and JWT_SECRET_B64 (base64-encoded, 64-byte random key for HS512).
* The secret from old commits must be rotated. No credential history rewrite was performed.
* REST book GET remains public. Other /api endpoints require authentication, except /api/auth/** and /api/all.
* Public signup now grants ROLE_USER only; clients cannot self-assign admin privileges.
* Spring Boot 3.5 is an intermediate migration; follow-up to Spring Boot 4.x is required.
* SQL Server schema must be reviewed and migrated manually. Back up DB before any deployment; CI uses isolated H2 only.
* Swagger UI 2.x is removed and not yet replaced; audit API docs before deployment.
* CI validates compilation and H2 application context; no external SQL Server integration tests are available.
