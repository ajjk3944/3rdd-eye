package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbhz extends zzayr implements zzbib {
    public zzbhz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbib
    public final void zze(zzbih zzbihVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbihVar);
        zzdb(1, parcelZza);
    }
}
