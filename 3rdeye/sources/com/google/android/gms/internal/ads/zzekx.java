package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzekx implements zzelf {
    final /* synthetic */ zzeky zza;

    public zzekx(zzeky zzekyVar) {
        this.zza = zzekyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final void zza() {
        zzeky zzekyVar = this.zza;
        synchronized (zzekyVar) {
            zzekyVar.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeky zzekyVar = this.zza;
        zzdeu zzdeuVar = (zzdeu) obj;
        synchronized (zzekyVar) {
            zzekyVar.zzj = zzdeuVar;
            zzekyVar.zzj.zzk();
        }
    }
}
