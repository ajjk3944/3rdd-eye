package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbbo extends zzayr implements IInterface {
    public zzbbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbbm zzbbmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbbmVar);
        Parcel parcelZzda = zzda(3, parcelZza);
        long j4 = parcelZzda.readLong();
        parcelZzda.recycle();
        return j4;
    }

    public final zzbbj zzf(zzbbm zzbbmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbbmVar);
        Parcel parcelZzda = zzda(1, parcelZza);
        zzbbj zzbbjVar = (zzbbj) zzayt.zza(parcelZzda, zzbbj.CREATOR);
        parcelZzda.recycle();
        return zzbbjVar;
    }

    public final zzbbj zzg(zzbbm zzbbmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbbmVar);
        Parcel parcelZzda = zzda(2, parcelZza);
        zzbbj zzbbjVar = (zzbbj) zzayt.zza(parcelZzda, zzbbj.CREATOR);
        parcelZzda.recycle();
        return zzbbjVar;
    }
}
