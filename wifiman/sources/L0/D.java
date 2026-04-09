package L0;

import Q0.AbstractC3434k;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6713l0;
import m0.C6733v0;
import m0.g1;
import o0.AbstractC7040g;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private final W0.n f11042a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11043b;

    /* renamed from: c, reason: collision with root package name */
    private final Q0.A f11044c;

    /* renamed from: d, reason: collision with root package name */
    private final Q0.v f11045d;

    /* renamed from: e, reason: collision with root package name */
    private final Q0.w f11046e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC3434k f11047f;

    /* renamed from: g, reason: collision with root package name */
    private final String f11048g;

    /* renamed from: h, reason: collision with root package name */
    private final long f11049h;

    /* renamed from: i, reason: collision with root package name */
    private final W0.a f11050i;

    /* renamed from: j, reason: collision with root package name */
    private final W0.o f11051j;

    /* renamed from: k, reason: collision with root package name */
    private final S0.e f11052k;

    /* renamed from: l, reason: collision with root package name */
    private final long f11053l;

    /* renamed from: m, reason: collision with root package name */
    private final W0.k f11054m;

    /* renamed from: n, reason: collision with root package name */
    private final g1 f11055n;

    /* renamed from: o, reason: collision with root package name */
    private final A f11056o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC7040g f11057p;

    public /* synthetic */ D(long j10, long j11, Q0.A a10, Q0.v vVar, Q0.w wVar, AbstractC3434k abstractC3434k, String str, long j12, W0.a aVar, W0.o oVar, S0.e eVar, long j13, W0.k kVar, g1 g1Var, A a11, AbstractC7040g abstractC7040g, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, a10, vVar, wVar, abstractC3434k, str, j12, aVar, oVar, eVar, j13, kVar, g1Var, a11, abstractC7040g);
    }

    public final D a(long j10, long j11, Q0.A a10, Q0.v vVar, Q0.w wVar, AbstractC3434k abstractC3434k, String str, long j12, W0.a aVar, W0.o oVar, S0.e eVar, long j13, W0.k kVar, g1 g1Var, A a11, AbstractC7040g abstractC7040g) {
        return new D(C6733v0.m(j10, g()) ? this.f11042a : W0.n.f23545a.b(j10), j11, a10, vVar, wVar, abstractC3434k, str, j12, aVar, oVar, eVar, j13, kVar, g1Var, a11, abstractC7040g, (DefaultConstructorMarker) null);
    }

    public final float c() {
        return this.f11042a.b();
    }

    public final long d() {
        return this.f11053l;
    }

    public final W0.a e() {
        return this.f11050i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return v(d10) && w(d10);
    }

    public final AbstractC6713l0 f() {
        return this.f11042a.e();
    }

    public final long g() {
        return this.f11042a.c();
    }

    public final AbstractC7040g h() {
        return this.f11057p;
    }

    public int hashCode() {
        int iS = C6733v0.s(g()) * 31;
        AbstractC6713l0 abstractC6713l0F = f();
        int iHashCode = (((((iS + (abstractC6713l0F != null ? abstractC6713l0F.hashCode() : 0)) * 31) + Float.hashCode(c())) * 31) + Y0.v.i(this.f11043b)) * 31;
        Q0.A a10 = this.f11044c;
        int iHashCode2 = (iHashCode + (a10 != null ? a10.hashCode() : 0)) * 31;
        Q0.v vVar = this.f11045d;
        int iG = (iHashCode2 + (vVar != null ? Q0.v.g(vVar.i()) : 0)) * 31;
        Q0.w wVar = this.f11046e;
        int i10 = (iG + (wVar != null ? Q0.w.i(wVar.m()) : 0)) * 31;
        AbstractC3434k abstractC3434k = this.f11047f;
        int iHashCode3 = (i10 + (abstractC3434k != null ? abstractC3434k.hashCode() : 0)) * 31;
        String str = this.f11048g;
        int iHashCode4 = (((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Y0.v.i(this.f11049h)) * 31;
        W0.a aVar = this.f11050i;
        int iF = (iHashCode4 + (aVar != null ? W0.a.f(aVar.h()) : 0)) * 31;
        W0.o oVar = this.f11051j;
        int iHashCode5 = (iF + (oVar != null ? oVar.hashCode() : 0)) * 31;
        S0.e eVar = this.f11052k;
        int iHashCode6 = (((iHashCode5 + (eVar != null ? eVar.hashCode() : 0)) * 31) + C6733v0.s(this.f11053l)) * 31;
        W0.k kVar = this.f11054m;
        int iHashCode7 = (iHashCode6 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        g1 g1Var = this.f11055n;
        int iHashCode8 = (iHashCode7 + (g1Var != null ? g1Var.hashCode() : 0)) * 31;
        A a11 = this.f11056o;
        int iHashCode9 = (iHashCode8 + (a11 != null ? a11.hashCode() : 0)) * 31;
        AbstractC7040g abstractC7040g = this.f11057p;
        return iHashCode9 + (abstractC7040g != null ? abstractC7040g.hashCode() : 0);
    }

    public final AbstractC3434k i() {
        return this.f11047f;
    }

    public final String j() {
        return this.f11048g;
    }

    public final long k() {
        return this.f11043b;
    }

    public final Q0.v l() {
        return this.f11045d;
    }

    public final Q0.w m() {
        return this.f11046e;
    }

    public final Q0.A n() {
        return this.f11044c;
    }

    public final long o() {
        return this.f11049h;
    }

    public final S0.e p() {
        return this.f11052k;
    }

    public final A q() {
        return this.f11056o;
    }

    public final g1 r() {
        return this.f11055n;
    }

    public final W0.k s() {
        return this.f11054m;
    }

    public final W0.n t() {
        return this.f11042a;
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) C6733v0.t(g())) + ", brush=" + f() + ", alpha=" + c() + ", fontSize=" + ((Object) Y0.v.j(this.f11043b)) + ", fontWeight=" + this.f11044c + ", fontStyle=" + this.f11045d + ", fontSynthesis=" + this.f11046e + ", fontFamily=" + this.f11047f + ", fontFeatureSettings=" + this.f11048g + ", letterSpacing=" + ((Object) Y0.v.j(this.f11049h)) + ", baselineShift=" + this.f11050i + ", textGeometricTransform=" + this.f11051j + ", localeList=" + this.f11052k + ", background=" + ((Object) C6733v0.t(this.f11053l)) + ", textDecoration=" + this.f11054m + ", shadow=" + this.f11055n + ", platformStyle=" + this.f11056o + ", drawStyle=" + this.f11057p + ')';
    }

    public final W0.o u() {
        return this.f11051j;
    }

    public final boolean v(D d10) {
        if (this == d10) {
            return true;
        }
        return Y0.v.e(this.f11043b, d10.f11043b) && AbstractC6492s.d(this.f11044c, d10.f11044c) && AbstractC6492s.d(this.f11045d, d10.f11045d) && AbstractC6492s.d(this.f11046e, d10.f11046e) && AbstractC6492s.d(this.f11047f, d10.f11047f) && AbstractC6492s.d(this.f11048g, d10.f11048g) && Y0.v.e(this.f11049h, d10.f11049h) && AbstractC6492s.d(this.f11050i, d10.f11050i) && AbstractC6492s.d(this.f11051j, d10.f11051j) && AbstractC6492s.d(this.f11052k, d10.f11052k) && C6733v0.m(this.f11053l, d10.f11053l) && AbstractC6492s.d(this.f11056o, d10.f11056o);
    }

    public final boolean w(D d10) {
        return AbstractC6492s.d(this.f11042a, d10.f11042a) && AbstractC6492s.d(this.f11054m, d10.f11054m) && AbstractC6492s.d(this.f11055n, d10.f11055n) && AbstractC6492s.d(this.f11057p, d10.f11057p);
    }

    public final int x() {
        int i10 = Y0.v.i(this.f11043b) * 31;
        Q0.A a10 = this.f11044c;
        int iHashCode = (i10 + (a10 != null ? a10.hashCode() : 0)) * 31;
        Q0.v vVar = this.f11045d;
        int iG = (iHashCode + (vVar != null ? Q0.v.g(vVar.i()) : 0)) * 31;
        Q0.w wVar = this.f11046e;
        int i11 = (iG + (wVar != null ? Q0.w.i(wVar.m()) : 0)) * 31;
        AbstractC3434k abstractC3434k = this.f11047f;
        int iHashCode2 = (i11 + (abstractC3434k != null ? abstractC3434k.hashCode() : 0)) * 31;
        String str = this.f11048g;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Y0.v.i(this.f11049h)) * 31;
        W0.a aVar = this.f11050i;
        int iF = (iHashCode3 + (aVar != null ? W0.a.f(aVar.h()) : 0)) * 31;
        W0.o oVar = this.f11051j;
        int iHashCode4 = (iF + (oVar != null ? oVar.hashCode() : 0)) * 31;
        S0.e eVar = this.f11052k;
        int iHashCode5 = (((iHashCode4 + (eVar != null ? eVar.hashCode() : 0)) * 31) + C6733v0.s(this.f11053l)) * 31;
        A a11 = this.f11056o;
        return iHashCode5 + (a11 != null ? a11.hashCode() : 0);
    }

    public final D y(D d10) {
        return d10 == null ? this : E.b(this, d10.f11042a.c(), d10.f11042a.e(), d10.f11042a.b(), d10.f11043b, d10.f11044c, d10.f11045d, d10.f11046e, d10.f11047f, d10.f11048g, d10.f11049h, d10.f11050i, d10.f11051j, d10.f11052k, d10.f11053l, d10.f11054m, d10.f11055n, d10.f11056o, d10.f11057p);
    }

    public /* synthetic */ D(W0.n nVar, long j10, Q0.A a10, Q0.v vVar, Q0.w wVar, AbstractC3434k abstractC3434k, String str, long j11, W0.a aVar, W0.o oVar, S0.e eVar, long j12, W0.k kVar, g1 g1Var, A a11, AbstractC7040g abstractC7040g, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, j10, a10, vVar, wVar, abstractC3434k, str, j11, aVar, oVar, eVar, j12, kVar, g1Var, a11, abstractC7040g);
    }

    private D(W0.n nVar, long j10, Q0.A a10, Q0.v vVar, Q0.w wVar, AbstractC3434k abstractC3434k, String str, long j11, W0.a aVar, W0.o oVar, S0.e eVar, long j12, W0.k kVar, g1 g1Var, A a11, AbstractC7040g abstractC7040g) {
        this.f11042a = nVar;
        this.f11043b = j10;
        this.f11044c = a10;
        this.f11045d = vVar;
        this.f11046e = wVar;
        this.f11047f = abstractC3434k;
        this.f11048g = str;
        this.f11049h = j11;
        this.f11050i = aVar;
        this.f11051j = oVar;
        this.f11052k = eVar;
        this.f11053l = j12;
        this.f11054m = kVar;
        this.f11055n = g1Var;
        this.f11056o = a11;
        this.f11057p = abstractC7040g;
    }

    public /* synthetic */ D(long j10, long j11, Q0.A a10, Q0.v vVar, Q0.w wVar, AbstractC3434k abstractC3434k, String str, long j12, W0.a aVar, W0.o oVar, S0.e eVar, long j13, W0.k kVar, g1 g1Var, A a11, AbstractC7040g abstractC7040g, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C6733v0.f52951b.e() : j10, (i10 & 2) != 0 ? Y0.v.f24549b.a() : j11, (i10 & 4) != 0 ? null : a10, (i10 & 8) != 0 ? null : vVar, (i10 & 16) != 0 ? null : wVar, (i10 & 32) != 0 ? null : abstractC3434k, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? Y0.v.f24549b.a() : j12, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : aVar, (i10 & 512) != 0 ? null : oVar, (i10 & 1024) != 0 ? null : eVar, (i10 & 2048) != 0 ? C6733v0.f52951b.e() : j13, (i10 & 4096) != 0 ? null : kVar, (i10 & 8192) != 0 ? null : g1Var, (i10 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? null : a11, (i10 & 32768) != 0 ? null : abstractC7040g, (DefaultConstructorMarker) null);
    }

    private D(long j10, long j11, Q0.A a10, Q0.v vVar, Q0.w wVar, AbstractC3434k abstractC3434k, String str, long j12, W0.a aVar, W0.o oVar, S0.e eVar, long j13, W0.k kVar, g1 g1Var, A a11, AbstractC7040g abstractC7040g) {
        this(W0.n.f23545a.b(j10), j11, a10, vVar, wVar, abstractC3434k, str, j12, aVar, oVar, eVar, j13, kVar, g1Var, a11, abstractC7040g, (DefaultConstructorMarker) null);
    }
}
