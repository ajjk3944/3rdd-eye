package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbas extends zzayr implements zzbau {
    public zzbas(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final com.google.android.gms.ads.internal.client.zzbx zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final com.google.android.gms.ads.internal.client.zzea zzf() throws RemoteException {
        Parcel parcelZzda = zzda(5, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final String zzg() throws RemoteException {
        Parcel parcelZzda = zzda(8, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzh(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayt.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzdb(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzdtVar);
        zzdb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzj(IObjectWrapper iObjectWrapper, zzbbb zzbbbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, zzbbbVar);
        zzdb(4, parcelZza);
    }
}
