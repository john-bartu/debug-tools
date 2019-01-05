# debug-tools
Lightweight and easy to learn java tool - Increases the readability of your console

## Description
This tool will help you organize and increase the speed of reading data from the console
#####Preview how it works:
![alt text](https://raw.githubusercontent.com/john-bartu/debug-tools/master/showcase.png)

###Basic

`Debug.Log("EXAMPLE");` - it simple print message to console

`Debug.Log("EXAMPLE, Debug.Color.PURPLE);` - it print message with specified color

`Debug.Log("TAG", "EXAMPLE");` - it print message with specified tag


###Default tags

`Debug.LogData("EXAMPLE");` - Logs with data it should be messages which are for example raw data of server packets sent or received from client - they can be turned of by turning silent mode

`Debug.LogError("EXAMPLE");` - Logs of Exepctions or other errors in your programm

`Debug.LogInfo("EXAMPLE");` - Info logs should be not necessary messages

`Debug.LogStatus("EXAMPLE");` - Status logs should be used when example: Server is turend on, Something is calculating or there is end of some big function, zip is extracted etc.


###Lines 

`Debug.LogLine();` - draw line in Console

`Debug.LogLine("-");` - draw line in Console by specified String

`Debug.LogSpacer();` - draw free line in Console


`Debug.SetSilent(true)` - It change silent mode status, LogData are not printed when SilentMode is turned on
