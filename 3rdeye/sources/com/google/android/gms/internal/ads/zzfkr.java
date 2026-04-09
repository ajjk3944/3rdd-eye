package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfkr implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzb;
    final /* synthetic */ zzfkv zzc;

    public zzfkr(zzfkv zzfkvVar, long j4, com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zza = j4;
        this.zzb = zzeaVar;
        this.zzc = zzfkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfkv zzfkvVar = this.zzc;
        if (zzfkvVar.zzp != null) {
            zzfkvVar.zzp.zzi(this.zza, zzfkv.zzO(this.zzb), zzfkvVar.zzr, zzfkvVar.zze.zzd, zzfkvVar.zzd(), zzfkvVar.zzD());
        }
    }
}
