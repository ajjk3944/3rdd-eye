package s0;

import r0.C5507d;
import r0.C5508e;
import r0.C5512i;
import s0.p;

/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f45937k;

    /* renamed from: l, reason: collision with root package name */
    public C5542a f45938l;

    /* compiled from: VerticalWidgetRun.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45939a;

        static {
            int[] iArr = new int[p.b.values().length];
            f45939a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45939a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45939a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // s0.p, s0.d
    public final void a(d dVar) {
        float f10;
        float f11;
        float f12;
        int i;
        if (a.f45939a[this.f45954j.ordinal()] == 3) {
            C5508e c5508e = this.f45947b;
            l(c5508e.f45525K, c5508e.f45527M, 1);
            return;
        }
        g gVar = this.f45950e;
        if (gVar.f45922c && !gVar.f45928j && this.f45949d == C5508e.b.MATCH_CONSTRAINT) {
            C5508e c5508e2 = this.f45947b;
            int i10 = c5508e2.f45575s;
            if (i10 == 2) {
                C5508e c5508e3 = c5508e2.f45536V;
                if (c5508e3 != null) {
                    if (c5508e3.f45549e.f45950e.f45928j) {
                        gVar.d((int) ((r1.f45926g * c5508e2.f45582z) + 0.5f));
                    }
                }
            } else if (i10 == 3) {
                g gVar2 = c5508e2.f45547d.f45950e;
                if (gVar2.f45928j) {
                    int i11 = c5508e2.f45540Z;
                    if (i11 == -1) {
                        f10 = gVar2.f45926g;
                        f11 = c5508e2.f45539Y;
                    } else if (i11 == 0) {
                        f12 = gVar2.f45926g * c5508e2.f45539Y;
                        i = (int) (f12 + 0.5f);
                        gVar.d(i);
                    } else if (i11 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f10 = gVar2.f45926g;
                        f11 = c5508e2.f45539Y;
                    }
                    f12 = f10 / f11;
                    i = (int) (f12 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        f fVar = this.f45953h;
        if (fVar.f45922c) {
            f fVar2 = this.i;
            if (fVar2.f45922c) {
                if (fVar.f45928j && fVar2.f45928j && gVar.f45928j) {
                    return;
                }
                if (!gVar.f45928j && this.f45949d == C5508e.b.MATCH_CONSTRAINT) {
                    C5508e c5508e4 = this.f45947b;
                    if (c5508e4.f45574r == 0 && !c5508e4.y()) {
                        f fVar3 = (f) fVar.f45930l.get(0);
                        f fVar4 = (f) fVar2.f45930l.get(0);
                        int i12 = fVar3.f45926g + fVar.f45925f;
                        int i13 = fVar4.f45926g + fVar2.f45925f;
                        fVar.d(i12);
                        fVar2.d(i13);
                        gVar.d(i13 - i12);
                        return;
                    }
                }
                if (!gVar.f45928j && this.f45949d == C5508e.b.MATCH_CONSTRAINT && this.f45946a == 1 && fVar.f45930l.size() > 0 && fVar2.f45930l.size() > 0) {
                    f fVar5 = (f) fVar.f45930l.get(0);
                    int i14 = (((f) fVar2.f45930l.get(0)).f45926g + fVar2.f45925f) - (fVar5.f45926g + fVar.f45925f);
                    int i15 = gVar.f45931m;
                    if (i14 < i15) {
                        gVar.d(i14);
                    } else {
                        gVar.d(i15);
                    }
                }
                if (gVar.f45928j && fVar.f45930l.size() > 0 && fVar2.f45930l.size() > 0) {
                    f fVar6 = (f) fVar.f45930l.get(0);
                    f fVar7 = (f) fVar2.f45930l.get(0);
                    int i16 = fVar6.f45926g;
                    int i17 = fVar.f45925f + i16;
                    int i18 = fVar7.f45926g;
                    int i19 = fVar2.f45925f + i18;
                    float f13 = this.f45947b.f45554g0;
                    if (fVar6 == fVar7) {
                        f13 = 0.5f;
                    } else {
                        i16 = i17;
                        i18 = i19;
                    }
                    fVar.d((int) ((((i18 - i16) - gVar.f45926g) * f13) + i16 + 0.5f));
                    fVar2.d(fVar.f45926g + gVar.f45926g);
                }
            }
        }
    }

    @Override // s0.p
    public final void d() {
        C5508e c5508e;
        C5508e c5508e2;
        C5508e c5508e3;
        C5508e c5508e4;
        C5508e c5508e5 = this.f45947b;
        boolean z10 = c5508e5.f45541a;
        g gVar = this.f45950e;
        if (z10) {
            gVar.d(c5508e5.k());
        }
        boolean z11 = gVar.f45928j;
        f fVar = this.i;
        f fVar2 = this.f45953h;
        if (!z11) {
            C5508e c5508e6 = this.f45947b;
            this.f45949d = c5508e6.f45535U[1];
            if (c5508e6.f45519E) {
                this.f45938l = new C5542a(this);
            }
            C5508e.b bVar = this.f45949d;
            if (bVar != C5508e.b.MATCH_CONSTRAINT) {
                if (bVar == C5508e.b.MATCH_PARENT && (c5508e4 = this.f45947b.f45536V) != null && c5508e4.f45535U[1] == C5508e.b.FIXED) {
                    int iK = (c5508e4.k() - this.f45947b.f45525K.e()) - this.f45947b.f45527M.e();
                    p.b(fVar2, c5508e4.f45549e.f45953h, this.f45947b.f45525K.e());
                    p.b(fVar, c5508e4.f45549e.i, -this.f45947b.f45527M.e());
                    gVar.d(iK);
                    return;
                }
                if (bVar == C5508e.b.FIXED) {
                    gVar.d(this.f45947b.k());
                }
            }
        } else if (this.f45949d == C5508e.b.MATCH_PARENT && (c5508e2 = (c5508e = this.f45947b).f45536V) != null && c5508e2.f45535U[1] == C5508e.b.FIXED) {
            p.b(fVar2, c5508e2.f45549e.f45953h, c5508e.f45525K.e());
            p.b(fVar, c5508e2.f45549e.i, -this.f45947b.f45527M.e());
            return;
        }
        boolean z12 = gVar.f45928j;
        f fVar3 = this.f45937k;
        if (z12) {
            C5508e c5508e7 = this.f45947b;
            if (c5508e7.f45541a) {
                C5507d[] c5507dArr = c5508e7.f45532R;
                C5507d c5507d = c5507dArr[2];
                C5507d c5507d2 = c5507d.f45511f;
                if (c5507d2 != null && c5507dArr[3].f45511f != null) {
                    if (c5508e7.y()) {
                        fVar2.f45925f = this.f45947b.f45532R[2].e();
                        fVar.f45925f = -this.f45947b.f45532R[3].e();
                    } else {
                        f fVarH = p.h(this.f45947b.f45532R[2]);
                        if (fVarH != null) {
                            p.b(fVar2, fVarH, this.f45947b.f45532R[2].e());
                        }
                        f fVarH2 = p.h(this.f45947b.f45532R[3]);
                        if (fVarH2 != null) {
                            p.b(fVar, fVarH2, -this.f45947b.f45532R[3].e());
                        }
                        fVar2.f45921b = true;
                        fVar.f45921b = true;
                    }
                    C5508e c5508e8 = this.f45947b;
                    if (c5508e8.f45519E) {
                        p.b(fVar3, fVar2, c5508e8.f45546c0);
                        return;
                    }
                    return;
                }
                if (c5507d2 != null) {
                    f fVarH3 = p.h(c5507d);
                    if (fVarH3 != null) {
                        p.b(fVar2, fVarH3, this.f45947b.f45532R[2].e());
                        p.b(fVar, fVar2, gVar.f45926g);
                        C5508e c5508e9 = this.f45947b;
                        if (c5508e9.f45519E) {
                            p.b(fVar3, fVar2, c5508e9.f45546c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C5507d c5507d3 = c5507dArr[3];
                if (c5507d3.f45511f != null) {
                    f fVarH4 = p.h(c5507d3);
                    if (fVarH4 != null) {
                        p.b(fVar, fVarH4, -this.f45947b.f45532R[3].e());
                        p.b(fVar2, fVar, -gVar.f45926g);
                    }
                    C5508e c5508e10 = this.f45947b;
                    if (c5508e10.f45519E) {
                        p.b(fVar3, fVar2, c5508e10.f45546c0);
                        return;
                    }
                    return;
                }
                C5507d c5507d4 = c5507dArr[4];
                if (c5507d4.f45511f != null) {
                    f fVarH5 = p.h(c5507d4);
                    if (fVarH5 != null) {
                        p.b(fVar3, fVarH5, 0);
                        p.b(fVar2, fVar3, -this.f45947b.f45546c0);
                        p.b(fVar, fVar2, gVar.f45926g);
                        return;
                    }
                    return;
                }
                if ((c5508e7 instanceof C5512i) || c5508e7.f45536V == null || c5508e7.i(C5507d.b.CENTER).f45511f != null) {
                    return;
                }
                C5508e c5508e11 = this.f45947b;
                p.b(fVar2, c5508e11.f45536V.f45549e.f45953h, c5508e11.s());
                p.b(fVar, fVar2, gVar.f45926g);
                C5508e c5508e12 = this.f45947b;
                if (c5508e12.f45519E) {
                    p.b(fVar3, fVar2, c5508e12.f45546c0);
                    return;
                }
                return;
            }
        }
        if (z12 || this.f45949d != C5508e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            C5508e c5508e13 = this.f45947b;
            int i = c5508e13.f45575s;
            if (i == 2) {
                C5508e c5508e14 = c5508e13.f45536V;
                if (c5508e14 != null) {
                    g gVar2 = c5508e14.f45549e.f45950e;
                    gVar.f45930l.add(gVar2);
                    gVar2.f45929k.add(gVar);
                    gVar.f45921b = true;
                    gVar.f45929k.add(fVar2);
                    gVar.f45929k.add(fVar);
                }
            } else if (i == 3 && !c5508e13.y()) {
                C5508e c5508e15 = this.f45947b;
                if (c5508e15.f45574r != 3) {
                    g gVar3 = c5508e15.f45547d.f45950e;
                    gVar.f45930l.add(gVar3);
                    gVar3.f45929k.add(gVar);
                    gVar.f45921b = true;
                    gVar.f45929k.add(fVar2);
                    gVar.f45929k.add(fVar);
                }
            }
        }
        C5508e c5508e16 = this.f45947b;
        C5507d[] c5507dArr2 = c5508e16.f45532R;
        C5507d c5507d5 = c5507dArr2[2];
        C5507d c5507d6 = c5507d5.f45511f;
        if (c5507d6 != null && c5507dArr2[3].f45511f != null) {
            if (c5508e16.y()) {
                fVar2.f45925f = this.f45947b.f45532R[2].e();
                fVar.f45925f = -this.f45947b.f45532R[3].e();
            } else {
                f fVarH6 = p.h(this.f45947b.f45532R[2]);
                f fVarH7 = p.h(this.f45947b.f45532R[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f45954j = p.b.CENTER;
            }
            if (this.f45947b.f45519E) {
                c(fVar3, fVar2, 1, this.f45938l);
            }
        } else if (c5507d6 != null) {
            f fVarH8 = p.h(c5507d5);
            if (fVarH8 != null) {
                p.b(fVar2, fVarH8, this.f45947b.f45532R[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f45947b.f45519E) {
                    c(fVar3, fVar2, 1, this.f45938l);
                }
                C5508e.b bVar2 = this.f45949d;
                C5508e.b bVar3 = C5508e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3) {
                    C5508e c5508e17 = this.f45947b;
                    if (c5508e17.f45539Y > 0.0f) {
                        l lVar = c5508e17.f45547d;
                        if (lVar.f45949d == bVar3) {
                            lVar.f45950e.f45929k.add(gVar);
                            gVar.f45930l.add(this.f45947b.f45547d.f45950e);
                            gVar.f45920a = this;
                        }
                    }
                }
            }
        } else {
            C5507d c5507d7 = c5507dArr2[3];
            if (c5507d7.f45511f != null) {
                f fVarH9 = p.h(c5507d7);
                if (fVarH9 != null) {
                    p.b(fVar, fVarH9, -this.f45947b.f45532R[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f45947b.f45519E) {
                        c(fVar3, fVar2, 1, this.f45938l);
                    }
                }
            } else {
                C5507d c5507d8 = c5507dArr2[4];
                if (c5507d8.f45511f != null) {
                    f fVarH10 = p.h(c5507d8);
                    if (fVarH10 != null) {
                        p.b(fVar3, fVarH10, 0);
                        c(fVar2, fVar3, -1, this.f45938l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(c5508e16 instanceof C5512i) && (c5508e3 = c5508e16.f45536V) != null) {
                    p.b(fVar2, c5508e3.f45549e.f45953h, c5508e16.s());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f45947b.f45519E) {
                        c(fVar3, fVar2, 1, this.f45938l);
                    }
                    C5508e.b bVar4 = this.f45949d;
                    C5508e.b bVar5 = C5508e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5) {
                        C5508e c5508e18 = this.f45947b;
                        if (c5508e18.f45539Y > 0.0f) {
                            l lVar2 = c5508e18.f45547d;
                            if (lVar2.f45949d == bVar5) {
                                lVar2.f45950e.f45929k.add(gVar);
                                gVar.f45930l.add(this.f45947b.f45547d.f45950e);
                                gVar.f45920a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f45930l.size() == 0) {
            gVar.f45922c = true;
        }
    }

    @Override // s0.p
    public final void e() {
        f fVar = this.f45953h;
        if (fVar.f45928j) {
            this.f45947b.f45544b0 = fVar.f45926g;
        }
    }

    @Override // s0.p
    public final void f() {
        this.f45948c = null;
        this.f45953h.c();
        this.i.c();
        this.f45937k.c();
        this.f45950e.c();
        this.f45952g = false;
    }

    @Override // s0.p
    public final boolean k() {
        return this.f45949d != C5508e.b.MATCH_CONSTRAINT || this.f45947b.f45575s == 0;
    }

    public final void m() {
        this.f45952g = false;
        f fVar = this.f45953h;
        fVar.c();
        fVar.f45928j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f45928j = false;
        f fVar3 = this.f45937k;
        fVar3.c();
        fVar3.f45928j = false;
        this.f45950e.f45928j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f45947b.f45559j0;
    }
}
