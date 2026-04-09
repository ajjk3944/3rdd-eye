package com.android.billingclient.api;

import io.appmetrica.analytics.impl.Oo;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class BillingResult {
    private int zza;
    private String zzb;

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    public static class Builder {
        private int zza;
        private String zzb = "";

        private Builder() {
        }

        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            return billingResult;
        }

        public Builder setDebugMessage(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setResponseCode(int i) {
            this.zza = i;
            return this;
        }

        public /* synthetic */ Builder(zzcd zzcdVar) {
        }
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public String getDebugMessage() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }

    public String toString() {
        return Oo.f("Response Code: ", com.google.android.gms.internal.play_billing.zzb.zzh(this.zza), ", Debug Message: ", this.zzb);
    }
}
