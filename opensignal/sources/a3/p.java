package a3;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p extends t {
    public g k;

    /* renamed from: l, reason: collision with root package name */
    public a f67l;

    @Override // a3.d
    public final void a(d dVar) {
        float f10;
        float f11;
        float f12;
        int i10;
        if (o.f66a[this.j.ordinal()] == 3) {
            z2.g gVar = this.f76b;
            l(gVar.J, gVar.L, 1);
            return;
        }
        h hVar = this.f79e;
        if (hVar.f53c && !hVar.j && this.f78d == z2.f.MATCH_CONSTRAINT) {
            z2.g gVar2 = this.f76b;
            int i11 = gVar2.f26568s;
            if (i11 == 2) {
                z2.g gVar3 = gVar2.U;
                if (gVar3 != null) {
                    if (gVar3.f26544e.f79e.j) {
                        hVar.d((int) ((r1.f57g * gVar2.f26575z) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                h hVar2 = gVar2.f26542d.f79e;
                if (hVar2.j) {
                    int i12 = gVar2.Y;
                    if (i12 == -1) {
                        f10 = hVar2.f57g;
                        f11 = gVar2.X;
                    } else if (i12 == 0) {
                        f12 = hVar2.f57g * gVar2.X;
                        i10 = (int) (f12 + 0.5f);
                        hVar.d(i10);
                    } else if (i12 != 1) {
                        i10 = 0;
                        hVar.d(i10);
                    } else {
                        f10 = hVar2.f57g;
                        f11 = gVar2.X;
                    }
                    f12 = f10 / f11;
                    i10 = (int) (f12 + 0.5f);
                    hVar.d(i10);
                }
            }
        }
        g gVar4 = this.f82h;
        boolean z10 = gVar4.f53c;
        ArrayList arrayList = gVar4.f60l;
        if (z10) {
            g gVar5 = this.f83i;
            boolean z11 = gVar5.f53c;
            ArrayList arrayList2 = gVar5.f60l;
            if (z11) {
                if (gVar4.j && gVar5.j && hVar.j) {
                    return;
                }
                if (!hVar.j && this.f78d == z2.f.MATCH_CONSTRAINT) {
                    z2.g gVar6 = this.f76b;
                    if (gVar6.f26567r == 0 && !gVar6.y()) {
                        g gVar7 = (g) arrayList.get(0);
                        g gVar8 = (g) arrayList2.get(0);
                        int i13 = gVar7.f57g + gVar4.f56f;
                        int i14 = gVar8.f57g + gVar5.f56f;
                        gVar4.d(i13);
                        gVar5.d(i14);
                        hVar.d(i14 - i13);
                        return;
                    }
                }
                if (!hVar.j && this.f78d == z2.f.MATCH_CONSTRAINT && this.f75a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    g gVar9 = (g) arrayList.get(0);
                    int i15 = (((g) arrayList2.get(0)).f57g + gVar5.f56f) - (gVar9.f57g + gVar4.f56f);
                    int i16 = hVar.f61m;
                    if (i15 < i16) {
                        hVar.d(i15);
                    } else {
                        hVar.d(i16);
                    }
                }
                if (hVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    g gVar10 = (g) arrayList.get(0);
                    g gVar11 = (g) arrayList2.get(0);
                    int i17 = gVar10.f57g;
                    int i18 = gVar4.f56f + i17;
                    int i19 = gVar11.f57g;
                    int i20 = gVar5.f56f + i19;
                    float f13 = this.f76b.f26547f0;
                    if (gVar10 == gVar11) {
                        f13 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    gVar4.d((int) ((((i19 - i17) - hVar.f57g) * f13) + i17 + 0.5f));
                    gVar5.d(gVar4.f57g + hVar.f57g);
                }
            }
        }
    }

    @Override // a3.t
    public final void d() {
        z2.g gVar;
        z2.g gVar2;
        z2.g gVar3;
        z2.g gVar4;
        g gVar5 = this.k;
        z2.g gVar6 = this.f76b;
        boolean z10 = gVar6.f26536a;
        h hVar = this.f79e;
        if (z10) {
            hVar.d(gVar6.k());
        }
        boolean z11 = hVar.j;
        ArrayList arrayList = hVar.k;
        ArrayList arrayList2 = hVar.f60l;
        g gVar7 = this.f83i;
        g gVar8 = this.f82h;
        if (!z11) {
            z2.g gVar9 = this.f76b;
            this.f78d = gVar9.T[1];
            if (gVar9.E) {
                this.f67l = new a(this);
            }
            z2.f fVar = this.f78d;
            if (fVar != z2.f.MATCH_CONSTRAINT) {
                if (fVar == z2.f.MATCH_PARENT && (gVar4 = this.f76b.U) != null && gVar4.T[1] == z2.f.FIXED) {
                    int iK = (gVar4.k() - this.f76b.J.e()) - this.f76b.L.e();
                    t.b(gVar8, gVar4.f26544e.f82h, this.f76b.J.e());
                    t.b(gVar7, gVar4.f26544e.f83i, -this.f76b.L.e());
                    hVar.d(iK);
                    return;
                }
                if (fVar == z2.f.FIXED) {
                    hVar.d(this.f76b.k());
                }
            }
        } else if (this.f78d == z2.f.MATCH_PARENT && (gVar2 = (gVar = this.f76b).U) != null && gVar2.T[1] == z2.f.FIXED) {
            t.b(gVar8, gVar2.f26544e.f82h, gVar.J.e());
            t.b(gVar7, gVar2.f26544e.f83i, -this.f76b.L.e());
            return;
        }
        boolean z12 = hVar.j;
        if (z12) {
            z2.g gVar10 = this.f76b;
            if (gVar10.f26536a) {
                z2.d[] dVarArr = gVar10.Q;
                z2.d dVar = dVarArr[2];
                z2.d dVar2 = dVar.f26531f;
                if (dVar2 != null && dVarArr[3].f26531f != null) {
                    if (gVar10.y()) {
                        gVar8.f56f = this.f76b.Q[2].e();
                        gVar7.f56f = -this.f76b.Q[3].e();
                    } else {
                        g gVarH = t.h(this.f76b.Q[2]);
                        if (gVarH != null) {
                            t.b(gVar8, gVarH, this.f76b.Q[2].e());
                        }
                        g gVarH2 = t.h(this.f76b.Q[3]);
                        if (gVarH2 != null) {
                            t.b(gVar7, gVarH2, -this.f76b.Q[3].e());
                        }
                        gVar8.f52b = true;
                        gVar7.f52b = true;
                    }
                    z2.g gVar11 = this.f76b;
                    if (gVar11.E) {
                        t.b(gVar5, gVar8, gVar11.f26539b0);
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    g gVarH3 = t.h(dVar);
                    if (gVarH3 != null) {
                        t.b(gVar8, gVarH3, this.f76b.Q[2].e());
                        t.b(gVar7, gVar8, hVar.f57g);
                        z2.g gVar12 = this.f76b;
                        if (gVar12.E) {
                            t.b(gVar5, gVar8, gVar12.f26539b0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                z2.d dVar3 = dVarArr[3];
                if (dVar3.f26531f != null) {
                    g gVarH4 = t.h(dVar3);
                    if (gVarH4 != null) {
                        t.b(gVar7, gVarH4, -this.f76b.Q[3].e());
                        t.b(gVar8, gVar7, -hVar.f57g);
                    }
                    z2.g gVar13 = this.f76b;
                    if (gVar13.E) {
                        t.b(gVar5, gVar8, gVar13.f26539b0);
                        return;
                    }
                    return;
                }
                z2.d dVar4 = dVarArr[4];
                if (dVar4.f26531f != null) {
                    g gVarH5 = t.h(dVar4);
                    if (gVarH5 != null) {
                        t.b(gVar5, gVarH5, 0);
                        t.b(gVar8, gVar5, -this.f76b.f26539b0);
                        t.b(gVar7, gVar8, hVar.f57g);
                        return;
                    }
                    return;
                }
                if ((gVar10 instanceof z2.m) || gVar10.U == null || gVar10.i(z2.c.CENTER).f26531f != null) {
                    return;
                }
                z2.g gVar14 = this.f76b;
                t.b(gVar8, gVar14.U.f26544e.f82h, gVar14.s());
                t.b(gVar7, gVar8, hVar.f57g);
                z2.g gVar15 = this.f76b;
                if (gVar15.E) {
                    t.b(gVar5, gVar8, gVar15.f26539b0);
                    return;
                }
                return;
            }
        }
        if (z12 || this.f78d != z2.f.MATCH_CONSTRAINT) {
            hVar.b(this);
        } else {
            z2.g gVar16 = this.f76b;
            int i10 = gVar16.f26568s;
            if (i10 == 2) {
                z2.g gVar17 = gVar16.U;
                if (gVar17 != null) {
                    h hVar2 = gVar17.f26544e.f79e;
                    arrayList2.add(hVar2);
                    hVar2.k.add(hVar);
                    hVar.f52b = true;
                    arrayList.add(gVar8);
                    arrayList.add(gVar7);
                }
            } else if (i10 == 3 && !gVar16.y()) {
                z2.g gVar18 = this.f76b;
                if (gVar18.f26567r != 3) {
                    h hVar3 = gVar18.f26542d.f79e;
                    arrayList2.add(hVar3);
                    hVar3.k.add(hVar);
                    hVar.f52b = true;
                    arrayList.add(gVar8);
                    arrayList.add(gVar7);
                }
            }
        }
        z2.g gVar19 = this.f76b;
        z2.d[] dVarArr2 = gVar19.Q;
        z2.d dVar5 = dVarArr2[2];
        z2.d dVar6 = dVar5.f26531f;
        if (dVar6 != null && dVarArr2[3].f26531f != null) {
            if (gVar19.y()) {
                gVar8.f56f = this.f76b.Q[2].e();
                gVar7.f56f = -this.f76b.Q[3].e();
            } else {
                g gVarH6 = t.h(this.f76b.Q[2]);
                g gVarH7 = t.h(this.f76b.Q[3]);
                if (gVarH6 != null) {
                    gVarH6.b(this);
                }
                if (gVarH7 != null) {
                    gVarH7.b(this);
                }
                this.j = s.CENTER;
            }
            if (this.f76b.E) {
                c(gVar5, gVar8, 1, this.f67l);
            }
        } else if (dVar6 != null) {
            g gVarH8 = t.h(dVar5);
            if (gVarH8 != null) {
                t.b(gVar8, gVarH8, this.f76b.Q[2].e());
                c(gVar7, gVar8, 1, hVar);
                if (this.f76b.E) {
                    c(gVar5, gVar8, 1, this.f67l);
                }
                z2.f fVar2 = this.f78d;
                z2.f fVar3 = z2.f.MATCH_CONSTRAINT;
                if (fVar2 == fVar3) {
                    z2.g gVar20 = this.f76b;
                    if (gVar20.X > 0.0f) {
                        m mVar = gVar20.f26542d;
                        if (mVar.f78d == fVar3) {
                            mVar.f79e.k.add(hVar);
                            arrayList2.add(this.f76b.f26542d.f79e);
                            hVar.f51a = this;
                        }
                    }
                }
            }
        } else {
            z2.d dVar7 = dVarArr2[3];
            if (dVar7.f26531f != null) {
                g gVarH9 = t.h(dVar7);
                if (gVarH9 != null) {
                    t.b(gVar7, gVarH9, -this.f76b.Q[3].e());
                    c(gVar8, gVar7, -1, hVar);
                    if (this.f76b.E) {
                        c(gVar5, gVar8, 1, this.f67l);
                    }
                }
            } else {
                z2.d dVar8 = dVarArr2[4];
                if (dVar8.f26531f != null) {
                    g gVarH10 = t.h(dVar8);
                    if (gVarH10 != null) {
                        t.b(gVar5, gVarH10, 0);
                        c(gVar8, gVar5, -1, this.f67l);
                        c(gVar7, gVar8, 1, hVar);
                    }
                } else if (!(gVar19 instanceof z2.m) && (gVar3 = gVar19.U) != null) {
                    t.b(gVar8, gVar3.f26544e.f82h, gVar19.s());
                    c(gVar7, gVar8, 1, hVar);
                    if (this.f76b.E) {
                        c(gVar5, gVar8, 1, this.f67l);
                    }
                    z2.f fVar4 = this.f78d;
                    z2.f fVar5 = z2.f.MATCH_CONSTRAINT;
                    if (fVar4 == fVar5) {
                        z2.g gVar21 = this.f76b;
                        if (gVar21.X > 0.0f) {
                            m mVar2 = gVar21.f26542d;
                            if (mVar2.f78d == fVar5) {
                                mVar2.f79e.k.add(hVar);
                                arrayList2.add(this.f76b.f26542d.f79e);
                                hVar.f51a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            hVar.f53c = true;
        }
    }

    @Override // a3.t
    public final void e() {
        g gVar = this.f82h;
        if (gVar.j) {
            this.f76b.f26537a0 = gVar.f57g;
        }
    }

    @Override // a3.t
    public final void f() {
        this.f77c = null;
        this.f82h.c();
        this.f83i.c();
        this.k.c();
        this.f79e.c();
        this.f81g = false;
    }

    @Override // a3.t
    public final boolean k() {
        return this.f78d != z2.f.MATCH_CONSTRAINT || this.f76b.f26568s == 0;
    }

    public final void m() {
        this.f81g = false;
        g gVar = this.f82h;
        gVar.c();
        gVar.j = false;
        g gVar2 = this.f83i;
        gVar2.c();
        gVar2.j = false;
        g gVar3 = this.k;
        gVar3.c();
        gVar3.j = false;
        this.f79e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f76b.f26553i0;
    }
}
