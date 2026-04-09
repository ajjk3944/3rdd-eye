package l;

import java.util.Arrays;
import java.util.HashMap;
import l.i;
import m.e;

/* loaded from: classes.dex */
public class e {

    /* renamed from: q, reason: collision with root package name */
    private static int f2796q = 1000;

    /* renamed from: r, reason: collision with root package name */
    public static f f2797r;

    /* renamed from: c, reason: collision with root package name */
    private a f2800c;

    /* renamed from: f, reason: collision with root package name */
    b[] f2803f;

    /* renamed from: l, reason: collision with root package name */
    final c f2809l;

    /* renamed from: p, reason: collision with root package name */
    private final a f2813p;

    /* renamed from: a, reason: collision with root package name */
    int f2798a = 0;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, i> f2799b = null;

    /* renamed from: d, reason: collision with root package name */
    private int f2801d = 32;

    /* renamed from: e, reason: collision with root package name */
    private int f2802e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2804g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean[] f2805h = new boolean[32];

    /* renamed from: i, reason: collision with root package name */
    int f2806i = 1;

    /* renamed from: j, reason: collision with root package name */
    int f2807j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f2808k = 32;

    /* renamed from: m, reason: collision with root package name */
    private i[] f2810m = new i[f2796q];

    /* renamed from: n, reason: collision with root package name */
    private int f2811n = 0;

    /* renamed from: o, reason: collision with root package name */
    private b[] f2812o = new b[32];

    interface a {
        i a(e eVar, boolean[] zArr);

        void b(i iVar);

        void c(a aVar);

        void clear();

        i getKey();
    }

    public e() {
        this.f2803f = null;
        this.f2803f = new b[32];
        D();
        c cVar = new c();
        this.f2809l = cVar;
        this.f2800c = new d(cVar);
        this.f2813p = new b(cVar);
    }

