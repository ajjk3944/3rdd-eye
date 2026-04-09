package org.snmp4j.log;

import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class LogFactory {
    public static final String SNMP4J_LOG_FACTORY_SYSTEM_PROPERTY = "snmp4j.LogFactory";
    private static boolean configChecked = false;
    private static LogFactory snmp4jLogFactory;

    private static void checkConfig() {
        if (configChecked) {
            return;
        }
        configChecked = true;
        getFactoryFromSystemProperty();
    }

    private static synchronized void getFactoryFromSystemProperty() {
        try {
            String property = System.getProperty(SNMP4J_LOG_FACTORY_SYSTEM_PROPERTY, null);
            if (property != null) {
                try {
                    snmp4jLogFactory = (LogFactory) Class.forName(property).newInstance();
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                } catch (IllegalAccessException e11) {
                    throw new RuntimeException(e11);
                } catch (InstantiationException e12) {
                    throw new RuntimeException(e12);
                }
            }
        } catch (SecurityException e13) {
            throw new RuntimeException(e13);
        }
    }

    public static LogFactory getLogFactory() {
        LogFactory logFactory = snmp4jLogFactory;
        return logFactory == null ? new LogFactory() : logFactory;
    }

    public static LogAdapter getLogger(Class cls) {
        checkConfig();
        LogFactory logFactory = snmp4jLogFactory;
        return logFactory == null ? NoLogger.instance : logFactory.createLogger(cls.getName());
    }

    public static void setLogFactory(LogFactory logFactory) {
        configChecked = true;
        snmp4jLogFactory = logFactory;
    }

    protected LogAdapter createLogger(Class cls) {
        return NoLogger.instance;
    }

    public LogAdapter getRootLogger() {
        return NoLogger.instance;
    }

    public Iterator loggers() {
        return Collections.singletonList(NoLogger.instance).iterator();
    }

    protected LogAdapter createLogger(String str) {
        return NoLogger.instance;
    }

    public static LogAdapter getLogger(String str) {
        checkConfig();
        LogFactory logFactory = snmp4jLogFactory;
        if (logFactory == null) {
            return NoLogger.instance;
        }
        return logFactory.createLogger(str);
    }
}
