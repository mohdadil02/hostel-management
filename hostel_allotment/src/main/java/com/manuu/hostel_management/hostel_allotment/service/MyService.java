package com.manuu.hostel_management.hostel_allotment.service;

import com.manuu.hostel_management.hostel_allotment.mapper.ApplicationForAllocationMapper;
import com.manuu.hostel_management.hostel_allotment.mapper.ApplicationMapper;
import com.manuu.hostel_management.hostel_allotment.mapper.HostelMapper;
import com.manuu.hostel_management.hostel_allotment.model.request.Application;

import com.manuu.hostel_management.hostel_allotment.model.request.Hostel;
import com.manuu.hostel_management.hostel_allotment.model.request.Student_Details;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


//@Service
//public class MyService {
//
//    private static JdbcTemplate jdbcTemplate;

//    @Autowired
//    public MyService(DatabaseConnectionClient dbClient) {
//        this.jdbcTemplate = dbClient.getJdbcTemplate();
//    }
//
//    public static Application saveUser(Application user) {
////
//        String sql = "INSERT INTO application (enrollment_no, email, first_name, last_name, mobile_no, gender, father_name, parent_mobile_no, category, pwd, course_id, department_id, marksheet_qualifing_exam, cgpa, orphan_child_of_widow, home_town, permanent_address, proof_permanent_address, correspondence_address, nearest_railway_station_lpi, distance, national_cadet_corps, national_service_scheme, sports, extra_curricular_activities, second_degree, scholarship, legeal_action, fees_reciept, pg_degree_more_than, non_professional_degree_program, detained, cgpa_point, orphan_point, course_point, national_cadet_corps_point, national_service_scheme_point, sport_point, distance_point, extra_curricular_activities_point, pwd_point, total_point) " +
//                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?)";
//
//        jdbcTemplate.update(sql,
//                user.getEnrollmentNo(),
//                user.getEmail(),
//                user.getFirstName(),
//                user.getLastName(),
//                user.getMobileNo(),
//                user.getGender(),
//                user.getFatherName(),
//                user.getParentMobileNo(),
//                user.getCategory(),
//                user.getPwd(),
//                user.getCourseId(),
//                user.getDepartmentId(),
//                user.getMarksheetQualifingExam(),
//                user.getCgpa(),
//                user.getOrphanChildOfWidow(),
//                user.getHomeTown(),
//                user.getPermanentAddress(),
//                user.getProofPermanentAddress(),
//                user.getCorrespondenceAddress(),
//                user.getNearestRailwayStationLpi(),
//                user.getDistance(),
//                user.getNationalCadetCorps(),
//                user.getNationalServiceScheme(),
//                user.getSports(),
//                user.getExtraCurricularActivities(),
//                user.getSecondDegree(),
//                user.getScholarship(),
//                user.getLegealAction(),
//                user.getFeesReciept(),
//                user.getPgDegreeMoreThan(),
//                user.getNonProfessionalDegreeProgram(),
//                user.getDetained(),
//                user.getCgpaPoint(),
//                user.getOrphanPoint(),
//                user.getCoursePoint(),
//                user.getNationalCadetCorpsPoint(),
//                user.getNationalServiceSchemePoint(),
//                user.getSportPoint(),
//                user.getDistancePoint(),
//                user.getExtraCurricularActivitiesPoint(),
//                user.getPwdPoint(),
//                user.getTotalPoint()
//        );
//
//        return user;
//    }
//
// public static List<Application> getAllApplication() {
//     String sql = "Select * from application";
//    return  jdbcTemplate.query(sql, appllicationMapper);
//
//  }
//
//
//}
//


@Service
public class MyService {

    private static JdbcTemplate jdbcTemplate;

