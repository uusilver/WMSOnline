package com.xwtech.mss.pub.po;



/**
 * MssFrameResult generated by MyEclipse - Hibernate Tools
 */

public class FrameResult  implements java.io.Serializable {


    // Fields    

     private Long resultId;
     private Long resultCode;
     private String resultInfo;
     private Long resultType;
     private String resultState;
     private String constantName;
     private String resultDesc;


    // Constructors

    /** default constructor */
    public FrameResult() {
    }

	/** minimal constructor */
    public FrameResult(Long resultId, Long resultCode, String resultInfo, Long resultType, String resultState, String constantName) {
        this.resultId = resultId;
        this.resultCode = resultCode;
        this.resultInfo = resultInfo;
        this.resultType = resultType;
        this.resultState = resultState;
        this.constantName = constantName;
    }
    
    /** full constructor */
    public FrameResult(Long resultId, Long resultCode, String resultInfo, Long resultType, String resultState, String constantName, String resultDesc) {
        this.resultId = resultId;
        this.resultCode = resultCode;
        this.resultInfo = resultInfo;
        this.resultType = resultType;
        this.resultState = resultState;
        this.constantName = constantName;
        this.resultDesc = resultDesc;
    }

   
    // Property accessors

    public Long getResultId() {
        return this.resultId;
    }
    
    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }

    public Long getResultCode() {
        return this.resultCode;
    }
    
    public void setResultCode(Long resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultInfo() {
        return this.resultInfo;
    }
    
    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public Long getResultType() {
        return this.resultType;
    }
    
    public void setResultType(Long resultType) {
        this.resultType = resultType;
    }

    public String getResultState() {
        return this.resultState;
    }
    
    public void setResultState(String resultState) {
        this.resultState = resultState;
    }

    public String getConstantName() {
        return this.constantName;
    }
    
    public void setConstantName(String constantName) {
        this.constantName = constantName;
    }

    public String getResultDesc() {
        return this.resultDesc;
    }
    
    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }
   








}