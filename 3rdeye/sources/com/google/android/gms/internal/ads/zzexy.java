package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzexy implements zzelf {
    final /* synthetic */ zzexz zza;

    public zzexy(zzexz zzexzVar) {
        this.zza = zzexzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final void zza() {
        zzexz zzexzVar = this.zza;
        synchronized (zzexzVar) {
            zzexzVar.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcoh zzcohVar = (zzcoh) obj;
        zzexz zzexzVar = this.zza;
        synchronized (zzexzVar) {
            try {
                zzcoh zzcohVar2 = zzexzVar.zza;
                if (zzcohVar2 != null) {
                    zzcohVar2.zzb();
                }
                zzexzVar.zza = zzcohVar;
                zzcohVar.zzc(zzexzVar);
                zzexzVar.zzg.zzk(new zzcoi(zzcohVar, zzexzVar, zzexzVar.zzg, zzexzVar.zzi));
                zzcohVar.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
