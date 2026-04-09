package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbxs implements zzgcx {
    final /* synthetic */ A4.a zza;

    public zzbxs(zzbxt zzbxtVar, A4.a aVar) {
        this.zza = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        zzbxt.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbxt.zzc.remove(this.zza);
    }
}
