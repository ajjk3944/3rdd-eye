package g2;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w implements d1, l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f24426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f24427b;

    public w(f0 f0Var) {
        this.f24427b = f0Var;
        this.f24426a = f0Var.f24335h;
    }

    @Override // d3.c
    public final float C(int i4) {
        return this.f24426a.C(i4);
    }

    @Override // d3.c
    public final float D(float f10) {
        return f10 / this.f24426a.a();
    }

    @Override // d3.c
    public final float F() {
        return this.f24426a.f24449c;
    }

    @Override // g2.q
    public final boolean H() {
        return this.f24426a.H();
    }

    @Override // d3.c
    public final float I(float f10) {
        return this.f24426a.a() * f10;
    }

    @Override // g2.l0
    public final k0 N(int i4, int i10, Map map, mk.c cVar, mk.c cVar2) {
        return this.f24426a.N(i4, i10, map, cVar, cVar2);
    }

    @Override // g2.l0
    public final k0 O(int i4, int i10, Map map, mk.c cVar) {
        return this.f24426a.N(i4, i10, map, null, cVar);
    }

    @Override // d3.c
    public final int Q(float f10) {
        z zVar = this.f24426a;
        zVar.getClass();
        return d.h.i(zVar, f10);
    }

    @Override // d3.c
    public final long T(long j) {
        z zVar = this.f24426a;
        zVar.getClass();
        return d.h.m(j, zVar);
    }

    @Override // d3.c
    public final float W(long j) {
        z zVar = this.f24426a;
        zVar.getClass();
        return d.h.l(j, zVar);
    }

    @Override // g2.d1
    public final List X(Object obj, mk.e eVar) {
        f0 f0Var = this.f24427b;
        i2.e0 e0Var = f0Var.f24329a;
        x.e0 e0Var2 = f0Var.g;
        i2.e0 e0Var3 = (i2.e0) e0Var2.g(obj);
        if (e0Var3 != null && ((w0.b) e0Var.p()).f36391a.j(e0Var3) < f0Var.f24332d) {
            return e0Var3.n();
        }
        x.e0 e0Var4 = f0Var.f24338l;
        x.e0 e0Var5 = f0Var.j;
        w0.e eVar2 = f0Var.f24339m;
        if (eVar2.f36399c < f0Var.f24333e) {
            f2.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        i2.e0 e0Var6 = (i2.e0) e0Var2.g(obj);
        int i4 = eVar2.f36399c;
        int i10 = f0Var.f24333e;
        if (i4 == i10) {
            eVar2.b(obj);
        } else {
            Object[] objArr = eVar2.f36397a;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
        }
        f0Var.f24333e++;
        boolean zB = e0Var5.b(obj);
        if (zB || e0Var6 != null) {
            if (!zB && e0Var6 != null) {
                f0Var.j(((w0.b) e0Var.p()).f36391a.j(e0Var6), ((w0.b) e0Var.p()).f36391a.f36399c);
                f0Var.f24341o++;
                e0Var2.k(obj);
                e0Var5.m(obj, e0Var6);
                e0Var4.m(obj, f0Var.f(obj));
                if (e0Var.H()) {
                    f0Var.h();
                }
            }
            i2.e0 e0Var7 = (i2.e0) e0Var5.g(obj);
            x xVar = e0Var7 != null ? (x) f0Var.f24334f.g(e0Var7) : null;
            if (xVar != null && xVar.f24432d) {
                f0Var.m(e0Var7, obj, false, eVar);
            }
        } else {
            f0Var.k(obj, eVar, false);
            e0Var4.m(obj, f0Var.f(obj));
        }
        i2.e0 e0Var8 = (i2.e0) e0Var5.g(obj);
        if (e0Var8 == null) {
            return zj.s.f38317a;
        }
        List listY = e0Var8.H.f25687p.Y();
        w0.b bVar = (w0.b) listY;
        int i11 = bVar.f36391a.f36399c;
        for (int i12 = 0; i12 < i11; i12++) {
            ((i2.u0) bVar.get(i12)).f25786f.f25675b = true;
        }
        return listY;
    }

    @Override // d3.c
    public final float a() {
        return this.f24426a.f24448b;
    }

    @Override // g2.q
    public final d3.l getLayoutDirection() {
        return this.f24426a.f24447a;
    }

    @Override // d3.c
    public final float o(long j) {
        z zVar = this.f24426a;
        zVar.getClass();
        return d.h.k(j, zVar);
    }

    @Override // d3.c
    public final long x(float f10) {
        return this.f24426a.x(f10);
    }
}
