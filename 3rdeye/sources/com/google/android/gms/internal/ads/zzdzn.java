package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdzn implements zzgcx {
    final /* synthetic */ zzbuy zza;
    final /* synthetic */ zzbvh zzb;

    public zzdzn(zzdzt zzdztVar, zzbvh zzbvhVar, zzbuy zzbuyVar) {
        this.zzb = zzbvhVar;
        this.zza = zzbuyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        try {
            this.zzb.zze(com.google.android.gms.ads.internal.util.zzbb.zzb(th));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zzf((String) obj, this.zza);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e4);
        }
    }
}
