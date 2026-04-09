package androidx.compose.ui.platform;

import Q0.AbstractC3434k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
final class I0 {

    /* renamed from: a, reason: collision with root package name */
    private long f29163a;

    /* renamed from: b, reason: collision with root package name */
    private long f29164b;

    /* renamed from: c, reason: collision with root package name */
    private Q0.A f29165c;

    /* renamed from: d, reason: collision with root package name */
    private Q0.v f29166d;

    /* renamed from: e, reason: collision with root package name */
    private Q0.w f29167e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC3434k f29168f;

    /* renamed from: g, reason: collision with root package name */
    private String f29169g;

    /* renamed from: h, reason: collision with root package name */
    private long f29170h;

    /* renamed from: i, reason: collision with root package name */
    private W0.a f29171i;

    /* renamed from: j, reason: collision with root package name */
    private W0.o f29172j;

    /* renamed from: k, reason: collision with root package name */
    private S0.e f29173k;

    /* renamed from: l, reason: collision with root package name */
    private long f29174l;

    /* renamed from: m, reason: collision with root package name */
    private W0.k f29175m;

    /* renamed from: n, reason: collision with root package name */
    private m0.g1 f29176n;

    public /* synthetic */ I0(long j10, long j11, Q0.A a10, Q0.v vVar, Q0.w wVar, AbstractC3434k abstractC3434k, String str, long j12, W0.a aVar, W0.o oVar, S0.e eVar, long j13, W0.k kVar, m0.g1 g1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, a10, vVar, wVar, abstractC3434k, str, j12, aVar, oVar, eVar, j13, kVar, g1Var);
    }

    public final void a(long j10) {
        this.f29174l = j10;
    }

    public final void b(W0.a aVar) {
        this.f29171i = aVar;
    }

    public final void c(long j10) {
        this.f29163a = j10;
    }

    public final void d(String str) {
        this.f29169g = str;
    }

    public final void e(long j10) {
        this.f29164b = j10;
    }

    public final void f(Q0.v vVar) {
        this.f29166d = vVar;
    }

    public final void g(Q0.w wVar) {
        this.f29167e = wVar;
    }

    public final void h(Q0.A a10) {
        this.f29165c = a10;
    }

    public final void i(long j10) {
        this.f29170h = j10;
    }

    public final void j(m0.g1 g1Var) {
        this.f29176n = g1Var;
    }

    public final void k(W0.k kVar) {
        this.f29175m = kVar;
    }

    public final void l(W0.o oVar) {
        this.f29172j = oVar;
    }

    public final L0.D m() {
        return new L0.D(this.f29163a, this.f29164b, this.f29165c, this.f29166d, this.f29167e, this.f29168f, this.f29169g, this.f29170h, this.f29171i, this.f29172j, this.f29173k, this.f29174l, this.f29175m, this.f29176n, null, null, 49152, null);
    }

    private I0(long j10, long j11, Q0.A a10, Q0.v vVar, Q0.w wVar, AbstractC3434k abstractC3434k, String str, long j12, W0.a aVar, W0.o oVar, S0.e eVar, long j13, W0.k kVar, m0.g1 g1Var) {
        this.f29163a = j10;
        this.f29164b = j11;
        this.f29165c = a10;
        this.f29166d = vVar;
        this.f29167e = wVar;
        this.f29168f = abstractC3434k;
        this.f29169g = str;
        this.f29170h = j12;
        this.f29171i = aVar;
        this.f29172j = oVar;
        this.f29173k = eVar;
        this.f29174l = j13;
        this.f29175m = kVar;
        this.f29176n = g1Var;
    }

    public /* synthetic */ I0(long j10, long j11, Q0.A a10, Q0.v vVar, Q0.w wVar, AbstractC3434k abstractC3434k, String str, long j12, W0.a aVar, W0.o oVar, S0.e eVar, long j13, W0.k kVar, m0.g1 g1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C6733v0.f52951b.e() : j10, (i10 & 2) != 0 ? Y0.v.f24549b.a() : j11, (i10 & 4) != 0 ? null : a10, (i10 & 8) != 0 ? null : vVar, (i10 & 16) != 0 ? null : wVar, (i10 & 32) != 0 ? null : abstractC3434k, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? Y0.v.f24549b.a() : j12, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : aVar, (i10 & 512) != 0 ? null : oVar, (i10 & 1024) != 0 ? null : eVar, (i10 & 2048) != 0 ? C6733v0.f52951b.e() : j13, (i10 & 4096) != 0 ? null : kVar, (i10 & 8192) != 0 ? null : g1Var, null);
    }
}
