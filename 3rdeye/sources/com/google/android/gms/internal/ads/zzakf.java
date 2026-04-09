package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
abstract class zzakf {
    private zzaez zzb;
    private zzadw zzc;
    private zzaka zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzajy zza = new zzajy();
    private zzakc zzj = new zzakc();

    public abstract long zza(zzen zzenVar);

    public void zzb(boolean z10) {
        int i;
        if (z10) {
            this.zzj = new zzakc();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    public abstract boolean zzc(zzen zzenVar, long j4, zzakc zzakcVar) throws IOException;

    public final int zze(zzadu zzaduVar, zzaep zzaepVar) throws IOException {
        zzdd.zzb(this.zzb);
        String str = zzex.zza;
        int i = this.zzh;
        if (i != 0) {
            if (i == 1) {
                zzaduVar.zzk((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
            if (i != 2) {
                return -1;
            }
            long jZzd = this.zzd.zzd(zzaduVar);
            if (jZzd >= 0) {
                zzaepVar.zza = jZzd;
                return 1;
            }
            if (jZzd < -1) {
                zzi(-(jZzd + 2));
            }
            if (!this.zzl) {
                zzaes zzaesVarZze = this.zzd.zze();
                zzdd.zzb(zzaesVarZze);
                this.zzc.zzP(zzaesVarZze);
                this.zzb.zzl(zzaesVarZze.zza());
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zze(zzaduVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzen zzenVarZza = this.zza.zza();
            long jZza = zza(zzenVarZza);
            if (jZza >= 0) {
                long j4 = this.zzg;
                if (j4 + jZza >= this.zze) {
                    long jZzf = zzf(j4);
                    this.zzb.zzr(zzenVarZza, zzenVarZza.zzd());
                    this.zzb.zzt(jZzf, 1, zzenVarZza.zzd(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += jZza;
            return 0;
        }
        while (true) {
            zzajy zzajyVar = this.zza;
            if (!zzajyVar.zze(zzaduVar)) {
                this.zzh = 3;
                return -1;
            }
            long jZzf2 = zzaduVar.zzf();
            long j10 = this.zzf;
            this.zzk = jZzf2 - j10;
            if (!zzc(zzajyVar.zza(), j10, this.zzj)) {
                zzz zzzVar = this.zzj.zza;
                this.zzi = zzzVar.zzH;
                if (!this.zzm) {
                    this.zzb.zzm(zzzVar);
                    this.zzm = true;
                }
                zzaka zzakaVar = this.zzj.zzb;
                if (zzakaVar != null) {
                    this.zzd = zzakaVar;
                } else if (zzaduVar.zzd() == -1) {
                    this.zzd = new zzakd(null);
                } else {
                    zzajz zzajzVarZzb = zzajyVar.zzb();
                    this.zzd = new zzaju(this, this.zzf, zzaduVar.zzd(), zzajzVarZzb.zzd + zzajzVarZzb.zze, zzajzVarZzb.zzb, (zzajzVarZzb.zza & 4) != 0);
                }
                this.zzh = 2;
                zzajyVar.zzd();
                return 0;
            }
            this.zzf = zzaduVar.zzf();
        }
    }

    public final long zzf(long j4) {
        return (j4 * 1000000) / this.zzi;
    }

    public final long zzg(long j4) {
        return (this.zzi * j4) / 1000000;
    }

    public final void zzh(zzadw zzadwVar, zzaez zzaezVar) {
        this.zzc = zzadwVar;
        this.zzb = zzaezVar;
        zzb(true);
    }

    public void zzi(long j4) {
        this.zzg = j4;
    }

    public final void zzj(long j4, long j10) {
        this.zza.zzc();
        if (j4 == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long jZzg = zzg(j10);
            this.zze = jZzg;
            zzaka zzakaVar = this.zzd;
            String str = zzex.zza;
            zzakaVar.zzg(jZzg);
            this.zzh = 2;
        }
    }
}
