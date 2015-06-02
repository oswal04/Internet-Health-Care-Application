/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author Chirag
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(OrganizationType type) {
        Organization organization = null;
        if (type.getValue().equals(OrganizationType.HospitalDoctor.getValue())) {
            organization = new HospitalDoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(OrganizationType.HospitalNurse.getValue())) {
            organization = new HospitalNurseOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(OrganizationType.HospitalLabAsst.getValue())) {
            organization = new HospitalLabOrganization();
            organizationList.add(organization);
        } //clinic
        else if (type.getValue().equals(OrganizationType.ClinicNurse.getValue())) {
            organization = new ClinicNurseOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(OrganizationType.ClinicDoctor.getValue())) {
            organization = new ClinicDoctorOrganization();
            organizationList.add(organization);
        } //pharmacy
        else if (type.getValue().equals(OrganizationType.PharmacyPharmacist.getValue())) {
            organization = new PharmacistOrganization();
            organizationList.add(organization);
        } //pharma co
        else if (type.getValue().equals(OrganizationType.PharmaCoMgr.getValue())) {
            organization = new PharmaceuticalCompanyMgrOrganization();
            organizationList.add(organization);
        } //fda
        else if (type.getValue().equals(OrganizationType.FDAManager.getValue())) {
            organization = new FDAMgrOrganization();
            organizationList.add(organization);

        } else if (type.getValue().equals(OrganizationType.HPatient.getValue())) {
            organization = new PatientOrganization();
            organizationList.add(organization);

        }
        return organization;
    }
}
