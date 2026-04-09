package h1;

import g1.AbstractC5849g;
import g1.C5847e;
import java.util.HashMap;

/* loaded from: classes.dex */
public class f extends C5847e {

    /* renamed from: A0, reason: collision with root package name */
    protected int f48347A0;

    /* renamed from: B0, reason: collision with root package name */
    protected int f48348B0;

    /* renamed from: C0, reason: collision with root package name */
    protected int f48349C0;

    /* renamed from: D0, reason: collision with root package name */
    protected int f48350D0;

    /* renamed from: E0, reason: collision with root package name */
    protected int f48351E0;

    /* renamed from: F0, reason: collision with root package name */
    protected int f48352F0;

    /* renamed from: G0, reason: collision with root package name */
    protected int f48353G0;

    /* renamed from: H0, reason: collision with root package name */
    protected int f48354H0;

    /* renamed from: I0, reason: collision with root package name */
    protected int f48355I0;

    /* renamed from: J0, reason: collision with root package name */
    protected int f48356J0;

    /* renamed from: K0, reason: collision with root package name */
    protected int f48357K0;

    /* renamed from: L0, reason: collision with root package name */
    protected float f48358L0;

    /* renamed from: M0, reason: collision with root package name */
    protected float f48359M0;

    /* renamed from: N0, reason: collision with root package name */
    protected float f48360N0;

    /* renamed from: O0, reason: collision with root package name */
    protected float f48361O0;

    /* renamed from: q0, reason: collision with root package name */
    protected j1.g f48362q0;

    /* renamed from: r0, reason: collision with root package name */
    protected HashMap f48363r0;

    /* renamed from: s0, reason: collision with root package name */
    protected HashMap f48364s0;

    /* renamed from: t0, reason: collision with root package name */
    protected HashMap f48365t0;

    /* renamed from: u0, reason: collision with root package name */
    protected int f48366u0;

    /* renamed from: v0, reason: collision with root package name */
    protected int f48367v0;

    /* renamed from: w0, reason: collision with root package name */
    protected int f48368w0;

    /* renamed from: x0, reason: collision with root package name */
    protected int f48369x0;

    /* renamed from: y0, reason: collision with root package name */
    protected int f48370y0;

    /* renamed from: z0, reason: collision with root package name */
    protected int f48371z0;

    public f(AbstractC5849g abstractC5849g, AbstractC5849g.d dVar) {
        super(abstractC5849g, dVar);
        this.f48366u0 = 0;
        this.f48367v0 = -1;
        this.f48368w0 = -1;
        this.f48369x0 = -1;
        this.f48370y0 = -1;
        this.f48371z0 = -1;
        this.f48347A0 = -1;
        this.f48348B0 = 2;
        this.f48349C0 = 2;
        this.f48350D0 = 0;
        this.f48351E0 = 0;
        this.f48352F0 = 0;
        this.f48353G0 = 0;
        this.f48354H0 = 0;
        this.f48355I0 = 0;
        this.f48356J0 = -1;
        this.f48357K0 = 0;
        this.f48358L0 = 0.5f;
        this.f48359M0 = 0.5f;
        this.f48360N0 = 0.5f;
        this.f48361O0 = 0.5f;
        if (dVar == AbstractC5849g.d.VERTICAL_FLOW) {
            this.f48357K0 = 1;
        }
    }

    public void A0(int i10) {
        this.f48368w0 = i10;
    }

    public void B0(int i10) {
        this.f48349C0 = i10;
    }

    public void C0(int i10) {
        this.f48351E0 = i10;
    }

    public void D0(int i10) {
        this.f48370y0 = i10;
    }

    public void E0(float f10) {
        this.f48361O0 = f10;
    }

    public void F0(int i10) {
        this.f48347A0 = i10;
    }

    public void G0(float f10) {
        this.f48359M0 = f10;
    }

    public void H0(int i10) {
        this.f48369x0 = i10;
    }

    public void I0(int i10) {
        this.f48356J0 = i10;
    }

    public void J0(int i10) {
        this.f48357K0 = i10;
    }

    public void K0(int i10) {
        this.f48355I0 = i10;
    }

    public void L0(int i10) {
        this.f48352F0 = i10;
    }

    public void M0(int i10) {
        this.f48353G0 = i10;
    }

