package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbif extends zzayr implements zzbih {
    public zzbif(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzA() throws RemoteException {
        zzdb(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, bundle);
        zzdb(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzC(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, bundle);
        zzdb(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzD() throws RemoteException {
        zzdb(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzE(com.google.android.gms.ads.internal.client.zzdf zzdfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzdfVar);
        zzdb(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzF(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzdtVar);
        zzdb(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzG(zzbie zzbieVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbieVar);
        zzdb(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final boolean zzH() throws RemoteException {
        Parcel parcelZzda = zzda(30, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final boolean zzI() throws RemoteException {
        Parcel parcelZzda = zzda(24, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final boolean zzJ(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, bundle);
        Parcel parcelZzda = zzda(16, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final double zze() throws RemoteException {
        Parcel parcelZzda = zzda(8, zza());
        double d10 = parcelZzda.readDouble();
        parcelZzda.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final Bundle zzf() throws RemoteException {
        Parcel parcelZzda = zzda(20, zza());
        Bundle bundle = (Bundle) zzayt.zza(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final com.google.android.gms.ads.internal.client.zzea zzg() throws RemoteException {
        Parcel parcelZzda = zzda(31, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final com.google.android.gms.ads.internal.client.zzed zzh() throws RemoteException {
        Parcel parcelZzda = zzda(11, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final zzbgg zzi() throws RemoteException {
        zzbgg zzbgeVar;
        Parcel parcelZzda = zzda(14, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbgeVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbgeVar = iInterfaceQueryLocalInterface instanceof zzbgg ? (zzbgg) iInterfaceQueryLocalInterface : new zzbge(strongBinder);
        }
        parcelZzda.recycle();
        return zzbgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final zzbgk zzj() throws RemoteException {
        zzbgk zzbgiVar;
        Parcel parcelZzda = zzda(29, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbgiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbgiVar = iInterfaceQueryLocalInterface instanceof zzbgk ? (zzbgk) iInterfaceQueryLocalInterface : new zzbgi(strongBinder);
        }
        parcelZzda.recycle();
        return zzbgiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final zzbgn zzk() throws RemoteException {
        zzbgn zzbglVar;
        Parcel parcelZzda = zzda(5, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbglVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbglVar = iInterfaceQueryLocalInterface instanceof zzbgn ? (zzbgn) iInterfaceQueryLocalInterface : new zzbgl(strongBinder);
        }
        parcelZzda.recycle();
        return zzbglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final IObjectWrapper zzl() throws RemoteException {
        return C1154e9.g(zzda(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final IObjectWrapper zzm() throws RemoteException {
        return C1154e9.g(zzda(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzn() throws RemoteException {
        Parcel parcelZzda = zzda(7, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzo() throws RemoteException {
        Parcel parcelZzda = zzda(4, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzp() throws RemoteException {
        Parcel parcelZzda = zzda(6, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzq() throws RemoteException {
        Parcel parcelZzda = zzda(2, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzs() throws RemoteException {
        Parcel parcelZzda = zzda(10, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzt() throws RemoteException {
        Parcel parcelZzda = zzda(9, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final List zzu() throws RemoteException {
        Parcel parcelZzda = zzda(3, zza());
        ArrayList arrayListZzb = zzayt.zzb(parcelZzda);
        parcelZzda.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final List zzv() throws RemoteException {
        Parcel parcelZzda = zzda(23, zza());
        ArrayList arrayListZzb = zzayt.zzb(parcelZzda);
        parcelZzda.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzw() throws RemoteException {
        zzdb(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzx() throws RemoteException {
        zzdb(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzy(com.google.android.gms.ads.internal.client.zzdj zzdjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzdjVar);
        zzdb(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, bundle);
        zzdb(15, parcelZza);
    }
}
