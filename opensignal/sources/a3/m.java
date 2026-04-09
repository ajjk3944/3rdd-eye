package a3;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m extends t {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
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

    /* JADX WARN: Removed duplicated region for block: B:115:0x0262  */
    @Override // a3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(a3.d r23) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.m.a(a3.d):void");
    }

    @Override // a3.t
    public final void d() {
        z2.g gVar;
        z2.g gVar2;
        z2.f fVar;
        z2.g gVar3;
        z2.g gVar4;
        z2.f fVar2;
        z2.g gVar5 = this.f76b;
        boolean z10 = gVar5.f26536a;
        h hVar = this.f79e;
        if (z10) {
            hVar.d(gVar5.q());
        }
        boolean z11 = hVar.j;
        ArrayList arrayList = hVar.k;
        ArrayList arrayList2 = hVar.f60l;
        g gVar6 = this.f83i;
        g gVar7 = this.f82h;
        if (z11) {
            z2.f fVar3 = this.f78d;
            z2.f fVar4 = z2.f.MATCH_PARENT;
            if (fVar3 == fVar4 && (gVar2 = (gVar = this.f76b).U) != null && ((fVar = gVar2.T[0]) == z2.f.FIXED || fVar == fVar4)) {
                t.b(gVar7, gVar2.f26542d.f82h, gVar.I.e());
                t.b(gVar6, gVar2.f26542d.f83i, -this.f76b.K.e());
                return;
            }
        } else {
            z2.g gVar8 = this.f76b;
            z2.f fVar5 = gVar8.T[0];
            this.f78d = fVar5;
            if (fVar5 != z2.f.MATCH_CONSTRAINT) {
                z2.f fVar6 = z2.f.MATCH_PARENT;
                if (fVar5 == fVar6 && (gVar4 = gVar8.U) != null && ((fVar2 = gVar4.T[0]) == z2.f.FIXED || fVar2 == fVar6)) {
                    int iQ = (gVar4.q() - this.f76b.I.e()) - this.f76b.K.e();
                    t.b(gVar7, gVar4.f26542d.f82h, this.f76b.I.e());
                    t.b(gVar6, gVar4.f26542d.f83i, -this.f76b.K.e());
                    hVar.d(iQ);
                    return;
                }
                if (fVar5 == z2.f.FIXED) {
                    hVar.d(gVar8.q());
                }
            }
        }
        if (hVar.j) {
            z2.g gVar9 = this.f76b;
            if (gVar9.f26536a) {
                z2.d[] dVarArr = gVar9.Q;
                z2.d dVar = dVarArr[0];
                z2.d dVar2 = dVar.f26531f;
                if (dVar2 != null && dVarArr[1].f26531f != null) {
                    if (gVar9.x()) {
                        gVar7.f56f = this.f76b.Q[0].e();
                        gVar6.f56f = -this.f76b.Q[1].e();
                        return;
                    }
                    g gVarH = t.h(this.f76b.Q[0]);
                    if (gVarH != null) {
                        t.b(gVar7, gVarH, this.f76b.Q[0].e());
                    }
                    g gVarH2 = t.h(this.f76b.Q[1]);
                    if (gVarH2 != null) {
                        t.b(gVar6, gVarH2, -this.f76b.Q[1].e());
                    }
                    gVar7.f52b = true;
                    gVar6.f52b = true;
                    return;
                }
                if (dVar2 != null) {
                    g gVarH3 = t.h(dVar);
                    if (gVarH3 != null) {
                        t.b(gVar7, gVarH3, this.f76b.Q[0].e());
                        t.b(gVar6, gVar7, hVar.f57g);
                        return;
                    }
                    return;
                }
                z2.d dVar3 = dVarArr[1];
                if (dVar3.f26531f != null) {
                    g gVarH4 = t.h(dVar3);
                    if (gVarH4 != null) {
                        t.b(gVar6, gVarH4, -this.f76b.Q[1].e());
                        t.b(gVar7, gVar6, -hVar.f57g);
                        return;
                    }
                    return;
                }
                if ((gVar9 instanceof z2.m) || gVar9.U == null || gVar9.i(z2.c.CENTER).f26531f != null) {
                    return;
                }
                z2.g gVar10 = this.f76b;
                t.b(gVar7, gVar10.U.f26542d.f82h, gVar10.r());
                t.b(gVar6, gVar7, hVar.f57g);
                return;
            }
        }
        if (this.f78d == z2.f.MATCH_CONSTRAINT) {
            z2.g gVar11 = this.f76b;
            int i10 = gVar11.f26567r;
            if (i10 == 2) {
                z2.g gVar12 = gVar11.U;
                if (gVar12 != null) {
                    h hVar2 = gVar12.f26544e.f79e;
                    arrayList2.add(hVar2);
                    hVar2.k.add(hVar);
                    hVar.f52b = true;
                    arrayList.add(gVar7);
                    arrayList.add(gVar6);
                }
            } else if (i10 == 3) {
                if (gVar11.f26568s == 3) {
                    gVar7.f51a = this;
                    gVar6.f51a = this;
                    p pVar = gVar11.f26544e;
                    pVar.f82h.f51a = this;
                    pVar.f83i.f51a = this;
                    hVar.f51a = this;
                    if (gVar11.y()) {
                        arrayList2.add(this.f76b.f26544e.f79e);
                        this.f76b.f26544e.f79e.k.add(hVar);
                        p pVar2 = this.f76b.f26544e;
                        pVar2.f79e.f51a = this;
                        arrayList2.add(pVar2.f82h);
                        arrayList2.add(this.f76b.f26544e.f83i);
                        this.f76b.f26544e.f82h.k.add(hVar);
                        this.f76b.f26544e.f83i.k.add(hVar);
                    } else if (this.f76b.x()) {
                        this.f76b.f26544e.f79e.f60l.add(hVar);
                        arrayList.add(this.f76b.f26544e.f79e);
                    } else {
                        this.f76b.f26544e.f79e.f60l.add(hVar);
                    }
                } else {
                    h hVar3 = gVar11.f26544e.f79e;
                    arrayList2.add(hVar3);
                    hVar3.k.add(hVar);
                    this.f76b.f26544e.f82h.k.add(hVar);
                    this.f76b.f26544e.f83i.k.add(hVar);
                    hVar.f52b = true;
                    arrayList.add(gVar7);
                    arrayList.add(gVar6);
                    gVar7.f60l.add(hVar);
                    gVar6.f60l.add(hVar);
                }
            }
        }
        z2.g gVar13 = this.f76b;
        z2.d[] dVarArr2 = gVar13.Q;
        z2.d dVar4 = dVarArr2[0];
        z2.d dVar5 = dVar4.f26531f;
        if (dVar5 != null && dVarArr2[1].f26531f != null) {
            if (gVar13.x()) {
                gVar7.f56f = this.f76b.Q[0].e();
                gVar6.f56f = -this.f76b.Q[1].e();
                return;
            }
            g gVarH5 = t.h(this.f76b.Q[0]);
            g gVarH6 = t.h(this.f76b.Q[1]);
            if (gVarH5 != null) {
                gVarH5.b(this);
            }
            if (gVarH6 != null) {
                gVarH6.b(this);
            }
            this.j = s.CENTER;
            return;
        }
        if (dVar5 != null) {
            g gVarH7 = t.h(dVar4);
            if (gVarH7 != null) {
                t.b(gVar7, gVarH7, this.f76b.Q[0].e());
                c(gVar6, gVar7, 1, hVar);
                return;
            }
            return;
        }
        z2.d dVar6 = dVarArr2[1];
        if (dVar6.f26531f != null) {
            g gVarH8 = t.h(dVar6);
            if (gVarH8 != null) {
                t.b(gVar6, gVarH8, -this.f76b.Q[1].e());
                c(gVar7, gVar6, -1, hVar);
                return;
            }
            return;
        }
        if ((gVar13 instanceof z2.m) || (gVar3 = gVar13.U) == null) {
            return;
        }
        t.b(gVar7, gVar3.f26542d.f82h, gVar13.r());
        c(gVar6, gVar7, 1, hVar);
    }

    @Override // a3.t
    public final void e() {
        g gVar = this.f82h;
        if (gVar.j) {
            this.f76b.Z = gVar.f57g;
        }
    }

    @Override // a3.t
    public final void f() {
        this.f77c = null;
        this.f82h.c();
        this.f83i.c();
        this.f79e.c();
        this.f81g = false;
    }

    @Override // a3.t
    public final boolean k() {
        return this.f78d != z2.f.MATCH_CONSTRAINT || this.f76b.f26567r == 0;
    }

    public final void n() {
        this.f81g = false;
        g gVar = this.f82h;
        gVar.c();
        gVar.j = false;
        g gVar2 = this.f83i;
        gVar2.c();
        gVar2.j = false;
        this.f79e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f76b.f26553i0;
    }
}
