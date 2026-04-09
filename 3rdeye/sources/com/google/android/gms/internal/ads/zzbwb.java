package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbwb extends zzayr implements IInterface {
    public zzbwb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbwa zzbwaVar, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbwaVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzdb(2, parcelZza);
    }
}
