package A;

/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f32k = new int[2];

    public static void m(int[] iArr, int i, int i3, int i6, int i7, float f2, int i8) {
        int i9 = i3 - i;
        int i10 = i7 - i6;
        if (i8 != -1) {
            if (i8 == 0) {
                iArr[0] = (int) ((i10 * f2) + 0.5f);
                iArr[1] = i10;
                return;
            } else {
                if (i8 != 1) {
                    return;
                }
                iArr[0] = i9;
                iArr[1] = (int) ((i9 * f2) + 0.5f);
                return;
            }
        }
        int i11 = (int) ((i10 * f2) + 0.5f);
        int i12 = (int) ((i9 / f2) + 0.5f);
        if (i11 <= i9) {
            iArr[0] = i11;
            iArr[1] = i10;
        } else if (i12 <= i10) {
            iArr[0] = i9;
            iArr[1] = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // A.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(A.d r24) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.l.a(A.d):void");
    }

    @Override // A.p
    public final void d() {
        z.d dVar;
        z.d dVar2;
        int i;
        z.d dVar3;
        z.d dVar4;
        int i3;
        z.d dVar5 = this.f44b;
        boolean z6 = dVar5.f24317a;
        h hVar = this.f47e;
        if (z6) {
            hVar.d(dVar5.q());
        }
        boolean z7 = hVar.f27j;
        g gVar = this.i;
        g gVar2 = this.f50h;
        if (!z7) {
            z.d dVar6 = this.f44b;
            int i6 = dVar6.f24346p0[0];
            this.f46d = i6;
            if (i6 != 3) {
                if (i6 == 4 && (dVar4 = dVar6.f24310T) != null && ((i3 = dVar4.f24346p0[0]) == 1 || i3 == 4)) {
                    int iQ = (dVar4.q() - this.f44b.f24300I.e()) - this.f44b.f24302K.e();
                    p.b(gVar2, dVar4.f24322d.f50h, this.f44b.f24300I.e());
                    p.b(gVar, dVar4.f24322d.i, -this.f44b.f24302K.e());
                    hVar.d(iQ);
                    return;
                }
                if (i6 == 1) {
                    hVar.d(dVar6.q());
                }
            }
        } else if (this.f46d == 4 && (dVar2 = (dVar = this.f44b).f24310T) != null && ((i = dVar2.f24346p0[0]) == 1 || i == 4)) {
            p.b(gVar2, dVar2.f24322d.f50h, dVar.f24300I.e());
            p.b(gVar, dVar2.f24322d.i, -this.f44b.f24302K.e());
            return;
        }
        if (hVar.f27j) {
            z.d dVar7 = this.f44b;
            if (dVar7.f24317a) {
                z.c[] cVarArr = dVar7.f24307Q;
                z.c cVar = cVarArr[0];
                z.c cVar2 = cVar.f24289f;
                if (cVar2 != null && cVarArr[1].f24289f != null) {
                    if (dVar7.x()) {
                        gVar2.f24f = this.f44b.f24307Q[0].e();
                        gVar.f24f = -this.f44b.f24307Q[1].e();
                        return;
                    }
                    g gVarH = p.h(this.f44b.f24307Q[0]);
                    if (gVarH != null) {
                        p.b(gVar2, gVarH, this.f44b.f24307Q[0].e());
                    }
                    g gVarH2 = p.h(this.f44b.f24307Q[1]);
                    if (gVarH2 != null) {
                        p.b(gVar, gVarH2, -this.f44b.f24307Q[1].e());
                    }
                    gVar2.f20b = true;
                    gVar.f20b = true;
                    return;
                }
                if (cVar2 != null) {
                    g gVarH3 = p.h(cVar);
                    if (gVarH3 != null) {
                        p.b(gVar2, gVarH3, this.f44b.f24307Q[0].e());
                        p.b(gVar, gVar2, hVar.f25g);
                        return;
                    }
                    return;
                }
                z.c cVar3 = cVarArr[1];
                if (cVar3.f24289f != null) {
                    g gVarH4 = p.h(cVar3);
                    if (gVarH4 != null) {
                        p.b(gVar, gVarH4, -this.f44b.f24307Q[1].e());
                        p.b(gVar2, gVar, -hVar.f25g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof z.i) || dVar7.f24310T == null || dVar7.i(7).f24289f != null) {
                    return;
                }
                z.d dVar8 = this.f44b;
                p.b(gVar2, dVar8.f24310T.f24322d.f50h, dVar8.r());
                p.b(gVar, gVar2, hVar.f25g);
                return;
            }
        }
        if (this.f46d == 3) {
            z.d dVar9 = this.f44b;
            int i7 = dVar9.f24348r;
            if (i7 == 2) {
                z.d dVar10 = dVar9.f24310T;
                if (dVar10 != null) {
                    h hVar2 = dVar10.f24324e.f47e;
                    hVar.f29l.add(hVar2);
                    hVar2.f28k.add(hVar);
                    hVar.f20b = true;
                    hVar.f28k.add(gVar2);
                    hVar.f28k.add(gVar);
                }
            } else if (i7 == 3) {
                if (dVar9.f24349s == 3) {
                    gVar2.f19a = this;
                    gVar.f19a = this;
                    n nVar = dVar9.f24324e;
                    nVar.f50h.f19a = this;
                    nVar.i.f19a = this;
                    hVar.f19a = this;
                    if (dVar9.y()) {
                        hVar.f29l.add(this.f44b.f24324e.f47e);
                        this.f44b.f24324e.f47e.f28k.add(hVar);
                        n nVar2 = this.f44b.f24324e;
                        nVar2.f47e.f19a = this;
                        hVar.f29l.add(nVar2.f50h);
                        hVar.f29l.add(this.f44b.f24324e.i);
                        this.f44b.f24324e.f50h.f28k.add(hVar);
                        this.f44b.f24324e.i.f28k.add(hVar);
                    } else if (this.f44b.x()) {
                        this.f44b.f24324e.f47e.f29l.add(hVar);
                        hVar.f28k.add(this.f44b.f24324e.f47e);
                    } else {
                        this.f44b.f24324e.f47e.f29l.add(hVar);
                    }
                } else {
                    h hVar3 = dVar9.f24324e.f47e;
                    hVar.f29l.add(hVar3);
                    hVar3.f28k.add(hVar);
                    this.f44b.f24324e.f50h.f28k.add(hVar);
                    this.f44b.f24324e.i.f28k.add(hVar);
                    hVar.f20b = true;
                    hVar.f28k.add(gVar2);
                    hVar.f28k.add(gVar);
                    gVar2.f29l.add(hVar);
                    gVar.f29l.add(hVar);
                }
            }
        }
        z.d dVar11 = this.f44b;
        z.c[] cVarArr2 = dVar11.f24307Q;
        z.c cVar4 = cVarArr2[0];
        z.c cVar5 = cVar4.f24289f;
        if (cVar5 != null && cVarArr2[1].f24289f != null) {
            if (dVar11.x()) {
                gVar2.f24f = this.f44b.f24307Q[0].e();
                gVar.f24f = -this.f44b.f24307Q[1].e();
                return;
            }
            g gVarH5 = p.h(this.f44b.f24307Q[0]);
            g gVarH6 = p.h(this.f44b.f24307Q[1]);
            if (gVarH5 != null) {
                gVarH5.b(this);
            }
            if (gVarH6 != null) {
                gVarH6.b(this);
            }
            this.f51j = 4;
            return;
        }
        if (cVar5 != null) {
            g gVarH7 = p.h(cVar4);
            if (gVarH7 != null) {
                p.b(gVar2, gVarH7, this.f44b.f24307Q[0].e());
                c(gVar, gVar2, 1, hVar);
                return;
            }
            return;
        }
        z.c cVar6 = cVarArr2[1];
        if (cVar6.f24289f != null) {
            g gVarH8 = p.h(cVar6);
            if (gVarH8 != null) {
                p.b(gVar, gVarH8, -this.f44b.f24307Q[1].e());
                c(gVar2, gVar, -1, hVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof z.i) || (dVar3 = dVar11.f24310T) == null) {
            return;
        }
        p.b(gVar2, dVar3.f24322d.f50h, dVar11.r());
        c(gVar, gVar2, 1, hVar);
    }

    @Override // A.p
    public final void e() {
        g gVar = this.f50h;
        if (gVar.f27j) {
            this.f44b.f24315Y = gVar.f25g;
        }
    }

    @Override // A.p
    public final void f() {
        this.f45c = null;
        this.f50h.c();
        this.i.c();
        this.f47e.c();
        this.f49g = false;
    }

    @Override // A.p
    public final boolean k() {
        return this.f46d != 3 || this.f44b.f24348r == 0;
    }

    public final void n() {
        this.f49g = false;
        g gVar = this.f50h;
        gVar.c();
        gVar.f27j = false;
        g gVar2 = this.i;
        gVar2.c();
        gVar2.f27j = false;
        this.f47e.f27j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f44b.f24331h0;
    }
}
