package r1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements i {

    /* renamed from: b, reason: collision with root package name */
    public final Map f23358b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f23359c;

    public l(Map map) {
        this.f23358b = Collections.unmodifiableMap(map);
    }

    @Override // r1.i
    public final Map a() {
        if (this.f23359c == null) {
            synchronized (this) {
                try {
                    if (this.f23359c == null) {
                        this.f23359c = Collections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.f23359c;
    }

    public final HashMap b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f23358b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((k) list.get(i)).f23357a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put((String) entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f23358b.equals(((l) obj).f23358b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23358b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f23358b + '}';
    }
}
