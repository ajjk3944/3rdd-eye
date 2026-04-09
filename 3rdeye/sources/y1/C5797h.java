package y1;

import E.u;
import b9.x;
import c9.C2097r;
import c9.C2099t;
import f9.InterfaceC4350h;
import java.util.ArrayList;
import java.util.Iterator;
import y9.C5821c;

/* compiled from: ConnectionPoolImpl.kt */
/* renamed from: y1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5797h implements E1.a, K9.a {

    /* renamed from: b, reason: collision with root package name */
    public final E1.a f47948b;

    /* renamed from: c, reason: collision with root package name */
    public final K9.a f47949c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC4350h f47950d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f47951e;

    public C5797h(E1.a delegate) {
        K9.d dVarA = K9.f.a();
        kotlin.jvm.internal.l.f(delegate, "delegate");
        this.f47948b = delegate;
        this.f47949c = dVarA;
    }

    @Override // E1.a
    public final E1.c K0(String sql) {
        kotlin.jvm.internal.l.f(sql, "sql");
        return this.f47948b.K0(sql);
    }

    @Override // K9.a
    public final Object a(h9.c cVar) {
        return this.f47949c.a(cVar);
    }

    @Override // K9.a
    public final void c(Object obj) {
        this.f47949c.c(null);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f47948b.close();
    }

    public final void d(StringBuilder sb) {
        Iterable iterableG;
        if (this.f47950d == null && this.f47951e == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        InterfaceC4350h interfaceC4350h = this.f47950d;
        if (interfaceC4350h != null) {
            sb.append("\t\tCoroutine: " + interfaceC4350h);
            sb.append('\n');
        }
        Throwable th = this.f47951e;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            C5821c c5821c = new C5821c(x.b(th));
            if (c5821c.hasNext()) {
                Object next = c5821c.next();
                if (c5821c.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (c5821c.hasNext()) {
                        arrayList.add(c5821c.next());
                    }
                    iterableG = arrayList;
                } else {
                    iterableG = u.G(next);
                }
            } else {
                iterableG = C2099t.f18581b;
            }
            Iterator it = C2097r.l0(iterableG).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    public final String toString() {
        return this.f47948b.toString();
    }

    @Override // K9.a
    public final boolean tryLock() {
        return this.f47949c.tryLock();
    }
}
