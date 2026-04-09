package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzabw {
    private final zzabr zza;
    private long zzj;
    private final zzaap zzk;
    private final zzabp zzb = new zzabp();
    private final zzet zzc = new zzet(10);
    private final zzet zzd = new zzet(10);
    private final zzec zze = new zzec(16);
    private long zzf = -9223372036854775807L;
    private zzcd zzi = zzcd.zza;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;

    public zzabw(zzaap zzaapVar, zzabr zzabrVar) {
        this.zzk = zzaapVar;
        this.zza = zzabrVar;
    }

    private static Object zzh(zzet zzetVar) {
        zzdd.zzd(zzetVar.zza() > 0);
        while (zzetVar.zza() > 1) {
            zzetVar.zzb();
        }
        Object objZzb = zzetVar.zzb();
        objZzb.getClass();
        return objZzb;
    }

    public final void zza() {
        this.zze.zzd();
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        zzet zzetVar = this.zzd;
        if (zzetVar.zza() > 0) {
            this.zzj = ((Long) zzh(zzetVar)).longValue();
        }
        zzet zzetVar2 = this.zzc;
        if (zzetVar2.zza() > 0) {
            zzetVar2.zzd(0L, (zzcd) zzh(zzetVar2));
        }
    }

    public final void zzb(long j4) {
        this.zze.zzc(j4);
        this.zzf = j4;
        this.zzh = -9223372036854775807L;
    }

    public final void zzc(int i, long j4) {
        if (this.zze.zze()) {
            this.zza.zzf(i);
            this.zzj = j4;
        } else {
            zzet zzetVar = this.zzd;
            long j10 = this.zzf;
            zzetVar.zzd(j10 == -9223372036854775807L ? -4611686018427387904L : j10 + 1, Long.valueOf(j4));
        }
    }

    public final void zzd(int i, int i10) {
        long j4 = this.zzf;
        this.zzc.zzd(j4 == -9223372036854775807L ? 0L : j4 + 1, new zzcd(i, i10, 1.0f));
    }

    public final void zze(long j4, long j10) throws zzin {
        while (true) {
            zzec zzecVar = this.zze;
            if (zzecVar.zze()) {
                return;
            }
            zzet zzetVar = this.zzd;
            long jZza = zzecVar.zza();
            Long l5 = (Long) zzetVar.zzc(jZza);
            if (l5 != null && l5.longValue() != this.zzj) {
                this.zzj = l5.longValue();
                this.zza.zzf(2);
            }
            zzabr zzabrVar = this.zza;
            long j11 = this.zzj;
            zzabp zzabpVar = this.zzb;
            int iZza = zzabrVar.zza(jZza, j4, j10, j11, false, false, zzabpVar);
            if (iZza == 0 || iZza == 1) {
                this.zzg = jZza;
                long jZzb = zzecVar.zzb();
                zzcd zzcdVar = (zzcd) this.zzc.zzc(jZzb);
                if (zzcdVar != null && !zzcdVar.equals(zzcd.zza) && !zzcdVar.equals(this.zzi)) {
                    this.zzi = zzcdVar;
                    this.zzk.zza(zzcdVar);
                }
                this.zzk.zzb(iZza == 0 ? System.nanoTime() : zzabpVar.zzd(), jZzb, zzabrVar.zzn());
            } else if (iZza == 2 || iZza == 3) {
                this.zzg = jZza;
                zzecVar.zzb();
                final zzaap zzaapVar = this.zzk;
                zzaar zzaarVar = zzaapVar.zza;
                zzaarVar.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaan
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzaapVar.zza.zzg.zzc();
                    }
                });
                ((zzacl) zzaarVar.zzc.remove()).zzb();
            } else if (iZza != 4) {
                return;
            } else {
                this.zzg = jZza;
            }
        }
    }

    public final void zzf() {
        long j4 = this.zzf;
        if (j4 == -9223372036854775807L) {
            j4 = Long.MIN_VALUE;
            this.zzf = Long.MIN_VALUE;
            this.zzg = Long.MIN_VALUE;
        }
        this.zzh = j4;
    }

    public final boolean zzg() {
        long j4 = this.zzh;
        return j4 != -9223372036854775807L && this.zzg == j4;
    }
}
