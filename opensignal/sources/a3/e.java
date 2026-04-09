package a3;

import cv.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import mq.b0;
import mq.x;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f43b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f44c;

    /* renamed from: d, reason: collision with root package name */
    public Object f45d;

    /* renamed from: e, reason: collision with root package name */
    public Object f46e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f47f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f48g;

    /* renamed from: h, reason: collision with root package name */
    public Object f49h;

    /* renamed from: i, reason: collision with root package name */
    public Object f50i;

    public /* synthetic */ e() {
    }

    public void a(g gVar, int i10, ArrayList arrayList, n nVar) {
        t tVar = gVar.f54d;
        n nVar2 = tVar.f77c;
        g gVar2 = tVar.f83i;
        g gVar3 = tVar.f82h;
        if (nVar2 == null) {
            z2.h hVar = (z2.h) this.f45d;
            if (tVar == hVar.f26542d || tVar == hVar.f26544e) {
                return;
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f64a = null;
                nVar.f65b = new ArrayList();
                nVar.f64a = tVar;
                arrayList.add(nVar);
            }
            tVar.f77c = nVar;
            nVar.f65b.add(tVar);
            Iterator it = gVar3.k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar instanceof g) {
                    a((g) dVar, i10, arrayList, nVar);
                }
            }
            Iterator it2 = gVar2.k.iterator();
            while (it2.hasNext()) {
                d dVar2 = (d) it2.next();
                if (dVar2 instanceof g) {
                    a((g) dVar2, i10, arrayList, nVar);
                }
            }
            if (i10 == 1 && (tVar instanceof p)) {
                Iterator it3 = ((p) tVar).k.k.iterator();
                while (it3.hasNext()) {
                    d dVar3 = (d) it3.next();
                    if (dVar3 instanceof g) {
                        a((g) dVar3, i10, arrayList, nVar);
                    }
                }
            }
            Iterator it4 = gVar3.f60l.iterator();
            while (it4.hasNext()) {
                a((g) it4.next(), i10, arrayList, nVar);
            }
            Iterator it5 = gVar2.f60l.iterator();
            while (it5.hasNext()) {
                a((g) it5.next(), i10, arrayList, nVar);
            }
            if (i10 == 1 && (tVar instanceof p)) {
                Iterator it6 = ((p) tVar).k.f60l.iterator();
                while (it6.hasNext()) {
                    a((g) it6.next(), i10, arrayList, nVar);
                }
            }
        }
    }

    public void b(z2.h hVar) {
        float f10;
        z2.f fVar;
        int i10;
        int i11;
        z2.f fVar2;
        e eVar;
        z2.f fVar3;
        z2.f fVar4;
        z2.f fVar5;
        z2.f fVar6;
        ArrayList arrayList = hVar.f26576q0;
        z2.f[] fVarArr = hVar.T;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z2.g gVar = (z2.g) it.next();
            z2.f[] fVarArr2 = gVar.T;
            z2.d[] dVarArr = gVar.Q;
            z2.d dVar = gVar.L;
            z2.d dVar2 = gVar.J;
            z2.d dVar3 = gVar.K;
            z2.d dVar4 = gVar.I;
            z2.f fVar7 = fVarArr2[0];
            z2.f fVar8 = fVarArr2[1];
            if (gVar.f26551h0 == 8) {
                gVar.f26536a = true;
            } else {
                float f11 = gVar.f26572w;
                if (f11 < 1.0f && fVar7 == z2.f.MATCH_CONSTRAINT) {
                    gVar.f26567r = 2;
                }
                float f12 = gVar.f26575z;
                if (f12 < 1.0f) {
                    f10 = 1.0f;
                    if (fVar8 == z2.f.MATCH_CONSTRAINT) {
                        gVar.f26568s = 2;
                    }
                } else {
                    f10 = 1.0f;
                }
                if (gVar.X > 0.0f) {
                    z2.f fVar9 = z2.f.MATCH_CONSTRAINT;
                    if (fVar7 == fVar9 && (fVar8 == z2.f.WRAP_CONTENT || fVar8 == z2.f.FIXED)) {
                        gVar.f26567r = 3;
                    } else if (fVar8 == fVar9 && (fVar7 == z2.f.WRAP_CONTENT || fVar7 == z2.f.FIXED)) {
                        gVar.f26568s = 3;
                    } else if (fVar7 == fVar9 && fVar8 == fVar9) {
                        if (gVar.f26567r == 0) {
                            gVar.f26567r = 3;
                        }
                        if (gVar.f26568s == 0) {
                            gVar.f26568s = 3;
                        }
                    }
                }
                z2.f fVar10 = z2.f.MATCH_CONSTRAINT;
                if (fVar7 == fVar10 && gVar.f26567r == 1 && (dVar4.f26531f == null || dVar3.f26531f == null)) {
                    fVar7 = z2.f.WRAP_CONTENT;
                }
                if (fVar8 == fVar10 && gVar.f26568s == 1 && (dVar2.f26531f == null || dVar.f26531f == null)) {
                    fVar8 = z2.f.WRAP_CONTENT;
                }
                m mVar = gVar.f26542d;
                mVar.f78d = fVar7;
                int i12 = gVar.f26567r;
                mVar.f75a = i12;
                p pVar = gVar.f26544e;
                pVar.f78d = fVar8;
                int i13 = gVar.f26568s;
                pVar.f75a = i13;
                z2.f fVar11 = z2.f.MATCH_PARENT;
                Iterator it2 = it;
                if ((fVar7 == fVar11 || fVar7 == z2.f.FIXED || fVar7 == z2.f.WRAP_CONTENT) && (fVar8 == fVar11 || fVar8 == z2.f.FIXED || fVar8 == z2.f.WRAP_CONTENT)) {
                    z2.f fVar12 = fVar8;
                    int iQ = gVar.q();
                    if (fVar7 == fVar11) {
                        iQ = (hVar.q() - dVar4.f26532g) - dVar3.f26532g;
                        fVar7 = z2.f.FIXED;
                    }
                    int iK = gVar.k();
                    if (fVar12 == fVar11) {
                        int iK2 = (hVar.k() - dVar2.f26532g) - dVar.f26532g;
                        fVar = z2.f.FIXED;
                        eVar = this;
                        i10 = iQ;
                        i11 = iK2;
                        fVar2 = fVar7;
                    } else {
                        fVar = fVar12;
                        i10 = iQ;
                        i11 = iK;
                        fVar2 = fVar7;
                        eVar = this;
                    }
                    eVar.f(gVar, fVar2, i10, fVar, i11);
                    gVar.f26542d.f79e.d(gVar.q());
                    gVar.f26544e.f79e.d(gVar.k());
                    gVar.f26536a = true;
                } else {
                    if (fVar7 != fVar10 || (fVar8 != (fVar6 = z2.f.WRAP_CONTENT) && fVar8 != z2.f.FIXED)) {
                        fVar3 = fVar8;
                    } else if (i12 == 3) {
                        if (fVar8 == fVar6) {
                            f(gVar, fVar6, 0, fVar6, 0);
                        }
                        int iK3 = gVar.k();
                        int i14 = (int) ((iK3 * gVar.X) + 0.5f);
                        z2.f fVar13 = z2.f.FIXED;
                        f(gVar, fVar13, i14, fVar13, iK3);
                        gVar.f26542d.f79e.d(gVar.q());
                        gVar.f26544e.f79e.d(gVar.k());
                        gVar.f26536a = true;
                    } else if (i12 == 1) {
                        f(gVar, fVar6, 0, fVar8, 0);
                        gVar.f26542d.f79e.f61m = gVar.q();
                    } else {
                        fVar3 = fVar8;
                        if (i12 == 2) {
                            z2.f fVar14 = fVarArr[0];
                            z2.f fVar15 = z2.f.FIXED;
                            if (fVar14 == fVar15 || fVar14 == fVar11) {
                                f(gVar, fVar15, (int) ((f11 * hVar.q()) + 0.5f), fVar3, gVar.k());
                                gVar.f26542d.f79e.d(gVar.q());
                                gVar.f26544e.f79e.d(gVar.k());
                                gVar.f26536a = true;
                            }
                        } else if (dVarArr[0].f26531f == null || dVarArr[1].f26531f == null) {
                            f(gVar, fVar6, 0, fVar3, 0);
                            gVar.f26542d.f79e.d(gVar.q());
                            gVar.f26544e.f79e.d(gVar.k());
                            gVar.f26536a = true;
                        }
                    }
                    if (fVar3 != fVar10 || (fVar7 != (fVar5 = z2.f.WRAP_CONTENT) && fVar7 != z2.f.FIXED)) {
                        fVar4 = fVar3;
                    } else if (i13 == 3) {
                        if (fVar7 == fVar5) {
                            f(gVar, fVar5, 0, fVar5, 0);
                        }
                        int iQ2 = gVar.q();
                        float f13 = gVar.X;
                        if (gVar.Y == -1) {
                            f13 = f10 / f13;
                        }
                        z2.f fVar16 = z2.f.FIXED;
                        f(gVar, fVar16, iQ2, fVar16, (int) ((iQ2 * f13) + 0.5f));
                        gVar.f26542d.f79e.d(gVar.q());
                        gVar.f26544e.f79e.d(gVar.k());
                        gVar.f26536a = true;
                    } else if (i13 == 1) {
                        f(gVar, fVar7, 0, fVar5, 0);
                        gVar.f26544e.f79e.f61m = gVar.k();
                    } else {
                        z2.f fVar17 = fVar7;
                        if (i13 == 2) {
                            z2.f fVar18 = fVarArr[1];
                            z2.f fVar19 = fVar3;
                            z2.f fVar20 = z2.f.FIXED;
                            if (fVar18 == fVar20 || fVar18 == fVar11) {
                                f(gVar, fVar17, gVar.q(), fVar20, (int) ((f12 * hVar.k()) + 0.5f));
                                gVar.f26542d.f79e.d(gVar.q());
                                gVar.f26544e.f79e.d(gVar.k());
                                gVar.f26536a = true;
                            } else {
                                fVar4 = fVar19;
                                fVar7 = fVar17;
                            }
                        } else {
                            fVar7 = fVar17;
                            z2.f fVar21 = fVar3;
                            if (dVarArr[2].f26531f == null || dVarArr[3].f26531f == null) {
                                f(gVar, fVar5, 0, fVar21, 0);
                                gVar.f26542d.f79e.d(gVar.q());
                                gVar.f26544e.f79e.d(gVar.k());
                                gVar.f26536a = true;
                            } else {
                                fVar4 = fVar21;
                            }
                        }
                    }
                    if (fVar7 == fVar10 && fVar4 == fVar10) {
                        if (i12 == 1 || i13 == 1) {
                            z2.f fVar22 = z2.f.WRAP_CONTENT;
                            f(gVar, fVar22, 0, fVar22, 0);
                            gVar.f26542d.f79e.f61m = gVar.q();
                            gVar.f26544e.f79e.f61m = gVar.k();
                        } else if (i13 == 2 && i12 == 2) {
                            z2.f fVar23 = fVarArr[0];
                            z2.f fVar24 = z2.f.FIXED;
                            if (fVar23 == fVar24 && fVarArr[1] == fVar24) {
                                f(gVar, fVar24, (int) ((f11 * hVar.q()) + 0.5f), fVar24, (int) ((f12 * hVar.k()) + 0.5f));
                                gVar.f26542d.f79e.d(gVar.q());
                                gVar.f26544e.f79e.d(gVar.k());
                                gVar.f26536a = true;
                            }
                        }
                    }
                }
                it = it2;
            }
        }
    }

    public void c() {
        z2.h hVar = (z2.h) this.f45d;
        ArrayList arrayList = (ArrayList) this.f48g;
        ArrayList arrayList2 = (ArrayList) this.f47f;
        arrayList2.clear();
        z2.h hVar2 = (z2.h) this.f46e;
        hVar2.f26542d.f();
        hVar2.f26544e.f();
        arrayList2.add(hVar2.f26542d);
        arrayList2.add(hVar2.f26544e);
        Iterator it = hVar2.f26576q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            z2.g gVar = (z2.g) it.next();
            if (gVar instanceof z2.l) {
                j jVar = new j(gVar);
                gVar.f26542d.f();
                gVar.f26544e.f();
                jVar.f80f = ((z2.l) gVar).f26617u0;
                arrayList2.add(jVar);
            } else {
                if (gVar.x()) {
                    if (gVar.f26538b == null) {
                        gVar.f26538b = new c(gVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(gVar.f26538b);
                } else {
                    arrayList2.add(gVar.f26542d);
                }
                if (gVar.y()) {
                    if (gVar.f26540c == null) {
                        gVar.f26540c = new c(gVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(gVar.f26540c);
                } else {
                    arrayList2.add(gVar.f26544e);
                }
                if (gVar instanceof z2.m) {
                    arrayList2.add(new k(gVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((t) it2.next()).f();
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            t tVar = (t) it3.next();
            if (tVar.f76b != hVar2) {
                tVar.d();
            }
        }
        arrayList.clear();
        e(hVar.f26542d, 0, arrayList);
        e(hVar.f26544e, 1, arrayList);
        this.f43b = false;
    }

    public int d(z2.h hVar, int i10) {
        ArrayList arrayList;
        int i11;
        long jMax;
        float f10;
        z2.h hVar2 = hVar;
        ArrayList arrayList2 = (ArrayList) this.f48g;
        int size = arrayList2.size();
        long j = 0;
        int i12 = 0;
        long jMax2 = 0;
        while (i12 < size) {
            t tVar = ((n) arrayList2.get(i12)).f64a;
            if (!(tVar instanceof c) ? !(i10 != 0 ? (tVar instanceof p) : (tVar instanceof m)) : ((c) tVar).f80f != i10) {
                g gVar = (i10 == 0 ? hVar2.f26542d : hVar2.f26544e).f82h;
                g gVar2 = (i10 == 0 ? hVar2.f26542d : hVar2.f26544e).f83i;
                g gVar3 = tVar.f82h;
                g gVar4 = tVar.f83i;
                boolean zContains = gVar3.f60l.contains(gVar);
                boolean zContains2 = gVar4.f60l.contains(gVar2);
                long j7 = tVar.j();
                if (zContains && zContains2) {
                    long jB = n.b(gVar3, j);
                    long jA = n.a(gVar4, j);
                    long j10 = jB - j7;
                    int i13 = gVar4.f56f;
                    arrayList = arrayList2;
                    i11 = size;
                    if (j10 >= (-i13)) {
                        j10 += i13;
                    }
                    long j11 = gVar3.f56f;
                    long j12 = ((-jA) - j7) - j11;
                    if (j12 >= j11) {
                        j12 -= j11;
                    }
                    z2.g gVar5 = tVar.f76b;
                    if (i10 == 0) {
                        f10 = gVar5.f26545e0;
                    } else if (i10 == 1) {
                        f10 = gVar5.f26547f0;
                    } else {
                        gVar5.getClass();
                        f10 = -1.0f;
                    }
                    float f11 = f10 > 0.0f ? (long) ((j10 / (1.0f - f10)) + (j12 / f10)) : 0L;
                    jMax = (gVar3.f56f + ((((long) ((f11 * f10) + 0.5f)) + j7) + ((long) c7.a.a(1.0f, f10, f11, 0.5f)))) - gVar4.f56f;
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    jMax = zContains ? Math.max(n.b(gVar3, gVar3.f56f), gVar3.f56f + j7) : zContains2 ? Math.max(-n.a(gVar4, gVar4.f56f), (-gVar4.f56f) + j7) : (tVar.j() + gVar3.f56f) - gVar4.f56f;
                }
            } else {
                arrayList = arrayList2;
                i11 = size;
                jMax = j;
            }
            jMax2 = Math.max(jMax2, jMax);
            i12++;
            hVar2 = hVar;
            arrayList2 = arrayList;
            size = i11;
            j = 0;
        }
        return (int) jMax2;
    }

    public void e(t tVar, int i10, ArrayList arrayList) {
        g gVar = tVar.f82h;
        g gVar2 = tVar.f83i;
        Iterator it = gVar.k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar instanceof g) {
                a((g) dVar, i10, arrayList, null);
            } else if (dVar instanceof t) {
                a(((t) dVar).f82h, i10, arrayList, null);
            }
        }
        Iterator it2 = gVar2.k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof g) {
                a((g) dVar2, i10, arrayList, null);
            } else if (dVar2 instanceof t) {
                a(((t) dVar2).f83i, i10, arrayList, null);
            }
        }
        if (i10 == 1) {
            Iterator it3 = ((p) tVar).k.k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof g) {
                    a((g) dVar3, i10, arrayList, null);
                }
            }
        }
    }

    public void f(z2.g gVar, z2.f fVar, int i10, z2.f fVar2, int i11) {
        b bVar = (b) this.f50i;
        bVar.f32a = fVar;
        bVar.f33b = fVar2;
        bVar.f34c = i10;
        bVar.f35d = i11;
        ((c3.g) this.f49h).b(gVar, bVar);
        gVar.O(bVar.f36e);
        gVar.L(bVar.f37f);
        gVar.E = bVar.f39h;
        gVar.I(bVar.f38g);
    }

    public void g() {
        a aVar;
        Iterator it = ((z2.h) this.f45d).f26576q0.iterator();
        while (it.hasNext()) {
            z2.g gVar = (z2.g) it.next();
            if (!gVar.f26536a) {
                z2.f[] fVarArr = gVar.T;
                boolean z10 = false;
                z2.f fVar = fVarArr[0];
                z2.f fVar2 = fVarArr[1];
                int i10 = gVar.f26567r;
                int i11 = gVar.f26568s;
                z2.f fVar3 = z2.f.WRAP_CONTENT;
                boolean z11 = fVar == fVar3 || (fVar == z2.f.MATCH_CONSTRAINT && i10 == 1);
                if (fVar2 == fVar3 || (fVar2 == z2.f.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                h hVar = gVar.f26542d.f79e;
                boolean z12 = hVar.j;
                h hVar2 = gVar.f26544e.f79e;
                boolean z13 = hVar2.j;
                if (z12 && z13) {
                    z2.f fVar4 = z2.f.FIXED;
                    f(gVar, fVar4, hVar.f57g, fVar4, hVar2.f57g);
                    gVar.f26536a = true;
                } else if (z12 && z10) {
                    f(gVar, z2.f.FIXED, hVar.f57g, fVar3, hVar2.f57g);
                    if (fVar2 == z2.f.MATCH_CONSTRAINT) {
                        gVar.f26544e.f79e.f61m = gVar.k();
                    } else {
                        gVar.f26544e.f79e.d(gVar.k());
                        gVar.f26536a = true;
                    }
                } else if (z13 && z11) {
                    f(gVar, fVar3, hVar.f57g, z2.f.FIXED, hVar2.f57g);
                    if (fVar == z2.f.MATCH_CONSTRAINT) {
                        gVar.f26542d.f79e.f61m = gVar.q();
                    } else {
                        gVar.f26542d.f79e.d(gVar.q());
                        gVar.f26536a = true;
                    }
                }
                if (gVar.f26536a && (aVar = gVar.f26544e.f67l) != null) {
                    aVar.d(gVar.f26539b0);
                }
            }
        }
    }

    public String toString() {
        switch (this.f42a) {
            case 1:
                Map map = (Map) this.f50i;
                Long l10 = (Long) this.f49h;
                Long l11 = (Long) this.f48g;
                Long l12 = (Long) this.f47f;
                Long l13 = (Long) this.f46e;
                ArrayList arrayList = new ArrayList();
                if (this.f43b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f44c) {
                    arrayList.add("isDirectory");
                }
                if (l13 != null) {
                    arrayList.add("byteCount=" + l13);
                }
                if (l12 != null) {
                    arrayList.add("createdAt=" + l12);
                }
                if (l11 != null) {
                    arrayList.add("lastModifiedAt=" + l11);
                }
                if (l10 != null) {
                    arrayList.add("lastAccessedAt=" + l10);
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return mq.o.x0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public e(boolean z10, boolean z11, w wVar, Long l10, Long l11, Long l12, Long l13, Map map) {
        br.l.e(map, "extras");
        this.f43b = z10;
        this.f44c = z11;
        this.f45d = wVar;
        this.f46e = l10;
        this.f47f = l11;
        this.f48g = l12;
        this.f49h = l13;
        this.f50i = b0.W(map);
    }

    public /* synthetic */ e(boolean z10, boolean z11, w wVar, Long l10, Long l11, Long l12, Long l13) {
        this(z10, z11, wVar, l10, l11, l12, l13, x.f16946a);
    }
}
