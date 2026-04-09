package io.sentry;

/* loaded from: classes.dex */
public final class c6 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12119a;

    /* renamed from: d, reason: collision with root package name */
    public final String f12120d;

    public c6() {
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.f12119a = property;
        this.f12120d = property2;
    }

    public final void a(g4 g4Var) {
        io.sentry.protocol.c cVar = g4Var.f12269d;
        if (cVar.g() == null) {
            cVar.r(new io.sentry.protocol.v());
        }
        io.sentry.protocol.v vVarG = cVar.g();
        if (vVarG != null && vVarG.f12641a == null && vVarG.f12642d == null) {
            vVarG.f12641a = this.f12120d;
            vVarG.f12642d = this.f12119a;
        }
    }

    @Override // io.sentry.c0
    public final t4 f(t4 t4Var, h0 h0Var) {
        a(t4Var);
        return t4Var;
    }

    @Override // io.sentry.c0
    public final io.sentry.protocol.a0 h(io.sentry.protocol.a0 a0Var, h0 h0Var) {
        a(a0Var);
        return a0Var;
    }
}
