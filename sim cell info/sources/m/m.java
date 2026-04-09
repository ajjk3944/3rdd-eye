package m;

import m.e;

/* loaded from: classes.dex */
public class m extends o {

    /* renamed from: c, reason: collision with root package name */
    e f2941c;

    /* renamed from: d, reason: collision with root package name */
    float f2942d;

    /* renamed from: e, reason: collision with root package name */
    m f2943e;

    /* renamed from: f, reason: collision with root package name */
    float f2944f;

    /* renamed from: g, reason: collision with root package name */
    m f2945g;

    /* renamed from: h, reason: collision with root package name */
    float f2946h;

    /* renamed from: j, reason: collision with root package name */
    private m f2948j;

    /* renamed from: k, reason: collision with root package name */
    private float f2949k;

    /* renamed from: i, reason: collision with root package name */
    int f2947i = 0;

    /* renamed from: l, reason: collision with root package name */
    private n f2950l = null;

    /* renamed from: m, reason: collision with root package name */
    private int f2951m = 1;

    /* renamed from: n, reason: collision with root package name */
    private n f2952n = null;

    /* renamed from: o, reason: collision with root package name */
    private int f2953o = 1;

    public m(e eVar) {
        this.f2941c = eVar;
    }

    @Override // m.o
    public void e() {
        super.e();
        this.f2943e = null;
        this.f2944f = 0.0f;
        this.f2950l = null;
        this.f2951m = 1;
        this.f2952n = null;
        this.f2953o = 1;
        this.f2945g = null;
        this.f2946h = 0.0f;
        this.f2942d = 0.0f;
        this.f2948j = null;
        this.f2949k = 0.0f;
        this.f2947i = 0;
    }

    @Override // m.o
    public void f() {
        int i2;
        m mVar;
        m mVar2;
        m mVar3;
        m mVar4;
        m mVar5;
        m mVar6;
        float fD;
        float f2;
        m mVar7;
        float f3;
        boolean z2 = true;
        if (this.f2956b == 1 || (i2 = this.f2947i) == 4) {
            return;
        }
        n nVar = this.f2950l;
        if (nVar != null) {
            if (nVar.f2956b != 1) {
                return;
            } else {
                this.f2944f = this.f2951m * nVar.f2954c;
            }
        }
        n nVar2 = this.f2952n;
        if (nVar2 != null) {
            if (nVar2.f2956b != 1) {
                return;
            } else {
                this.f2949k = this.f2953o * nVar2.f2954c;
            }
        }
        if (i2 == 1 && ((mVar7 = this.f2943e) == null || mVar7.f2956b == 1)) {
            if (mVar7 == null) {
                this.f2945g = this;
                f3 = this.f2944f;
            } else {
                this.f2945g = mVar7.f2945g;
                f3 = mVar7.f2946h + this.f2944f;
            }
            this.f2946h = f3;
            b();
            return;
        }
        if (i2 == 2 && (mVar4 = this.f2943e) != null && mVar4.f2956b == 1 && (mVar5 = this.f2948j) != null && (mVar6 = mVar5.f2943e) != null && mVar6.f2956b == 1) {
            l.e.x();
            m mVar8 = this.f2943e;
            this.f2945g = mVar8.f2945g;
            m mVar9 = this.f2948j;
            m mVar10 = mVar9.f2943e;
            mVar9.f2945g = mVar10.f2945g;
            e.d dVar = this.f2941c.f2852c;
            e.d dVar2 = e.d.RIGHT;
            int i3 = 0;
            if (dVar != dVar2 && dVar != e.d.BOTTOM) {
                z2 = false;
            }
            float f4 = z2 ? mVar8.f2946h - mVar10.f2946h : mVar10.f2946h - mVar8.f2946h;
            if (dVar == e.d.LEFT || dVar == dVar2) {
                fD = f4 - r2.f2851b.D();
                f2 = this.f2941c.f2851b.Z;
            } else {
                fD = f4 - r2.f2851b.r();
                f2 = this.f2941c.f2851b.f2879a0;
            }
            int iD = this.f2941c.d();
            int iD2 = this.f2948j.f2941c.d();
            if (this.f2941c.i() == this.f2948j.f2941c.i()) {
                f2 = 0.5f;
                iD2 = 0;
            } else {
                i3 = iD;
            }
            float f5 = i3;
            float f6 = iD2;
            float f7 = (fD - f5) - f6;
            if (z2) {
                m mVar11 = this.f2948j;
                mVar11.f2946h = mVar11.f2943e.f2946h + f6 + (f7 * f2);
                this.f2946h = (this.f2943e.f2946h - f5) - (f7 * (1.0f - f2));
            } else {
                this.f2946h = this.f2943e.f2946h + f5 + (f7 * f2);
                m mVar12 = this.f2948j;
                mVar12.f2946h = (mVar12.f2943e.f2946h - f6) - (f7 * (1.0f - f2));
            }
        } else {
            if (i2 != 3 || (mVar = this.f2943e) == null || mVar.f2956b != 1 || (mVar2 = this.f2948j) == null || (mVar3 = mVar2.f2943e) == null || mVar3.f2956b != 1) {
                if (i2 == 5) {
                    this.f2941c.f2851b.U();
                    return;
                }
                return;
            }
            l.e.x();
            m mVar13 = this.f2943e;
            this.f2945g = mVar13.f2945g;
            m mVar14 = this.f2948j;
            m mVar15 = mVar14.f2943e;
            mVar14.f2945g = mVar15.f2945g;
            this.f2946h = mVar13.f2946h + this.f2944f;
            mVar14.f2946h = mVar15.f2946h + mVar14.f2944f;
        }
        b();
        this.f2948j.b();
    }

