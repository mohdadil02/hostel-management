package com.manuu.hostel_management.hostel_allotment.mapper;
import com.manuu.hostel_management.hostel_allotment.model.request.Application;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;


 @Component
 public class ApplicationMapper implements RowMapper<Application> {

     @Override
     public Application mapRow(ResultSet rs, int rowNum) throws SQLException {

         Application user = new Application();

         user.setEmail(rs.getString("email"));
         user.setEnrollmentNo(rs.getInt("enrollment_no"));
         user.setFirstName(rs.getString("first_name"));
         user.setLastName(rs.getString("last_name"));
         user.setMobileNo(rs.getLong("mobile_no"));
         user.setGender(rs.getString("gender"));
         user.setFatherName(rs.getString("father_name"));
         user.setParentMobileNo(rs.getLong("parent_mobile_no"));
         user.setCategory(rs.getString("category"));
         user.setPwd(rs.getString("pwd"));
         user.setCourseId(rs.getInt("course_id"));
         user.setDepartmentId(rs.getInt("department_id"));
         user.setMarksheetQualifingExam(rs.getString("marksheet_qualifing_exam"));
         user.setCgpa(rs.getFloat("cgpa"));
         user.setOrphanChildOfWidow(rs.getString("orphan_child_of_widow"));
         user.setHomeTown(rs.getString("home_town"));
         user.setPermanentAddress(rs.getString("permanent_address"));
         user.setProofPermanentAddress(rs.getString("proof_permanent_address"));
         user.setCorrespondenceAddress(rs.getString("correspondence_address"));
         user.setNearestRailwayStationLpi(rs.getString("nearest_railway_station_lpi"));
         user.setDistance(rs.getInt("distance"));
         user.setNationalCadetCorps(rs.getString("national_cadet_corps"));
         user.setNationalServiceScheme(rs.getString("national_service_scheme"));
         user.setSports(rs.getString("sports"));
         user.setExtraCurricularActivities(rs.getString("extra_curricular_activities"));
         user.setSecondDegree(rs.getString("second_degree"));
         user.setScholarship(rs.getString("scholarship"));
         user.setLegealAction(rs.getString("legeal_action"));
         user.setFeesReciept(rs.getString("fees_reciept"));
         user.setPgDegreeMoreThan(rs.getString("pg_degree_more_than"));
         user.setNonProfessionalDegreeProgram(rs.getString("non_professional_degree_program"));
         user.setDetained(rs.getString("detained"));
         user.setCgpaPoint(rs.getInt("cgpa_point"));
         user.setOrphanPoint(rs.getInt("orphan_point"));
         user.setCoursePoint(rs.getInt("course_point"));
         user.setNationalCadetCorpsPoint(rs.getInt("national_cadet_corps_point"));
         user.setNationalServiceSchemePoint(rs.getInt("national_service_scheme_point"));
         user.setSportPoint(rs.getInt("sport_point"));
         user.setDistancePoint(rs.getInt("distance_point"));
         user.setExtraCurricularActivitiesPoint(rs.getInt("extra_curricular_activities_point"));
         user.setPwdPoint(rs.getInt("pwd_point"));
         user.setTotalPoint(rs.getInt("total_point"));
         return user;
     }
 }

