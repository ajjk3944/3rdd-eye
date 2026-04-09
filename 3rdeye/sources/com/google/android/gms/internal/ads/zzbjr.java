package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbjr implements zzgcx {
    final /* synthetic */ zzcfe zza;

    public zzbjr(zzcfe zzcfeVar) {
        this.zza = zzcfeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcfe zzcfeVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbw(zzcfeVar.getContext(), zzcfeVar.zzm().afmaVersion, str, null, zzcfeVar.zzD() != null ? zzcfeVar.zzD().zzax : null).zzb();
    }
}
