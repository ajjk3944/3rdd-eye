package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbow implements zzcak {
    final /* synthetic */ zzcai zza;
    final /* synthetic */ zzboa zzb;

    public zzbow(zzboy zzboyVar, zzcai zzcaiVar, zzboa zzboaVar) {
        this.zza = zzcaiVar;
        this.zzb = zzboaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcak
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzboj("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
