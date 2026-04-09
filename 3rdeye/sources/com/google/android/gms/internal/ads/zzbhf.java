package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbhf extends zzayr implements zzbhh {
    public zzbhf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final com.google.android.gms.ads.internal.client.zzed zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final zzbgk zzf() throws RemoteException {
        zzbgk zzbgiVar;
        Parcel parcelZzda = zzda(16, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final zzbgn zzg(String str) throws RemoteException {
        zzbgn zzbglVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(2, parcelZza);
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

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final IObjectWrapper zzh() throws RemoteException {
        return C1154e9.g(zzda(9, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final String zzi() throws RemoteException {
        Parcel parcelZzda = zzda(4, zza());
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final String zzj(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzda = zzda(1, parcelZza);
        String string = parcelZzda.readString();
        parcelZzda.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final List zzk() throws RemoteException {
        Parcel parcelZzda = zzda(3, zza());
        ArrayList<String> arrayListCreateStringArrayList = parcelZzda.createStringArrayList();
        parcelZzda.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzl() throws RemoteException {
        zzdb(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzm() throws RemoteException {
        zzdb(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzn(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdb(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzo() throws RemoteException {
        zzdb(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzdb(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzq() throws RemoteException {
        Parcel parcelZzda = zzda(12, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzda = zzda(17, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzda = zzda(10, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzt() throws RemoteException {
        Parcel parcelZzda = zzda(13, zza());
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }
}
