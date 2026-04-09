package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzeia implements zzdgg {
    final /* synthetic */ zzedh zza;
    final /* synthetic */ zzfbt zzb;

    public zzeia(zzeic zzeicVar, zzedh zzedhVar, zzfbt zzfbtVar) {
        this.zza = zzedhVar;
        this.zzb = zzfbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final zzfbt zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void zzb(boolean z10, Context context, zzcwe zzcweVar) throws zzdgf {
        try {
            zzfdm zzfdmVar = (zzfdm) this.zza.zzb;
            zzfdmVar.zzv(z10);
            zzfdmVar.zzA();
        } catch (zzfcv e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot show rewarded video.", e4);
            throw new zzdgf(e4.getCause());
        }
    }
}
