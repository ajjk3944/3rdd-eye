package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzls {
    private static final zzvh zzu = new zzvh(new Object(), -1);
    public final zzbl zza;
    public final zzvh zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzin zzf;
    public final boolean zzg;
    public final zzxk zzh;
    public final zzze zzi;
    public final List zzj;
    public final zzvh zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzbb zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzls(zzbl zzblVar, zzvh zzvhVar, long j4, long j10, int i, zzin zzinVar, boolean z10, zzxk zzxkVar, zzze zzzeVar, List list, zzvh zzvhVar2, boolean z11, int i10, int i11, zzbb zzbbVar, long j11, long j12, long j13, long j14, boolean z12) {
        this.zza = zzblVar;
        this.zzb = zzvhVar;
        this.zzc = j4;
        this.zzd = j10;
        this.zze = i;
        this.zzf = zzinVar;
        this.zzg = z10;
        this.zzh = zzxkVar;
        this.zzi = zzzeVar;
        this.zzj = list;
        this.zzk = zzvhVar2;
        this.zzl = z11;
        this.zzm = i10;
        this.zzn = i11;
        this.zzo = zzbbVar;
        this.zzq = j11;
        this.zzr = j12;
        this.zzs = j13;
        this.zzt = j14;
    }

    public static zzls zzh(zzze zzzeVar) {
        zzbl zzblVar = zzbl.zza;
        zzvh zzvhVar = zzu;
        return new zzls(zzblVar, zzvhVar, -9223372036854775807L, 0L, 1, null, false, zzxk.zza, zzzeVar, zzfyf.zzn(), zzvhVar, false, 1, 0, zzbb.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzvh zzi() {
        return zzu;
    }

    public final zzls zza(boolean z10) {
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z10, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzls zzb(zzvh zzvhVar) {
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzvhVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzls zzc(zzvh zzvhVar, long j4, long j10, long j11, long j12, zzxk zzxkVar, zzze zzzeVar, List list) {
        zzvh zzvhVar2 = this.zzk;
        boolean z10 = this.zzl;
        int i = this.zzm;
        int i10 = this.zzn;
        zzbb zzbbVar = this.zzo;
        long j13 = this.zzq;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzls(this.zza, zzvhVar, j10, j11, this.zze, this.zzf, this.zzg, zzxkVar, zzzeVar, list, zzvhVar2, z10, i, i10, zzbbVar, j13, j12, j4, jElapsedRealtime, false);
    }

    public final zzls zzd(boolean z10, int i, int i10) {
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z10, i, i10, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzls zze(zzin zzinVar) {
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzinVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzls zzf(int i) {
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzls zzg(zzbl zzblVar) {
        return new zzls(zzblVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
