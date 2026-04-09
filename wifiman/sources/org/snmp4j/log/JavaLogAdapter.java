package org.snmp4j.log;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class JavaLogAdapter implements LogAdapter {
    private final Logger logger;

    public JavaLogAdapter(Logger logger) {
        this.logger = logger;
    }

    private static LogLevel fromJavaToSnmp4jLevel(Level level) {
        if (level == null) {
            return LogLevel.NONE;
        }
        if (Level.ALL.equals(level)) {
            return LogLevel.ALL;
        }
        if (Level.SEVERE.equals(level)) {
            return LogLevel.FATAL;
        }
        if (Level.WARNING.equals(level)) {
            return LogLevel.WARN;
        }
        if (Level.INFO.equals(level)) {
            return LogLevel.INFO;
        }
        if (!Level.CONFIG.equals(level) && !Level.FINE.equals(level)) {
            if (!Level.FINER.equals(level) && !Level.FINEST.equals(level)) {
                if (Level.OFF.equals(level)) {
                    return LogLevel.DEBUG;
                }
                throw new IllegalArgumentException("Mapping not defined from Java level " + level.getName() + " to SNMP4J logging level");
            }
            return LogLevel.TRACE;
        }
        return LogLevel.DEBUG;
    }

    private static Level fromSnmp4jToJdk(LogLevel logLevel) {
        if (logLevel == null) {
            return null;
        }
        switch (logLevel.getLevel()) {
            case 0:
                return Level.OFF;
            case 1:
                return Level.OFF;
            case 2:
                return Level.ALL;
            case 3:
                return Level.FINEST;
            case 4:
                return Level.FINE;
            case 5:
                return Level.INFO;
            case 6:
                return Level.WARNING;
            case 7:
                return Level.SEVERE;
            case 8:
                return Level.SEVERE;
            default:
                throw new IllegalArgumentException("Mapping not defined from SNMP4J level " + logLevel + " to Java logging level");
        }
    }

    private boolean isLoggable(LogLevel logLevel) {
        return this.logger.isLoggable(fromSnmp4jToJdk(logLevel));
    }

    private void log(LogLevel logLevel, String str, Throwable th2) {
        this.logger.log(fromSnmp4jToJdk(logLevel), str, th2);
    }

    @Override // org.snmp4j.log.LogAdapter
    public void debug(Serializable serializable) {
        log(LogLevel.DEBUG, serializable.toString(), null);
    }

    @Override // org.snmp4j.log.LogAdapter
    public void error(Serializable serializable) {
        log(LogLevel.ERROR, serializable.toString(), null);
    }

    @Override // org.snmp4j.log.LogAdapter
    public void fatal(Object obj) {
        log(LogLevel.FATAL, obj.toString(), null);
    }

    @Override // org.snmp4j.log.LogAdapter
    public LogLevel getEffectiveLogLevel() {
        return fromJavaToSnmp4jLevel(this.logger.getLevel());
    }

    @Override // org.snmp4j.log.LogAdapter
    public Iterator<Handler> getLogHandler() {
        return Arrays.asList(this.logger.getHandlers()).iterator();
    }

    @Override // org.snmp4j.log.LogAdapter
    public LogLevel getLogLevel() {
        return getEffectiveLogLevel();
    }

    @Override // org.snmp4j.log.LogAdapter
    public String getName() {
        return this.logger.getName();
    }

    @Override // org.snmp4j.log.LogAdapter
    public void info(CharSequence charSequence) {
        log(LogLevel.INFO, charSequence.toString(), null);
    }

    @Override // org.snmp4j.log.LogAdapter
    public boolean isDebugEnabled() {
        return isLoggable(LogLevel.DEBUG);
    }

    @Override // org.snmp4j.log.LogAdapter
    public boolean isInfoEnabled() {
        return isLoggable(LogLevel.INFO);
    }

    @Override // org.snmp4j.log.LogAdapter
    public boolean isWarnEnabled() {
        return isLoggable(LogLevel.WARN);
    }

    @Override // org.snmp4j.log.LogAdapter
    public void setLogLevel(LogLevel logLevel) throws SecurityException {
        this.logger.setLevel(fromSnmp4jToJdk(logLevel));
    }

    @Override // org.snmp4j.log.LogAdapter
    public void warn(Serializable serializable) {
        log(LogLevel.WARN, serializable.toString(), null);
    }

    @Override // org.snmp4j.log.LogAdapter
    public void error(CharSequence charSequence, Throwable th2) {
        log(LogLevel.ERROR, charSequence.toString(), th2);
    }

    @Override // org.snmp4j.log.LogAdapter
    public void fatal(CharSequence charSequence, Throwable th2) {
        log(LogLevel.FATAL, charSequence.toString(), th2);
    }
}
