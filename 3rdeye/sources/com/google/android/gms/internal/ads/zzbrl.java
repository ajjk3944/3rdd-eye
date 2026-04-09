package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbrl extends zzayr implements zzbrn {
    public zzbrl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final com.google.android.gms.ads.internal.client.zzed zze() throws RemoteException {
        Parcel parcelZzda = zzda(5, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final zzbsc zzf() throws RemoteException {
        Parcel parcelZzda = zzda(2, zza());
        zzbsc zzbscVar = (zzbsc) zzayt.zza(parcelZzda, zzbsc.CREATOR);
        parcelZzda.recycle();
        return zzbscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final zzbsc zzg() throws RemoteException {
        Parcel parcelZzda = zzda(3, zza());
        zzbsc zzbscVar = (zzbsc) zzayt.zza(parcelZzda, zzbsc.CREATOR);
        parcelZzda.recycle();
        return zzbscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbrq zzbrqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzayt.zzd(parcelZza, bundle);
        zzayt.zzd(parcelZza, bundle2);
        zzayt.zzd(parcelZza, zzrVar);
        zzayt.zzf(parcelZza, zzbrqVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqy zzbqyVar, zzbpu zzbpuVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, zzmVar);
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, zzbqyVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrb zzbrbVar, zzbpu zzbpuVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, zzmVar);
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, zzbrbVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzayt.zzd(parcelZza, zzrVar);
        zzdb(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrb zzbrbVar, zzbpu zzbpuVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, zzmVar);
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, zzbrbVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzayt.zzd(parcelZza, zzrVar);
        zzdb(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbre zzbreVar, zzbpu zzbpuVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, zzmVar);
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, zzbreVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrh zzbrhVar, zzbpu zzbpuVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, zzmVar);
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, zzbrhVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrh zzbrhVar, zzbpu zzbpuVar, zzbgc zzbgcVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, zzmVar);
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, zzbrhVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzayt.zzd(parcelZza, zzbgcVar);
        zzdb(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrk zzbrkVar, zzbpu zzbpuVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, zzmVar);
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, zzbrkVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrk zzbrkVar, zzbpu zzbpuVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzd(parcelZza, zzmVar);
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, zzbrkVar);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzq(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdb(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzda = zzda(24, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzda = zzda(15, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzda = zzda(17, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }
}
