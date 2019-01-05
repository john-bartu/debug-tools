import pl.janbartula.java.utils.Debug;

public class Example {

    public static void main(String[] args) {

        Debug.LogSpacer();
        Debug.LogSpacer();
        Debug.LogSpacer();
        Debug.LogSpacer();

        Debug.Log("Test Log");
        Debug.Log("Test Log Purple", Debug.Color.PURPLE);
        Debug.Log("Mytag", "Test Log");
        Debug.LogData("Test Log Debug");
        Debug.LogError("Test Log Error");
        Debug.LogInfo("Test Log Info");
        Debug.LogStatus("Test Log Status");
        Debug.Log("Test Spacer:");
        Debug.LogSpacer();


        Debug.Log("Test Line:");
        Debug.LogLine();


        Debug.Log("Test patterned line:");
        Debug.LogLine("-");

        Debug.LogSpacer();
        Debug.LogSpacer();
        Debug.LogSpacer();
        Debug.LogSpacer();
        Debug.LogSpacer();
        Debug.LogSpacer();



        Debug.SetSilent(true);
        Debug.Log("Data Logs are not when SilentMode is turned on:", Debug.Color.RED);
        Debug.LogData("Test Log Debug");
        Debug.LogLine("^");


    }
}



