package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbau;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbwt;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public interface zzck extends IInterface {
    int zze(int i, String str) throws RemoteException;

    Bundle zzf(int i) throws RemoteException;

    zzbau zzg(String str) throws RemoteException;

    zzbau zzh(String str) throws RemoteException;

    zzbx zzi(String str) throws RemoteException;

    zzbx zzj(String str) throws RemoteException;

    zzfv zzk(int i, String str) throws RemoteException;

    zzbwt zzl(String str) throws RemoteException;

    zzbwt zzm(String str) throws RemoteException;

    void zzn(int i) throws RemoteException;

    void zzo(zzbpo zzbpoVar) throws RemoteException;

    void zzp(List list, zzce zzceVar) throws RemoteException;

    boolean zzq(int i, String str) throws RemoteException;

    boolean zzr(int i, String str) throws RemoteException;

    boolean zzs(String str) throws RemoteException;

    boolean zzt(String str) throws RemoteException;

    boolean zzu(String str) throws RemoteException;

    boolean zzv(String str, zzfv zzfvVar, zzch zzchVar) throws RemoteException;
}
