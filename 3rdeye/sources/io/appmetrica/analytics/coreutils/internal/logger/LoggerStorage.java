package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class LoggerStorage {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap f38955a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f38956b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile PublicLogger f38957c = PublicLogger.getAnonymousInstance();

    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f38957c;
    }

    public static PublicLogger getOrCreateMainPublicLogger(String str) {
        f38957c = getOrCreatePublicLogger(str);
        return f38957c;
    }

    public static PublicLogger getOrCreatePublicLogger(String str) {
        PublicLogger publicLogger;
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger2 = (PublicLogger) f38955a.get(str);
        if (publicLogger2 != null) {
            return publicLogger2;
        }
        synchronized (f38956b) {
            try {
                publicLogger = (PublicLogger) f38955a.get(str);
                if (publicLogger == null) {
                    publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                    f38955a.put(str, publicLogger);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return publicLogger;
    }

    public static void unsetPublicLoggers() {
        f38955a = new HashMap();
        f38957c = PublicLogger.getAnonymousInstance();
    }
}
