package org.snmp4j.log;

import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ConsoleLogAdapter implements LogAdapter {
    private static boolean debugEnabled = false;
    private static boolean infoEnabled = true;
    private static boolean warnEnabled = true;

    public static void setDebugEnabled(boolean z10) {
        debugEnabled = z10;
    }

    public static void setInfoEnabled(boolean z10) {
        infoEnabled = z10;
    }

    public static void setWarnEnabled(boolean z10) {
        warnEnabled = z10;
    }

    @Override // org.snmp4j.log.LogAdapter
    public void debug(Serializable serializable) {
        if (debugEnabled) {
            System.out.println(serializable.toString());
        }
    }

    @Override // org.snmp4j.log.LogAdapter
    public void error(Serializable serializable) {
        System.err.println(serializable.toString());
    }

    @Override // org.snmp4j.log.LogAdapter
    public void fatal(Object obj) {
        System.err.println(obj.toString());
    }

    @Override // org.snmp4j.log.LogAdapter
    public LogLevel getEffectiveLogLevel() {
        return getLogLevel();
    }

    @Override // org.snmp4j.log.LogAdapter
    public Iterator getLogHandler() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // org.snmp4j.log.LogAdapter
    public LogLevel getLogLevel() {
        return debugEnabled ? LogLevel.DEBUG : infoEnabled ? LogLevel.INFO : warnEnabled ? LogLevel.WARN : LogLevel.OFF;
    }

    @Override // org.snmp4j.log.LogAdapter
    public String getName() {
        return "";
    }

    @Override // org.snmp4j.log.LogAdapter
    public void info(CharSequence charSequence) {
        if (infoEnabled) {
            System.out.println(charSequence.toString());
        }
    }

    @Override // org.snmp4j.log.LogAdapter
    public boolean isDebugEnabled() {
        return debugEnabled;
    }

    @Override // org.snmp4j.log.LogAdapter
    public boolean isInfoEnabled() {
        return infoEnabled;
    }

    @Override // org.snmp4j.log.LogAdapter
    public boolean isWarnEnabled() {
        return warnEnabled;
    }

    @Override // org.snmp4j.log.LogAdapter
    public void setLogLevel(LogLevel logLevel) {
        debugEnabled = false;
        warnEnabled = false;
        infoEnabled = false;
        int level = logLevel.getLevel();
        if (level == 2 || level == 3 || level == 4) {
            debugEnabled = true;
            warnEnabled = true;
            infoEnabled = true;
        } else if (level == 5) {
            infoEnabled = true;
            warnEnabled = true;
        } else {
            if (level != 6) {
                return;
            }
            warnEnabled = true;
        }
    }

    @Override // org.snmp4j.log.LogAdapter
    public void warn(Serializable serializable) {
        if (warnEnabled) {
            System.out.println(serializable.toString());
        }
    }

    @Override // org.snmp4j.log.LogAdapter
    public void error(CharSequence charSequence, Throwable th2) {
        System.err.println(charSequence.toString());
    }

    @Override // org.snmp4j.log.LogAdapter
    public void fatal(CharSequence charSequence, Throwable th2) {
        System.err.println(charSequence.toString());
    }
}
