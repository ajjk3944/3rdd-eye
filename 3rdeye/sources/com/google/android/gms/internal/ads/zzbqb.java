package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbqb extends zzayr implements zzbqd {
    public zzbqb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzda = zzda(18, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final boolean zzB() throws RemoteException {
        Parcel parcelZzda = zzda(17, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final double zze() throws RemoteException {
        Parcel parcelZzda = zzda(8, zza());
        double d10 = parcelZzda.readDouble();
        parcelZzda.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final float zzf() throws RemoteException {
        Parcel parcelZzda = zzda(23, zza());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final float zzg() throws RemoteException {
        Parcel parcelZzda = zzda(25, zza());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final float zzh() throws RemoteException {
        Parcel parcelZzda = zzda(24, zza());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final Bundle zzi() throws RemoteException {
        Parcel parcelZzda = zzda(16, zza());
        Bundle bundle = (Bundle) zzayt.zza(parcelZzda, Bundle.CREATOR);
        parcelZzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final com.google.android.gms.ads.internal.client.zzed zzj() throws RemoteException {
        Parcel parcelZzda = zzda(11, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final zzbgg zzk() throws RemoteException {
        Parcel parcelZzda = zzda(12, zza());
        zzbgg zzbggVarZzj = zzbgf.zzj(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbggVarZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final zzbgn zzl() throws RemoteException {
        Parcel parcelZzda = zzda(5, zza());
        zzbgn zzbgnVarZzg = zzbgm.zzg(parcelZzda.readStrongBinder());
        parcelZzda.recycle();
        return zzbgnVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final IObjectWrapper zzm() throws RemoteException {
        return C1154e9.g(zzda(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final IObjectWrapper zzn() throws RemoteException {
        return C1154e9.g(zzda(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final IObjectWrapper zzo() throws RemoteException {
        return C1154e9.g(zzda(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzp() throws RemoteException {
        Parcel parcelZzda = zzda(7, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzq() throws RemoteException {
        Parcel parcelZzda = zzda(4, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzr() throws RemoteException {
        Parcel parcelZzda = zzda(6, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzs() throws RemoteException {
        Parcel parcelZzda = zzda(2, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzt() throws RemoteException {
        Parcel parcelZzda = zzda(10, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final String zzu() throws RemoteException {
        Parcel parcelZzda = zzda(9, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final List zzv() throws RemoteException {
        Parcel parcelZzda = zzda(3, zza());
        ArrayList arrayListZzb = zzayt.zzb(parcelZzda);
        parcelZzda.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zzx() throws RemoteException {
        zzdb(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, iObjectWrapper2);
        zzayt.zzf(parcelZza, iObjectWrapper3);
        zzdb(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(22, parcelZza);
    }
}
