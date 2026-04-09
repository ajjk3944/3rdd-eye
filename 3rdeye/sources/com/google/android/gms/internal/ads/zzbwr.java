package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbwr extends zzayr implements zzbwt {
    public zzbwr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final Bundle zzb() throws RemoteException {
        Parcel parcelZzda = zzda(9, zza());
        Bundle bundle = (Bundle) zzayt.zza(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final com.google.android.gms.ads.internal.client.zzea zzc() throws RemoteException {
        Parcel parcelZzda = zzda(12, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final zzbwq zzd() throws RemoteException {
        zzbwq zzbwoVar;
        Parcel parcelZzda = zzda(11, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbwoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbwoVar = iInterfaceQueryLocalInterface instanceof zzbwq ? (zzbwq) iInterfaceQueryLocalInterface : new zzbwo(strongBinder);
        }
        parcelZzda.recycle();
        return zzbwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final String zze() throws RemoteException {
        Parcel parcelZzda = zzda(16, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbxa zzbxaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzmVar);
        zzayt.zzf(parcelZza, zzbxaVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzh(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbxa zzbxaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzmVar);
        zzayt.zzf(parcelZza, zzbxaVar);
        zzdb(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzi(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayt.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzdb(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzj(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzdqVar);
        zzdb(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzk(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzdtVar);
        zzdb(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzl(zzbww zzbwwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbwwVar);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzm(zzbxh zzbxhVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzbxhVar);
        zzdb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzo(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final boolean zzp() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzq(zzbxb zzbxbVar) throws RemoteException {
        throw null;
    }
}
