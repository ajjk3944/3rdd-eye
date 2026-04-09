package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzejf implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzdev zza;

    public zzejf(zzejg zzejgVar, zzdev zzdevVar) {
        this.zza = zzdevVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        zzdev zzdevVar = this.zza;
        zzdevVar.zzc().zza();
        zzdevVar.zzf().zza();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }
}
