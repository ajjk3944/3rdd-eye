package s0;

import r0.C5507d;
import r0.C5508e;
import r0.C5512i;
import s0.p;

/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f45933k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45934a;

        static {
            int[] iArr = new int[p.b.values().length];
            f45934a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45934a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45934a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void m(int[] iArr, int i, int i10, int i11, int i12, float f10, int i13) {
        int i14 = i10 - i;
        int i15 = i12 - i11;
        if (i13 != -1) {
            if (i13 == 0) {
                iArr[0] = (int) ((i15 * f10) + 0.5f);
                iArr[1] = i15;
                return;
            } else {
                if (i13 != 1) {
                    return;
                }
                iArr[0] = i14;
                iArr[1] = (int) ((i14 * f10) + 0.5f);
                return;
            }
        }
        int i16 = (int) ((i15 * f10) + 0.5f);
        int i17 = (int) ((i14 / f10) + 0.5f);
        if (i16 <= i14) {
            iArr[0] = i16;
            iArr[1] = i15;
        } else if (i17 <= i15) {
            iArr[0] = i14;
            iArr[1] = i17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0262  */
    @Override // s0.p, s0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(s0.d r23) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.l.a(s0.d):void");
    }

    @Override // s0.p
    public final void d() {
        C5508e c5508e;
        C5508e c5508e2;
        C5508e.b bVar;
        C5508e c5508e3;
        C5508e c5508e4;
        C5508e.b bVar2;
        C5508e c5508e5 = this.f45947b;
        boolean z10 = c5508e5.f45541a;
        g gVar = this.f45950e;
        if (z10) {
            gVar.d(c5508e5.q());
        }
        boolean z11 = gVar.f45928j;
        f fVar = this.i;
        f fVar2 = this.f45953h;
        if (z11) {
            C5508e.b bVar3 = this.f45949d;
            C5508e.b bVar4 = C5508e.b.MATCH_PARENT;
            if (bVar3 == bVar4 && (c5508e2 = (c5508e = this.f45947b).f45536V) != null && ((bVar = c5508e2.f45535U[0]) == C5508e.b.FIXED || bVar == bVar4)) {
                p.b(fVar2, c5508e2.f45547d.f45953h, c5508e.f45524J.e());
                p.b(fVar, c5508e2.f45547d.i, -this.f45947b.f45526L.e());
                return;
            }
        } else {
            C5508e c5508e6 = this.f45947b;
            C5508e.b bVar5 = c5508e6.f45535U[0];
            this.f45949d = bVar5;
            if (bVar5 != C5508e.b.MATCH_CONSTRAINT) {
                C5508e.b bVar6 = C5508e.b.MATCH_PARENT;
                if (bVar5 == bVar6 && (c5508e4 = c5508e6.f45536V) != null && ((bVar2 = c5508e4.f45535U[0]) == C5508e.b.FIXED || bVar2 == bVar6)) {
                    int iQ = (c5508e4.q() - this.f45947b.f45524J.e()) - this.f45947b.f45526L.e();
                    p.b(fVar2, c5508e4.f45547d.f45953h, this.f45947b.f45524J.e());
                    p.b(fVar, c5508e4.f45547d.i, -this.f45947b.f45526L.e());
                    gVar.d(iQ);
                    return;
                }
                if (bVar5 == C5508e.b.FIXED) {
                    gVar.d(c5508e6.q());
                }
            }
        }
        if (gVar.f45928j) {
            C5508e c5508e7 = this.f45947b;
            if (c5508e7.f45541a) {
                C5507d[] c5507dArr = c5508e7.f45532R;
                C5507d c5507d = c5507dArr[0];
                C5507d c5507d2 = c5507d.f45511f;
                if (c5507d2 != null && c5507dArr[1].f45511f != null) {
                    if (c5508e7.x()) {
                        fVar2.f45925f = this.f45947b.f45532R[0].e();
                        fVar.f45925f = -this.f45947b.f45532R[1].e();
                        return;
                    }
                    f fVarH = p.h(this.f45947b.f45532R[0]);
                    if (fVarH != null) {
                        p.b(fVar2, fVarH, this.f45947b.f45532R[0].e());
                    }
                    f fVarH2 = p.h(this.f45947b.f45532R[1]);
                    if (fVarH2 != null) {
                        p.b(fVar, fVarH2, -this.f45947b.f45532R[1].e());
                    }
                    fVar2.f45921b = true;
                    fVar.f45921b = true;
                    return;
                }
                if (c5507d2 != null) {
                    f fVarH3 = p.h(c5507d);
                    if (fVarH3 != null) {
                        p.b(fVar2, fVarH3, this.f45947b.f45532R[0].e());
                        p.b(fVar, fVar2, gVar.f45926g);
                        return;
                    }
                    return;
                }
                C5507d c5507d3 = c5507dArr[1];
                if (c5507d3.f45511f != null) {
                    f fVarH4 = p.h(c5507d3);
                    if (fVarH4 != null) {
                        p.b(fVar, fVarH4, -this.f45947b.f45532R[1].e());
                        p.b(fVar2, fVar, -gVar.f45926g);
                        return;
                    }
                    return;
                }
                if ((c5508e7 instanceof C5512i) || c5508e7.f45536V == null || c5508e7.i(C5507d.b.CENTER).f45511f != null) {
                    return;
                }
                C5508e c5508e8 = this.f45947b;
                p.b(fVar2, c5508e8.f45536V.f45547d.f45953h, c5508e8.r());
                p.b(fVar, fVar2, gVar.f45926g);
                return;
            }
        }
        if (this.f45949d == C5508e.b.MATCH_CONSTRAINT) {
            C5508e c5508e9 = this.f45947b;
            int i = c5508e9.f45574r;
            if (i == 2) {
                C5508e c5508e10 = c5508e9.f45536V;
                if (c5508e10 != null) {
                    g gVar2 = c5508e10.f45549e.f45950e;
                    gVar.f45930l.add(gVar2);
                    gVar2.f45929k.add(gVar);
                    gVar.f45921b = true;
                    gVar.f45929k.add(fVar2);
                    gVar.f45929k.add(fVar);
                }
            } else if (i == 3) {
                if (c5508e9.f45575s == 3) {
                    fVar2.f45920a = this;
                    fVar.f45920a = this;
                    n nVar = c5508e9.f45549e;
                    nVar.f45953h.f45920a = this;
                    nVar.i.f45920a = this;
                    gVar.f45920a = this;
                    if (c5508e9.y()) {
                        gVar.f45930l.add(this.f45947b.f45549e.f45950e);
                        this.f45947b.f45549e.f45950e.f45929k.add(gVar);
                        n nVar2 = this.f45947b.f45549e;
                        nVar2.f45950e.f45920a = this;
                        gVar.f45930l.add(nVar2.f45953h);
                        gVar.f45930l.add(this.f45947b.f45549e.i);
                        this.f45947b.f45549e.f45953h.f45929k.add(gVar);
                        this.f45947b.f45549e.i.f45929k.add(gVar);
                    } else if (this.f45947b.x()) {
                        this.f45947b.f45549e.f45950e.f45930l.add(gVar);
                        gVar.f45929k.add(this.f45947b.f45549e.f45950e);
                    } else {
                        this.f45947b.f45549e.f45950e.f45930l.add(gVar);
                    }
                } else {
                    g gVar3 = c5508e9.f45549e.f45950e;
                    gVar.f45930l.add(gVar3);
                    gVar3.f45929k.add(gVar);
                    this.f45947b.f45549e.f45953h.f45929k.add(gVar);
                    this.f45947b.f45549e.i.f45929k.add(gVar);
                    gVar.f45921b = true;
                    gVar.f45929k.add(fVar2);
                    gVar.f45929k.add(fVar);
                    fVar2.f45930l.add(gVar);
                    fVar.f45930l.add(gVar);
                }
            }
        }
        C5508e c5508e11 = this.f45947b;
        C5507d[] c5507dArr2 = c5508e11.f45532R;
        C5507d c5507d4 = c5507dArr2[0];
        C5507d c5507d5 = c5507d4.f45511f;
        if (c5507d5 != null && c5507dArr2[1].f45511f != null) {
            if (c5508e11.x()) {
                fVar2.f45925f = this.f45947b.f45532R[0].e();
                fVar.f45925f = -this.f45947b.f45532R[1].e();
                return;
            }
            f fVarH5 = p.h(this.f45947b.f45532R[0]);
            f fVarH6 = p.h(this.f45947b.f45532R[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f45954j = p.b.CENTER;
            return;
        }
        if (c5507d5 != null) {
            f fVarH7 = p.h(c5507d4);
            if (fVarH7 != null) {
                p.b(fVar2, fVarH7, this.f45947b.f45532R[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        C5507d c5507d6 = c5507dArr2[1];
        if (c5507d6.f45511f != null) {
            f fVarH8 = p.h(c5507d6);
            if (fVarH8 != null) {
                p.b(fVar, fVarH8, -this.f45947b.f45532R[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((c5508e11 instanceof C5512i) || (c5508e3 = c5508e11.f45536V) == null) {
            return;
        }
        p.b(fVar2, c5508e3.f45547d.f45953h, c5508e11.r());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // s0.p
    public final void e() {
        f fVar = this.f45953h;
        if (fVar.f45928j) {
            this.f45947b.f45542a0 = fVar.f45926g;
        }
    }

    @Override // s0.p
    public final void f() {
        this.f45948c = null;
        this.f45953h.c();
        this.i.c();
        this.f45950e.c();
        this.f45952g = false;
    }

    @Override // s0.p
    public final boolean k() {
        return this.f45949d != C5508e.b.MATCH_CONSTRAINT || this.f45947b.f45574r == 0;
    }

    public final void n() {
        this.f45952g = false;
        f fVar = this.f45953h;
        fVar.c();
        fVar.f45928j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f45928j = false;
        this.f45950e.f45928j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f45947b.f45559j0;
    }
}
