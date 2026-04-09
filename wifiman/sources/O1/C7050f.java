package o1;

import java.util.Arrays;
import o1.C7049e;
import org.conscrypt.PSKKeyManager;
import p1.C7206b;

/* renamed from: o1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7050f extends AbstractC7057m {

    /* renamed from: C0, reason: collision with root package name */
    int f55158C0;

    /* renamed from: D0, reason: collision with root package name */
    int f55159D0;

    /* renamed from: E0, reason: collision with root package name */
    int f55160E0;

    /* renamed from: F0, reason: collision with root package name */
    int f55161F0;

    /* renamed from: x0, reason: collision with root package name */
    C7206b f55176x0 = new C7206b(this);

    /* renamed from: y0, reason: collision with root package name */
    public p1.e f55177y0 = new p1.e(this);

    /* renamed from: z0, reason: collision with root package name */
    protected C7206b.InterfaceC2026b f55178z0 = null;

    /* renamed from: A0, reason: collision with root package name */
    private boolean f55156A0 = false;

    /* renamed from: B0, reason: collision with root package name */
    protected n1.d f55157B0 = new n1.d();

    /* renamed from: G0, reason: collision with root package name */
    int f55162G0 = 0;

    /* renamed from: H0, reason: collision with root package name */
    int f55163H0 = 0;

    /* renamed from: I0, reason: collision with root package name */
    C7047c[] f55164I0 = new C7047c[4];

    /* renamed from: J0, reason: collision with root package name */
    C7047c[] f55165J0 = new C7047c[4];

    /* renamed from: K0, reason: collision with root package name */
    public boolean f55166K0 = false;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f55167L0 = false;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f55168M0 = false;

    /* renamed from: N0, reason: collision with root package name */
    public int f55169N0 = 0;

    /* renamed from: O0, reason: collision with root package name */
    public int f55170O0 = 0;

    /* renamed from: P0, reason: collision with root package name */
    private int f55171P0 = 263;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f55172Q0 = false;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f55173R0 = false;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f55174S0 = false;

    /* renamed from: T0, reason: collision with root package name */
    int f55175T0 = 0;

    private void P0(C7049e c7049e) {
        int i10 = this.f55162G0 + 1;
        C7047c[] c7047cArr = this.f55165J0;
        if (i10 >= c7047cArr.length) {
            this.f55165J0 = (C7047c[]) Arrays.copyOf(c7047cArr, c7047cArr.length * 2);
        }
        this.f55165J0[this.f55162G0] = new C7047c(c7049e, 0, a1());
        this.f55162G0++;
    }

    private void Q0(C7049e c7049e) {
        int i10 = this.f55163H0 + 1;
        C7047c[] c7047cArr = this.f55164I0;
        if (i10 >= c7047cArr.length) {
            this.f55164I0 = (C7047c[]) Arrays.copyOf(c7047cArr, c7047cArr.length * 2);
        }
        this.f55164I0[this.f55163H0] = new C7047c(c7049e, 1, a1());
        this.f55163H0++;
    }

    private void e1() {
        this.f55162G0 = 0;
        this.f55163H0 = 0;
    }

    @Override // o1.C7049e
    public void I0(boolean z10, boolean z11) {
        super.I0(z10, z11);
        int size = this.f55245w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C7049e) this.f55245w0.get(i10)).I0(z10, z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01c8 A[PHI: r0 r5
  0x01c8: PHI (r0v26 boolean) = (r0v25 boolean), (r0v28 boolean), (r0v28 boolean), (r0v28 boolean) binds: [B:70:0x018d, B:78:0x01b0, B:79:0x01b2, B:81:0x01b8] A[DONT_GENERATE, DONT_INLINE]
  0x01c8: PHI (r5v11 boolean) = (r5v10 boolean), (r5v13 boolean), (r5v13 boolean), (r5v13 boolean) binds: [B:70:0x018d, B:78:0x01b0, B:79:0x01b2, B:81:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    @Override // o1.AbstractC7057m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K0() {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.C7050f.K0():void");
    }

    void N0(C7049e c7049e, int i10) {
        if (i10 == 0) {
            P0(c7049e);
        } else if (i10 == 1) {
            Q0(c7049e);
        }
    }

    public boolean O0(n1.d dVar) {
        f(dVar);
        int size = this.f55245w0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C7049e c7049e = (C7049e) this.f55245w0.get(i10);
            c7049e.o0(0, false);
            c7049e.o0(1, false);
            if (c7049e instanceof C7045a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                C7049e c7049e2 = (C7049e) this.f55245w0.get(i11);
                if (c7049e2 instanceof C7045a) {
                    ((C7045a) c7049e2).N0();
                }
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            C7049e c7049e3 = (C7049e) this.f55245w0.get(i12);
            if (c7049e3.e()) {
                c7049e3.f(dVar);
            }
        }
        for (int i13 = 0; i13 < size; i13++) {
            C7049e c7049e4 = (C7049e) this.f55245w0.get(i13);
            if (c7049e4 instanceof C7050f) {
                C7049e.b[] bVarArr = c7049e4.f55093M;
                C7049e.b bVar = bVarArr[0];
                C7049e.b bVar2 = bVarArr[1];
                C7049e.b bVar3 = C7049e.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    c7049e4.l0(C7049e.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    c7049e4.A0(C7049e.b.FIXED);
                }
                c7049e4.f(dVar);
                if (bVar == bVar3) {
                    c7049e4.l0(bVar);
                }
                if (bVar2 == bVar3) {
                    c7049e4.A0(bVar2);
                }
            } else {
                AbstractC7055k.a(this, dVar, c7049e4);
                if (!c7049e4.e()) {
                    c7049e4.f(dVar);
                }
            }
        }
        if (this.f55162G0 > 0) {
            AbstractC7046b.a(this, dVar, 0);
        }
        if (this.f55163H0 > 0) {
            AbstractC7046b.a(this, dVar, 1);
        }
        return true;
    }

    public boolean R0(boolean z10) {
        return this.f55177y0.f(z10);
    }

    public boolean S0(boolean z10) {
        return this.f55177y0.g(z10);
    }

    public boolean T0(boolean z10, int i10) {
        return this.f55177y0.h(z10, i10);
    }

    public C7206b.InterfaceC2026b U0() {
        return this.f55178z0;
    }

    public int V0() {
        return this.f55171P0;
    }

    public boolean W0() {
        return false;
    }

    public void X0() {
        this.f55177y0.j();
    }

    @Override // o1.AbstractC7057m, o1.C7049e
    public void Y() {
        this.f55157B0.D();
        this.f55158C0 = 0;
        this.f55160E0 = 0;
        this.f55159D0 = 0;
        this.f55161F0 = 0;
        this.f55172Q0 = false;
        super.Y();
    }

    public void Y0() {
        this.f55177y0.k();
    }

    public boolean Z0() {
        return this.f55174S0;
    }

    public boolean a1() {
        return this.f55156A0;
    }

    public boolean b1() {
        return this.f55173R0;
    }

    public long c1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f55158C0 = i17;
        this.f55159D0 = i18;
        return this.f55176x0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean d1(int i10) {
        return (this.f55171P0 & i10) == i10;
    }

    public void f1(C7206b.InterfaceC2026b interfaceC2026b) {
        this.f55178z0 = interfaceC2026b;
        this.f55177y0.n(interfaceC2026b);
    }

    public void g1(int i10) {
        this.f55171P0 = i10;
        n1.d.f54229r = AbstractC7055k.b(i10, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    public void h1(boolean z10) {
        this.f55156A0 = z10;
    }

    public void i1(n1.d dVar, boolean[] zArr) {
        zArr[2] = false;
        J0(dVar);
        int size = this.f55245w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C7049e) this.f55245w0.get(i10)).J0(dVar);
        }
    }

    public void j1() {
        this.f55176x0.e(this);
    }
}
