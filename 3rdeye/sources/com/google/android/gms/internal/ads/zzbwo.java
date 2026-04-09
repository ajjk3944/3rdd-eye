package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbwo extends zzayr implements zzbwq {
    public zzbwo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final int zze() throws RemoteException {
        Parcel parcelZzda = zzda(2, zza());
        int i = parcelZzda.readInt();
        parcelZzda.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final String zzf() throws RemoteException {
        Parcel parcelZzda = zzda(1, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }
}
