package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeir implements com.google.android.gms.ads.internal.zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcvp zzb;
    private final zzcwj zzc;
    private final zzddy zzd;
    private final zzddq zze;
    private final zzcni zzf;

    public zzeir(zzcvp zzcvpVar, zzcwj zzcwjVar, zzddy zzddyVar, zzddq zzddqVar, zzcni zzcniVar) {
        this.zzb = zzcvpVar;
        this.zzc = zzcwjVar;
        this.zzd = zzddyVar;
        this.zze = zzddqVar;
        this.zzf = zzcniVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzs();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
