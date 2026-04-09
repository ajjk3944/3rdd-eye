package io.sentry;

/* loaded from: classes.dex */
public final class v3 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final v3 f12830a = new v3();

    @Override // io.sentry.b1
    public final void a(boolean z10) {
        c4.b();
    }

    @Override // io.sentry.b1
    public final void b(String str, String str2) {
        c4.j(str, str2);
    }

    @Override // io.sentry.b1
    public final void c(long j) {
        c4.c().c(j);
    }

    @Override // io.sentry.b1
    public final io.sentry.transport.p d() {
        return c4.c().d();
    }

    @Override // io.sentry.b1
    public final boolean e() {
        return c4.c().e();
    }

    @Override // io.sentry.b1
    public final void f(Throwable th2, j6 j6Var, String str) {
        c4.c().f(th2, j6Var, str);
    }

    @Override // io.sentry.b1
    public final void g(e eVar, h0 h0Var) {
        c4.c().g(eVar, h0Var);
    }

    @Override // io.sentry.b1
    public final i1 h() {
        return c4.c().h();
    }

    @Override // io.sentry.b1
    public final boolean isEnabled() {
        return c4.h();
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t j(i4.b bVar, h0 h0Var) {
        return c4.c().j(bVar, h0Var);
    }

    @Override // io.sentry.b1
    public final x5 k() {
        return c4.c().k();
    }

    @Override // io.sentry.b1
    public final k1 l() {
        return c4.c().l();
    }

    @Override // io.sentry.b1
    public final void m(e eVar) {
        g(eVar, new h0());
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t n(d3 d3Var) {
        return c4.c().n(d3Var);
    }

    @Override // io.sentry.b1
    public final void o() {
        c4.c().o();
    }

    @Override // io.sentry.b1
    public final void p() {
        c4.c().p();
    }

    @Override // io.sentry.b1
    public final k1 q(s6 s6Var, t6 t6Var) {
        return c4.c().q(s6Var, t6Var);
    }

    @Override // io.sentry.b1
    public final void r(r3 r3Var) {
        c4.c().r(r3Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.logger.a s() {
        return c4.c().s();
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t t(z5 z5Var, h0 h0Var) {
        return c4.c().t(z5Var, h0Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t u(Throwable th2, h0 h0Var) {
        return c4.a(th2, h0Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t v(String str, b5 b5Var) {
        return c4.c().v(str, b5Var);
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t w(io.sentry.protocol.a0 a0Var, q6 q6Var, h0 h0Var, g3 g3Var) {
        return c4.c().w(a0Var, q6Var, h0Var, g3Var);
    }

    @Override // io.sentry.b1
    public final b1 x(String str) {
        return c4.c().x("getCurrentScopes");
    }

    @Override // io.sentry.b1
    public final io.sentry.protocol.t y(t4 t4Var, h0 h0Var) {
        return c4.c().y(t4Var, h0Var);
    }

    @Override // io.sentry.b1
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final t0 m44clone() {
        return c4.c().m43clone();
    }
}
