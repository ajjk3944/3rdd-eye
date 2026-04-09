package P4;

import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: KeysMap.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f10606a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f10607b = 64;

    /* renamed from: c, reason: collision with root package name */
    public final int f10608c;

    public d(int i) {
        this.f10608c = i;
    }

    public final synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f10606a));
    }

    public final synchronized boolean b(String str) {
        synchronized (this) {
            int i = this.f10608c;
            String strSubstring = 36 > i ? "com.crashlytics.version-control-info".substring(0, i) : "com.crashlytics.version-control-info";
            if (this.f10606a.size() >= this.f10607b && !this.f10606a.containsKey(strSubstring)) {
                Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.f10607b, null);
                return false;
            }
            int i10 = this.f10608c;
            String strTrim = str.trim();
            if (strTrim.length() > i10) {
                strTrim = strTrim.substring(0, i10);
            }
            String str2 = (String) this.f10606a.get(strSubstring);
            if (str2 == null ? strTrim == null : str2.equals(strTrim)) {
                return false;
            }
            this.f10606a.put(strSubstring, strTrim);
            return true;
        }
    }

    public final synchronized void c(Map<String, String> map) {
        String strTrim;
        try {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strTrim2 = key.trim();
                int length = strTrim2.length();
                int i10 = this.f10608c;
                if (length > i10) {
                    strTrim2 = strTrim2.substring(0, i10);
                }
                if (this.f10606a.size() < this.f10607b || this.f10606a.containsKey(strTrim2)) {
                    String value = entry.getValue();
                    HashMap map2 = this.f10606a;
                    if (value == null) {
                        strTrim = "";
                    } else {
                        int i11 = this.f10608c;
                        strTrim = value.trim();
                        if (strTrim.length() > i11) {
                            strTrim = strTrim.substring(0, i11);
                        }
                    }
                    map2.put(strTrim2, strTrim);
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f10607b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
