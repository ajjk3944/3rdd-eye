package N;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.InterfaceC3540l;
import kotlin.jvm.internal.AbstractC6494u;
import m0.AbstractC6737x0;
import m0.C6733v0;
import mh.InterfaceC6824a;
import org.conscrypt.PSKKeyManager;

/* renamed from: N.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3334n {

    /* renamed from: a, reason: collision with root package name */
    private static final T.H0 f14619a = AbstractC3561w.f(a.f14620a);

    /* renamed from: N.n$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14620a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3332m invoke() {
            return AbstractC3334n.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        }
    }

    public static final long a(C3332m c3332m, long j10) {
        if (!C6733v0.m(j10, c3332m.j()) && !C6733v0.m(j10, c3332m.k())) {
            if (!C6733v0.m(j10, c3332m.l()) && !C6733v0.m(j10, c3332m.m())) {
                return C6733v0.m(j10, c3332m.c()) ? c3332m.e() : C6733v0.m(j10, c3332m.n()) ? c3332m.i() : C6733v0.m(j10, c3332m.d()) ? c3332m.f() : C6733v0.f52951b.e();
            }
            return c3332m.h();
        }
        return c3332m.g();
    }

    public static final long b(long j10, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(441849991, i10, -1, "androidx.compose.material.contentColorFor (Colors.kt:296)");
        }
        interfaceC3540l.U(-702395103);
        long jA = a(C3319f0.f14419a.a(interfaceC3540l, 6), j10);
        if (jA == 16) {
            jA = ((C6733v0) interfaceC3540l.t(AbstractC3345t.a())).u();
        }
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return jA;
    }

    public static final C3332m c(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new C3332m(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, false, null);
    }

    public static final T.H0 d() {
        return f14619a;
    }

    public static final C3332m e(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new C3332m(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, true, null);
    }

    public static /* synthetic */ C3332m f(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        return e((i10 & 1) != 0 ? AbstractC6737x0.d(4284612846L) : j10, (i10 & 2) != 0 ? AbstractC6737x0.d(4281794739L) : j11, (i10 & 4) != 0 ? AbstractC6737x0.d(4278442694L) : j12, (i10 & 8) != 0 ? AbstractC6737x0.d(4278290310L) : j13, (i10 & 16) != 0 ? C6733v0.f52951b.f() : j14, (i10 & 32) != 0 ? C6733v0.f52951b.f() : j15, (i10 & 64) != 0 ? AbstractC6737x0.d(4289724448L) : j16, (i10 & 128) != 0 ? C6733v0.f52951b.f() : j17, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? C6733v0.f52951b.a() : j18, (i10 & 512) != 0 ? C6733v0.f52951b.a() : j19, (i10 & 1024) != 0 ? C6733v0.f52951b.a() : j20, (i10 & 2048) != 0 ? C6733v0.f52951b.f() : j21);
    }

    public static final void g(C3332m c3332m, C3332m c3332m2) {
        c3332m.x(c3332m2.j());
        c3332m.y(c3332m2.k());
        c3332m.z(c3332m2.l());
        c3332m.A(c3332m2.m());
        c3332m.p(c3332m2.c());
        c3332m.B(c3332m2.n());
        c3332m.q(c3332m2.d());
        c3332m.u(c3332m2.g());
        c3332m.v(c3332m2.h());
        c3332m.s(c3332m2.e());
        c3332m.w(c3332m2.i());
        c3332m.t(c3332m2.f());
        c3332m.r(c3332m2.o());
    }
}
