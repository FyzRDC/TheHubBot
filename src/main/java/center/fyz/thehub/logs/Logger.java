package center.fyz.thehub.logs;

import center.fyz.thehub.users.User;

public class Logger {

    public static void log(String message) {
        try {
            new Log(LogType.CONSOLE, message);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void log(LogType type, String message, User user) {
        try {
            new Log(type, message, user);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
