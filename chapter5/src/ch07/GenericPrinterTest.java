package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {
		Powder material = new Powder();
		GenericPrinter<Powder> printer = new GenericPrinter<>();
		printer.setMaterial(material);
		
		Powder p = printer.getMaterial();
		System.out.println(p.toString());

	}

}
