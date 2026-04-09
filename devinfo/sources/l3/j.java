package l3;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f28569k = new int[2];

    public static void m(int[] iArr, int i4, int i10, int i11, int i12, float f10, int i13) {
        int i14 = i10 - i4;
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

    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // l3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(l3.d r24) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.j.a(l3.d):void");
    }

    @Override // l3.n
    public final void d() {
        k3.d dVar;
        k3.d dVar2;
        int i4;
        k3.d dVar3;
        k3.d dVar4;
        int i10;
        k3.d dVar5 = this.f28581b;
        boolean z3 = dVar5.f27839a;
        f fVar = this.f28584e;
        if (z3) {
            fVar.d(dVar5.q());
        }
        boolean z10 = fVar.j;
        ArrayList arrayList = fVar.f28565k;
        ArrayList arrayList2 = fVar.f28566l;
        e eVar = this.f28587i;
        e eVar2 = this.f28586h;
        if (!z10) {
            k3.d dVar6 = this.f28581b;
            int i11 = dVar6.f27868p0[0];
            this.f28583d = i11;
            if (i11 != 3) {
                if (i11 == 4 && (dVar4 = dVar6.T) != null && ((i10 = dVar4.f27868p0[0]) == 1 || i10 == 4)) {
                    int iQ = (dVar4.q() - this.f28581b.I.e()) - this.f28581b.K.e();
                    n.b(eVar2, dVar4.f27845d.f28586h, this.f28581b.I.e());
                    n.b(eVar, dVar4.f27845d.f28587i, -this.f28581b.K.e());
                    fVar.d(iQ);
                    return;
                }
                if (i11 == 1) {
                    fVar.d(dVar6.q());
                }
            }
        } else if (this.f28583d == 4 && (dVar2 = (dVar = this.f28581b).T) != null && ((i4 = dVar2.f27868p0[0]) == 1 || i4 == 4)) {
            n.b(eVar2, dVar2.f27845d.f28586h, dVar.I.e());
            n.b(eVar, dVar2.f27845d.f28587i, -this.f28581b.K.e());
            return;
        }
        if (fVar.j) {
            k3.d dVar7 = this.f28581b;
            if (dVar7.f27839a) {
                k3.c[] cVarArr = dVar7.Q;
                k3.c cVar = cVarArr[0];
                k3.c cVar2 = cVar.f27836f;
                if (cVar2 != null && cVarArr[1].f27836f != null) {
                    if (dVar7.x()) {
                        eVar2.f28562f = this.f28581b.Q[0].e();
                        eVar.f28562f = -this.f28581b.Q[1].e();
                        return;
                    }
                    e eVarH = n.h(this.f28581b.Q[0]);
                    if (eVarH != null) {
                        n.b(eVar2, eVarH, this.f28581b.Q[0].e());
                    }
                    e eVarH2 = n.h(this.f28581b.Q[1]);
                    if (eVarH2 != null) {
                        n.b(eVar, eVarH2, -this.f28581b.Q[1].e());
                    }
                    eVar2.f28558b = true;
                    eVar.f28558b = true;
                    return;
                }
                if (cVar2 != null) {
                    e eVarH3 = n.h(cVar);
                    if (eVarH3 != null) {
                        n.b(eVar2, eVarH3, this.f28581b.Q[0].e());
                        n.b(eVar, eVar2, fVar.g);
                        return;
                    }
                    return;
                }
                k3.c cVar3 = cVarArr[1];
                if (cVar3.f27836f != null) {
                    e eVarH4 = n.h(cVar3);
                    if (eVarH4 != null) {
                        n.b(eVar, eVarH4, -this.f28581b.Q[1].e());
                        n.b(eVar2, eVar, -fVar.g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof k3.i) || dVar7.T == null || dVar7.i(7).f27836f != null) {
                    return;
                }
                k3.d dVar8 = this.f28581b;
                n.b(eVar2, dVar8.T.f27845d.f28586h, dVar8.r());
                n.b(eVar, eVar2, fVar.g);
                return;
            }
        }
        if (this.f28583d == 3) {
            k3.d dVar9 = this.f28581b;
            int i12 = dVar9.f27870r;
            if (i12 == 2) {
                k3.d dVar10 = dVar9.T;
                if (dVar10 != null) {
                    f fVar2 = dVar10.f27847e.f28584e;
                    arrayList2.add(fVar2);
                    fVar2.f28565k.add(fVar);
                    fVar.f28558b = true;
                    arrayList.add(eVar2);
                    arrayList.add(eVar);
                }
            } else if (i12 == 3) {
                if (dVar9.f27871s == 3) {
                    eVar2.f28557a = this;
                    eVar.f28557a = this;
                    l lVar = dVar9.f27847e;
                    lVar.f28586h.f28557a = this;
                    lVar.f28587i.f28557a = this;
                    fVar.f28557a = this;
                    if (dVar9.y()) {
                        arrayList2.add(this.f28581b.f27847e.f28584e);
                        this.f28581b.f27847e.f28584e.f28565k.add(fVar);
                        l lVar2 = this.f28581b.f27847e;
                        lVar2.f28584e.f28557a = this;
                        arrayList2.add(lVar2.f28586h);
                        arrayList2.add(this.f28581b.f27847e.f28587i);
                        this.f28581b.f27847e.f28586h.f28565k.add(fVar);
                        this.f28581b.f27847e.f28587i.f28565k.add(fVar);
                    } else if (this.f28581b.x()) {
                        this.f28581b.f27847e.f28584e.f28566l.add(fVar);
                        arrayList.add(this.f28581b.f27847e.f28584e);
                    } else {
                        this.f28581b.f27847e.f28584e.f28566l.add(fVar);
                    }
                } else {
                    f fVar3 = dVar9.f27847e.f28584e;
                    arrayList2.add(fVar3);
                    fVar3.f28565k.add(fVar);
                    this.f28581b.f27847e.f28586h.f28565k.add(fVar);
                    this.f28581b.f27847e.f28587i.f28565k.add(fVar);
                    fVar.f28558b = true;
                    arrayList.add(eVar2);
                    arrayList.add(eVar);
                    eVar2.f28566l.add(fVar);
                    eVar.f28566l.add(fVar);
                }
            }
        }
        k3.d dVar11 = this.f28581b;
        k3.c[] cVarArr2 = dVar11.Q;
        k3.c cVar4 = cVarArr2[0];
        k3.c cVar5 = cVar4.f27836f;
        if (cVar5 != null && cVarArr2[1].f27836f != null) {
            if (dVar11.x()) {
                eVar2.f28562f = this.f28581b.Q[0].e();
                eVar.f28562f = -this.f28581b.Q[1].e();
                return;
            }
            e eVarH5 = n.h(this.f28581b.Q[0]);
            e eVarH6 = n.h(this.f28581b.Q[1]);
            if (eVarH5 != null) {
                eVarH5.b(this);
            }
            if (eVarH6 != null) {
                eVarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (cVar5 != null) {
            e eVarH7 = n.h(cVar4);
            if (eVarH7 != null) {
                n.b(eVar2, eVarH7, this.f28581b.Q[0].e());
                c(eVar, eVar2, 1, fVar);
                return;
            }
            return;
        }
        k3.c cVar6 = cVarArr2[1];
        if (cVar6.f27836f != null) {
            e eVarH8 = n.h(cVar6);
            if (eVarH8 != null) {
                n.b(eVar, eVarH8, -this.f28581b.Q[1].e());
                c(eVar2, eVar, -1, fVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof k3.i) || (dVar3 = dVar11.T) == null) {
            return;
        }
        n.b(eVar2, dVar3.f27845d.f28586h, dVar11.r());
        c(eVar, eVar2, 1, fVar);
    }

    @Override // l3.n
    public final void e() {
        e eVar = this.f28586h;
        if (eVar.j) {
            this.f28581b.Y = eVar.g;
        }
    }

    @Override // l3.n
    public final void f() {
        this.f28582c = null;
        this.f28586h.c();
        this.f28587i.c();
        this.f28584e.c();
        this.g = false;
    }

    @Override // l3.n
    public final boolean k() {
        return this.f28583d != 3 || this.f28581b.f27870r == 0;
    }

    public final void n() {
        this.g = false;
        e eVar = this.f28586h;
        eVar.c();
        eVar.j = false;
        e eVar2 = this.f28587i;
        eVar2.c();
        eVar2.j = false;
        this.f28584e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f28581b.f27853h0;
    }
}
