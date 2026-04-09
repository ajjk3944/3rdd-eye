package com.amazonaws.logging;

import java.util.HashMap;
import java.util.Map;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public abstract class LogFactory {

    /* renamed from: a, reason: collision with root package name */
    private static final String f34069a = "LogFactory";

    /* renamed from: b, reason: collision with root package name */
    private static final Map f34070b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static Level f34071c = null;

    public enum Level {
        ALL(PduHandle.NONE),
        TRACE(0),
        DEBUG(1),
        INFO(2),
        WARN(3),
        ERROR(4),
        OFF(MPv3.MAX_MESSAGE_ID);

        private final int value;

        Level(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static Level a() {
        return f34071c;
    }

    public static synchronized Log b(Class cls) {
        return c(d(cls.getSimpleName()));
    }

    public static synchronized Log c(String str) {
        try {
            String strD = d(str);
            Map map = f34070b;
            Log log = (Log) map.get(strD);
            if (log != null) {
                return log;
            }
            Log consoleLog = Environment.a() ? new ConsoleLog(strD) : new AndroidLog(strD);
            map.put(strD, consoleLog);
            return consoleLog;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static String d(String str) {
        if (str.length() <= 23) {
            return str;
        }
        c(f34069a).e("Truncating log tag length as it exceed 23, the limit imposed by Android on certain API Levels");
        return str.substring(0, 23);
    }
}
