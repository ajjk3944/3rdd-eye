package E0;

import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6713l0;
import m0.AbstractC6735w0;
import m0.InterfaceC6717n0;
import m0.J0;
import m0.U0;
import m0.V0;
import o0.AbstractC7040g;
import o0.C7034a;
import o0.InterfaceC7036c;
import o0.InterfaceC7037d;
import o0.InterfaceC7039f;
import p0.C7182c;

/* loaded from: classes.dex */
public final class I implements InterfaceC7039f, InterfaceC7036c {

    /* renamed from: a, reason: collision with root package name */
    private final C7034a f3666a;

    /* renamed from: b, reason: collision with root package name */
    private r f3667b;

    public I(C7034a c7034a) {
        this.f3666a = c7034a;
    }

    @Override // o0.InterfaceC7039f
    public long D1() {
        return this.f3666a.D1();
    }

    @Override // Y0.d
    public long F0(float f10) {
        return this.f3666a.F0(f10);
    }

    @Override // o0.InterfaceC7039f
    public void H1(J0 j02, long j10, long j11, long j12, long j13, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10, int i11) {
        this.f3666a.H1(j02, j10, j11, j12, j13, f10, abstractC7040g, abstractC6735w0, i10, i11);
    }

    @Override // Y0.d
    public long K1(long j10) {
        return this.f3666a.K1(j10);
    }

    @Override // Y0.d
    public float N0(float f10) {
        return this.f3666a.N0(f10);
    }

    @Override // Y0.d
    public float N1(long j10) {
        return this.f3666a.N1(j10);
    }

    @Override // o0.InterfaceC7039f
    public void U(AbstractC6713l0 abstractC6713l0, float f10, float f11, boolean z10, long j10, long j11, float f12, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f3666a.U(abstractC6713l0, f10, f11, z10, j10, j11, f12, abstractC7040g, abstractC6735w0, i10);
    }

