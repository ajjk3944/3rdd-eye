package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpo;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class zzcw extends zzayr implements zzcy {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final zzbpo getAdapterCreator() throws RemoteException {
        Parcel parcelZzda = zzda(2, zza());
        zzbpo zzbpoVarZzf = zzbpn.zzf(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbpoVarZzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final zzfd getLiteSdkVersion() throws RemoteException {
        Parcel parcelZzda = zzda(1, zza());
        zzfd zzfdVar = (zzfd) zzayt.zza(parcelZzda, zzfd.CREATOR);
        parcelZzda.recycle();
        return zzfdVar;
    }
}
