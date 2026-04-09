package androidx.lifecycle;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f1160k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1161a;

    /* renamed from: b, reason: collision with root package name */
    public final r.f f1162b;

    /* renamed from: c, reason: collision with root package name */
    public int f1163c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1164d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1165e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1166f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1167h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1168i;
    public final f0 j;

    public l0(Object obj) {
        this.f1161a = new Object();
        this.f1162b = new r.f();
        this.f1163c = 0;
        this.f1166f = f1160k;
        this.j = new f0(this);
        this.f1165e = obj;
        this.g = 0;
    }

    public static void a(String str) {
        if (!q.a.G().H()) {
            throw new IllegalStateException(d.h.t("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(i0 i0Var) {
        if (i0Var.f1147b) {
            if (!i0Var.f()) {
                i0Var.a(false);
                return;
            }
            int i4 = i0Var.f1148c;
            int i10 = this.g;
            if (i4 >= i10) {
                return;
            }
            i0Var.f1148c = i10;
            i0Var.f1146a.b(this.f1165e);
        }
    }

    public final void c(i0 i0Var) {
        if (this.f1167h) {
            this.f1168i = true;
            return;
        }
        this.f1167h = true;
        do {
            this.f1168i = false;
            if (i0Var != null) {
                b(i0Var);
                i0Var = null;
            } else {
                r.f fVar = this.f1162b;
                fVar.getClass();
                r.d dVar = new r.d(fVar);
                fVar.f32484c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((i0) ((Map.Entry) dVar.next()).getValue());
                    if (this.f1168i) {
                        break;
                    }
                }
            }
        } while (this.f1168i);
        this.f1167h = false;
    }

    public final Object d() {
        Object obj = this.f1165e;
        if (obj != f1160k) {
            return obj;
        }
        return null;
    }

    public void e(a0 a0Var, m0 m0Var) {
        Object obj;
        a("observe");
        if (a0Var.j().f1110d == s.f1180a) {
            return;
        }
        h0 h0Var = new h0(this, a0Var, m0Var);
        r.f fVar = this.f1162b;
        r.c cVarA = fVar.a(m0Var);
        if (cVarA != null) {
            obj = cVarA.f32476b;
        } else {
            r.c cVar = new r.c(m0Var, h0Var);
            fVar.f32485d++;
            r.c cVar2 = fVar.f32483b;
            if (cVar2 == null) {
                fVar.f32482a = cVar;
                fVar.f32483b = cVar;
            } else {
                cVar2.f32477c = cVar;
                cVar.f32478d = cVar2;
                fVar.f32483b = cVar;
            }
            obj = null;
        }
        i0 i0Var = (i0) obj;
        if (i0Var != null && !i0Var.d(a0Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (i0Var != null) {
            return;
        }
        a0Var.j().a(h0Var);
    }

    public final void h(Object obj) {
        boolean z3;
        synchronized (this.f1161a) {
            z3 = this.f1166f == f1160k;
            this.f1166f = obj;
        }
        if (z3) {
            q.a.G().I(this.j);
        }
    }

    public void i(m0 m0Var) {
        a("removeObserver");
        i0 i0Var = (i0) this.f1162b.c(m0Var);
        if (i0Var == null) {
            return;
        }
        i0Var.b();
        i0Var.a(false);
    }

    public void j(Object obj) {
        a("setValue");
        this.g++;
        this.f1165e = obj;
        c(null);
    }

    public l0() {
        this.f1161a = new Object();
        this.f1162b = new r.f();
        this.f1163c = 0;
        Object obj = f1160k;
        this.f1166f = obj;
        this.j = new f0(this);
        this.f1165e = obj;
        this.g = -1;
    }

    public void f() {
    }

    public void g() {
    }
}
