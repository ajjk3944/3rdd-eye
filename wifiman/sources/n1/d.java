package n1;

import java.util.Arrays;
import java.util.HashMap;
import n1.i;
import o1.C7048d;
import o1.C7049e;

/* loaded from: classes.dex */
public class d {

    /* renamed from: q, reason: collision with root package name */
    private static int f54228q = 1000;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f54229r = true;

    /* renamed from: s, reason: collision with root package name */
    public static long f54230s;

    /* renamed from: t, reason: collision with root package name */
    public static long f54231t;

    /* renamed from: c, reason: collision with root package name */
    private a f54234c;

    /* renamed from: f, reason: collision with root package name */
    n1.b[] f54237f;

    /* renamed from: m, reason: collision with root package name */
    final c f54244m;

    /* renamed from: p, reason: collision with root package name */
    private a f54247p;

    /* renamed from: a, reason: collision with root package name */
    int f54232a = 0;

    /* renamed from: b, reason: collision with root package name */
    private HashMap f54233b = null;

    /* renamed from: d, reason: collision with root package name */
    private int f54235d = 32;

    /* renamed from: e, reason: collision with root package name */
    private int f54236e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f54238g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f54239h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean[] f54240i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    int f54241j = 1;

    /* renamed from: k, reason: collision with root package name */
    int f54242k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f54243l = 32;

    /* renamed from: n, reason: collision with root package name */
    private i[] f54245n = new i[f54228q];

    /* renamed from: o, reason: collision with root package name */
    private int f54246o = 0;

    interface a {
        i a(d dVar, boolean[] zArr);

        void b(i iVar);

        void c(a aVar);

        void clear();

        i getKey();
    }

    class b extends n1.b {
        public b(c cVar) {
            this.f54222e = new j(this, cVar);
        }
    }

