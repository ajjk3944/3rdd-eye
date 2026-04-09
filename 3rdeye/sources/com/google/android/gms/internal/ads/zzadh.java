package com.google.android.gms.internal.ads;

import B4.f;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzadh implements zzaes {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzadh(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String string = Arrays.toString(this.zzb);
        String string2 = Arrays.toString(jArr3);
        String string3 = Arrays.toString(jArr2);
        String string4 = Arrays.toString(jArr);
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(this.zza);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        com.google.android.gms.measurement.internal.a.l(sb, string2, ", timeUs=", string3, ", durationsUs=");
        return f.c(sb, string4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j4) {
        long[] jArr = this.zze;
        int iZzd = zzex.zzd(jArr, j4, true, true);
        long j10 = jArr[iZzd];
        long[] jArr2 = this.zzc;
        zzaet zzaetVar = new zzaet(j10, jArr2[iZzd]);
        if (zzaetVar.zzb >= j4 || iZzd == this.zza - 1) {
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
