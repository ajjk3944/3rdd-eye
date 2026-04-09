package l3;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: k, reason: collision with root package name */
    public e f28572k;

    /* renamed from: l, reason: collision with root package name */
    public a f28573l;

    @Override // l3.d
    public final void a(d dVar) {
        float f10;
        float f11;
        float f12;
        int i4;
        if (i3.e.c(this.j) == 3) {
            k3.d dVar2 = this.f28581b;
            l(dVar2.J, dVar2.L, 1);
            return;
        }
        f fVar = this.f28584e;
        if (fVar.f28559c && !fVar.j && this.f28583d == 3) {
            k3.d dVar3 = this.f28581b;
            int i10 = dVar3.f27871s;
            if (i10 == 2) {
                k3.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.f27847e.f28584e.j) {
                        fVar.d((int) ((r5.g * dVar3.f27878z) + 0.5f));
                    }
                }
            } else if (i10 == 3) {
                f fVar2 = dVar3.f27845d.f28584e;
                if (fVar2.j) {
                    int i11 = dVar3.X;
                    if (i11 == -1) {
                        f10 = fVar2.g;
                        f11 = dVar3.W;
                    } else if (i11 == 0) {
                        f12 = fVar2.g * dVar3.W;
                        i4 = (int) (f12 + 0.5f);
                        fVar.d(i4);
                    } else if (i11 != 1) {
                        i4 = 0;
                        fVar.d(i4);
                    } else {
                        f10 = fVar2.g;
                        f11 = dVar3.W;
                    }
                    f12 = f10 / f11;
                    i4 = (int) (f12 + 0.5f);
                    fVar.d(i4);
                }
            }
        }
        e eVar = this.f28586h;
        boolean z3 = eVar.f28559c;
        ArrayList arrayList = eVar.f28566l;
        if (z3) {
            e eVar2 = this.f28587i;
            boolean z10 = eVar2.f28559c;
            ArrayList arrayList2 = eVar2.f28566l;
            if (z10) {
                if (eVar.j && eVar2.j && fVar.j) {
                    return;
                }
                if (!fVar.j && this.f28583d == 3) {
                    k3.d dVar5 = this.f28581b;
                    if (dVar5.f27870r == 0 && !dVar5.y()) {
                        e eVar3 = (e) arrayList.get(0);
                        e eVar4 = (e) arrayList2.get(0);
                        int i12 = eVar3.g + eVar.f28562f;
                        int i13 = eVar4.g + eVar2.f28562f;
                        eVar.d(i12);
                        eVar2.d(i13);
                        fVar.d(i13 - i12);
                        return;
                    }
                }
                if (!fVar.j && this.f28583d == 3 && this.f28580a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    e eVar5 = (e) arrayList.get(0);
                    int i14 = (((e) arrayList2.get(0)).g + eVar2.f28562f) - (eVar5.g + eVar.f28562f);
                    int i15 = fVar.f28567m;
                    if (i14 < i15) {
                        fVar.d(i14);
                    } else {
                        fVar.d(i15);
                    }
                }
                if (fVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    e eVar6 = (e) arrayList.get(0);
                    e eVar7 = (e) arrayList2.get(0);
                    int i16 = eVar6.g;
                    int i17 = eVar.f28562f + i16;
                    int i18 = eVar7.g;
                    int i19 = eVar2.f28562f + i18;
                    float f13 = this.f28581b.f27848e0;
                    if (eVar6 == eVar7) {
                        f13 = 0.5f;
                    } else {
                        i16 = i17;
                        i18 = i19;
                    }
                    eVar.d((int) ((((i18 - i16) - fVar.g) * f13) + i16 + 0.5f));
                    eVar2.d(eVar.g + fVar.g);
                }
            }
        }
    }

    @Override // l3.n
    public final void d() {
        k3.d dVar;
        k3.d dVar2;
        k3.d dVar3;
        k3.d dVar4;
        e eVar = this.f28572k;
        k3.d dVar5 = this.f28581b;
        boolean z3 = dVar5.f27839a;
        f fVar = this.f28584e;
        if (z3) {
            fVar.d(dVar5.k());
        }
        boolean z10 = fVar.j;
        ArrayList arrayList = fVar.f28565k;
        ArrayList arrayList2 = fVar.f28566l;
        e eVar2 = this.f28587i;
        e eVar3 = this.f28586h;
        if (!z10) {
            k3.d dVar6 = this.f28581b;
            this.f28583d = dVar6.f27868p0[1];
            if (dVar6.E) {
                this.f28573l = new a(this);
            }
            int i4 = this.f28583d;
            if (i4 != 3) {
                if (i4 == 4 && (dVar4 = this.f28581b.T) != null && dVar4.f27868p0[1] == 1) {
                    int iK = (dVar4.k() - this.f28581b.J.e()) - this.f28581b.L.e();
                    n.b(eVar3, dVar4.f27847e.f28586h, this.f28581b.J.e());
                    n.b(eVar2, dVar4.f27847e.f28587i, -this.f28581b.L.e());
                    fVar.d(iK);
                    return;
                }
                if (i4 == 1) {
                    fVar.d(this.f28581b.k());
                }
            }
        } else if (this.f28583d == 4 && (dVar2 = (dVar = this.f28581b).T) != null && dVar2.f27868p0[1] == 1) {
            n.b(eVar3, dVar2.f27847e.f28586h, dVar.J.e());
            n.b(eVar2, dVar2.f27847e.f28587i, -this.f28581b.L.e());
            return;
        }
        boolean z11 = fVar.j;
        if (z11) {
            k3.d dVar7 = this.f28581b;
            if (dVar7.f27839a) {
                k3.c[] cVarArr = dVar7.Q;
                k3.c cVar = cVarArr[2];
                k3.c cVar2 = cVar.f27836f;
                if (cVar2 != null && cVarArr[3].f27836f != null) {
                    if (dVar7.y()) {
                        eVar3.f28562f = this.f28581b.Q[2].e();
                        eVar2.f28562f = -this.f28581b.Q[3].e();
                    } else {
                        e eVarH = n.h(this.f28581b.Q[2]);
                        if (eVarH != null) {
                            n.b(eVar3, eVarH, this.f28581b.Q[2].e());
                        }
                        e eVarH2 = n.h(this.f28581b.Q[3]);
                        if (eVarH2 != null) {
                            n.b(eVar2, eVarH2, -this.f28581b.Q[3].e());
                        }
                        eVar3.f28558b = true;
                        eVar2.f28558b = true;
                    }
                    k3.d dVar8 = this.f28581b;
                    if (dVar8.E) {
                        n.b(eVar, eVar3, dVar8.f27840a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    e eVarH3 = n.h(cVar);
                    if (eVarH3 != null) {
                        n.b(eVar3, eVarH3, this.f28581b.Q[2].e());
                        n.b(eVar2, eVar3, fVar.g);
                        k3.d dVar9 = this.f28581b;
                        if (dVar9.E) {
                            n.b(eVar, eVar3, dVar9.f27840a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                k3.c cVar3 = cVarArr[3];
                if (cVar3.f27836f != null) {
                    e eVarH4 = n.h(cVar3);
                    if (eVarH4 != null) {
                        n.b(eVar2, eVarH4, -this.f28581b.Q[3].e());
                        n.b(eVar3, eVar2, -fVar.g);
                    }
                    k3.d dVar10 = this.f28581b;
                    if (dVar10.E) {
                        n.b(eVar, eVar3, dVar10.f27840a0);
                        return;
                    }
                    return;
                }
                k3.c cVar4 = cVarArr[4];
                if (cVar4.f27836f != null) {
                    e eVarH5 = n.h(cVar4);
                    if (eVarH5 != null) {
                        n.b(eVar, eVarH5, 0);
                        n.b(eVar3, eVar, -this.f28581b.f27840a0);
                        n.b(eVar2, eVar3, fVar.g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof k3.i) || dVar7.T == null || dVar7.i(7).f27836f != null) {
                    return;
                }
                k3.d dVar11 = this.f28581b;
                n.b(eVar3, dVar11.T.f27847e.f28586h, dVar11.s());
                n.b(eVar2, eVar3, fVar.g);
                k3.d dVar12 = this.f28581b;
                if (dVar12.E) {
                    n.b(eVar, eVar3, dVar12.f27840a0);
                    return;
                }
                return;
            }
        }
        if (z11 || this.f28583d != 3) {
            fVar.b(this);
        } else {
            k3.d dVar13 = this.f28581b;
            int i10 = dVar13.f27871s;
            if (i10 == 2) {
                k3.d dVar14 = dVar13.T;
                if (dVar14 != null) {
                    f fVar2 = dVar14.f27847e.f28584e;
                    arrayList2.add(fVar2);
                    fVar2.f28565k.add(fVar);
                    fVar.f28558b = true;
                    arrayList.add(eVar3);
                    arrayList.add(eVar2);
                }
            } else if (i10 == 3 && !dVar13.y()) {
                k3.d dVar15 = this.f28581b;
                if (dVar15.f27870r != 3) {
                    f fVar3 = dVar15.f27845d.f28584e;
                    arrayList2.add(fVar3);
                    fVar3.f28565k.add(fVar);
                    fVar.f28558b = true;
                    arrayList.add(eVar3);
                    arrayList.add(eVar2);
                }
            }
        }
        k3.d dVar16 = this.f28581b;
        k3.c[] cVarArr2 = dVar16.Q;
        k3.c cVar5 = cVarArr2[2];
        k3.c cVar6 = cVar5.f27836f;
        if (cVar6 != null && cVarArr2[3].f27836f != null) {
            if (dVar16.y()) {
                eVar3.f28562f = this.f28581b.Q[2].e();
                eVar2.f28562f = -this.f28581b.Q[3].e();
            } else {
                e eVarH6 = n.h(this.f28581b.Q[2]);
                e eVarH7 = n.h(this.f28581b.Q[3]);
                if (eVarH6 != null) {
                    eVarH6.b(this);
                }
                if (eVarH7 != null) {
                    eVarH7.b(this);
                }
                this.j = 4;
            }
            if (this.f28581b.E) {
                c(eVar, eVar3, 1, this.f28573l);
            }
        } else if (cVar6 != null) {
            e eVarH8 = n.h(cVar5);
            if (eVarH8 != null) {
                n.b(eVar3, eVarH8, this.f28581b.Q[2].e());
                c(eVar2, eVar3, 1, fVar);
                if (this.f28581b.E) {
                    c(eVar, eVar3, 1, this.f28573l);
                }
                if (this.f28583d == 3) {
                    k3.d dVar17 = this.f28581b;
                    if (dVar17.W > 0.0f) {
                        j jVar = dVar17.f27845d;
                        if (jVar.f28583d == 3) {
                            jVar.f28584e.f28565k.add(fVar);
                            arrayList2.add(this.f28581b.f27845d.f28584e);
                            fVar.f28557a = this;
                        }
                    }
                }
            }
        } else {
            k3.c cVar7 = cVarArr2[3];
            if (cVar7.f27836f != null) {
                e eVarH9 = n.h(cVar7);
                if (eVarH9 != null) {
                    n.b(eVar2, eVarH9, -this.f28581b.Q[3].e());
                    c(eVar3, eVar2, -1, fVar);
                    if (this.f28581b.E) {
                        c(eVar, eVar3, 1, this.f28573l);
                    }
                }
            } else {
                k3.c cVar8 = cVarArr2[4];
                if (cVar8.f27836f != null) {
                    e eVarH10 = n.h(cVar8);
                    if (eVarH10 != null) {
                        n.b(eVar, eVarH10, 0);
                        c(eVar3, eVar, -1, this.f28573l);
                        c(eVar2, eVar3, 1, fVar);
                    }
                } else if (!(dVar16 instanceof k3.i) && (dVar3 = dVar16.T) != null) {
                    n.b(eVar3, dVar3.f27847e.f28586h, dVar16.s());
                    c(eVar2, eVar3, 1, fVar);
                    if (this.f28581b.E) {
                        c(eVar, eVar3, 1, this.f28573l);
                    }
                    if (this.f28583d == 3) {
                        k3.d dVar18 = this.f28581b;
                        if (dVar18.W > 0.0f) {
                            j jVar2 = dVar18.f27845d;
                            if (jVar2.f28583d == 3) {
                                jVar2.f28584e.f28565k.add(fVar);
                                arrayList2.add(this.f28581b.f27845d.f28584e);
                                fVar.f28557a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            fVar.f28559c = true;
        }
    }

    @Override // l3.n
    public final void e() {
        e eVar = this.f28586h;
        if (eVar.j) {
            this.f28581b.Z = eVar.g;
        }
    }

    @Override // l3.n
    public final void f() {
        this.f28582c = null;
        this.f28586h.c();
        this.f28587i.c();
        this.f28572k.c();
        this.f28584e.c();
        this.g = false;
    }

    @Override // l3.n
    public final boolean k() {
        return this.f28583d != 3 || this.f28581b.f27871s == 0;
    }

    public final void m() {
        this.g = false;
        e eVar = this.f28586h;
        eVar.c();
        eVar.j = false;
        e eVar2 = this.f28587i;
        eVar2.c();
        eVar2.j = false;
        e eVar3 = this.f28572k;
        eVar3.c();
        eVar3.j = false;
        this.f28584e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f28581b.f27853h0;
    }
}
