package pl.janbartula.java.utils;

/**
 * Increases the readability of the console
 *
 * @author john_bartu
 * @version 0.1
 */

public class Debug {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";
    private static boolean SilentMode = false;
    private static String[] Colors = new String[]{
            "\u001B[0m",
            "\u001B[30m",
            "\u001B[31m",
            "\u001B[32m",
            "\u001B[33m",
            "\u001B[34m",
            "\u001B[35m",
            "\u001B[36m",
            "\u001B[37m"
    };

    private static int spacerSize = 64;

    public static void SetSilent(boolean silent) {
        SilentMode = silent;
    }

    /**
     * Simple println
     */
    public static void Log(String text) {
        System.out.println(ANSI_RESET + text + ANSI_RESET);
    }

    /**
     * Simple println with tag
     */
    public static void Log(String tag, String text) {
        System.out.println(ANSI_RESET + "[" + tag + "]: " + text + ANSI_RESET);
    }

    /**
     * Println with colors
     */
    public static void Log(String text, Color color) {
        System.out.println(Colors[color.ordinal()] + text + ANSI_RESET);
    }

    /**
     * Println just informations
     */
    public static void LogInfo(String text) {
        System.out.println(ANSI_GREEN + "[INFO]: " + text + ANSI_RESET);
    }

    /**
     * Println data serialization
     */
    public static void LogData(String text) {
        if (!SilentMode) System.out.println(ANSI_PURPLE + "[DATA]: " + text + ANSI_RESET);
    }

    /**
     * Println status of server
     */
    public static void LogStatus(String text) {
        System.out.println(ANSI_CYAN + "[STATUS]: " + text + ANSI_RESET);
    }

    /**
     * Println when errors
     */
    public static void LogError(String text) {
        System.out.println(ANSI_RED + "[ERROR]: " + text + ANSI_RESET);
    }

    /**
     * Println spacer by char
     */
    public static void LogLine(String symbol) {
        System.out.print(ANSI_BLACK);
        for (int index = 0; index < spacerSize; index++) System.out.print(symbol);
        System.out.println(ANSI_RESET);
    }

    /**
     * Println spacer by char
     */
    public static void LogLine() {
        System.out.print(ANSI_BLACK);
        for (int index = 0; index < spacerSize; index++) System.out.print('_');
        System.out.println(ANSI_RESET);
    }

    /**
     * Println free line
     */
    public static void LogSpacer() {
        System.out.println(ANSI_RESET);
    }

    public enum Color {
        RESET,
        BLACK,
        RED,
        GREEN,
        YELLOW,
        BLUE,
        PURPLE,
        CYAN,
        WHITE
    }

}
