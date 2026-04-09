package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.singular.sdk.internal.SingularParamsBase;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzenc implements zzett {
    private final com.google.android.gms.ads.internal.client.zzx zza;
    private final boolean zzb;

    public zzenc(com.google.android.gms.ads.internal.client.zzx zzxVar, boolean z10) {
        this.zza = zzxVar;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcut) obj).zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfE)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        com.google.android.gms.ads.internal.client.zzx zzxVar = this.zza;
        if (zzxVar != null) {
            int i = zzxVar.zza;
            if (i == 1) {
                bundle.putString("avo", SingularParamsBase.Constants.PLATFORM_KEY);
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
