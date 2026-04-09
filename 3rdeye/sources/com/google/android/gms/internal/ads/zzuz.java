package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzuz implements zzvf, zzve {
    public final zzvh zza;
    private final long zzb;
    private zzvj zzc;
    private zzvf zzd;
    private zzve zze;
    private long zzf = -9223372036854775807L;
    private final zzzm zzg;

    public zzuz(zzvh zzvhVar, zzzm zzzmVar, long j4) {
        this.zza = zzvhVar;
        this.zzg = zzzmVar;
        this.zzb = j4;
    }

    private final long zzv(long j4) {
        long j10 = this.zzf;
        return j10 != -9223372036854775807L ? j10 : j4;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zza(long j4, zzmi zzmiVar) {
        zzvf zzvfVar = this.zzd;
        String str = zzex.zza;
        return zzvfVar.zza(j4, zzmiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzb() {
        zzvf zzvfVar = this.zzd;
        String str = zzex.zza;
        return zzvfVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzc() {
        zzvf zzvfVar = this.zzd;
        String str = zzex.zza;
        return zzvfVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzd() {
        zzvf zzvfVar = this.zzd;
        String str = zzex.zza;
        return zzvfVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zze(long j4) {
        zzvf zzvfVar = this.zzd;
        String str = zzex.zza;
        return zzvfVar.zze(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzf(zzyw[] zzywVarArr, boolean[] zArr, zzwz[] zzwzVarArr, boolean[] zArr2, long j4) {
        long j10 = this.zzf;
        long j11 = (j10 == -9223372036854775807L || j4 != this.zzb) ? j4 : j10;
        this.zzf = -9223372036854775807L;
        zzvf zzvfVar = this.zzd;
        String str = zzex.zza;
        return zzvfVar.zzf(zzywVarArr, zArr, zzwzVarArr, zArr2, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final zzxk zzg() {
        zzvf zzvfVar = this.zzd;
        String str = zzex.zza;
        return zzvfVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzh(long j4, boolean z10) {
        zzvf zzvfVar = this.zzd;
        String str = zzex.zza;
        zzvfVar.zzh(j4, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final /* bridge */ /* synthetic */ void zzi(zzxb zzxbVar) {
        zzve zzveVar = this.zze;
        String str = zzex.zza;
        zzveVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzj() throws IOException {
        zzvf zzvfVar = this.zzd;
        if (zzvfVar != null) {
            zzvfVar.zzj();
            return;
        }
        zzvj zzvjVar = this.zzc;
        if (zzvjVar != null) {
            zzvjVar.zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzk(zzvf zzvfVar) {
        zzve zzveVar = this.zze;
        String str = zzex.zza;
        zzveVar.zzk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzl(zzve zzveVar, long j4) {
        this.zze = zzveVar;
        zzvf zzvfVar = this.zzd;
        if (zzvfVar != null) {
            zzvfVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final void zzm(long j4) {
        zzvf zzvfVar = this.zzd;
        String str = zzex.zza;
        zzvfVar.zzm(j4);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzo(zzla zzlaVar) {
        zzvf zzvfVar = this.zzd;
        return zzvfVar != null && zzvfVar.zzo(zzlaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzp() {
        zzvf zzvfVar = this.zzd;
        return zzvfVar != null && zzvfVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzvh zzvhVar) {
        long jZzv = zzv(this.zzb);
        zzvj zzvjVar = this.zzc;
        zzvjVar.getClass();
        zzvf zzvfVarZzI = zzvjVar.zzI(zzvhVar, this.zzg, jZzv);
        this.zzd = zzvfVarZzI;
        if (this.zze != null) {
            zzvfVarZzI.zzl(this, jZzv);
        }
    }

    public final void zzs(long j4) {
        this.zzf = j4;
    }

    public final void zzt() {
        zzvf zzvfVar = this.zzd;
        if (zzvfVar != null) {
            zzvj zzvjVar = this.zzc;
            zzvjVar.getClass();
            zzvjVar.zzG(zzvfVar);
        }
    }

    public final void zzu(zzvj zzvjVar) {
        zzdd.zzf(this.zzc == null);
        this.zzc = zzvjVar;
    }
}
