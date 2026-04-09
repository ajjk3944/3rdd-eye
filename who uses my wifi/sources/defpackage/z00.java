package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class z00 extends m81 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // defpackage.ho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.ho r24) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z00.a(ho):void");
    }

    @Override // defpackage.m81
    public final void d() {
        pi piVar;
        pi piVar2;
        int i;
        pi piVar3;
        pi piVar4;
        int i2;
        pi piVar5 = this.b;
        boolean z = piVar5.a;
        ap apVar = this.e;
        if (z) {
            apVar.d(piVar5.q());
        }
        boolean z2 = apVar.j;
        ArrayList arrayList = apVar.k;
        ArrayList arrayList2 = apVar.l;
        jo joVar = this.i;
        jo joVar2 = this.h;
        if (!z2) {
            pi piVar6 = this.b;
            int i3 = piVar6.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (piVar4 = piVar6.T) != null && ((i2 = piVar4.p0[0]) == 1 || i2 == 4)) {
                    int iQ = (piVar4.q() - this.b.I.e()) - this.b.K.e();
                    m81.b(joVar2, piVar4.d.h, this.b.I.e());
                    m81.b(joVar, piVar4.d.i, -this.b.K.e());
                    apVar.d(iQ);
                    return;
                }
                if (i3 == 1) {
                    apVar.d(piVar6.q());
                }
            }
        } else if (this.d == 4 && (piVar2 = (piVar = this.b).T) != null && ((i = piVar2.p0[0]) == 1 || i == 4)) {
            m81.b(joVar2, piVar2.d.h, piVar.I.e());
            m81.b(joVar, piVar2.d.i, -this.b.K.e());
            return;
        }
        if (apVar.j) {
            pi piVar7 = this.b;
            if (piVar7.a) {
                wh[] whVarArr = piVar7.Q;
                wh whVar = whVarArr[0];
                wh whVar2 = whVar.f;
                if (whVar2 != null && whVarArr[1].f != null) {
                    if (piVar7.x()) {
                        joVar2.f = this.b.Q[0].e();
                        joVar.f = -this.b.Q[1].e();
                        return;
                    }
                    jo joVarH = m81.h(this.b.Q[0]);
                    if (joVarH != null) {
                        m81.b(joVar2, joVarH, this.b.Q[0].e());
                    }
                    jo joVarH2 = m81.h(this.b.Q[1]);
                    if (joVarH2 != null) {
                        m81.b(joVar, joVarH2, -this.b.Q[1].e());
                    }
                    joVar2.b = true;
                    joVar.b = true;
                    return;
                }
                if (whVar2 != null) {
                    jo joVarH3 = m81.h(whVar);
                    if (joVarH3 != null) {
                        m81.b(joVar2, joVarH3, this.b.Q[0].e());
                        m81.b(joVar, joVar2, apVar.g);
                        return;
                    }
                    return;
                }
                wh whVar3 = whVarArr[1];
                if (whVar3.f != null) {
                    jo joVarH4 = m81.h(whVar3);
                    if (joVarH4 != null) {
                        m81.b(joVar, joVarH4, -this.b.Q[1].e());
                        m81.b(joVar2, joVar, -apVar.g);
                        return;
                    }
                    return;
                }
                if ((piVar7 instanceof s00) || piVar7.T == null || piVar7.i(7).f != null) {
                    return;
                }
                pi piVar8 = this.b;
                m81.b(joVar2, piVar8.T.d.h, piVar8.r());
                m81.b(joVar, joVar2, apVar.g);
                return;
            }
        }
        if (this.d == 3) {
            pi piVar9 = this.b;
            int i4 = piVar9.r;
            if (i4 == 2) {
                pi piVar10 = piVar9.T;
                if (piVar10 != null) {
                    ap apVar2 = piVar10.e.e;
                    arrayList2.add(apVar2);
                    apVar2.k.add(apVar);
                    apVar.b = true;
                    arrayList.add(joVar2);
                    arrayList.add(joVar);
                }
            } else if (i4 == 3) {
                if (piVar9.s == 3) {
                    joVar2.a = this;
                    joVar.a = this;
                    i51 i51Var = piVar9.e;
                    i51Var.h.a = this;
                    i51Var.i.a = this;
                    apVar.a = this;
                    if (piVar9.y()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(apVar);
                        i51 i51Var2 = this.b.e;
                        i51Var2.e.a = this;
                        arrayList2.add(i51Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(apVar);
                        this.b.e.i.k.add(apVar);
                    } else if (this.b.x()) {
                        this.b.e.e.l.add(apVar);
                        arrayList.add(this.b.e.e);
                    } else {
                        this.b.e.e.l.add(apVar);
                    }
                } else {
                    ap apVar3 = piVar9.e.e;
                    arrayList2.add(apVar3);
                    apVar3.k.add(apVar);
                    this.b.e.h.k.add(apVar);
                    this.b.e.i.k.add(apVar);
                    apVar.b = true;
                    arrayList.add(joVar2);
                    arrayList.add(joVar);
                    joVar2.l.add(apVar);
                    joVar.l.add(apVar);
                }
            }
        }
        pi piVar11 = this.b;
        wh[] whVarArr2 = piVar11.Q;
        wh whVar4 = whVarArr2[0];
        wh whVar5 = whVar4.f;
        if (whVar5 != null && whVarArr2[1].f != null) {
            if (piVar11.x()) {
                joVar2.f = this.b.Q[0].e();
                joVar.f = -this.b.Q[1].e();
                return;
            }
            jo joVarH5 = m81.h(this.b.Q[0]);
            jo joVarH6 = m81.h(this.b.Q[1]);
            if (joVarH5 != null) {
                joVarH5.b(this);
            }
            if (joVarH6 != null) {
                joVarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (whVar5 != null) {
            jo joVarH7 = m81.h(whVar4);
            if (joVarH7 != null) {
                m81.b(joVar2, joVarH7, this.b.Q[0].e());
                c(joVar, joVar2, 1, apVar);
                return;
            }
            return;
        }
        wh whVar6 = whVarArr2[1];
        if (whVar6.f != null) {
            jo joVarH8 = m81.h(whVar6);
            if (joVarH8 != null) {
                m81.b(joVar, joVarH8, -this.b.Q[1].e());
                c(joVar2, joVar, -1, apVar);
                return;
            }
            return;
        }
        if ((piVar11 instanceof s00) || (piVar3 = piVar11.T) == null) {
            return;
        }
        m81.b(joVar2, piVar3.d.h, piVar11.r());
        c(joVar, joVar2, 1, apVar);
    }

    @Override // defpackage.m81
    public final void e() {
        jo joVar = this.h;
        if (joVar.j) {
            this.b.Y = joVar.g;
        }
    }

    @Override // defpackage.m81
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.m81
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        jo joVar = this.h;
        joVar.c();
        joVar.j = false;
        jo joVar2 = this.i;
        joVar2.c();
        joVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.h0;
    }
}
