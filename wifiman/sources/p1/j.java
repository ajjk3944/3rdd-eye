package p1;

import o1.C7048d;
import o1.C7049e;
import o1.InterfaceC7053i;
import p1.f;
import p1.m;

/* loaded from: classes.dex */
public class j extends m {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f57485k = new int[2];

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57486a;

        static {
            int[] iArr = new int[m.b.values().length];
            f57486a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57486a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57486a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(C7049e c7049e) {
        super(c7049e);
        this.f57505h.f57476e = f.a.LEFT;
        this.f57506i.f57476e = f.a.RIGHT;
        this.f57503f = 0;
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
    @Override // p1.m, p1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(p1.d r17) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.j.a(p1.d):void");
    }

    @Override // p1.m
    void d() {
        C7049e c7049eG;
        C7049e c7049eG2;
        C7049e c7049e = this.f57499b;
        if (c7049e.f55107a) {
            this.f57502e.d(c7049e.P());
        }
        if (this.f57502e.f57481j) {
            C7049e.b bVar = this.f57501d;
            C7049e.b bVar2 = C7049e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((c7049eG = this.f57499b.G()) != null && c7049eG.y() == C7049e.b.FIXED) || c7049eG.y() == bVar2)) {
                b(this.f57505h, c7049eG.f55115e.f57505h, this.f57499b.f55082B.c());
                b(this.f57506i, c7049eG.f55115e.f57506i, -this.f57499b.f55084D.c());
                return;
            }
        } else {
            C7049e.b bVarY = this.f57499b.y();
            this.f57501d = bVarY;
            if (bVarY != C7049e.b.MATCH_CONSTRAINT) {
                C7049e.b bVar3 = C7049e.b.MATCH_PARENT;
                if (bVarY == bVar3 && (((c7049eG2 = this.f57499b.G()) != null && c7049eG2.y() == C7049e.b.FIXED) || c7049eG2.y() == bVar3)) {
                    int iP = (c7049eG2.P() - this.f57499b.f55082B.c()) - this.f57499b.f55084D.c();
                    b(this.f57505h, c7049eG2.f55115e.f57505h, this.f57499b.f55082B.c());
                    b(this.f57506i, c7049eG2.f55115e.f57506i, -this.f57499b.f55084D.c());
                    this.f57502e.d(iP);
                    return;
                }
                if (this.f57501d == C7049e.b.FIXED) {
                    this.f57502e.d(this.f57499b.P());
                }
            }
        }
        g gVar = this.f57502e;
        if (gVar.f57481j) {
            C7049e c7049e2 = this.f57499b;
            if (c7049e2.f55107a) {
                C7048d[] c7048dArr = c7049e2.f55090J;
                C7048d c7048d = c7048dArr[0];
                C7048d c7048d2 = c7048d.f55075d;
                if (c7048d2 != null && c7048dArr[1].f55075d != null) {
                    if (c7049e2.V()) {
                        this.f57505h.f57477f = this.f57499b.f55090J[0].c();
                        this.f57506i.f57477f = -this.f57499b.f55090J[1].c();
                        return;
                    }
                    f fVarH = h(this.f57499b.f55090J[0]);
                    if (fVarH != null) {
                        b(this.f57505h, fVarH, this.f57499b.f55090J[0].c());
                    }
                    f fVarH2 = h(this.f57499b.f55090J[1]);
                    if (fVarH2 != null) {
                        b(this.f57506i, fVarH2, -this.f57499b.f55090J[1].c());
                    }
                    this.f57505h.f57473b = true;
                    this.f57506i.f57473b = true;
                    return;
                }
                if (c7048d2 != null) {
                    f fVarH3 = h(c7048d);
                    if (fVarH3 != null) {
                        b(this.f57505h, fVarH3, this.f57499b.f55090J[0].c());
                        b(this.f57506i, this.f57505h, this.f57502e.f57478g);
                        return;
                    }
                    return;
                }
                C7048d c7048d3 = c7048dArr[1];
                if (c7048d3.f55075d != null) {
                    f fVarH4 = h(c7048d3);
                    if (fVarH4 != null) {
                        b(this.f57506i, fVarH4, -this.f57499b.f55090J[1].c());
                        b(this.f57505h, this.f57506i, -this.f57502e.f57478g);
                        return;
                    }
                    return;
                }
                if ((c7049e2 instanceof InterfaceC7053i) || c7049e2.G() == null || this.f57499b.m(C7048d.b.CENTER).f55075d != null) {
                    return;
                }
                b(this.f57505h, this.f57499b.G().f55115e.f57505h, this.f57499b.Q());
                b(this.f57506i, this.f57505h, this.f57502e.f57478g);
                return;
            }
        }
        if (this.f57501d == C7049e.b.MATCH_CONSTRAINT) {
            C7049e c7049e3 = this.f57499b;
            int i10 = c7049e3.f55129l;
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
            } else if (i10 == 3) {
                if (c7049e3.f55131m == 3) {
                    this.f57505h.f57472a = this;
                    this.f57506i.f57472a = this;
                    l lVar = c7049e3.f55117f;
                    lVar.f57505h.f57472a = this;
                    lVar.f57506i.f57472a = this;
                    gVar.f57472a = this;
                    if (c7049e3.X()) {
                        this.f57502e.f57483l.add(this.f57499b.f55117f.f57502e);
                        this.f57499b.f55117f.f57502e.f57482k.add(this.f57502e);
                        l lVar2 = this.f57499b.f55117f;
                        lVar2.f57502e.f57472a = this;
                        this.f57502e.f57483l.add(lVar2.f57505h);
                        this.f57502e.f57483l.add(this.f57499b.f55117f.f57506i);
                        this.f57499b.f55117f.f57505h.f57482k.add(this.f57502e);
                        this.f57499b.f55117f.f57506i.f57482k.add(this.f57502e);
                    } else if (this.f57499b.V()) {
                        this.f57499b.f55117f.f57502e.f57483l.add(this.f57502e);
                        this.f57502e.f57482k.add(this.f57499b.f55117f.f57502e);
                    } else {
                        this.f57499b.f55117f.f57502e.f57483l.add(this.f57502e);
                    }
                } else {
                    g gVar4 = c7049e3.f55117f.f57502e;
                    gVar.f57483l.add(gVar4);
                    gVar4.f57482k.add(this.f57502e);
                    this.f57499b.f55117f.f57505h.f57482k.add(this.f57502e);
                    this.f57499b.f55117f.f57506i.f57482k.add(this.f57502e);
                    g gVar5 = this.f57502e;
                    gVar5.f57473b = true;
                    gVar5.f57482k.add(this.f57505h);
                    this.f57502e.f57482k.add(this.f57506i);
                    this.f57505h.f57483l.add(this.f57502e);
                    this.f57506i.f57483l.add(this.f57502e);
                }
            }
        }
        C7049e c7049e4 = this.f57499b;
        C7048d[] c7048dArr2 = c7049e4.f55090J;
        C7048d c7048d4 = c7048dArr2[0];
        C7048d c7048d5 = c7048d4.f55075d;
        if (c7048d5 != null && c7048dArr2[1].f55075d != null) {
            if (c7049e4.V()) {
                this.f57505h.f57477f = this.f57499b.f55090J[0].c();
                this.f57506i.f57477f = -this.f57499b.f55090J[1].c();
                return;
            }
            f fVarH5 = h(this.f57499b.f55090J[0]);
            f fVarH6 = h(this.f57499b.f55090J[1]);
            fVarH5.b(this);
            fVarH6.b(this);
            this.f57507j = m.b.CENTER;
            return;
        }
        if (c7048d5 != null) {
            f fVarH7 = h(c7048d4);
            if (fVarH7 != null) {
                b(this.f57505h, fVarH7, this.f57499b.f55090J[0].c());
                c(this.f57506i, this.f57505h, 1, this.f57502e);
                return;
            }
            return;
        }
        C7048d c7048d6 = c7048dArr2[1];
        if (c7048d6.f55075d != null) {
            f fVarH8 = h(c7048d6);
            if (fVarH8 != null) {
                b(this.f57506i, fVarH8, -this.f57499b.f55090J[1].c());
                c(this.f57505h, this.f57506i, -1, this.f57502e);
                return;
            }
            return;
        }
        if ((c7049e4 instanceof InterfaceC7053i) || c7049e4.G() == null) {
            return;
        }
        b(this.f57505h, this.f57499b.G().f55115e.f57505h, this.f57499b.Q());
        c(this.f57506i, this.f57505h, 1, this.f57502e);
    }

    @Override // p1.m
    public void e() {
        f fVar = this.f57505h;
        if (fVar.f57481j) {
            this.f57499b.F0(fVar.f57478g);
        }
    }

    @Override // p1.m
    void f() {
        this.f57500c = null;
        this.f57505h.c();
        this.f57506i.c();
        this.f57502e.c();
        this.f57504g = false;
    }

    @Override // p1.m
    boolean m() {
        return this.f57501d != C7049e.b.MATCH_CONSTRAINT || this.f57499b.f55129l == 0;
    }

    void r() {
        this.f57504g = false;
        this.f57505h.c();
        this.f57505h.f57481j = false;
        this.f57506i.c();
        this.f57506i.f57481j = false;
        this.f57502e.f57481j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f57499b.r();
    }
}
