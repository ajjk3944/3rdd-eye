package n1;

import java.util.ArrayList;
import java.util.Iterator;
import n1.d;
import n1.i;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f54222e;

    /* renamed from: a, reason: collision with root package name */
    i f54218a = null;

    /* renamed from: b, reason: collision with root package name */
    float f54219b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f54220c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f54221d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    boolean f54223f = false;

    public interface a {
        int a();

        i b(int i10);

        void c();

        void clear();

        float d(int i10);

        void e(float f10);

        void f(i iVar, float f10);

        float g(i iVar, boolean z10);

        float h(i iVar);

        float i(b bVar, boolean z10);

        boolean j(i iVar);

        void k(i iVar, float f10, boolean z10);
    }

    public b() {
    }

    private boolean v(i iVar, d dVar) {
        return iVar.f54274m <= 1;
    }

    private i x(boolean[] zArr, i iVar) {
        i.a aVar;
        int iA = this.f54222e.a();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iA; i10++) {
            float fD = this.f54222e.d(i10);
            if (fD < 0.0f) {
                i iVarB = this.f54222e.b(i10);
                if ((zArr == null || !zArr[iVarB.f54264c]) && iVarB != iVar && (((aVar = iVarB.f54271j) == i.a.SLACK || aVar == i.a.ERROR) && fD < f10)) {
                    f10 = fD;
                    iVar2 = iVarB;
                }
            }
        }
        return iVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String A() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.b.A():java.lang.String");
    }

    public void B(d dVar, i iVar, boolean z10) {
        if (iVar.f54268g) {
            this.f54219b += iVar.f54267f * this.f54222e.h(iVar);
            this.f54222e.g(iVar, z10);
            if (z10) {
                iVar.c(this);
            }
        }
    }

    public void C(b bVar, boolean z10) {
        this.f54219b += bVar.f54219b * this.f54222e.i(bVar, z10);
        if (z10) {
            bVar.f54218a.c(this);
        }
    }

    public void D(d dVar) {
        if (dVar.f54237f.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iA = this.f54222e.a();
            for (int i10 = 0; i10 < iA; i10++) {
                i iVarB = this.f54222e.b(i10);
                if (iVarB.f54265d != -1 || iVarB.f54268g) {
                    this.f54221d.add(iVarB);
                }
            }
            if (this.f54221d.size() > 0) {
                Iterator it = this.f54221d.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    if (iVar.f54268g) {
                        B(dVar, iVar, true);
                    } else {
                        C(dVar.f54237f[iVar.f54265d], true);
                    }
                }
                this.f54221d.clear();
            } else {
                z10 = true;
            }
        }
    }

    @Override // n1.d.a
    public i a(d dVar, boolean[] zArr) {
        return x(zArr, null);
    }

    @Override // n1.d.a
    public void b(i iVar) {
        int i10 = iVar.f54266e;
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
        this.f54222e.f(iVar, f10);
    }

    @Override // n1.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f54218a = null;
            this.f54222e.clear();
            for (int i10 = 0; i10 < bVar.f54222e.a(); i10++) {
                this.f54222e.k(bVar.f54222e.b(i10), bVar.f54222e.d(i10), true);
            }
        }
    }

    @Override // n1.d.a
    public void clear() {
        this.f54222e.clear();
        this.f54218a = null;
        this.f54219b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f54222e.f(dVar.o(i10, "ep"), 1.0f);
        this.f54222e.f(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i10) {
        this.f54222e.f(iVar, i10);
        return this;
    }

    boolean f(d dVar) {
        boolean z10;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z10 = true;
        } else {
            y(iVarG);
            z10 = false;
        }
        if (this.f54222e.a() == 0) {
            this.f54223f = true;
        }
        return z10;
    }

    i g(d dVar) {
        int iA = this.f54222e.a();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < iA; i10++) {
            float fD = this.f54222e.d(i10);
            i iVarB = this.f54222e.b(i10);
            if (iVarB.f54271j == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > fD) {
                    boolean zV = v(iVarB, dVar);
                    z10 = zV;
                    f10 = fD;
                    iVar = iVarB;
                } else if (!z10 && v(iVarB, dVar)) {
                    f10 = fD;
                    iVar = iVarB;
                    z10 = true;
                }
            } else if (iVar == null && fD < 0.0f) {
                if (iVar2 == null || f11 > fD) {
                    boolean zV2 = v(iVarB, dVar);
                    z11 = zV2;
                    f11 = fD;
                    iVar2 = iVarB;
                } else if (!z11 && v(iVarB, dVar)) {
                    f11 = fD;
                    iVar2 = iVarB;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // n1.d.a
    public i getKey() {
        return this.f54218a;
    }

    b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f54222e.f(iVar, 1.0f);
            this.f54222e.f(iVar4, 1.0f);
            this.f54222e.f(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f54222e.f(iVar, 1.0f);
            this.f54222e.f(iVar2, -1.0f);
            this.f54222e.f(iVar3, -1.0f);
            this.f54222e.f(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f54219b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            this.f54222e.f(iVar, -1.0f);
            this.f54222e.f(iVar2, 1.0f);
            this.f54219b = i10;
        } else if (f10 >= 1.0f) {
            this.f54222e.f(iVar4, -1.0f);
            this.f54222e.f(iVar3, 1.0f);
            this.f54219b = -i11;
        } else {
            float f11 = 1.0f - f10;
            this.f54222e.f(iVar, f11 * 1.0f);
            this.f54222e.f(iVar2, f11 * (-1.0f));
            this.f54222e.f(iVar3, (-1.0f) * f10);
            this.f54222e.f(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f54219b = ((-i10) * f11) + (i11 * f10);
            }
        }
        return this;
    }

    b i(i iVar, int i10) {
        this.f54218a = iVar;
        float f10 = i10;
        iVar.f54267f = f10;
        this.f54219b = f10;
        this.f54223f = true;
        return this;
    }

    b j(i iVar, i iVar2, float f10) {
        this.f54222e.f(iVar, -1.0f);
        this.f54222e.f(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f54222e.f(iVar, -1.0f);
        this.f54222e.f(iVar2, 1.0f);
        this.f54222e.f(iVar3, f10);
        this.f54222e.f(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f54219b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f54222e.f(iVar, 1.0f);
            this.f54222e.f(iVar2, -1.0f);
            this.f54222e.f(iVar4, 1.0f);
            this.f54222e.f(iVar3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f54222e.f(iVar, 1.0f);
            this.f54222e.f(iVar2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f54222e.f(iVar3, 1.0f);
            this.f54222e.f(iVar4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f54222e.f(iVar, 1.0f);
            this.f54222e.f(iVar2, -1.0f);
            this.f54222e.f(iVar4, f13);
            this.f54222e.f(iVar3, -f13);
        }
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f54219b = i10 * (-1);
            this.f54222e.f(iVar, 1.0f);
        } else {
            this.f54219b = i10;
            this.f54222e.f(iVar, -1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f54219b = i10;
        }
        if (z10) {
            this.f54222e.f(iVar, 1.0f);
            this.f54222e.f(iVar2, -1.0f);
        } else {
            this.f54222e.f(iVar, -1.0f);
            this.f54222e.f(iVar2, 1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f54219b = i10;
        }
        if (z10) {
            this.f54222e.f(iVar, 1.0f);
            this.f54222e.f(iVar2, -1.0f);
            this.f54222e.f(iVar3, -1.0f);
        } else {
            this.f54222e.f(iVar, -1.0f);
            this.f54222e.f(iVar2, 1.0f);
            this.f54222e.f(iVar3, 1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f54219b = i10;
        }
        if (z10) {
            this.f54222e.f(iVar, 1.0f);
            this.f54222e.f(iVar2, -1.0f);
            this.f54222e.f(iVar3, 1.0f);
        } else {
            this.f54222e.f(iVar, -1.0f);
            this.f54222e.f(iVar2, 1.0f);
            this.f54222e.f(iVar3, -1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f54222e.f(iVar3, 0.5f);
        this.f54222e.f(iVar4, 0.5f);
        this.f54222e.f(iVar, -0.5f);
        this.f54222e.f(iVar2, -0.5f);
        this.f54219b = -f10;
        return this;
    }

    void r() {
        float f10 = this.f54219b;
        if (f10 < 0.0f) {
            this.f54219b = f10 * (-1.0f);
            this.f54222e.c();
        }
    }

    boolean s() {
        i iVar = this.f54218a;
        return iVar != null && (iVar.f54271j == i.a.UNRESTRICTED || this.f54219b >= 0.0f);
    }

    boolean t(i iVar) {
        return this.f54222e.j(iVar);
    }

    public String toString() {
        return A();
    }

    public boolean u() {
        return this.f54218a == null && this.f54219b == 0.0f && this.f54222e.a() == 0;
    }

    public i w(i iVar) {
        return x(null, iVar);
    }

    void y(i iVar) {
        i iVar2 = this.f54218a;
        if (iVar2 != null) {
            this.f54222e.f(iVar2, -1.0f);
            this.f54218a = null;
        }
        float fG = this.f54222e.g(iVar, true) * (-1.0f);
        this.f54218a = iVar;
        if (fG == 1.0f) {
            return;
        }
        this.f54219b /= fG;
        this.f54222e.e(fG);
    }

    public void z() {
        this.f54218a = null;
        this.f54222e.clear();
        this.f54219b = 0.0f;
        this.f54223f = false;
    }

    public b(c cVar) {
        this.f54222e = new C6866a(this, cVar);
    }
}
