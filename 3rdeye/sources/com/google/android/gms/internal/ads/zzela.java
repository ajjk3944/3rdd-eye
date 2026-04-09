package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzela implements zzelf {
    final /* synthetic */ zzelb zza;

    public zzela(zzelb zzelbVar) {
        this.zza = zzelbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqv zzcqvVar = (zzcqv) obj;
        zzelb zzelbVar = this.zza;
        synchronized (zzelbVar) {
            zzelbVar.zzc = zzcqvVar.zzl();
            zzcqvVar.zzk();
        }
    }
}
