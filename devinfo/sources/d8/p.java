package d8;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p implements m {

    /* renamed from: b, reason: collision with root package name */
    public final Map f22037b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f22038c;

    public p(Map map) {
        this.f22037b = DesugarCollections.unmodifiableMap(map);
    }

    @Override // d8.m
    public final Map a() {
        if (this.f22038c == null) {
            synchronized (this) {
                try {
                    if (this.f22038c == null) {
                        this.f22038c = DesugarCollections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.f22038c;
    }

    public final HashMap b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f22037b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                String str = ((o) list.get(i4)).f22036a;
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                    if (i4 != list.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String string = sb2.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put((String) entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f22037b.equals(((p) obj).f22037b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22037b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f22037b + '}';
    }
}
