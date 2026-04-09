package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfpj extends zzayr implements IInterface {
    public zzfpj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfph zze(zzfpf zzfpfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzfpfVar);
        Parcel parcelZzda = zzda(1, parcelZza);
        zzfph zzfphVar = (zzfph) zzayt.zza(parcelZzda, zzfph.CREATOR);
        parcelZzda.recycle();
        return zzfphVar;
    }

    public final zzfpq zzf(zzfpo zzfpoVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzfpoVar);
        Parcel parcelZzda = zzda(3, parcelZza);
        zzfpq zzfpqVar = (zzfpq) zzayt.zza(parcelZzda, zzfpq.CREATOR);
        parcelZzda.recycle();
        return zzfpqVar;
    }

    public final void zzg(zzfpc zzfpcVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzfpcVar);
        zzdb(2, parcelZza);
    }
}
