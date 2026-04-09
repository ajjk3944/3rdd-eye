package io.sentry;

/* loaded from: classes.dex */
public interface b1 {
    void a(boolean z10);

    void b(String str, String str2);

    void c(long j);

    /* renamed from: clone */
    t0 m44clone();

    io.sentry.transport.p d();

    boolean e();

    void f(Throwable th2, j6 j6Var, String str);

    void g(e eVar, h0 h0Var);

    i1 h();

    default boolean i() {
        return false;
    }

    boolean isEnabled();

    io.sentry.protocol.t j(i4.b bVar, h0 h0Var);

    x5 k();

    k1 l();

    void m(e eVar);

    io.sentry.protocol.t n(d3 d3Var);

    void o();

    void p();

    k1 q(s6 s6Var, t6 t6Var);

    void r(r3 r3Var);

    io.sentry.logger.a s();

    io.sentry.protocol.t t(z5 z5Var, h0 h0Var);

    io.sentry.protocol.t u(Throwable th2, h0 h0Var);

    io.sentry.protocol.t v(String str, b5 b5Var);

    io.sentry.protocol.t w(io.sentry.protocol.a0 a0Var, q6 q6Var, h0 h0Var, g3 g3Var);

    b1 x(String str);

    io.sentry.protocol.t y(t4 t4Var, h0 h0Var);
}
