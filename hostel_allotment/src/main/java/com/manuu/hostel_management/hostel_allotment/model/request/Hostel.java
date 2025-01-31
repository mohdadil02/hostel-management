package com.manuu.hostel_management.hostel_allotment.model.request;


    import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

    public class Hostel {

        @JsonProperty("hostel_id")
        private int hostelId;

        @JsonProperty("hostel_name")
        private String hostelName;

        @JsonProperty("hostel_type")
        private String hostelType;

        @JsonProperty("room_no")
        private int roomNo;

        @JsonProperty("bed_no")
        private int bedNo;

        @JsonProperty("enrollment_no")
        private String enrolmentNo;

        @JsonProperty("mess_no")
        private Integer messNo;

        @JsonProperty("allocation_status")
        private String allocationStatus = "vacant";

        @JsonProperty("allocation_started")
        private Date allocationStarted;

        @JsonProperty("allocation_ended")
        private Date allocationEnded;

        @JsonProperty("comments")
        private String comments;

        // Getters and Setters
        public int getHostelId() {
            return hostelId;
        }

        public void setHostelId(int hostelId) {
            this.hostelId = hostelId;
        }

        public String getHostelName() {
            return hostelName;
        }

        public void setHostelName(String hostelName) {
            this.hostelName = hostelName;
        }

        public String getHostelType() {
            return hostelType;
        }

        public void setHostelType(String hostelType) {
            this.hostelType = hostelType;
        }

        public int getRoomNo() {
            return roomNo;
        }

        public void setRoomNo(int roomNo) {
            this.roomNo = roomNo;
        }

        public int getBedNo() {
            return bedNo;
        }

        public void setBedNo(int bedNo) {
            this.bedNo = bedNo;
        }

        public String getEnrollmentNo() {
            return enrolmentNo;
        }

        public void setEnrollmentNo(String enrollmentNo) {
            this.enrolmentNo = enrollmentNo;
        }

        public Integer getMessNo() {
            return messNo;
        }

        public void setMessNo(Integer messNo) {
            this.messNo = messNo;
        }

        public String getAllocationStatus() {
            return allocationStatus;
        }

        public void setAllocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
        }

        public Date getAllocationStarted() {
            return allocationStarted;
        }

        public void setAllocationStarted(Date allocationStarted) {
            this.allocationStarted = allocationStarted;
        }

        public Date getAllocationEnded() {
            return allocationEnded;
        }

        public void setAllocationEnded(Date allocationEnded) {
            this.allocationEnded = allocationEnded;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        @Override
        public String toString() {
            return "Hostel{" +
                    "hostelId=" + hostelId +
                    ", hostelName='" + hostelName + '\'' +
                    ", hostelType='" + hostelType + '\'' +
                    ", roomNo=" + roomNo +
                    ", bedNo=" + bedNo +
                    ", messNo=" + messNo +
                    ", comments='" + comments + '\'' +
                    '}';
        }
    }


