package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbat;
import com.google.android.gms.internal.ads.zzbau;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzbwt;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class zzci extends zzayr implements zzck {
    public zzci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final int zze(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(16, parcelZza);
        int i10 = parcelZzda.readInt();
        parcelZzda.recycle();
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final Bundle zzf(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        Parcel parcelZzda = zzda(15, parcelZza);
        Bundle bundle = (Bundle) zzayt.zza(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbau zzg(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(12, parcelZza);
        zzbau zzbauVarZzb = zzbat.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbauVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbau zzh(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(5, parcelZza);
        zzbau zzbauVarZzb = zzbat.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbauVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbx zzi(String str) throws RemoteException {
        zzbx zzbvVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(11, parcelZza);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = iInterfaceQueryLocalInterface instanceof zzbx ? (zzbx) iInterfaceQueryLocalInterface : new zzbv(strongBinder);
        }
        parcelZzda.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbx zzj(String str) throws RemoteException {
        zzbx zzbvVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(7, parcelZza);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = iInterfaceQueryLocalInterface instanceof zzbx ? (zzbx) iInterfaceQueryLocalInterface : new zzbv(strongBinder);
        }
        parcelZzda.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzfv zzk(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(14, parcelZza);
        zzfv zzfvVar = (zzfv) zzayt.zza(parcelZzda, zzfv.CREATOR);
        parcelZzda.recycle();
        return zzfvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbwt zzl(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(13, parcelZza);
        zzbwt zzbwtVarZzr = zzbws.zzr(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbwtVarZzr;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbwt zzm(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(3, parcelZza);
        zzbwt zzbwtVarZzr = zzbws.zzr(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbwtVarZzr;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzn(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzdb(18, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzo(zzbpo zzbpoVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbpoVar);
        zzdb(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzp(List list, zzce zzceVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzayt.zzf(parcelZza, zzceVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzq(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(17, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzr(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(10, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzs(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(4, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzt(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(6, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzu(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(2, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzv(String str, zzfv zzfvVar, zzch zzchVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayt.zzd(parcelZza, zzfvVar);
        zzayt.zzf(parcelZza, zzchVar);
        Parcel parcelZzda = zzda(9, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }
}
