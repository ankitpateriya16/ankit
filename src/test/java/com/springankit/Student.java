package com.springankit;

public class Student {

	 private int stdId;
	    private String stdName;
	    private String stdAddr;

	    public Student() {
	    }

	    public Student(int stdId, String stdName, String stdAddr) {
	        this.stdId = stdId;
	        this.stdName = stdName;
	        this.stdAddr = stdAddr;
	    }

	    public int getStdId() {
	        return stdId;
	    }

	    public void setStdId(int stdId) {
	        this.stdId = stdId;
	    }

	    @Override
		public String toString() {
			return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAddr=" + stdAddr + "]";
		}

		public String getStdName() {
	        return stdName;
	    }

	    public void setStdName(String stdName) {
	        this.stdName = stdName;
	    }

	    public String getStdAddr() {
	        return stdAddr;
	    }

	    public void setStdAddr(String stdAddr) {
	        this.stdAddr = stdAddr;
	    }
}
