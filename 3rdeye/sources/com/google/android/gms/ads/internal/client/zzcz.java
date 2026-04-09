package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbpo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class zzcz extends zzayr implements zzdb {
    public zzcz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final float zze() throws RemoteException {
        Parcel parcelZzda = zzda(7, zza());
        float f10 = parcelZzda.readFloat();
        parcelZzda.recycle();
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final String zzf() throws RemoteException {
        Parcel parcelZzda = zzda(9, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final List zzg() throws RemoteException {
        Parcel parcelZzda = zzda(13, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzda.createTypedArrayList(zzbmb.CREATOR);
        parcelZzda.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzh(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdb(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzi() throws RemoteException {
        zzdb(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzj(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayt.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzdb(17, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzk() throws RemoteException {
        zzdb(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzm(zzdn zzdnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzdnVar);
        zzdb(16, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzdb(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzo(zzbpo zzbpoVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbpoVar);
        zzdb(11, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzp(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayt.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzdb(4, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzq(float f10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f10);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzr(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzs(zzbmi zzbmiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, zzbmiVar);
        zzdb(12, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzt(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdb(18, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzu(zzfx zzfxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzd(parcelZza, zzfxVar);
        zzdb(14, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final boolean zzv() throws RemoteException {
        Parcel parcelZzda = zzda(8, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }
}
