package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfsc extends zzayr implements zzfse {
    public zzfsc(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfse
    public final void zze(Bundle bundle, zzfsg zzfsgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, bundle);
        zzayt.zzf(parcelZza, zzfsgVar);
        zzdc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfse
    public final void zzf(String str, Bundle bundle, zzfsg zzfsgVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayt.zzd(parcelZza, bundle);
        zzayt.zzf(parcelZza, zzfsgVar);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfse
    public final void zzg(Bundle bundle, zzfsg zzfsgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, bundle);
        zzayt.zzf(parcelZza, zzfsgVar);
        zzdc(3, parcelZza);
    }
}
