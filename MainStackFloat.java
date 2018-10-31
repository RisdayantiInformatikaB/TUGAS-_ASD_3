
public class MainStackFloat {

	public static void main(String[] args) {
		StackFloat tumpuk = new StackFloat();
		
	
		tumpuk.push((float) 177.0);tumpuk.cetak();
		tumpuk.push((float)1986.0);tumpuk.cetak();
		tumpuk.push((float)178.9);tumpuk.cetak();
		tumpuk.push((float)198.2);tumpuk.cetak();
		tumpuk.push((float)206.9);tumpuk.cetak();
		
		tumpuk.pop();tumpuk.cetak();
		

	}

}