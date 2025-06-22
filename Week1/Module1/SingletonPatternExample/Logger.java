public class Logger {
    // Private static instance of Logger (eager initialization or lazy init can be used)
    private static Logger instance;

    // Private constructor to prevent instantiation from other classes
    private Logger() {
        System.out.println("Logger instance created");
    }

    // Public static method to provide access to the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // lazy initialization
        }
        return instance;
    }

    // Example method to demonstrate usage
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
