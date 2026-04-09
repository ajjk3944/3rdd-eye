package org.snmp4j.log;

import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class LogProxy implements LogAdapter {
    private LogAdapter logger;
    private String name;

    public LogProxy(String str) {
        this.name = str;
    }

    @Override // org.snmp4j.log.LogAdapter
    public void debug(Serializable serializable) {
        LogAdapter logAdapter = this.logger;
        if (logAdapter != null) {
            logAdapter.debug(serializable);
        }
    }

    @Override // org.snmp4j.log.LogAdapter
    public void error(Serializable serializable) {
        LogAdapter logAdapter = this.logger;
        if (logAdapter != null) {
            logAdapter.error(serializable);
        }
    }

    @Override // org.snmp4j.log.LogAdapter
    public void fatal(Object obj) {
        LogAdapter logAdapter = this.logger;
        if (logAdapter != null) {
            logAdapter.fatal(obj);
        }
    }

    @Override // org.snmp4j.log.LogAdapter
    public LogLevel getEffectiveLogLevel() {
        LogAdapter logAdapter = this.logger;
        return logAdapter != null ? logAdapter.getEffectiveLogLevel() : LogLevel.OFF;
    }

    @Override // org.snmp4j.log.LogAdapter
    public Iterator getLogHandler() {
        LogAdapter logAdapter = this.logger;
        return logAdapter != null ? logAdapter.getLogHandler() : Collections.EMPTY_LIST.iterator();
    }

    @Override // org.snmp4j.log.LogAdapter
    public LogLevel getLogLevel() {
        LogAdapter logAdapter = this.logger;
        return logAdapter != null ? logAdapter.getLogLevel() : LogLevel.OFF;
    }

    public LogAdapter getLogger() {
        return this.logger;
    }

    @Override // org.snmp4j.log.LogAdapter
    public String getName() {
        LogAdapter logAdapter = this.logger;
        if (logAdapter != null) {
            logAdapter.getName();
        }
        return this.name;
    }

    @Override // org.snmp4j.log.LogAdapter
    public void info(CharSequence charSequence) {
        LogAdapter logAdapter = this.logger;
        if (logAdapter != null) {
            logAdapter.info(charSequence);
        }
    }

    @Override // org.snmp4j.log.LogAdapter
    public boolean isDebugEnabled() {
        LogAdapter logAdapter = this.logger;
        return logAdapter != null && logAdapter.isDebugEnabled();
    }

    @Override // org.snmp4j.log.LogAdapter
    public boolean isInfoEnabled() {
        LogAdapter logAdapter = this.logger;
        return logAdapter != null && logAdapter.isInfoEnabled();
    }

    @Override // org.snmp4j.log.LogAdapter
    public boolean isWarnEnabled() {
        LogAdapter logAdapter = this.logger;
        return logAdapter != null && logAdapter.isWarnEnabled();
    }

    @Override // org.snmp4j.log.LogAdapter
    public void setLogLevel(LogLevel logLevel) {
        LogAdapter logAdapter = this.logger;
        if (logAdapter != null) {
            logAdapter.setLogLevel(logLevel);
        }
    }

    public void setLogger(LogAdapter logAdapter) {
        this.logger = logAdapter;
    }

    @Override // org.snmp4j.log.LogAdapter
    public void warn(Serializable serializable) {
        LogAdapter logAdapter = this.logger;
        if (logAdapter != null) {
            logAdapter.warn(serializable);
        }
    }

    public LogProxy(LogAdapter logAdapter) {
        this.logger = logAdapter;
    }

    @Override // org.snmp4j.log.LogAdapter
    public void error(CharSequence charSequence, Throwable th2) {
        LogAdapter logAdapter = this.logger;
        if (logAdapter != null) {
            logAdapter.error(charSequence, th2);
        }
    }

    @Override // org.snmp4j.log.LogAdapter
    public void fatal(CharSequence charSequence, Throwable th2) {
        LogAdapter logAdapter = this.logger;
        if (logAdapter != null) {
            logAdapter.fatal(charSequence, th2);
        }
    }
}
