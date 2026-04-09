package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzeib extends zzbwk {
    final /* synthetic */ zzcxx zza;
    final /* synthetic */ zzcvp zzb;
    final /* synthetic */ zzcwy zzc;
    final /* synthetic */ zzdef zzd;

    public zzeib(zzeic zzeicVar, zzcxx zzcxxVar, zzcvp zzcvpVar, zzcwy zzcwyVar, zzdef zzdefVar) {
        this.zza = zzcxxVar;
        this.zzb = zzcvpVar;
        this.zzc = zzcwyVar;
        this.zzd = zzdefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzdw(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzdt();
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzm(IObjectWrapper iObjectWrapper, zzbwm zzbwmVar) {
        this.zzd.zza(zzbwmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzd.zza(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzp(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzg(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final void zzk(IObjectWrapper iObjectWrapper, int i) {
    }
}
