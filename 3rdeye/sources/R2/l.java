package R2;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders.java */
/* loaded from: classes.dex */
public final class l implements j {

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, List<k>> f11674b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map<String, String> f11675c;

    /* compiled from: LazyHeaders.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Map<String, List<k>> f11676a;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char cCharAt = property.charAt(i);
                    if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                        sb.append(cCharAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f11676a = Collections.unmodifiableMap(map);
        }
    }

    /* compiled from: LazyHeaders.java */
    public static final class b implements k {

        /* renamed from: a, reason: collision with root package name */
        public final String f11677a;

        public b(String str) {
            this.f11677a = str;
        }

        @Override // R2.k
        public final String a() {
            return this.f11677a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f11677a.equals(((b) obj).f11677a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f11677a.hashCode();
        }

        public final String toString() {
            return B4.f.c(new StringBuilder("StringHeaderFactory{value='"), this.f11677a, "'}");
        }
    }

    public l(Map<String, List<k>> map) {
        this.f11674b = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<k>> entry : this.f11674b.entrySet()) {
            List<k> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                String strA = value.get(i).a();
                if (!TextUtils.isEmpty(strA)) {
                    sb.append(strA);
                    if (i != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final Map<String, String> b() {
        if (this.f11675c == null) {
            synchronized (this) {
                try {
                    if (this.f11675c == null) {
                        this.f11675c = Collections.unmodifiableMap(a());
                    }
                } finally {
                }
            }
        }
        return this.f11675c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f11674b.equals(((l) obj).f11674b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11674b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f11674b + '}';
    }
}