    private final int C(a aVar, boolean z2) {
        for (int i2 = 0; i2 < this.f2806i; i2++) {
            this.f2805h[i2] = false;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            i3++;
            if (i3 >= this.f2806i * 2) {
                return i3;
            }
            if (aVar.getKey() != null) {
                this.f2805h[aVar.getKey().f2818b] = true;
            }
            i iVarA = aVar.a(this, this.f2805h);
            if (iVarA != null) {
                boolean[] zArr = this.f2805h;
                int i4 = iVarA.f2818b;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (iVarA != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f2807j; i6++) {
                    b bVar = this.f2803f[i6];
                    if (bVar.f2788a.f2823g != i.a.UNRESTRICTED && !bVar.f2792e && bVar.s(iVarA)) {
                        float f3 = bVar.f2791d.f(iVarA);
                        if (f3 < 0.0f) {
                            float f4 = (-bVar.f2789b) / f3;
                            if (f4 < f2) {
                                i5 = i6;
                                f2 = f4;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar2 = this.f2803f[i5];
                    bVar2.f2788a.f2819c = -1;
                    bVar2.v(iVarA);
                    i iVar = bVar2.f2788a;
                    iVar.f2819c = i5;
                    iVar.f(bVar2);
                }
            }
            z3 = true;
        }
        return i3;
    }

    private void D() {
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.f2803f;
            if (i2 >= bVarArr.length) {
                return;
            }
            b bVar = bVarArr[i2];
            if (bVar != null) {
                this.f2809l.f2793a.a(bVar);
            }
            this.f2803f[i2] = null;
            i2++;
        }
    }

    private final void F(b bVar) {
        if (this.f2807j > 0) {
            bVar.f2791d.o(bVar, this.f2803f);
            if (bVar.f2791d.f2777a == 0) {
                bVar.f2792e = true;
            }
        }
    }

    private i a(i.a aVar, String str) {
        i iVarB = this.f2809l.f2794b.b();
        if (iVarB == null) {
            iVarB = new i(aVar, str);
        } else {
            iVarB.d();
        }
        iVarB.e(aVar, str);
        int i2 = this.f2811n;
        int i3 = f2796q;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f2796q = i4;
            this.f2810m = (i[]) Arrays.copyOf(this.f2810m, i4);
        }
        i[] iVarArr = this.f2810m;
        int i5 = this.f2811n;
        this.f2811n = i5 + 1;
        iVarArr[i5] = iVarB;
        return iVarB;
    }

    private void g(b bVar) {
        bVar.d(this, 0);
    }

    private final void m(b bVar) {
        b[] bVarArr = this.f2803f;
        int i2 = this.f2807j;
        if (bVarArr[i2] != null) {
            this.f2809l.f2793a.a(bVarArr[i2]);
        }
        b[] bVarArr2 = this.f2803f;
        int i3 = this.f2807j;
        bVarArr2[i3] = bVar;
        i iVar = bVar.f2788a;
        iVar.f2819c = i3;
        this.f2807j = i3 + 1;
        iVar.f(bVar);
    }

    private void o() {
        for (int i2 = 0; i2 < this.f2807j; i2++) {
            b bVar = this.f2803f[i2];
            bVar.f2788a.f2821e = bVar.f2789b;
        }
    }

    public static b t(e eVar, i iVar, i iVar2, i iVar3, float f2, boolean z2) {
        b bVarS = eVar.s();
        if (z2) {
            eVar.g(bVarS);
        }
        return bVarS.i(iVar, iVar2, iVar3, f2);
    }

    private int v(a aVar) {
        float f2;
        boolean z2;
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            if (i2 >= this.f2807j) {
                z2 = false;
                break;
            }
            b[] bVarArr = this.f2803f;
            if (bVarArr[i2].f2788a.f2823g != i.a.UNRESTRICTED && bVarArr[i2].f2789b < 0.0f) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (!z2) {
            return 0;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            i3++;
            float f3 = Float.MAX_VALUE;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            int i7 = 0;
            while (i4 < this.f2807j) {
                b bVar = this.f2803f[i4];
                if (bVar.f2788a.f2823g != i.a.UNRESTRICTED && !bVar.f2792e && bVar.f2789b < f2) {
                    int i8 = 1;
                    while (i8 < this.f2806i) {
                        i iVar = this.f2809l.f2795c[i8];
                        float f4 = bVar.f2791d.f(iVar);
                        if (f4 > f2) {
                            for (int i9 = 0; i9 < 7; i9++) {
                                float f5 = iVar.f2822f[i9] / f4;
                                if ((f5 < f3 && i9 == i7) || i9 > i7) {
                                    i7 = i9;
                                    f3 = f5;
                                    i5 = i4;
                                    i6 = i8;
                                }
                            }
                        }
                        i8++;
                        f2 = 0.0f;
                    }
                }
                i4++;
                f2 = 0.0f;
            }
            if (i5 != -1) {
                b bVar2 = this.f2803f[i5];
                bVar2.f2788a.f2819c = -1;
                bVar2.v(this.f2809l.f2795c[i6]);
                i iVar2 = bVar2.f2788a;
                iVar2.f2819c = i5;
                iVar2.f(bVar2);
            } else {
                z3 = true;
            }
            if (i3 > this.f2806i / 2) {
                z3 = true;
            }
            f2 = 0.0f;
        }
        return i3;
    }

    public static f x() {
        return f2797r;
    }

    private void z() {
        int i2 = this.f2801d * 2;
        this.f2801d = i2;
        this.f2803f = (b[]) Arrays.copyOf(this.f2803f, i2);
        c cVar = this.f2809l;
        cVar.f2795c = (i[]) Arrays.copyOf(cVar.f2795c, this.f2801d);
        int i3 = this.f2801d;
        this.f2805h = new boolean[i3];
        this.f2802e = i3;
        this.f2808k = i3;
    }

    public void A() {
        if (this.f2804g) {
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f2807j) {
                    z2 = true;
                    break;
                } else if (!this.f2803f[i2].f2792e) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                o();
                return;
            }
        }
        B(this.f2800c);
    }

    void B(a aVar) {
        F((b) aVar);
        v(aVar);
        C(aVar, false);
        o();
    }

    public void E() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.f2809l;
            i[] iVarArr = cVar.f2795c;
            if (i2 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i2];
            if (iVar != null) {
                iVar.d();
            }
            i2++;
        }
        cVar.f2794b.c(this.f2810m, this.f2811n);
        this.f2811n = 0;
        Arrays.fill(this.f2809l.f2795c, (Object) null);
        HashMap<String, i> map = this.f2799b;
        if (map != null) {
            map.clear();
        }
        this.f2798a = 0;
        this.f2800c.clear();
        this.f2806i = 1;
        for (int i3 = 0; i3 < this.f2807j; i3++) {
            this.f2803f[i3].f2790c = false;
        }
        D();
        this.f2807j = 0;
    }

    public void b(m.f fVar, m.f fVar2, float f2, int i2) {
        e.d dVar = e.d.LEFT;
        i iVarR = r(fVar.h(dVar));
        e.d dVar2 = e.d.TOP;
        i iVarR2 = r(fVar.h(dVar2));
        e.d dVar3 = e.d.RIGHT;
        i iVarR3 = r(fVar.h(dVar3));
        e.d dVar4 = e.d.BOTTOM;
        i iVarR4 = r(fVar.h(dVar4));
        i iVarR5 = r(fVar2.h(dVar));
        i iVarR6 = r(fVar2.h(dVar2));
        i iVarR7 = r(fVar2.h(dVar3));
        i iVarR8 = r(fVar2.h(dVar4));
        b bVarS = s();
        double d2 = f2;
        double dSin = Math.sin(d2);
        double d3 = i2;
        Double.isNaN(d3);
        bVarS.p(iVarR2, iVarR4, iVarR6, iVarR8, (float) (dSin * d3));
        d(bVarS);
        b bVarS2 = s();
        double dCos = Math.cos(d2);
        Double.isNaN(d3);
        bVarS2.p(iVarR, iVarR3, iVarR5, iVarR7, (float) (dCos * d3));
        d(bVarS2);
    }

    public void c(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3, int i4) {
        b bVarS = s();
        bVarS.g(iVar, iVar2, i2, f2, iVar3, iVar4, i3);
        if (i4 != 6) {
            bVarS.d(this, i4);
        }
        d(bVarS);
    }

    public void d(b bVar) {
        i iVarU;
        if (bVar == null) {
            return;
        }
        boolean z2 = true;
        if (this.f2807j + 1 >= this.f2808k || this.f2806i + 1 >= this.f2802e) {
            z();
        }
        boolean z3 = false;
        if (!bVar.f2792e) {
            F(bVar);
            if (bVar.t()) {
                return;
            }
            bVar.q();
            if (bVar.f(this)) {
                i iVarQ = q();
                bVar.f2788a = iVarQ;
                m(bVar);
                this.f2813p.c(bVar);
                C(this.f2813p, true);
                if (iVarQ.f2819c == -1) {
                    if (bVar.f2788a == iVarQ && (iVarU = bVar.u(iVarQ)) != null) {
                        bVar.v(iVarU);
                    }
                    if (!bVar.f2792e) {
                        bVar.f2788a.f(bVar);
                    }
                    this.f2807j--;
                }
            } else {
                z2 = false;
            }
            if (!bVar.r()) {
                return;
            } else {
                z3 = z2;
            }
        }
        if (z3) {
            return;
        }
        m(bVar);
    }

    public b e(i iVar, i iVar2, int i2, int i3) {
        b bVarS = s();
        bVarS.m(iVar, iVar2, i2);
        if (i3 != 6) {
            bVarS.d(this, i3);
        }
        d(bVarS);
        return bVarS;
    }

    public void f(i iVar, int i2) {
        b bVarS;
        int i3 = iVar.f2819c;
        if (i3 != -1) {
            b bVar = this.f2803f[i3];
            if (!bVar.f2792e) {
                if (bVar.f2791d.f2777a == 0) {
                    bVar.f2792e = true;
                } else {
                    bVarS = s();
                    bVarS.l(iVar, i2);
                }
            }
            bVar.f2789b = i2;
            return;
        }
        bVarS = s();
        bVarS.h(iVar, i2);
        d(bVarS);
    }

    public void h(i iVar, i iVar2, boolean z2) {
        b bVarS = s();
        i iVarU = u();
        iVarU.f2820d = 0;
        bVarS.n(iVar, iVar2, iVarU, 0);
        if (z2) {
            n(bVarS, (int) (bVarS.f2791d.f(iVarU) * (-1.0f)), 1);
        }
        d(bVarS);
    }

    public void i(i iVar, i iVar2, int i2, int i3) {
        b bVarS = s();
        i iVarU = u();
        iVarU.f2820d = 0;
        bVarS.n(iVar, iVar2, iVarU, i2);
        if (i3 != 6) {
            n(bVarS, (int) (bVarS.f2791d.f(iVarU) * (-1.0f)), i3);
        }
        d(bVarS);
    }

    public void j(i iVar, i iVar2, boolean z2) {
        b bVarS = s();
        i iVarU = u();
        iVarU.f2820d = 0;
        bVarS.o(iVar, iVar2, iVarU, 0);
        if (z2) {
            n(bVarS, (int) (bVarS.f2791d.f(iVarU) * (-1.0f)), 1);
        }
        d(bVarS);
    }

    public void k(i iVar, i iVar2, int i2, int i3) {
        b bVarS = s();
        i iVarU = u();
        iVarU.f2820d = 0;
        bVarS.o(iVar, iVar2, iVarU, i2);
        if (i3 != 6) {
            n(bVarS, (int) (bVarS.f2791d.f(iVarU) * (-1.0f)), i3);
        }
        d(bVarS);
    }

    public void l(i iVar, i iVar2, i iVar3, i iVar4, float f2, int i2) {
        b bVarS = s();
        bVarS.j(iVar, iVar2, iVar3, iVar4, f2);
        if (i2 != 6) {
            bVarS.d(this, i2);
        }
        d(bVarS);
    }

    void n(b bVar, int i2, int i3) {
        bVar.e(p(i3, null), i2);
    }

    public i p(int i2, String str) {
        if (this.f2806i + 1 >= this.f2802e) {
            z();
        }
        i iVarA = a(i.a.ERROR, str);
        int i3 = this.f2798a + 1;
        this.f2798a = i3;
        this.f2806i++;
        iVarA.f2818b = i3;
        iVarA.f2820d = i2;
        this.f2809l.f2795c[i3] = iVarA;
        this.f2800c.b(iVarA);
        return iVarA;
    }

    public i q() {
        if (this.f2806i + 1 >= this.f2802e) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i2 = this.f2798a + 1;
        this.f2798a = i2;
        this.f2806i++;
        iVarA.f2818b = i2;
        this.f2809l.f2795c[i2] = iVarA;
        return iVarA;
    }

    public i r(Object obj) {
        i iVarG = null;
        if (obj == null) {
            return null;
        }
        if (this.f2806i + 1 >= this.f2802e) {
            z();
        }
        if (obj instanceof m.e) {
            m.e eVar = (m.e) obj;
            iVarG = eVar.g();
            if (iVarG == null) {
                eVar.n(this.f2809l);
                iVarG = eVar.g();
            }
            int i2 = iVarG.f2818b;
            if (i2 == -1 || i2 > this.f2798a || this.f2809l.f2795c[i2] == null) {
                if (i2 != -1) {
                    iVarG.d();
                }
                int i3 = this.f2798a + 1;
                this.f2798a = i3;
                this.f2806i++;
                iVarG.f2818b = i3;
                iVarG.f2823g = i.a.UNRESTRICTED;
                this.f2809l.f2795c[i3] = iVarG;
            }
        }
        return iVarG;
    }

    public b s() {
        b bVarB = this.f2809l.f2793a.b();
        if (bVarB == null) {
            bVarB = new b(this.f2809l);
        } else {
            bVarB.w();
        }
        i.b();
        return bVarB;
    }

    public i u() {
        if (this.f2806i + 1 >= this.f2802e) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i2 = this.f2798a + 1;
        this.f2798a = i2;
        this.f2806i++;
        iVarA.f2818b = i2;
        this.f2809l.f2795c[i2] = iVarA;
        return iVarA;
    }

    public c w() {
        return this.f2809l;
    }

    public int y(Object obj) {
        i iVarG = ((m.e) obj).g();
        if (iVarG != null) {
            return (int) (iVarG.f2821e + 0.5f);
        }
        return 0;
    }
}
