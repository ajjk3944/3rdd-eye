package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcdx implements zzkx {
    private final zzzm zza = new zzzm(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    public final void zza(boolean z10) {
        this.zzf = 0;
        this.zzg = false;
        if (z10) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final long zzb(zzph zzphVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final void zzc(zzph zzphVar) {
        zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final void zzd(zzph zzphVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final void zze(zzph zzphVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final void zzf(zzkw zzkwVar, zzxk zzxkVar, zzyw[] zzywVarArr) {
        int i;
        this.zzf = 0;
        for (zzyw zzywVar : zzywVarArr) {
            if (zzywVar != null) {
                int i10 = this.zzf;
                int i11 = zzywVar.zzc().zzc;
                if (i11 == 0) {
                    i = 144310272;
                } else if (i11 == 1) {
                    i = 13107200;
                } else if (i11 != 2) {
                    i = 131072;
                    if (i11 != 3 && i11 != 5 && i11 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.zzf = i10 + i;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final boolean zzg(zzph zzphVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final boolean zzh(zzkw zzkwVar) {
        long j4 = zzkwVar.zzb;
        boolean z10 = true;
        char c10 = j4 > this.zzc ? (char) 0 : j4 < this.zzb ? (char) 2 : (char) 1;
        int iZza = this.zza.zza();
        int i = this.zzf;
        if (c10 != 2 && (c10 != 1 || !this.zzg || iZza >= i)) {
            z10 = false;
        }
        this.zzg = z10;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final /* synthetic */ boolean zzi(zzbl zzblVar, zzvh zzvhVar, long j4) {
        zzea.zzf("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final boolean zzj(zzkw zzkwVar) {
        long j4 = zzkwVar.zzd ? this.zze : this.zzd;
        return j4 <= 0 || zzkwVar.zzb >= j4;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final zzzm zzk() {
        return this.zza;
    }

    public final synchronized void zzl(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zze = i * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzc = i * 1000;
    }

    public final synchronized void zzo(int i) {
        this.zzb = i * 1000;
    }
}
