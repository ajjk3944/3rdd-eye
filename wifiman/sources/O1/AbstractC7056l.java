package o1;

import o1.C7049e;
import p1.C7206b;

/* renamed from: o1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7056l extends AbstractC7054j {

    /* renamed from: y0, reason: collision with root package name */
    private int f55243y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    private int f55244z0 = 0;

    /* renamed from: A0, reason: collision with root package name */
    private int f55232A0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    private int f55233B0 = 0;

    /* renamed from: C0, reason: collision with root package name */
    private int f55234C0 = 0;

    /* renamed from: D0, reason: collision with root package name */
    private int f55235D0 = 0;

    /* renamed from: E0, reason: collision with root package name */
    private int f55236E0 = 0;

    /* renamed from: F0, reason: collision with root package name */
    private int f55237F0 = 0;

    /* renamed from: G0, reason: collision with root package name */
    private boolean f55238G0 = false;

    /* renamed from: H0, reason: collision with root package name */
    private int f55239H0 = 0;

    /* renamed from: I0, reason: collision with root package name */
    private int f55240I0 = 0;

    /* renamed from: J0, reason: collision with root package name */
    protected C7206b.a f55241J0 = new C7206b.a();

    /* renamed from: K0, reason: collision with root package name */
    C7206b.InterfaceC2026b f55242K0 = null;

    public void K0(boolean z10) {
        int i10 = this.f55234C0;
        if (i10 > 0 || this.f55235D0 > 0) {
            if (z10) {
                this.f55236E0 = this.f55235D0;
                this.f55237F0 = i10;
            } else {
                this.f55236E0 = i10;
                this.f55237F0 = this.f55235D0;
            }
        }
    }

    public void L0() {
        for (int i10 = 0; i10 < this.f55230x0; i10++) {
            C7049e c7049e = this.f55229w0[i10];
            if (c7049e != null) {
                c7049e.q0(true);
            }
        }
    }

    public int M0() {
        return this.f55240I0;
    }

    public int N0() {
        return this.f55239H0;
    }

    public int O0() {
        return this.f55244z0;
    }

    public int P0() {
        return this.f55236E0;
    }

    public int Q0() {
        return this.f55237F0;
    }

    public int R0() {
        return this.f55243y0;
    }

    public abstract void S0(int i10, int i11, int i12, int i13);

    protected void T0(C7049e c7049e, C7049e.b bVar, int i10, C7049e.b bVar2, int i11) {
        while (this.f55242K0 == null && G() != null) {
            this.f55242K0 = ((C7050f) G()).U0();
        }
        C7206b.a aVar = this.f55241J0;
        aVar.f57451a = bVar;
        aVar.f57452b = bVar2;
        aVar.f57453c = i10;
        aVar.f57454d = i11;
        this.f55242K0.b(c7049e, aVar);
        c7049e.E0(this.f55241J0.f57455e);
        c7049e.h0(this.f55241J0.f57456f);
        c7049e.g0(this.f55241J0.f57458h);
        c7049e.b0(this.f55241J0.f57457g);
    }

    protected boolean U0() {
        C7049e c7049e = this.f55094N;
        C7206b.InterfaceC2026b interfaceC2026bU0 = c7049e != null ? ((C7050f) c7049e).U0() : null;
        if (interfaceC2026bU0 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.f55230x0; i10++) {
            C7049e c7049e2 = this.f55229w0[i10];
            if (c7049e2 != null && !(c7049e2 instanceof C7052h)) {
                C7049e.b bVarS = c7049e2.s(0);
                C7049e.b bVarS2 = c7049e2.s(1);
                C7049e.b bVar = C7049e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar || c7049e2.f55129l == 1 || bVarS2 != bVar || c7049e2.f55131m == 1) {
                    if (bVarS == bVar) {
                        bVarS = C7049e.b.WRAP_CONTENT;
                    }
                    if (bVarS2 == bVar) {
                        bVarS2 = C7049e.b.WRAP_CONTENT;
                    }
                    C7206b.a aVar = this.f55241J0;
                    aVar.f57451a = bVarS;
                    aVar.f57452b = bVarS2;
                    aVar.f57453c = c7049e2.P();
                    this.f55241J0.f57454d = c7049e2.v();
                    interfaceC2026bU0.b(c7049e2, this.f55241J0);
                    c7049e2.E0(this.f55241J0.f57455e);
                    c7049e2.h0(this.f55241J0.f57456f);
                    c7049e2.b0(this.f55241J0.f57457g);
                }
            }
        }
        return true;
    }

    public boolean V0() {
        return this.f55238G0;
    }

    protected void W0(boolean z10) {
        this.f55238G0 = z10;
    }

    public void X0(int i10, int i11) {
        this.f55239H0 = i10;
        this.f55240I0 = i11;
    }

    public void Y0(int i10) {
        this.f55232A0 = i10;
        this.f55243y0 = i10;
        this.f55233B0 = i10;
        this.f55244z0 = i10;
        this.f55234C0 = i10;
        this.f55235D0 = i10;
    }

    public void Z0(int i10) {
        this.f55244z0 = i10;
    }

    public void a1(int i10) {
        this.f55235D0 = i10;
    }

    public void b1(int i10) {
        this.f55232A0 = i10;
        this.f55236E0 = i10;
    }

    @Override // o1.AbstractC7054j, o1.InterfaceC7053i
    public void c(C7050f c7050f) {
        L0();
    }

    public void c1(int i10) {
        this.f55233B0 = i10;
        this.f55237F0 = i10;
    }

    public void d1(int i10) {
        this.f55234C0 = i10;
        this.f55236E0 = i10;
        this.f55237F0 = i10;
    }

    public void e1(int i10) {
        this.f55243y0 = i10;
    }
}
