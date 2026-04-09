package io.sentry;

/* loaded from: classes.dex */
public final class r6 {

    /* renamed from: a, reason: collision with root package name */
    public final x5 f12694a;

    public r6(x5 x5Var) {
        this.f12694a = x5Var;
    }

    public final cj.a a(i4.b bVar) {
        Double d6 = (Double) bVar.f11197d;
        s6 s6Var = (s6) bVar.f11196a;
        cj.a aVar = s6Var.f12415r;
        if (aVar != null) {
            return lf.t1.b(aVar);
        }
        x5 x5Var = this.f12694a;
        x5Var.getProfilesSampler();
        Double profilesSampleRate = x5Var.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= d6.doubleValue());
        x5Var.getTracesSampler();
        cj.a aVar2 = s6Var.M;
        if (aVar2 != null) {
            return lf.t1.b(aVar2);
        }
        Double tracesSampleRate = x5Var.getTracesSampleRate();
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, x5Var.getBackpressureMonitor().a()));
        if (dValueOf == null) {
            Boolean bool = Boolean.FALSE;
            return new cj.a(bool, (Double) null, d6, bool, (Double) null);
        }
        boolean z10 = false;
        if (dValueOf.doubleValue() >= d6.doubleValue()) {
            z10 = true;
        }
        return new cj.a(Boolean.valueOf(z10), dValueOf, d6, boolValueOf, profilesSampleRate);
    }
}
