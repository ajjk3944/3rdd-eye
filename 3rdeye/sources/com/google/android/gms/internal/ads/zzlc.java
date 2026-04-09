package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzlc {
    public final zzvf zza;
    public final Object zzb;
    public final zzwz[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzld zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzmd[] zzj;
    private final zzzd zzk;
    private final zzlr zzl;
    private zzlc zzm;
    private zzxk zzn;
    private zzze zzo;
    private long zzp;

    public zzlc(zzmd[] zzmdVarArr, long j4, zzzd zzzdVar, zzzm zzzmVar, zzlr zzlrVar, zzld zzldVar, zzze zzzeVar, long j10) {
        this.zzj = zzmdVarArr;
        this.zzp = j4;
        this.zzk = zzzdVar;
        this.zzl = zzlrVar;
        zzvh zzvhVar = zzldVar.zza;
        this.zzb = zzvhVar.zza;
        this.zzg = zzldVar;
        this.zzn = zzxk.zza;
        this.zzo = zzzeVar;
        this.zzc = new zzwz[2];
        this.zzi = new boolean[2];
        long j11 = zzldVar.zzb;
        long j12 = zzldVar.zzd;
        zzvf zzvfVarZzp = zzlrVar.zzp(zzvhVar, zzzmVar, j11);
        this.zza = j12 != -9223372036854775807L ? new zzul(zzvfVarZzp, true, 0L, j12) : zzvfVarZzp;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            zzze zzzeVar = this.zzo;
            if (i >= zzzeVar.zza) {
                return;
            }
            zzzeVar.zzb(i);
            zzyw zzywVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            zzze zzzeVar = this.zzo;
            if (i >= zzzeVar.zza) {
                return;
            }
            zzzeVar.zzb(i);
            zzyw zzywVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza(zzze zzzeVar, long j4, boolean z10) {
        return zzb(zzzeVar, j4, false, new boolean[2]);
    }

    public final long zzb(zzze zzzeVar, long j4, boolean z10, boolean[] zArr) {
        zzmd[] zzmdVarArr;
        int i = 0;
        while (true) {
            boolean z11 = true;
            if (i >= zzzeVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z10 || !zzzeVar.zza(this.zzo, i)) {
                z11 = false;
            }
            zArr2[i] = z11;
            i++;
        }
        int i10 = 0;
        while (true) {
            zzmdVarArr = this.zzj;
            if (i10 >= 2) {
                break;
            }
            zzmdVarArr[i10].zzb();
            i10++;
        }
        zzu();
        this.zzo = zzzeVar;
        zzv();
        zzvf zzvfVar = this.zza;
        zzyw[] zzywVarArr = zzzeVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzwz[] zzwzVarArr = this.zzc;
        long jZzf = zzvfVar.zzf(zzywVarArr, zArr3, zzwzVarArr, zArr, j4);
        for (int i11 = 0; i11 < 2; i11++) {
            zzmdVarArr[i11].zzb();
        }
        this.zzf = false;
        for (int i12 = 0; i12 < 2; i12++) {
            if (zzwzVarArr[i12] != null) {
                zzdd.zzf(zzzeVar.zzb(i12));
                zzmdVarArr[i12].zzb();
                this.zzf = true;
            } else {
                zzdd.zzf(zzywVarArr[i12] == null);
            }
        }
        return jZzf;
    }

    public final long zzc() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long jZzb = this.zzf ? this.zza.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.zzg.zze : jZzb;
    }

    public final long zzd() {
        if (this.zze) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzp;
    }

    public final long zzf() {
        return this.zzg.zzb + this.zzp;
    }

    public final zzlc zzg() {
        return this.zzm;
    }

    public final zzxk zzh() {
        return this.zzn;
    }

    public final zzze zzi() {
        return this.zzo;
    }

    public final zzze zzj(float f10, zzbl zzblVar, boolean z10) throws zzin {
        zzxk zzxkVar = this.zzn;
        zzvh zzvhVar = this.zzg.zza;
        zzzd zzzdVar = this.zzk;
        zzmd[] zzmdVarArr = this.zzj;
        zzze zzzeVarZzo = zzzdVar.zzo(zzmdVarArr, zzxkVar, zzvhVar, zzblVar);
        for (int i = 0; i < zzzeVarZzo.zza; i++) {
            if (zzzeVarZzo.zzb(i)) {
                if (zzzeVarZzo.zzc[i] == null) {
                    zzmdVarArr[i].zzb();
                    z = false;
                }
                zzdd.zzf(z);
            } else {
                zzdd.zzf(zzzeVarZzo.zzc[i] == null);
            }
        }
        for (zzyw zzywVar : zzzeVarZzo.zzc) {
        }
        return zzzeVarZzo;
    }

    public final void zzk(zzla zzlaVar) {
        zzdd.zzf(zzw());
        this.zza.zzo(zzlaVar);
    }

    public final void zzl(float f10, zzbl zzblVar, boolean z10) throws zzin {
        this.zze = true;
        this.zzn = this.zza.zzg();
        zzze zzzeVarZzj = zzj(f10, zzblVar, z10);
        zzld zzldVar = this.zzg;
        long jMax = zzldVar.zzb;
        long j4 = zzldVar.zze;
        if (j4 != -9223372036854775807L && jMax >= j4) {
            jMax = Math.max(0L, j4 - 1);
        }
        long jZza = zza(zzzeVarZzj, jMax, false);
        long j10 = this.zzp;
        zzld zzldVar2 = this.zzg;
        this.zzp = (zzldVar2.zzb - jZza) + j10;
        this.zzg = zzldVar2.zzb(jZza);
    }

    public final void zzm(zzve zzveVar, long j4) {
        this.zzd = true;
        this.zza.zzl(zzveVar, j4);
    }

    public final void zzn(long j4) {
        zzdd.zzf(zzw());
        if (this.zze) {
            this.zza.zzm(j4 - this.zzp);
        }
    }

    public final void zzo() {
        zzu();
        zzvf zzvfVar = this.zza;
        try {
            boolean z10 = zzvfVar instanceof zzul;
            zzlr zzlrVar = this.zzl;
            if (z10) {
                zzlrVar.zzi(((zzul) zzvfVar).zza);
            } else {
                zzlrVar.zzi(zzvfVar);
            }
        } catch (RuntimeException e4) {
            zzea.zzd("MediaPeriodHolder", "Period release failed.", e4);
        }
    }

    public final void zzp(zzlc zzlcVar) {
        if (zzlcVar == this.zzm) {
            return;
        }
        zzu();
        this.zzm = zzlcVar;
        zzv();
    }

    public final void zzq(long j4) {
        this.zzp = j4;
    }

    public final void zzr() {
        zzvf zzvfVar = this.zza;
        if (zzvfVar instanceof zzul) {
            long j4 = this.zzg.zzd;
            if (j4 == -9223372036854775807L) {
                j4 = Long.MIN_VALUE;
            }
            ((zzul) zzvfVar).zzn(0L, j4);
        }
    }

    public final boolean zzs() {
        if (this.zze) {
            return !this.zzf || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zzt() {
        if (this.zze) {
            return zzs() || zzc() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }
}
