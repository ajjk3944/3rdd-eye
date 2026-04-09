package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public interface zzbwt extends IInterface {
    Bundle zzb() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzea zzc() throws RemoteException;

    zzbwq zzd() throws RemoteException;

    String zze() throws RemoteException;

    String zzf() throws RemoteException;

    void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbxa zzbxaVar) throws RemoteException;

    void zzh(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbxa zzbxaVar) throws RemoteException;

    void zzi(boolean z10) throws RemoteException;

    void zzj(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException;

    void zzk(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException;

    void zzl(zzbww zzbwwVar) throws RemoteException;

    void zzm(zzbxh zzbxhVar) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzo(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException;

    boolean zzp() throws RemoteException;

    void zzq(zzbxb zzbxbVar) throws RemoteException;
}
