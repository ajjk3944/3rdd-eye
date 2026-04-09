package com.monetization.ads.quality.base;

import android.content.Context;
import com.monetization.ads.quality.base.model.AdQualityVerifierAdapterInfo;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import f9.InterfaceC4347e;

/* loaded from: classes2.dex */
public abstract class AdQualityVerifierAdapter implements AdQualityVerifierAdEventListener {
    public AdQualityVerifierAdapterInfo getAdapterInfo() {
        return new AdQualityVerifierAdapterInfo.Builder().build();
    }

    public abstract Object verifyAd(Context context, AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, InterfaceC4347e<? super AdQualityVerificationResult> interfaceC4347e);
}
