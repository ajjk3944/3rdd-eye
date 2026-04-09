package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbps extends zzayr implements zzbpu {
    public zzbps(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zze() throws RemoteException {
        zzdb(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzf() throws RemoteException {
        zzdb(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzg(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzdb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzeVar);
        zzdb(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzi(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        zzdb(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzj(int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzeVar);
        zzdb(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzl(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdb(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzm() throws RemoteException {
        zzdb(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzn() throws RemoteException {
        zzdb(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzo() throws RemoteException {
        zzdb(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzp() throws RemoteException {
        zzdb(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzq(String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzdb(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzr(zzbhh zzbhhVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbhhVar);
        parcelZza.writeString(str);
        zzdb(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzs(zzbwm zzbwmVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzt(zzbwq zzbwqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbwqVar);
        zzdb(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzu() throws RemoteException {
        zzdb(25, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzv() throws RemoteException {
        zzdb(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzw() throws RemoteException {
        zzdb(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzx() throws RemoteException {
        zzdb(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzy() throws RemoteException {
        zzdb(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzz() throws RemoteException {
        zzdb(13, zza());
    }
}
