package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfhk implements zzgcx {
    final /* synthetic */ zzfhm zza;
    final /* synthetic */ zzfhb zzb;

    public zzfhk(zzfhm zzfhmVar, zzfhb zzfhbVar) {
        this.zza = zzfhmVar;
        this.zzb = zzfhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        zzfhb zzfhbVar = this.zzb;
        zzfhbVar.zzh(th);
        zzfhbVar.zzg(false);
        this.zza.zza(zzfhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzb(Object obj) {
    }
}
