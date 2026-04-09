package A;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public g f35k;

    /* renamed from: l, reason: collision with root package name */
    public a f36l;

    @Override // A.d
    public final void a(d dVar) {
        float f2;
        float f5;
        float f6;
        int i;
        if (AbstractC2984e.c(this.f51j) == 3) {
            z.d dVar2 = this.f44b;
            l(dVar2.f24301J, dVar2.f24303L, 1);
            return;
        }
        h hVar = this.f47e;
        if (hVar.f21c && !hVar.f27j && this.f46d == 3) {
            z.d dVar3 = this.f44b;
            int i3 = dVar3.f24349s;
            if (i3 == 2) {
                z.d dVar4 = dVar3.f24310T;
                if (dVar4 != null) {
                    if (dVar4.f24324e.f47e.f27j) {
                        hVar.d((int) ((r5.f25g * dVar3.f24356z) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                h hVar2 = dVar3.f24322d.f47e;
                if (hVar2.f27j) {
                    int i6 = dVar3.f24314X;
                    if (i6 == -1) {
                        f2 = hVar2.f25g;
                        f5 = dVar3.f24313W;
                    } else if (i6 == 0) {
                        f6 = hVar2.f25g * dVar3.f24313W;
                        i = (int) (f6 + 0.5f);
                        hVar.d(i);
                    } else if (i6 != 1) {
                        i = 0;
                        hVar.d(i);
                    } else {
                        f2 = hVar2.f25g;
                        f5 = dVar3.f24313W;
                    }
                    f6 = f2 / f5;
                    i = (int) (f6 + 0.5f);
                    hVar.d(i);
                }
            }
        }
        g gVar = this.f50h;
        if (gVar.f21c) {
            g gVar2 = this.i;
            if (gVar2.f21c) {
                if (gVar.f27j && gVar2.f27j && hVar.f27j) {
                    return;
                }
                if (!hVar.f27j && this.f46d == 3) {
                    z.d dVar5 = this.f44b;
                    if (dVar5.f24348r == 0 && !dVar5.y()) {
                        g gVar3 = (g) gVar.f29l.get(0);
                        g gVar4 = (g) gVar2.f29l.get(0);
                        int i7 = gVar3.f25g + gVar.f24f;
                        int i8 = gVar4.f25g + gVar2.f24f;
                        gVar.d(i7);
                        gVar2.d(i8);
                        hVar.d(i8 - i7);
                        return;
                    }
                }
                if (!hVar.f27j && this.f46d == 3 && this.f43a == 1 && gVar.f29l.size() > 0 && gVar2.f29l.size() > 0) {
                    g gVar5 = (g) gVar.f29l.get(0);
                    int i9 = (((g) gVar2.f29l.get(0)).f25g + gVar2.f24f) - (gVar5.f25g + gVar.f24f);
                    int i10 = hVar.f30m;
                    if (i9 < i10) {
                        hVar.d(i9);
                    } else {
                        hVar.d(i10);
                    }
                }
                if (hVar.f27j && gVar.f29l.size() > 0 && gVar2.f29l.size() > 0) {
                    g gVar6 = (g) gVar.f29l.get(0);
                    g gVar7 = (g) gVar2.f29l.get(0);
                    int i11 = gVar6.f25g;
                    int i12 = gVar.f24f + i11;
                    int i13 = gVar7.f25g;
                    int i14 = gVar2.f24f + i13;
                    float f7 = this.f44b.f24325e0;
                    if (gVar6 == gVar7) {
                        f7 = 0.5f;
                    } else {
                        i11 = i12;
                        i13 = i14;
                    }
                    gVar.d((int) ((((i13 - i11) - hVar.f25g) * f7) + i11 + 0.5f));
                    gVar2.d(gVar.f25g + hVar.f25g);
                }
            }
        }
    }

    @Override // A.p
    public final void d() {
        z.d dVar;
        z.d dVar2;
        z.d dVar3;
        z.d dVar4;
        g gVar = this.f35k;
        z.d dVar5 = this.f44b;
        boolean z6 = dVar5.f24317a;
        h hVar = this.f47e;
        if (z6) {
            hVar.d(dVar5.k());
        }
        boolean z7 = hVar.f27j;
        g gVar2 = this.i;
        g gVar3 = this.f50h;
        if (!z7) {
            z.d dVar6 = this.f44b;
            this.f46d = dVar6.f24346p0[1];
            if (dVar6.f24296E) {
                this.f36l = new a(this);
            }
            int i = this.f46d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f44b.f24310T) != null && dVar4.f24346p0[1] == 1) {
                    int iK = (dVar4.k() - this.f44b.f24301J.e()) - this.f44b.f24303L.e();
                    p.b(gVar3, dVar4.f24324e.f50h, this.f44b.f24301J.e());
                    p.b(gVar2, dVar4.f24324e.i, -this.f44b.f24303L.e());
                    hVar.d(iK);
                    return;
                }
                if (i == 1) {
                    hVar.d(this.f44b.k());
                }
            }
        } else if (this.f46d == 4 && (dVar2 = (dVar = this.f44b).f24310T) != null && dVar2.f24346p0[1] == 1) {
            p.b(gVar3, dVar2.f24324e.f50h, dVar.f24301J.e());
            p.b(gVar2, dVar2.f24324e.i, -this.f44b.f24303L.e());
            return;
        }
        boolean z8 = hVar.f27j;
        if (z8) {
            z.d dVar7 = this.f44b;
            if (dVar7.f24317a) {
                z.c[] cVarArr = dVar7.f24307Q;
                z.c cVar = cVarArr[2];
                z.c cVar2 = cVar.f24289f;
                if (cVar2 != null && cVarArr[3].f24289f != null) {
                    if (dVar7.y()) {
                        gVar3.f24f = this.f44b.f24307Q[2].e();
                        gVar2.f24f = -this.f44b.f24307Q[3].e();
                    } else {
                        g gVarH = p.h(this.f44b.f24307Q[2]);
                        if (gVarH != null) {
                            p.b(gVar3, gVarH, this.f44b.f24307Q[2].e());
                        }
                        g gVarH2 = p.h(this.f44b.f24307Q[3]);
                        if (gVarH2 != null) {
                            p.b(gVar2, gVarH2, -this.f44b.f24307Q[3].e());
                        }
                        gVar3.f20b = true;
                        gVar2.f20b = true;
                    }
                    z.d dVar8 = this.f44b;
                    if (dVar8.f24296E) {
                        p.b(gVar, gVar3, dVar8.f24318a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    g gVarH3 = p.h(cVar);
                    if (gVarH3 != null) {
                        p.b(gVar3, gVarH3, this.f44b.f24307Q[2].e());
                        p.b(gVar2, gVar3, hVar.f25g);
                        z.d dVar9 = this.f44b;
                        if (dVar9.f24296E) {
                            p.b(gVar, gVar3, dVar9.f24318a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                z.c cVar3 = cVarArr[3];
                if (cVar3.f24289f != null) {
                    g gVarH4 = p.h(cVar3);
                    if (gVarH4 != null) {
                        p.b(gVar2, gVarH4, -this.f44b.f24307Q[3].e());
                        p.b(gVar3, gVar2, -hVar.f25g);
                    }
                    z.d dVar10 = this.f44b;
                    if (dVar10.f24296E) {
                        p.b(gVar, gVar3, dVar10.f24318a0);
                        return;
                    }
                    return;
                }
                z.c cVar4 = cVarArr[4];
                if (cVar4.f24289f != null) {
                    g gVarH5 = p.h(cVar4);
                    if (gVarH5 != null) {
                        p.b(gVar, gVarH5, 0);
                        p.b(gVar3, gVar, -this.f44b.f24318a0);
                        p.b(gVar2, gVar3, hVar.f25g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof z.i) || dVar7.f24310T == null || dVar7.i(7).f24289f != null) {
                    return;
                }
                z.d dVar11 = this.f44b;
                p.b(gVar3, dVar11.f24310T.f24324e.f50h, dVar11.s());
                p.b(gVar2, gVar3, hVar.f25g);
                z.d dVar12 = this.f44b;
                if (dVar12.f24296E) {
                    p.b(gVar, gVar3, dVar12.f24318a0);
                    return;
                }
                return;
            }
        }
        if (z8 || this.f46d != 3) {
            hVar.b(this);
        } else {
            z.d dVar13 = this.f44b;
            int i3 = dVar13.f24349s;
            if (i3 == 2) {
                z.d dVar14 = dVar13.f24310T;
                if (dVar14 != null) {
                    h hVar2 = dVar14.f24324e.f47e;
                    hVar.f29l.add(hVar2);
                    hVar2.f28k.add(hVar);
                    hVar.f20b = true;
                    hVar.f28k.add(gVar3);
                    hVar.f28k.add(gVar2);
                }
            } else if (i3 == 3 && !dVar13.y()) {
                z.d dVar15 = this.f44b;
                if (dVar15.f24348r != 3) {
                    h hVar3 = dVar15.f24322d.f47e;
                    hVar.f29l.add(hVar3);
                    hVar3.f28k.add(hVar);
                    hVar.f20b = true;
                    hVar.f28k.add(gVar3);
                    hVar.f28k.add(gVar2);
                }
            }
        }
        z.d dVar16 = this.f44b;
        z.c[] cVarArr2 = dVar16.f24307Q;
        z.c cVar5 = cVarArr2[2];
        z.c cVar6 = cVar5.f24289f;
        if (cVar6 != null && cVarArr2[3].f24289f != null) {
            if (dVar16.y()) {
                gVar3.f24f = this.f44b.f24307Q[2].e();
                gVar2.f24f = -this.f44b.f24307Q[3].e();
            } else {
                g gVarH6 = p.h(this.f44b.f24307Q[2]);
                g gVarH7 = p.h(this.f44b.f24307Q[3]);
                if (gVarH6 != null) {
                    gVarH6.b(this);
                }
                if (gVarH7 != null) {
                    gVarH7.b(this);
                }
                this.f51j = 4;
            }
            if (this.f44b.f24296E) {
                c(gVar, gVar3, 1, this.f36l);
            }
        } else if (cVar6 != null) {
            g gVarH8 = p.h(cVar5);
            if (gVarH8 != null) {
                p.b(gVar3, gVarH8, this.f44b.f24307Q[2].e());
                c(gVar2, gVar3, 1, hVar);
                if (this.f44b.f24296E) {
                    c(gVar, gVar3, 1, this.f36l);
                }
                if (this.f46d == 3) {
                    z.d dVar17 = this.f44b;
                    if (dVar17.f24313W > 0.0f) {
                        l lVar = dVar17.f24322d;
                        if (lVar.f46d == 3) {
                            lVar.f47e.f28k.add(hVar);
                            hVar.f29l.add(this.f44b.f24322d.f47e);
                            hVar.f19a = this;
                        }
                    }
                }
            }
        } else {
            z.c cVar7 = cVarArr2[3];
            if (cVar7.f24289f != null) {
                g gVarH9 = p.h(cVar7);
                if (gVarH9 != null) {
                    p.b(gVar2, gVarH9, -this.f44b.f24307Q[3].e());
                    c(gVar3, gVar2, -1, hVar);
                    if (this.f44b.f24296E) {
                        c(gVar, gVar3, 1, this.f36l);
                    }
                }
            } else {
                z.c cVar8 = cVarArr2[4];
                if (cVar8.f24289f != null) {
                    g gVarH10 = p.h(cVar8);
                    if (gVarH10 != null) {
                        p.b(gVar, gVarH10, 0);
                        c(gVar3, gVar, -1, this.f36l);
                        c(gVar2, gVar3, 1, hVar);
                    }
                } else if (!(dVar16 instanceof z.i) && (dVar3 = dVar16.f24310T) != null) {
                    p.b(gVar3, dVar3.f24324e.f50h, dVar16.s());
                    c(gVar2, gVar3, 1, hVar);
                    if (this.f44b.f24296E) {
                        c(gVar, gVar3, 1, this.f36l);
                    }
                    if (this.f46d == 3) {
                        z.d dVar18 = this.f44b;
                        if (dVar18.f24313W > 0.0f) {
                            l lVar2 = dVar18.f24322d;
                            if (lVar2.f46d == 3) {
                                lVar2.f47e.f28k.add(hVar);
                                hVar.f29l.add(this.f44b.f24322d.f47e);
                                hVar.f19a = this;
                            }
                        }
                    }
                }
            }
        }
        if (hVar.f29l.size() == 0) {
            hVar.f21c = true;
        }
    }

    @Override // A.p
    public final void e() {
        g gVar = this.f50h;
        if (gVar.f27j) {
            this.f44b.f24316Z = gVar.f25g;
        }
    }

    @Override // A.p
    public final void f() {
        this.f45c = null;
        this.f50h.c();
        this.i.c();
        this.f35k.c();
        this.f47e.c();
        this.f49g = false;
    }

    @Override // A.p
    public final boolean k() {
        return this.f46d != 3 || this.f44b.f24349s == 0;
    }

    public final void m() {
        this.f49g = false;
        g gVar = this.f50h;
        gVar.c();
        gVar.f27j = false;
        g gVar2 = this.i;
        gVar2.c();
        gVar2.f27j = false;
        g gVar3 = this.f35k;
        gVar3.c();
        gVar3.f27j = false;
        this.f47e.f27j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f44b.f24331h0;
    }
}
