package com.yandex.mobile.ads.impl;

import android.util.Log;
import c9.C2078B;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class kd {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArraySet<Logger> f29631a = new CopyOnWriteArraySet<>();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f29632b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f29633c = 0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = vd1.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(vd1.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(rg0.class.getName(), "okhttp.Http2");
        linkedHashMap.put(z32.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttplib.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f29632b = C2078B.t(linkedHashMap);
    }

    public static void a(String loggerName, int i, String message, Throwable th) {
        int iMin;
        kotlin.jvm.internal.l.f(loggerName, "loggerName");
        kotlin.jvm.internal.l.f(message, "message");
        String strZ0 = f29632b.get(loggerName);
        if (strZ0 == null) {
            strZ0 = y9.r.z0(23, loggerName);
        }
        if (Log.isLoggable(strZ0, i)) {
            if (th != null) {
                message = B4.g.o(message, "\n", Log.getStackTraceString(th));
            }
            int length = message.length();
            int i10 = 0;
            while (i10 < length) {
                int iF0 = y9.q.f0(message, '\n', i10, 4);
                if (iF0 == -1) {
                    iF0 = length;
                }
                while (true) {
                    iMin = Math.min(iF0, i10 + 4000);
                    String strSubstring = message.substring(i10, iMin);
                    kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
                    Log.println(i, strZ0, strSubstring);
                    if (iMin >= iF0) {
                        break;
                    } else {
                        i10 = iMin;
                    }
                }
                i10 = iMin + 1;
            }
        }
    }

    public static void a() {
        Level level;
        for (Map.Entry<String, String> entry : f29632b.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Logger logger = Logger.getLogger(key);
            if (f29631a.add(logger)) {
                logger.setUseParentHandlers(false);
                if (Log.isLoggable(value, 3)) {
                    level = Level.FINE;
                } else {
                    level = Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING;
                }
                logger.setLevel(level);
                logger.addHandler(ld.f29972a);
            }
        }
    }
}
