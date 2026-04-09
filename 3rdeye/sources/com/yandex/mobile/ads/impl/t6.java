package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;

/* loaded from: classes3.dex */
public final class t6 {

    /* renamed from: a, reason: collision with root package name */
    private final p6 f33455a;

    public t6(p6 verificationPolicy) {
        kotlin.jvm.internal.l.f(verificationPolicy, "verificationPolicy");
        this.f33455a = verificationPolicy;
    }

    public final AdQualityVerificationResult a(AdQualityVerificationResult status) {
        kotlin.jvm.internal.l.f(status, "status");
        if (!(status instanceof AdQualityVerificationResult.Verified)) {
            return status;
        }
        AdQualityVerificationResult.Verified verified = (AdQualityVerificationResult.Verified) status;
        if (!(verified.getVerifiedAd().getVerificationResultStateFlow().getValue() instanceof AdQualityVerificationState.Error) || !this.f33455a.b()) {
            return status;
        }
        AdQualityVerificationStateFlow verifiedAd = verified.getVerifiedAd();
        AdQualityVerificationState value = verified.getVerifiedAd().getVerificationResultStateFlow().getValue();
        kotlin.jvm.internal.l.d(value, "null cannot be cast to non-null type com.monetization.ads.quality.base.state.AdQualityVerificationState.Error");
        return new AdQualityVerificationResult.Verified(new s6(verifiedAd, ((AdQualityVerificationState.Error) value).getError().getDescription()));
    }
}
