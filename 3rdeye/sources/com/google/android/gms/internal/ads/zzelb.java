package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzelb {
    private final zzelg zza;
    private final String zzb;
    private com.google.android.gms.ads.internal.client.zzea zzc;

    public zzelb(zzelg zzelgVar, String str) {
        this.zza = zzelgVar;
        this.zzb = str;
    }

    public final synchronized String zza() {
        com.google.android.gms.ads.internal.client.zzea zzeaVar;
        try {
            zzeaVar = this.zzc;
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
            return null;
        }
        return zzeaVar != null ? zzeaVar.zzg() : null;
    }

    public final synchronized String zzb() {
        com.google.android.gms.ads.internal.client.zzea zzeaVar;
        try {
            zzeaVar = this.zzc;
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
            return null;
        }
        return zzeaVar != null ? zzeaVar.zzg() : null;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws RemoteException {
        this.zzc = null;
        zzelh zzelhVar = new zzelh(i);
        zzela zzelaVar = new zzela(this);
        this.zza.zzb(zzmVar, this.zzb, zzelhVar, zzelaVar);
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
