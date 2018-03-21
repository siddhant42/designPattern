package builder;

public class Computer2 {

	//required parameters
	private String HDD;
	private String RAM;
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	//Builder Class
	public static class ComputerBuilder{
		private Computer2 computer = new Computer2();
		public ComputerBuilder(String hdd, String ram){
			computer.HDD=hdd;
			computer.RAM=ram;
		}
		public ComputerBuilder setGraphicsCardEnabled(boolean
				isGraphicsCardEnabled) {
			computer.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}
		public ComputerBuilder setBluetoothEnabled(boolean
				isBluetoothEnabled) {
			computer.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		public Computer2 build(){
			return computer;
		}
	}

}
