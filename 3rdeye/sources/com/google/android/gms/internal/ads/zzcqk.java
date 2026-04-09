package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcqk implements zzcxf, zzazb, zzdaq {
    private final zzfbt zza;
    private final zzcwj zzb;
    private final zzcxo zzc;
    private final zzcyf zzf;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcqk(zzfbt zzfbtVar, zzcwj zzcwjVar, zzcxo zzcxoVar, zzcyf zzcyfVar) {
        this.zza = zzfbtVar;
        this.zzb = zzcwjVar;
        this.zzc = zzcxoVar;
        this.zzf = zzcyfVar;
    }

    private final void zzd() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaq
    public final void zzdq() {
        if (this.zza.zze == 4) {
            zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final void zzdr(zzaza zzazaVar) {
        int i = this.zza.zze;
        if (i == 1) {
            if (zzazaVar.zzj) {
                zzd();
            }
        } else if (i == 4 && zzazaVar.zzj && this.zzg.compareAndSet(false, true)) {
            this.zzf.zza();
        }
        if (zzazaVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final synchronized void zzt() {
        int i = this.zza.zze;
        if (i == 1 || i == 4) {
            return;
        }
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdaq
    public final void zzdp() {
    }
}
