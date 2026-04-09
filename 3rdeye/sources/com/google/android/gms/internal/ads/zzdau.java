package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdau implements zzcyt {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbr)).intValue();
    private int zzb = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzna)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final synchronized void zzdo(zzfcf zzfcfVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbs)).booleanValue()) {
            try {
                zzfbw zzfbwVar = zzfcfVar.zzb.zzb;
                this.zza = zzfbwVar.zzc;
                this.zzb = zzfbwVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) {
    }
}
