package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public interface zzbau extends IInterface {
    com.google.android.gms.ads.internal.client.zzbx zze() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzea zzf() throws RemoteException;

    String zzg() throws RemoteException;

    void zzh(boolean z10) throws RemoteException;

    void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper, zzbbb zzbbbVar) throws RemoteException;
}
