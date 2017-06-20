
public class TestInterface {
	
	public static void main(String args[]){
		FortisHospital fortis = new FortisHospital();
		fortis.doOpertaion();
		fortis.doScan();
		fortis.doVaccination();
		fortis.phoneConsultation();
		
				
		/*GovtHospital gov = new GovtHospital(); 
		gov.doOpertaion();
		gov.doScan();
		gov.doVaccination();*/
		
		System.out.println("------------------");
			
		StreetHospital strt = new StreetHospital();
		strt.doOpertaion();
		strt.doScan();
		strt.doVaccination();
		
		
	}

}
