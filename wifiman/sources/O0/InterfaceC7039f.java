package o0;

import Y0.n;
import Y0.s;
import Y0.t;
import l0.AbstractC6525a;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6537m;
import m0.AbstractC6665E0;
import m0.AbstractC6697d0;
import m0.AbstractC6713l0;
import m0.AbstractC6735w0;
import m0.J0;
import m0.U0;
import m0.V0;
import org.conscrypt.PSKKeyManager;

/* renamed from: o0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7039f extends Y0.d {

    /* renamed from: d1, reason: collision with root package name */
    public static final a f55034d1 = a.f55035a;

    /* renamed from: o0.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f55035a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final int f55036b = AbstractC6697d0.f52884a.B();

        /* renamed from: c, reason: collision with root package name */
        private static final int f55037c = AbstractC6665E0.f52788a.a();

        private a() {
        }

        public final int a() {
            return f55036b;
        }

        public final int b() {
            return f55037c;
        }
    }

    static /* synthetic */ void B0(InterfaceC7039f interfaceC7039f, AbstractC6713l0 abstractC6713l0, float f10, float f11, boolean z10, long j10, long j11, float f12, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        long jC = (i11 & 16) != 0 ? C6531g.f52335b.c() : j10;
        interfaceC7039f.U(abstractC6713l0, f10, f11, z10, jC, (i11 & 32) != 0 ? interfaceC7039f.P0(interfaceC7039f.c(), jC) : j11, (i11 & 64) != 0 ? 1.0f : f12, (i11 & 128) != 0 ? C7043j.f55038a : abstractC7040g, (i11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : abstractC6735w0, (i11 & 512) != 0 ? f55034d1.a() : i10);
    }

    static /* synthetic */ void C1(InterfaceC7039f interfaceC7039f, U0 u02, long j10, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        interfaceC7039f.t0(u02, j10, (i11 & 4) != 0 ? 1.0f : f10, (i11 & 8) != 0 ? C7043j.f55038a : abstractC7040g, (i11 & 16) != 0 ? null : abstractC6735w0, (i11 & 32) != 0 ? f55034d1.a() : i10);
    }

    private default long P0(long j10, long j11) {
        return AbstractC6538n.a(C6537m.i(j10) - C6531g.m(j11), C6537m.g(j10) - C6531g.n(j11));
    }

    static /* synthetic */ void P1(InterfaceC7039f interfaceC7039f, long j10, float f10, long j11, float f11, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        interfaceC7039f.m0(j10, (i11 & 2) != 0 ? C6537m.h(interfaceC7039f.c()) / 2.0f : f10, (i11 & 4) != 0 ? interfaceC7039f.D1() : j11, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? C7043j.f55038a : abstractC7040g, (i11 & 32) != 0 ? null : abstractC6735w0, (i11 & 64) != 0 ? f55034d1.a() : i10);
    }

    static /* synthetic */ void R0(InterfaceC7039f interfaceC7039f, U0 u02, AbstractC6713l0 abstractC6713l0, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            abstractC7040g = C7043j.f55038a;
        }
        AbstractC7040g abstractC7040g2 = abstractC7040g;
        if ((i11 & 16) != 0) {
            abstractC6735w0 = null;
        }
        AbstractC6735w0 abstractC6735w02 = abstractC6735w0;
        if ((i11 & 32) != 0) {
            i10 = f55034d1.a();
        }
        interfaceC7039f.l1(u02, abstractC6713l0, f11, abstractC7040g2, abstractC6735w02, i10);
    }

    static /* synthetic */ void Y(InterfaceC7039f interfaceC7039f, J0 j02, long j10, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        interfaceC7039f.e1(j02, (i11 & 2) != 0 ? C6531g.f52335b.c() : j10, (i11 & 4) != 0 ? 1.0f : f10, (i11 & 8) != 0 ? C7043j.f55038a : abstractC7040g, (i11 & 16) != 0 ? null : abstractC6735w0, (i11 & 32) != 0 ? f55034d1.a() : i10);
    }

    static /* synthetic */ void b1(InterfaceC7039f interfaceC7039f, long j10, long j11, long j12, long j13, AbstractC7040g abstractC7040g, float f10, AbstractC6735w0 abstractC6735w0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jC = (i11 & 2) != 0 ? C6531g.f52335b.c() : j11;
        interfaceC7039f.j1(j10, jC, (i11 & 4) != 0 ? interfaceC7039f.P0(interfaceC7039f.c(), jC) : j12, (i11 & 8) != 0 ? AbstractC6525a.f52329a.a() : j13, (i11 & 16) != 0 ? C7043j.f55038a : abstractC7040g, (i11 & 32) != 0 ? 1.0f : f10, (i11 & 64) != 0 ? null : abstractC6735w0, (i11 & 128) != 0 ? f55034d1.a() : i10);
    }

    static /* synthetic */ void d0(InterfaceC7039f interfaceC7039f, AbstractC6713l0 abstractC6713l0, long j10, long j11, long j12, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jC = (i11 & 2) != 0 ? C6531g.f52335b.c() : j10;
        interfaceC7039f.m1(abstractC6713l0, jC, (i11 & 4) != 0 ? interfaceC7039f.P0(interfaceC7039f.c(), jC) : j11, (i11 & 8) != 0 ? AbstractC6525a.f52329a.a() : j12, (i11 & 16) != 0 ? 1.0f : f10, (i11 & 32) != 0 ? C7043j.f55038a : abstractC7040g, (i11 & 64) != 0 ? null : abstractC6735w0, (i11 & 128) != 0 ? f55034d1.a() : i10);
    }

    static /* synthetic */ void i0(InterfaceC7039f interfaceC7039f, AbstractC6713l0 abstractC6713l0, long j10, long j11, float f10, int i10, V0 v02, float f11, AbstractC6735w0 abstractC6735w0, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        interfaceC7039f.f1(abstractC6713l0, j10, j11, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? C7044k.f55039f.a() : i10, (i12 & 32) != 0 ? null : v02, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : abstractC6735w0, (i12 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? f55034d1.a() : i11);
    }

    static /* synthetic */ void l0(InterfaceC7039f interfaceC7039f, AbstractC6713l0 abstractC6713l0, long j10, long j11, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jC = (i11 & 2) != 0 ? C6531g.f52335b.c() : j10;
        interfaceC7039f.p0(abstractC6713l0, jC, (i11 & 4) != 0 ? interfaceC7039f.P0(interfaceC7039f.c(), jC) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? C7043j.f55038a : abstractC7040g, (i11 & 32) != 0 ? null : abstractC6735w0, (i11 & 64) != 0 ? f55034d1.a() : i10);
    }

    static /* synthetic */ void p1(InterfaceC7039f interfaceC7039f, long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jC = (i11 & 16) != 0 ? C6531g.f52335b.c() : j11;
        interfaceC7039f.X0(j10, f10, f11, z10, jC, (i11 & 32) != 0 ? interfaceC7039f.P0(interfaceC7039f.c(), jC) : j12, (i11 & 64) != 0 ? 1.0f : f12, (i11 & 128) != 0 ? C7043j.f55038a : abstractC7040g, (i11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : abstractC6735w0, (i11 & 512) != 0 ? f55034d1.a() : i10);
    }

    static /* synthetic */ void u0(InterfaceC7039f interfaceC7039f, long j10, long j11, long j12, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jC = (i11 & 2) != 0 ? C6531g.f52335b.c() : j11;
        interfaceC7039f.j0(j10, jC, (i11 & 4) != 0 ? interfaceC7039f.P0(interfaceC7039f.c(), jC) : j12, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? C7043j.f55038a : abstractC7040g, (i11 & 32) != 0 ? null : abstractC6735w0, (i11 & 64) != 0 ? f55034d1.a() : i10);
    }

    static /* synthetic */ void u1(InterfaceC7039f interfaceC7039f, J0 j02, long j10, long j11, long j12, long j13, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jA = (i12 & 2) != 0 ? n.f24536b.a() : j10;
        long jA2 = (i12 & 4) != 0 ? s.a(j02.getWidth(), j02.getHeight()) : j11;
        interfaceC7039f.H1(j02, jA, jA2, (i12 & 8) != 0 ? n.f24536b.a() : j12, (i12 & 16) != 0 ? jA2 : j13, (i12 & 32) != 0 ? 1.0f : f10, (i12 & 64) != 0 ? C7043j.f55038a : abstractC7040g, (i12 & 128) != 0 ? null : abstractC6735w0, (i12 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? f55034d1.a() : i10, (i12 & 512) != 0 ? f55034d1.b() : i11);
    }

    static /* synthetic */ void w1(InterfaceC7039f interfaceC7039f, long j10, long j11, long j12, float f10, int i10, V0 v02, float f11, AbstractC6735w0 abstractC6735w0, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        interfaceC7039f.z0(j10, j11, j12, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? C7044k.f55039f.a() : i10, (i12 & 32) != 0 ? null : v02, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : abstractC6735w0, (i12 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? f55034d1.a() : i11);
    }

    default long D1() {
        return AbstractC6538n.b(k1().c());
    }

    void H1(J0 j02, long j10, long j11, long j12, long j13, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10, int i11);

    void U(AbstractC6713l0 abstractC6713l0, float f10, float f11, boolean z10, long j10, long j11, float f12, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10);

    void X0(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10);

    default long c() {
        return k1().c();
    }

    void e1(J0 j02, long j10, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10);

    void f1(AbstractC6713l0 abstractC6713l0, long j10, long j11, float f10, int i10, V0 v02, float f11, AbstractC6735w0 abstractC6735w0, int i11);

    t getLayoutDirection();

    void j0(long j10, long j11, long j12, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10);

    void j1(long j10, long j11, long j12, long j13, AbstractC7040g abstractC7040g, float f10, AbstractC6735w0 abstractC6735w0, int i10);

    InterfaceC7037d k1();

    void l1(U0 u02, AbstractC6713l0 abstractC6713l0, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10);

    void m0(long j10, float f10, long j11, float f11, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10);

    void m1(AbstractC6713l0 abstractC6713l0, long j10, long j11, long j12, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10);

    void p0(AbstractC6713l0 abstractC6713l0, long j10, long j11, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10);

    void t0(U0 u02, long j10, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10);

    void z0(long j10, long j11, long j12, float f10, int i10, V0 v02, float f11, AbstractC6735w0 abstractC6735w0, int i11);
}
