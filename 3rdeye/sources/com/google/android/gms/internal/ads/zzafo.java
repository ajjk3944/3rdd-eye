package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzafo {
    private final zzafn zza;
    private final zzaez zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private long[] zzm;
    private int[] zzn;

    public zzafo(int i, zzafn zzafnVar, zzaez zzaezVar) {
        this.zza = zzafnVar;
        int iZzb = zzafnVar.zzb();
        boolean z10 = true;
        if (iZzb != 1) {
            if (iZzb == 2) {
                iZzb = 2;
            } else {
                z10 = false;
            }
        }
        zzdd.zzd(z10);
        this.zzc = zzh(i, iZzb == 2 ? 1667497984 : 1651965952);
        this.zze = zzafnVar.zzc();
        this.zzb = zzaezVar;
        this.zzd = iZzb == 2 ? zzh(i, 1650720768) : -1;
        this.zzl = -1L;
        this.zzm = new long[AdRequest.MAX_CONTENT_URL_LENGTH];
        this.zzn = new int[AdRequest.MAX_CONTENT_URL_LENGTH];
        this.zzf = zzafnVar.zzd;
    }

    private static int zzh(int i, int i10) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i10;
    }

    private final long zzi(int i) {
        return (this.zze * i) / this.zzf;
    }

    private final zzaet zzj(int i) {
        return new zzaet(this.zzn[i] * zzi(1), this.zzm[i]);
    }

    public final zzaeq zza(long j4) {
        if (this.zzk == 0) {
            zzaet zzaetVar = new zzaet(0L, this.zzl);
            return new zzaeq(zzaetVar, zzaetVar);
        }
        int iZzi = (int) (j4 / zzi(1));
        int iZzc = zzex.zzc(this.zzn, iZzi, true, true);
        if (this.zzn[iZzc] == iZzi) {
            zzaet zzaetVarZzj = zzj(iZzc);
            return new zzaeq(zzaetVarZzj, zzaetVarZzj);
        }
        zzaet zzaetVarZzj2 = zzj(iZzc);
        int i = iZzc + 1;
        return i < this.zzm.length ? new zzaeq(zzaetVarZzj2, zzj(i)) : new zzaeq(zzaetVarZzj2, zzaetVarZzj2);
    }

    public final void zzb(long j4, boolean z10) {
        if (this.zzl == -1) {
            this.zzl = j4;
        }
        if (z10) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i = this.zzk;
            jArr2[i] = j4;
            this.zzn[i] = this.zzj;
            this.zzk = i + 1;
        }
        this.zzj++;
    }

    public final void zzc() {
        int i;
        this.zzm = Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) != 1651965952 || this.zza.zzf == 0 || (i = this.zzk) <= 0) {
            return;
        }
        this.zzf = i;
    }

    public final void zzd(int i) {
        this.zzg = i;
        this.zzh = i;
    }

    public final void zze(long j4) {
        if (this.zzk == 0) {
            this.zzi = 0;
        } else {
            this.zzi = this.zzn[zzex.zzd(this.zzm, j4, true, true)];
        }
    }

    public final boolean zzf(int i) {
        return this.zzc == i || this.zzd == i;
    }

    public final boolean zzg(zzadu zzaduVar) throws IOException {
        int i = this.zzh;
        zzaez zzaezVar = this.zzb;
        int iZzf = i - zzaezVar.zzf(zzaduVar, i, false);
        this.zzh = iZzf;
        boolean z10 = iZzf == 0;
        if (z10) {
            if (this.zzg > 0) {
                zzaezVar.zzt(zzi(this.zzi), Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, null);
            }
            this.zzi++;
        }
        return z10;
    }
}
