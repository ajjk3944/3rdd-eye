package I2;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: c, reason: collision with root package name */
    private final Map f8492c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map f8493d;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final String f8494d;

        /* renamed from: e, reason: collision with root package name */
        private static final Map f8495e;

        /* renamed from: a, reason: collision with root package name */
        private boolean f8496a = true;

        /* renamed from: b, reason: collision with root package name */
        private Map f8497b = f8495e;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8498c = true;

        static {
            String strB = b();
            f8494d = strB;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strB)) {
                map.put("User-Agent", Collections.singletonList(new b(strB)));
            }
            f8495e = Collections.unmodifiableMap(map);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public k a() {
            this.f8496a = true;
            return new k(this.f8497b);
        }
    }

    static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        private final String f8499a;

        b(String str) {
            this.f8499a = str;
        }

        @Override // I2.j
        public String a() {
            return this.f8499a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f8499a.equals(((b) obj).f8499a);
            }
            return false;
        }

        public int hashCode() {
            return this.f8499a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f8499a + "'}";
        }
    }

    k(Map map) {
        this.f8492c = Collections.unmodifiableMap(map);
    }

    private String b(List list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = ((j) list.get(i10)).a();
            if (!TextUtils.isEmpty(strA)) {
                sb2.append(strA);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    private Map c() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f8492c.entrySet()) {
            String strB = b((List) entry.getValue());
            if (!TextUtils.isEmpty(strB)) {
                map.put(entry.getKey(), strB);
            }
        }
        return map;
    }

    @Override // I2.i
    public Map a() {
        if (this.f8493d == null) {
            synchronized (this) {
                try {
                    if (this.f8493d == null) {
                        this.f8493d = Collections.unmodifiableMap(c());
                    }
                } finally {
                }
            }
        }
        return this.f8493d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f8492c.equals(((k) obj).f8492c);
        }
        return false;
    }

    public int hashCode() {
        return this.f8492c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f8492c + '}';
    }
}
