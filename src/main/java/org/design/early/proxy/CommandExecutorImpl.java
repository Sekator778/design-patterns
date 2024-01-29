package org.design.early.proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws IOException, InterruptedException {
        //some heavy implementation
        Process p = Runtime.getRuntime().exec(cmd);
        p.waitFor();
        System.out.println(p.exitValue());
        System.out.println("'" + cmd + "' command executed.");
    }
}