package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzeiw implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzcai zza;
    final /* synthetic */ zzfcf zzb;
    final /* synthetic */ zzfbt zzc;
    final /* synthetic */ zzejc zzd;
    final /* synthetic */ zzeix zze;

    public zzeiw(zzeix zzeixVar, zzcai zzcaiVar, zzfcf zzfcfVar, zzfbt zzfbtVar, zzejc zzejcVar) {
        this.zza = zzcaiVar;
        this.zzb = zzfcfVar;
        this.zzc = zzfbtVar;
        this.zzd = zzejcVar;
        this.zze = zzeixVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        this.zza.zzc(this.zze.zzd.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
