package week05;

public class App {
	public static void main(String[] args) {
		SpacedLogger spacedLogger = new SpacedLogger();
		AsteriskLogger asteriskLogger = new AsteriskLogger();
		
		System.out.println("Testing SpacedLogger:\n");
		spacedLogger.log("Hello");
		spacedLogger.error("Hello");
		
		System.out.println("\nTesting AsteriskLogger:\n");
		asteriskLogger.log("Hello");
		asteriskLogger.error("Hello");
		
	}
}
