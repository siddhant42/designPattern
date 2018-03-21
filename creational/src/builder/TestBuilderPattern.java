package builder;

public class TestBuilderPattern {
	public static void main(String[] args) {
		//Using builder to get the object in a single line of code and
		//without any inconsistent state or arguments
		Computer comp = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
	}
}