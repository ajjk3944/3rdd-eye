package x;

import java.util.Arrays;
import o.a1;
import t2.q;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2982c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f24000p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f24001q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C2983d f24004c;

    /* renamed from: f, reason: collision with root package name */
    public C2981b[] f24007f;

    /* renamed from: l, reason: collision with root package name */
    public final a1 f24012l;

    /* renamed from: o, reason: collision with root package name */
    public C2981b f24015o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f24002a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f24003b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f24005d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f24006e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24008g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f24009h = new boolean[32];
    public int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f24010j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f24011k = 32;

    /* renamed from: m, reason: collision with root package name */
    public C2985f[] f24013m = new C2985f[f24001q];

    /* renamed from: n, reason: collision with root package name */
    public int f24014n = 0;

    public C2982c() {
        this.f24007f = null;
        this.f24007f = new C2981b[32];
        s();
        a1 a1Var = new a1(6);
        a1Var.f22479b = new Q.c();
        a1Var.f22480c = new Q.c();
        a1Var.f22481d = new C2985f[32];
        this.f24012l = a1Var;
        C2983d c2983d = new C2983d(a1Var);
        c2983d.f24016f = new C2985f[128];
        c2983d.f24017g = new C2985f[128];
        c2983d.f24018h = 0;
        c2983d.i = new q(c2983d);
        this.f24004c = c2983d;
        this.f24015o = new C2981b(a1Var);
    }

    public static int n(Object obj) {
        C2985f c2985f = ((z.c) obj).i;
        if (c2985f != null) {
            return (int) (c2985f.f24024e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C2985f a(int i) {
        Q.c cVar = (Q.c) this.f24012l.f22480c;
        int i3 = cVar.f3166b;
        C2985f c2985f = null;
        if (i3 > 0) {
            int i6 = i3 - 1;
            ?? r32 = cVar.f3165a;
            ?? r42 = r32[i6];
            r32[i6] = 0;
            cVar.f3166b = i6;
            c2985f = r42;
        }
        C2985f c2985f2 = c2985f;
        if (c2985f2 == null) {
            c2985f2 = new C2985f(i);
            c2985f2.f24030l = i;
        } else {
            c2985f2.c();
            c2985f2.f24030l = i;
        }
        int i7 = this.f24014n;
        int i8 = f24001q;
        if (i7 >= i8) {
            int i9 = i8 * 2;
            f24001q = i9;
            this.f24013m = (C2985f[]) Arrays.copyOf(this.f24013m, i9);
        }
        C2985f[] c2985fArr = this.f24013m;
        int i10 = this.f24014n;
        this.f24014n = i10 + 1;
        c2985fArr[i10] = c2985f2;
        return c2985f2;
    }

    public final void b(C2985f c2985f, C2985f c2985f2, int i, float f2, C2985f c2985f3, C2985f c2985f4, int i3, int i6) {
        C2981b c2981bL = l();
        if (c2985f2 == c2985f3) {
            c2981bL.f23998d.g(c2985f, 1.0f);
            c2981bL.f23998d.g(c2985f4, 1.0f);
            c2981bL.f23998d.g(c2985f2, -2.0f);
        } else if (f2 == 0.5f) {
            c2981bL.f23998d.g(c2985f, 1.0f);
            c2981bL.f23998d.g(c2985f2, -1.0f);
            c2981bL.f23998d.g(c2985f3, -1.0f);
            c2981bL.f23998d.g(c2985f4, 1.0f);
            if (i > 0 || i3 > 0) {
                c2981bL.f23996b = (-i) + i3;
            }
        } else if (f2 <= 0.0f) {
            c2981bL.f23998d.g(c2985f, -1.0f);
            c2981bL.f23998d.g(c2985f2, 1.0f);
            c2981bL.f23996b = i;
        } else if (f2 >= 1.0f) {
            c2981bL.f23998d.g(c2985f4, -1.0f);
            c2981bL.f23998d.g(c2985f3, 1.0f);
            c2981bL.f23996b = -i3;
        } else {
            float f5 = 1.0f - f2;
            c2981bL.f23998d.g(c2985f, f5 * 1.0f);
            c2981bL.f23998d.g(c2985f2, f5 * (-1.0f));
            c2981bL.f23998d.g(c2985f3, (-1.0f) * f2);
            c2981bL.f23998d.g(c2985f4, 1.0f * f2);
            if (i > 0 || i3 > 0) {
                c2981bL.f23996b = (i3 * f2) + ((-i) * f5);
            }
        }
        if (i6 != 8) {
            c2981bL.a(this, i6);
        }
        c(c2981bL);
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
    public final void c(x.C2981b r18) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C2982c.c(x.b):void");
    }

    public final void d(C2985f c2985f, int i) {
        int i3 = c2985f.f24022c;
        if (i3 == -1) {
            c2985f.d(this, i);
            for (int i6 = 0; i6 < this.f24003b + 1; i6++) {
                C2985f c2985f2 = ((C2985f[]) this.f24012l.f22481d)[i6];
            }
            return;
        }
        if (i3 == -1) {
            C2981b c2981bL = l();
            c2981bL.f23995a = c2985f;
            float f2 = i;
            c2985f.f24024e = f2;
            c2981bL.f23996b = f2;
            c2981bL.f23999e = true;
            c(c2981bL);
            return;
        }
        C2981b c2981b = this.f24007f[i3];
        if (c2981b.f23999e) {
            c2981b.f23996b = i;
            return;
        }
        if (c2981b.f23998d.d() == 0) {
            c2981b.f23999e = true;
            c2981b.f23996b = i;
            return;
        }
        C2981b c2981bL2 = l();
        if (i < 0) {
            c2981bL2.f23996b = i * (-1);
            c2981bL2.f23998d.g(c2985f, 1.0f);
        } else {
            c2981bL2.f23996b = i;
            c2981bL2.f23998d.g(c2985f, -1.0f);
        }
        c(c2981bL2);
    }

    public final void e(C2985f c2985f, C2985f c2985f2, int i, int i3) {
        if (i3 == 8 && c2985f2.f24025f && c2985f.f24022c == -1) {
            c2985f.d(this, c2985f2.f24024e + i);
            return;
        }
        C2981b c2981bL = l();
        boolean z6 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z6 = true;
            }
            c2981bL.f23996b = i;
        }
        if (z6) {
            c2981bL.f23998d.g(c2985f, 1.0f);
            c2981bL.f23998d.g(c2985f2, -1.0f);
        } else {
            c2981bL.f23998d.g(c2985f, -1.0f);
            c2981bL.f23998d.g(c2985f2, 1.0f);
        }
        if (i3 != 8) {
            c2981bL.a(this, i3);
        }
        c(c2981bL);
    }

    public final void f(C2985f c2985f, C2985f c2985f2, int i, int i3) {
        C2981b c2981bL = l();
        C2985f c2985fM = m();
        c2985fM.f24023d = 0;
        c2981bL.b(c2985f, c2985f2, c2985fM, i);
        if (i3 != 8) {
            c2981bL.f23998d.g(j(i3), (int) (c2981bL.f23998d.c(c2985fM) * (-1.0f)));
        }
        c(c2981bL);
    }

    public final void g(C2985f c2985f, C2985f c2985f2, int i, int i3) {
        C2981b c2981bL = l();
        C2985f c2985fM = m();
        c2985fM.f24023d = 0;
        c2981bL.c(c2985f, c2985f2, c2985fM, i);
        if (i3 != 8) {
            c2981bL.f23998d.g(j(i3), (int) (c2981bL.f23998d.c(c2985fM) * (-1.0f)));
        }
        c(c2981bL);
    }

    public final void h(C2981b c2981b) {
        int i;
        if (c2981b.f23999e) {
            c2981b.f23995a.d(this, c2981b.f23996b);
        } else {
            C2981b[] c2981bArr = this.f24007f;
            int i3 = this.f24010j;
            c2981bArr[i3] = c2981b;
            C2985f c2985f = c2981b.f23995a;
            c2985f.f24022c = i3;
            this.f24010j = i3 + 1;
            c2985f.e(this, c2981b);
        }
        if (this.f24002a) {
            int i6 = 0;
            while (i6 < this.f24010j) {
                if (this.f24007f[i6] == null) {
                    System.out.println("WTF");
                }
                C2981b c2981b2 = this.f24007f[i6];
                if (c2981b2 != null && c2981b2.f23999e) {
                    c2981b2.f23995a.d(this, c2981b2.f23996b);
                    ((Q.c) this.f24012l.f22479b).a(c2981b2);
                    this.f24007f[i6] = null;
                    int i7 = i6 + 1;
                    int i8 = i7;
                    while (true) {
                        i = this.f24010j;
                        if (i7 >= i) {
                            break;
                        }
                        C2981b[] c2981bArr2 = this.f24007f;
                        int i9 = i7 - 1;
                        C2981b c2981b3 = c2981bArr2[i7];
                        c2981bArr2[i9] = c2981b3;
                        C2985f c2985f2 = c2981b3.f23995a;
                        if (c2985f2.f24022c == i7) {
                            c2985f2.f24022c = i9;
                        }
                        i8 = i7;
                        i7++;
                    }
                    if (i8 < i) {
                        this.f24007f[i8] = null;
                    }
                    this.f24010j = i - 1;
                    i6--;
                }
                i6++;
            }
            this.f24002a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f24010j; i++) {
            C2981b c2981b = this.f24007f[i];
            c2981b.f23995a.f24024e = c2981b.f23996b;
        }
    }

    public final C2985f j(int i) {
        if (this.i + 1 >= this.f24006e) {
            o();
        }
        C2985f c2985fA = a(4);
        float[] fArr = c2985fA.f24027h;
        int i3 = this.f24003b + 1;
        this.f24003b = i3;
        this.i++;
        c2985fA.f24021b = i3;
        c2985fA.f24023d = i;
        ((C2985f[]) this.f24012l.f22481d)[i3] = c2985fA;
        C2983d c2983d = this.f24004c;
        c2983d.i.f23648b = c2985fA;
        Arrays.fill(fArr, 0.0f);
        fArr[c2985fA.f24023d] = 1.0f;
        c2983d.j(c2985fA);
        return c2985fA;
    }

    public final C2985f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f24006e) {
            o();
        }
        if (!(obj instanceof z.c)) {
            return null;
        }
        z.c cVar = (z.c) obj;
        C2985f c2985f = cVar.i;
        if (c2985f == null) {
            cVar.k();
            c2985f = cVar.i;
        }
        int i = c2985f.f24021b;
        a1 a1Var = this.f24012l;
        if (i != -1 && i <= this.f24003b && ((C2985f[]) a1Var.f22481d)[i] != null) {
            return c2985f;
        }
        if (i != -1) {
            c2985f.c();
        }
        int i3 = this.f24003b + 1;
        this.f24003b = i3;
        this.i++;
        c2985f.f24021b = i3;
        c2985f.f24030l = 1;
        ((C2985f[]) a1Var.f22481d)[i3] = c2985f;
        return c2985f;
    }

    public final C2981b l() {
        Object obj;
        a1 a1Var = this.f24012l;
        Q.c cVar = (Q.c) a1Var.f22479b;
        int i = cVar.f3166b;
        if (i > 0) {
            int i3 = i - 1;
            Object[] objArr = cVar.f3165a;
            obj = objArr[i3];
            objArr[i3] = null;
            cVar.f3166b = i3;
        } else {
            obj = null;
        }
        C2981b c2981b = (C2981b) obj;
        if (c2981b == null) {
            return new C2981b(a1Var);
        }
        c2981b.f23995a = null;
        c2981b.f23998d.b();
        c2981b.f23996b = 0.0f;
        c2981b.f23999e = false;
        return c2981b;
    }

    public final C2985f m() {
        if (this.i + 1 >= this.f24006e) {
            o();
        }
        C2985f c2985fA = a(3);
        int i = this.f24003b + 1;
        this.f24003b = i;
        this.i++;
        c2985fA.f24021b = i;
        ((C2985f[]) this.f24012l.f22481d)[i] = c2985fA;
        return c2985fA;
    }

    public final void o() {
        int i = this.f24005d * 2;
        this.f24005d = i;
        this.f24007f = (C2981b[]) Arrays.copyOf(this.f24007f, i);
        a1 a1Var = this.f24012l;
        a1Var.f22481d = (C2985f[]) Arrays.copyOf((C2985f[]) a1Var.f22481d, this.f24005d);
        int i3 = this.f24005d;
        this.f24009h = new boolean[i3];
        this.f24006e = i3;
        this.f24011k = i3;
    }

    public final void p() {
        C2983d c2983d = this.f24004c;
        if (c2983d.e()) {
            i();
            return;
        }
        if (!this.f24008g) {
            q(c2983d);
            return;
        }
        for (int i = 0; i < this.f24010j; i++) {
            if (!this.f24007f[i].f23999e) {
                q(c2983d);
                return;
            }
        }
        i();
    }

    public final void q(C2983d c2983d) {
        int i = 0;
        while (true) {
            if (i >= this.f24010j) {
                break;
            }
            C2981b c2981b = this.f24007f[i];
            int i3 = 1;
            if (c2981b.f23995a.f24030l != 1) {
                float f2 = 0.0f;
                if (c2981b.f23996b < 0.0f) {
                    boolean z6 = false;
                    int i6 = 0;
                    while (!z6) {
                        i6 += i3;
                        float f5 = Float.MAX_VALUE;
                        int i7 = -1;
                        int i8 = -1;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < this.f24010j) {
                            C2981b c2981b2 = this.f24007f[i9];
                            if (c2981b2.f23995a.f24030l != i3 && !c2981b2.f23999e && c2981b2.f23996b < f2) {
                                int iD = c2981b2.f23998d.d();
                                int i11 = 0;
                                while (i11 < iD) {
                                    C2985f c2985fE = c2981b2.f23998d.e(i11);
                                    float fC = c2981b2.f23998d.c(c2985fE);
                                    if (fC > f2) {
                                        for (int i12 = 0; i12 < 9; i12++) {
                                            float f6 = c2985fE.f24026g[i12] / fC;
                                            if ((f6 < f5 && i12 == i10) || i12 > i10) {
                                                i10 = i12;
                                                i8 = c2985fE.f24021b;
                                                i7 = i9;
                                                f5 = f6;
                                            }
                                        }
                                    }
                                    i11++;
                                    f2 = 0.0f;
                                }
                            }
                            i9++;
                            f2 = 0.0f;
                            i3 = 1;
                        }
                        if (i7 != -1) {
                            C2981b c2981b3 = this.f24007f[i7];
                            c2981b3.f23995a.f24022c = -1;
                            c2981b3.g(((C2985f[]) this.f24012l.f22481d)[i8]);
                            C2985f c2985f = c2981b3.f23995a;
                            c2985f.f24022c = i7;
                            c2985f.e(this, c2981b3);
                        } else {
                            z6 = true;
                        }
                        if (i6 > this.i / 2) {
                            z6 = true;
                        }
                        f2 = 0.0f;
                        i3 = 1;
                    }
                }
            }
            i++;
        }
        r(c2983d);
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(x.C2981b r17) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C2982c.r(x.b):void");
    }

    public final void s() {
        for (int i = 0; i < this.f24010j; i++) {
            C2981b c2981b = this.f24007f[i];
            if (c2981b != null) {
                ((Q.c) this.f24012l.f22479b).a(c2981b);
            }
            this.f24007f[i] = null;
        }
    }

    public final void t() {
        a1 a1Var;
        int i = 0;
        while (true) {
            a1Var = this.f24012l;
            C2985f[] c2985fArr = (C2985f[]) a1Var.f22481d;
            if (i >= c2985fArr.length) {
                break;
            }
            C2985f c2985f = c2985fArr[i];
            if (c2985f != null) {
                c2985f.c();
            }
            i++;
        }
        Q.c cVar = (Q.c) a1Var.f22480c;
        C2985f[] c2985fArr2 = this.f24013m;
        int length = this.f24014n;
        cVar.getClass();
        if (length > c2985fArr2.length) {
            length = c2985fArr2.length;
        }
        for (int i3 = 0; i3 < length; i3++) {
            C2985f c2985f2 = c2985fArr2[i3];
            int i6 = cVar.f3166b;
            Object[] objArr = cVar.f3165a;
            if (i6 < objArr.length) {
                objArr[i6] = c2985f2;
                cVar.f3166b = i6 + 1;
            }
        }
        this.f24014n = 0;
        Arrays.fill((C2985f[]) a1Var.f22481d, (Object) null);
        this.f24003b = 0;
        C2983d c2983d = this.f24004c;
        c2983d.f24018h = 0;
        c2983d.f23996b = 0.0f;
        this.i = 1;
        for (int i7 = 0; i7 < this.f24010j; i7++) {
            C2981b c2981b = this.f24007f[i7];
        }
        s();
        this.f24010j = 0;
        this.f24015o = new C2981b(a1Var);
    }
}
