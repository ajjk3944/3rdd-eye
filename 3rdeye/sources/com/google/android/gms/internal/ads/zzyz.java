package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzyz {
    private final int[] zza;
    private final zzxk[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzxk zze;

    public zzyz(String[] strArr, int[] iArr, zzxk[] zzxkVarArr, int[] iArr2, int[][][] iArr3, zzxk zzxkVar) {
        this.zza = iArr;
        this.zzb = zzxkVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzxkVar;
    }

    public final int zza(int i, int i10, boolean z10) {
        zzxk[] zzxkVarArr = this.zzb;
        int i11 = zzxkVarArr[i].zzb(i10).zza;
        int[] iArr = new int[i11];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if ((this.zzd[i][i10][i14] & 7) == 4) {
                iArr[i13] = i14;
                i13++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
        String str = null;
        int i15 = 0;
        int iMin = 16;
        boolean z11 = false;
        while (i12 < iArrCopyOf.length) {
            String str2 = zzxkVarArr[i].zzb(i10).zzb(iArrCopyOf[i12]).zzo;
            int i16 = i15 + 1;
            if (i15 == 0) {
                str = str2;
            } else {
                z11 |= !Objects.equals(str, str2);
            }
            iMin = Math.min(iMin, this.zzd[i][i10][i12] & 24);
            i12++;
            i15 = i16;
        }
        return z11 ? Math.min(iMin, this.zzc[i]) : iMin;
    }

    public final int zzb(int i, int i10, int i11) {
        return this.zzd[i][i10][i11];
    }

    public final int zzc(int i) {
        return this.zza[i];
    }

    public final zzxk zzd(int i) {
        return this.zzb[i];
    }

    public final zzxk zze() {
        return this.zze;
    }
}
