package com.google.android.gms.internal.ads;

import androidx.work.s;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaif implements zzaie {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzaif(long[] jArr, long[] jArr2, long j4, long j10, long j11, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j4;
        this.zzd = j11;
        this.zze = i;
    }

    public static zzaif zzb(long j4, long j10, zzael zzaelVar, zzen zzenVar) {
        int iZzm;
        zzen zzenVar2 = zzenVar;
        zzenVar2.zzM(6);
        int iZzg = zzenVar2.zzg();
        long j11 = zzaelVar.zzc;
        long j12 = iZzg;
        if (zzenVar2.zzg() <= 0) {
            return null;
        }
        long jZzt = zzex.zzt((r4 * zzaelVar.zzg) - 1, zzaelVar.zzd);
        int iZzq = zzenVar2.zzq();
        int iZzq2 = zzenVar2.zzq();
        int iZzq3 = zzenVar2.zzq();
        zzenVar2.zzM(2);
        long[] jArr = new long[iZzq];
        long[] jArr2 = new long[iZzq];
        int i = 0;
        long j13 = j10 + zzaelVar.zzc;
        while (i < iZzq) {
            long j14 = j11;
            jArr[i] = (i * jZzt) / iZzq;
            jArr2[i] = j13;
            if (iZzq3 == 1) {
                iZzm = zzenVar2.zzm();
            } else if (iZzq3 == 2) {
                iZzm = zzenVar2.zzq();
            } else if (iZzq3 == 3) {
                iZzm = zzenVar2.zzo();
            } else {
                if (iZzq3 != 4) {
                    return null;
                }
                iZzm = zzenVar2.zzp();
            }
            j13 += iZzm * iZzq2;
            i++;
            zzenVar2 = zzenVar;
            iZzq = iZzq;
            j11 = j14;
        }
        long j15 = j10 + j11;
        long jMax = j15 + j12;
        if (j4 != -1 && j4 != jMax) {
            StringBuilder sbJ = s.j("VBRI data size mismatch: ", ", ", j4);
            sbJ.append(jMax);
            zzea.zzf("VbriSeeker", sbJ.toString());
        }
        if (jMax != j13) {
            StringBuilder sbJ2 = s.j("VBRI bytes and ToC mismatch (using max): ", ", ", jMax);
            sbJ2.append(j13);
            sbJ2.append("\nSeeking will be inaccurate.");
            zzea.zzf("VbriSeeker", sbJ2.toString());
            jMax = Math.max(jMax, j13);
        }
        return new zzaif(jArr, jArr2, jZzt, j15, jMax, zzaelVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaie
    public final long zze(long j4) {
        return this.zza[zzex.zzd(this.zzb, j4, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j4) {
        long[] jArr = this.zza;
        int iZzd = zzex.zzd(jArr, j4, true, true);
        long j10 = jArr[iZzd];
        long[] jArr2 = this.zzb;
        zzaet zzaetVar = new zzaet(j10, jArr2[iZzd]);
        if (zzaetVar.zzb >= j4 || iZzd == jArr.length - 1) {
            return new zzaeq(zzaetVar, zzaetVar);
        }
        int i = iZzd + 1;
        return new zzaeq(zzaetVar, new zzaet(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return true;
    }
}
