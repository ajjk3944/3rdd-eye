package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzbia extends zzays implements zzbib {
    public zzbia() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static zzbib zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof zzbib ? (zzbib) iInterfaceQueryLocalInterface : new zzbhz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbih zzbifVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzbifVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            zzbifVar = iInterfaceQueryLocalInterface instanceof zzbih ? (zzbih) iInterfaceQueryLocalInterface : new zzbif(strongBinder);
        }
        zzayt.zzc(parcel);
        zze(zzbifVar);
        parcel2.writeNoException();
        return true;
    }
}
