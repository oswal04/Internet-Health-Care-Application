/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

/**
 *
 * @author Chirag
 */
public class Drug {

    private String MedicineName;
    private String GenericName;
    private String CompoundName;
    private String Additives;
    private String ExpDate;
    private String DrugNo;
    private String approvalStatus;
    private String manufacturer;
    private String approvedOn;
    private String dosage;
    private String side_effects;
    private DrugType DrugType;
    private  int complaintcount;

    public  int getComplaintcount() {
        return complaintcount;
    }

    public void setComplaintcount(int complaintcount) {
        this.complaintcount = complaintcount;
    }

    public DrugType getDrugType() {
        return DrugType;
    }

    public void setDrugType(DrugType DrugType) {
        this.DrugType = DrugType;
    }
    
    public enum DrugType{
    
    Generic("Generic"),
    Branded("Branded");
    
    private String value;
    private DrugType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
              
    
    }//end of DrugType
    

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getSide_effects() {
        return side_effects;
    }

    public void setSide_effects(String side_effects) {
        this.side_effects = side_effects;
    }

    public String getApprovedOn() {
        return approvedOn;
    }

    public void setApprovedOn(String approvedOn) {
        this.approvedOn = approvedOn;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Drug() {

        DrugNo = "Drg" + (int) (Math.random() * 10000);
        approvalStatus="Under test";
    }

    public String getMedicineName() {
        return MedicineName;
    }

    public void setMedicineName(String MedicineName) {
        this.MedicineName = MedicineName;
    }

    public String getCompoundName() {
        return CompoundName;
    }

    public void setCompoundName(String CompoundName) {
        this.CompoundName = CompoundName;
    }

    public String getAdditives() {
        return Additives;
    }

    public void setAdditives(String Additives) {
        this.Additives = Additives;
    }

    public String getExpDate() {
        return ExpDate;
    }

    public void setExpDate(String ExpDate) {
        this.ExpDate = ExpDate;
    }

    public String getDrugNo() {
        return DrugNo;
    }

    public void setDrugNo(String DrugNo) {
        this.DrugNo = DrugNo;
    }

    public String getGenericName() {
        return GenericName;
    }

    public void setGenericName(String GenericName) {
        this.GenericName = GenericName;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    @Override
    public String toString() {
        return MedicineName;
    }

}