    @Override // o0.InterfaceC7039f
    public void X0(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f3666a.X0(j10, f10, f11, z10, j11, j12, f12, abstractC7040g, abstractC6735w0, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // o0.InterfaceC7036c
    public void X1() {
        InterfaceC6717n0 interfaceC6717n0D = k1().d();
        r rVar = this.f3667b;
        AbstractC6492s.f(rVar);
        AbstractC2635m abstractC2635mB = J.b(rVar);
        if (abstractC2635mB == 0) {
            AbstractC2624c0 abstractC2624c0H = AbstractC2633k.h(rVar, e0.a(4));
            if (abstractC2624c0H.G2() == rVar.h1()) {
                abstractC2624c0H = abstractC2624c0H.H2();
                AbstractC6492s.f(abstractC2624c0H);
            }
            abstractC2624c0H.c3(interfaceC6717n0D, k1().g());
            return;
        }
        int iA = e0.a(4);
        ?? bVar = 0;
        while (abstractC2635mB != 0) {
            if (abstractC2635mB instanceof r) {
                q((r) abstractC2635mB, interfaceC6717n0D, k1().g());
            } else if ((abstractC2635mB.f2() & iA) != 0 && (abstractC2635mB instanceof AbstractC2635m)) {
                e.c cVarE2 = abstractC2635mB.E2();
                int i10 = 0;
                abstractC2635mB = abstractC2635mB;
                bVar = bVar;
                while (cVarE2 != null) {
                    if ((cVarE2.f2() & iA) != 0) {
                        i10++;
                        bVar = bVar;
                        if (i10 == 1) {
                            abstractC2635mB = cVarE2;
                        } else {
                            if (bVar == 0) {
                                bVar = new V.b(new e.c[16], 0);
                            }
                            if (abstractC2635mB != 0) {
                                bVar.b(abstractC2635mB);
                                abstractC2635mB = 0;
                            }
                            bVar.b(cVarE2);
                        }
                    }
                    cVarE2 = cVarE2.b2();
                    abstractC2635mB = abstractC2635mB;
                    bVar = bVar;
                }
                if (i10 == 1) {
                }
            }
            abstractC2635mB = AbstractC2633k.g(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void b(InterfaceC6717n0 interfaceC6717n0, long j10, AbstractC2624c0 abstractC2624c0, e.c cVar, C7182c c7182c) {
        int iA = e0.a(4);
        AbstractC2635m abstractC2635mG = cVar;
        ?? bVar = 0;
        while (abstractC2635mG != 0) {
            if (abstractC2635mG instanceof r) {
                p(interfaceC6717n0, j10, abstractC2624c0, abstractC2635mG, c7182c);
            } else if ((abstractC2635mG.f2() & iA) != 0 && (abstractC2635mG instanceof AbstractC2635m)) {
                e.c cVarE2 = abstractC2635mG.E2();
                int i10 = 0;
                abstractC2635mG = abstractC2635mG;
                bVar = bVar;
                while (cVarE2 != null) {
                    if ((cVarE2.f2() & iA) != 0) {
                        i10++;
                        bVar = bVar;
                        if (i10 == 1) {
                            abstractC2635mG = cVarE2;
                        } else {
                            if (bVar == 0) {
                                bVar = new V.b(new e.c[16], 0);
                            }
                            if (abstractC2635mG != 0) {
                                bVar.b(abstractC2635mG);
                                abstractC2635mG = 0;
                            }
                            bVar.b(cVarE2);
                        }
                    }
                    cVarE2 = cVarE2.b2();
                    abstractC2635mG = abstractC2635mG;
                    bVar = bVar;
                }
                if (i10 == 1) {
                }
            }
            abstractC2635mG = AbstractC2633k.g(bVar);
        }
    }

    @Override // o0.InterfaceC7039f
    public long c() {
        return this.f3666a.c();
    }

    @Override // Y0.d
    public float d1(float f10) {
        return this.f3666a.d1(f10);
    }

    @Override // Y0.l
    public long e0(float f10) {
        return this.f3666a.e0(f10);
    }

    @Override // o0.InterfaceC7039f
    public void e1(J0 j02, long j10, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f3666a.e1(j02, j10, f10, abstractC7040g, abstractC6735w0, i10);
    }

    @Override // Y0.d
    public long f0(long j10) {
        return this.f3666a.f0(j10);
    }

    @Override // o0.InterfaceC7039f
    public void f1(AbstractC6713l0 abstractC6713l0, long j10, long j11, float f10, int i10, V0 v02, float f11, AbstractC6735w0 abstractC6735w0, int i11) {
        this.f3666a.f1(abstractC6713l0, j10, j11, f10, i10, v02, f11, abstractC6735w0, i11);
    }

    @Override // Y0.d
    public float getDensity() {
        return this.f3666a.getDensity();
    }

    @Override // o0.InterfaceC7039f
    public Y0.t getLayoutDirection() {
        return this.f3666a.getLayoutDirection();
    }

    @Override // o0.InterfaceC7039f
    public void j0(long j10, long j11, long j12, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f3666a.j0(j10, j11, j12, f10, abstractC7040g, abstractC6735w0, i10);
    }

    @Override // o0.InterfaceC7039f
    public void j1(long j10, long j11, long j12, long j13, AbstractC7040g abstractC7040g, float f10, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f3666a.j1(j10, j11, j12, j13, abstractC7040g, f10, abstractC6735w0, i10);
    }

    @Override // o0.InterfaceC7039f
    public InterfaceC7037d k1() {
        return this.f3666a.k1();
    }

    @Override // o0.InterfaceC7039f
    public void l1(U0 u02, AbstractC6713l0 abstractC6713l0, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f3666a.l1(u02, abstractC6713l0, f10, abstractC7040g, abstractC6735w0, i10);
    }

    @Override // o0.InterfaceC7039f
    public void m0(long j10, float f10, long j11, float f11, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f3666a.m0(j10, f10, j11, f11, abstractC7040g, abstractC6735w0, i10);
    }

    @Override // o0.InterfaceC7039f
    public void m1(AbstractC6713l0 abstractC6713l0, long j10, long j11, long j12, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f3666a.m1(abstractC6713l0, j10, j11, j12, f10, abstractC7040g, abstractC6735w0, i10);
    }

    @Override // Y0.l
    public float n0(long j10) {
        return this.f3666a.n0(j10);
    }

    public final void p(InterfaceC6717n0 interfaceC6717n0, long j10, AbstractC2624c0 abstractC2624c0, r rVar, C7182c c7182c) {
        r rVar2 = this.f3667b;
        this.f3667b = rVar;
        C7034a c7034a = this.f3666a;
        Y0.t layoutDirection = abstractC2624c0.getLayoutDirection();
        Y0.d density = c7034a.k1().getDensity();
        Y0.t layoutDirection2 = c7034a.k1().getLayoutDirection();
        InterfaceC6717n0 interfaceC6717n0D = c7034a.k1().d();
        long jC = c7034a.k1().c();
        C7182c c7182cG = c7034a.k1().g();
        InterfaceC7037d interfaceC7037dK1 = c7034a.k1();
        interfaceC7037dK1.a(abstractC2624c0);
        interfaceC7037dK1.b(layoutDirection);
        interfaceC7037dK1.i(interfaceC6717n0);
        interfaceC7037dK1.f(j10);
        interfaceC7037dK1.h(c7182c);
        interfaceC6717n0.j();
        try {
            rVar.J(this);
            interfaceC6717n0.r();
            InterfaceC7037d interfaceC7037dK12 = c7034a.k1();
            interfaceC7037dK12.a(density);
            interfaceC7037dK12.b(layoutDirection2);
            interfaceC7037dK12.i(interfaceC6717n0D);
            interfaceC7037dK12.f(jC);
            interfaceC7037dK12.h(c7182cG);
            this.f3667b = rVar2;
        } catch (Throwable th2) {
            interfaceC6717n0.r();
            InterfaceC7037d interfaceC7037dK13 = c7034a.k1();
            interfaceC7037dK13.a(density);
            interfaceC7037dK13.b(layoutDirection2);
            interfaceC7037dK13.i(interfaceC6717n0D);
            interfaceC7037dK13.f(jC);
            interfaceC7037dK13.h(c7182cG);
            throw th2;
        }
    }

    @Override // o0.InterfaceC7039f
    public void p0(AbstractC6713l0 abstractC6713l0, long j10, long j11, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f3666a.p0(abstractC6713l0, j10, j11, f10, abstractC7040g, abstractC6735w0, i10);
    }

    public final void q(r rVar, InterfaceC6717n0 interfaceC6717n0, C7182c c7182c) {
        AbstractC2624c0 abstractC2624c0H = AbstractC2633k.h(rVar, e0.a(4));
        abstractC2624c0H.G1().b0().p(interfaceC6717n0, Y0.s.d(abstractC2624c0H.h()), abstractC2624c0H, rVar, c7182c);
    }

    @Override // o0.InterfaceC7039f
    public void t0(U0 u02, long j10, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        this.f3666a.t0(u02, j10, f10, abstractC7040g, abstractC6735w0, i10);
    }

    @Override // Y0.d
    public float x(int i10) {
        return this.f3666a.x(i10);
    }

    @Override // Y0.d
    public int x1(float f10) {
        return this.f3666a.x1(f10);
    }

    @Override // Y0.l
    public float y() {
        return this.f3666a.y();
    }

    @Override // o0.InterfaceC7039f
    public void z0(long j10, long j11, long j12, float f10, int i10, V0 v02, float f11, AbstractC6735w0 abstractC6735w0, int i11) {
        this.f3666a.z0(j10, j11, j12, f10, i10, v02, f11, abstractC6735w0, i11);
    }

    public /* synthetic */ I(C7034a c7034a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C7034a() : c7034a);
    }
}
