package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbgl extends zzayr implements zzbgn {
    public zzbgl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final double zzb() throws RemoteException {
        Parcel parcelZzda = zzda(3, zza());
        double d10 = parcelZzda.readDouble();
        parcelZzda.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final int zzc() throws RemoteException {
        Parcel parcelZzda = zzda(5, zza());
        int i = parcelZzda.readInt();
        parcelZzda.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final int zzd() throws RemoteException {
        Parcel parcelZzda = zzda(4, zza());
        int i = parcelZzda.readInt();
        parcelZzda.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final Uri zze() throws RemoteException {
        Parcel parcelZzda = zzda(2, zza());
        Uri uri = (Uri) zzayt.zza(parcelZzda, Uri.CREATOR);
        parcelZzda.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final IObjectWrapper zzf() throws RemoteException {
        return C1154e9.g(zzda(1, zza()));
    }
}
