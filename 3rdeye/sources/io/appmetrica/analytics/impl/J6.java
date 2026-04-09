package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class J6 {

    /* renamed from: a, reason: collision with root package name */
    public volatile String f39683a;

    public static String a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final String b() {
        if (this.f39683a != null) {
            return this.f39683a;
        }
        synchronized (this) {
            try {
                if (this.f39683a == null) {
                    this.f39683a = a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f39683a;
    }

    public final boolean c() {
        try {
            if (TextUtils.isEmpty(b())) {
                return false;
            }
            return !b().contains(StringUtils.PROCESS_POSTFIX_DELIMITER);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean a(String str) {
        try {
            if (!TextUtils.isEmpty(b())) {
                if (b().endsWith(StringUtils.PROCESS_POSTFIX_DELIMITER + str)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
