package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdxy extends zzbvf {
    final /* synthetic */ zzdya zza;

    public zzdxy(zzdya zzdyaVar) {
        this.zza = zzdyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zza.zza.zzd(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzdya zzdyaVar = this.zza;
        zzdyaVar.zza.zzc(new zzdyq(autoCloseInputStream, zzdyaVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvo zzbvoVar) {
        this.zza.zza.zzc(new zzdyq(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvoVar));
    }
}
