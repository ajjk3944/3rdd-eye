package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzadf {
    protected final zzacz zza;
    protected final zzade zzb;
    protected zzadb zzc;
    private final int zzd;

    public zzadf(zzadc zzadcVar, zzade zzadeVar, long j4, long j10, long j11, long j12, long j13, long j14, int i) {
        this.zzb = zzadeVar;
        this.zzd = i;
        this.zza = new zzacz(zzadcVar, j4, 0L, j11, j12, j13, j14);
    }

    public static final int zzf(zzadu zzaduVar, long j4, zzaep zzaepVar) {
        if (j4 == zzaduVar.zzf()) {
            return 0;
        }
        zzaepVar.zza = j4;
        return 1;
    }

    public static final boolean zzg(zzadu zzaduVar, long j4) throws IOException {
        long jZzf = j4 - zzaduVar.zzf();
        if (jZzf < 0 || jZzf > 262144) {
            return false;
        }
        zzaduVar.zzk((int) jZzf);
        return true;
    }

    public final int zza(zzadu zzaduVar, zzaep zzaepVar) throws IOException {
        while (true) {
            zzadb zzadbVar = this.zzc;
            zzdd.zzb(zzadbVar);
            long j4 = zzadbVar.zzf;
            long j10 = zzadbVar.zzg;
            long j11 = zzadbVar.zzh;
            if (j10 - j4 <= this.zzd) {
                zzc(false, j4);
                return zzf(zzaduVar, j4, zzaepVar);
            }
            if (!zzg(zzaduVar, j11)) {
                return zzf(zzaduVar, j11, zzaepVar);
            }
            zzaduVar.zzj();
            zzadd zzaddVarZza = this.zzb.zza(zzaduVar, zzadbVar.zzb);
            int i = zzaddVarZza.zzb;
            if (i == -3) {
                zzc(false, j11);
                return zzf(zzaduVar, j11, zzaepVar);
            }
            if (i == -2) {
                zzadb.zzh(zzadbVar, zzaddVarZza.zzc, zzaddVarZza.zzd);
            } else {
                if (i != -1) {
                    zzg(zzaduVar, zzaddVarZza.zzd);
                    zzc(true, zzaddVarZza.zzd);
                    return zzf(zzaduVar, zzaddVarZza.zzd, zzaepVar);
                }
                zzadb.zzg(zzadbVar, zzaddVarZza.zzc, zzaddVarZza.zzd);
            }
        }
    }

    public final zzaes zzb() {
        return this.zza;
    }

    public final void zzc(boolean z10, long j4) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j4) {
        zzadb zzadbVar = this.zzc;
        if (zzadbVar == null || zzadbVar.zza != j4) {
            zzacz zzaczVar = this.zza;
            this.zzc = new zzadb(j4, zzaczVar.zzf(j4), 0L, zzaczVar.zzc, zzaczVar.zzd, zzaczVar.zze, zzaczVar.zzf);
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
