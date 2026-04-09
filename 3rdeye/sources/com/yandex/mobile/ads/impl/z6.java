package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;

/* loaded from: classes3.dex */
public final class z6 {

    /* renamed from: a, reason: collision with root package name */
    private final p6 f36217a;

    public z6(p6 verificationPolicy) {
        kotlin.jvm.internal.l.f(verificationPolicy, "verificationPolicy");
        this.f36217a = verificationPolicy;
    }

    public final AdQualityVerificationResult.NotVerified a(AdQualityVerificationAdConfiguration adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        y6 y6Var = this.f36217a.a().get(adConfiguration.getVerifiableAdNetwork());
        int iB = y6Var != null ? y6Var.b() : this.f36217a.e();
        boolean z10 = true;
        boolean zC = y6Var != null ? !y6Var.a() : this.f36217a.c();
        if (!this.f36217a.d().contains(adConfiguration.getAdUnitId()) && !this.f36217a.d().isEmpty()) {
            z10 = false;
        }
        if (!zC || !z10) {
            return new AdQualityVerificationResult.NotVerified(new AdQualityVerificationError.DisabledError());
        }
        t9.c.f46467b.getClass();
        if (t9.c.f46468c.c(100) < iB) {
            return null;
        }
        return new AdQualityVerificationResult.NotVerified(new AdQualityVerificationError.LowUsagePercent());
    }
}
