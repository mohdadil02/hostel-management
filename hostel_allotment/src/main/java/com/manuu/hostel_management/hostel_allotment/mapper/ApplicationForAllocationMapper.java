package com.manuu.hostel_management.hostel_allotment.mapper;

import com.manuu.hostel_management.hostel_allotment.model.request.Application;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


    public class ApplicationForAllocationMapper implements RowMapper<Application> {

        @Override
        public Application mapRow(ResultSet rs, int rowNum) throws SQLException {
            Application application = new Application();

            // Map only the necessary fields: enrollment_no and total_point
            application.setEnrollmentNo(rs.getInt("enrollment_no"));
            application.setTotalPoint(rs.getInt("total_point"));

            return application;
        }
}
