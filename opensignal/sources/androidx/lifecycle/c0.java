package androidx.lifecycle;

import android.os.Looper;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c0 {
    public static final Object j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1484a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final r.f f1485b = new r.f();

    /* renamed from: c, reason: collision with root package name */
    public int f1486c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1487d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1488e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1489f;

    /* renamed from: g, reason: collision with root package name */
    public int f1490g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1491h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1492i;

    public c0() {
        Object obj = j;
        this.f1489f = obj;
        this.f1488e = obj;
        this.f1490g = -1;
    }

    public static void a(String str) {
        q.a.X().f20652i.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(h0.b.o("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(b0 b0Var) {
        if (b0Var.f1478d) {
            if (!b0Var.e()) {
                b0Var.a(false);
                return;
            }
            int i10 = b0Var.f1479g;
            int i11 = this.f1490g;
            if (i10 >= i11) {
                return;
            }
            b0Var.f1479g = i11;
            b0Var.f1477a.b(this.f1488e);
        }
    }

    public final void c(b0 b0Var) {
        if (this.f1491h) {
            this.f1492i = true;
            return;
        }
        this.f1491h = true;
        do {
            this.f1492i = false;
            if (b0Var != null) {
                b(b0Var);
                b0Var = null;
            } else {
                r.f fVar = this.f1485b;
                fVar.getClass();
                r.d dVar = new r.d(fVar);
                fVar.f21109g.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((b0) ((Map.Entry) dVar.next()).getValue());
                    if (this.f1492i) {
                        break;
                    }
                }
            }
        } while (this.f1492i);
        this.f1491h = false;
    }

    public final void d(v vVar, e0 e0Var) {
        Object obj;
        a("observe");
        if (vVar.h().e1() == n.DESTROYED) {
            return;
        }
        a0 a0Var = new a0(this, vVar, e0Var);
        r.f fVar = this.f1485b;
        r.c cVarA = fVar.a(e0Var);
        if (cVarA != null) {
            obj = cVarA.f21101d;
        } else {
            r.c cVar = new r.c(e0Var, a0Var);
            fVar.f21110r++;
            r.c cVar2 = fVar.f21108d;
            if (cVar2 == null) {
                fVar.f21107a = cVar;
                fVar.f21108d = cVar;
            } else {
                cVar2.f21102g = cVar;
                cVar.f21103r = cVar2;
                fVar.f21108d = cVar;
            }
            obj = null;
        }
        b0 b0Var = (b0) obj;
        if (b0Var != null && !b0Var.d(vVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b0Var != null) {
            return;
        }
        vVar.h().V0(a0Var);
    }

    public final void e(e0 e0Var) {
        Object obj;
        a("observeForever");
        z zVar = new z(this, e0Var);
        r.f fVar = this.f1485b;
        r.c cVarA = fVar.a(e0Var);
        if (cVarA != null) {
            obj = cVarA.f21101d;
        } else {
            r.c cVar = new r.c(e0Var, zVar);
            fVar.f21110r++;
            r.c cVar2 = fVar.f21108d;
            if (cVar2 == null) {
                fVar.f21107a = cVar;
                fVar.f21108d = cVar;
            } else {
                cVar2.f21102g = cVar;
                cVar.f21103r = cVar2;
                fVar.f21108d = cVar;
            }
            obj = null;
        }
        b0 b0Var = (b0) obj;
        if (b0Var instanceof a0) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b0Var != null) {
            return;
        }
        zVar.a(true);
    }

    public void f() {
    }

    public void g() {
    }

    public final void h(e0 e0Var) {
        a("removeObserver");
        b0 b0Var = (b0) this.f1485b.b(e0Var);
        if (b0Var == null) {
            return;
        }
        b0Var.c();
        b0Var.a(false);
    }

    public final void i(v vVar) {
        a("removeObservers");
        Iterator it = this.f1485b.iterator();
        while (true) {
            r.b bVar = (r.b) it;
            if (!bVar.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            if (((b0) entry.getValue()).d(vVar)) {
                h((e0) entry.getKey());
            }
        }
    }
}