    public d() {
        this.f54237f = null;
        this.f54237f = new n1.b[32];
        C();
        c cVar = new c();
        this.f54244m = cVar;
        this.f54234c = new h(cVar);
        if (f54229r) {
            this.f54247p = new b(cVar);
        } else {
            this.f54247p = new n1.b(cVar);
        }
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f54241j; i10++) {
            this.f54240i[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f54241j * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f54240i[aVar.getKey().f54264c] = true;
            }
            i iVarA = aVar.a(this, this.f54240i);
            if (iVarA != null) {
                boolean[] zArr = this.f54240i;
                int i12 = iVarA.f54264c;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (iVarA != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f54242k; i14++) {
                    n1.b bVar = this.f54237f[i14];
                    if (bVar.f54218a.f54271j != i.a.UNRESTRICTED && !bVar.f54223f && bVar.t(iVarA)) {
                        float fH = bVar.f54222e.h(iVarA);
                        if (fH < 0.0f) {
                            float f11 = (-bVar.f54219b) / fH;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    n1.b bVar2 = this.f54237f[i13];
                    bVar2.f54218a.f54265d = -1;
                    bVar2.y(iVarA);
                    i iVar = bVar2.f54218a;
                    iVar.f54265d = i13;
                    iVar.g(bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void C() {
        int i10 = 0;
        if (f54229r) {
            while (true) {
                n1.b[] bVarArr = this.f54237f;
                if (i10 >= bVarArr.length) {
                    return;
                }
                n1.b bVar = bVarArr[i10];
                if (bVar != null) {
                    this.f54244m.f54224a.a(bVar);
                }
                this.f54237f[i10] = null;
                i10++;
            }
        } else {
            while (true) {
                n1.b[] bVarArr2 = this.f54237f;
                if (i10 >= bVarArr2.length) {
                    return;
                }
                n1.b bVar2 = bVarArr2[i10];
                if (bVar2 != null) {
                    this.f54244m.f54225b.a(bVar2);
                }
                this.f54237f[i10] = null;
                i10++;
            }
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f54244m.f54226c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.f(aVar, str);
        } else {
            iVar.d();
            iVar.f(aVar, str);
        }
        int i10 = this.f54246o;
        int i11 = f54228q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f54228q = i12;
            this.f54245n = (i[]) Arrays.copyOf(this.f54245n, i12);
        }
        i[] iVarArr = this.f54245n;
        int i13 = this.f54246o;
        this.f54246o = i13 + 1;
        iVarArr[i13] = iVar;
        return iVar;
    }

    private final void l(n1.b bVar) {
        if (f54229r) {
            n1.b bVar2 = this.f54237f[this.f54242k];
            if (bVar2 != null) {
                this.f54244m.f54224a.a(bVar2);
            }
        } else {
            n1.b bVar3 = this.f54237f[this.f54242k];
            if (bVar3 != null) {
                this.f54244m.f54225b.a(bVar3);
            }
        }
        n1.b[] bVarArr = this.f54237f;
        int i10 = this.f54242k;
        bVarArr[i10] = bVar;
        i iVar = bVar.f54218a;
        iVar.f54265d = i10;
        this.f54242k = i10 + 1;
        iVar.g(bVar);
    }

    private void n() {
        for (int i10 = 0; i10 < this.f54242k; i10++) {
            n1.b bVar = this.f54237f[i10];
            bVar.f54218a.f54267f = bVar.f54219b;
        }
    }

    public static n1.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) {
        for (int i10 = 0; i10 < this.f54242k; i10++) {
            n1.b bVar = this.f54237f[i10];
            if (bVar.f54218a.f54271j != i.a.UNRESTRICTED && bVar.f54219b < 0.0f) {
                boolean z10 = false;
                int i11 = 0;
                while (!z10) {
                    i11++;
                    float f10 = Float.MAX_VALUE;
                    int i12 = -1;
                    int i13 = -1;
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        if (i14 >= this.f54242k) {
                            break;
                        }
                        n1.b bVar2 = this.f54237f[i14];
                        if (bVar2.f54218a.f54271j != i.a.UNRESTRICTED && !bVar2.f54223f && bVar2.f54219b < 0.0f) {
                            for (int i16 = 1; i16 < this.f54241j; i16++) {
                                i iVar = this.f54244m.f54227d[i16];
                                float fH = bVar2.f54222e.h(iVar);
                                if (fH > 0.0f) {
                                    for (int i17 = 0; i17 < 9; i17++) {
                                        float f11 = iVar.f54269h[i17] / fH;
                                        if ((f11 < f10 && i17 == i15) || i17 > i15) {
                                            f10 = f11;
                                            i12 = i14;
                                            i13 = i16;
                                            i15 = i17;
                                        }
                                    }
                                }
                            }
                        }
                        i14++;
                    }
                    if (i12 != -1) {
                        n1.b bVar3 = this.f54237f[i12];
                        bVar3.f54218a.f54265d = -1;
                        bVar3.y(this.f54244m.f54227d[i13]);
                        i iVar2 = bVar3.f54218a;
                        iVar2.f54265d = i12;
                        iVar2.g(bVar3);
                    } else {
                        z10 = true;
                    }
                    if (i11 > this.f54241j / 2) {
                        z10 = true;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i10 = this.f54235d * 2;
        this.f54235d = i10;
        this.f54237f = (n1.b[]) Arrays.copyOf(this.f54237f, i10);
        c cVar = this.f54244m;
        cVar.f54227d = (i[]) Arrays.copyOf(cVar.f54227d, this.f54235d);
        int i11 = this.f54235d;
        this.f54240i = new boolean[i11];
        this.f54236e = i11;
        this.f54243l = i11;
    }

    void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f54244m;
            i[] iVarArr = cVar.f54227d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.d();
            }
            i10++;
        }
        cVar.f54226c.c(this.f54245n, this.f54246o);
        this.f54246o = 0;
        Arrays.fill(this.f54244m.f54227d, (Object) null);
        HashMap map = this.f54233b;
        if (map != null) {
            map.clear();
        }
        this.f54232a = 0;
        this.f54234c.clear();
        this.f54241j = 1;
        for (int i11 = 0; i11 < this.f54242k; i11++) {
            this.f54237f[i11].f54220c = false;
        }
        C();
        this.f54242k = 0;
        if (f54229r) {
            this.f54247p = new b(this.f54244m);
        } else {
            this.f54247p = new n1.b(this.f54244m);
        }
    }

    public void b(C7049e c7049e, C7049e c7049e2, float f10, int i10) {
        C7048d.b bVar = C7048d.b.LEFT;
        i iVarQ = q(c7049e.m(bVar));
        C7048d.b bVar2 = C7048d.b.TOP;
        i iVarQ2 = q(c7049e.m(bVar2));
        C7048d.b bVar3 = C7048d.b.RIGHT;
        i iVarQ3 = q(c7049e.m(bVar3));
        C7048d.b bVar4 = C7048d.b.BOTTOM;
        i iVarQ4 = q(c7049e.m(bVar4));
        i iVarQ5 = q(c7049e2.m(bVar));
        i iVarQ6 = q(c7049e2.m(bVar2));
        i iVarQ7 = q(c7049e2.m(bVar3));
        i iVarQ8 = q(c7049e2.m(bVar4));
        n1.b bVarR = r();
        double d10 = f10;
        double d11 = i10;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d10) * d11));
        d(bVarR);
        n1.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d10) * d11));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        n1.b bVarR = r();
        bVarR.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            bVarR.d(this, i12);
        }
        d(bVarR);
    }

    public void d(n1.b bVar) {
        i iVarW;
        if (bVar == null) {
            return;
        }
        boolean z10 = true;
        if (this.f54242k + 1 >= this.f54243l || this.f54241j + 1 >= this.f54236e) {
            y();
        }
        boolean z11 = false;
        if (!bVar.f54223f) {
            bVar.D(this);
            if (bVar.u()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i iVarP = p();
                bVar.f54218a = iVarP;
                l(bVar);
                this.f54247p.c(bVar);
                B(this.f54247p, true);
                if (iVarP.f54265d == -1) {
                    if (bVar.f54218a == iVarP && (iVarW = bVar.w(iVarP)) != null) {
                        bVar.y(iVarW);
                    }
                    if (!bVar.f54223f) {
                        bVar.f54218a.g(bVar);
                    }
                    this.f54242k--;
                }
            } else {
                z10 = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z11 = z10;
            }
        }
        if (z11) {
            return;
        }
        l(bVar);
    }

    public n1.b e(i iVar, i iVar2, int i10, int i11) {
        if (i11 == 8 && iVar2.f54268g && iVar.f54265d == -1) {
            iVar.e(this, iVar2.f54267f + i10);
            return null;
        }
        n1.b bVarR = r();
        bVarR.n(iVar, iVar2, i10);
        if (i11 != 8) {
            bVarR.d(this, i11);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i10) {
        int i11 = iVar.f54265d;
        if (i11 == -1) {
            iVar.e(this, i10);
            return;
        }
        if (i11 == -1) {
            n1.b bVarR = r();
            bVarR.i(iVar, i10);
            d(bVarR);
            return;
        }
        n1.b bVar = this.f54237f[i11];
        if (bVar.f54223f) {
            bVar.f54219b = i10;
            return;
        }
        if (bVar.f54222e.a() == 0) {
            bVar.f54223f = true;
            bVar.f54219b = i10;
        } else {
            n1.b bVarR2 = r();
            bVarR2.m(iVar, i10);
            d(bVarR2);
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        n1.b bVarR = r();
        i iVarT = t();
        iVarT.f54266e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        n1.b bVarR = r();
        i iVarT = t();
        iVarT.f54266e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f54222e.h(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        n1.b bVarR = r();
        i iVarT = t();
        iVarT.f54266e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        n1.b bVarR = r();
        i iVarT = t();
        iVarT.f54266e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f54222e.h(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        n1.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            bVarR.d(this, i10);
        }
        d(bVarR);
    }

    void m(n1.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public i o(int i10, String str) {
        if (this.f54241j + 1 >= this.f54236e) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f54232a + 1;
        this.f54232a = i11;
        this.f54241j++;
        iVarA.f54264c = i11;
        iVarA.f54266e = i10;
        this.f54244m.f54227d[i11] = iVarA;
        this.f54234c.b(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f54241j + 1 >= this.f54236e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f54232a + 1;
        this.f54232a = i10;
        this.f54241j++;
        iVarA.f54264c = i10;
        this.f54244m.f54227d[i10] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarF = null;
        if (obj == null) {
            return null;
        }
        if (this.f54241j + 1 >= this.f54236e) {
            y();
        }
        if (obj instanceof C7048d) {
            C7048d c7048d = (C7048d) obj;
            iVarF = c7048d.f();
            if (iVarF == null) {
                c7048d.m(this.f54244m);
                iVarF = c7048d.f();
            }
            int i10 = iVarF.f54264c;
            if (i10 == -1 || i10 > this.f54232a || this.f54244m.f54227d[i10] == null) {
                if (i10 != -1) {
                    iVarF.d();
                }
                int i11 = this.f54232a + 1;
                this.f54232a = i11;
                this.f54241j++;
                iVarF.f54264c = i11;
                iVarF.f54271j = i.a.UNRESTRICTED;
                this.f54244m.f54227d[i11] = iVarF;
            }
        }
        return iVarF;
    }

    public n1.b r() {
        n1.b bVar;
        if (f54229r) {
            bVar = (n1.b) this.f54244m.f54224a.b();
            if (bVar == null) {
                bVar = new b(this.f54244m);
                f54231t++;
            } else {
                bVar.z();
            }
        } else {
            bVar = (n1.b) this.f54244m.f54225b.b();
            if (bVar == null) {
                bVar = new n1.b(this.f54244m);
                f54230s++;
            } else {
                bVar.z();
            }
        }
        i.b();
        return bVar;
    }

    public i t() {
        if (this.f54241j + 1 >= this.f54236e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f54232a + 1;
        this.f54232a = i10;
        this.f54241j++;
        iVarA.f54264c = i10;
        this.f54244m.f54227d[i10] = iVarA;
        return iVarA;
    }

    public c v() {
        return this.f54244m;
    }

    public int x(Object obj) {
        i iVarF = ((C7048d) obj).f();
        if (iVarF != null) {
            return (int) (iVarF.f54267f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (!this.f54238g && !this.f54239h) {
            A(this.f54234c);
            return;
        }
        for (int i10 = 0; i10 < this.f54242k; i10++) {
            if (!this.f54237f[i10].f54223f) {
                A(this.f54234c);
                return;
            }
        }
        n();
    }
}
