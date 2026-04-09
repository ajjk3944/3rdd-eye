package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzees implements zzdgg {
    final /* synthetic */ zzcai zza;
    final /* synthetic */ zzfbt zzb;
    final /* synthetic */ zzeet zzc;

    public zzees(zzeet zzeetVar, zzcai zzcaiVar, zzfbt zzfbtVar) {
        this.zza = zzcaiVar;
        this.zzb = zzfbtVar;
        this.zzc = zzeetVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final zzfbt zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void zzb(boolean z10, Context context, zzcwe zzcweVar) {
        try {
            com.google.android.gms.ads.internal.zzv.zzj();
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zze);
        } catch (Exception unused) {
        }
    }
}
