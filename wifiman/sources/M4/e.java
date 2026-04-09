package M4;

import com.google.firebase.crashlytics.internal.common.AbstractC5107i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12502a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f12503b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12504c;

    public e(int i10, int i11) {
        this.f12503b = i10;
        this.f12504c = i11;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f12504c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i10) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i10 ? strTrim.substring(0, i10) : strTrim;
    }

    public synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.f12502a));
    }

    public synchronized boolean d(String str, String str2) {
        String strB = b(str);
        if (this.f12502a.size() >= this.f12503b && !this.f12502a.containsKey(strB)) {
            I4.g.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f12503b);
            return false;
        }
        String strC = c(str2, this.f12504c);
        if (AbstractC5107i.y((String) this.f12502a.get(strB), strC)) {
            return false;
        }
        Map map = this.f12502a;
        if (str2 == null) {
            strC = "";
        }
        map.put(strB, strC);
        return true;
    }

    public synchronized void e(Map map) {
        try {
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strB = b((String) entry.getKey());
                if (this.f12502a.size() < this.f12503b || this.f12502a.containsKey(strB)) {
                    String str = (String) entry.getValue();
                    this.f12502a.put(strB, str == null ? "" : c(str, this.f12504c));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                I4.g.f().k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f12503b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
