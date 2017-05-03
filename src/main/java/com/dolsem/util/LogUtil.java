package com.dolsem.util;

public final class LogUtil {

    interface Logger {
        void put(LogMessage type, String msg);
    }

    enum LogMessage {
        INFO, WARNING
    }

    private LogUtil() {};


}
