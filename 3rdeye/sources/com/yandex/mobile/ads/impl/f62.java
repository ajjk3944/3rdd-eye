package com.yandex.mobile.ads.impl;

import c9.C2077A;
import c9.C2097r;
import java.util.List;

/* loaded from: classes3.dex */
public final class f62 implements ed1 {

    /* renamed from: a, reason: collision with root package name */
    private final gk0 f27212a;

    /* renamed from: b, reason: collision with root package name */
    private final ik0 f27213b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27214c;

    /* renamed from: d, reason: collision with root package name */
    private int f27215d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27216e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27217f;

    public f62(gk0 impressionReporter, ik0 impressionTrackingReportTypes) {
        kotlin.jvm.internal.l.f(impressionReporter, "impressionReporter");
        kotlin.jvm.internal.l.f(impressionTrackingReportTypes, "impressionTrackingReportTypes");
        this.f27212a = impressionReporter;
        this.f27213b = impressionTrackingReportTypes;
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    public final void a(ux1 showNoticeType, a92 validationResult) {
        kotlin.jvm.internal.l.f(showNoticeType, "showNoticeType");
        kotlin.jvm.internal.l.f(validationResult, "validationResult");
        int i = this.f27215d + 1;
        this.f27215d = i;
        if (i == 20) {
            this.f27216e = true;
            this.f27212a.b(this.f27213b.b(), validationResult);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    public final void invalidate() {
        this.f27214c = false;
        this.f27215d = 0;
        this.f27216e = false;
        this.f27217f = false;
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    public final void a(List<kd1> forcedFailures) {
        kotlin.jvm.internal.l.f(forcedFailures, "forcedFailures");
        kd1 kd1Var = (kd1) C2097r.q0(forcedFailures);
        if (kd1Var == null) {
            return;
        }
        this.f27212a.a(this.f27213b.a(), kd1Var.b());
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    public final void a(ux1 showNoticeType, List<? extends ux1> notTrackedShowNoticeTypes) {
        kotlin.jvm.internal.l.f(showNoticeType, "showNoticeType");
        kotlin.jvm.internal.l.f(notTrackedShowNoticeTypes, "notTrackedShowNoticeTypes");
        if (this.f27217f) {
            return;
        }
        this.f27217f = true;
        this.f27212a.a(this.f27213b.d(), C2077A.m(new b9.l("failure_tracked", Boolean.valueOf(this.f27216e))));
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    public final void a(ux1 showNoticeType) {
        kotlin.jvm.internal.l.f(showNoticeType, "showNoticeType");
        if (this.f27214c) {
            return;
        }
        this.f27214c = true;
        this.f27212a.a(this.f27213b.c());
    }

    @Override // com.yandex.mobile.ads.impl.ed1
    public final void a(a8<?> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f27212a.a(adResponse);
    }
}
