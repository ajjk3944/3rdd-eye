package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i51 extends m81 {
    public jo k;
    public qa l;

    @Override // defpackage.ho
    public final void a(ho hoVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (ex0.s(this.j) == 3) {
            pi piVar = this.b;
            l(piVar.J, piVar.L, 1);
            return;
        }
        ap apVar = this.e;
        if (apVar.c && !apVar.j && this.d == 3) {
            pi piVar2 = this.b;
            int i2 = piVar2.s;
            if (i2 == 2) {
                pi piVar3 = piVar2.T;
                if (piVar3 != null) {
                    if (piVar3.e.e.j) {
                        apVar.d((int) ((r5.g * piVar2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                ap apVar2 = piVar2.d.e;
                if (apVar2.j) {
                    int i3 = piVar2.X;
                    if (i3 == -1) {
                        f = apVar2.g;
                        f2 = piVar2.W;
                    } else if (i3 == 0) {
                        f3 = apVar2.g * piVar2.W;
                        i = (int) (f3 + 0.5f);
                        apVar.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        apVar.d(i);
                    } else {
                        f = apVar2.g;
                        f2 = piVar2.W;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    apVar.d(i);
                }
            }
        }
        jo joVar = this.h;
        boolean z = joVar.c;
        ArrayList arrayList = joVar.l;
        if (z) {
            jo joVar2 = this.i;
            boolean z2 = joVar2.c;
            ArrayList arrayList2 = joVar2.l;
            if (z2) {
                if (joVar.j && joVar2.j && apVar.j) {
                    return;
                }
                if (!apVar.j && this.d == 3) {
                    pi piVar4 = this.b;
                    if (piVar4.r == 0 && !piVar4.y()) {
                        jo joVar3 = (jo) arrayList.get(0);
                        jo joVar4 = (jo) arrayList2.get(0);
                        int i4 = joVar3.g + joVar.f;
                        int i5 = joVar4.g + joVar2.f;
                        joVar.d(i4);
                        joVar2.d(i5);
                        apVar.d(i5 - i4);
                        return;
                    }
                }
                if (!apVar.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    jo joVar5 = (jo) arrayList.get(0);
                    int i6 = (((jo) arrayList2.get(0)).g + joVar2.f) - (joVar5.g + joVar.f);
                    int i7 = apVar.m;
                    if (i6 < i7) {
                        apVar.d(i6);
                    } else {
                        apVar.d(i7);
                    }
                }
                if (apVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    jo joVar6 = (jo) arrayList.get(0);
                    jo joVar7 = (jo) arrayList2.get(0);
                    int i8 = joVar6.g;
                    int i9 = joVar.f + i8;
                    int i10 = joVar7.g;
                    int i11 = joVar2.f + i10;
                    float f4 = this.b.e0;
                    if (joVar6 == joVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    joVar.d((int) ((((i10 - i8) - apVar.g) * f4) + i8 + 0.5f));
                    joVar2.d(joVar.g + apVar.g);
                }
            }
        }
    }

    @Override // defpackage.m81
    public final void d() {
        pi piVar;
        pi piVar2;
        pi piVar3;
        pi piVar4;
        jo joVar = this.k;
        pi piVar5 = this.b;
        boolean z = piVar5.a;
        ap apVar = this.e;
        if (z) {
            apVar.d(piVar5.k());
        }
        boolean z2 = apVar.j;
        ArrayList arrayList = apVar.k;
        ArrayList arrayList2 = apVar.l;
        jo joVar2 = this.i;
        jo joVar3 = this.h;
        if (!z2) {
            pi piVar6 = this.b;
            this.d = piVar6.p0[1];
            if (piVar6.E) {
                this.l = new qa(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (piVar4 = this.b.T) != null && piVar4.p0[1] == 1) {
                    int iK = (piVar4.k() - this.b.J.e()) - this.b.L.e();
                    m81.b(joVar3, piVar4.e.h, this.b.J.e());
                    m81.b(joVar2, piVar4.e.i, -this.b.L.e());
                    apVar.d(iK);
                    return;
                }
                if (i == 1) {
                    apVar.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (piVar2 = (piVar = this.b).T) != null && piVar2.p0[1] == 1) {
            m81.b(joVar3, piVar2.e.h, piVar.J.e());
            m81.b(joVar2, piVar2.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = apVar.j;
        if (z3) {
            pi piVar7 = this.b;
            if (piVar7.a) {
                wh[] whVarArr = piVar7.Q;
                wh whVar = whVarArr[2];
                wh whVar2 = whVar.f;
                if (whVar2 != null && whVarArr[3].f != null) {
                    if (piVar7.y()) {
                        joVar3.f = this.b.Q[2].e();
                        joVar2.f = -this.b.Q[3].e();
                    } else {
                        jo joVarH = m81.h(this.b.Q[2]);
                        if (joVarH != null) {
                            m81.b(joVar3, joVarH, this.b.Q[2].e());
                        }
                        jo joVarH2 = m81.h(this.b.Q[3]);
                        if (joVarH2 != null) {
                            m81.b(joVar2, joVarH2, -this.b.Q[3].e());
                        }
                        joVar3.b = true;
                        joVar2.b = true;
                    }
                    pi piVar8 = this.b;
                    if (piVar8.E) {
                        m81.b(joVar, joVar3, piVar8.a0);
                        return;
                    }
                    return;
                }
                if (whVar2 != null) {
                    jo joVarH3 = m81.h(whVar);
                    if (joVarH3 != null) {
                        m81.b(joVar3, joVarH3, this.b.Q[2].e());
                        m81.b(joVar2, joVar3, apVar.g);
                        pi piVar9 = this.b;
                        if (piVar9.E) {
                            m81.b(joVar, joVar3, piVar9.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                wh whVar3 = whVarArr[3];
                if (whVar3.f != null) {
                    jo joVarH4 = m81.h(whVar3);
                    if (joVarH4 != null) {
                        m81.b(joVar2, joVarH4, -this.b.Q[3].e());
                        m81.b(joVar3, joVar2, -apVar.g);
                    }
                    pi piVar10 = this.b;
                    if (piVar10.E) {
                        m81.b(joVar, joVar3, piVar10.a0);
                        return;
                    }
                    return;
                }
                wh whVar4 = whVarArr[4];
                if (whVar4.f != null) {
                    jo joVarH5 = m81.h(whVar4);
                    if (joVarH5 != null) {
                        m81.b(joVar, joVarH5, 0);
                        m81.b(joVar3, joVar, -this.b.a0);
                        m81.b(joVar2, joVar3, apVar.g);
                        return;
                    }
                    return;
                }
                if ((piVar7 instanceof s00) || piVar7.T == null || piVar7.i(7).f != null) {
                    return;
                }
                pi piVar11 = this.b;
                m81.b(joVar3, piVar11.T.e.h, piVar11.s());
                m81.b(joVar2, joVar3, apVar.g);
                pi piVar12 = this.b;
                if (piVar12.E) {
                    m81.b(joVar, joVar3, piVar12.a0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            apVar.b(this);
        } else {
            pi piVar13 = this.b;
            int i2 = piVar13.s;
            if (i2 == 2) {
                pi piVar14 = piVar13.T;
                if (piVar14 != null) {
                    ap apVar2 = piVar14.e.e;
                    arrayList2.add(apVar2);
                    apVar2.k.add(apVar);
                    apVar.b = true;
                    arrayList.add(joVar3);
                    arrayList.add(joVar2);
                }
            } else if (i2 == 3 && !piVar13.y()) {
                pi piVar15 = this.b;
                if (piVar15.r != 3) {
                    ap apVar3 = piVar15.d.e;
                    arrayList2.add(apVar3);
                    apVar3.k.add(apVar);
                    apVar.b = true;
                    arrayList.add(joVar3);
                    arrayList.add(joVar2);
                }
            }
        }
        pi piVar16 = this.b;
        wh[] whVarArr2 = piVar16.Q;
        wh whVar5 = whVarArr2[2];
        wh whVar6 = whVar5.f;
        if (whVar6 != null && whVarArr2[3].f != null) {
            if (piVar16.y()) {
                joVar3.f = this.b.Q[2].e();
                joVar2.f = -this.b.Q[3].e();
            } else {
                jo joVarH6 = m81.h(this.b.Q[2]);
                jo joVarH7 = m81.h(this.b.Q[3]);
                if (joVarH6 != null) {
                    joVarH6.b(this);
                }
                if (joVarH7 != null) {
                    joVarH7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(joVar, joVar3, 1, this.l);
            }
        } else if (whVar6 != null) {
            jo joVarH8 = m81.h(whVar5);
            if (joVarH8 != null) {
                m81.b(joVar3, joVarH8, this.b.Q[2].e());
                c(joVar2, joVar3, 1, apVar);
                if (this.b.E) {
                    c(joVar, joVar3, 1, this.l);
                }
                if (this.d == 3) {
                    pi piVar17 = this.b;
                    if (piVar17.W > 0.0f) {
                        z00 z00Var = piVar17.d;
                        if (z00Var.d == 3) {
                            z00Var.e.k.add(apVar);
                            arrayList2.add(this.b.d.e);
                            apVar.a = this;
                        }
                    }
                }
            }
        } else {
            wh whVar7 = whVarArr2[3];
            if (whVar7.f != null) {
                jo joVarH9 = m81.h(whVar7);
                if (joVarH9 != null) {
                    m81.b(joVar2, joVarH9, -this.b.Q[3].e());
                    c(joVar3, joVar2, -1, apVar);
                    if (this.b.E) {
                        c(joVar, joVar3, 1, this.l);
                    }
                }
            } else {
                wh whVar8 = whVarArr2[4];
                if (whVar8.f != null) {
                    jo joVarH10 = m81.h(whVar8);
                    if (joVarH10 != null) {
                        m81.b(joVar, joVarH10, 0);
                        c(joVar3, joVar, -1, this.l);
                        c(joVar2, joVar3, 1, apVar);
                    }
                } else if (!(piVar16 instanceof s00) && (piVar3 = piVar16.T) != null) {
                    m81.b(joVar3, piVar3.e.h, piVar16.s());
                    c(joVar2, joVar3, 1, apVar);
                    if (this.b.E) {
                        c(joVar, joVar3, 1, this.l);
                    }
                    if (this.d == 3) {
                        pi piVar18 = this.b;
                        if (piVar18.W > 0.0f) {
                            z00 z00Var2 = piVar18.d;
                            if (z00Var2.d == 3) {
                                z00Var2.e.k.add(apVar);
                                arrayList2.add(this.b.d.e);
                                apVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            apVar.c = true;
        }
    }

    @Override // defpackage.m81
    public final void e() {
        jo joVar = this.h;
        if (joVar.j) {
            this.b.Z = joVar.g;
        }
    }

    @Override // defpackage.m81
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.m81
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        jo joVar = this.h;
        joVar.c();
        joVar.j = false;
        jo joVar2 = this.i;
        joVar2.c();
        joVar2.j = false;
        jo joVar3 = this.k;
        joVar3.c();
        joVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
