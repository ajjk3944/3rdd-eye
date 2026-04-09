package i3;

import java.util.Arrays;
import yb.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f25834q = false;

    /* renamed from: d, reason: collision with root package name */
    public final d f25838d;

    /* renamed from: m, reason: collision with root package name */
    public final i0.f f25845m;

    /* renamed from: p, reason: collision with root package name */
    public b f25848p;

    /* renamed from: a, reason: collision with root package name */
    public int f25835a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25836b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f25837c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f25839e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f25840f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25841h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean[] f25842i = new boolean[32];
    public int j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f25843k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f25844l = 32;

    /* renamed from: n, reason: collision with root package name */
    public f[] f25846n = new f[1000];

    /* renamed from: o, reason: collision with root package name */
    public int f25847o = 0;
    public b[] g = new b[32];

    public c() {
        s();
        i0.f fVar = new i0.f(3, false);
        fVar.f25416b = new d4.d();
        fVar.f25417c = new d4.d();
        fVar.f25418d = new f[32];
        this.f25845m = fVar;
        d dVar = new d(fVar);
        dVar.f25849f = new f[128];
        dVar.g = new f[128];
        dVar.f25850h = 0;
        dVar.f25851i = new i(dVar);
        this.f25838d = dVar;
        this.f25848p = new b(fVar);
    }

    public static int n(Object obj) {
        f fVar = ((k3.c) obj).f27838i;
        if (fVar != null) {
            return (int) (fVar.f25857e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f a(int i4) {
        d4.d dVar = (d4.d) this.f25845m.f25417c;
        int i10 = dVar.f21976b;
        f fVar = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            ?? r32 = dVar.f21975a;
            ?? r42 = r32[i11];
            r32[i11] = 0;
            dVar.f21976b = i11;
            fVar = r42;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(i4);
            fVar2.f25862l = i4;
        } else {
            fVar2.c();
            fVar2.f25862l = i4;
        }
        int i12 = this.f25847o;
        int i13 = this.f25835a;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            this.f25835a = i14;
            this.f25846n = (f[]) Arrays.copyOf(this.f25846n, i14);
        }
        f[] fVarArr = this.f25846n;
        int i15 = this.f25847o;
        this.f25847o = i15 + 1;
        fVarArr[i15] = fVar2;
        return fVar2;
    }

    public final void b(f fVar, f fVar2, int i4, float f10, f fVar3, f fVar4, int i10, int i11) {
        b bVarL = l();
        if (fVar2 == fVar3) {
            bVarL.f25832d.g(fVar, 1.0f);
            bVarL.f25832d.g(fVar4, 1.0f);
            bVarL.f25832d.g(fVar2, -2.0f);
        } else if (f10 == 0.5f) {
            bVarL.f25832d.g(fVar, 1.0f);
            bVarL.f25832d.g(fVar2, -1.0f);
            bVarL.f25832d.g(fVar3, -1.0f);
            bVarL.f25832d.g(fVar4, 1.0f);
            if (i4 > 0 || i10 > 0) {
                bVarL.f25830b = (-i4) + i10;
            }
        } else if (f10 <= 0.0f) {
            bVarL.f25832d.g(fVar, -1.0f);
            bVarL.f25832d.g(fVar2, 1.0f);
            bVarL.f25830b = i4;
        } else if (f10 >= 1.0f) {
            bVarL.f25832d.g(fVar4, -1.0f);
            bVarL.f25832d.g(fVar3, 1.0f);
            bVarL.f25830b = -i10;
        } else {
            float f11 = 1.0f - f10;
            bVarL.f25832d.g(fVar, f11 * 1.0f);
            bVarL.f25832d.g(fVar2, f11 * (-1.0f));
            bVarL.f25832d.g(fVar3, (-1.0f) * f10);
            bVarL.f25832d.g(fVar4, 1.0f * f10);
            if (i4 > 0 || i10 > 0) {
                bVarL.f25830b = (i10 * f10) + ((-i4) * f11);
            }
        }
        if (i11 != 8) {
            bVarL.a(this, i11);
        }
        c(bVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(i3.b r18) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.c.c(i3.b):void");
    }

    public final void d(f fVar, int i4) {
        int i10 = fVar.f25855c;
        if (i10 == -1) {
            fVar.d(this, i4);
            for (int i11 = 0; i11 < this.f25837c + 1; i11++) {
                f fVar2 = ((f[]) this.f25845m.f25418d)[i11];
            }
            return;
        }
        if (i10 == -1) {
            b bVarL = l();
            bVarL.f25829a = fVar;
            float f10 = i4;
            fVar.f25857e = f10;
            bVarL.f25830b = f10;
            bVarL.f25833e = true;
            c(bVarL);
            return;
        }
        b bVar = this.g[i10];
        if (bVar.f25833e) {
            bVar.f25830b = i4;
            return;
        }
        if (bVar.f25832d.d() == 0) {
            bVar.f25833e = true;
            bVar.f25830b = i4;
            return;
        }
        b bVarL2 = l();
        if (i4 < 0) {
            bVarL2.f25830b = i4 * (-1);
            bVarL2.f25832d.g(fVar, 1.0f);
        } else {
            bVarL2.f25830b = i4;
            bVarL2.f25832d.g(fVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(f fVar, f fVar2, int i4, int i10) {
        if (i10 == 8 && fVar2.f25858f && fVar.f25855c == -1) {
            fVar.d(this, fVar2.f25857e + i4);
            return;
        }
        b bVarL = l();
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            }
            bVarL.f25830b = i4;
        }
        if (z3) {
            bVarL.f25832d.g(fVar, 1.0f);
            bVarL.f25832d.g(fVar2, -1.0f);
        } else {
            bVarL.f25832d.g(fVar, -1.0f);
            bVarL.f25832d.g(fVar2, 1.0f);
        }
        if (i10 != 8) {
            bVarL.a(this, i10);
        }
        c(bVarL);
    }

    public final void f(f fVar, f fVar2, int i4, int i10) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f25856d = 0;
        bVarL.b(fVar, fVar2, fVarM, i4);
        if (i10 != 8) {
            bVarL.f25832d.g(j(i10), (int) (bVarL.f25832d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(f fVar, f fVar2, int i4, int i10) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f25856d = 0;
        bVarL.c(fVar, fVar2, fVarM, i4);
        if (i10 != 8) {
            bVarL.f25832d.g(j(i10), (int) (bVarL.f25832d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i4;
        if (bVar.f25833e) {
            bVar.f25829a.d(this, bVar.f25830b);
        } else {
            b[] bVarArr = this.g;
            int i10 = this.f25843k;
            bVarArr[i10] = bVar;
            f fVar = bVar.f25829a;
            fVar.f25855c = i10;
            this.f25843k = i10 + 1;
            fVar.e(this, bVar);
        }
        if (this.f25836b) {
            int i11 = 0;
            while (i11 < this.f25843k) {
                if (this.g[i11] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.g[i11];
                if (bVar2 != null && bVar2.f25833e) {
                    bVar2.f25829a.d(this, bVar2.f25830b);
                    ((d4.d) this.f25845m.f25416b).a(bVar2);
                    this.g[i11] = null;
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (true) {
                        i4 = this.f25843k;
                        if (i12 >= i4) {
                            break;
                        }
                        b[] bVarArr2 = this.g;
                        int i14 = i12 - 1;
                        b bVar3 = bVarArr2[i12];
                        bVarArr2[i14] = bVar3;
                        f fVar2 = bVar3.f25829a;
                        if (fVar2.f25855c == i12) {
                            fVar2.f25855c = i14;
                        }
                        i13 = i12;
                        i12++;
                    }
                    if (i13 < i4) {
                        this.g[i13] = null;
                    }
                    this.f25843k = i4 - 1;
                    i11--;
                }
                i11++;
            }
            this.f25836b = false;
        }
    }

    public final void i() {
        for (int i4 = 0; i4 < this.f25843k; i4++) {
            b bVar = this.g[i4];
            bVar.f25829a.f25857e = bVar.f25830b;
        }
    }

    public final f j(int i4) {
        if (this.j + 1 >= this.f25840f) {
            o();
        }
        f fVarA = a(4);
        float[] fArr = fVarA.f25859h;
        int i10 = this.f25837c + 1;
        this.f25837c = i10;
        this.j++;
        fVarA.f25854b = i10;
        fVarA.f25856d = i4;
        ((f[]) this.f25845m.f25418d)[i10] = fVarA;
        d dVar = this.f25838d;
        dVar.f25851i.f37516b = fVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[fVarA.f25856d] = 1.0f;
        dVar.j(fVarA);
        return fVarA;
    }

    public final f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f25840f) {
            o();
        }
        if (!(obj instanceof k3.c)) {
            return null;
        }
        k3.c cVar = (k3.c) obj;
        f fVar = cVar.f27838i;
        if (fVar == null) {
            cVar.k();
            fVar = cVar.f27838i;
        }
        int i4 = fVar.f25854b;
        i0.f fVar2 = this.f25845m;
        if (i4 != -1 && i4 <= this.f25837c && ((f[]) fVar2.f25418d)[i4] != null) {
            return fVar;
        }
        if (i4 != -1) {
            fVar.c();
        }
        int i10 = this.f25837c + 1;
        this.f25837c = i10;
        this.j++;
        fVar.f25854b = i10;
        fVar.f25862l = 1;
        ((f[]) fVar2.f25418d)[i10] = fVar;
        return fVar;
    }

    public final b l() {
        Object obj;
        i0.f fVar = this.f25845m;
        d4.d dVar = (d4.d) fVar.f25416b;
        int i4 = dVar.f21976b;
        if (i4 > 0) {
            int i10 = i4 - 1;
            Object[] objArr = dVar.f21975a;
            obj = objArr[i10];
            objArr[i10] = null;
            dVar.f21976b = i10;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(fVar);
        }
        bVar.f25829a = null;
        bVar.f25832d.b();
        bVar.f25830b = 0.0f;
        bVar.f25833e = false;
        return bVar;
    }

    public final f m() {
        if (this.j + 1 >= this.f25840f) {
            o();
        }
        f fVarA = a(3);
        int i4 = this.f25837c + 1;
        this.f25837c = i4;
        this.j++;
        fVarA.f25854b = i4;
        ((f[]) this.f25845m.f25418d)[i4] = fVarA;
        return fVarA;
    }

    public final void o() {
        int i4 = this.f25839e * 2;
        this.f25839e = i4;
        this.g = (b[]) Arrays.copyOf(this.g, i4);
        i0.f fVar = this.f25845m;
        fVar.f25418d = (f[]) Arrays.copyOf((f[]) fVar.f25418d, this.f25839e);
        int i10 = this.f25839e;
        this.f25842i = new boolean[i10];
        this.f25840f = i10;
        this.f25844l = i10;
    }

    public final void p() {
        d dVar = this.f25838d;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f25841h) {
            q(dVar);
            return;
        }
        for (int i4 = 0; i4 < this.f25843k; i4++) {
            if (!this.g[i4].f25833e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        int i4 = 0;
        while (true) {
            if (i4 >= this.f25843k) {
                break;
            }
            b bVar = this.g[i4];
            int i10 = 1;
            if (bVar.f25829a.f25862l != 1) {
                float f10 = 0.0f;
                if (bVar.f25830b < 0.0f) {
                    boolean z3 = false;
                    int i11 = 0;
                    while (!z3) {
                        i11 += i10;
                        float f11 = Float.MAX_VALUE;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < this.f25843k) {
                            b bVar2 = this.g[i14];
                            if (bVar2.f25829a.f25862l != i10 && !bVar2.f25833e && bVar2.f25830b < f10) {
                                int iD = bVar2.f25832d.d();
                                int i16 = 0;
                                while (i16 < iD) {
                                    f fVarE = bVar2.f25832d.e(i16);
                                    float fC = bVar2.f25832d.c(fVarE);
                                    if (fC > f10) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f12 = fVarE.g[i17] / fC;
                                            if ((f12 < f11 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i13 = fVarE.f25854b;
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
                            i10 = 1;
                        }
                        if (i12 != -1) {
                            b bVar3 = this.g[i12];
                            bVar3.f25829a.f25855c = -1;
                            bVar3.g(((f[]) this.f25845m.f25418d)[i13]);
                            f fVar = bVar3.f25829a;
                            fVar.f25855c = i12;
                            fVar.e(this, bVar3);
                        } else {
                            z3 = true;
                        }
                        if (i11 > this.j / 2) {
                            z3 = true;
                        }
                        f10 = 0.0f;
                        i10 = 1;
                    }
                }
            }
            i4++;
        }
        r(dVar);
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(i3.b r17) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.c.r(i3.b):void");
    }

    public final void s() {
        for (int i4 = 0; i4 < this.f25843k; i4++) {
            b bVar = this.g[i4];
            if (bVar != null) {
                ((d4.d) this.f25845m.f25416b).a(bVar);
            }
            this.g[i4] = null;
        }
    }

    public final void t() {
        i0.f fVar;
        int i4 = 0;
        while (true) {
            fVar = this.f25845m;
            f[] fVarArr = (f[]) fVar.f25418d;
            if (i4 >= fVarArr.length) {
                break;
            }
            f fVar2 = fVarArr[i4];
            if (fVar2 != null) {
                fVar2.c();
            }
            i4++;
        }
        d4.d dVar = (d4.d) fVar.f25417c;
        f[] fVarArr2 = this.f25846n;
        int length = this.f25847o;
        dVar.getClass();
        if (length > fVarArr2.length) {
            length = fVarArr2.length;
        }
        for (int i10 = 0; i10 < length; i10++) {
            f fVar3 = fVarArr2[i10];
            int i11 = dVar.f21976b;
            Object[] objArr = dVar.f21975a;
            if (i11 < objArr.length) {
                objArr[i11] = fVar3;
                dVar.f21976b = i11 + 1;
            }
        }
        this.f25847o = 0;
        Arrays.fill((f[]) fVar.f25418d, (Object) null);
        this.f25837c = 0;
        d dVar2 = this.f25838d;
        dVar2.f25850h = 0;
        dVar2.f25830b = 0.0f;
        this.j = 1;
        for (int i12 = 0; i12 < this.f25843k; i12++) {
            b bVar = this.g[i12];
        }
        s();
        this.f25843k = 0;
        this.f25848p = new b(fVar);
    }
}
