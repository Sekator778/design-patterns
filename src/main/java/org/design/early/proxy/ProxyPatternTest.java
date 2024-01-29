package org.design.early.proxy;


public class ProxyPatternTest {

    public static void main(String[] args){
        CommandExecutor executor = new CommandExecutorProxy("Sekator",
                "password");
        try {
            executor.runCommand("java -version");
            executor.runCommand("del host");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }
    }
}