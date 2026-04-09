package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfqa extends zzayr implements zzfqc {
    public zzfqa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfqc
    public final void zze(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeString(null);
        zzdb(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqc
    public final void zzf() throws RemoteException {
        zzdb(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfqc
    public final void zzg(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzdb(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqc
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzdb(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqc
    public final void zzi(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzdb(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqc
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzdb(5, parcelZza);
    }
}
