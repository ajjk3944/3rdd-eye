package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbgi extends zzayr implements zzbgk {
    public zzbgi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final float zze() throws RemoteException {
        Parcel parcelZzda = zzda(2, zza());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final float zzf() throws RemoteException {
        Parcel parcelZzda = zzda(6, zza());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final float zzg() throws RemoteException {
        Parcel parcelZzda = zzda(5, zza());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final com.google.android.gms.ads.internal.client.zzed zzh() throws RemoteException {
        Parcel parcelZzda = zzda(7, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final IObjectWrapper zzi() throws RemoteException {
        return C1154e9.g(zzda(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final boolean zzk() throws RemoteException {
        Parcel parcelZzda = zzda(10, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzda = zzda(8, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zzm(zzbhv zzbhvVar) throws RemoteException {
        throw null;
    }
}
