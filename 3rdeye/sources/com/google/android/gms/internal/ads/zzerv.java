package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzerv implements zzett {
    public final zzfbs zza;

    public zzerv(zzfbs zzfbsVar) {
        this.zza = zzfbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcut zzcutVar = (zzcut) obj;
        zzfbs zzfbsVar = this.zza;
        if (zzfbsVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmh)).booleanValue()) {
                return;
            }
            Bundle bundle = zzcutVar.zza;
            bundle.putBoolean("render_in_browser", zzfbsVar.zzd());
            bundle.putBoolean("disable_ml", zzfbsVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
