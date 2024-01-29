package org.design.early.proxy;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private final CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        if ("Sekator".equals(user) && "password".equals(pwd)) isAdmin = true;
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().contains("del")) {
                throw new Exception("delete command is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}