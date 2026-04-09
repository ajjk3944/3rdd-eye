package h3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: classes.dex */
public class i<T, Y> {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f38208a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f38209b;

    /* renamed from: c, reason: collision with root package name */
    public long f38210c;

    /* compiled from: LruCache.java */
    public static final class a<Y> {

        /* renamed from: a, reason: collision with root package name */
        public final Y f38211a;

        /* renamed from: b, reason: collision with root package name */
        public final int f38212b;

        public a(Y y10, int i) {
            this.f38211a = y10;
            this.f38212b = i;
        }
    }

    public i(long j4) {
        this.f38209b = j4;
    }

    public final synchronized Y a(T t10) {
        a aVar;
        aVar = (a) this.f38208a.get(t10);
        return aVar != null ? aVar.f38211a : null;
    }

    public int b(Y y10) {
        return 1;
    }

    public final synchronized Y d(T t10, Y y10) {
        int iB = b(y10);
        long j4 = iB;
        if (j4 >= this.f38209b) {
            c(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f38210c += j4;
        }
        a aVar = (a) this.f38208a.put(t10, y10 == null ? null : new a(y10, iB));
        if (aVar != null) {
            this.f38210c -= aVar.f38212b;
            if (!aVar.f38211a.equals(y10)) {
                c(t10, aVar.f38211a);
            }
        }
        e(this.f38209b);
        return aVar != null ? aVar.f38211a : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(long j4) {
        while (this.f38210c > j4) {
            Iterator it = this.f38208a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f38210c -= aVar.f38212b;
            Object key = entry.getKey();
            it.remove();
            c(key, aVar.f38211a);
        }
    }

    public void c(T t10, Y y10) {
    }
}
