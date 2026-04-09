package io.sentry;

/* loaded from: classes.dex */
public final class m0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final u3 f12433a;

    public m0(u3 u3Var) {
        this.f12433a = u3Var;
    }

    @Override // io.sentry.b1
    public final void a(boolean z10) {
        this.f12433a.a(z10);
    }

    @Override // io.sentry.b1
    public final void b(String str, String str2) {
        this.f12433a.b(str, str2);
    }

    @Override // io.sentry.b1
    public final void c(long j) {
        this.f12433a.c(j);
    }

    @Override // io.sentry.b1
    /* renamed from: clone */
    public final t0 m44clone() {
        return this.f12433a.m44clone();
    }

    @Override // io.sentry.b1
    public final io.sentry.transport.p d() {
        return this.f12433a.d();
    }

    @Override // io.sentry.b1
    public final boolean e() {
        return this.f12433a.e();
    }

    @Override // io.sentry.b1
    public final void f(Throwable th2, j6 j6Var, String str) {
        this.f12433a.f(th2, j6Var, str);
    }

    @Override // io.sentry.b1
    public final void g(e eVar, h0 h0Var) {
        this.f12433a.g(eVar, h0Var);
    }

    @Override // io.sentry.b1
    public final i1 h() {
        return this.f12433a.h();
    }

    @Override // io.sentry.b1
    public final boolean isEnabled() {
        return this.f12433a.isEnabled();
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t j(i4.b bVar, h0 h0Var) {
        return this.f12433a.j(bVar, h0Var);
    }

    @Override // io.sentry.b1
    public final x5 k() {
        return this.f12433a.k();
    }

    @Override // io.sentry.b1
    public final k1 l() {
        return this.f12433a.l();
    }

    @Override // io.sentry.b1
    public final void m(e eVar) {
        this.f12433a.m(eVar);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t n(d3 d3Var) {
        return this.f12433a.n(d3Var);
    }

    @Override // io.sentry.b1
    public final void o() {
        this.f12433a.o();
    }

    @Override // io.sentry.b1
    public final void p() {
        this.f12433a.p();
    }

    @Override // io.sentry.b1
    public final k1 q(s6 s6Var, t6 t6Var) {
        return this.f12433a.q(s6Var, t6Var);
    }

    @Override // io.sentry.b1
    public final void r(r3 r3Var) {
        this.f12433a.r(r3Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.logger.a s() {
        return this.f12433a.f12794f;
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t t(z5 z5Var, h0 h0Var) {
        return this.f12433a.t(z5Var, h0Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t u(Throwable th2, h0 h0Var) {
        return this.f12433a.u(th2, h0Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t v(String str, b5 b5Var) {
        return this.f12433a.v(str, b5Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t w(io.sentry.protocol.a0 a0Var, q6 q6Var, h0 h0Var, g3 g3Var) {
        return this.f12433a.w(a0Var, q6Var, h0Var, g3Var);
    }

    @Override // io.sentry.b1
    public final b1 x(String str) {
        return this.f12433a.x("getCurrentScopes");
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t y(t4 t4Var, h0 h0Var) {
        return this.f12433a.y(t4Var, h0Var);
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final Object m40clone() {
        return this.f12433a.m44clone();
    }
}
