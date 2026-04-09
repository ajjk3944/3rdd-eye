package a3;

/* loaded from: classes.dex */
public abstract class t implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f75a;

    /* renamed from: b, reason: collision with root package name */
    public z2.g f76b;

    /* renamed from: c, reason: collision with root package name */
    public n f77c;

    /* renamed from: d, reason: collision with root package name */
    public z2.f f78d;

    /* renamed from: e, reason: collision with root package name */
    public final h f79e = new h(this);

    /* renamed from: f, reason: collision with root package name */
    public int f80f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f81g = false;

    /* renamed from: h, reason: collision with root package name */
    public final g f82h = new g(this);

    /* renamed from: i, reason: collision with root package name */
    public final g f83i = new g(this);
    public s j = s.NONE;

    public t(z2.g gVar) {
        this.f76b = gVar;
    }

    public static void b(g gVar, g gVar2, int i10) {
        gVar.f60l.add(gVar2);
        gVar.f56f = i10;
        gVar2.k.add(gVar);
    }

    public static g h(z2.d dVar) {
        z2.d dVar2 = dVar.f26531f;
        if (dVar2 == null) {
            return null;
        }
        z2.g gVar = dVar2.f26529d;
        int i10 = r.f74a[dVar2.f26530e.ordinal()];
        if (i10 == 1) {
            return gVar.f26542d.f82h;
        }
        if (i10 == 2) {
            return gVar.f26542d.f83i;
        }
        if (i10 == 3) {
            return gVar.f26544e.f82h;
        }
        if (i10 == 4) {
            return gVar.f26544e.k;
        }
        if (i10 != 5) {
            return null;
        }
        return gVar.f26544e.f83i;
    }

    public static g i(z2.d dVar, int i10) {
        z2.d dVar2 = dVar.f26531f;
        if (dVar2 == null) {
            return null;
        }
        z2.g gVar = dVar2.f26529d;
        t tVar = i10 == 0 ? gVar.f26542d : gVar.f26544e;
        int i11 = r.f74a[dVar2.f26530e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return tVar.f83i;
        }
        return tVar.f82h;
    }

    public final void c(g gVar, g gVar2, int i10, h hVar) {
        gVar.f60l.add(gVar2);
        gVar.f60l.add(this.f79e);
        gVar.f58h = i10;
        gVar.f59i = hVar;
        gVar2.k.add(gVar);
        hVar.k.add(gVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        if (i11 == 0) {
            z2.g gVar = this.f76b;
            int i12 = gVar.f26571v;
            int iMax = Math.max(gVar.f26570u, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            z2.g gVar2 = this.f76b;
            int i13 = gVar2.f26574y;
            int iMax2 = Math.max(gVar2.f26573x, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    public long j() {
        if (this.f79e.j) {
            return r0.f57g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(z2.d r13, z2.d r14, int r15) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.t.l(z2.d, z2.d, int):void");
    }
}
