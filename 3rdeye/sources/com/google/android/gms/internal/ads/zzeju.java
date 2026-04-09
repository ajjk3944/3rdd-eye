package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeju extends com.google.android.gms.ads.internal.client.zzbp {
    private final zzelb zza;

    public zzeju(Context context, zzcgz zzcgzVar, zzfcm zzfcmVar, zzdix zzdixVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        zzeld zzeldVar = new zzeld(zzdixVar, zzcgzVar.zzi());
        zzeldVar.zze(zzbkVar);
        this.zza = new zzelb(new zzeln(zzcgzVar, context, zzeldVar, zzfcmVar), zzfcmVar.zzL());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        this.zza.zzd(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws RemoteException {
        this.zza.zzd(zzmVar, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
