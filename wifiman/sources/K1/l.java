package k1;

import j1.d;
import j1.e;
import k1.f;
import k1.p;

/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f51060k = new int[2];

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f51061a;

        static {
            int[] iArr = new int[p.b.values().length];
            f51061a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51061a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51061a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(j1.e eVar) {
        super(eVar);
        this.f51094h.f51048e = f.a.LEFT;
        this.f51095i.f51048e = f.a.RIGHT;
        this.f51092f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02df  */
    @Override // k1.p, k1.InterfaceC6358d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(k1.InterfaceC6358d r17) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.l.a(k1.d):void");
    }

    @Override // k1.p
    void d() {
        j1.e eVarF;
        j1.e eVarF2;
        j1.e eVar = this.f51088b;
        if (eVar.f49892a) {
            this.f51091e.d(eVar.O());
        }
        if (this.f51091e.f51053j) {
            e.b bVar = this.f51090d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (eVarF = this.f51088b.F()) != null && (eVarF.x() == e.b.FIXED || eVarF.x() == bVar2)) {
                b(this.f51094h, eVarF.f49900e.f51094h, this.f51088b.f49879N.f());
                b(this.f51095i, eVarF.f49900e.f51095i, -this.f51088b.f49881P.f());
                return;
            }
        } else {
            e.b bVarX = this.f51088b.x();
            this.f51090d = bVarX;
            if (bVarX != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (bVarX == bVar3 && (eVarF2 = this.f51088b.F()) != null && (eVarF2.x() == e.b.FIXED || eVarF2.x() == bVar3)) {
                    int iO = (eVarF2.O() - this.f51088b.f49879N.f()) - this.f51088b.f49881P.f();
                    b(this.f51094h, eVarF2.f49900e.f51094h, this.f51088b.f49879N.f());
                    b(this.f51095i, eVarF2.f49900e.f51095i, -this.f51088b.f49881P.f());
                    this.f51091e.d(iO);
                    return;
                }
                if (this.f51090d == e.b.FIXED) {
                    this.f51091e.d(this.f51088b.O());
                }
            }
        }
        g gVar = this.f51091e;
        if (gVar.f51053j) {
            j1.e eVar2 = this.f51088b;
            if (eVar2.f49892a) {
                j1.d[] dVarArr = eVar2.f49887V;
                j1.d dVar = dVarArr[0];
                j1.d dVar2 = dVar.f49852f;
                if (dVar2 != null && dVarArr[1].f49852f != null) {
                    if (eVar2.a0()) {
                        this.f51094h.f51049f = this.f51088b.f49887V[0].f();
                        this.f51095i.f51049f = -this.f51088b.f49887V[1].f();
                        return;
                    }
                    f fVarH = h(this.f51088b.f49887V[0]);
                    if (fVarH != null) {
                        b(this.f51094h, fVarH, this.f51088b.f49887V[0].f());
                    }
                    f fVarH2 = h(this.f51088b.f49887V[1]);
                    if (fVarH2 != null) {
                        b(this.f51095i, fVarH2, -this.f51088b.f49887V[1].f());
                    }
                    this.f51094h.f51045b = true;
                    this.f51095i.f51045b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f51094h, fVarH3, this.f51088b.f49887V[0].f());
                        b(this.f51095i, this.f51094h, this.f51091e.f51050g);
                        return;
                    }
                    return;
                }
                j1.d dVar3 = dVarArr[1];
                if (dVar3.f49852f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f51095i, fVarH4, -this.f51088b.f49887V[1].f());
                        b(this.f51094h, this.f51095i, -this.f51091e.f51050g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof j1.i) || eVar2.F() == null || this.f51088b.l(d.a.CENTER).f49852f != null) {
                    return;
                }
                b(this.f51094h, this.f51088b.F().f49900e.f51094h, this.f51088b.P());
                b(this.f51095i, this.f51094h, this.f51091e.f51050g);
                return;
            }
        }
        if (this.f51090d == e.b.MATCH_CONSTRAINT) {
            j1.e eVar3 = this.f51088b;
            int i10 = eVar3.f49936w;
            if (i10 == 2) {
                j1.e eVarF3 = eVar3.F();
                if (eVarF3 != null) {
                    g gVar2 = eVarF3.f49902f.f51091e;
                    this.f51091e.f51055l.add(gVar2);
                    gVar2.f51054k.add(this.f51091e);
                    g gVar3 = this.f51091e;
                    gVar3.f51045b = true;
                    gVar3.f51054k.add(this.f51094h);
                    this.f51091e.f51054k.add(this.f51095i);
                }
            } else if (i10 == 3) {
                if (eVar3.f49938x == 3) {
                    this.f51094h.f51044a = this;
                    this.f51095i.f51044a = this;
                    n nVar = eVar3.f49902f;
                    nVar.f51094h.f51044a = this;
                    nVar.f51095i.f51044a = this;
                    gVar.f51044a = this;
                    if (eVar3.b0()) {
                        this.f51091e.f51055l.add(this.f51088b.f49902f.f51091e);
                        this.f51088b.f49902f.f51091e.f51054k.add(this.f51091e);
                        n nVar2 = this.f51088b.f49902f;
                        nVar2.f51091e.f51044a = this;
                        this.f51091e.f51055l.add(nVar2.f51094h);
                        this.f51091e.f51055l.add(this.f51088b.f49902f.f51095i);
                        this.f51088b.f49902f.f51094h.f51054k.add(this.f51091e);
                        this.f51088b.f49902f.f51095i.f51054k.add(this.f51091e);
                    } else if (this.f51088b.a0()) {
                        this.f51088b.f49902f.f51091e.f51055l.add(this.f51091e);
                        this.f51091e.f51054k.add(this.f51088b.f49902f.f51091e);
                    } else {
                        this.f51088b.f49902f.f51091e.f51055l.add(this.f51091e);
                    }
                } else {
                    g gVar4 = eVar3.f49902f.f51091e;
                    gVar.f51055l.add(gVar4);
                    gVar4.f51054k.add(this.f51091e);
                    this.f51088b.f49902f.f51094h.f51054k.add(this.f51091e);
                    this.f51088b.f49902f.f51095i.f51054k.add(this.f51091e);
                    g gVar5 = this.f51091e;
                    gVar5.f51045b = true;
                    gVar5.f51054k.add(this.f51094h);
                    this.f51091e.f51054k.add(this.f51095i);
                    this.f51094h.f51055l.add(this.f51091e);
                    this.f51095i.f51055l.add(this.f51091e);
                }
            }
        }
        j1.e eVar4 = this.f51088b;
        j1.d[] dVarArr2 = eVar4.f49887V;
        j1.d dVar4 = dVarArr2[0];
        j1.d dVar5 = dVar4.f49852f;
        if (dVar5 != null && dVarArr2[1].f49852f != null) {
            if (eVar4.a0()) {
                this.f51094h.f51049f = this.f51088b.f49887V[0].f();
                this.f51095i.f51049f = -this.f51088b.f49887V[1].f();
                return;
            }
            f fVarH5 = h(this.f51088b.f49887V[0]);
            f fVarH6 = h(this.f51088b.f49887V[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f51096j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f51094h, fVarH7, this.f51088b.f49887V[0].f());
                c(this.f51095i, this.f51094h, 1, this.f51091e);
                return;
            }
            return;
        }
        j1.d dVar6 = dVarArr2[1];
        if (dVar6.f49852f != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f51095i, fVarH8, -this.f51088b.f49887V[1].f());
                c(this.f51094h, this.f51095i, -1, this.f51091e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof j1.i) || eVar4.F() == null) {
            return;
        }
        b(this.f51094h, this.f51088b.F().f49900e.f51094h, this.f51088b.P());
        c(this.f51095i, this.f51094h, 1, this.f51091e);
    }

    @Override // k1.p
    public void e() {
        f fVar = this.f51094h;
        if (fVar.f51053j) {
            this.f51088b.V0(fVar.f51050g);
        }
    }

    @Override // k1.p
    void f() {
        this.f51089c = null;
        this.f51094h.c();
        this.f51095i.c();
        this.f51091e.c();
        this.f51093g = false;
    }

    @Override // k1.p
    boolean m() {
        return this.f51090d != e.b.MATCH_CONSTRAINT || this.f51088b.f49936w == 0;
    }

    void r() {
        this.f51093g = false;
        this.f51094h.c();
        this.f51094h.f51053j = false;
        this.f51095i.c();
        this.f51095i.f51053j = false;
        this.f51091e.f51053j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f51088b.q();
    }
}
