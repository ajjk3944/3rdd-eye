package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdxz extends zzbvf {
    private final zzcai zza;
    private final zzbvo zzb;

    public zzdxz(zzcai zzcaiVar, zzbvo zzbvoVar) {
        this.zza = zzcaiVar;
        this.zzb = zzbvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zza.zzd(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzdyq(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvo zzbvoVar) {
        this.zza.zzc(new zzdyq(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvoVar));
    }
}
