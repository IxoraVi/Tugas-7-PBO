//pewarisan interface

public class Data implements MataKuliah{

	@Override
	public void namaMhs() {
		System.out.println("Nama Mahasiswa = Amnah");
		
	}

	@Override
	public int stb() {
		return 122;
	}
	
	@Override
	public String mk() {
		return "PBO";
	}
	
}
