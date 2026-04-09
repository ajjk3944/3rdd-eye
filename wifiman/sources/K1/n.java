package k1;

import j1.d;
import j1.e;
import k1.f;
import k1.p;

/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f51070k;

    /* renamed from: l, reason: collision with root package name */
    g f51071l;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f51072a;

        static {
            int[] iArr = new int[p.b.values().length];
            f51072a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51072a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51072a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(j1.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f51070k = fVar;
        this.f51071l = null;
        this.f51094h.f51048e = f.a.TOP;
        this.f51095i.f51048e = f.a.BOTTOM;
        fVar.f51048e = f.a.BASELINE;
        this.f51092f = 1;
    }

    @Override // k1.p, k1.InterfaceC6358d
    public void a(InterfaceC6358d interfaceC6358d) {
        float f10;
        float fS;
        float fS2;
        int i10;
        int i11 = a.f51072a[this.f51096j.ordinal()];
        if (i11 == 1) {
            p(interfaceC6358d);
        } else if (i11 == 2) {
            o(interfaceC6358d);
        } else if (i11 == 3) {
            j1.e eVar = this.f51088b;
            n(interfaceC6358d, eVar.f49880O, eVar.f49882Q, 1);
            return;
        }
        g gVar = this.f51091e;
        if (gVar.f51046c && !gVar.f51053j && this.f51090d == e.b.MATCH_CONSTRAINT) {
            j1.e eVar2 = this.f51088b;
            int i12 = eVar2.f49938x;
            if (i12 == 2) {
                j1.e eVarF = eVar2.F();
                if (eVarF != null) {
                    if (eVarF.f49902f.f51091e.f51053j) {
                        this.f51091e.d((int) ((r7.f51050g * this.f51088b.f49865E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f49900e.f51091e.f51053j) {
                int iT = eVar2.t();
                if (iT == -1) {
                    j1.e eVar3 = this.f51088b;
                    f10 = eVar3.f49900e.f51091e.f51050g;
                    fS = eVar3.s();
                } else if (iT == 0) {
                    fS2 = r7.f49900e.f51091e.f51050g * this.f51088b.s();
                    i10 = (int) (fS2 + 0.5f);
                    this.f51091e.d(i10);
                } else if (iT != 1) {
                    i10 = 0;
                    this.f51091e.d(i10);
                } else {
                    j1.e eVar4 = this.f51088b;
                    f10 = eVar4.f49900e.f51091e.f51050g;
                    fS = eVar4.s();
                }
                fS2 = f10 / fS;
                i10 = (int) (fS2 + 0.5f);
                this.f51091e.d(i10);
            }
        }
        f fVar = this.f51094h;
        if (fVar.f51046c) {
            f fVar2 = this.f51095i;
            if (fVar2.f51046c) {
                if (fVar.f51053j && fVar2.f51053j && this.f51091e.f51053j) {
                    return;
                }
                if (!this.f51091e.f51053j && this.f51090d == e.b.MATCH_CONSTRAINT) {
                    j1.e eVar5 = this.f51088b;
                    if (eVar5.f49936w == 0 && !eVar5.b0()) {
                        f fVar3 = (f) this.f51094h.f51055l.get(0);
                        f fVar4 = (f) this.f51095i.f51055l.get(0);
                        int i13 = fVar3.f51050g;
                        f fVar5 = this.f51094h;
                        int i14 = i13 + fVar5.f51049f;
                        int i15 = fVar4.f51050g + this.f51095i.f51049f;
                        fVar5.d(i14);
                        this.f51095i.d(i15);
                        this.f51091e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f51091e.f51053j && this.f51090d == e.b.MATCH_CONSTRAINT && this.f51087a == 1 && this.f51094h.f51055l.size() > 0 && this.f51095i.f51055l.size() > 0) {
                    f fVar6 = (f) this.f51094h.f51055l.get(0);
                    int i16 = (((f) this.f51095i.f51055l.get(0)).f51050g + this.f51095i.f51049f) - (fVar6.f51050g + this.f51094h.f51049f);
                    g gVar2 = this.f51091e;
                    int i17 = gVar2.f51056m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f51091e.f51053j && this.f51094h.f51055l.size() > 0 && this.f51095i.f51055l.size() > 0) {
                    f fVar7 = (f) this.f51094h.f51055l.get(0);
                    f fVar8 = (f) this.f51095i.f51055l.get(0);
                    int i18 = fVar7.f51050g + this.f51094h.f51049f;
                    int i19 = fVar8.f51050g + this.f51095i.f51049f;
                    float fK = this.f51088b.K();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f51050g;
                        i19 = fVar8.f51050g;
                        fK = 0.5f;
                    }
                    this.f51094h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f51091e.f51050g) * fK)));
                    this.f51095i.d(this.f51094h.f51050g + this.f51091e.f51050g);
                }
            }
        }
    }

    @Override // k1.p
    void d() {
        j1.e eVarF;
        j1.e eVarF2;
        j1.e eVar = this.f51088b;
        if (eVar.f49892a) {
            this.f51091e.d(eVar.u());
        }
        if (!this.f51091e.f51053j) {
            this.f51090d = this.f51088b.M();
            if (this.f51088b.R()) {
                this.f51071l = new C6355a(this);
            }
            e.b bVar = this.f51090d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (eVarF2 = this.f51088b.F()) != null && eVarF2.M() == e.b.FIXED) {
                    int iU = (eVarF2.u() - this.f51088b.f49880O.f()) - this.f51088b.f49882Q.f();
                    b(this.f51094h, eVarF2.f49902f.f51094h, this.f51088b.f49880O.f());
                    b(this.f51095i, eVarF2.f49902f.f51095i, -this.f51088b.f49882Q.f());
                    this.f51091e.d(iU);
                    return;
                }
                if (this.f51090d == e.b.FIXED) {
                    this.f51091e.d(this.f51088b.u());
                }
            }
        } else if (this.f51090d == e.b.MATCH_PARENT && (eVarF = this.f51088b.F()) != null && eVarF.M() == e.b.FIXED) {
            b(this.f51094h, eVarF.f49902f.f51094h, this.f51088b.f49880O.f());
            b(this.f51095i, eVarF.f49902f.f51095i, -this.f51088b.f49882Q.f());
            return;
        }
        g gVar = this.f51091e;
        boolean z10 = gVar.f51053j;
        if (z10) {
            j1.e eVar2 = this.f51088b;
            if (eVar2.f49892a) {
                j1.d[] dVarArr = eVar2.f49887V;
                j1.d dVar = dVarArr[2];
                j1.d dVar2 = dVar.f49852f;
                if (dVar2 != null && dVarArr[3].f49852f != null) {
                    if (eVar2.b0()) {
                        this.f51094h.f51049f = this.f51088b.f49887V[2].f();
                        this.f51095i.f51049f = -this.f51088b.f49887V[3].f();
                    } else {
                        f fVarH = h(this.f51088b.f49887V[2]);
                        if (fVarH != null) {
                            b(this.f51094h, fVarH, this.f51088b.f49887V[2].f());
                        }
                        f fVarH2 = h(this.f51088b.f49887V[3]);
                        if (fVarH2 != null) {
                            b(this.f51095i, fVarH2, -this.f51088b.f49887V[3].f());
                        }
                        this.f51094h.f51045b = true;
                        this.f51095i.f51045b = true;
                    }
                    if (this.f51088b.R()) {
                        b(this.f51070k, this.f51094h, this.f51088b.m());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f51094h, fVarH3, this.f51088b.f49887V[2].f());
                        b(this.f51095i, this.f51094h, this.f51091e.f51050g);
                        if (this.f51088b.R()) {
                            b(this.f51070k, this.f51094h, this.f51088b.m());
                            return;
                        }
                        return;
                    }
                    return;
                }
                j1.d dVar3 = dVarArr[3];
                if (dVar3.f49852f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f51095i, fVarH4, -this.f51088b.f49887V[3].f());
                        b(this.f51094h, this.f51095i, -this.f51091e.f51050g);
                    }
                    if (this.f51088b.R()) {
                        b(this.f51070k, this.f51094h, this.f51088b.m());
                        return;
                    }
                    return;
                }
                j1.d dVar4 = dVarArr[4];
                if (dVar4.f49852f != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f51070k, fVarH5, 0);
                        b(this.f51094h, this.f51070k, -this.f51088b.m());
                        b(this.f51095i, this.f51094h, this.f51091e.f51050g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof j1.i) || eVar2.F() == null || this.f51088b.l(d.a.CENTER).f49852f != null) {
                    return;
                }
                b(this.f51094h, this.f51088b.F().f49902f.f51094h, this.f51088b.Q());
                b(this.f51095i, this.f51094h, this.f51091e.f51050g);
                if (this.f51088b.R()) {
                    b(this.f51070k, this.f51094h, this.f51088b.m());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f51090d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            j1.e eVar3 = this.f51088b;
            int i10 = eVar3.f49938x;
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
            } else if (i10 == 3 && !eVar3.b0()) {
                j1.e eVar4 = this.f51088b;
                if (eVar4.f49936w != 3) {
                    g gVar4 = eVar4.f49900e.f51091e;
                    this.f51091e.f51055l.add(gVar4);
                    gVar4.f51054k.add(this.f51091e);
                    g gVar5 = this.f51091e;
                    gVar5.f51045b = true;
                    gVar5.f51054k.add(this.f51094h);
                    this.f51091e.f51054k.add(this.f51095i);
                }
            }
        }
        j1.e eVar5 = this.f51088b;
        j1.d[] dVarArr2 = eVar5.f49887V;
        j1.d dVar5 = dVarArr2[2];
        j1.d dVar6 = dVar5.f49852f;
        if (dVar6 != null && dVarArr2[3].f49852f != null) {
            if (eVar5.b0()) {
                this.f51094h.f51049f = this.f51088b.f49887V[2].f();
                this.f51095i.f51049f = -this.f51088b.f49887V[3].f();
            } else {
                f fVarH6 = h(this.f51088b.f49887V[2]);
                f fVarH7 = h(this.f51088b.f49887V[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f51096j = p.b.CENTER;
            }
            if (this.f51088b.R()) {
                c(this.f51070k, this.f51094h, 1, this.f51071l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f51094h, fVarH8, this.f51088b.f49887V[2].f());
                c(this.f51095i, this.f51094h, 1, this.f51091e);
                if (this.f51088b.R()) {
                    c(this.f51070k, this.f51094h, 1, this.f51071l);
                }
                e.b bVar2 = this.f51090d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f51088b.s() > 0.0f) {
                    l lVar = this.f51088b.f49900e;
                    if (lVar.f51090d == bVar3) {
                        lVar.f51091e.f51054k.add(this.f51091e);
                        this.f51091e.f51055l.add(this.f51088b.f49900e.f51091e);
                        this.f51091e.f51044a = this;
                    }
                }
            }
        } else {
            j1.d dVar7 = dVarArr2[3];
            if (dVar7.f49852f != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f51095i, fVarH9, -this.f51088b.f49887V[3].f());
                    c(this.f51094h, this.f51095i, -1, this.f51091e);
                    if (this.f51088b.R()) {
                        c(this.f51070k, this.f51094h, 1, this.f51071l);
                    }
                }
            } else {
                j1.d dVar8 = dVarArr2[4];
                if (dVar8.f49852f != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f51070k, fVarH10, 0);
                        c(this.f51094h, this.f51070k, -1, this.f51071l);
                        c(this.f51095i, this.f51094h, 1, this.f51091e);
                    }
                } else if (!(eVar5 instanceof j1.i) && eVar5.F() != null) {
                    b(this.f51094h, this.f51088b.F().f49902f.f51094h, this.f51088b.Q());
                    c(this.f51095i, this.f51094h, 1, this.f51091e);
                    if (this.f51088b.R()) {
                        c(this.f51070k, this.f51094h, 1, this.f51071l);
                    }
                    e.b bVar4 = this.f51090d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f51088b.s() > 0.0f) {
                        l lVar2 = this.f51088b.f49900e;
                        if (lVar2.f51090d == bVar5) {
                            lVar2.f51091e.f51054k.add(this.f51091e);
                            this.f51091e.f51055l.add(this.f51088b.f49900e.f51091e);
                            this.f51091e.f51044a = this;
                        }
                    }
                }
            }
        }
        if (this.f51091e.f51055l.size() == 0) {
            this.f51091e.f51046c = true;
        }
    }

    @Override // k1.p
    public void e() {
        f fVar = this.f51094h;
        if (fVar.f51053j) {
            this.f51088b.W0(fVar.f51050g);
        }
    }

    @Override // k1.p
    void f() {
        this.f51089c = null;
        this.f51094h.c();
        this.f51095i.c();
        this.f51070k.c();
        this.f51091e.c();
        this.f51093g = false;
    }

    @Override // k1.p
    boolean m() {
        return this.f51090d != e.b.MATCH_CONSTRAINT || this.f51088b.f49938x == 0;
    }

    void q() {
        this.f51093g = false;
        this.f51094h.c();
        this.f51094h.f51053j = false;
        this.f51095i.c();
        this.f51095i.f51053j = false;
        this.f51070k.c();
        this.f51070k.f51053j = false;
        this.f51091e.f51053j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f51088b.q();
    }
}
