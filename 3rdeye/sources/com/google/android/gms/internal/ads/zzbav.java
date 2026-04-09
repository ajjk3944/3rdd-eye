package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbav extends zzayr implements zzbax {
    public zzbav(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzb(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzeVar);
        zzdb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final void zzd(zzbau zzbauVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbauVar);
        zzdb(1, parcelZza);
    }
}
