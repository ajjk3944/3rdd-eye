package le;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f28711a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f28712b = 64;

    /* renamed from: c, reason: collision with root package name */
    public final int f28713c;

    public e(int i4) {
        this.f28713c = i4;
    }

    public static String b(int i4, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i4) {
                return str.substring(0, i4);
            }
        }
        return str;
    }

    public final synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.f28711a));
    }

    public final synchronized boolean c(String str) {
        String strB = b(this.f28713c, "com.crashlytics.version-control-info");
        if (this.f28711a.size() >= this.f28712b && !this.f28711a.containsKey(strB)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.f28712b, null);
            return false;
        }
        String strB2 = b(this.f28713c, str);
        String str2 = (String) this.f28711a.get(strB);
        if (str2 == null ? strB2 == null : str2.equals(strB2)) {
            return false;
        }
        this.f28711a.put(strB, strB2);
        return true;
    }

    public final synchronized void d(Map map) {
        try {
            int i4 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strB = b(this.f28713c, str);
                if (this.f28711a.size() < this.f28712b || this.f28711a.containsKey(strB)) {
                    String str2 = (String) entry.getValue();
                    this.f28711a.put(strB, str2 == null ? "" : b(this.f28713c, str2));
                } else {
                    i4++;
                }
            }
            if (i4 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i4 + " entries when adding custom keys. Maximum allowable: " + this.f28712b, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
