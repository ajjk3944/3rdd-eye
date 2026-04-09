package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzwq extends zzug implements zzwh {
    private final zzgi zza;
    private final zzsh zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzhj zzh;
    private zzap zzi;
    private final zzwn zzj;
    private final zzzq zzk;

    public /* synthetic */ zzwq(zzap zzapVar, zzgi zzgiVar, zzwn zzwnVar, zzsh zzshVar, zzzq zzzqVar, int i, int i10, zzz zzzVar, zzfvw zzfvwVar, zzwp zzwpVar) {
        this.zzi = zzapVar;
        this.zza = zzgiVar;
        this.zzj = zzwnVar;
        this.zzb = zzshVar;
        this.zzk = zzzqVar;
        this.zzc = i;
    }

    private final void zzw() {
        long j4 = this.zze;
        boolean z10 = this.zzf;
        boolean z11 = this.zzg;
        zzap zzapVarZzJ = zzJ();
        zzbl zzxdVar = new zzxd(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j4, j4, 0L, 0L, z10, false, false, null, zzapVarZzJ, z11 ? zzapVarZzJ.zzc : null);
        if (this.zzd) {
            zzxdVar = new zzwm(this, zzxdVar);
        }
        zzo(zzxdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzG(zzvf zzvfVar) {
        ((zzwl) zzvfVar).zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final zzvf zzI(zzvh zzvhVar, zzzm zzzmVar, long j4) {
        zzgj zzgjVarZza = this.zza.zza();
        zzhj zzhjVar = this.zzh;
        if (zzhjVar != null) {
            zzgjVarZza.zzf(zzhjVar);
        }
        zzak zzakVar = zzJ().zzb;
        zzakVar.getClass();
        Uri uri = zzakVar.zza;
        zzwn zzwnVar = this.zzj;
        zzb();
        return new zzwl(uri, zzgjVarZza, new zzuj(zzwnVar.zza), this.zzb, zzc(zzvhVar), this.zzk, zze(zzvhVar), this, zzzmVar, null, this.zzc, 0, null, zzex.zzs(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final synchronized zzap zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zza(long j4, zzaes zzaesVar, boolean z10) {
        if (j4 == -9223372036854775807L) {
            j4 = this.zze;
        }
        boolean zZzh = zzaesVar.zzh();
        if (!this.zzd && this.zze == j4 && this.zzf == zZzh && this.zzg == z10) {
            return;
        }
        this.zze = j4;
        this.zzf = zZzh;
        this.zzg = z10;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzn(zzhj zzhjVar) {
        this.zzh = zzhjVar;
        Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvj
    public final synchronized void zzt(zzap zzapVar) {
        this.zzi = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzz() {
    }
}
