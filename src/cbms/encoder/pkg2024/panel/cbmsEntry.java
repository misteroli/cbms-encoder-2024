package cbms.encoder.pkg2024.panel;

import java.util.Date;

/**
 *
 * @author CPDD - SPD PDIU
 */
public class cbmsEntry {
    
    //PAGE 1
    private static String brgy;
    private static String brgyCode;
    private static String ea;
    private static String bsn;
    private static String husn;
    private static String hsn;
    private static String houseNo;
    private static String lotNo;
    private static String blkNo;
    private static String unitNo;
    private static String floorNo;
    private static String bldgNo;
    private static String streetName;
    private static String village;
    private static String dataSource;
    private static int noHH;
    private static boolean refused;
    
    
    //SECTION A
    private String lineNo;
    private String fName;
    private String mName;
    private String lName;
    private String suffix;
    private String relationship;
    private String sex;
    private Date birthdate;
    private String civilStatus;
    private boolean qcID;
    
    //SECTION B
    private boolean ofw;

    public cbmsEntry(
            String lineNo, 
            //String fName,
            //String mName,
            //String lName,
            //String suffix,
            //String relationship,
            String sex,
            Date birthdate,
            String civilStatus,
            boolean qcID,
            boolean ofw) {
        
        this.lineNo = lineNo;
        //this.fName = fName;
        //this.mName = mName;
        //this.lName = lName;
        //this.suffix = suffix;
        //this.relationship = relationship;
        this.sex = sex;
        this.birthdate = birthdate;
        this.civilStatus = civilStatus;
        this.qcID = qcID;
        this.ofw = ofw;
    }
    
    /**
     * @return the lineNo
     */
    public String getLineNo() {
        return lineNo;
    }

    /**
     * @param lineNo the lineNo to set
     */
    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the mName
     */
    public String getmName() {
        return mName;
    }

    /**
     * @param mName the mName to set
     */
    public void setmName(String mName) {
        this.mName = mName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @return the suffix
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * @param suffix the suffix to set
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * @return the relationship
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * @param relationship the relationship to set
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the birthdate
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the civilStatus
     */
    public String getCivilStatus() {
        return civilStatus;
    }

    /**
     * @param civilStatus the civilStatus to set
     */
    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    /**
     * @return the qcID
     */
    public boolean hasQcID() {
        return qcID;
    }

    /**
     * @param qcID the qcID to set
     */
    public void setQcID(boolean qcID) {
        this.qcID = qcID;
    }

    /**
     * @return the ofw
     */
    public boolean isOfw() {
        return ofw;
    }

    /**
     * @param ofw the ofw to set
     */
    public void setOfw(boolean ofw) {
        this.ofw = ofw;
    }

    
    //PAGE 1
    /**
     * @return the brgy
     */
    public static String getBrgy() {
        return brgy;
    }

    /**
     * @param brgy the brgy to set
     */
    public static void setBrgy(String brgy) {
        cbmsEntry.brgy = brgy;
    }

    /**
     * @return the brgyCode
     */
    public static String getBrgyCode() {
        return brgyCode;
    }

    /**
     * @param brgyCode the brgyCode to set
     */
    public static void setBrgyCode(String brgyCode) {
        cbmsEntry.brgyCode = brgyCode;
    }

    /**
     * @return the ea
     */
    public static String getEa() {
        return ea;
    }

    /**
     * @param ea the ea to set
     */
    public static void setEa(String ea) {
        cbmsEntry.ea = ea;
    }

    /**
     * @return the bsn
     */
    public static String getBsn() {
        return bsn;
    }

    /**
     * @param bsn the bsn to set
     */
    public static void setBsn(String bsn) {
        cbmsEntry.bsn = bsn;
    }

    /**
     * @return the husn
     */
    public static String getHusn() {
        return husn;
    }

    /**
     * @param husn the husn to set
     */
    public static void setHusn(String husn) {
        cbmsEntry.husn = husn;
    }

    /**
     * @return the hsn
     */
    public static String getHsn() {
        return hsn;
    }

    /**
     * @param hsn the hsn to set
     */
    public static void setHsn(String hsn) {
        cbmsEntry.hsn = hsn;
    }

    /**
     * @return the houseNo
     */
    public static String getHouseNo() {
        return houseNo;
    }

    /**
     * @param houseNo the houseNo to set
     */
    public static void setHouseNo(String houseNo) {
        cbmsEntry.houseNo = houseNo;
    }

    /**
     * @return the lotNo
     */
    public static String getLotNo() {
        return lotNo;
    }

    /**
     * @param lotNo the lotNo to set
     */
    public static void setLotNo(String lotNo) {
        cbmsEntry.lotNo = lotNo;
    }

    /**
     * @return the blkNo
     */
    public static String getBlkNo() {
        return blkNo;
    }

    /**
     * @param blkNo the blkNo to set
     */
    public static void setBlkNo(String blkNo) {
        cbmsEntry.blkNo = blkNo;
    }

    /**
     * @return the unitNo
     */
    public static String getUnitNo() {
        return unitNo;
    }

    /**
     * @param unitNo the unitNo to set
     */
    public static void setUnitNo(String unitNo) {
        cbmsEntry.unitNo = unitNo;
    }

    /**
     * @return the floorNo
     */
    public static String getFloorNo() {
        return floorNo;
    }

    /**
     * @param floorNo the floorNo to set
     */
    public static void setFloorNo(String floorNo) {
        cbmsEntry.floorNo = floorNo;
    }

    /**
     * @return the bldgNo
     */
    public static String getBldgNo() {
        return bldgNo;
    }

    /**
     * @param bldgNo the bldgNo to set
     */
    public static void setBldgNo(String bldgNo) {
        cbmsEntry.bldgNo = bldgNo;
    }

    /**
     * @return the streetName
     */
    public static String getStreetName() {
        return streetName;
    }

    /**
     * @param streetName the streetName to set
     */
    public static void setStreetName(String streetName) {
        cbmsEntry.streetName = streetName;
    }

    /**
     * @return the village
     */
    public static String getVillage() {
        return village;
    }

    /**
     * @param village the village to set
     */
    public static void setVillage(String village) {
        cbmsEntry.village = village;
    }

    /**
     * @return the dataSource
     */
    public static String getDataSource() {
        return dataSource;
    }

    /**
     * @param dataSource the dataSource to set
     */
    public static void setDataSource(String dataSource) {
        cbmsEntry.dataSource = dataSource;
    }

    /**
     * @return the noHH
     */
    public static int getNoHH() {
        return noHH;
    }

    /**
     * @param noHH the noHH to set
     */
    public static void setNoHH(int noHH) {
        cbmsEntry.noHH = noHH;
    }

    /**
     * @return the refused
     */
    public static boolean isRefused() {
        return refused;
    }

    /**
     * @param refused the refused to set
     */
    public static void setRefused(boolean refused) {
        cbmsEntry.refused = refused;
    }
    

}
