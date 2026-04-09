package x2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f24992q = false;

    /* renamed from: d, reason: collision with root package name */
    public final d f24996d;

    /* renamed from: m, reason: collision with root package name */
    public final qm.c f25003m;

    /* renamed from: p, reason: collision with root package name */
    public b f25006p;

    /* renamed from: a, reason: collision with root package name */
    public int f24993a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24994b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f24995c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f24997e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f24998f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25000h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean[] f25001i = new boolean[32];
    public int j = 1;
    public int k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f25002l = 32;

    /* renamed from: n, reason: collision with root package name */
    public f[] f25004n = new f[1000];

    /* renamed from: o, reason: collision with root package name */
    public int f25005o = 0;

    /* renamed from: g, reason: collision with root package name */
    public b[] f24999g = new b[32];

    public c() {
        s();
        qm.c cVar = new qm.c(19);
        cVar.f20918d = new t3.c();
        cVar.f20919g = new t3.c();
        cVar.f20920r = new f[32];
        this.f25003m = cVar;
        d dVar = new d(cVar);
        dVar.f25007f = new f[128];
        dVar.f25008g = new f[128];
        dVar.f25009h = 0;
        dVar.f25010i = new q3.a(18, dVar);
        this.f24996d = dVar;
        this.f25006p = new b(cVar);
    }

    public static int n(Object obj) {
        f fVar = ((z2.d) obj).f26534i;
        if (fVar != null) {
            return (int) (fVar.f25015x + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f a(e eVar) {
        t3.c cVar = (t3.c) this.f25003m.f20919g;
        int i10 = cVar.f22398b;
        f fVar = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            ?? r32 = cVar.f22397a;
            ?? r42 = r32[i11];
            r32[i11] = 0;
            cVar.f22398b = i11;
            fVar = r42;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(eVar);
            fVar2.E = eVar;
        } else {
            fVar2.c();
            fVar2.E = eVar;
        }
        int i12 = this.f25005o;
        int i13 = this.f24993a;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            this.f24993a = i14;
            this.f25004n = (f[]) Arrays.copyOf(this.f25004n, i14);
        }
        f[] fVarArr = this.f25004n;
        int i15 = this.f25005o;
        this.f25005o = i15 + 1;
        fVarArr[i15] = fVar2;
        return fVar2;
    }

    public final void b(f fVar, f fVar2, int i10, float f10, f fVar3, f fVar4, int i11, int i12) {
        b bVarL = l();
        if (fVar2 == fVar3) {
            bVarL.f24990d.g(fVar, 1.0f);
            bVarL.f24990d.g(fVar4, 1.0f);
            bVarL.f24990d.g(fVar2, -2.0f);
        } else if (f10 == 0.5f) {
            bVarL.f24990d.g(fVar, 1.0f);
            bVarL.f24990d.g(fVar2, -1.0f);
            bVarL.f24990d.g(fVar3, -1.0f);
            bVarL.f24990d.g(fVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                bVarL.f24988b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            bVarL.f24990d.g(fVar, -1.0f);
            bVarL.f24990d.g(fVar2, 1.0f);
            bVarL.f24988b = i10;
        } else if (f10 >= 1.0f) {
            bVarL.f24990d.g(fVar4, -1.0f);
            bVarL.f24990d.g(fVar3, 1.0f);
            bVarL.f24988b = -i11;
        } else {
            float f11 = 1.0f - f10;
            bVarL.f24990d.g(fVar, f11 * 1.0f);
            bVarL.f24990d.g(fVar2, f11 * (-1.0f));
            bVarL.f24990d.g(fVar3, (-1.0f) * f10);
            bVarL.f24990d.g(fVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                bVarL.f24988b = (i11 * f10) + ((-i10) * f11);
            }
        }
        if (i12 != 8) {
            bVarL.a(this, i12);
        }
        c(bVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(x2.b r18) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.c.c(x2.b):void");
    }

    public final void d(f fVar, int i10) {
        int i11 = fVar.f25013g;
        if (i11 == -1) {
            fVar.d(this, i10);
            for (int i12 = 0; i12 < this.f24995c + 1; i12++) {
                f fVar2 = ((f[]) this.f25003m.f20920r)[i12];
            }
            return;
        }
        if (i11 == -1) {
            b bVarL = l();
            bVarL.f24987a = fVar;
            float f10 = i10;
            fVar.f25015x = f10;
            bVarL.f24988b = f10;
            bVarL.f24991e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f24999g[i11];
        if (bVar.f24991e) {
            bVar.f24988b = i10;
            return;
        }
        if (bVar.f24990d.d() == 0) {
            bVar.f24991e = true;
            bVar.f24988b = i10;
            return;
        }
        b bVarL2 = l();
        if (i10 < 0) {
            bVarL2.f24988b = i10 * (-1);
            bVarL2.f24990d.g(fVar, 1.0f);
        } else {
            bVarL2.f24988b = i10;
            bVarL2.f24990d.g(fVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(f fVar, f fVar2, int i10, int i11) {
        if (i11 == 8 && fVar2.f25016y && fVar.f25013g == -1) {
            fVar.d(this, fVar2.f25015x + i10);
            return;
        }
        b bVarL = l();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            bVarL.f24988b = i10;
        }
        if (z10) {
            bVarL.f24990d.g(fVar, 1.0f);
            bVarL.f24990d.g(fVar2, -1.0f);
        } else {
            bVarL.f24990d.g(fVar, -1.0f);
            bVarL.f24990d.g(fVar2, 1.0f);
        }
        if (i11 != 8) {
            bVarL.a(this, i11);
        }
        c(bVarL);
    }

    public final void f(f fVar, f fVar2, int i10, int i11) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f25014r = 0;
        bVarL.b(fVar, fVar2, fVarM, i10);
        if (i11 != 8) {
            bVarL.f24990d.g(j(i11), (int) (bVarL.f24990d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(f fVar, f fVar2, int i10, int i11) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f25014r = 0;
        bVarL.c(fVar, fVar2, fVarM, i10);
        if (i11 != 8) {
            bVarL.f24990d.g(j(i11), (int) (bVarL.f24990d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i10;
        if (bVar.f24991e) {
            bVar.f24987a.d(this, bVar.f24988b);
        } else {
            b[] bVarArr = this.f24999g;
            int i11 = this.k;
            bVarArr[i11] = bVar;
            f fVar = bVar.f24987a;
            fVar.f25013g = i11;
            this.k = i11 + 1;
            fVar.e(this, bVar);
        }
        if (this.f24994b) {
            int i12 = 0;
            while (i12 < this.k) {
                if (this.f24999g[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f24999g[i12];
                if (bVar2 != null && bVar2.f24991e) {
                    bVar2.f24987a.d(this, bVar2.f24988b);
                    ((t3.c) this.f25003m.f20918d).b(bVar2);
                    this.f24999g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.k;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f24999g;
                        int i15 = i13 - 1;
                        b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        f fVar2 = bVar3.f24987a;
                        if (fVar2.f25013g == i13) {
                            fVar2.f25013g = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f24999g[i14] = null;
                    }
                    this.k = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f24994b = false;
        }
    }

    public final void i() {
        for (int i10 = 0; i10 < this.k; i10++) {
            b bVar = this.f24999g[i10];
            bVar.f24987a.f25015x = bVar.f24988b;
        }
    }

    public final f j(int i10) {
        if (this.j + 1 >= this.f24998f) {
            o();
        }
        f fVarA = a(e.ERROR);
        float[] fArr = fVarA.D;
        int i11 = this.f24995c + 1;
        this.f24995c = i11;
        this.j++;
        fVarA.f25012d = i11;
        fVarA.f25014r = i10;
        ((f[]) this.f25003m.f20920r)[i11] = fVarA;
        d dVar = this.f24996d;
        dVar.f25010i.f20679d = fVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[fVarA.f25014r] = 1.0f;
        dVar.j(fVarA);
        return fVarA;
    }

    public final f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f24998f) {
            o();
        }
        if (!(obj instanceof z2.d)) {
            return null;
        }
        z2.d dVar = (z2.d) obj;
        f fVar = dVar.f26534i;
        if (fVar == null) {
            dVar.k();
            fVar = dVar.f26534i;
        }
        int i10 = fVar.f25012d;
        qm.c cVar = this.f25003m;
        if (i10 != -1 && i10 <= this.f24995c && ((f[]) cVar.f20920r)[i10] != null) {
            return fVar;
        }
        if (i10 != -1) {
            fVar.c();
        }
        int i11 = this.f24995c + 1;
        this.f24995c = i11;
        this.j++;
        fVar.f25012d = i11;
        fVar.E = e.UNRESTRICTED;
        ((f[]) cVar.f20920r)[i11] = fVar;
        return fVar;
    }

    public final b l() {
        Object obj;
        qm.c cVar = this.f25003m;
        t3.c cVar2 = (t3.c) cVar.f20918d;
        int i10 = cVar2.f22398b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = cVar2.f22397a;
            obj = objArr[i11];
            objArr[i11] = null;
            cVar2.f22398b = i11;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(cVar);
        }
        bVar.f24987a = null;
        bVar.f24990d.b();
        bVar.f24988b = 0.0f;
        bVar.f24991e = false;
        return bVar;
    }

    public final f m() {
        if (this.j + 1 >= this.f24998f) {
            o();
        }
        f fVarA = a(e.SLACK);
        int i10 = this.f24995c + 1;
        this.f24995c = i10;
        this.j++;
        fVarA.f25012d = i10;
        ((f[]) this.f25003m.f20920r)[i10] = fVarA;
        return fVarA;
    }

    public final void o() {
        int i10 = this.f24997e * 2;
        this.f24997e = i10;
        this.f24999g = (b[]) Arrays.copyOf(this.f24999g, i10);
        qm.c cVar = this.f25003m;
        cVar.f20920r = (f[]) Arrays.copyOf((f[]) cVar.f20920r, this.f24997e);
        int i11 = this.f24997e;
        this.f25001i = new boolean[i11];
        this.f24998f = i11;
        this.f25002l = i11;
    }

    public final void p() {
        d dVar = this.f24996d;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f25000h) {
            q(dVar);
            return;
        }
        for (int i10 = 0; i10 < this.k; i10++) {
            if (!this.f24999g[i10].f24991e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        int i10 = 0;
        while (true) {
            if (i10 >= this.k) {
                break;
            }
            b bVar = this.f24999g[i10];
            if (bVar.f24987a.E != e.UNRESTRICTED) {
                float f10 = 0.0f;
                if (bVar.f24988b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        i11++;
                        float f11 = Float.MAX_VALUE;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < this.k) {
                            b bVar2 = this.f24999g[i14];
                            if (bVar2.f24987a.E != e.UNRESTRICTED && !bVar2.f24991e && bVar2.f24988b < f10) {
                                int iD = bVar2.f24990d.d();
                                int i16 = 0;
                                while (i16 < iD) {
                                    f fVarE = bVar2.f24990d.e(i16);
                                    float fC = bVar2.f24990d.c(fVarE);
                                    if (fC > f10) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f12 = fVarE.B[i17] / fC;
                                            if ((f12 < f11 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i13 = fVarE.f25012d;
                                                i12 = i14;
                                                f11 = f12;
                                            }
                                        }
                                    }
                                    i16++;
                                    f10 = 0.0f;
                                }
                            }
                            i14++;
                            f10 = 0.0f;
                        }
                        if (i12 != -1) {
                            b bVar3 = this.f24999g[i12];
                            bVar3.f24987a.f25013g = -1;
                            bVar3.g(((f[]) this.f25003m.f20920r)[i13]);
                            f fVar = bVar3.f24987a;
                            fVar.f25013g = i12;
                            fVar.e(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.j / 2) {
                            z10 = true;
                        }
                        f10 = 0.0f;
                    }
                }
            }
            i10++;
        }
        r(dVar);
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0094 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(x2.b r17) {
        /*
            Method dump skipped, instructions count: 178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.c.r(x2.b):void");
    }

    public final void s() {
        for (int i10 = 0; i10 < this.k; i10++) {
            b bVar = this.f24999g[i10];
            if (bVar != null) {
                ((t3.c) this.f25003m.f20918d).b(bVar);
            }
            this.f24999g[i10] = null;
        }
    }

    public final void t() {
        qm.c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f25003m;
            f[] fVarArr = (f[]) cVar.f20920r;
            if (i10 >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i10];
            if (fVar != null) {
                fVar.c();
            }
            i10++;
        }
        t3.c cVar2 = (t3.c) cVar.f20919g;
        f[] fVarArr2 = this.f25004n;
        int length = this.f25005o;
        cVar2.getClass();
        if (length > fVarArr2.length) {
            length = fVarArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            f fVar2 = fVarArr2[i11];
            int i12 = cVar2.f22398b;
            Object[] objArr = cVar2.f22397a;
            if (i12 < objArr.length) {
                objArr[i12] = fVar2;
                cVar2.f22398b = i12 + 1;
            }
        }
        this.f25005o = 0;
        Arrays.fill((f[]) cVar.f20920r, (Object) null);
        this.f24995c = 0;
        d dVar = this.f24996d;
        dVar.f25009h = 0;
        dVar.f24988b = 0.0f;
        this.j = 1;
        for (int i13 = 0; i13 < this.k; i13++) {
            b bVar = this.f24999g[i13];
        }
        s();
        this.k = 0;
        this.f25006p = new b(cVar);
    }
}
