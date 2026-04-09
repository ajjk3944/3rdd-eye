package j1;

import c1.C4188d;
import c1.C4193i;
import j1.d;
import j1.e;

/* loaded from: classes.dex */
public class h extends e {

    /* renamed from: K0, reason: collision with root package name */
    protected float f50018K0 = -1.0f;

    /* renamed from: L0, reason: collision with root package name */
    protected int f50019L0 = -1;

    /* renamed from: M0, reason: collision with root package name */
    protected int f50020M0 = -1;

    /* renamed from: N0, reason: collision with root package name */
    protected boolean f50021N0 = true;

    /* renamed from: O0, reason: collision with root package name */
    private d f50022O0 = this.f49880O;

    /* renamed from: P0, reason: collision with root package name */
    private int f50023P0 = 0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f50024Q0 = 0;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f50025R0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50026a;

        static {
            int[] iArr = new int[d.a.values().length];
            f50026a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50026a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50026a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50026a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50026a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50026a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50026a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50026a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f50026a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.f49888W.clear();
        this.f49888W.add(this.f50022O0);
        int length = this.f49887V.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f49887V[i10] = this.f50022O0;
        }
    }

    @Override // j1.e
    public void Z0(C4188d c4188d, boolean z10) {
        if (F() == null) {
            return;
        }
        int iX = c4188d.x(this.f50022O0);
        if (this.f50023P0 == 1) {
            V0(iX);
            W0(0);
            z0(F().u());
            U0(0);
            return;
        }
        V0(0);
        W0(iX);
        U0(F().O());
        z0(0);
    }

    public d a1() {
        return this.f50022O0;
    }

    public int b1() {
        return this.f50023P0;
    }

    public int c1() {
        return this.f50019L0;
    }

    @Override // j1.e
    public void d(C4188d c4188d, boolean z10) {
        f fVar = (f) F();
        if (fVar == null) {
            return;
        }
        d dVarL = fVar.l(d.a.LEFT);
        d dVarL2 = fVar.l(d.a.RIGHT);
        e eVar = this.f49891Z;
        boolean z11 = eVar != null && eVar.f49890Y[0] == e.b.WRAP_CONTENT;
        if (this.f50023P0 == 0) {
            dVarL = fVar.l(d.a.TOP);
            dVarL2 = fVar.l(d.a.BOTTOM);
            e eVar2 = this.f49891Z;
            z11 = eVar2 != null && eVar2.f49890Y[1] == e.b.WRAP_CONTENT;
        }
        if (this.f50025R0 && this.f50022O0.n()) {
            C4193i c4193iQ = c4188d.q(this.f50022O0);
            c4188d.f(c4193iQ, this.f50022O0.e());
            if (this.f50019L0 != -1) {
                if (z11) {
                    c4188d.h(c4188d.q(dVarL2), c4193iQ, 0, 5);
                }
            } else if (this.f50020M0 != -1 && z11) {
                C4193i c4193iQ2 = c4188d.q(dVarL2);
                c4188d.h(c4193iQ, c4188d.q(dVarL), 0, 5);
                c4188d.h(c4193iQ2, c4193iQ, 0, 5);
            }
            this.f50025R0 = false;
            return;
        }
        if (this.f50019L0 != -1) {
            C4193i c4193iQ3 = c4188d.q(this.f50022O0);
            c4188d.e(c4193iQ3, c4188d.q(dVarL), this.f50019L0, 8);
            if (z11) {
                c4188d.h(c4188d.q(dVarL2), c4193iQ3, 0, 5);
                return;
            }
            return;
        }
        if (this.f50020M0 == -1) {
            if (this.f50018K0 != -1.0f) {
                c4188d.d(C4188d.s(c4188d, c4188d.q(this.f50022O0), c4188d.q(dVarL2), this.f50018K0));
                return;
            }
            return;
        }
        C4193i c4193iQ4 = c4188d.q(this.f50022O0);
        C4193i c4193iQ5 = c4188d.q(dVarL2);
        c4188d.e(c4193iQ4, c4193iQ5, -this.f50020M0, 8);
        if (z11) {
            c4188d.h(c4193iQ4, c4188d.q(dVarL), 0, 5);
            c4188d.h(c4193iQ5, c4193iQ4, 0, 5);
        }
    }

    public int d1() {
        return this.f50020M0;
    }

    @Override // j1.e
    public boolean e() {
        return true;
    }

    @Override // j1.e
    public boolean e0() {
        return this.f50025R0;
    }

    public float e1() {
        return this.f50018K0;
    }

    @Override // j1.e
    public boolean f0() {
        return this.f50025R0;
    }

    public void f1(int i10) {
        this.f50022O0.t(i10);
        this.f50025R0 = true;
    }

    public void g1(int i10) {
        if (i10 > -1) {
            this.f50018K0 = -1.0f;
            this.f50019L0 = i10;
            this.f50020M0 = -1;
        }
    }

    public void h1(int i10) {
        if (i10 > -1) {
            this.f50018K0 = -1.0f;
            this.f50019L0 = -1;
            this.f50020M0 = i10;
        }
    }

    public void i1(float f10) {
        if (f10 > -1.0f) {
            this.f50018K0 = f10;
            this.f50019L0 = -1;
            this.f50020M0 = -1;
        }
    }

    public void j1(int i10) {
        if (this.f50023P0 == i10) {
            return;
        }
        this.f50023P0 = i10;
        this.f49888W.clear();
        if (this.f50023P0 == 1) {
            this.f50022O0 = this.f49879N;
        } else {
            this.f50022O0 = this.f49880O;
        }
        this.f49888W.add(this.f50022O0);
        int length = this.f49887V.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f49887V[i11] = this.f50022O0;
        }
    }

    @Override // j1.e
    public d l(d.a aVar) {
        int i10 = a.f50026a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f50023P0 == 1) {
                return this.f50022O0;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.f50023P0 == 0) {
            return this.f50022O0;
        }
        return null;
    }
}
