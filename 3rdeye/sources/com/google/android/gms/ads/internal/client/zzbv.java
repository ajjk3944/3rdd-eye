package com.google.android.gms.ads.internal.client;

import N7.C1154e9;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbax;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbwg;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class zzbv extends zzayr implements zzbx {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzA() throws RemoteException {
        zzdb(11, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzB() throws RemoteException {
        zzdb(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(zzbh zzbhVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbhVar);
        zzdb(20, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(zzbk zzbkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbkVar);
        zzdb(7, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(zzcb zzcbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzF(zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzrVar);
        zzdb(13, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzG(zzco zzcoVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzcoVar);
        zzdb(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(zzbax zzbaxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbaxVar);
        zzdb(40, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(zzx zzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzJ(zzcv zzcvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzcvVar);
        zzdb(45, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzK(zzeh zzehVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzL(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayt.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzdb(34, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzM(zzbtx zzbtxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzN(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayt.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzdb(22, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzO(zzbdx zzbdxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzdtVar);
        zzdb(42, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(zzbua zzbuaVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzR(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(zzbwg zzbwgVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzT(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzU(zzgc zzgcVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzgcVar);
        zzdb(29, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzW(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(44, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzX() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzY() throws RemoteException {
        Parcel parcelZzda = zzda(46, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzZ() throws RemoteException {
        Parcel parcelZzda = zzda(23, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzaa() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzab(zzm zzmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzmVar);
        Parcel parcelZzda = zzda(4, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzac(zzcs zzcsVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzd() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzr zzg() throws RemoteException {
        Parcel parcelZzda = zzda(12, zza());
        zzr zzrVar = (zzr) zzayt.zza(parcelZzda, zzr.CREATOR);
        parcelZzda.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzbk zzi() throws RemoteException {
        zzbk zzbiVar;
        Parcel parcelZzda = zzda(33, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbiVar = iInterfaceQueryLocalInterface instanceof zzbk ? (zzbk) iInterfaceQueryLocalInterface : new zzbi(strongBinder);
        }
        parcelZzda.recycle();
        return zzbiVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzco zzj() throws RemoteException {
        zzco zzcmVar;
        Parcel parcelZzda = zzda(32, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzcmVar = iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(strongBinder);
        }
        parcelZzda.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzea zzk() throws RemoteException {
        zzea zzdyVar;
        Parcel parcelZzda = zzda(41, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzdyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdyVar = iInterfaceQueryLocalInterface instanceof zzea ? (zzea) iInterfaceQueryLocalInterface : new zzdy(strongBinder);
        }
        parcelZzda.recycle();
        return zzdyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzed zzl() throws RemoteException {
        zzed zzebVar;
        Parcel parcelZzda = zzda(26, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzebVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzebVar = iInterfaceQueryLocalInterface instanceof zzed ? (zzed) iInterfaceQueryLocalInterface : new zzeb(strongBinder);
        }
        parcelZzda.recycle();
        return zzebVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper zzn() throws RemoteException {
        return C1154e9.g(zzda(1, zza()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzr() throws RemoteException {
        Parcel parcelZzda = zzda(31, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzx() throws RemoteException {
        zzdb(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(zzm zzmVar, zzbn zzbnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzmVar);
        zzayt.zzf(parcelZza, zzbnVar);
        zzdb(43, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzz() throws RemoteException {
        zzdb(5, zza());
    }
}
