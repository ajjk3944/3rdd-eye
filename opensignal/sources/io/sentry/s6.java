package io.sentry;

/* loaded from: classes.dex */
public final class s6 extends k6 {
    public static final io.sentry.protocol.c0 N = io.sentry.protocol.c0.CUSTOM;
    public String K;
    public io.sentry.protocol.c0 L;
    public cj.a M;

    public s6(String str, io.sentry.protocol.c0 c0Var, String str2, cj.a aVar) {
        super(new io.sentry.protocol.t(), new n6(), str2, null);
        ir.f0.T(str, "name is required");
        this.K = str;
        this.L = c0Var;
        a(aVar);
        this.I = se.b.v(null, aVar == null ? null : (Boolean) aVar.f3974d, aVar == null ? null : (Double) aVar.f3975g, aVar == null ? null : (Double) aVar.f3976r);
    }

    public static s6 b(k kVar) {
        kVar.getClass();
        c cVar = (c) kVar.f12399r;
        Double d6 = cVar.f12094c;
        s6 s6Var = new s6((io.sentry.protocol.t) kVar.f12397d, (n6) kVar.f12398g, "default", (n6) null);
        s6Var.K = "<unlabeled transaction>";
        s6Var.M = null;
        s6Var.L = N;
        s6Var.I = se.b.v(cVar, null, null, null);
        return s6Var;
    }
}
