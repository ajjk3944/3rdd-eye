package io.sentry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class j6 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final k4 f12386a;

    /* renamed from: b, reason: collision with root package name */
    public k4 f12387b;

    /* renamed from: c, reason: collision with root package name */
    public final k6 f12388c;

    /* renamed from: d, reason: collision with root package name */
    public final g6 f12389d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f12390e;

    /* renamed from: f, reason: collision with root package name */
    public final b1 f12391f;

    /* renamed from: i, reason: collision with root package name */
    public final d8.a f12394i;
    public l6 j;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12392g = false;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f12393h = new AtomicBoolean(false);
    public final ConcurrentHashMap k = new ConcurrentHashMap();

    /* renamed from: l, reason: collision with root package name */
    public final ConcurrentHashMap f12395l = new ConcurrentHashMap();

    public j6(g6 g6Var, u3 u3Var, k6 k6Var, d8.a aVar, bf.a aVar2) {
        new ConcurrentHashMap();
        new io.sentry.util.a();
        this.f12388c = k6Var;
        k6Var.E = (String) aVar.f7150d;
        this.f12389d = g6Var;
        ir.f0.T(u3Var, "Scopes are required");
        this.f12391f = u3Var;
        this.f12394i = aVar;
        this.j = aVar2;
        k4 k4Var = (k4) aVar.f7149c;
        if (k4Var != null) {
            this.f12386a = k4Var;
        } else {
            this.f12386a = u3Var.k().getDateProvider().a();
        }
    }

    @Override // io.sentry.i1
    public final k4 A() {
        return this.f12386a;
    }

    @Override // io.sentry.i1
    public final void a(o6 o6Var) {
        this.f12388c.B = o6Var;
    }

    @Override // io.sentry.i1
    public final d6 c() {
        k6 k6Var = this.f12388c;
        io.sentry.protocol.t tVar = k6Var.f12412a;
        n6 n6Var = k6Var.f12413d;
        cj.a aVar = k6Var.f12415r;
        return new d6(tVar, n6Var, aVar == null ? null : (Boolean) aVar.f3974d);
    }

    @Override // io.sentry.i1
    public final boolean d() {
        return this.f12392g;
    }

    @Override // io.sentry.i1
    public final void f(Throwable th2) {
        this.f12390e = th2;
    }

    @Override // io.sentry.i1
    public final void g(o6 o6Var) {
        x(o6Var, this.f12391f.k().getDateProvider().a());
    }

    @Override // io.sentry.i1
    public final String getDescription() {
        return this.f12388c.f12417y;
    }

    @Override // io.sentry.i1
    public final bu.t h(List list) {
        return this.f12389d.h(list);
    }

    @Override // io.sentry.i1
    public final boolean i() {
        return false;
    }

    @Override // io.sentry.i1
    public final i1 j(String str, String str2, k4 k4Var, p1 p1Var) {
        return y(str, str2, k4Var, p1Var, new d8.a(2, false));
    }

    @Override // io.sentry.i1
    public final void k() {
        g(this.f12388c.B);
    }

    @Override // io.sentry.i1
    public final void l(Object obj, String str) {
        ConcurrentHashMap concurrentHashMap = this.k;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // io.sentry.i1
    public final void o(String str) {
        this.f12388c.f12417y = str;
    }

    @Override // io.sentry.i1
    public final i1 q(String str) {
        return z(str, null);
    }

    @Override // io.sentry.i1
    public final void s(String str, Long l10, g2 g2Var) {
        if (this.f12392g) {
            this.f12391f.k().getLogger().m(b5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f12395l.put(str, new io.sentry.protocol.j(g2Var.apiName(), l10));
        g6 g6Var = this.f12389d;
        j6 j6Var = g6Var.f12276b;
        if (j6Var == this || j6Var.f12395l.containsKey(str)) {
            return;
        }
        g6Var.s(str, l10, g2Var);
    }

    @Override // io.sentry.i1
    public final k6 t() {
        return this.f12388c;
    }

    @Override // io.sentry.i1
    public final o6 u() {
        return this.f12388c.B;
    }

    @Override // io.sentry.i1
    public final k4 v() {
        return this.f12387b;
    }

    @Override // io.sentry.i1
    public final void w(String str, Number number) {
        if (this.f12392g) {
            this.f12391f.k().getLogger().m(b5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f12395l.put(str, new io.sentry.protocol.j((String) null, number));
        g6 g6Var = this.f12389d;
        j6 j6Var = g6Var.f12276b;
        if (j6Var == this || j6Var.f12395l.containsKey(str)) {
            return;
        }
        g6Var.w(str, number);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.i1
    public final void x(o6 o6Var, k4 k4Var) {
        k4 k4Var2;
        k4 k4Var3;
        if (this.f12392g || !this.f12393h.compareAndSet(false, true)) {
            return;
        }
        k6 k6Var = this.f12388c;
        k6Var.B = o6Var;
        n6 n6Var = k6Var.f12413d;
        b1 b1Var = this.f12391f;
        if (k4Var == null) {
            k4Var = b1Var.k().getDateProvider().a();
        }
        this.f12387b = k4Var;
        d8.a aVar = this.f12394i;
        aVar.getClass();
        boolean z10 = aVar.f7148b;
        g6 g6Var = this.f12389d;
        if (z10) {
            j6 j6Var = g6Var.f12276b;
            CopyOnWriteArrayList<j6> copyOnWriteArrayList = g6Var.f12277c;
            if (!j6Var.f12388c.f12413d.equals(n6Var)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    j6 j6Var2 = (j6) it.next();
                    n6 n6Var2 = j6Var2.f12388c.f12414g;
                    if (n6Var2 != null && n6Var2.equals(n6Var)) {
                        arrayList.add(j6Var2);
                    }
                }
                copyOnWriteArrayList = arrayList;
            }
            k4 k4Var4 = null;
            k4 k4Var5 = null;
            for (j6 j6Var3 : copyOnWriteArrayList) {
                if (k4Var4 == null || j6Var3.f12386a.b(k4Var4) < 0) {
                    k4Var4 = j6Var3.f12386a;
                }
                if (k4Var5 == null || ((k4Var3 = j6Var3.f12387b) != null && k4Var3.b(k4Var5) > 0)) {
                    k4Var5 = j6Var3.f12387b;
                }
            }
            if (aVar.f7148b && k4Var5 != null && (((k4Var2 = this.f12387b) == null || k4Var2.b(k4Var5) > 0) && this.f12387b != null)) {
                this.f12387b = k4Var5;
            }
        }
        Throwable th2 = this.f12390e;
        if (th2 != null) {
            b1Var.f(th2, this, g6Var.f12279e);
        }
        l6 l6Var = this.j;
        if (l6Var != null) {
            l6Var.e(this);
        }
        this.f12392g = true;
    }

    @Override // io.sentry.i1
    public final i1 y(String str, String str2, k4 k4Var, p1 p1Var, d8.a aVar) {
        if (this.f12392g) {
            return t2.f12740a;
        }
        n6 n6Var = this.f12388c.f12413d;
        g6 g6Var = this.f12389d;
        k6 k6Var = g6Var.f12276b.f12388c;
        k6 k6Var2 = new k6(k6Var.f12412a, new n6(), n6Var, str, null, k6Var.f12415r, null, "manual");
        k6Var2.f12417y = str2;
        k6Var2.H = p1Var;
        aVar.f7149c = k4Var;
        return g6Var.D(k6Var2, aVar);
    }

    @Override // io.sentry.i1
    public final i1 z(String str, String str2) {
        if (this.f12392g) {
            return t2.f12740a;
        }
        n6 n6Var = this.f12388c.f12413d;
        g6 g6Var = this.f12389d;
        g6Var.getClass();
        d8.a aVar = new d8.a(2, false);
        k6 k6Var = g6Var.f12276b.f12388c;
        k6 k6Var2 = new k6(k6Var.f12412a, new n6(), n6Var, str, null, k6Var.f12415r, null, "manual");
        k6Var2.f12417y = str2;
        k6Var2.H = p1.SENTRY;
        return g6Var.D(k6Var2, aVar);
    }

    public j6(s6 s6Var, g6 g6Var, u3 u3Var, t6 t6Var) {
        new ConcurrentHashMap();
        new io.sentry.util.a();
        this.f12388c = s6Var;
        s6Var.E = (String) t6Var.f7150d;
        this.f12389d = g6Var;
        this.f12391f = u3Var;
        this.j = null;
        k4 k4Var = (k4) t6Var.f7149c;
        if (k4Var != null) {
            this.f12386a = k4Var;
        } else {
            this.f12386a = u3Var.k().getDateProvider().a();
        }
        this.f12394i = t6Var;
    }
}
