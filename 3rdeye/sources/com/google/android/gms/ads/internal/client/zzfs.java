package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbwq;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzbww;
import com.google.android.gms.internal.ads.zzbxa;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbxh;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class zzfs extends zzbws {
    private static void zzs(final zzbxa zzbxaVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfr
            @Override // java.lang.Runnable
            public final void run() {
                zzbxa zzbxaVar2 = zzbxaVar;
                if (zzbxaVar2 != null) {
                    try {
                        zzbxaVar2.zze(1);
                    } catch (RemoteException e4) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final zzea zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final zzbwq zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final String zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final String zzf() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzg(zzm zzmVar, zzbxa zzbxaVar) throws RemoteException {
        zzs(zzbxaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzh(zzm zzmVar, zzbxa zzbxaVar) throws RemoteException {
        zzs(zzbxaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final boolean zzp() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzi(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzj(zzdq zzdqVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzk(zzdt zzdtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzl(zzbww zzbwwVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzm(zzbxh zzbxhVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzq(zzbxb zzbxbVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzo(IObjectWrapper iObjectWrapper, boolean z10) {
    }
}
