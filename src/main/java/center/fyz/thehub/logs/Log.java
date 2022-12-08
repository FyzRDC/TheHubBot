package center.fyz.thehub.logs;

import center.fyz.thehub.users.User;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {

    protected Log(LogType logType, String message) throws IllegalAccessException {
        if(logType != LogType.CONSOLE) throw new IllegalAccessException("To create a log you need to call Logger.log");
        System.out.println(formatedTime()+" "+message);
    }

    protected Log(LogType logType, String message, User user) throws IllegalAccessException {
        if(logType == LogType.CONSOLE) throw new IllegalAccessException("To create a log you need to call Logger.log");
        System.out.println(formatedTime()+" "+message);

        //TODO CREATE EMBED TO SEND
    }

    private String formatedTime() {
        return "["+ LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss"))+"]";
    }
}
