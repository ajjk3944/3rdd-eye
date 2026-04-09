package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public abstract class zzcd extends zzays implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i == 1) {
            zzfv zzfvVar = (zzfv) zzayt.zza(parcel, zzfv.CREATOR);
            zzayt.zzc(parcel);
            zze(zzfvVar);
        } else {
            if (i != 2) {
                return false;
            }
            zzfv zzfvVar2 = (zzfv) zzayt.zza(parcel, zzfv.CREATOR);
            zzayt.zzc(parcel);
            zzf(zzfvVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
