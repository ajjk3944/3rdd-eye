package W2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map f23589a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private final long f23590b;

    /* renamed from: c, reason: collision with root package name */
    private long f23591c;

    /* renamed from: d, reason: collision with root package name */
    private long f23592d;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Object f23593a;

        /* renamed from: b, reason: collision with root package name */
        final int f23594b;

        a(Object obj, int i10) {
            this.f23593a = obj;
            this.f23594b = i10;
        }
    }

    public h(long j10) {
        this.f23590b = j10;
        this.f23591c = j10;
    }

    private void f() {
        m(this.f23591c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Object g(Object obj) {
        a aVar;
        aVar = (a) this.f23589a.get(obj);
        return aVar != null ? aVar.f23593a : null;
    }

    public synchronized long h() {
        return this.f23591c;
    }

    protected int i(Object obj) {
        return 1;
    }

    protected void j(Object obj, Object obj2) {
    }

    public synchronized Object k(Object obj, Object obj2) {
        int i10 = i(obj2);
        long j10 = i10;
        if (j10 >= this.f23591c) {
            j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f23592d += j10;
        }
        a aVar = (a) this.f23589a.put(obj, obj2 == null ? null : new a(obj2, i10));
        if (aVar != null) {
            this.f23592d -= aVar.f23594b;
            if (!aVar.f23593a.equals(obj2)) {
                j(obj, aVar.f23593a);
            }
        }
        f();
        return aVar != null ? aVar.f23593a : null;
    }

    public synchronized Object l(Object obj) {
        a aVar = (a) this.f23589a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f23592d -= aVar.f23594b;
        return aVar.f23593a;
    }

    protected synchronized void m(long j10) {
        while (this.f23592d > j10) {
            Iterator it = this.f23589a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f23592d -= aVar.f23594b;
            Object key = entry.getKey();
            it.remove();
            j(key, aVar.f23593a);
        }
    }
}
