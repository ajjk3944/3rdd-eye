package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class fd1 {

    /* renamed from: a, reason: collision with root package name */
    private final jk0 f27286a;

    public /* synthetic */ fd1() {
        this(new jk0());
    }

    public final ed1 a(gk0 impressionReporter, e9 adStructureType) {
        kotlin.jvm.internal.l.f(impressionReporter, "impressionReporter");
        kotlin.jvm.internal.l.f(adStructureType, "adStructureType");
        int iOrdinal = adStructureType.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new b9.j();
            }
            this.f27286a.getClass();
            return new f62(impressionReporter, jk0.a(adStructureType));
        }
        jk0 jk0Var = this.f27286a;
        e9 e9Var = e9.f26737d;
        jk0Var.getClass();
        ik0 ik0VarA = jk0.a(e9Var);
        jk0 jk0Var2 = this.f27286a;
        e9 e9Var2 = e9.f26736c;
        jk0Var2.getClass();
        return new my1(new f62(impressionReporter, ik0VarA), new f62(impressionReporter, jk0.a(e9Var2)));
    }

    public fd1(jk0 impressionTrackingReportTypesProvider) {
        kotlin.jvm.internal.l.f(impressionTrackingReportTypesProvider, "impressionTrackingReportTypesProvider");
        this.f27286a = impressionTrackingReportTypesProvider;
    }
}
