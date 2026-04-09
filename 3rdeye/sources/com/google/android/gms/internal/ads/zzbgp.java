package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbgp extends zzayr implements zzbgr {
    public zzbgp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final IObjectWrapper zzb(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return C1154e9.g(zzda(2, parcelZza));
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzc() throws RemoteException {
        zzdb(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzdA(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzdB(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzdx(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzdy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzdz(zzbgk zzbgkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbgkVar);
        zzdb(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i);
        zzdb(5, parcelZza);
    }
}
