package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzxh implements zzvf, zzve {
    private final zzvf zza;
    private final long zzb;
    private zzve zzc;

    public zzxh(zzvf zzvfVar, long j4) {
        this.zza = zzvfVar;
        this.zzb = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zza(long j4, zzmi zzmiVar) {
        long j10 = this.zzb;
        return this.zza.zza(j4 - j10, zzmiVar) + j10;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzd() {
        long jZzd = this.zza.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zze(long j4) {
        long j10 = this.zzb;
        return this.zza.zze(j4 - j10) + j10;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzf(zzyw[] zzywVarArr, boolean[] zArr, zzwz[] zzwzVarArr, boolean[] zArr2, long j4) {
        zzwz[] zzwzVarArr2 = new zzwz[zzwzVarArr.length];
        int i = 0;
        while (true) {
            zzwz zzwzVarZzc = null;
            if (i >= zzwzVarArr.length) {
                break;
            }
            zzxg zzxgVar = (zzxg) zzwzVarArr[i];
            if (zzxgVar != null) {
                zzwzVarZzc = zzxgVar.zzc();
            }
            zzwzVarArr2[i] = zzwzVarZzc;
            i++;
        }
        zzvf zzvfVar = this.zza;
        long j10 = this.zzb;
        long jZzf = zzvfVar.zzf(zzywVarArr, zArr, zzwzVarArr2, zArr2, j4 - j10);
        for (int i10 = 0; i10 < zzwzVarArr.length; i10++) {
            zzwz zzwzVar = zzwzVarArr2[i10];
            if (zzwzVar == null) {
                zzwzVarArr[i10] = null;
            } else {
                zzwz zzwzVar2 = zzwzVarArr[i10];
                if (zzwzVar2 == null || ((zzxg) zzwzVar2).zzc() != zzwzVar) {
                    zzwzVarArr[i10] = new zzxg(zzwzVar, j10);
                }
            }
        }
        return jZzf + j10;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final zzxk zzg() {
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzh(long j4, boolean z10) {
        this.zza.zzh(j4 - this.zzb, false);
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
        this.zza.zzl(this, j4 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final void zzm(long j4) {
        this.zza.zzm(j4 - this.zzb);
    }

    public final zzvf zzn() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzo(zzla zzlaVar) {
        long j4 = zzlaVar.zza;
        long j10 = this.zzb;
        zzky zzkyVarZza = zzlaVar.zza();
        zzkyVarZza.zze(j4 - j10);
        return this.zza.zzo(zzkyVarZza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
