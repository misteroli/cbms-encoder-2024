
package cbms.encoder.pkg2024.panel;

/**
 *
 * @author CPDD - SPD PDIU
 */
public class statementProfiles {
    
    public static String sectionAB = "INSERT INTO Section_AB "
            + "(line_no, fname, mname, lname, suffix, relationship, sex,"
            + "birthdate, civilstatus, qcid, ofw) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    
    
    public static String insertPage1 = "{call insertPage1 (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
    
}
