package org.eclipse.paho.client.mqttv3.logging;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.MemoryHandler;

/* loaded from: classes3.dex */
public class JSR47Logger implements a {
    private Logger julLogger = null;
    private ResourceBundle logMessageCatalog = null;
    private ResourceBundle traceMessageCatalog = null;
    private String catalogID = null;
    private String resourceName = null;
    private String loggerName = null;

    protected static void dumpMemoryTrace47(Logger logger) {
        if (logger != null) {
            for (Handler handler : logger.getHandlers()) {
                if (handler instanceof MemoryHandler) {
                    synchronized (handler) {
                        ((MemoryHandler) handler).push();
                    }
                    return;
                }
            }
            dumpMemoryTrace47(logger.getParent());
        }
    }

    private String getResourceMessage(ResourceBundle resourceBundle, String str) {
        try {
            return resourceBundle.getString(str);
        } catch (MissingResourceException unused) {
            return str;
        }
    }

    private void logToJsr47(Level level, String str, String str2, String str3, ResourceBundle resourceBundle, String str4, Object[] objArr, Throwable th2) {
        if (!str4.contains("=====")) {
            str4 = MessageFormat.format(getResourceMessage(resourceBundle, str4), objArr);
        }
        LogRecord logRecord = new LogRecord(level, String.valueOf(this.resourceName) + ": " + str4);
        logRecord.setSourceClassName(str);
        logRecord.setSourceMethodName(str2);
        logRecord.setLoggerName(this.loggerName);
        if (th2 != null) {
            logRecord.setThrown(th2);
        }
        this.julLogger.log(logRecord);
    }

    private Level mapJULLevel(int i10) {
        switch (i10) {
            case 1:
                return Level.SEVERE;
            case 2:
                return Level.WARNING;
            case 3:
                return Level.INFO;
            case 4:
                return Level.CONFIG;
            case 5:
                return Level.FINE;
            case 6:
                return Level.FINER;
            case 7:
                return Level.FINEST;
            default:
                return null;
        }
    }

    public void config(String str, String str2, String str3) {
        log(4, str, str2, str3, null, null);
    }

    public void dumpTrace() {
        dumpMemoryTrace47(this.julLogger);
    }

    @Override // org.eclipse.paho.client.mqttv3.logging.a
    public void fine(String str, String str2, String str3) {
        trace(5, str, str2, str3, null, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.logging.a
    public void finer(String str, String str2, String str3) {
        trace(6, str, str2, str3, null, null);
    }

    public void finest(String str, String str2, String str3) {
        trace(7, str, str2, str3, null, null);
    }

    public String formatMessage(String str, Object[] objArr) {
        try {
            return this.logMessageCatalog.getString(str);
        } catch (MissingResourceException unused) {
            return str;
        }
    }

    public void info(String str, String str2, String str3) {
        log(3, str, str2, str3, null, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.logging.a
    public void initialise(ResourceBundle resourceBundle, String str, String str2) {
        this.traceMessageCatalog = this.logMessageCatalog;
        this.resourceName = str2;
        this.loggerName = str;
        this.julLogger = Logger.getLogger(str);
        this.logMessageCatalog = resourceBundle;
        this.traceMessageCatalog = resourceBundle;
        this.catalogID = resourceBundle.getString("0");
    }

    @Override // org.eclipse.paho.client.mqttv3.logging.a
    public boolean isLoggable(int i10) {
        return this.julLogger.isLoggable(mapJULLevel(i10));
    }

    public void log(int i10, String str, String str2, String str3, Object[] objArr, Throwable th2) {
        Level levelMapJULLevel = mapJULLevel(i10);
        if (this.julLogger.isLoggable(levelMapJULLevel)) {
            logToJsr47(levelMapJULLevel, str, str2, this.catalogID, this.logMessageCatalog, str3, objArr, th2);
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.logging.a
    public void setResourceName(String str) {
        this.resourceName = str;
    }

    public void severe(String str, String str2, String str3) {
        log(1, str, str2, str3, null, null);
    }

    public void trace(int i10, String str, String str2, String str3, Object[] objArr, Throwable th2) {
        Level levelMapJULLevel = mapJULLevel(i10);
        if (this.julLogger.isLoggable(levelMapJULLevel)) {
            logToJsr47(levelMapJULLevel, str, str2, this.catalogID, this.traceMessageCatalog, str3, objArr, th2);
        }
    }

    public void warning(String str, String str2, String str3) {
        log(2, str, str2, str3, null, null);
    }

    public void config(String str, String str2, String str3, Object[] objArr) {
        log(4, str, str2, str3, objArr, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.logging.a
    public void fine(String str, String str2, String str3, Object[] objArr) {
        trace(5, str, str2, str3, objArr, null);
    }

    public void finer(String str, String str2, String str3, Object[] objArr) {
        trace(6, str, str2, str3, objArr, null);
    }

    public void finest(String str, String str2, String str3, Object[] objArr) {
        trace(7, str, str2, str3, objArr, null);
    }

    public void info(String str, String str2, String str3, Object[] objArr) {
        log(3, str, str2, str3, objArr, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.logging.a
    public void severe(String str, String str2, String str3, Object[] objArr) {
        log(1, str, str2, str3, objArr, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.logging.a
    public void warning(String str, String str2, String str3, Object[] objArr) {
        log(2, str, str2, str3, objArr, null);
    }

    public void config(String str, String str2, String str3, Object[] objArr, Throwable th2) {
        log(4, str, str2, str3, objArr, th2);
    }

    @Override // org.eclipse.paho.client.mqttv3.logging.a
    public void fine(String str, String str2, String str3, Object[] objArr, Throwable th2) {
        trace(5, str, str2, str3, objArr, th2);
    }

    public void finer(String str, String str2, String str3, Object[] objArr, Throwable th2) {
        trace(6, str, str2, str3, objArr, th2);
    }

    public void finest(String str, String str2, String str3, Object[] objArr, Throwable th2) {
        trace(7, str, str2, str3, objArr, th2);
    }

    public void info(String str, String str2, String str3, Object[] objArr, Throwable th2) {
        log(3, str, str2, str3, objArr, th2);
    }

    public void severe(String str, String str2, String str3, Object[] objArr, Throwable th2) {
        log(1, str, str2, str3, objArr, th2);
    }

    @Override // org.eclipse.paho.client.mqttv3.logging.a
    public void warning(String str, String str2, String str3, Object[] objArr, Throwable th2) {
        log(2, str, str2, str3, objArr, th2);
    }
}
