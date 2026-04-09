package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbgr;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzblb;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzbwd;
import com.google.android.gms.internal.ads.zzbwt;
import com.google.android.gms.internal.ads.zzbyy;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public abstract class zzcq extends zzays implements zzcr {
    public zzcq() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzayt.zza(parcel, zzr.CREATOR);
                String string = parcel.readString();
                zzbpo zzbpoVarZzf = zzbpn.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzayt.zzc(parcel);
                zzbx zzbxVarZzd = zzd(iObjectWrapperAsInterface, zzrVar, string, zzbpoVarZzf, i11);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbxVarZzd);
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzayt.zza(parcel, zzr.CREATOR);
                String string2 = parcel.readString();
                zzbpo zzbpoVarZzf2 = zzbpn.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzayt.zzc(parcel);
                zzbx zzbxVarZze = zze(iObjectWrapperAsInterface2, zzrVar2, string2, zzbpoVarZzf2, i12);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbxVarZze);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbpo zzbpoVarZzf3 = zzbpn.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzayt.zzc(parcel);
                zzbt zzbtVarZzb = zzb(iObjectWrapperAsInterface3, string3, zzbpoVarZzf3, i13);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbtVarZzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzbgr zzbgrVarZzj = zzj(iObjectWrapperAsInterface4, iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbgrVarZzj);
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpo zzbpoVarZzf4 = zzbpn.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzayt.zzc(parcel);
                zzbwd zzbwdVarZzo = zzo(iObjectWrapperAsInterface6, zzbpoVarZzf4, i14);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbwdVarZzo);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, null);
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzbto zzbtoVarZzn = zzn(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbtoVarZzn);
                return true;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                zzayt.zzc(parcel);
                zzdb zzdbVarZzh = zzh(iObjectWrapperAsInterface8, i15);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzdbVarZzh);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzayt.zza(parcel, zzr.CREATOR);
                String string4 = parcel.readString();
                int i16 = parcel.readInt();
                zzayt.zzc(parcel);
                zzbx zzbxVarZzf = zzf(iObjectWrapperAsInterface9, zzrVar3, string4, i16);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbxVarZzf);
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzbgx zzbgxVarZzk = zzk(iObjectWrapperAsInterface10, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbgxVarZzk);
                return true;
            case 12:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbpo zzbpoVarZzf5 = zzbpn.zzf(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                zzayt.zzc(parcel);
                zzbwt zzbwtVarZzp = zzp(iObjectWrapperAsInterface13, string5, zzbpoVarZzf5, i17);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbwtVarZzp);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzayt.zza(parcel, zzr.CREATOR);
                String string6 = parcel.readString();
                zzbpo zzbpoVarZzf6 = zzbpn.zzf(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                zzayt.zzc(parcel);
                zzbx zzbxVarZzc = zzc(iObjectWrapperAsInterface14, zzrVar4, string6, zzbpoVarZzf6, i18);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbxVarZzc);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpo zzbpoVarZzf7 = zzbpn.zzf(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                zzayt.zzc(parcel);
                zzbyy zzbyyVarZzq = zzq(iObjectWrapperAsInterface15, zzbpoVarZzf7, i19);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbyyVarZzq);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpo zzbpoVarZzf8 = zzbpn.zzf(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                zzayt.zzc(parcel);
                zzbth zzbthVarZzm = zzm(iObjectWrapperAsInterface16, zzbpoVarZzf8, i20);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbthVarZzm);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperAsInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpo zzbpoVarZzf9 = zzbpn.zzf(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                zzblc zzblcVarZzc = zzblb.zzc(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzblf zzblfVarZzl = zzl(iObjectWrapperAsInterface17, zzbpoVarZzf9, i21, zzblcVarZzc);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzblfVarZzl);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpo zzbpoVarZzf10 = zzbpn.zzf(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                zzayt.zzc(parcel);
                zzdw zzdwVarZzi = zzi(iObjectWrapperAsInterface18, zzbpoVarZzf10, i22);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzdwVarZzi);
                return true;
            case 18:
                IObjectWrapper iObjectWrapperAsInterface19 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpo zzbpoVarZzf11 = zzbpn.zzf(parcel.readStrongBinder());
                int i23 = parcel.readInt();
                zzayt.zzc(parcel);
                zzck zzckVarZzg = zzg(iObjectWrapperAsInterface19, zzbpoVarZzf11, i23);
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzckVarZzg);
                return true;
            default:
                return false;
        }
    }
}
