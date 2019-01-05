package pl.janbartula.java.utils;

/**
 * Increases the readability of the console
 * @author john_bartu
 * @version 1.1
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
    private static int spacerSize = 64;
    private static String[] Colors = new String[]{
            ANSI_RESET,
            ANSI_BLACK,
            ANSI_RED,
            ANSI_GREEN,
            ANSI_YELLOW,
            ANSI_BLUE,
            ANSI_PURPLE,
            ANSI_CYAN,
            ANSI_WHITE
    };

    /**
     * Change silent mode
     *
     * @param silentEnabled Message to print on console
     */
    public static void SetSilent(boolean silentEnabled) {
        SilentMode = silentEnabled;
    }

    /**
     * Print Message
     * @param text Message to print on console
     */
    public static void Log(String text) {
        System.out.println(ANSI_RESET + text + ANSI_RESET);
    }

    /**
     * Print Message with specified TAG
     * @param tag Tag of message
     * @param text Message to print on console
     */
    public static void Log(String tag, String text) {
        System.out.println(ANSI_RESET + "[" + tag + "]: " + text + ANSI_RESET);
    }

    /**
     * Print Message with specified color
     * @param text Message to print on console
     * @param color Color of printed text
     */
    public static void Log(String text, Color color) {
        System.out.println(Colors[color.ordinal()] + text + ANSI_RESET);
    }

    /**
     * Print Message with TAG and specified colors
     *
     * @param tag   Tag of message
     * @param text  Message to print on console
     * @param color Color of printed text
     */
    public static void Log(String tag, String text, Color color) {
        System.out.println(Colors[color.ordinal()] + ANSI_RESET + "[" + tag + "]: " + text + ANSI_RESET);
    }


    /**
     * Print Message
     * @param text Message to print on console as INFO tag
     */
    public static void LogInfo(String text) {
        System.out.println(ANSI_GREEN + "[INFO]: " + text + ANSI_RESET);
    }

    /**
     * Print DATA Message
     * @param text Message to print on console as DATA tag
     */
    public static void LogData(String text) {
        if (!SilentMode) System.out.println(ANSI_PURPLE + "[DATA]: " + text + ANSI_RESET);
    }

    /**
     * Print STATUS Message
     * @param text Message to print on console as STATUS tag
     */
    public static void LogStatus(String text) {
        System.out.println(ANSI_CYAN + "[STATUS]: " + text + ANSI_RESET);
    }

    /**
     * Print ERROR message
     * * @param text Message to print on console as ERROR tag
     */
    public static void LogError(String text) {
        System.out.println(ANSI_RED + "[ERROR]: " + text + ANSI_RESET);
    }

    /**
     * Print line
     */
    public static void LogLine() {
        System.out.print(ANSI_BLACK);
        for (int index = 0; index < spacerSize; index++) System.out.print('_');
        System.out.println(ANSI_RESET);
    }

    /**
     * Print line with specified pattern
     * @param symbol Pattern used to create line
     */
    public static void LogLine(String symbol) {
        System.out.print(ANSI_BLACK);
        for (int index = 0; index < spacerSize; index++) System.out.print(symbol);
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
