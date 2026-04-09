package com.monetization.ads.quality.base;

import D9.I;
import com.monetization.ads.quality.base.model.AdQualityVerificationMode;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;

/* loaded from: classes2.dex */
public interface AdQualityVerificationStateFlow {
    AdQualityVerificationMode getVerificationMode();

    I<AdQualityVerificationState> getVerificationResultStateFlow();
}
