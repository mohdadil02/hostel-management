package com.manuu.hostel_management.hostel_allotment.config;


    import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.jdbc.core.JdbcTemplate;
        import org.springframework.stereotype.Component;

        import javax.sql.DataSource;

@Component
public class DatabaseConnectionClient {

    @Autowired
    private DataSource dataSource;

    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate ( dataSource );
    }
}
