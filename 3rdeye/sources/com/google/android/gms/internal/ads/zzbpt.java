package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzbpt extends zzays implements zzbpu {
    public zzbpt() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbpu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbpu ? (zzbpu) iInterfaceQueryLocalInterface : new zzbps(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i11 = parcel.readInt();
                zzayt.zzc(parcel);
                zzg(i11);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    boolean z10 = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata") instanceof zzbpy;
                }
                zzayt.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzayt.zzc(parcel);
                zzq(string, string2);
                break;
            case 10:
                zzbhg.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzayt.zzc(parcel);
                break;
            case 11:
                zzw();
                break;
            case 12:
                parcel.readString();
                zzayt.zzc(parcel);
                break;
            case 13:
                zzz();
                break;
            case 14:
                zzbwm zzbwmVar = (zzbwm) zzayt.zza(parcel, zzbwm.CREATOR);
                zzayt.zzc(parcel);
                zzs(zzbwmVar);
                break;
            case 15:
                zzx();
                break;
            case 16:
                zzbwq zzbwqVarZzb = zzbwp.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzt(zzbwqVarZzb);
                break;
            case 17:
                int i12 = parcel.readInt();
                zzayt.zzc(parcel);
                zzj(i12);
                break;
            case 18:
                zzv();
                break;
            case 19:
                zzayt.zzc(parcel);
                break;
            case 20:
                zzy();
                break;
            case 21:
                String string3 = parcel.readString();
                zzayt.zzc(parcel);
                zzl(string3);
                break;
            case 22:
                int i13 = parcel.readInt();
                String string4 = parcel.readString();
                zzayt.zzc(parcel);
                zzi(i13, string4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzayt.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzayt.zzc(parcel);
                zzh(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzayt.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzayt.zzc(parcel);
                zzk(zzeVar2);
                break;
            case 25:
                zzu();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
