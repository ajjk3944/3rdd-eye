package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhl;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbib;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmw;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public interface zzbt extends IInterface {
    zzbq zze() throws RemoteException;

    void zzf(zzbhl zzbhlVar) throws RemoteException;

    void zzg(zzbho zzbhoVar) throws RemoteException;

    void zzh(String str, zzbhu zzbhuVar, zzbhr zzbhrVar) throws RemoteException;

    void zzi(zzbmw zzbmwVar) throws RemoteException;

    void zzj(zzbhy zzbhyVar, zzr zzrVar) throws RemoteException;

    void zzk(zzbib zzbibVar) throws RemoteException;

    void zzl(zzbk zzbkVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbmn zzbmnVar) throws RemoteException;

    void zzo(zzbgc zzbgcVar) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcs zzcsVar) throws RemoteException;
}
