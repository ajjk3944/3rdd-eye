package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbyw extends zzayr implements zzbyy {
    public zzbyw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, iObjectWrapper2);
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, iObjectWrapper3);
        return C1154e9.g(zzda(11, parcelZza));
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzf(IObjectWrapper iObjectWrapper, zzbzc zzbzcVar, zzbyv zzbyvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzd(parcelZza, zzbzcVar);
        zzayt.zzf(parcelZza, zzbyvVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzg(zzbug zzbugVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbud zzbudVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbud zzbudVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbud zzbudVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbud zzbudVar) throws RemoteException {
        throw null;
    }
}
