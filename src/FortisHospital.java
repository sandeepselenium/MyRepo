
public class FortisHospital implements Hospital{

	@Override
	public void doOpertaion() {
		System.out.println("Fortis Hospital operation");
		
	}

	@Override
	public void doScan() {
		
		System.out.println("Fortis Hospital scanning");
		
	}

	@Override
	public void doVaccination() {
		System.out.println("FortisHospital Scanning");
		
	}
	
	public void phoneConsultation(){
		System.out.println("Fortis phone consultation");
	}

	
}
