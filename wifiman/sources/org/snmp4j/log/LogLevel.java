package org.snmp4j.log;

/* loaded from: classes2.dex */
public class LogLevel {
    public static final int LEVEL_ALL = 2;
    public static final int LEVEL_DEBUG = 4;
    public static final int LEVEL_ERROR = 7;
    public static final int LEVEL_FATAL = 8;
    public static final int LEVEL_INFO = 5;
    public static final int LEVEL_NONE = 0;
    public static final int LEVEL_OFF = 1;
    public static final int LEVEL_TRACE = 3;
    public static final int LEVEL_WARN = 6;
    private int level;
    private static final String[] LEVEL_STRINGS = {"NONE", "OFF", "ALL", "TRACE", "DEBUG", "INFO", "WARN", "ERROR", "FATAL"};
    public static final LogLevel NONE = new LogLevel(0);
    public static final LogLevel OFF = new LogLevel(1);
    public static final LogLevel ALL = new LogLevel(2);
    public static final LogLevel TRACE = new LogLevel(3);
    public static final LogLevel DEBUG = new LogLevel(4);
    public static final LogLevel INFO = new LogLevel(5);
    public static final LogLevel WARN = new LogLevel(6);
    public static final LogLevel ERROR = new LogLevel(7);
    public static final LogLevel FATAL = new LogLevel(8);

    public LogLevel(int i10) {
        if (i10 >= 0 && i10 <= 8) {
            this.level = i10;
            return;
        }
        throw new IllegalArgumentException("Unknown log level " + i10);
    }

    public static int levelFromString(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = LEVEL_STRINGS;
            if (i10 >= strArr.length) {
                return -1;
            }
            if (strArr[i10].equals(str)) {
                return i10;
            }
            i10++;
        }
    }

    public static LogLevel toLevel(String str) {
        return new LogLevel(levelFromString(str));
    }

    public int getLevel() {
        return this.level;
    }

    public String toString() {
        return LEVEL_STRINGS[this.level];
    }

    public LogLevel(String str) {
        this(levelFromString(str));
    }
}
