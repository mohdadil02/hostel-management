package com.manuu.hostel_management.hostel_allotment.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Application {


    @JsonProperty("email")
    private String email;

    @JsonProperty("enrollment_no")
    private int enrollmentNo;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("mobile_no")
    private long mobileNo;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("father_name")
    private String fatherName;

    @JsonProperty("parent_mobile_no")
    private long parentMobileNo;

    @JsonProperty("category")
    private String category;

    @JsonProperty("pwd")
    private String pwd;

    @JsonProperty("course_id")
    private int courseId;

    @JsonProperty("department_id")
    private int departmentId;

    @JsonProperty("marksheet_qualifing_exam")
    private String marksheetQualifingExam;

    @JsonProperty("cgpa")
    private float cgpa;

    @JsonProperty("orphan_child_of_widow")
    private String orphanChildOfWidow;

    @JsonProperty("home_town")
    private String homeTown;

    @JsonProperty("permanent_address")
    private String permanentAddress;

    @JsonProperty("proof_permanent_address")
    private String proofPermanentAddress;

    @JsonProperty("correspondence_address")
    private String correspondenceAddress;

    @JsonProperty("nearest_railway_station_lpi")
    private String nearestRailwayStationLpi;

    @JsonProperty("distance")
    private int distance;

    @JsonProperty("national_cadet_corps")
    private String nationalCadetCorps;

    @JsonProperty("national_service_scheme")
    private String nationalServiceScheme;

    @JsonProperty("sports")
    private String sports;

    @JsonProperty("extra_curricular_activities")
    private String extraCurricularActivities;

    @JsonProperty("second_degree")
    private String secondDegree;

    @JsonProperty("scholarship")
    private String scholarship;

    @JsonProperty("legeal_action")
    private String legealAction;

    @JsonProperty("fees_reciept")
    private String feesReciept;

    @JsonProperty("pg_degree_more_than")
    private String pgDegreeMoreThan;

    @JsonProperty("non_professional_degree_program")
    private String nonProfessionalDegreeProgram;

    @JsonProperty("detained")
    private String detained;

    @JsonProperty("cgpa_point")
    private int cgpaPoint;

    @JsonProperty("orphan_point")
    private int orphanPoint;

    @JsonProperty("course_point")
    private int coursePoint;

    @JsonProperty("national_cadet_corps_point")
    private int nationalCadetCorpsPoint;

    @JsonProperty("national_service_scheme_point")
    private int nationalServiceSchemePoint;

    @JsonProperty("sport_point")
    private int sportPoint;

    @JsonProperty("distance_point")
    private int distancePoint;

    @JsonProperty("extra_curricular_activities_point")
    private int extraCurricularActivitiesPoint;

    @JsonProperty("pwd_point")
    private int pwdPoint;

    @JsonProperty("total_point")
    private int totalPoint;

    // Getters and Setters for all fields

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(int enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public long getParentMobileNo() {
        return parentMobileNo;
    }

    public void setParentMobileNo(long parentMobileNo) {
        this.parentMobileNo = parentMobileNo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getMarksheetQualifingExam() {
        return marksheetQualifingExam;
    }

    public void setMarksheetQualifingExam(String marksheetQualifingExam) {
        this.marksheetQualifingExam = marksheetQualifingExam;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getOrphanChildOfWidow() {
        return orphanChildOfWidow;
    }

    public void setOrphanChildOfWidow(String orphanChildOfWidow) {
        this.orphanChildOfWidow = orphanChildOfWidow;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getProofPermanentAddress() {
        return proofPermanentAddress;
    }

    public void setProofPermanentAddress(String proofPermanentAddress) {
        this.proofPermanentAddress = proofPermanentAddress;
    }

    public String getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    public void setCorrespondenceAddress(String correspondenceAddress) {
        this.correspondenceAddress = correspondenceAddress;
    }

    public String getNearestRailwayStationLpi() {
        return nearestRailwayStationLpi;
    }

    public void setNearestRailwayStationLpi(String nearestRailwayStationLpi) {
        this.nearestRailwayStationLpi = nearestRailwayStationLpi;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getNationalCadetCorps() {
        return nationalCadetCorps;
    }

    public void setNationalCadetCorps(String nationalCadetCorps) {
        this.nationalCadetCorps = nationalCadetCorps;
    }

    public String getNationalServiceScheme() {
        return nationalServiceScheme;
    }

    public void setNationalServiceScheme(String nationalServiceScheme) {
        this.nationalServiceScheme = nationalServiceScheme;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public String getExtraCurricularActivities() {
        return extraCurricularActivities;
    }

    public void setExtraCurricularActivities(String extraCurricularActivities) {
        this.extraCurricularActivities = extraCurricularActivities;
    }

    public String getSecondDegree() {
        return secondDegree;
    }

    public void setSecondDegree(String secondDegree) {
        this.secondDegree = secondDegree;
    }

    public String getScholarship() {
        return scholarship;
    }

    public void setScholarship(String scholarship) {
        this.scholarship = scholarship;
    }

    public String getLegealAction() {
        return legealAction;
    }

    public void setLegealAction(String legealAction) {
        this.legealAction = legealAction;
    }

    public String getFeesReciept() {
        return feesReciept;
    }

    public void setFeesReciept(String feesReciept) {
        this.feesReciept = feesReciept;
    }

    public String getPgDegreeMoreThan() {
        return pgDegreeMoreThan;
    }

    public void setPgDegreeMoreThan(String pgDegreeMoreThan) {
        this.pgDegreeMoreThan = pgDegreeMoreThan;
    }

    public String getNonProfessionalDegreeProgram() {
        return nonProfessionalDegreeProgram;
    }

    public void setNonProfessionalDegreeProgram(String nonProfessionalDegreeProgram) {
        this.nonProfessionalDegreeProgram = nonProfessionalDegreeProgram;
    }

    public String getDetained() {
        return detained;
    }

    public void setDetained(String detained) {
        this.detained = detained;
    }

    public int getCgpaPoint() {
        return cgpaPoint;
    }

    public void setCgpaPoint(int cgpaPoint) {
        this.cgpaPoint = cgpaPoint;
    }

    public int getOrphanPoint() {
        return orphanPoint;
    }

    public void setOrphanPoint(int orphanPoint) {
        this.orphanPoint = orphanPoint;
    }

    public int getCoursePoint() {
        return coursePoint;
    }

    public void setCoursePoint(int coursePoint) {
        this.coursePoint = coursePoint;
    }

    public int getNationalCadetCorpsPoint() {
        return nationalCadetCorpsPoint;
    }

    public void setNationalCadetCorpsPoint(int nationalCadetCorpsPoint) {
        this.nationalCadetCorpsPoint = nationalCadetCorpsPoint;
    }

    public int getNationalServiceSchemePoint() {
        return nationalServiceSchemePoint;
    }

    public void setNationalServiceSchemePoint(int nationalServiceSchemePoint) {
        this.nationalServiceSchemePoint = nationalServiceSchemePoint;
    }

    public int getSportPoint() {
        return sportPoint;
    }

    public void setSportPoint(int sportPoint) {
        this.sportPoint = sportPoint;
    }

    public int getDistancePoint() {
        return distancePoint;
    }

    public void setDistancePoint(int distancePoint) {
        this.distancePoint = distancePoint;
    }

    public int getExtraCurricularActivitiesPoint() {
        return extraCurricularActivitiesPoint;
    }

    public void setExtraCurricularActivitiesPoint(int extraCurricularActivitiesPoint) {
        this.extraCurricularActivitiesPoint = extraCurricularActivitiesPoint;
    }

    public int getPwdPoint() {
        return pwdPoint;
    }

    public void setPwdPoint(int pwdPoint) {
        this.pwdPoint = pwdPoint;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    @Override
    public String toString() {
        return "Application{" +
                "enrollmentNo=" + enrollmentNo +
                ", totalPoint=" + totalPoint +'}';
    }
}


