package org.snmp4j.log;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface LogAdapter {
    void debug(Serializable serializable);

    void error(Serializable serializable);

    void error(CharSequence charSequence, Throwable th2);

    void fatal(CharSequence charSequence, Throwable th2);

    void fatal(Object obj);

    LogLevel getEffectiveLogLevel();

    Iterator getLogHandler();

    LogLevel getLogLevel();

    String getName();

    void info(CharSequence charSequence);

    boolean isDebugEnabled();

    boolean isInfoEnabled();

    boolean isWarnEnabled();

    void setLogLevel(LogLevel logLevel);

    void warn(Serializable serializable);
}
