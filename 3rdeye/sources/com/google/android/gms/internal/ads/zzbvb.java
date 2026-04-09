package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzbvb extends zzays implements zzbvc {
    public zzbvb() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbvg zzbveVar = null;
        zzbvh zzbvhVar = null;
        zzbvg zzbveVar2 = null;
        zzbvg zzbveVar3 = null;
        zzbvg zzbveVar4 = null;
        switch (i) {
            case 1:
                zzayt.zzc(parcel);
                parcel2.writeNoException();
                zzayt.zze(parcel2, null);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (iInterfaceQueryLocalInterface instanceof zzbvd) {
                    }
                }
                zzayt.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzbvo zzbvoVar = (zzbvo) zzayt.zza(parcel, zzbvo.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbveVar = iInterfaceQueryLocalInterface2 instanceof zzbvg ? (zzbvg) iInterfaceQueryLocalInterface2 : new zzbve(strongBinder2);
                }
                zzayt.zzc(parcel);
                zzg(zzbvoVar, zzbveVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbvo zzbvoVar2 = (zzbvo) zzayt.zza(parcel, zzbvo.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbveVar4 = iInterfaceQueryLocalInterface3 instanceof zzbvg ? (zzbvg) iInterfaceQueryLocalInterface3 : new zzbve(strongBinder3);
                }
                zzayt.zzc(parcel);
                zzf(zzbvoVar2, zzbveVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbvo zzbvoVar3 = (zzbvo) zzayt.zza(parcel, zzbvo.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbveVar3 = iInterfaceQueryLocalInterface4 instanceof zzbvg ? (zzbvg) iInterfaceQueryLocalInterface4 : new zzbve(strongBinder4);
                }
                zzayt.zzc(parcel);
                zze(zzbvoVar3, zzbveVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbveVar2 = iInterfaceQueryLocalInterface5 instanceof zzbvg ? (zzbvg) iInterfaceQueryLocalInterface5 : new zzbve(strongBinder5);
                }
                zzayt.zzc(parcel);
                zzh(string, zzbveVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbuy zzbuyVar = (zzbuy) zzayt.zza(parcel, zzbuy.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzbvhVar = iInterfaceQueryLocalInterface6 instanceof zzbvh ? (zzbvh) iInterfaceQueryLocalInterface6 : new zzbvh(strongBinder6);
                }
                zzayt.zzc(parcel);
                zzi(zzbuyVar, zzbvhVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
