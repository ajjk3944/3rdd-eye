package dt;

import java.util.ArrayList;
import ls.q0;

/* loaded from: classes.dex */
public final class l implements n, m {

    /* renamed from: b, reason: collision with root package name */
    public static final l f7511b = new l();

    /* renamed from: c, reason: collision with root package name */
    public static final l f7512c = new l();

    /* renamed from: d, reason: collision with root package name */
    public static final l f7513d = new l();

    public static rr.z d(ls.a0 a0Var) {
        int i10 = a0Var == null ? -1 : x.f7550a[a0Var.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? rr.z.FINAL : rr.z.SEALED : rr.z.ABSTRACT : rr.z.OPEN : rr.z.FINAL;
    }

    @Override // dt.n
    public ht.x a(q0 q0Var, String str, ht.b0 b0Var, ht.b0 b0Var2) {
        br.l.e(q0Var, "proto");
        br.l.e(str, "flexibleId");
        br.l.e(b0Var, "lowerBound");
        br.l.e(b0Var2, "upperBound");
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // dt.m
    public void c(rr.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"));
        }
    }

    @Override // dt.m
    public void b(rr.f fVar, ArrayList arrayList) {
    }
}
