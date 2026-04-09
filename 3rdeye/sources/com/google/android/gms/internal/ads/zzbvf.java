package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzbvf extends zzays implements zzbvg {
    public zzbvf() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzayt.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzayt.zzc(parcel);
            zzf(parcelFileDescriptor);
        } else if (i == 2) {
            com.google.android.gms.ads.internal.util.zzbb zzbbVar = (com.google.android.gms.ads.internal.util.zzbb) zzayt.zza(parcel, com.google.android.gms.ads.internal.util.zzbb.CREATOR);
            zzayt.zzc(parcel);
            zze(zzbbVar);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzayt.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzbvo zzbvoVar = (zzbvo) zzayt.zza(parcel, zzbvo.CREATOR);
            zzayt.zzc(parcel);
            zzg(parcelFileDescriptor2, zzbvoVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
