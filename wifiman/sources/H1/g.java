package h1;

import g1.AbstractC5849g;
import g1.C5847e;
import i1.C6061b;

/* loaded from: classes.dex */
public class g extends C5847e {

    /* renamed from: A0, reason: collision with root package name */
    private String f48372A0;

    /* renamed from: B0, reason: collision with root package name */
    private String f48373B0;

    /* renamed from: C0, reason: collision with root package name */
    private String f48374C0;

    /* renamed from: D0, reason: collision with root package name */
    private String f48375D0;

    /* renamed from: E0, reason: collision with root package name */
    private int f48376E0;

    /* renamed from: q0, reason: collision with root package name */
    private C6061b f48377q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f48378r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f48379s0;

    /* renamed from: t0, reason: collision with root package name */
    private int f48380t0;

    /* renamed from: u0, reason: collision with root package name */
    private int f48381u0;

    /* renamed from: v0, reason: collision with root package name */
    private int f48382v0;

    /* renamed from: w0, reason: collision with root package name */
    private int f48383w0;

    /* renamed from: x0, reason: collision with root package name */
    private int f48384x0;

    /* renamed from: y0, reason: collision with root package name */
    private float f48385y0;

    /* renamed from: z0, reason: collision with root package name */
    private float f48386z0;

    public g(AbstractC5849g abstractC5849g, AbstractC5849g.d dVar) {
        super(abstractC5849g, dVar);
        this.f48378r0 = 0;
        this.f48379s0 = 0;
        this.f48380t0 = 0;
        this.f48381u0 = 0;
        if (dVar == AbstractC5849g.d.ROW) {
            this.f48383w0 = 1;
        } else if (dVar == AbstractC5849g.d.COLUMN) {
            this.f48384x0 = 1;
        }
    }

    public void A0(float f10) {
        this.f48385y0 = f10;
    }

    public void B0(int i10) {
        this.f48382v0 = i10;
    }

    public void C0(int i10) {
        this.f48381u0 = i10;
    }

    public void D0(int i10) {
        this.f48379s0 = i10;
    }

    public void E0(int i10) {
        this.f48378r0 = i10;
    }

    public void F0(int i10) {
        this.f48380t0 = i10;
    }

    public void G0(String str) {
        this.f48372A0 = str;
    }

    public void H0(int i10) {
        if (super.v0() == AbstractC5849g.d.COLUMN) {
            return;
        }
        this.f48383w0 = i10;
    }

    public void I0(String str) {
        this.f48375D0 = str;
    }

    public void J0(String str) {
        this.f48374C0 = str;
    }

    public void K0(float f10) {
        this.f48386z0 = f10;
    }

    @Override // g1.C5847e, g1.C5843a, g1.InterfaceC5848f
    public void apply() {
        u0();
        this.f48377q0.Y1(this.f48382v0);
        int i10 = this.f48383w0;
        if (i10 != 0) {
            this.f48377q0.a2(i10);
        }
        int i11 = this.f48384x0;
        if (i11 != 0) {
            this.f48377q0.V1(i11);
        }
        float f10 = this.f48385y0;
        if (f10 != 0.0f) {
            this.f48377q0.X1(f10);
        }
        float f11 = this.f48386z0;
        if (f11 != 0.0f) {
            this.f48377q0.d2(f11);
        }
        String str = this.f48372A0;
        if (str != null && !str.isEmpty()) {
            this.f48377q0.Z1(this.f48372A0);
        }
        String str2 = this.f48373B0;
        if (str2 != null && !str2.isEmpty()) {
            this.f48377q0.U1(this.f48373B0);
        }
        String str3 = this.f48374C0;
        if (str3 != null && !str3.isEmpty()) {
            this.f48377q0.c2(this.f48374C0);
        }
        String str4 = this.f48375D0;
        if (str4 != null && !str4.isEmpty()) {
            this.f48377q0.b2(this.f48375D0);
        }
        this.f48377q0.W1(this.f48376E0);
        this.f48377q0.u1(this.f48378r0);
        this.f48377q0.r1(this.f48379s0);
        this.f48377q0.v1(this.f48380t0);
        this.f48377q0.q1(this.f48381u0);
        t0();
    }

    @Override // g1.C5847e
    public j1.j u0() {
        if (this.f48377q0 == null) {
            this.f48377q0 = new C6061b();
        }
        return this.f48377q0;
    }

    public void w0(String str) {
        this.f48373B0 = str;
    }

    public void x0(int i10) {
        if (super.v0() == AbstractC5849g.d.ROW) {
            return;
        }
        this.f48384x0 = i10;
    }

    public void y0(int i10) {
        this.f48376E0 = i10;
    }

    public void z0(String str) {
        if (str.isEmpty()) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        this.f48376E0 = 0;
        for (String str2 : strArrSplit) {
            String lowerCase = str2.toLowerCase();
            lowerCase.hashCode();
            if (lowerCase.equals("subgridbycolrow")) {
                this.f48376E0 |= 1;
            } else if (lowerCase.equals("spansrespectwidgetorder")) {
                this.f48376E0 |= 2;
            }
        }
    }
}
