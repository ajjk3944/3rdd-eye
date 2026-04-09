package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbqa extends zzayr implements IInterface {
    public zzbqa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() throws RemoteException {
        Parcel parcelZzda = zzda(13, zza());
        Bundle bundle = (Bundle) zzayt.zza(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzed zzf() throws RemoteException {
        Parcel parcelZzda = zzda(16, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzedVarZzb;
    }

    public final zzbgg zzg() throws RemoteException {
        Parcel parcelZzda = zzda(19, zza());
        zzbgg zzbggVarZzj = zzbgf.zzj(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbggVarZzj;
    }

    public final zzbgn zzh() throws RemoteException {
        Parcel parcelZzda = zzda(5, zza());
        zzbgn zzbgnVarZzg = zzbgm.zzg(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbgnVarZzg;
    }

    public final IObjectWrapper zzi() throws RemoteException {
        return C1154e9.g(zzda(15, zza()));
    }

    public final IObjectWrapper zzj() throws RemoteException {
        return C1154e9.g(zzda(20, zza()));
    }

    public final IObjectWrapper zzk() throws RemoteException {
        return C1154e9.g(zzda(21, zza()));
    }

    public final String zzl() throws RemoteException {
        Parcel parcelZzda = zzda(7, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    public final String zzm() throws RemoteException {
        Parcel parcelZzda = zzda(4, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    public final String zzn() throws RemoteException {
        Parcel parcelZzda = zzda(6, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    public final String zzo() throws RemoteException {
        Parcel parcelZzda = zzda(2, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    public final List zzp() throws RemoteException {
        Parcel parcelZzda = zzda(3, zza());
        ArrayList arrayListZzb = zzayt.zzb(parcelZzda);
        parcelZzda.recycle();
        return arrayListZzb;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(9, parcelZza);
    }

    public final void zzr() throws RemoteException {
        zzdb(8, zza());
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(10, parcelZza);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, iObjectWrapper2);
        zzayt.zzf(parcelZza, iObjectWrapper3);
        zzdb(22, parcelZza);
    }

    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(14, parcelZza);
    }

    public final boolean zzv() throws RemoteException {
        Parcel parcelZzda = zzda(12, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    public final boolean zzw() throws RemoteException {
        Parcel parcelZzda = zzda(11, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }
}
