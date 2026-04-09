package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbfw extends zzayr implements IInterface {
    public zzbfw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbus zzbusVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbusVar);
        zzdb(1, parcelZza);
    }
}
