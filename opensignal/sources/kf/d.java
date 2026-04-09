package kf;

import io.sentry.android.core.e0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14304a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f14305b = 64;

    /* renamed from: c, reason: collision with root package name */
    public final int f14306c;

    public d(int i10) {
        this.f14306c = i10;
    }

    public static String a(int i10, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i10) {
                return str.substring(0, i10);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str) {
        String strA = a(this.f14306c, "com.crashlytics.version-control-info");
        if (this.f14304a.size() >= this.f14305b && !this.f14304a.containsKey(strA)) {
            e0.q("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.f14305b, null);
            return false;
        }
        String strA2 = a(this.f14306c, str);
        String str2 = (String) this.f14304a.get(strA);
        if (str2 == null ? strA2 == null : str2.equals(strA2)) {
            return false;
        }
        this.f14304a.put(strA, strA2);
        return true;
    }

    public final synchronized void c(Map map) {
        try {
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.f14306c, str);
                if (this.f14304a.size() < this.f14305b || this.f14304a.containsKey(strA)) {
                    String str2 = (String) entry.getValue();
                    this.f14304a.put(strA, str2 == null ? "" : a(this.f14306c, str2));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                e0.q("FirebaseCrashlytics", "Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f14305b, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
