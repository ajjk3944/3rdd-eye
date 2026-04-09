package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbva extends zzayr implements zzbvc {
    public zzbva(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zze(zzbvo zzbvoVar, zzbvg zzbvgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbvoVar);
        zzayt.zzf(parcelZza, zzbvgVar);
        zzdb(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzf(zzbvo zzbvoVar, zzbvg zzbvgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbvoVar);
        zzayt.zzf(parcelZza, zzbvgVar);
        zzdb(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzg(zzbvo zzbvoVar, zzbvg zzbvgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbvoVar);
        zzayt.zzf(parcelZza, zzbvgVar);
        zzdb(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzh(String str, zzbvg zzbvgVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, zzbvgVar);
        zzdb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzi(zzbuy zzbuyVar, zzbvh zzbvhVar) throws RemoteException {
        throw null;
    }
}
