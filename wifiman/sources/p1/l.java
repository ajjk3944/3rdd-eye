package p1;

import o1.C7048d;
import o1.C7049e;
import o1.InterfaceC7053i;
import p1.f;
import p1.m;

/* loaded from: classes.dex */
public class l extends m {

    /* renamed from: k, reason: collision with root package name */
    public f f57495k;

    /* renamed from: l, reason: collision with root package name */
    g f57496l;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57497a;

        static {
            int[] iArr = new int[m.b.values().length];
            f57497a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57497a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57497a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(C7049e c7049e) {
        super(c7049e);
        f fVar = new f(this);
        this.f57495k = fVar;
        this.f57496l = null;
        this.f57505h.f57476e = f.a.TOP;
        this.f57506i.f57476e = f.a.BOTTOM;
        fVar.f57476e = f.a.BASELINE;
        this.f57503f = 1;
    }

    @Override // p1.m, p1.d
    public void a(d dVar) {
        float f10;
        float fT;
        float fT2;
        int i10;
        int i11 = a.f57497a[this.f57507j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            C7049e c7049e = this.f57499b;
            n(dVar, c7049e.f55083C, c7049e.f55085E, 1);
            return;
        }
        g gVar = this.f57502e;
        if (gVar.f57474c && !gVar.f57481j && this.f57501d == C7049e.b.MATCH_CONSTRAINT) {
            C7049e c7049e2 = this.f57499b;
            int i12 = c7049e2.f55131m;
            if (i12 == 2) {
                C7049e c7049eG = c7049e2.G();
                if (c7049eG != null) {
                    if (c7049eG.f55117f.f57502e.f57481j) {
                        this.f57502e.d((int) ((r7.f57478g * this.f57499b.f55145t) + 0.5f));
                    }
                }
            } else if (i12 == 3 && c7049e2.f55115e.f57502e.f57481j) {
                int iU = c7049e2.u();
                if (iU == -1) {
                    C7049e c7049e3 = this.f57499b;
                    f10 = c7049e3.f55115e.f57502e.f57478g;
                    fT = c7049e3.t();
                } else if (iU == 0) {
                    fT2 = r7.f55115e.f57502e.f57478g * this.f57499b.t();
                    i10 = (int) (fT2 + 0.5f);
                    this.f57502e.d(i10);
                } else if (iU != 1) {
                    i10 = 0;
                    this.f57502e.d(i10);
                } else {
                    C7049e c7049e4 = this.f57499b;
                    f10 = c7049e4.f55115e.f57502e.f57478g;
                    fT = c7049e4.t();
                }
                fT2 = f10 / fT;
                i10 = (int) (fT2 + 0.5f);
                this.f57502e.d(i10);
            }
        }
        f fVar = this.f57505h;
        if (fVar.f57474c) {
            f fVar2 = this.f57506i;
            if (fVar2.f57474c) {
                if (fVar.f57481j && fVar2.f57481j && this.f57502e.f57481j) {
                    return;
                }
                if (!this.f57502e.f57481j && this.f57501d == C7049e.b.MATCH_CONSTRAINT) {
                    C7049e c7049e5 = this.f57499b;
                    if (c7049e5.f55129l == 0 && !c7049e5.X()) {
                        f fVar3 = (f) this.f57505h.f57483l.get(0);
                        f fVar4 = (f) this.f57506i.f57483l.get(0);
                        int i13 = fVar3.f57478g;
                        f fVar5 = this.f57505h;
                        int i14 = i13 + fVar5.f57477f;
                        int i15 = fVar4.f57478g + this.f57506i.f57477f;
                        fVar5.d(i14);
                        this.f57506i.d(i15);
                        this.f57502e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f57502e.f57481j && this.f57501d == C7049e.b.MATCH_CONSTRAINT && this.f57498a == 1 && this.f57505h.f57483l.size() > 0 && this.f57506i.f57483l.size() > 0) {
                    f fVar6 = (f) this.f57505h.f57483l.get(0);
                    int i16 = (((f) this.f57506i.f57483l.get(0)).f57478g + this.f57506i.f57477f) - (fVar6.f57478g + this.f57505h.f57477f);
                    g gVar2 = this.f57502e;
                    int i17 = gVar2.f57484m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f57502e.f57481j && this.f57505h.f57483l.size() > 0 && this.f57506i.f57483l.size() > 0) {
                    f fVar7 = (f) this.f57505h.f57483l.get(0);
                    f fVar8 = (f) this.f57506i.f57483l.get(0);
                    int i18 = fVar7.f57478g + this.f57505h.f57477f;
                    int i19 = fVar8.f57478g + this.f57506i.f57477f;
                    float fK = this.f57499b.K();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f57478g;
                        i19 = fVar8.f57478g;
                        fK = 0.5f;
                    }
                    this.f57505h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f57502e.f57478g) * fK)));
                    this.f57506i.d(this.f57505h.f57478g + this.f57502e.f57478g);
                }
            }
        }
    }

    @Override // p1.m
    void d() {
        C7049e c7049eG;
        C7049e c7049eG2;
        C7049e c7049e = this.f57499b;
        if (c7049e.f55107a) {
            this.f57502e.d(c7049e.v());
        }
        if (!this.f57502e.f57481j) {
            this.f57501d = this.f57499b.M();
            if (this.f57499b.S()) {
                this.f57496l = new C7205a(this);
            }
            C7049e.b bVar = this.f57501d;
            if (bVar != C7049e.b.MATCH_CONSTRAINT) {
                if (bVar == C7049e.b.MATCH_PARENT && (c7049eG2 = this.f57499b.G()) != null && c7049eG2.M() == C7049e.b.FIXED) {
                    int iV = (c7049eG2.v() - this.f57499b.f55083C.c()) - this.f57499b.f55085E.c();
                    b(this.f57505h, c7049eG2.f55117f.f57505h, this.f57499b.f55083C.c());
                    b(this.f57506i, c7049eG2.f55117f.f57506i, -this.f57499b.f55085E.c());
                    this.f57502e.d(iV);
                    return;
                }
                if (this.f57501d == C7049e.b.FIXED) {
                    this.f57502e.d(this.f57499b.v());
                }
            }
        } else if (this.f57501d == C7049e.b.MATCH_PARENT && (c7049eG = this.f57499b.G()) != null && c7049eG.M() == C7049e.b.FIXED) {
            b(this.f57505h, c7049eG.f55117f.f57505h, this.f57499b.f55083C.c());
            b(this.f57506i, c7049eG.f55117f.f57506i, -this.f57499b.f55085E.c());
            return;
        }
        g gVar = this.f57502e;
        boolean z10 = gVar.f57481j;
        if (z10) {
            C7049e c7049e2 = this.f57499b;
            if (c7049e2.f55107a) {
                C7048d[] c7048dArr = c7049e2.f55090J;
                C7048d c7048d = c7048dArr[2];
                C7048d c7048d2 = c7048d.f55075d;
                if (c7048d2 != null && c7048dArr[3].f55075d != null) {
                    if (c7049e2.X()) {
                        this.f57505h.f57477f = this.f57499b.f55090J[2].c();
                        this.f57506i.f57477f = -this.f57499b.f55090J[3].c();
                    } else {
                        f fVarH = h(this.f57499b.f55090J[2]);
                        if (fVarH != null) {
                            b(this.f57505h, fVarH, this.f57499b.f55090J[2].c());
                        }
                        f fVarH2 = h(this.f57499b.f55090J[3]);
                        if (fVarH2 != null) {
                            b(this.f57506i, fVarH2, -this.f57499b.f55090J[3].c());
                        }
                        this.f57505h.f57473b = true;
                        this.f57506i.f57473b = true;
                    }
                    if (this.f57499b.S()) {
                        b(this.f57495k, this.f57505h, this.f57499b.n());
                        return;
                    }
                    return;
                }
                if (c7048d2 != null) {
                    f fVarH3 = h(c7048d);
                    if (fVarH3 != null) {
                        b(this.f57505h, fVarH3, this.f57499b.f55090J[2].c());
                        b(this.f57506i, this.f57505h, this.f57502e.f57478g);
                        if (this.f57499b.S()) {
                            b(this.f57495k, this.f57505h, this.f57499b.n());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C7048d c7048d3 = c7048dArr[3];
                if (c7048d3.f55075d != null) {
                    f fVarH4 = h(c7048d3);
                    if (fVarH4 != null) {
                        b(this.f57506i, fVarH4, -this.f57499b.f55090J[3].c());
                        b(this.f57505h, this.f57506i, -this.f57502e.f57478g);
                    }
                    if (this.f57499b.S()) {
                        b(this.f57495k, this.f57505h, this.f57499b.n());
                        return;
                    }
                    return;
                }
                C7048d c7048d4 = c7048dArr[4];
                if (c7048d4.f55075d != null) {
                    f fVarH5 = h(c7048d4);
                    if (fVarH5 != null) {
                        b(this.f57495k, fVarH5, 0);
                        b(this.f57505h, this.f57495k, -this.f57499b.n());
                        b(this.f57506i, this.f57505h, this.f57502e.f57478g);
                        return;
                    }
                    return;
                }
                if ((c7049e2 instanceof InterfaceC7053i) || c7049e2.G() == null || this.f57499b.m(C7048d.b.CENTER).f55075d != null) {
                    return;
                }
                b(this.f57505h, this.f57499b.G().f55117f.f57505h, this.f57499b.R());
                b(this.f57506i, this.f57505h, this.f57502e.f57478g);
                if (this.f57499b.S()) {
                    b(this.f57495k, this.f57505h, this.f57499b.n());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f57501d != C7049e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            C7049e c7049e3 = this.f57499b;
            int i10 = c7049e3.f55131m;
            if (i10 == 2) {
                C7049e c7049eG3 = c7049e3.G();
                if (c7049eG3 != null) {
                    g gVar2 = c7049eG3.f55117f.f57502e;
                    this.f57502e.f57483l.add(gVar2);
                    gVar2.f57482k.add(this.f57502e);
                    g gVar3 = this.f57502e;
                    gVar3.f57473b = true;
                    gVar3.f57482k.add(this.f57505h);
                    this.f57502e.f57482k.add(this.f57506i);
                }
            } else if (i10 == 3 && !c7049e3.X()) {
                C7049e c7049e4 = this.f57499b;
                if (c7049e4.f55129l != 3) {
                    g gVar4 = c7049e4.f55115e.f57502e;
                    this.f57502e.f57483l.add(gVar4);
                    gVar4.f57482k.add(this.f57502e);
                    g gVar5 = this.f57502e;
                    gVar5.f57473b = true;
                    gVar5.f57482k.add(this.f57505h);
                    this.f57502e.f57482k.add(this.f57506i);
                }
            }
        }
        C7049e c7049e5 = this.f57499b;
        C7048d[] c7048dArr2 = c7049e5.f55090J;
        C7048d c7048d5 = c7048dArr2[2];
        C7048d c7048d6 = c7048d5.f55075d;
        if (c7048d6 != null && c7048dArr2[3].f55075d != null) {
            if (c7049e5.X()) {
                this.f57505h.f57477f = this.f57499b.f55090J[2].c();
                this.f57506i.f57477f = -this.f57499b.f55090J[3].c();
            } else {
                f fVarH6 = h(this.f57499b.f55090J[2]);
                f fVarH7 = h(this.f57499b.f55090J[3]);
                fVarH6.b(this);
                fVarH7.b(this);
                this.f57507j = m.b.CENTER;
            }
            if (this.f57499b.S()) {
                c(this.f57495k, this.f57505h, 1, this.f57496l);
            }
        } else if (c7048d6 != null) {
            f fVarH8 = h(c7048d5);
            if (fVarH8 != null) {
                b(this.f57505h, fVarH8, this.f57499b.f55090J[2].c());
                c(this.f57506i, this.f57505h, 1, this.f57502e);
                if (this.f57499b.S()) {
                    c(this.f57495k, this.f57505h, 1, this.f57496l);
                }
                C7049e.b bVar2 = this.f57501d;
                C7049e.b bVar3 = C7049e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f57499b.t() > 0.0f) {
                    j jVar = this.f57499b.f55115e;
                    if (jVar.f57501d == bVar3) {
                        jVar.f57502e.f57482k.add(this.f57502e);
                        this.f57502e.f57483l.add(this.f57499b.f55115e.f57502e);
                        this.f57502e.f57472a = this;
                    }
                }
            }
        } else {
            C7048d c7048d7 = c7048dArr2[3];
            if (c7048d7.f55075d != null) {
                f fVarH9 = h(c7048d7);
                if (fVarH9 != null) {
                    b(this.f57506i, fVarH9, -this.f57499b.f55090J[3].c());
                    c(this.f57505h, this.f57506i, -1, this.f57502e);
                    if (this.f57499b.S()) {
                        c(this.f57495k, this.f57505h, 1, this.f57496l);
                    }
                }
            } else {
                C7048d c7048d8 = c7048dArr2[4];
                if (c7048d8.f55075d != null) {
                    f fVarH10 = h(c7048d8);
                    if (fVarH10 != null) {
                        b(this.f57495k, fVarH10, 0);
                        c(this.f57505h, this.f57495k, -1, this.f57496l);
                        c(this.f57506i, this.f57505h, 1, this.f57502e);
                    }
                } else if (!(c7049e5 instanceof InterfaceC7053i) && c7049e5.G() != null) {
                    b(this.f57505h, this.f57499b.G().f55117f.f57505h, this.f57499b.R());
                    c(this.f57506i, this.f57505h, 1, this.f57502e);
                    if (this.f57499b.S()) {
                        c(this.f57495k, this.f57505h, 1, this.f57496l);
                    }
                    C7049e.b bVar4 = this.f57501d;
                    C7049e.b bVar5 = C7049e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f57499b.t() > 0.0f) {
                        j jVar2 = this.f57499b.f55115e;
                        if (jVar2.f57501d == bVar5) {
                            jVar2.f57502e.f57482k.add(this.f57502e);
                            this.f57502e.f57483l.add(this.f57499b.f55115e.f57502e);
                            this.f57502e.f57472a = this;
                        }
                    }
                }
            }
        }
        if (this.f57502e.f57483l.size() == 0) {
            this.f57502e.f57474c = true;
        }
    }

    @Override // p1.m
    public void e() {
        f fVar = this.f57505h;
        if (fVar.f57481j) {
            this.f57499b.G0(fVar.f57478g);
        }
    }

    @Override // p1.m
    void f() {
        this.f57500c = null;
        this.f57505h.c();
        this.f57506i.c();
        this.f57495k.c();
        this.f57502e.c();
        this.f57504g = false;
    }

    @Override // p1.m
    boolean m() {
        return this.f57501d != C7049e.b.MATCH_CONSTRAINT || this.f57499b.f55131m == 0;
    }

    void q() {
        this.f57504g = false;
        this.f57505h.c();
        this.f57505h.f57481j = false;
        this.f57506i.c();
        this.f57506i.f57481j = false;
        this.f57495k.c();
        this.f57495k.f57481j = false;
        this.f57502e.f57481j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f57499b.r();
    }
}
