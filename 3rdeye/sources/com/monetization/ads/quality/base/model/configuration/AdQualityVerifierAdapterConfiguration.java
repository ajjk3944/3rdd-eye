package com.monetization.ads.quality.base.model.configuration;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class AdQualityVerifierAdapterConfiguration {
    private final String apiKey;
    private final boolean debug;
    private final long verificationTimeoutInSec;

    public AdQualityVerifierAdapterConfiguration(String apiKey, long j4, boolean z10) {
        l.f(apiKey, "apiKey");
        this.apiKey = apiKey;
        this.verificationTimeoutInSec = j4;
        this.debug = z10;
    }

    public static /* synthetic */ AdQualityVerifierAdapterConfiguration copy$default(AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, String str, long j4, boolean z10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adQualityVerifierAdapterConfiguration.apiKey;
        }
        if ((i & 2) != 0) {
            j4 = adQualityVerifierAdapterConfiguration.verificationTimeoutInSec;
        }
        if ((i & 4) != 0) {
            z10 = adQualityVerifierAdapterConfiguration.debug;
        }
        return adQualityVerifierAdapterConfiguration.copy(str, j4, z10);
    }

    public final String component1() {
        return this.apiKey;
    }

    public final long component2() {
        return this.verificationTimeoutInSec;
    }

    public final boolean component3() {
        return this.debug;
    }

    public final AdQualityVerifierAdapterConfiguration copy(String apiKey, long j4, boolean z10) {
        l.f(apiKey, "apiKey");
        return new AdQualityVerifierAdapterConfiguration(apiKey, j4, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityVerifierAdapterConfiguration)) {
            return false;
        }
        AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration = (AdQualityVerifierAdapterConfiguration) obj;
        return l.b(this.apiKey, adQualityVerifierAdapterConfiguration.apiKey) && this.verificationTimeoutInSec == adQualityVerifierAdapterConfiguration.verificationTimeoutInSec && this.debug == adQualityVerifierAdapterConfiguration.debug;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final long getVerificationTimeoutInSec() {
        return this.verificationTimeoutInSec;
    }

    public int hashCode() {
        int iHashCode = this.apiKey.hashCode() * 31;
        long j4 = this.verificationTimeoutInSec;
        return (this.debug ? 1231 : 1237) + ((((int) (j4 ^ (j4 >>> 32))) + iHashCode) * 31);
    }

    public String toString() {
        return "AdQualityVerifierAdapterConfiguration(apiKey=" + this.apiKey + ", verificationTimeoutInSec=" + this.verificationTimeoutInSec + ", debug=" + this.debug + ")";
    }

    public /* synthetic */ AdQualityVerifierAdapterConfiguration(String str, long j4, boolean z10, int i, g gVar) {
        this(str, j4, (i & 4) != 0 ? false : z10);
    }
}
