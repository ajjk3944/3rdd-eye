package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdzp implements zzgcx {
    final /* synthetic */ zzbvo zza;
    final /* synthetic */ zzbvg zzb;

    public zzdzp(zzdzt zzdztVar, zzbvo zzbvoVar, zzbvg zzbvgVar) {
        this.zza = zzbvoVar;
        this.zzb = zzbvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        try {
            this.zzb.zze(com.google.android.gms.ads.internal.util.zzbb.zzb(th));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzco)).booleanValue()) {
                this.zzb.zzf(parcelFileDescriptor);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcp)).booleanValue() && (bundle = this.zza.zzm) != null) {
                bundle.putLong(zzdrk.BINDER_CALL_START.zza(), com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis());
            }
            this.zzb.zzg(parcelFileDescriptor, this.zza);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e4);
        }
    }
}
