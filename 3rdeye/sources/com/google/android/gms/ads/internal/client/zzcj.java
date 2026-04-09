package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbau;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbwt;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public abstract class zzcj extends zzays implements zzck {
    public zzcj() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzce zzccVar = null;
        zzch zzcfVar = null;
        switch (i) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzfv.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzccVar = iInterfaceQueryLocalInterface instanceof zzce ? (zzce) iInterfaceQueryLocalInterface : new zzcc(strongBinder);
                }
                zzayt.zzc(parcel);
                zzp(arrayListCreateTypedArrayList, zzccVar);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                zzayt.zzc(parcel);
                boolean zZzu = zzu(string);
                parcel2.writeNoException();
                parcel2.writeInt(zZzu ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                zzayt.zzc(parcel);
                zzbwt zzbwtVarZzm = zzm(string2);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbwtVarZzm);
                return true;
            case 4:
                String string3 = parcel.readString();
                zzayt.zzc(parcel);
                boolean zZzs = zzs(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                zzayt.zzc(parcel);
                zzbau zzbauVarZzh = zzh(string4);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbauVarZzh);
                return true;
            case 6:
                String string5 = parcel.readString();
                zzayt.zzc(parcel);
                boolean zZzt = zzt(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                zzayt.zzc(parcel);
                zzbx zzbxVarZzj = zzj(string6);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbxVarZzj);
                return true;
            case 8:
                zzbpo zzbpoVarZzf = zzbpn.zzf(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzo(zzbpoVarZzf);
                parcel2.writeNoException();
                return true;
            case 9:
                String string7 = parcel.readString();
                zzfv zzfvVar = (zzfv) zzayt.zza(parcel, zzfv.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    zzcfVar = iInterfaceQueryLocalInterface2 instanceof zzch ? (zzch) iInterfaceQueryLocalInterface2 : new zzcf(strongBinder2);
                }
                zzayt.zzc(parcel);
                boolean zZzv = zzv(string7, zzfvVar, zzcfVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 10:
                int i11 = parcel.readInt();
                String string8 = parcel.readString();
                zzayt.zzc(parcel);
                boolean zZzr = zzr(i11, string8);
                parcel2.writeNoException();
                parcel2.writeInt(zZzr ? 1 : 0);
                return true;
            case 11:
                String string9 = parcel.readString();
                zzayt.zzc(parcel);
                zzbx zzbxVarZzi = zzi(string9);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbxVarZzi);
                return true;
            case 12:
                String string10 = parcel.readString();
                zzayt.zzc(parcel);
                zzbau zzbauVarZzg = zzg(string10);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbauVarZzg);
                return true;
            case 13:
                String string11 = parcel.readString();
                zzayt.zzc(parcel);
                zzbwt zzbwtVarZzl = zzl(string11);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbwtVarZzl);
                return true;
            case 14:
                int i12 = parcel.readInt();
                String string12 = parcel.readString();
                zzayt.zzc(parcel);
                zzfv zzfvVarZzk = zzk(i12, string12);
                parcel2.writeNoException();
                zzayt.zze(parcel2, zzfvVarZzk);
                return true;
            case 15:
                int i13 = parcel.readInt();
                zzayt.zzc(parcel);
                Bundle bundleZzf = zzf(i13);
                parcel2.writeNoException();
                zzayt.zze(parcel2, bundleZzf);
                return true;
            case 16:
                int i14 = parcel.readInt();
                String string13 = parcel.readString();
                zzayt.zzc(parcel);
                int iZze = zze(i14, string13);
                parcel2.writeNoException();
                parcel2.writeInt(iZze);
                return true;
            case 17:
                int i15 = parcel.readInt();
                String string14 = parcel.readString();
                zzayt.zzc(parcel);
                boolean zZzq = zzq(i15, string14);
                parcel2.writeNoException();
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 18:
                int i16 = parcel.readInt();
                zzayt.zzc(parcel);
                zzn(i16);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
