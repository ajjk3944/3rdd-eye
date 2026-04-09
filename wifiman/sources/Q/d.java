package Q;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.H0;
import T.InterfaceC3540l;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC6494u;
import m0.AbstractC6737x0;
import m0.C6733v0;
import mh.InterfaceC6824a;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f18784a = AbstractC3561w.f(a.f18786a);

    /* renamed from: b, reason: collision with root package name */
    private static final H0 f18785b = AbstractC3561w.f(b.f18787a);

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18786a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return d.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18787a = new b();

        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public static final long a(c cVar, long j10, float f10, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1610977682, i10, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        boolean zBooleanValue = ((Boolean) interfaceC3540l.t(f18785b)).booleanValue();
        if (C6733v0.m(j10, cVar.u()) && zBooleanValue) {
            j10 = g(cVar, f10);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return j10;
    }

    public static final long b(c cVar, long j10) {
        if (C6733v0.m(j10, cVar.q())) {
            return cVar.i();
        }
        if (C6733v0.m(j10, cVar.s())) {
            return cVar.k();
        }
        if (C6733v0.m(j10, cVar.D())) {
            return cVar.o();
        }
        if (C6733v0.m(j10, cVar.a())) {
            return cVar.f();
        }
        if (C6733v0.m(j10, cVar.b())) {
            return cVar.g();
        }
        if (C6733v0.m(j10, cVar.r())) {
            return cVar.j();
        }
        if (C6733v0.m(j10, cVar.t())) {
            return cVar.l();
        }
        if (C6733v0.m(j10, cVar.E())) {
            return cVar.p();
        }
        if (C6733v0.m(j10, cVar.c())) {
            return cVar.h();
        }
        if (C6733v0.m(j10, cVar.e())) {
            return cVar.d();
        }
        if (C6733v0.m(j10, cVar.u())) {
            return cVar.m();
        }
        if (C6733v0.m(j10, cVar.C())) {
            return cVar.n();
        }
        if (!C6733v0.m(j10, cVar.v()) && !C6733v0.m(j10, cVar.w()) && !C6733v0.m(j10, cVar.x()) && !C6733v0.m(j10, cVar.y()) && !C6733v0.m(j10, cVar.z()) && !C6733v0.m(j10, cVar.A())) {
            return C6733v0.f52951b.e();
        }
        return cVar.m();
    }

    public static final long c(long j10, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(509589638, i10, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        interfaceC3540l.U(-1680936624);
        long jB = b(l.f18839a.a(interfaceC3540l, 6), j10);
        if (jB == 16) {
            jB = ((C6733v0) interfaceC3540l.t(f.a())).u();
        }
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return jB;
    }

    public static final H0 d() {
        return f18784a;
    }

    public static final c e(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        return new c(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, null);
    }

    public static /* synthetic */ c f(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i10, int i11, Object obj) {
        long jT = (i10 & 1) != 0 ? S.a.f20024a.t() : j10;
        return e(jT, (i10 & 2) != 0 ? S.a.f20024a.j() : j11, (i10 & 4) != 0 ? S.a.f20024a.u() : j12, (i10 & 8) != 0 ? S.a.f20024a.k() : j13, (i10 & 16) != 0 ? S.a.f20024a.e() : j14, (i10 & 32) != 0 ? S.a.f20024a.w() : j15, (i10 & 64) != 0 ? S.a.f20024a.l() : j16, (i10 & 128) != 0 ? S.a.f20024a.x() : j17, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? S.a.f20024a.m() : j18, (i10 & 512) != 0 ? S.a.f20024a.H() : j19, (i10 & 1024) != 0 ? S.a.f20024a.p() : j20, (i10 & 2048) != 0 ? S.a.f20024a.I() : j21, (i10 & 4096) != 0 ? S.a.f20024a.q() : j22, (i10 & 8192) != 0 ? S.a.f20024a.a() : j23, (i10 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? S.a.f20024a.g() : j24, (i10 & 32768) != 0 ? S.a.f20024a.y() : j25, (i10 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? S.a.f20024a.n() : j26, (i10 & 131072) != 0 ? S.a.f20024a.G() : j27, (i10 & 262144) != 0 ? S.a.f20024a.o() : j28, (i10 & ImageMetadata.LENS_APERTURE) != 0 ? jT : j29, (i10 & ImageMetadata.SHADING_MODE) != 0 ? S.a.f20024a.f() : j30, (i10 & 2097152) != 0 ? S.a.f20024a.d() : j31, (i10 & 4194304) != 0 ? S.a.f20024a.b() : j32, (i10 & 8388608) != 0 ? S.a.f20024a.h() : j33, (i10 & 16777216) != 0 ? S.a.f20024a.c() : j34, (i10 & 33554432) != 0 ? S.a.f20024a.i() : j35, (i10 & 67108864) != 0 ? S.a.f20024a.r() : j36, (i10 & 134217728) != 0 ? S.a.f20024a.s() : j37, (i10 & SQLiteDatabase.CREATE_IF_NECESSARY) != 0 ? S.a.f20024a.v() : j38, (i10 & 536870912) != 0 ? S.a.f20024a.z() : j39, (i10 & 1073741824) != 0 ? S.a.f20024a.A() : j40, (i10 & PduHandle.NONE) != 0 ? S.a.f20024a.B() : j41, (i11 & 1) != 0 ? S.a.f20024a.C() : j42, (i11 & 2) != 0 ? S.a.f20024a.D() : j43, (i11 & 4) != 0 ? S.a.f20024a.E() : j44, (i11 & 8) != 0 ? S.a.f20024a.F() : j45);
    }

    public static final long g(c cVar, float f10) {
        if (Y0.h.n(f10, Y0.h.j(0))) {
            return cVar.u();
        }
        return AbstractC6737x0.g(C6733v0.k(cVar.B(), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), cVar.u());
    }
}
