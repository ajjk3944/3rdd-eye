package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzers implements zzett {
    public final Bundle zza;

    public zzers(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcut) obj).zza;
        Bundle bundleZza = zzfdc.zza(bundle, "device");
        bundleZza.putBundle("android_mem_info", this.zza);
        bundle.putBundle("device", bundleZza);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
