package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbpp extends zzayr implements zzbpr {
    public zzbpp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpu zzbpuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpu zzbpuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzE() throws RemoteException {
        zzdb(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzF() throws RemoteException {
        zzdb(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzG(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayt.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzdb(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzI() throws RemoteException {
        zzdb(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzL() throws RemoteException {
        zzdb(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final boolean zzM() throws RemoteException {
        Parcel parcelZzda = zzda(22, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final boolean zzN() throws RemoteException {
        Parcel parcelZzda = zzda(13, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbpz zzO() throws RemoteException {
        zzbpz zzbpzVar;
        Parcel parcelZzda = zzda(15, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbpzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbpzVar = iInterfaceQueryLocalInterface instanceof zzbpz ? (zzbpz) iInterfaceQueryLocalInterface : new zzbpz(strongBinder);
        }
        parcelZzda.recycle();
        return zzbpzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbqa zzP() throws RemoteException {
        zzbqa zzbqaVar;
        Parcel parcelZzda = zzda(16, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbqaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbqaVar = iInterfaceQueryLocalInterface instanceof zzbqa ? (zzbqa) iInterfaceQueryLocalInterface : new zzbqa(strongBinder);
        }
        parcelZzda.recycle();
        return zzbqaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final com.google.android.gms.ads.internal.client.zzed zzh() throws RemoteException {
        Parcel parcelZzda = zzda(26, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbhh zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbpx zzj() throws RemoteException {
        zzbpx zzbpvVar;
        Parcel parcelZzda = zzda(36, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbpvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbpvVar = iInterfaceQueryLocalInterface instanceof zzbpx ? (zzbpx) iInterfaceQueryLocalInterface : new zzbpv(strongBinder);
        }
        parcelZzda.recycle();
        return zzbpvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbqd zzk() throws RemoteException {
        zzbqd zzbqbVar;
        Parcel parcelZzda = zzda(27, zza());
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbqbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbqbVar = iInterfaceQueryLocalInterface instanceof zzbqd ? (zzbqd) iInterfaceQueryLocalInterface : new zzbqb(strongBinder);
        }
        parcelZzda.recycle();
        return zzbqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbsc zzl() throws RemoteException {
        Parcel parcelZzda = zzda(33, zza());
        zzbsc zzbscVar = (zzbsc) zzayt.zza(parcelZzda, zzbsc.CREATOR);
        parcelZzda.recycle();
        return zzbscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbsc zzm() throws RemoteException {
        Parcel parcelZzda = zzda(34, zza());
        zzbsc zzbscVar = (zzbsc) zzayt.zza(parcelZzda, zzbsc.CREATOR);
        parcelZzda.recycle();
        return zzbscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final IObjectWrapper zzn() throws RemoteException {
        return C1154e9.g(zzda(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzo() throws RemoteException {
        zzdb(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwl zzbwlVar, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzd(parcelZza, zzmVar);
        parcelZza.writeString(null);
        zzayt.zzf(parcelZza, zzbwlVar);
        parcelZza.writeString(str2);
        zzdb(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzq(IObjectWrapper iObjectWrapper, zzbmf zzbmfVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, zzbmfVar);
        parcelZza.writeTypedList(list);
        zzdb(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzr(IObjectWrapper iObjectWrapper, zzbwl zzbwlVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, zzbwlVar);
        parcelZza.writeStringList(list);
        zzdb(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzs(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzdb(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpu zzbpuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpu zzbpuVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpu zzbpuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzd(parcelZza, zzrVar);
        zzayt.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpu zzbpuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzd(parcelZza, zzrVar);
        zzayt.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpu zzbpuVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpu zzbpuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzdb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpu zzbpuVar, zzbgc zzbgcVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayt.zzf(parcelZza, zzbpuVar);
        zzayt.zzd(parcelZza, zzbgcVar);
        parcelZza.writeStringList(list);
        zzdb(14, parcelZza);
    }
}
