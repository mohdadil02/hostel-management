package com.manuu.hostel_management.hostel_allotment.model.request;


    import com.fasterxml.jackson.annotation.JsonProperty;

    public class Student_Details {

        @JsonProperty("enrolment_no")
        private int enrolmentNo;

        @JsonProperty("email")
        private String email;

        @JsonProperty("first_name")
        private String firstName;

        @JsonProperty("last_name")
        private String lastName;

        @JsonProperty("mobile_no")
        private long mobileNo;

        @JsonProperty("father_name")
        private String fatherName;

        @JsonProperty("mother_name")
        private String motherName;

        @JsonProperty("parent_mobile_no")
        private long parentMobileNo;

        @JsonProperty("gender")
        private String gender;

        @JsonProperty("date_of_birth")
        private String dateOfBirth;  // You may use LocalDate for better date handling

        @JsonProperty("roll_no")
        private String rollNo;

        @JsonProperty("address_permanent_line_1")
        private String addressPermanentLine1;

        @JsonProperty("address_permanent_line_2")
        private String addressPermanentLine2;

        @JsonProperty("address_city")
        private String addressCity;

        @JsonProperty("address_state")
        private String addressState;

        @JsonProperty("department_name")
        private String departmentName;

        @JsonProperty("department_id")
        private int departmentId;

        @JsonProperty("program_name")
        private String programName;

        @JsonProperty("course_name")
        private String courseName;

        @JsonProperty("course_id")
        private int courseId;

        @JsonProperty("year_of_enrollment")
        private int yearOfEnrollment;

        @JsonProperty("last_college")
        private String lastCollege;

        @JsonProperty("category")
        private String category;

        @JsonProperty("pwd")
        private String pwd;
        @JsonProperty("national_cadet_corps")
        private String nationalCadetCorps;



        // Getters and Setters

        public int getEnrolmentNo() {
            return enrolmentNo;
        }

        public void setEnrolmentNo(int enrolmentNo) {
            this.enrolmentNo = enrolmentNo;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
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

        public String getFatherName() {
            return fatherName;
        }

        public void setFatherName(String fatherName) {
            this.fatherName = fatherName;
        }

        public String getMotherName() {
            return motherName;
        }

        public void setMotherName(String motherName) {
            this.motherName = motherName;
        }

        public long getParentMobileNo() {
            return parentMobileNo;
        }

        public void setParentMobileNo(long parentMobileNo) {
            this.parentMobileNo = parentMobileNo;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getRollNo() {
            return rollNo;
        }

        public void setRollNo(String rollNo) {
            this.rollNo = rollNo;
        }

        public String getAddressPermanentLine1() {
            return addressPermanentLine1;
        }

        public void setAddressPermanentLine1(String addressPermanentLine1) {
            this.addressPermanentLine1 = addressPermanentLine1;
        }

        public String getAddressPermanentLine2() {
            return addressPermanentLine2;
        }

        public void setAddressPermanentLine2(String addressPermanentLine2) {
            this.addressPermanentLine2 = addressPermanentLine2;
        }

        public String getAddressCity() {
            return addressCity;
        }

        public void setAddressCity(String addressCity) {
            this.addressCity = addressCity;
        }

        public String getAddressState() {
            return addressState;
        }

        public void setAddressState(String addressState) {
            this.addressState = addressState;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        public int getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentId(int departmentId) {
            this.departmentId = departmentId;
        }

        public String getProgramName() {
            return programName;
        }

        public void setProgramName(String programName) {
            this.programName = programName;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public int getYearOfEnrollment() {
            return yearOfEnrollment;
        }

        public void setYearOfEnrollment(int yearOfEnrollment) {
            this.yearOfEnrollment = yearOfEnrollment;
        }

        public String getLastCollege() {
            return lastCollege;
        }

        public void setLastCollege(String lastCollege) {
            this.lastCollege = lastCollege;
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
        public String getNationalCadetCorps() {
            return nationalCadetCorps;
        }

        public void setNationalCadetCorps(String nationalCadetCorps) {
            this.nationalCadetCorps = nationalCadetCorps;
        }


    }



