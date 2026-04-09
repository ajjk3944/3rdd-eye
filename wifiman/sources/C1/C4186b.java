package c1;

import c1.C4188d;
import c1.C4193i;
import java.util.ArrayList;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4186b implements C4188d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f33658e;

    /* renamed from: a, reason: collision with root package name */
    C4193i f33654a = null;

    /* renamed from: b, reason: collision with root package name */
    float f33655b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f33656c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f33657d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    boolean f33659f = false;

    /* renamed from: c1.b$a */
    public interface a {
        int a();

        C4193i b(int i10);

        void c();

        void clear();

        float d(int i10);

        void e(float f10);

        float f(C4193i c4193i, boolean z10);

        void g(C4193i c4193i, float f10, boolean z10);

        boolean h(C4193i c4193i);

        void i(C4193i c4193i, float f10);

        float j(C4193i c4193i);

        float k(C4186b c4186b, boolean z10);
    }

    public C4186b() {
    }

    private boolean u(C4193i c4193i, C4188d c4188d) {
        return c4193i.f33714m <= 1;
    }

    private C4193i w(boolean[] zArr, C4193i c4193i) {
        C4193i.a aVar;
        int iA = this.f33658e.a();
        C4193i c4193i2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iA; i10++) {
            float fD = this.f33658e.d(i10);
            if (fD < 0.0f) {
                C4193i c4193iB = this.f33658e.b(i10);
                if ((zArr == null || !zArr[c4193iB.f33704c]) && c4193iB != c4193i && (((aVar = c4193iB.f33711j) == C4193i.a.SLACK || aVar == C4193i.a.ERROR) && fD < f10)) {
                    f10 = fD;
                    c4193i2 = c4193iB;
                }
            }
        }
        return c4193i2;
    }

    public void A(C4188d c4188d, C4193i c4193i, boolean z10) {
        if (c4193i == null || !c4193i.f33708g) {
            return;
        }
        this.f33655b += c4193i.f33707f * this.f33658e.j(c4193i);
        this.f33658e.f(c4193i, z10);
        if (z10) {
            c4193i.d(this);
        }
        if (C4188d.f33666u && this.f33658e.a() == 0) {
            this.f33659f = true;
            c4188d.f33672b = true;
        }
    }

    public void B(C4188d c4188d, C4186b c4186b, boolean z10) {
        this.f33655b += c4186b.f33655b * this.f33658e.k(c4186b, z10);
        if (z10) {
            c4186b.f33654a.d(this);
        }
        if (C4188d.f33666u && this.f33654a != null && this.f33658e.a() == 0) {
            this.f33659f = true;
            c4188d.f33672b = true;
        }
    }

    public void C(C4188d c4188d, C4193i c4193i, boolean z10) {
        if (c4193i == null || !c4193i.f33715n) {
            return;
        }
        float fJ = this.f33658e.j(c4193i);
        this.f33655b += c4193i.f33717p * fJ;
        this.f33658e.f(c4193i, z10);
        if (z10) {
            c4193i.d(this);
        }
        this.f33658e.g(c4188d.f33685o.f33663d[c4193i.f33716o], fJ, z10);
        if (C4188d.f33666u && this.f33658e.a() == 0) {
            this.f33659f = true;
            c4188d.f33672b = true;
        }
    }

    public void D(C4188d c4188d) {
        if (c4188d.f33678h.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iA = this.f33658e.a();
            for (int i10 = 0; i10 < iA; i10++) {
                C4193i c4193iB = this.f33658e.b(i10);
                if (c4193iB.f33705d != -1 || c4193iB.f33708g || c4193iB.f33715n) {
                    this.f33657d.add(c4193iB);
                }
            }
            int size = this.f33657d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    C4193i c4193i = (C4193i) this.f33657d.get(i11);
                    if (c4193i.f33708g) {
                        A(c4188d, c4193i, true);
                    } else if (c4193i.f33715n) {
                        C(c4188d, c4193i, true);
                    } else {
                        B(c4188d, c4188d.f33678h[c4193i.f33705d], true);
                    }
                }
                this.f33657d.clear();
            } else {
                z10 = true;
            }
        }
        if (C4188d.f33666u && this.f33654a != null && this.f33658e.a() == 0) {
            this.f33659f = true;
            c4188d.f33672b = true;
        }
    }

    @Override // c1.C4188d.a
    public C4193i a(C4188d c4188d, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // c1.C4188d.a
    public void b(C4188d.a aVar) {
        if (aVar instanceof C4186b) {
            C4186b c4186b = (C4186b) aVar;
            this.f33654a = null;
            this.f33658e.clear();
            for (int i10 = 0; i10 < c4186b.f33658e.a(); i10++) {
                this.f33658e.g(c4186b.f33658e.b(i10), c4186b.f33658e.d(i10), true);
            }
        }
    }

    @Override // c1.C4188d.a
    public void c(C4193i c4193i) {
        int i10 = c4193i.f33706e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f33658e.i(c4193i, f10);
    }

    @Override // c1.C4188d.a
    public void clear() {
        this.f33658e.clear();
        this.f33654a = null;
        this.f33655b = 0.0f;
    }

    public C4186b d(C4188d c4188d, int i10) {
        this.f33658e.i(c4188d.o(i10, "ep"), 1.0f);
        this.f33658e.i(c4188d.o(i10, "em"), -1.0f);
        return this;
    }

    C4186b e(C4193i c4193i, int i10) {
        this.f33658e.i(c4193i, i10);
        return this;
    }

    boolean f(C4188d c4188d) {
        boolean z10;
        C4193i c4193iG = g(c4188d);
        if (c4193iG == null) {
            z10 = true;
        } else {
            x(c4193iG);
            z10 = false;
        }
        if (this.f33658e.a() == 0) {
            this.f33659f = true;
        }
        return z10;
    }

    C4193i g(C4188d c4188d) {
        int iA = this.f33658e.a();
        C4193i c4193i = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        C4193i c4193i2 = null;
        for (int i10 = 0; i10 < iA; i10++) {
            float fD = this.f33658e.d(i10);
            C4193i c4193iB = this.f33658e.b(i10);
            if (c4193iB.f33711j == C4193i.a.UNRESTRICTED) {
                if (c4193i == null || f10 > fD) {
                    boolean zU = u(c4193iB, c4188d);
                    z10 = zU;
                    f10 = fD;
                    c4193i = c4193iB;
                } else if (!z10 && u(c4193iB, c4188d)) {
                    f10 = fD;
                    c4193i = c4193iB;
                    z10 = true;
                }
            } else if (c4193i == null && fD < 0.0f) {
                if (c4193i2 == null || f11 > fD) {
                    boolean zU2 = u(c4193iB, c4188d);
                    z11 = zU2;
                    f11 = fD;
                    c4193i2 = c4193iB;
                } else if (!z11 && u(c4193iB, c4188d)) {
                    f11 = fD;
                    c4193i2 = c4193iB;
                    z11 = true;
                }
            }
        }
        return c4193i != null ? c4193i : c4193i2;
    }

    @Override // c1.C4188d.a
    public C4193i getKey() {
        return this.f33654a;
    }

    C4186b h(C4193i c4193i, C4193i c4193i2, int i10, float f10, C4193i c4193i3, C4193i c4193i4, int i11) {
        if (c4193i2 == c4193i3) {
            this.f33658e.i(c4193i, 1.0f);
            this.f33658e.i(c4193i4, 1.0f);
            this.f33658e.i(c4193i2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f33658e.i(c4193i, 1.0f);
            this.f33658e.i(c4193i2, -1.0f);
            this.f33658e.i(c4193i3, -1.0f);
            this.f33658e.i(c4193i4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f33655b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            this.f33658e.i(c4193i, -1.0f);
            this.f33658e.i(c4193i2, 1.0f);
            this.f33655b = i10;
        } else if (f10 >= 1.0f) {
            this.f33658e.i(c4193i4, -1.0f);
            this.f33658e.i(c4193i3, 1.0f);
            this.f33655b = -i11;
        } else {
            float f11 = 1.0f - f10;
            this.f33658e.i(c4193i, f11 * 1.0f);
            this.f33658e.i(c4193i2, f11 * (-1.0f));
            this.f33658e.i(c4193i3, (-1.0f) * f10);
            this.f33658e.i(c4193i4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f33655b = ((-i10) * f11) + (i11 * f10);
            }
        }
        return this;
    }

    C4186b i(C4193i c4193i, int i10) {
        this.f33654a = c4193i;
        float f10 = i10;
        c4193i.f33707f = f10;
        this.f33655b = f10;
        this.f33659f = true;
        return this;
    }

    @Override // c1.C4188d.a
    public boolean isEmpty() {
        return this.f33654a == null && this.f33655b == 0.0f && this.f33658e.a() == 0;
    }

    C4186b j(C4193i c4193i, C4193i c4193i2, float f10) {
        this.f33658e.i(c4193i, -1.0f);
        this.f33658e.i(c4193i2, f10);
        return this;
    }

    public C4186b k(C4193i c4193i, C4193i c4193i2, C4193i c4193i3, C4193i c4193i4, float f10) {
        this.f33658e.i(c4193i, -1.0f);
        this.f33658e.i(c4193i2, 1.0f);
        this.f33658e.i(c4193i3, f10);
        this.f33658e.i(c4193i4, -f10);
        return this;
    }

    public C4186b l(float f10, float f11, float f12, C4193i c4193i, C4193i c4193i2, C4193i c4193i3, C4193i c4193i4) {
        this.f33655b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f33658e.i(c4193i, 1.0f);
            this.f33658e.i(c4193i2, -1.0f);
            this.f33658e.i(c4193i4, 1.0f);
            this.f33658e.i(c4193i3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f33658e.i(c4193i, 1.0f);
            this.f33658e.i(c4193i2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f33658e.i(c4193i3, 1.0f);
            this.f33658e.i(c4193i4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f33658e.i(c4193i, 1.0f);
            this.f33658e.i(c4193i2, -1.0f);
            this.f33658e.i(c4193i4, f13);
            this.f33658e.i(c4193i3, -f13);
        }
        return this;
    }

    public C4186b m(C4193i c4193i, int i10) {
        if (i10 < 0) {
            this.f33655b = i10 * (-1);
            this.f33658e.i(c4193i, 1.0f);
        } else {
            this.f33655b = i10;
            this.f33658e.i(c4193i, -1.0f);
        }
        return this;
    }

    public C4186b n(C4193i c4193i, C4193i c4193i2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f33655b = i10;
        }
        if (z10) {
            this.f33658e.i(c4193i, 1.0f);
            this.f33658e.i(c4193i2, -1.0f);
        } else {
            this.f33658e.i(c4193i, -1.0f);
            this.f33658e.i(c4193i2, 1.0f);
        }
        return this;
    }

    public C4186b o(C4193i c4193i, C4193i c4193i2, C4193i c4193i3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f33655b = i10;
        }
        if (z10) {
            this.f33658e.i(c4193i, 1.0f);
            this.f33658e.i(c4193i2, -1.0f);
            this.f33658e.i(c4193i3, -1.0f);
        } else {
            this.f33658e.i(c4193i, -1.0f);
            this.f33658e.i(c4193i2, 1.0f);
            this.f33658e.i(c4193i3, 1.0f);
        }
        return this;
    }

    public C4186b p(C4193i c4193i, C4193i c4193i2, C4193i c4193i3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f33655b = i10;
        }
        if (z10) {
            this.f33658e.i(c4193i, 1.0f);
            this.f33658e.i(c4193i2, -1.0f);
            this.f33658e.i(c4193i3, 1.0f);
        } else {
            this.f33658e.i(c4193i, -1.0f);
            this.f33658e.i(c4193i2, 1.0f);
            this.f33658e.i(c4193i3, -1.0f);
        }
        return this;
    }

    public C4186b q(C4193i c4193i, C4193i c4193i2, C4193i c4193i3, C4193i c4193i4, float f10) {
        this.f33658e.i(c4193i3, 0.5f);
        this.f33658e.i(c4193i4, 0.5f);
        this.f33658e.i(c4193i, -0.5f);
        this.f33658e.i(c4193i2, -0.5f);
        this.f33655b = -f10;
        return this;
    }

    void r() {
        float f10 = this.f33655b;
        if (f10 < 0.0f) {
            this.f33655b = f10 * (-1.0f);
            this.f33658e.c();
        }
    }

    boolean s() {
        C4193i c4193i = this.f33654a;
        return c4193i != null && (c4193i.f33711j == C4193i.a.UNRESTRICTED || this.f33655b >= 0.0f);
    }

    boolean t(C4193i c4193i) {
        return this.f33658e.h(c4193i);
    }

    public String toString() {
        return z();
    }

    public C4193i v(C4193i c4193i) {
        return w(null, c4193i);
    }

    void x(C4193i c4193i) {
        C4193i c4193i2 = this.f33654a;
        if (c4193i2 != null) {
            this.f33658e.i(c4193i2, -1.0f);
            this.f33654a.f33705d = -1;
            this.f33654a = null;
        }
        float f10 = this.f33658e.f(c4193i, true) * (-1.0f);
        this.f33654a = c4193i;
        if (f10 == 1.0f) {
            return;
        }
        this.f33655b /= f10;
        this.f33658e.e(f10);
    }

    public void y() {
        this.f33654a = null;
        this.f33658e.clear();
        this.f33655b = 0.0f;
        this.f33659f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String z() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C4186b.z():java.lang.String");
    }

    public C4186b(C4187c c4187c) {
        this.f33658e = new C4185a(this, c4187c);
    }
}