    public MyService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void ApplicationService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public static Application saveApplication(Application user) {
        int totalPoints = calculateTotalPoints(user);

        String sql = "INSERT INTO application (enrollment_no, email, first_name, last_name, mobile_no, gender, father_name, parent_mobile_no, category, pwd, course_id, department_id, marksheet_qualifing_exam, cgpa, orphan_child_of_widow, home_town, permanent_address, proof_permanent_address, correspondence_address, nearest_railway_station_lpi, distance, national_cadet_corps, national_service_scheme, sports, extra_curricular_activities, second_degree, scholarship, legeal_action, fees_reciept, pg_degree_more_than, non_professional_degree_program, detained, cgpa_point, orphan_point, course_point, national_cadet_corps_point, national_service_scheme_point, sport_point, distance_point, extra_curricular_activities_point, pwd_point, total_point) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?)";

        jdbcTemplate.update(sql,
                user.getEnrollmentNo(),
                user.getEmail(),
                user.getFirstName(),
                user.getLastName(),
                user.getMobileNo(),
                user.getGender(),
                user.getFatherName(),
                user.getParentMobileNo(),
                user.getCategory(),
                user.getPwd(),
                user.getCourseId(),
                user.getDepartmentId(),
                user.getMarksheetQualifingExam(),
                user.getCgpa(),
                user.getOrphanChildOfWidow(),
                user.getHomeTown(),
                user.getPermanentAddress(),
                user.getProofPermanentAddress(),
                user.getCorrespondenceAddress(),
                user.getNearestRailwayStationLpi(),
                user.getDistance(),
                user.getNationalCadetCorps(),
                user.getNationalServiceScheme(),
                user.getSports(),
                user.getExtraCurricularActivities(),
                user.getSecondDegree(),
                user.getScholarship(),
                user.getLegealAction(),
                user.getFeesReciept(),
                user.getPgDegreeMoreThan(),
                user.getNonProfessionalDegreeProgram(),
                user.getDetained(),
                getCgpaPoint(user.getCgpa()),
                getOrphanPoint(user.getOrphanChildOfWidow()),
                getCoursePoint(user.getCourseId()),
                getNationalCadetCorpsPoint(user.getNationalCadetCorps()),
                getNationalServiceSchemePointPoint(user.getNationalServiceScheme()),
                getSportPoint(user.getSports()),  // <-- Add missing field here
                getDistancePoint(user.getDistance()),
                getExtraCurricularPoint(user.getExtraCurricularActivities()),
                getPwdPoint(user.getPwd()),
                calculateTotalPoints(user)
        );


        return user;
    }


    public static int calculateTotalPoints(Application user) {
        return getCgpaPoint(user.getCgpa()) +
                getOrphanPoint(user.getOrphanChildOfWidow()) +
                getCoursePoint(user.getCourseId()) +
                getNationalCadetCorpsPoint(user.getNationalCadetCorps()) +
                getNationalServiceSchemePointPoint(user.getNationalServiceScheme()) +
                getDistancePoint(user.getDistance()) +
                getExtraCurricularPoint(user.getExtraCurricularActivities()) +
                getPwdPoint(user.getPwd());
    }

    private static int getCgpaPoint(float cgpa) {
        if (cgpa >= 8.0) return 40;
        if (cgpa >= 7.0) return 35;
        if (cgpa >= 6.0) return 30;
        if (cgpa >= 5.0) return 25;
        if (cgpa >= 4.0) return 20;
        return 0;
    }

