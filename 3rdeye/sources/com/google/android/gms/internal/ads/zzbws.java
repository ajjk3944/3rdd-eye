package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzbws extends zzays implements zzbwt {
    public zzbws() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbwt zzr(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzbwt ? (zzbwt) iInterfaceQueryLocalInterface : new zzbwr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbxa zzbwyVar = null;
        zzbxa zzbwyVar2 = null;
        zzbxb zzbxbVar = null;
        zzbww zzbwuVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzayt.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwyVar = iInterfaceQueryLocalInterface instanceof zzbxa ? (zzbxa) iInterfaceQueryLocalInterface : new zzbwy(strongBinder);
                }
                zzayt.zzc(parcel);
                zzg(zzmVar, zzbwyVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbwuVar = iInterfaceQueryLocalInterface2 instanceof zzbww ? (zzbww) iInterfaceQueryLocalInterface2 : new zzbwu(strongBinder2);
                }
                zzayt.zzc(parcel);
                zzl(zzbwuVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                int i11 = zzayt.zza;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 4:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzn(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbxbVar = iInterfaceQueryLocalInterface3 instanceof zzbxb ? (zzbxb) iInterfaceQueryLocalInterface3 : new zzbxb(strongBinder3);
                }
                zzayt.zzc(parcel);
                zzq(zzbxbVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbxh zzbxhVar = (zzbxh) zzayt.zza(parcel, zzbxh.CREATOR);
                zzayt.zzc(parcel);
                zzm(zzbxhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzj(zzdqVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                zzayt.zze(parcel2, bundleZzb);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zZzg = zzayt.zzg(parcel);
                zzayt.zzc(parcel);
                zzo(iObjectWrapperAsInterface2, zZzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbwq zzbwqVarZzd = zzd();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbwqVarZzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzea zzeaVarZzc = zzc();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzeaVarZzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdt zzdtVarZzb = com.google.android.gms.ads.internal.client.zzds.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzk(zzdtVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzayt.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwyVar2 = iInterfaceQueryLocalInterface4 instanceof zzbxa ? (zzbxa) iInterfaceQueryLocalInterface4 : new zzbwy(strongBinder4);
                }
                zzayt.zzc(parcel);
                zzh(zzmVar2, zzbwyVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZzg2 = zzayt.zzg(parcel);
                zzayt.zzc(parcel);
                zzi(zZzg2);
                parcel2.writeNoException();
                return true;
            case 16:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            default:
                return false;
        }
    }
}
