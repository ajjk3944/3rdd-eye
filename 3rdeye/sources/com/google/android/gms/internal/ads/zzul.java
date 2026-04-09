package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzul implements zzvf, zzve {
    public final zzvf zza;
    long zzb;
    private zzve zzc;
    private zzuk[] zzd = new zzuk[0];
    private long zze = 0;

    public zzul(zzvf zzvfVar, boolean z10, long j4, long j10) {
        this.zza = zzvfVar;
        this.zzb = j10;
    }

    private static long zzr(long j4, long j10, long j11) {
        long jMax = Math.max(j4, j10);
        return j11 != Long.MIN_VALUE ? Math.min(jMax, j11) : jMax;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zza(long j4, zzmi zzmiVar) {
        if (j4 == 0) {
            return 0L;
        }
        long j10 = zzmiVar.zzc;
        String str = zzex.zza;
        long jMax = Math.max(0L, Math.min(j10, j4));
        long j11 = zzmiVar.zzd;
        long j12 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j11, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j4));
        if (jMax != j10 || jMax2 != j11) {
            zzmiVar = new zzmi(jMax, jMax2);
        }
        return this.zza.zza(j4, zzmiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j4 = this.zzb;
            if (j4 == Long.MIN_VALUE || jZzb < j4) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j4 = this.zzb;
            if (j4 == Long.MIN_VALUE || jZzc < j4) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzd() {
        if (zzq()) {
            long j4 = this.zze;
            this.zze = -9223372036854775807L;
            long jZzd = zzd();
            return jZzd != -9223372036854775807L ? jZzd : j4;
        }
        long jZzd2 = this.zza.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzr(jZzd2, 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zze(long j4) {
        this.zze = -9223372036854775807L;
        for (zzuk zzukVar : this.zzd) {
            if (zzukVar != null) {
                zzukVar.zzc();
            }
        }
        return zzr(this.zza.zze(j4), 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzf(zzyw[] zzywVarArr, boolean[] zArr, zzwz[] zzwzVarArr, boolean[] zArr2, long j4) {
        int length = zzwzVarArr.length;
        this.zzd = new zzuk[length];
        zzwz[] zzwzVarArr2 = new zzwz[length];
        int i = 0;
        while (true) {
            zzwz zzwzVar = null;
            if (i >= zzwzVarArr.length) {
                break;
            }
            zzuk[] zzukVarArr = this.zzd;
            zzuk zzukVar = (zzuk) zzwzVarArr[i];
            zzukVarArr[i] = zzukVar;
            if (zzukVar != null) {
                zzwzVar = zzukVar.zza;
            }
            zzwzVarArr2[i] = zzwzVar;
            i++;
        }
        long jZzf = this.zza.zzf(zzywVarArr, zArr, zzwzVarArr2, zArr2, j4);
        long jZzr = zzr(jZzf, j4, this.zzb);
        long j10 = -9223372036854775807L;
        if (zzq()) {
            if (jZzf < j4) {
                j10 = jZzr;
                break;
            }
            if (jZzf != 0) {
                for (zzyw zzywVar : zzywVarArr) {
                    if (zzywVar != null) {
                        zzz zzzVarZzb = zzywVar.zzb();
                        if (!zzay.zzf(zzzVarZzb.zzo, zzzVarZzb.zzk)) {
                            j10 = jZzr;
                            break;
                        }
                    }
                }
            }
        }
        this.zze = j10;
        for (int i10 = 0; i10 < zzwzVarArr.length; i10++) {
            zzwz zzwzVar2 = zzwzVarArr2[i10];
            if (zzwzVar2 == null) {
                this.zzd[i10] = null;
            } else {
                zzuk[] zzukVarArr2 = this.zzd;
                zzuk zzukVar2 = zzukVarArr2[i10];
                if (zzukVar2 == null || zzukVar2.zza != zzwzVar2) {
                    zzukVarArr2[i10] = new zzuk(this, zzwzVar2);
                }
            }
            zzwzVarArr[i10] = this.zzd[i10];
        }
        return jZzr;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final zzxk zzg() {
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzh(long j4, boolean z10) {
        this.zza.zzh(j4, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final /* bridge */ /* synthetic */ void zzi(zzxb zzxbVar) {
        zzve zzveVar = this.zzc;
        zzveVar.getClass();
        zzveVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzj() throws IOException {
        this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzk(zzvf zzvfVar) {
        zzve zzveVar = this.zzc;
        zzveVar.getClass();
        zzveVar.zzk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzl(zzve zzveVar, long j4) {
        this.zzc = zzveVar;
        this.zza.zzl(this, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final void zzm(long j4) {
        this.zza.zzm(j4);
    }

    public final void zzn(long j4, long j10) {
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzo(zzla zzlaVar) {
        return this.zza.zzo(zzlaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }
}
