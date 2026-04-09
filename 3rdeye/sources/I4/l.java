package I4;

import C.RunnableC0615b;
import d5.C4276a;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: EventBus.java */
/* loaded from: classes2.dex */
public final class l implements d5.d, d5.c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2468a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f2469b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final J4.p f2470c;

    public l(J4.p pVar) {
        this.f2470c = pVar;
    }

    @Override // d5.d
    public final synchronized void a(Executor executor, d5.b bVar) {
        try {
            executor.getClass();
            if (!this.f2468a.containsKey(B4.b.class)) {
                this.f2468a.put(B4.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f2468a.get(B4.b.class)).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // d5.d
    public final void b(n5.k kVar) {
        a(this.f2470c, kVar);
    }

    public final synchronized Set<Map.Entry<d5.b<Object>, Executor>> c(C4276a<?> c4276a) {
        Map map;
        try {
            HashMap map2 = this.f2468a;
            c4276a.getClass();
            map = (Map) map2.get(null);
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.EMPTY_SET : map.entrySet();
    }

    public final void d(C4276a<?> c4276a) {
        c4276a.getClass();
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = this.f2469b;
                if (arrayDeque != null) {
                    arrayDeque.add(c4276a);
                    return;
                }
                for (Map.Entry<d5.b<Object>, Executor> entry : c(c4276a)) {
                    entry.getValue().execute(new RunnableC0615b(5, entry, c4276a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
