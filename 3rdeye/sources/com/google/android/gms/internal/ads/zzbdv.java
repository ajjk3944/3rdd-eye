package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbdv extends zzayr implements zzbdx {
    public zzbdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbdx
    public final void zze(zzbdu zzbduVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbduVar);
        zzdb(1, parcelZza);
    }
}