    void g(l.e eVar) {
        l.i iVarG = this.f2941c.g();
        m mVar = this.f2945g;
        if (mVar == null) {
            eVar.f(iVarG, (int) (this.f2946h + 0.5f));
        } else {
            eVar.e(iVarG, eVar.r(mVar.f2941c), (int) (this.f2946h + 0.5f), 6);
        }
    }

    public void h(int i2, m mVar, int i3) {
        this.f2947i = i2;
        this.f2943e = mVar;
        this.f2944f = i3;
        mVar.a(this);
    }

    public void i(m mVar, int i2) {
        this.f2943e = mVar;
        this.f2944f = i2;
        mVar.a(this);
    }

    public void j(m mVar, int i2, n nVar) {
        this.f2943e = mVar;
        mVar.a(this);
        this.f2950l = nVar;
        this.f2951m = i2;
        nVar.a(this);
    }

    public float k() {
        return this.f2946h;
    }

    public void l(m mVar, float f2) {
        int i2 = this.f2956b;
        if (i2 == 0 || !(this.f2945g == mVar || this.f2946h == f2)) {
            this.f2945g = mVar;
            this.f2946h = f2;
            if (i2 == 1) {
                c();
            }
            b();
        }
    }

    String m(int i2) {
        return i2 == 1 ? "DIRECT" : i2 == 2 ? "CENTER" : i2 == 3 ? "MATCH" : i2 == 4 ? "CHAIN" : i2 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public void n(m mVar, float f2) {
        this.f2948j = mVar;
        this.f2949k = f2;
    }

    public void o(m mVar, int i2, n nVar) {
        this.f2948j = mVar;
        this.f2952n = nVar;
        this.f2953o = i2;
    }

    public void p(int i2) {
        this.f2947i = i2;
    }

    public void q() {
        e eVarI = this.f2941c.i();
        if (eVarI == null) {
            return;
        }
        if (eVarI.i() == this.f2941c) {
            this.f2947i = 4;
            eVarI.f().f2947i = 4;
        }
        int iD = this.f2941c.d();
        e.d dVar = this.f2941c.f2852c;
        if (dVar == e.d.RIGHT || dVar == e.d.BOTTOM) {
            iD = -iD;
        }
        i(eVarI.f(), iD);
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (this.f2956b != 1) {
            sb = new StringBuilder();
            sb.append("{ ");
            sb.append(this.f2941c);
            str = " UNRESOLVED} type: ";
        } else if (this.f2945g == this) {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f2941c);
            sb.append(", RESOLVED: ");
            sb.append(this.f2946h);
            str = "]  type: ";
        } else {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f2941c);
            sb.append(", RESOLVED: ");
            sb.append(this.f2945g);
            sb.append(":");
            sb.append(this.f2946h);
            str = "] type: ";
        }
        sb.append(str);
        sb.append(m(this.f2947i));
        return sb.toString();
    }
}