    public void N0(int i10) {
        this.f48354H0 = i10;
    }

    public void O0(int i10) {
        this.f48348B0 = i10;
    }

    public void P0(int i10) {
        this.f48350D0 = i10;
    }

    public void Q0(int i10) {
        this.f48367v0 = i10;
    }

    public void R0(int i10) {
        this.f48366u0 = i10;
    }

    @Override // g1.C5847e, g1.C5843a, g1.InterfaceC5848f
    public void apply() {
        u0();
        d(this.f48362q0);
        this.f48362q0.k2(this.f48357K0);
        this.f48362q0.p2(this.f48366u0);
        int i10 = this.f48356J0;
        if (i10 != -1) {
            this.f48362q0.j2(i10);
        }
        int i11 = this.f48352F0;
        if (i11 != 0) {
            this.f48362q0.s1(i11);
        }
        int i12 = this.f48354H0;
        if (i12 != 0) {
            this.f48362q0.v1(i12);
        }
        int i13 = this.f48353G0;
        if (i13 != 0) {
            this.f48362q0.t1(i13);
        }
        int i14 = this.f48355I0;
        if (i14 != 0) {
            this.f48362q0.q1(i14);
        }
        int i15 = this.f48351E0;
        if (i15 != 0) {
            this.f48362q0.d2(i15);
        }
        int i16 = this.f48350D0;
        if (i16 != 0) {
            this.f48362q0.n2(i16);
        }
        float f10 = this.f47428i;
        if (f10 != 0.5f) {
            this.f48362q0.c2(f10);
        }
        float f11 = this.f48360N0;
        if (f11 != 0.5f) {
            this.f48362q0.X1(f11);
        }
        float f12 = this.f48361O0;
        if (f12 != 0.5f) {
            this.f48362q0.f2(f12);
        }
        float f13 = this.f47430j;
        if (f13 != 0.5f) {
            this.f48362q0.m2(f13);
        }
        float f14 = this.f48358L0;
        if (f14 != 0.5f) {
            this.f48362q0.Z1(f14);
        }
        float f15 = this.f48359M0;
        if (f15 != 0.5f) {
            this.f48362q0.h2(f15);
        }
        int i17 = this.f48349C0;
        if (i17 != 2) {
            this.f48362q0.b2(i17);
        }
        int i18 = this.f48348B0;
        if (i18 != 2) {
            this.f48362q0.l2(i18);
        }
        int i19 = this.f48367v0;
        if (i19 != -1) {
            this.f48362q0.o2(i19);
        }
        int i20 = this.f48368w0;
        if (i20 != -1) {
            this.f48362q0.a2(i20);
        }
        int i21 = this.f48369x0;
        if (i21 != -1) {
            this.f48362q0.i2(i21);
        }
        int i22 = this.f48370y0;
        if (i22 != -1) {
            this.f48362q0.e2(i22);
        }
        int i23 = this.f48371z0;
        if (i23 != -1) {
            this.f48362q0.Y1(i23);
        }
        int i24 = this.f48347A0;
        if (i24 != -1) {
            this.f48362q0.g2(i24);
        }
        t0();
    }

    @Override // g1.C5847e
    public j1.j u0() {
        if (this.f48362q0 == null) {
            this.f48362q0 = new j1.g();
        }
        return this.f48362q0;
    }

    public void w0(String str, float f10, float f11, float f12) {
        super.s0(str);
        if (!Float.isNaN(f10)) {
            if (this.f48363r0 == null) {
                this.f48363r0 = new HashMap();
            }
            this.f48363r0.put(str, Float.valueOf(f10));
        }
        if (!Float.isNaN(f11)) {
            if (this.f48364s0 == null) {
                this.f48364s0 = new HashMap();
            }
            this.f48364s0.put(str, Float.valueOf(f11));
        }
        if (Float.isNaN(f12)) {
            return;
        }
        if (this.f48365t0 == null) {
            this.f48365t0 = new HashMap();
        }
        this.f48365t0.put(str, Float.valueOf(f12));
    }

    public void x0(float f10) {
        this.f48360N0 = f10;
    }

    public void y0(int i10) {
        this.f48371z0 = i10;
    }

    public void z0(float f10) {
        this.f48358L0 = f10;
    }
}
