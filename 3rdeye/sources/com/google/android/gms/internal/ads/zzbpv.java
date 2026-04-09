package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbpv extends zzayr implements zzbpx {
    public zzbpv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final IObjectWrapper zze() throws RemoteException {
        return C1154e9.g(zzda(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzda = zzda(2, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }
}
