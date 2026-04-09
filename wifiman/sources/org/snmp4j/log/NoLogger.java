package org.snmp4j.log;

import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class NoLogger implements LogAdapter {
    static final NoLogger instance = new NoLogger();

    private NoLogger() {
    }

    @Override // org.snmp4j.log.LogAdapter
    public void debug(Serializable serializable) {
    }

    @Override // org.snmp4j.log.LogAdapter
    public void error(Serializable serializable) {
    }

    @Override // org.snmp4j.log.LogAdapter
    public void fatal(CharSequence charSequence, Throwable th2) {
    }

    @Override // org.snmp4j.log.LogAdapter
    public LogLevel getEffectiveLogLevel() {
        return LogLevel.OFF;
    }

    @Override // org.snmp4j.log.LogAdapter
    public Iterator getLogHandler() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // org.snmp4j.log.LogAdapter
    public LogLevel getLogLevel() {
        return LogLevel.OFF;
    }

    @Override // org.snmp4j.log.LogAdapter
    public String getName() {
        return "";
    }

    @Override // org.snmp4j.log.LogAdapter
    public void info(CharSequence charSequence) {
    }

    @Override // org.snmp4j.log.LogAdapter
    public boolean isDebugEnabled() {
        return false;
    }

    @Override // org.snmp4j.log.LogAdapter
    public boolean isInfoEnabled() {
        return false;
    }

    @Override // org.snmp4j.log.LogAdapter
    public boolean isWarnEnabled() {
        return false;
    }

    @Override // org.snmp4j.log.LogAdapter
    public void setLogLevel(LogLevel logLevel) {
    }

    @Override // org.snmp4j.log.LogAdapter
    public void warn(Serializable serializable) {
    }

    @Override // org.snmp4j.log.LogAdapter
    public void error(CharSequence charSequence, Throwable th2) {
    }

    @Override // org.snmp4j.log.LogAdapter
    public void fatal(Object obj) {
    }
}
