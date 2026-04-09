package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;

/* loaded from: classes3.dex */
public final class ik0 {

    /* renamed from: a, reason: collision with root package name */
    private final ip1.b f28721a;

    /* renamed from: b, reason: collision with root package name */
    private final ip1.b f28722b;

    /* renamed from: c, reason: collision with root package name */
    private final ip1.b f28723c;

    /* renamed from: d, reason: collision with root package name */
    private final ip1.b f28724d;

    public ik0(ip1.b impressionTrackingSuccessReportType, ip1.b impressionTrackingStartReportType, ip1.b impressionTrackingFailureReportType, ip1.b forcedImpressionTrackingFailureReportType) {
        kotlin.jvm.internal.l.f(impressionTrackingSuccessReportType, "impressionTrackingSuccessReportType");
        kotlin.jvm.internal.l.f(impressionTrackingStartReportType, "impressionTrackingStartReportType");
        kotlin.jvm.internal.l.f(impressionTrackingFailureReportType, "impressionTrackingFailureReportType");
        kotlin.jvm.internal.l.f(forcedImpressionTrackingFailureReportType, "forcedImpressionTrackingFailureReportType");
        this.f28721a = impressionTrackingSuccessReportType;
        this.f28722b = impressionTrackingStartReportType;
        this.f28723c = impressionTrackingFailureReportType;
        this.f28724d = forcedImpressionTrackingFailureReportType;
    }

    public final ip1.b a() {
        return this.f28724d;
    }

    public final ip1.b b() {
        return this.f28723c;
    }

    public final ip1.b c() {
        return this.f28722b;
    }

    public final ip1.b d() {
        return this.f28721a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik0)) {
            return false;
        }
        ik0 ik0Var = (ik0) obj;
        return this.f28721a == ik0Var.f28721a && this.f28722b == ik0Var.f28722b && this.f28723c == ik0Var.f28723c && this.f28724d == ik0Var.f28724d;
    }

    public final int hashCode() {
        return this.f28724d.hashCode() + ((this.f28723c.hashCode() + ((this.f28722b.hashCode() + (this.f28721a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImpressionTrackingReportTypes(impressionTrackingSuccessReportType=" + this.f28721a + ", impressionTrackingStartReportType=" + this.f28722b + ", impressionTrackingFailureReportType=" + this.f28723c + ", forcedImpressionTrackingFailureReportType=" + this.f28724d + ")";
    }
}
