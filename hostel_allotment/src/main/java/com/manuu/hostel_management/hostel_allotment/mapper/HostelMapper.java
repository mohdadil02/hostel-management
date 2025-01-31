package com.manuu.hostel_management.hostel_allotment.mapper;


    import com.manuu.hostel_management.hostel_allotment.model.request.Hostel;
    import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

    public class HostelMapper implements RowMapper<Hostel> {

        @Override
        public Hostel mapRow(ResultSet resultSet, int i) throws SQLException {
            Hostel hostel = new Hostel();
            hostel.setHostelId(resultSet.getInt("hostel_id"));
            hostel.setHostelName(resultSet.getString("hostel_name"));
            hostel.setHostelType(resultSet.getString("hostel_type"));
            hostel.setRoomNo(resultSet.getInt("room_no"));
            hostel.setBedNo(resultSet.getInt("bed_no"));
            hostel.setEnrollmentNo(resultSet.getString("enrollment_no"));
            hostel.setMessNo(resultSet.getInt("mess_no"));
            hostel.setAllocationStatus(resultSet.getString("allocation_status"));
            hostel.setAllocationStarted(resultSet.getDate("allocation_started"));
            hostel.setAllocationEnded(resultSet.getDate("allocation_ended"));
            hostel.setComments(resultSet.getString("comments"));
            return hostel;
        }
    }


