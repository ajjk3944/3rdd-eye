package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbyz extends zzayr implements zzbzb {
    public zzbyz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final zzbyy zze(IObjectWrapper iObjectWrapper, zzbpo zzbpoVar, int i) throws RemoteException {
        zzbyy zzbywVar;
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, zzbpoVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzda = zzda(2, parcelZza);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbywVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzbywVar = iInterfaceQueryLocalInterface instanceof zzbyy ? (zzbyy) iInterfaceQueryLocalInterface : new zzbyw(strongBinder);
        }
        parcelZzda.recycle();
        return zzbywVar;
    }
}
