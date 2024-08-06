
package cbms.encoder.pkg2024;

import static cbms.encoder.pkg2024.dbCon.pst;
import static cbms.encoder.pkg2024.dbCon.conn;
import static cbms.encoder.pkg2024.dbCon.rs;
import cbms.encoder.pkg2024.panel.cbmsEntry;
import java.util.List;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

/**
 *
 * @author CPDD - SPD PDIU
 */
public class saveHousehold {
    
    public static void saveEntriesToDatabase(List<cbmsEntry> entries, String statement) {
            
            try
            {
                LocalDate localDate = null;
                
                conn = dbCon.ConnectDB();
                pst = conn.prepareStatement(statement);
                
                if(entries != null || !entries.isEmpty()) {
                    for (cbmsEntry entry : entries) {
                        pst.setString(1, entry.getLineNo());
                        pst.setString(2, entry.getfName());
                        pst.setString(3, entry.getmName());
                        pst.setString(4, entry.getlName());
                        pst.setString(5, entry.getSuffix());
                        pst.setString(6, entry.getRelationship());
                        pst.setString(7, entry.getSex());

                        if (entry.getBirthdate() != null) {
                                localDate = entry.getBirthdate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                        }

                        if (entry.getBirthdate() == null || "".equals(entry.getBirthdate().toString())) {
                            pst.setNull(8, java.sql.Types.DATE); 
                        } else {
                            pst.setDate(8, java.sql.Date.valueOf(localDate));
                        }
                        pst.setString(9, entry.getCivilStatus());
                        pst.setBoolean(10, entry.hasQcID());
                        pst.setBoolean(11, entry.isOfw());
                        

                        pst.addBatch();
                    }
                    pst.executeBatch();
                    conn.commit();
                }                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    }
    
    public static void savePage1(String statement) {
        try {
            conn = dbCon.ConnectDB();
            pst = conn.prepareStatement(statement);
            
            pst.setString(1, cbmsEntry.getBrgy());
            pst.setString(2, cbmsEntry.getBrgyCode());
            pst.setString(3, cbmsEntry.getEa());
            pst.setString(4, cbmsEntry.getBsn());
            pst.setString(5, cbmsEntry.getHusn());
            pst.setString(6, cbmsEntry.getHsn());
            pst.setString(7, cbmsEntry.getHouseNo());
            pst.setString(8, cbmsEntry.getLotNo());
            pst.setString(9, cbmsEntry.getBlkNo());
            pst.setString(10, cbmsEntry.getUnitNo());
            pst.setString(11, cbmsEntry.getFloorNo());
            pst.setString(12, cbmsEntry.getBldgNo());
            pst.setString(13, cbmsEntry.getStreetName());
            pst.setString(14, cbmsEntry.getVillage());
            pst.setString(15, cbmsEntry.getDataSource());
            pst.setInt(16, cbmsEntry.getNoHH());
            pst.setBoolean(17, cbmsEntry.isRefused());
            pst.setString(18 , cbmsEntry.getBrgyCode()+"-"+cbmsEntry.getEa()+"-"+cbmsEntry.getBsn()+"-"+cbmsEntry.getHusn()+"-"+cbmsEntry.getHsn());
            pst.execute();
            
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "NICE");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
