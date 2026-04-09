package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public abstract class zzda extends zzays implements zzdb {
    public zzda() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzdn zzdlVar;
        switch (i) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float f10 = parcel.readFloat();
                zzayt.zzc(parcel);
                zzq(f10);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                zzayt.zzc(parcel);
                zzr(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzg = zzayt.zzg(parcel);
                zzayt.zzc(parcel);
                zzp(zZzg);
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                zzayt.zzc(parcel);
                zzn(iObjectWrapperAsInterface, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzl(string3, iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zZzv = zzv();
                parcel2.writeNoException();
                int i11 = zzayt.zza;
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                zzayt.zzc(parcel);
                zzh(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbpo zzbpoVarZzf = zzbpn.zzf(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzo(zzbpoVarZzf);
                parcel2.writeNoException();
                return true;
            case 12:
                zzbmi zzbmiVarZzc = zzbmh.zzc(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzs(zzbmiVarZzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                zzfx zzfxVar = (zzfx) zzayt.zza(parcel, zzfx.CREATOR);
                zzayt.zzc(parcel);
                zzu(zzfxVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzdlVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzdlVar = iInterfaceQueryLocalInterface instanceof zzdn ? (zzdn) iInterfaceQueryLocalInterface : new zzdl(strongBinder);
                }
                zzayt.zzc(parcel);
                zzm(zzdlVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zZzg2 = zzayt.zzg(parcel);
                zzayt.zzc(parcel);
                zzj(zZzg2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                zzayt.zzc(parcel);
                zzt(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
