package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbgc;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    private final zzbgc zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z10, Location location, int i, int i10, String str2, String str3, zzbgc zzbgcVar) {
        super(context, str, bundle, bundle2, z10, location, i, i10, str2, str3);
        this.zza = zzbgcVar;
    }

    public NativeAdOptions getNativeAdOptions() {
        return zzbgc.zza(this.zza);
    }
}
