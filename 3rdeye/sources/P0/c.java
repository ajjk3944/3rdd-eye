package p0;

import java.util.Arrays;
import p0.d.b;
import p0.e;
import r0.C5507d;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f44980p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f44981q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final d f44984c;

    /* renamed from: f, reason: collision with root package name */
    public b[] f44987f;

    /* renamed from: l, reason: collision with root package name */
    public final N5.c f44992l;

    /* renamed from: o, reason: collision with root package name */
    public b f44995o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f44982a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f44983b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f44985d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f44986e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f44988g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f44989h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f44990j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f44991k = 32;

    /* renamed from: m, reason: collision with root package name */
    public e[] f44993m = new e[f44981q];

    /* renamed from: n, reason: collision with root package name */
    public int f44994n = 0;

    /* compiled from: LinearSystem.java */
    public interface a {
        e a(boolean[] zArr);
    }

    public c() {
        this.f44987f = null;
        this.f44987f = new b[32];
        s();
        N5.c cVar = new N5.c();
        cVar.f4674b = new K0.d();
        cVar.f4675c = new K0.d();
        cVar.f4676d = new e[32];
        this.f44992l = cVar;
        d dVar = new d(cVar);
        dVar.f44996f = new e[128];
        dVar.f44997g = new e[128];
        dVar.f44998h = 0;
        dVar.i = dVar.new b();
        this.f44984c = dVar;
        this.f44995o = new b(cVar);
    }

    public static int n(Object obj) {
        e eVar = ((C5507d) obj).i;
        if (eVar != null) {
            return (int) (eVar.f45005f + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final e a(e.a aVar) {
        K0.d dVar = (K0.d) this.f44992l.f4675c;
        int i = dVar.f2943b;
        e eVar = null;
        if (i > 0) {
            int i10 = i - 1;
            ?? r32 = dVar.f2942a;
            ?? r42 = r32[i10];
            r32[i10] = 0;
            dVar.f2943b = i10;
            eVar = r42;
        }
        e eVar2 = eVar;
        if (eVar2 == null) {
            eVar2 = new e(aVar);
            eVar2.f45008j = aVar;
        } else {
            eVar2.c();
            eVar2.f45008j = aVar;
        }
        int i11 = this.f44994n;
        int i12 = f44981q;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            f44981q = i13;
            this.f44993m = (e[]) Arrays.copyOf(this.f44993m, i13);
        }
        e[] eVarArr = this.f44993m;
        int i14 = this.f44994n;
        this.f44994n = i14 + 1;
        eVarArr[i14] = eVar2;
        return eVar2;
    }

    public final void b(e eVar, e eVar2, int i, float f10, e eVar3, e eVar4, int i10, int i11) {
        b bVarL = l();
        if (eVar2 == eVar3) {
            bVarL.f44978d.c(eVar, 1.0f);
            bVarL.f44978d.c(eVar4, 1.0f);
            bVarL.f44978d.c(eVar2, -2.0f);
        } else if (f10 == 0.5f) {
            bVarL.f44978d.c(eVar, 1.0f);
            bVarL.f44978d.c(eVar2, -1.0f);
            bVarL.f44978d.c(eVar3, -1.0f);
            bVarL.f44978d.c(eVar4, 1.0f);
            if (i > 0 || i10 > 0) {
                bVarL.f44976b = (-i) + i10;
            }
        } else if (f10 <= 0.0f) {
            bVarL.f44978d.c(eVar, -1.0f);
            bVarL.f44978d.c(eVar2, 1.0f);
            bVarL.f44976b = i;
        } else if (f10 >= 1.0f) {
            bVarL.f44978d.c(eVar4, -1.0f);
            bVarL.f44978d.c(eVar3, 1.0f);
            bVarL.f44976b = -i10;
        } else {
            float f11 = 1.0f - f10;
            bVarL.f44978d.c(eVar, f11 * 1.0f);
            bVarL.f44978d.c(eVar2, f11 * (-1.0f));
            bVarL.f44978d.c(eVar3, (-1.0f) * f10);
            bVarL.f44978d.c(eVar4, 1.0f * f10);
            if (i > 0 || i10 > 0) {
                bVarL.f44976b = (i10 * f10) + ((-i) * f11);
            }
        }
        if (i11 != 8) {
            bVarL.b(this, i11);
        }
        c(bVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(p0.b r18) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.c.c(p0.b):void");
    }

    public final void d(e eVar, int i) {
        int i10 = eVar.f45003d;
        if (i10 == -1) {
            eVar.d(this, i);
            for (int i11 = 0; i11 < this.f44983b + 1; i11++) {
                e eVar2 = ((e[]) this.f44992l.f4676d)[i11];
            }
            return;
        }
        if (i10 == -1) {
            b bVarL = l();
            bVarL.f44975a = eVar;
            float f10 = i;
            eVar.f45005f = f10;
            bVarL.f44976b = f10;
            bVarL.f44979e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f44987f[i10];
        if (bVar.f44979e) {
            bVar.f44976b = i;
            return;
        }
        if (bVar.f44978d.d() == 0) {
            bVar.f44979e = true;
            bVar.f44976b = i;
            return;
        }
        b bVarL2 = l();
        if (i < 0) {
            bVarL2.f44976b = i * (-1);
            bVarL2.f44978d.c(eVar, 1.0f);
        } else {
            bVarL2.f44976b = i;
            bVarL2.f44978d.c(eVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(e eVar, e eVar2, int i, int i10) {
        if (i10 == 8 && eVar2.f45006g && eVar.f45003d == -1) {
            eVar.d(this, eVar2.f45005f + i);
            return;
        }
        b bVarL = l();
        boolean z10 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z10 = true;
            }
            bVarL.f44976b = i;
        }
        if (z10) {
            bVarL.f44978d.c(eVar, 1.0f);
            bVarL.f44978d.c(eVar2, -1.0f);
        } else {
            bVarL.f44978d.c(eVar, -1.0f);
            bVarL.f44978d.c(eVar2, 1.0f);
        }
        if (i10 != 8) {
            bVarL.b(this, i10);
        }
        c(bVarL);
    }

    public final void f(e eVar, e eVar2, int i, int i10) {
        b bVarL = l();
        e eVarM = m();
        eVarM.f45004e = 0;
        bVarL.c(eVar, eVar2, eVarM, i);
        if (i10 != 8) {
            bVarL.f44978d.c(j(i10), (int) (bVarL.f44978d.e(eVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(e eVar, e eVar2, int i, int i10) {
        b bVarL = l();
        e eVarM = m();
        eVarM.f45004e = 0;
        bVarL.d(eVar, eVar2, eVarM, i);
        if (i10 != 8) {
            bVarL.f44978d.c(j(i10), (int) (bVarL.f44978d.e(eVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i;
        if (bVar.f44979e) {
            bVar.f44975a.d(this, bVar.f44976b);
        } else {
            b[] bVarArr = this.f44987f;
            int i10 = this.f44990j;
            bVarArr[i10] = bVar;
            e eVar = bVar.f44975a;
            eVar.f45003d = i10;
            this.f44990j = i10 + 1;
            eVar.e(this, bVar);
        }
        if (this.f44982a) {
            int i11 = 0;
            while (i11 < this.f44990j) {
                if (this.f44987f[i11] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f44987f[i11];
                if (bVar2 != null && bVar2.f44979e) {
                    bVar2.f44975a.d(this, bVar2.f44976b);
                    ((K0.d) this.f44992l.f4674b).b(bVar2);
                    this.f44987f[i11] = null;
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (true) {
                        i = this.f44990j;
                        if (i12 >= i) {
                            break;
                        }
                        b[] bVarArr2 = this.f44987f;
                        int i14 = i12 - 1;
                        b bVar3 = bVarArr2[i12];
                        bVarArr2[i14] = bVar3;
                        e eVar2 = bVar3.f44975a;
                        if (eVar2.f45003d == i12) {
                            eVar2.f45003d = i14;
                        }
                        i13 = i12;
                        i12++;
                    }
                    if (i13 < i) {
                        this.f44987f[i13] = null;
                    }
                    this.f44990j = i - 1;
                    i11--;
                }
                i11++;
            }
            this.f44982a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f44990j; i++) {
            b bVar = this.f44987f[i];
            bVar.f44975a.f45005f = bVar.f44976b;
        }
    }

    public final e j(int i) {
        if (this.i + 1 >= this.f44986e) {
            o();
        }
        e eVarA = a(e.a.ERROR);
        int i10 = this.f44983b + 1;
        this.f44983b = i10;
        this.i++;
        eVarA.f45002c = i10;
        eVarA.f45004e = i;
        ((e[]) this.f44992l.f4676d)[i10] = eVarA;
        d dVar = this.f44984c;
        dVar.i.f44999a = eVarA;
        float[] fArr = eVarA.i;
        Arrays.fill(fArr, 0.0f);
        fArr[eVarA.f45004e] = 1.0f;
        dVar.j(eVarA);
        return eVarA;
    }

    public final e k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f44986e) {
            o();
        }
        if (!(obj instanceof C5507d)) {
            return null;
        }
        C5507d c5507d = (C5507d) obj;
        e eVar = c5507d.i;
        if (eVar == null) {
            c5507d.k();
            eVar = c5507d.i;
        }
        int i = eVar.f45002c;
        N5.c cVar = this.f44992l;
        if (i != -1 && i <= this.f44983b && ((e[]) cVar.f4676d)[i] != null) {
            return eVar;
        }
        if (i != -1) {
            eVar.c();
        }
        int i10 = this.f44983b + 1;
        this.f44983b = i10;
        this.i++;
        eVar.f45002c = i10;
        eVar.f45008j = e.a.UNRESTRICTED;
        ((e[]) cVar.f4676d)[i10] = eVar;
        return eVar;
    }

    public final b l() {
        Object obj;
        N5.c cVar = this.f44992l;
        K0.d dVar = (K0.d) cVar.f4674b;
        int i = dVar.f2943b;
        if (i > 0) {
            int i10 = i - 1;
            Object[] objArr = dVar.f2942a;
            obj = objArr[i10];
            objArr[i10] = null;
            dVar.f2943b = i10;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(cVar);
        }
        bVar.f44975a = null;
        bVar.f44978d.clear();
        bVar.f44976b = 0.0f;
        bVar.f44979e = false;
        return bVar;
    }

    public final e m() {
        if (this.i + 1 >= this.f44986e) {
            o();
        }
        e eVarA = a(e.a.SLACK);
        int i = this.f44983b + 1;
        this.f44983b = i;
        this.i++;
        eVarA.f45002c = i;
        ((e[]) this.f44992l.f4676d)[i] = eVarA;
        return eVarA;
    }

    public final void o() {
        int i = this.f44985d * 2;
        this.f44985d = i;
        this.f44987f = (b[]) Arrays.copyOf(this.f44987f, i);
        N5.c cVar = this.f44992l;
        cVar.f4676d = (e[]) Arrays.copyOf((e[]) cVar.f4676d, this.f44985d);
        int i10 = this.f44985d;
        this.f44989h = new boolean[i10];
        this.f44986e = i10;
        this.f44991k = i10;
    }

    public final void p() throws Exception {
        d dVar = this.f44984c;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f44988g) {
            q(dVar);
            return;
        }
        for (int i = 0; i < this.f44990j; i++) {
            if (!this.f44987f[i].f44979e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) throws Exception {
        int i = 0;
        while (true) {
            if (i >= this.f44990j) {
                break;
            }
            b bVar = this.f44987f[i];
            if (bVar.f44975a.f45008j != e.a.UNRESTRICTED) {
                float f10 = 0.0f;
                if (bVar.f44976b < 0.0f) {
                    boolean z10 = false;
                    int i10 = 0;
                    while (!z10) {
                        i10++;
                        float f11 = Float.MAX_VALUE;
                        int i11 = -1;
                        int i12 = -1;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < this.f44990j) {
                            b bVar2 = this.f44987f[i13];
                            if (bVar2.f44975a.f45008j != e.a.UNRESTRICTED && !bVar2.f44979e && bVar2.f44976b < f10) {
                                int iD = bVar2.f44978d.d();
                                int i15 = 0;
                                while (i15 < iD) {
                                    e eVarF = bVar2.f44978d.f(i15);
                                    float fE = bVar2.f44978d.e(eVarF);
                                    if (fE > f10) {
                                        for (int i16 = 0; i16 < 9; i16++) {
                                            float f12 = eVarF.f45007h[i16] / fE;
                                            if ((f12 < f11 && i16 == i14) || i16 > i14) {
                                                i14 = i16;
                                                i12 = eVarF.f45002c;
                                                i11 = i13;
                                                f11 = f12;
                                            }
                                        }
                                    }
                                    i15++;
                                    f10 = 0.0f;
                                }
                            }
                            i13++;
                            f10 = 0.0f;
                        }
                        if (i11 != -1) {
                            b bVar3 = this.f44987f[i11];
                            bVar3.f44975a.f45003d = -1;
                            bVar3.g(((e[]) this.f44992l.f4676d)[i12]);
                            e eVar = bVar3.f44975a;
                            eVar.f45003d = i11;
                            eVar.e(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i10 > this.i / 2) {
                            z10 = true;
                        }
                        f10 = 0.0f;
                    }
                }
            }
            i++;
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        for (int i = 0; i < this.i; i++) {
            this.f44989h[i] = false;
        }
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            i10++;
            if (i10 >= this.i * 2) {
                return;
            }
            e eVar = bVar.f44975a;
            if (eVar != null) {
                this.f44989h[eVar.f45002c] = true;
            }
            e eVarA = bVar.a(this.f44989h);
            if (eVarA != null) {
                boolean[] zArr = this.f44989h;
                int i11 = eVarA.f45002c;
                if (zArr[i11]) {
                    return;
                } else {
                    zArr[i11] = true;
                }
            }
            if (eVarA != null) {
                float f10 = Float.MAX_VALUE;
                int i12 = -1;
                for (int i13 = 0; i13 < this.f44990j; i13++) {
                    b bVar2 = this.f44987f[i13];
                    if (bVar2.f44975a.f45008j != e.a.UNRESTRICTED && !bVar2.f44979e && bVar2.f44978d.a(eVarA)) {
                        float fE = bVar2.f44978d.e(eVarA);
                        if (fE < 0.0f) {
                            float f11 = (-bVar2.f44976b) / fE;
                            if (f11 < f10) {
                                i12 = i13;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i12 > -1) {
                    b bVar3 = this.f44987f[i12];
                    bVar3.f44975a.f45003d = -1;
                    bVar3.g(eVarA);
                    e eVar2 = bVar3.f44975a;
                    eVar2.f45003d = i12;
                    eVar2.e(this, bVar3);
                }
            } else {
                z10 = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.f44990j; i++) {
            b bVar = this.f44987f[i];
            if (bVar != null) {
                ((K0.d) this.f44992l.f4674b).b(bVar);
            }
            this.f44987f[i] = null;
        }
    }

    public final void t() {
        N5.c cVar;
        int i = 0;
        while (true) {
            cVar = this.f44992l;
            e[] eVarArr = (e[]) cVar.f4676d;
            if (i >= eVarArr.length) {
                break;
            }
            e eVar = eVarArr[i];
            if (eVar != null) {
                eVar.c();
            }
            i++;
        }
        K0.d dVar = (K0.d) cVar.f4675c;
        e[] eVarArr2 = this.f44993m;
        int length = this.f44994n;
        dVar.getClass();
        if (length > eVarArr2.length) {
            length = eVarArr2.length;
        }
        for (int i10 = 0; i10 < length; i10++) {
            e eVar2 = eVarArr2[i10];
            int i11 = dVar.f2943b;
            Object[] objArr = dVar.f2942a;
            if (i11 < objArr.length) {
                objArr[i11] = eVar2;
                dVar.f2943b = i11 + 1;
            }
        }
        this.f44994n = 0;
        Arrays.fill((e[]) cVar.f4676d, (Object) null);
        this.f44983b = 0;
        d dVar2 = this.f44984c;
        dVar2.f44998h = 0;
        dVar2.f44976b = 0.0f;
        this.i = 1;
        for (int i12 = 0; i12 < this.f44990j; i12++) {
            b bVar = this.f44987f[i12];
        }
        s();
        this.f44990j = 0;
        this.f44995o = new b(cVar);
    }
}
