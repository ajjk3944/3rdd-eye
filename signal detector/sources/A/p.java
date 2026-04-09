package A;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f43a;

    /* renamed from: b, reason: collision with root package name */
    public z.d f44b;

    /* renamed from: c, reason: collision with root package name */
    public m f45c;

    /* renamed from: d, reason: collision with root package name */
    public int f46d;

    /* renamed from: e, reason: collision with root package name */
    public final h f47e = new h(this);

    /* renamed from: f, reason: collision with root package name */
    public int f48f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f49g = false;

    /* renamed from: h, reason: collision with root package name */
    public final g f50h = new g(this);
    public final g i = new g(this);

    /* renamed from: j, reason: collision with root package name */
    public int f51j = 1;

    public p(z.d dVar) {
        this.f44b = dVar;
    }

    public static void b(g gVar, g gVar2, int i) {
        gVar.f29l.add(gVar2);
        gVar.f24f = i;
        gVar2.f28k.add(gVar);
    }

    public static g h(z.c cVar) {
        z.c cVar2 = cVar.f24289f;
        if (cVar2 == null) {
            return null;
        }
        z.d dVar = cVar2.f24287d;
        int iC = AbstractC2984e.c(cVar2.f24288e);
        if (iC == 1) {
            return dVar.f24322d.f50h;
        }
        if (iC == 2) {
            return dVar.f24324e.f50h;
        }
        if (iC == 3) {
            return dVar.f24322d.i;
        }
        if (iC == 4) {
            return dVar.f24324e.i;
        }
        if (iC != 5) {
            return null;
        }
        return dVar.f24324e.f35k;
    }

    public static g i(z.c cVar, int i) {
        z.c cVar2 = cVar.f24289f;
        if (cVar2 == null) {
            return null;
        }
        z.d dVar = cVar2.f24287d;
        p pVar = i == 0 ? dVar.f24322d : dVar.f24324e;
        int iC = AbstractC2984e.c(cVar2.f24288e);
        if (iC == 1 || iC == 2) {
            return pVar.f50h;
        }
        if (iC == 3 || iC == 4) {
            return pVar.i;
        }
        return null;
    }

    public final void c(g gVar, g gVar2, int i, h hVar) {
        gVar.f29l.add(gVar2);
        gVar.f29l.add(this.f47e);
        gVar.f26h = i;
        gVar.i = hVar;
        gVar2.f28k.add(gVar);
        hVar.f28k.add(gVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i3) {
        if (i3 == 0) {
            z.d dVar = this.f44b;
            int i6 = dVar.f24352v;
            int iMax = Math.max(dVar.f24351u, i);
            if (i6 > 0) {
                iMax = Math.min(i6, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            z.d dVar2 = this.f44b;
            int i7 = dVar2.f24355y;
            int iMax2 = Math.max(dVar2.f24354x, i);
            if (i7 > 0) {
                iMax2 = Math.min(i7, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        if (this.f47e.f27j) {
            return r0.f25g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(z.c r12, z.c r13, int r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.p.l(z.c, z.c, int):void");
    }
}