    private static int getOrphanPoint(String OrphanChildOfWidow) {
        if ("No".equalsIgnoreCase(OrphanChildOfWidow)) {
            return 0;
        }
        try {
            return Integer.parseInt(OrphanChildOfWidow);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private static int getCoursePoint(int courseId) {
        return switch (courseId) {
            case 1 -> 20;
            case 2 -> 25;
            case 3 -> 30;
            case 4 -> 35;
            default -> 0;
        };
    }

    private static int getNationalCadetCorpsPoint(String NationalCadetCorps) {
        return switch (NationalCadetCorps) {
            case "NCC-A" -> 5;
            case "NCC-B" -> 3;
            case "NCC-C" -> 2;
            default -> 0;
        };
    }

    private static int getNationalServiceSchemePointPoint(String NationalServiceScheme) {
        return switch (NationalServiceScheme) {
            case "NSS-1" -> 3;
            case "NSS-2" -> 5;
            default -> 0;
        };
    }

    private static int getDistancePoint(int distance) {
        if (distance >= 2000) return 5;
        if (distance >= 1500) return 4;
        if (distance >= 1000) return 3;
        if (distance >= 500) return 2;
        if (distance >= 50) return 1;
        return 0;
    }

    private static int getExtraCurricularPoint(String ExtraCurricularActivities) {
        if ("No".equalsIgnoreCase(ExtraCurricularActivities)) {
            return 0;
        }
        try {
            return Integer.parseInt(ExtraCurricularActivities)+5;
        } catch (NumberFormatException e) {
            return 5;
        }
    }

    private static int getPwdPoint(String pwd) {
        if ("No".equalsIgnoreCase(pwd)) {
            return 0;
        }
        try {
            return Integer.parseInt(pwd) +5;
        } catch (NumberFormatException e) {
            return 5;
        }
    }

    private static int getSportPoint(String sports) {
        return switch (sports) {
            case "International" -> 10;
            case "National" -> 7;
            case "State" -> 5;
            default -> 0;
        };
    }

    //    public static List<Application> getAllApplication() {
//        String sql = "Select * from application ";
//        return jdbcTemplate.query(sql, appllicationMapper);
//
//    }
    public static List<Application> getApplicationByEnrollmentNo(int enrollment_no) {
        String sql = "SELECT * FROM application WHERE enrollment_no = ?";
        return jdbcTemplate.query(sql, new Object[]{enrollment_no}, new ApplicationMapper());
    }


    public static List<Application> getSortedStudentsByPoints() {
        String sql = "SELECT * FROM application ORDER BY total_point DESC";
        return jdbcTemplate.query(sql, new ApplicationMapper());
    }


    // Fetch common fields from application table using enrollmentNo
    public static Application fetchApplicationData(int enrollmentNo) {
        String sql = "SELECT * FROM application WHERE enrollment_no = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{enrollmentNo}, new ApplicationMapper());
    }

    // Save student details combining application fields and unique fields
    public static void saveStudentWithApplicationData(int enrollmentNo, Student_Details studentDetails) {
        Application application = fetchApplicationData(enrollmentNo);

        // Merge data from application and student unique fields
        studentDetails.setEnrolmentNo(application.getEnrollmentNo());
        studentDetails.setEmail(application.getEmail());
        studentDetails.setFirstName(application.getFirstName());
        studentDetails.setLastName(application.getLastName());
        studentDetails.setMobileNo(application.getMobileNo());
        studentDetails.setFatherName(application.getFatherName());
        studentDetails.setParentMobileNo(application.getParentMobileNo());
        studentDetails.setGender(application.getGender());
        studentDetails.setCategory(application.getCategory());
        studentDetails.setPwd(application.getPwd());
        studentDetails.setDepartmentId(application.getDepartmentId());
        studentDetails.setCourseId(application.getCourseId());
        if (studentDetails.getProgramName() != null) {
            studentDetails.setProgramName(studentDetails.getProgramName());
        }
        if (studentDetails.getRollNo() != null) {
            studentDetails.setRollNo(studentDetails.getRollNo());
        }
        if (studentDetails.getYearOfEnrollment() != 0) {
            studentDetails.setYearOfEnrollment(studentDetails.getYearOfEnrollment());
        }
        if (studentDetails.getLastCollege() != null) {
            studentDetails.setLastCollege(studentDetails.getLastCollege());

        }
        if (studentDetails.getDateOfBirth() != null) {
            studentDetails.setDateOfBirth(studentDetails.getDateOfBirth());
        }

        if (studentDetails.getAddressPermanentLine1() != null) {
            studentDetails.setAddressPermanentLine1(studentDetails.getAddressPermanentLine1());
        }

        if (studentDetails.getAddressPermanentLine2() != null) {
            studentDetails.setAddressPermanentLine2(studentDetails.getAddressPermanentLine2());
        }

        if (studentDetails.getAddressCity() != null) {
            studentDetails.setAddressCity(studentDetails.getAddressCity());
        }

        if (studentDetails.getDepartmentName() != null) {
            studentDetails.setDepartmentName(studentDetails.getDepartmentName());
        }
        if (studentDetails.getAddressState() != null) {
            studentDetails.setCourseName(studentDetails.getCourseName());
        }

        if (studentDetails.getMotherName() != null) {
            studentDetails.setMotherName(studentDetails.getMotherName());
        }


        // Insert into student_details table
//            String sql = "INSERT INTO student_details (enrolment_no, email, first_name, last_name, mobile_no, father_name, parent_mobile_no, gender, category, pwd, address_permanent_line_1, address_permanent_line_2,  program_name, roll_no, year_of_enrollment) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//
//            jdbcTemplate.update(sql,
//                    studentDetails.getEnrolmentNo(),
//                    studentDetails.getEmail(),
//                    studentDetails.getFirstName(),
//                    studentDetails.getLastName(),
//                    studentDetails.getMobileNo(),
//                    studentDetails.getFatherName(),
//                    studentDetails.getParentMobileNo(),
//                    studentDetails.getGender(),
//                    studentDetails.getCategory(),
//                    studentDetails.getPwd(),
//                    studentDetails.getAddressPermanentLine1(),
//                    studentDetails.getAddressPermanentLine2(),
//                    studentDetails.getProgramName(),
//                    studentDetails.getRollNo(),
//                    studentDetails.getYearOfEnrollment()
//            );
        String sql = "INSERT INTO student_details (enrolment_no, email, first_name, last_name, mobile_no, father_name, mother_name, parent_mobile_no, gender, date_of_birth, roll_no, address_permanent_line_1, address_permanent_line_2, address_city, address_state, department_name, department_id, program_name, course_name, course_id, year_of_enrollment, last_college, category, pwd, national_cadet_corps) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                studentDetails.getEnrolmentNo(),
                studentDetails.getEmail(),
                studentDetails.getFirstName(),
                studentDetails.getLastName(),
                studentDetails.getMobileNo(),
                studentDetails.getFatherName(),
                studentDetails.getMotherName(),
                studentDetails.getParentMobileNo(),
                studentDetails.getGender(),
                studentDetails.getDateOfBirth(),
                studentDetails.getRollNo(),
                studentDetails.getAddressPermanentLine1(),
                studentDetails.getAddressPermanentLine2(),
                studentDetails.getAddressCity(),
                studentDetails.getAddressState(),
                studentDetails.getDepartmentName(),
                studentDetails.getDepartmentId(),
                studentDetails.getProgramName(),   // Ensure this value is not null
                studentDetails.getCourseName(),
                studentDetails.getCourseId(),
                studentDetails.getYearOfEnrollment(),
                studentDetails.getLastCollege(),
                studentDetails.getCategory(),
                studentDetails.getPwd(),
                studentDetails.getNationalCadetCorps()
        );

    }

//    public static void allocateHostelToStudent() {
//        // Fetch the student with the highest total points
//        String sql = "SELECT enrollment_no, total_point FROM application ORDER BY total_point DESC LIMIT 1";
//        Application topStudent = jdbcTemplate.queryForObject(sql, new ApplicationForAllocationMapper());
//
//        // Check for vacant hostel rooms
//        String hostelSql = "SELECT * FROM hostels WHERE allocation_status = 'vacant' LIMIT 1";
//        List<Hostel> vacantHostels = jdbcTemplate.query(hostelSql, new HostelMapper());
//        System.out.println("Vacant Hostels Found: " + vacantHostels.size());
//        if (!vacantHostels.isEmpty()) {
//            Hostel hostel = vacantHostels.get(0);
//
//            // Insert the allocation details into hostels table
//            String insertHostelSql = "INSERT INTO hostels (hostel_id, hostel_name, hostel_type, allocation_status,  enrollment_no, bed_no,  room_no, mess_no, allocation_started, comments) " +
//                    "VALUES (?, ?, ?, ?, ?, ?, ?,?, NOW(), ?)";
//            jdbcTemplate.update(insertHostelSql,
//                    hostel.getHostelId(),
//                    hostel.getHostelName(),
//                    hostel.getHostelType(),
//                    "allocated",  // Set the status to 'allocated'
//                    topStudent.getEnrollmentNo(),  // Fetch the top student's enrollment number
//                    hostel.getRoomNo(),
//                    hostel.getBedNo(),
//                    hostel.getMessNo(),
//                    hostel.getComments());
//            System.out.println("Hostel ID: " + hostel.getHostelId());
//            System.out.println("Hostel Name: " + hostel.getHostelName());
//            System.out.println("Enrollment No: " + topStudent.getEnrollmentNo());
//
//            // Optionally, update the allocation start time in the existing hostel record
//            String updateAllocationTimeSql = "UPDATE hostels SET allocation_started = NOW() WHERE hostel_id = ?";
//            jdbcTemplate.update(updateAllocationTimeSql, hostel.getHostelId());
//
//            // Print the allocation status
//            System.out.println("Hostel allocated to student with Enrollment No: " + topStudent.getEnrollmentNo());
//        } else {
//            System.out.println("No vacant hostels available.");
//        }
//    }
public static void allocateHostelsToTopStudents() {
    // Fetch the top 5 students with the highest total points
    String sql = "SELECT enrollment_no, total_point FROM application ORDER BY total_point DESC LIMIT 2";
    List<Application> topStudents = jdbcTemplate.query(sql, new ApplicationForAllocationMapper());

    // Check for vacant hostel rooms (at least 5 vacant hostels)
    String hostelSql = "SELECT * FROM hostels WHERE allocation_status = 'vacant' LIMIT 2";
    List<Hostel> vacantHostels = jdbcTemplate.query(hostelSql, new HostelMapper());

    // Debugging lines to print list content and sizes
    System.out.println("Top Students List: " + topStudents);  // Print the student list
    System.out.println("Vacant Hostels List: " + vacantHostels);  // Print the vacant hostel list
    System.out.println("Top Students Count: " + topStudents.size());  // Size of top students
    System.out.println("Vacant Hostels Count: " + vacantHostels.size());  // Size of vacant hostels

    // If enough vacant hostels are available, allocate them to students
    if (vacantHostels.size() <= topStudents.size()) {
        for (int i = 0; i < topStudents.size(); i++) {
            Application student = topStudents.get(i);
            Hostel hostel = vacantHostels.get(i);

            // Insert the allocation details into the hostels table
            String insertHostelSql = "INSERT INTO hostels (hostel_id, hostel_name, hostel_type, allocation_status, enrollment_no, bed_no, room_no, mess_no, allocation_started, comments) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, NOW(), ?)";
            jdbcTemplate.update(insertHostelSql,
                    hostel.getHostelId(),
                    hostel.getHostelName(),
                    hostel.getHostelType(),
                    "allocated",  // Set the status to 'allocated'
                    student.getEnrollmentNo(),  // Fetch the student's enrollment number
                    hostel.getBedNo(),
                    hostel.getRoomNo(),
                    hostel.getMessNo(),
                    hostel.getComments());

            // Optionally, update the allocation start time in the existing hostel record
            String updateAllocationTimeSql = "UPDATE hostels SET allocation_started = NOW() WHERE hostel_id = ? AND room_no = ? AND bed_no = ?";
            jdbcTemplate.update(updateAllocationTimeSql, hostel.getHostelId(), hostel.getRoomNo(), hostel.getBedNo());

            // Print the allocation status for each student
            System.out.println("Hostel allocated to Student: " + student.getEnrollmentNo() +
                    " with Hostel ID: " + hostel.getHostelId() +
                    ", Room No: " + hostel.getRoomNo() +
                    ", Bed No: " + hostel.getBedNo());
        }
    } else {
        System.out.println("Not enough vacant hostels available.");
    }
}


    public static Hostel savehostel(Hostel hostel) {
        String insertHostelSql = "INSERT INTO hostels (hostel_id, hostel_name, hostel_type, allocation_status, bed_no,  room_no, mess_no, allocation_started, comments) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, NOW(), ?)";
        jdbcTemplate.update(insertHostelSql,
                hostel.getHostelId(),
                hostel.getHostelName(),
                hostel.getHostelType(),
                "vacant",  // Set the status to 'allocated'
                hostel.getRoomNo(),
                hostel.getBedNo(),
                hostel.getMessNo(),
                hostel.getComments());
        return hostel;

    }
}














