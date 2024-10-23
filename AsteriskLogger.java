package week05;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***\n");
		
	}

	@Override
	public void error(String error) {
		String border = "*".repeat(error.length() + 6);
		System.out.println(border);
		System.out.println("***" + error + "***");
		System.out.println(border);
		
	}

}
