package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbhw extends zzayr implements zzbhy {
    public zzbhw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final void zze(com.google.android.gms.ads.internal.client.zzbx zzbxVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbxVar);
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(1, parcelZza);
    }
}
