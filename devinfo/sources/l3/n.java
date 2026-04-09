package l3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class n implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f28580a;

    /* renamed from: b, reason: collision with root package name */
    public k3.d f28581b;

    /* renamed from: c, reason: collision with root package name */
    public k f28582c;

    /* renamed from: d, reason: collision with root package name */
    public int f28583d;

    /* renamed from: e, reason: collision with root package name */
    public final f f28584e = new f(this);

    /* renamed from: f, reason: collision with root package name */
    public int f28585f = 0;
    public boolean g = false;

    /* renamed from: h, reason: collision with root package name */
    public final e f28586h = new e(this);

    /* renamed from: i, reason: collision with root package name */
    public final e f28587i = new e(this);
    public int j = 1;

    public n(k3.d dVar) {
        this.f28581b = dVar;
    }

    public static void b(e eVar, e eVar2, int i4) {
        eVar.f28566l.add(eVar2);
        eVar.f28562f = i4;
        eVar2.f28565k.add(eVar);
    }

    public static e h(k3.c cVar) {
        k3.c cVar2 = cVar.f27836f;
        if (cVar2 == null) {
            return null;
        }
        k3.d dVar = cVar2.f27834d;
        int iC = i3.e.c(cVar2.f27835e);
        if (iC == 1) {
            return dVar.f27845d.f28586h;
        }
        if (iC == 2) {
            return dVar.f27847e.f28586h;
        }
        if (iC == 3) {
            return dVar.f27845d.f28587i;
        }
        if (iC == 4) {
            return dVar.f27847e.f28587i;
        }
        if (iC != 5) {
            return null;
        }
        return dVar.f27847e.f28572k;
    }

    public static e i(k3.c cVar, int i4) {
        k3.c cVar2 = cVar.f27836f;
        if (cVar2 == null) {
            return null;
        }
        k3.d dVar = cVar2.f27834d;
        n nVar = i4 == 0 ? dVar.f27845d : dVar.f27847e;
        int iC = i3.e.c(cVar2.f27835e);
        if (iC == 1 || iC == 2) {
            return nVar.f28586h;
        }
        if (iC == 3 || iC == 4) {
            return nVar.f28587i;
        }
        return null;
    }

    public final void c(e eVar, e eVar2, int i4, f fVar) {
        eVar.f28566l.add(eVar2);
        eVar.f28566l.add(this.f28584e);
        eVar.f28563h = i4;
        eVar.f28564i = fVar;
        eVar2.f28565k.add(eVar);
        fVar.f28565k.add(eVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i4, int i10) {
        if (i10 == 0) {
            k3.d dVar = this.f28581b;
            int i11 = dVar.f27874v;
            int iMax = Math.max(dVar.f27873u, i4);
            if (i11 > 0) {
                iMax = Math.min(i11, i4);
            }
            if (iMax != i4) {
                return iMax;
            }
        } else {
            k3.d dVar2 = this.f28581b;
            int i12 = dVar2.f27877y;
            int iMax2 = Math.max(dVar2.f27876x, i4);
            if (i12 > 0) {
                iMax2 = Math.min(i12, i4);
            }
            if (iMax2 != i4) {
                return iMax2;
            }
        }
        return i4;
    }

    public long j() {
        if (this.f28584e.j) {
            return r0.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(k3.c r12, k3.c r13, int r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.n.l(k3.c, k3.c, int):void");
    }
}
