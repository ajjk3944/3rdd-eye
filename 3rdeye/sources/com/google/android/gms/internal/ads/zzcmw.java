package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcmw implements zzgcx {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcmx zzb;

    public zzcmw(zzcmx zzcmxVar, String str) {
        this.zza = str;
        this.zzb = zzcmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        String str = this.zza;
        zzcmx zzcmxVar = this.zzb;
        zzcmxVar.zzh.zza(zzcmxVar.zzg.zze(zzcmxVar.zze, zzcmxVar.zzf, false, str, null, zzcmxVar.zzw()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcmx zzcmxVar = this.zzb;
        zzcmxVar.zzh.zza(zzcmxVar.zzg.zze(zzcmxVar.zze, zzcmxVar.zzf, false, this.zza, (String) obj, zzcmxVar.zzw()), zzcmxVar.zzn);
    }
}
