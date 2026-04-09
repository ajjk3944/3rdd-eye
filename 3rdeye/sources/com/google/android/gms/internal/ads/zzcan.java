package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcan implements zzgcx {
    final /* synthetic */ zzcap zza;

    public zzcan(zzcap zzcapVar) {
        this.zza = zzcapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        this.zza.zzb.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzb(Object obj) {
        this.zza.zzb.set(1);
    }
}
