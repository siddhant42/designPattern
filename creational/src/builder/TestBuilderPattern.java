package builder;

public class TestBuilderPattern {
	public static void main(String[] args) {
		//Using builder to get the object in a single line of code and
		//without any inconsistent state or arguments
		Computer comp = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		System.out.println(comp.getHDD());
		Computer2 comp2 = new Computer2.ComputerBuilder("1 TB", "8 GB").
				setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
		System.out.println(comp2.getHDD());
	}
}
