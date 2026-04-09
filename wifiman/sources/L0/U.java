package L0;

import Q0.AbstractC3434k;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6713l0;
import m0.C6733v0;
import m0.g1;
import o0.AbstractC7040g;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: d, reason: collision with root package name */
    public static final a f11106d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final U f11107e = new U(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777215, null);

    /* renamed from: a, reason: collision with root package name */
    private final D f11108a;

    /* renamed from: b, reason: collision with root package name */
    private final C3191v f11109b;

    /* renamed from: c, reason: collision with root package name */
    private final B f11110c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final U a() {
            return U.f11107e;
        }

        private a() {
        }
    }

    public /* synthetic */ U(long j10, long j11, Q0.A a10, Q0.v vVar, Q0.w wVar, AbstractC3434k abstractC3434k, String str, long j12, W0.a aVar, W0.o oVar, S0.e eVar, long j13, W0.k kVar, g1 g1Var, AbstractC7040g abstractC7040g, int i10, int i11, long j14, W0.q qVar, B b10, W0.h hVar, int i12, int i13, W0.s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, a10, vVar, wVar, abstractC3434k, str, j12, aVar, oVar, eVar, j13, kVar, g1Var, abstractC7040g, i10, i11, j14, qVar, b10, hVar, i12, i13, sVar);
    }

    public static /* synthetic */ U c(U u10, long j10, long j11, Q0.A a10, Q0.v vVar, Q0.w wVar, AbstractC3434k abstractC3434k, String str, long j12, W0.a aVar, W0.o oVar, S0.e eVar, long j13, W0.k kVar, g1 g1Var, AbstractC7040g abstractC7040g, int i10, int i11, long j14, W0.q qVar, B b10, W0.h hVar, int i12, int i13, W0.s sVar, int i14, Object obj) {
        return u10.b((i14 & 1) != 0 ? u10.f11108a.g() : j10, (i14 & 2) != 0 ? u10.f11108a.k() : j11, (i14 & 4) != 0 ? u10.f11108a.n() : a10, (i14 & 8) != 0 ? u10.f11108a.l() : vVar, (i14 & 16) != 0 ? u10.f11108a.m() : wVar, (i14 & 32) != 0 ? u10.f11108a.i() : abstractC3434k, (i14 & 64) != 0 ? u10.f11108a.j() : str, (i14 & 128) != 0 ? u10.f11108a.o() : j12, (i14 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? u10.f11108a.e() : aVar, (i14 & 512) != 0 ? u10.f11108a.u() : oVar, (i14 & 1024) != 0 ? u10.f11108a.p() : eVar, (i14 & 2048) != 0 ? u10.f11108a.d() : j13, (i14 & 4096) != 0 ? u10.f11108a.s() : kVar, (i14 & 8192) != 0 ? u10.f11108a.r() : g1Var, (i14 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? u10.f11108a.h() : abstractC7040g, (i14 & 32768) != 0 ? u10.f11109b.h() : i10, (i14 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? u10.f11109b.i() : i11, (i14 & 131072) != 0 ? u10.f11109b.e() : j14, (i14 & 262144) != 0 ? u10.f11109b.j() : qVar, (i14 & ImageMetadata.LENS_APERTURE) != 0 ? u10.f11110c : b10, (i14 & ImageMetadata.SHADING_MODE) != 0 ? u10.f11109b.f() : hVar, (i14 & 2097152) != 0 ? u10.f11109b.d() : i12, (i14 & 4194304) != 0 ? u10.f11109b.c() : i13, (i14 & 8388608) != 0 ? u10.f11109b.k() : sVar);
    }

    public final W0.k A() {
        return this.f11108a.s();
    }

    public final int B() {
        return this.f11109b.i();
    }

    public final W0.o C() {
        return this.f11108a.u();
    }

    public final W0.q D() {
        return this.f11109b.j();
    }

    public final W0.s E() {
        return this.f11109b.k();
    }

    public final boolean F(U u10) {
        return this == u10 || this.f11108a.w(u10.f11108a);
    }

    public final boolean G(U u10) {
        return this == u10 || (AbstractC6492s.d(this.f11109b, u10.f11109b) && this.f11108a.v(u10.f11108a));
    }

    public final int H() {
        int iX = ((this.f11108a.x() * 31) + this.f11109b.hashCode()) * 31;
        B b10 = this.f11110c;
        return iX + (b10 != null ? b10.hashCode() : 0);
    }

    public final U I(C3191v c3191v) {
        return new U(N(), M().l(c3191v));
    }

    public final U J(U u10) {
        return (u10 == null || AbstractC6492s.d(u10, f11107e)) ? this : new U(N().y(u10.N()), M().l(u10.M()));
    }

    public final U K(long j10, long j11, Q0.A a10, Q0.v vVar, Q0.w wVar, AbstractC3434k abstractC3434k, String str, long j12, W0.a aVar, W0.o oVar, S0.e eVar, long j13, W0.k kVar, g1 g1Var, AbstractC7040g abstractC7040g, int i10, int i11, long j14, W0.q qVar, W0.h hVar, int i12, int i13, B b10, W0.s sVar) {
        D dB = E.b(this.f11108a, j10, null, Float.NaN, j11, a10, vVar, wVar, abstractC3434k, str, j12, aVar, oVar, eVar, j13, kVar, g1Var, b10 != null ? b10.b() : null, abstractC7040g);
        C3191v c3191vA = AbstractC3192w.a(this.f11109b, i10, i11, j14, qVar, b10 != null ? b10.a() : null, hVar, i12, i13, sVar);
        return (this.f11108a == dB && this.f11109b == c3191vA) ? this : new U(dB, c3191vA);
    }

    public final C3191v M() {
        return this.f11109b;
    }

    public final D N() {
        return this.f11108a;
    }

    public final U b(long j10, long j11, Q0.A a10, Q0.v vVar, Q0.w wVar, AbstractC3434k abstractC3434k, String str, long j12, W0.a aVar, W0.o oVar, S0.e eVar, long j13, W0.k kVar, g1 g1Var, AbstractC7040g abstractC7040g, int i10, int i11, long j14, W0.q qVar, B b10, W0.h hVar, int i12, int i13, W0.s sVar) {
        return new U(new D(C6733v0.m(j10, this.f11108a.g()) ? this.f11108a.t() : W0.n.f23545a.b(j10), j11, a10, vVar, wVar, abstractC3434k, str, j12, aVar, oVar, eVar, j13, kVar, g1Var, b10 != null ? b10.b() : null, abstractC7040g, (DefaultConstructorMarker) null), new C3191v(i10, i11, j14, qVar, b10 != null ? b10.a() : null, hVar, i12, i13, sVar, null), b10);
    }

    public final float d() {
        return this.f11108a.c();
    }

    public final long e() {
        return this.f11108a.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        return AbstractC6492s.d(this.f11108a, u10.f11108a) && AbstractC6492s.d(this.f11109b, u10.f11109b) && AbstractC6492s.d(this.f11110c, u10.f11110c);
    }

    public final W0.a f() {
        return this.f11108a.e();
    }

    public final AbstractC6713l0 g() {
        return this.f11108a.f();
    }

    public final long h() {
        return this.f11108a.g();
    }

    public int hashCode() {
        int iHashCode = ((this.f11108a.hashCode() * 31) + this.f11109b.hashCode()) * 31;
        B b10 = this.f11110c;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public final AbstractC7040g i() {
        return this.f11108a.h();
    }

    public final AbstractC3434k j() {
        return this.f11108a.i();
    }

    public final String k() {
        return this.f11108a.j();
    }

    public final long l() {
        return this.f11108a.k();
    }

    public final Q0.v m() {
        return this.f11108a.l();
    }

    public final Q0.w n() {
        return this.f11108a.m();
    }

    public final Q0.A o() {
        return this.f11108a.n();
    }

    public final int p() {
        return this.f11109b.c();
    }

    public final long q() {
        return this.f11108a.o();
    }

    public final int r() {
        return this.f11109b.d();
    }

    public final long s() {
        return this.f11109b.e();
    }

    public final W0.h t() {
        return this.f11109b.f();
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) C6733v0.t(h())) + ", brush=" + g() + ", alpha=" + d() + ", fontSize=" + ((Object) Y0.v.j(l())) + ", fontWeight=" + o() + ", fontStyle=" + m() + ", fontSynthesis=" + n() + ", fontFamily=" + j() + ", fontFeatureSettings=" + k() + ", letterSpacing=" + ((Object) Y0.v.j(q())) + ", baselineShift=" + f() + ", textGeometricTransform=" + C() + ", localeList=" + u() + ", background=" + ((Object) C6733v0.t(e())) + ", textDecoration=" + A() + ", shadow=" + x() + ", drawStyle=" + i() + ", textAlign=" + ((Object) W0.j.m(z())) + ", textDirection=" + ((Object) W0.l.l(B())) + ", lineHeight=" + ((Object) Y0.v.j(s())) + ", textIndent=" + D() + ", platformStyle=" + this.f11110c + ", lineHeightStyle=" + t() + ", lineBreak=" + ((Object) W0.f.k(r())) + ", hyphens=" + ((Object) W0.e.i(p())) + ", textMotion=" + E() + ')';
    }

    public final S0.e u() {
        return this.f11108a.p();
    }

    public final C3191v v() {
        return this.f11109b;
    }

    public final B w() {
        return this.f11110c;
    }

    public final g1 x() {
        return this.f11108a.r();
    }

    public final D y() {
        return this.f11108a;
    }

    public final int z() {
        return this.f11109b.h();
    }

    public U(D d10, C3191v c3191v, B b10) {
        this.f11108a = d10;
        this.f11109b = c3191v;
        this.f11110c = b10;
    }

    public U(D d10, C3191v c3191v) {
        this(d10, c3191v, V.b(d10.q(), c3191v.g()));
    }

    public /* synthetic */ U(long j10, long j11, Q0.A a10, Q0.v vVar, Q0.w wVar, AbstractC3434k abstractC3434k, String str, long j12, W0.a aVar, W0.o oVar, S0.e eVar, long j13, W0.k kVar, g1 g1Var, AbstractC7040g abstractC7040g, int i10, int i11, long j14, W0.q qVar, B b10, W0.h hVar, int i12, int i13, W0.s sVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? C6733v0.f52951b.e() : j10, (i14 & 2) != 0 ? Y0.v.f24549b.a() : j11, (i14 & 4) != 0 ? null : a10, (i14 & 8) != 0 ? null : vVar, (i14 & 16) != 0 ? null : wVar, (i14 & 32) != 0 ? null : abstractC3434k, (i14 & 64) != 0 ? null : str, (i14 & 128) != 0 ? Y0.v.f24549b.a() : j12, (i14 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : aVar, (i14 & 512) != 0 ? null : oVar, (i14 & 1024) != 0 ? null : eVar, (i14 & 2048) != 0 ? C6733v0.f52951b.e() : j13, (i14 & 4096) != 0 ? null : kVar, (i14 & 8192) != 0 ? null : g1Var, (i14 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? null : abstractC7040g, (i14 & 32768) != 0 ? W0.j.f23523b.g() : i10, (i14 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? W0.l.f23537b.f() : i11, (i14 & 131072) != 0 ? Y0.v.f24549b.a() : j14, (i14 & 262144) != 0 ? null : qVar, (i14 & ImageMetadata.LENS_APERTURE) != 0 ? null : b10, (i14 & ImageMetadata.SHADING_MODE) != 0 ? null : hVar, (i14 & 2097152) != 0 ? W0.f.f23488b.b() : i12, (i14 & 4194304) != 0 ? W0.e.f23483b.c() : i13, (i14 & 8388608) != 0 ? null : sVar, null);
    }

    private U(long j10, long j11, Q0.A a10, Q0.v vVar, Q0.w wVar, AbstractC3434k abstractC3434k, String str, long j12, W0.a aVar, W0.o oVar, S0.e eVar, long j13, W0.k kVar, g1 g1Var, AbstractC7040g abstractC7040g, int i10, int i11, long j14, W0.q qVar, B b10, W0.h hVar, int i12, int i13, W0.s sVar) {
        this(new D(j10, j11, a10, vVar, wVar, abstractC3434k, str, j12, aVar, oVar, eVar, j13, kVar, g1Var, b10 != null ? b10.b() : null, abstractC7040g, (DefaultConstructorMarker) null), new C3191v(i10, i11, j14, qVar, b10 != null ? b10.a() : null, hVar, i12, i13, sVar, null), b10);
    }
}
