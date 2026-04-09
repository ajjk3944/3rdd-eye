package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzeff implements zzdgg {
    final /* synthetic */ zzedh zza;
    final /* synthetic */ zzfbt zzb;
    final /* synthetic */ zzefg zzc;

    public zzeff(zzefg zzefgVar, zzedh zzedhVar, zzfbt zzfbtVar) {
        this.zza = zzedhVar;
        this.zzb = zzfbtVar;
        this.zzc = zzefgVar;
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
            if (this.zzc.zzc.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaU)).intValue()) {
                zzfdmVar.zzx();
            } else {
                zzfdmVar.zzy(context);
            }
        } catch (zzfcv e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot show interstitial.");
            throw new zzdgf(e4.getCause());
        }
    }
}
