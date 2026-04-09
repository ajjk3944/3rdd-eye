package io.sentry;

/* loaded from: classes.dex */
public interface d1 {
    void a(boolean z10);

    void b(i6 i6Var, h0 h0Var);

    void c(long j);

    io.sentry.transport.p d();

    default boolean e() {
        return true;
    }

    io.sentry.protocol.t f(z5 z5Var, z0 z0Var, h0 h0Var);

    void h(d5 d5Var, z0 z0Var);

    boolean isEnabled();

    io.sentry.protocol.t j(i4.b bVar, h0 h0Var);

    io.sentry.protocol.t l(io.sentry.protocol.a0 a0Var, q6 q6Var, z0 z0Var, h0 h0Var, g3 g3Var);

    io.sentry.protocol.t n(d3 d3Var);

    io.sentry.protocol.t o(t4 t4Var, z0 z0Var, h0 h0Var);
}
