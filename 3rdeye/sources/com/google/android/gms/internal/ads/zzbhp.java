package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbhp extends zzayr implements zzbhr {
    public zzbhp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhr
    public final void zze(zzbhh zzbhhVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbhhVar);
        parcelZza.writeString(str);
        zzdb(1, parcelZza);
    }
}
