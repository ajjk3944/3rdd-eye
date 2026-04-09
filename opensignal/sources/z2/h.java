package z2;

import a3.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h extends g {
    public int A0;
    public b[] B0;
    public b[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final a3.b L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f26576q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final bm.d f26577r0 = new bm.d(this);

    /* renamed from: s0, reason: collision with root package name */
    public final a3.e f26578s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f26579t0;

    /* renamed from: u0, reason: collision with root package name */
    public c3.g f26580u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f26581v0;

    /* renamed from: w0, reason: collision with root package name */
    public final x2.c f26582w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f26583x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f26584y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f26585z0;

    public h() {
        a3.e eVar = new a3.e();
        eVar.f43b = true;
        eVar.f44c = true;
        eVar.f47f = new ArrayList();
        new ArrayList();
        eVar.f49h = null;
        eVar.f50i = new a3.b();
        eVar.f48g = new ArrayList();
        eVar.f45d = this;
        eVar.f46e = this;
        this.f26578s0 = eVar;
        this.f26580u0 = null;
        this.f26581v0 = false;
        this.f26582w0 = new x2.c();
        this.f26585z0 = 0;
        this.A0 = 0;
        this.B0 = new b[4];
        this.C0 = new b[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new a3.b();
    }

    public static void V(g gVar, c3.g gVar2, a3.b bVar) {
        int i10;
        int i11;
        if (gVar2 == null) {
            return;
        }
        int i12 = gVar.f26551h0;
        int[] iArr = gVar.f26569t;
        if (i12 == 8 || (gVar instanceof l) || (gVar instanceof a)) {
            bVar.f36e = 0;
            bVar.f37f = 0;
            return;
        }
        f[] fVarArr = gVar.T;
        bVar.f32a = fVarArr[0];
        bVar.f33b = fVarArr[1];
        bVar.f34c = gVar.q();
        bVar.f35d = gVar.k();
        bVar.f40i = false;
        bVar.j = 0;
        f fVar = bVar.f32a;
        f fVar2 = f.MATCH_CONSTRAINT;
        boolean z10 = fVar == fVar2;
        boolean z11 = bVar.f33b == fVar2;
        boolean z12 = z10 && gVar.X > 0.0f;
        boolean z13 = z11 && gVar.X > 0.0f;
        if (z10 && gVar.t(0) && gVar.f26567r == 0 && !z12) {
            bVar.f32a = f.WRAP_CONTENT;
            if (z11 && gVar.f26568s == 0) {
                bVar.f32a = f.FIXED;
            }
            z10 = false;
        }
        if (z11 && gVar.t(1) && gVar.f26568s == 0 && !z13) {
            bVar.f33b = f.WRAP_CONTENT;
            if (z10 && gVar.f26567r == 0) {
                bVar.f33b = f.FIXED;
            }
            z11 = false;
        }
        if (gVar.A()) {
            bVar.f32a = f.FIXED;
            z10 = false;
        }
        if (gVar.B()) {
            bVar.f33b = f.FIXED;
            z11 = false;
        }
        if (z12) {
            if (iArr[0] == 4) {
                bVar.f32a = f.FIXED;
            } else if (!z11) {
                f fVar3 = bVar.f33b;
                f fVar4 = f.FIXED;
                if (fVar3 == fVar4) {
                    i11 = bVar.f35d;
                } else {
                    bVar.f32a = f.WRAP_CONTENT;
                    gVar2.b(gVar, bVar);
                    i11 = bVar.f37f;
                }
                bVar.f32a = fVar4;
                bVar.f34c = (int) (gVar.X * i11);
            }
        }
        if (z13) {
            if (iArr[1] == 4) {
                bVar.f33b = f.FIXED;
            } else if (!z10) {
                f fVar5 = bVar.f32a;
                f fVar6 = f.FIXED;
                if (fVar5 == fVar6) {
                    i10 = bVar.f34c;
                } else {
                    bVar.f33b = f.WRAP_CONTENT;
                    gVar2.b(gVar, bVar);
                    i10 = bVar.f36e;
                }
                bVar.f33b = fVar6;
                if (gVar.Y == -1) {
                    bVar.f35d = (int) (i10 / gVar.X);
                } else {
                    bVar.f35d = (int) (gVar.X * i10);
                }
            }
        }
        gVar2.b(gVar, bVar);
        gVar.O(bVar.f36e);
        gVar.L(bVar.f37f);
        gVar.E = bVar.f39h;
        gVar.I(bVar.f38g);
        bVar.j = 0;
    }

    @Override // z2.g
    public final void C() {
        this.f26582w0.t();
        this.f26583x0 = 0;
        this.f26584y0 = 0;
        this.f26576q0.clear();
        super.C();
    }

    @Override // z2.g
    public final void F(qm.c cVar) {
        super.F(cVar);
        int size = this.f26576q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) this.f26576q0.get(i10)).F(cVar);
        }
    }

    @Override // z2.g
    public final void P(boolean z10, boolean z11) {
        super.P(z10, z11);
        int size = this.f26576q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) this.f26576q0.get(i10)).P(z10, z11);
        }
    }

    public final void R(g gVar, int i10) {
        if (i10 == 0) {
            int i11 = this.f26585z0 + 1;
            b[] bVarArr = this.C0;
            if (i11 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i12 = this.f26585z0;
            bVarArr2[i12] = new b(gVar, 0, this.f26581v0);
            this.f26585z0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i13 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i14 = this.A0;
            bVarArr4[i14] = new b(gVar, 1, this.f26581v0);
            this.A0 = i14 + 1;
        }
    }

    public final void S(x2.c cVar) {
        h hVar;
        x2.c cVar2;
        boolean zW = W(64);
        b(cVar, zW);
        int size = this.f26576q0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f26576q0.get(i10);
            boolean[] zArr = gVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (gVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                g gVar2 = (g) this.f26576q0.get(i11);
                if (gVar2 instanceof a) {
                    a aVar = (a) gVar2;
                    for (int i12 = 0; i12 < aVar.f26620r0; i12++) {
                        g gVar3 = aVar.f26619q0[i12];
                        if (aVar.f26508t0 || gVar3.c()) {
                            int i13 = aVar.f26507s0;
                            if (i13 == 0 || i13 == 1) {
                                gVar3.S[0] = true;
                            } else if (i13 == 2 || i13 == 3) {
                                gVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i14 = 0; i14 < size; i14++) {
            g gVar4 = (g) this.f26576q0.get(i14);
            gVar4.getClass();
            boolean z11 = gVar4 instanceof j;
            if (z11 || (gVar4 instanceof l)) {
                if (z11) {
                    hashSet.add(gVar4);
                } else {
                    gVar4.b(cVar, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                j jVar = (j) ((g) it.next());
                for (int i15 = 0; i15 < jVar.f26620r0; i15++) {
                    if (hashSet.contains(jVar.f26619q0[i15])) {
                        jVar.b(cVar, zW);
                        hashSet.remove(jVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).b(cVar, zW);
                }
                hashSet.clear();
            }
        }
        if (x2.c.f24992q) {
            HashSet hashSet2 = new HashSet();
            for (int i16 = 0; i16 < size; i16++) {
                g gVar5 = (g) this.f26576q0.get(i16);
                gVar5.getClass();
                if (!(gVar5 instanceof j) && !(gVar5 instanceof l)) {
                    hashSet2.add(gVar5);
                }
            }
            hVar = this;
            cVar2 = cVar;
            hVar.a(this, cVar2, hashSet2, this.T[0] == f.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                g gVar6 = (g) it3.next();
                n.b(this, cVar2, gVar6);
                gVar6.b(cVar2, zW);
            }
        } else {
            hVar = this;
            cVar2 = cVar;
            for (int i17 = 0; i17 < size; i17++) {
                g gVar7 = (g) hVar.f26576q0.get(i17);
                if (gVar7 instanceof h) {
                    f[] fVarArr = gVar7.T;
                    f fVar = fVarArr[0];
                    f fVar2 = fVarArr[1];
                    f fVar3 = f.WRAP_CONTENT;
                    if (fVar == fVar3) {
                        gVar7.M(f.FIXED);
                    }
                    if (fVar2 == fVar3) {
                        gVar7.N(f.FIXED);
                    }
                    gVar7.b(cVar2, zW);
                    if (fVar == fVar3) {
                        gVar7.M(fVar);
                    }
                    if (fVar2 == fVar3) {
                        gVar7.N(fVar2);
                    }
                } else {
                    n.b(this, cVar2, gVar7);
                    if (!(gVar7 instanceof j) && !(gVar7 instanceof l)) {
                        gVar7.b(cVar2, zW);
                    }
                }
            }
        }
        if (hVar.f26585z0 > 0) {
            n.a(this, cVar2, null, 0);
        }
        if (hVar.A0 > 0) {
            n.a(this, cVar2, null, 1);
        }
    }

    public final boolean T(int i10, boolean z10) {
        boolean z11;
        f fVar;
        a3.e eVar = this.f26578s0;
        ArrayList arrayList = (ArrayList) eVar.f47f;
        h hVar = (h) eVar.f45d;
        boolean z12 = false;
        f fVarJ = hVar.j(0);
        f[] fVarArr = hVar.T;
        f fVarJ2 = hVar.j(1);
        int iR = hVar.r();
        int iS = hVar.s();
        if (z10 && (fVarJ == (fVar = f.WRAP_CONTENT) || fVarJ2 == fVar)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                t tVar = (t) it.next();
                if (tVar.f80f == i10 && !tVar.k()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && fVarJ == f.WRAP_CONTENT) {
                    hVar.M(f.FIXED);
                    hVar.O(eVar.d(hVar, 0));
                    hVar.f26542d.f79e.d(hVar.q());
                }
            } else if (z10 && fVarJ2 == f.WRAP_CONTENT) {
                hVar.N(f.FIXED);
                hVar.L(eVar.d(hVar, 1));
                hVar.f26544e.f79e.d(hVar.k());
            }
        }
        if (i10 == 0) {
            f fVar2 = fVarArr[0];
            if (fVar2 == f.FIXED || fVar2 == f.MATCH_PARENT) {
                int iQ = hVar.q() + iR;
                hVar.f26542d.f83i.d(iQ);
                hVar.f26542d.f79e.d(iQ - iR);
                z11 = true;
            }
            z11 = false;
        } else {
            f fVar3 = fVarArr[1];
            if (fVar3 == f.FIXED || fVar3 == f.MATCH_PARENT) {
                int iK = hVar.k() + iS;
                hVar.f26544e.f83i.d(iK);
                hVar.f26544e.f79e.d(iK - iS);
                z11 = true;
            }
            z11 = false;
        }
        eVar.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            t tVar2 = (t) it2.next();
            if (tVar2.f80f == i10 && (tVar2.f76b != hVar || tVar2.f81g)) {
                tVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z12 = true;
                break;
            }
            t tVar3 = (t) it3.next();
            if (tVar3.f80f == i10 && (z11 || tVar3.f76b != hVar)) {
                if (!tVar3.f82h.j || !tVar3.f83i.j || (!(tVar3 instanceof a3.c) && !tVar3.f79e.j)) {
                    break;
                }
            }
        }
        hVar.M(fVarJ);
        hVar.N(fVarJ2);
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:361:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0838 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08a3 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0915 A[PHI: r13 r14
  0x0915: PHI (r13v6 boolean) = (r13v5 boolean), (r13v8 boolean), (r13v8 boolean), (r13v8 boolean) binds: [B:513:0x08de, B:521:0x08fd, B:522:0x08ff, B:524:0x0905] A[DONT_GENERATE, DONT_INLINE]
  0x0915: PHI (r14v10 boolean) = (r14v9 boolean), (r14v14 boolean), (r14v14 boolean), (r14v14 boolean) binds: [B:513:0x08de, B:521:0x08fd, B:522:0x08ff, B:524:0x0905] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x091a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 2359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.h.U():void");
    }

    public final boolean W(int i10) {
        return (this.D0 & i10) == i10;
    }

    @Override // z2.g
    public final void n(StringBuilder sb2) {
        sb2.append(this.j + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.V);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.W);
        sb2.append("\n");
        Iterator it = this.f26576q0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).n(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
