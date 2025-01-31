package com.manuu.hostel_management.hostel_allotment.controller;

import com.manuu.hostel_management.hostel_allotment.model.request.Application;
import com.manuu.hostel_management.hostel_allotment.model.request.Hostel;
import com.manuu.hostel_management.hostel_allotment.model.request.Student_Details;
import com.manuu.hostel_management.hostel_allotment.service.MyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class MyController {
    @GetMapping("/hello")
    public String sayHello() {
        return "hello!";

    }

    @PostMapping("/user")
    public String user(@RequestBody Application user) {
        System.out.println("Email: " + user.getEmail());
        System.out.println("Enrollment No: " + user.getEnrollmentNo());
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Mobile No: " + user.getMobileNo());
        System.out.println("Gender: " + user.getGender());
        System.out.println("Father's Name: " + user.getFatherName());
        System.out.println("Parent's Mobile No: " + user.getParentMobileNo());
        System.out.println("Category: " + user.getCategory());
        System.out.println("PWD: " + user.getPwd());
        System.out.println("Course ID: " + user.getCourseId());
        System.out.println("Department ID: " + user.getDepartmentId());
        System.out.println("Marksheet Qualifying Exam: " + user.getMarksheetQualifingExam());
        System.out.println("CGPA: " + user.getCgpa());
        System.out.println("Orphan/Child of Widow: " + user.getOrphanChildOfWidow());
        System.out.println("Home Town: " + user.getHomeTown());
        System.out.println("Permanent Address: " + user.getPermanentAddress());
        System.out.println("Proof of Permanent Address: " + user.getProofPermanentAddress());
        System.out.println("Correspondence Address: " + user.getCorrespondenceAddress());
        System.out.println("Nearest Railway Station LPI: " + user.getNearestRailwayStationLpi());
        System.out.println("Distance: " + user.getDistance());
        System.out.println("National Cadet Corps: " + user.getNationalCadetCorps());
        System.out.println("National Service Scheme: " + user.getNationalServiceScheme());
        System.out.println("Sports: " + user.getSports());
        System.out.println("Extra Curricular Activities: " + user.getExtraCurricularActivities());
        System.out.println("Second Degree: " + user.getSecondDegree());
        System.out.println("Scholarship: " + user.getScholarship());
        System.out.println("Legal Action: " + user.getLegealAction());
        System.out.println("Fees Receipt: " + user.getFeesReciept());
        System.out.println("PG Degree More Than: " + user.getPgDegreeMoreThan());
        System.out.println("Non-Professional Degree Program: " + user.getNonProfessionalDegreeProgram());
        System.out.println("Detained: " + user.getDetained());
        System.out.println("CGPA Point: " + user.getCgpaPoint());
//        System.out.println("Orphan Point: " + user.getOrphanPoint());
        System.out.println("Course Point: " + user.getCoursePoint());
        System.out.println("National Cadet Corps Point: " + user.getNationalCadetCorpsPoint());
        System.out.println("National Service Scheme Point: " + user.getNationalServiceSchemePoint());
        System.out.println("Sport Point: " + user.getSportPoint());
        System.out.println("Distance Point: " + user.getDistancePoint());
//        System.out.println("Extra Curricular Activities Point: " + user.getExtraCurricularActivitiesPoint());
//        System.out.println("PWD Point: " + user.getPwdPoint());
        System.out.println("Orphan Value: '" + user.getOrphanChildOfWidow() + "'");
        System.out.println("PWD Value: '" + user.getPwd() + "'");
        System.out.println("Extra Curricular Value: '" + user.getExtraCurricularActivities() + "'");

        System.out.println("Total Point: " + user.getTotalPoint());

        MyService.saveApplication(user);
        return "chek";

    }

    @GetMapping("/getapplicationForms")
    public List<Application> getapplicationForms(@RequestParam int enrollment_no) {
        return MyService.getApplicationByEnrollmentNo(enrollment_no);


    }

    @GetMapping("/sorted-by-points")
    public List<Application> getSortedApplications() {
        return MyService.getSortedStudentsByPoints();
    }


    @PostMapping("/save")
    public String saveStudent(@RequestParam int enrollmentNo, @RequestBody Student_Details studentDetails) {
        MyService.saveStudentWithApplicationData(enrollmentNo, studentDetails);
        return "Student saved successfully";
    }

    @PostMapping("/allocate")
    public ResponseEntity<String> allocateHostel() {
        try {
            // Call the service to allocate the hostel
            MyService. allocateHostelsToTopStudents();
            return ResponseEntity.ok("Hostel allocation completed successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error occurred during hostel allocation: " + e.getMessage());
        }
    }

    @PostMapping("/hostel")
    public String user(@RequestBody Hostel hostel) {
        MyService.savehostel(hostel);
        return "up";
    }
}


