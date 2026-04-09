package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class zzsy implements zzso {
    public zzsy(zzsx zzsxVar) {
    }

    public static int zza(int i10, int i11, int i12) {
        return zzgxz.zza(((i10 * i11) * i12) / 1000000);
    }

    public static final int zzb(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = 250000;
        if (i12 == 0) {
            int iZza = zza(250000, i14, i13);
            int iZza2 = zza(750000, i14, i13);
            String str = zzfj.zza;
            return Math.max(iZza, Math.min(i10 * 4, iZza2));
        }
        if (i12 == 1) {
            return zzgxz.zza((zzc(i11) * 50000000) / 1000000);
        }
        if (i11 == 5) {
            i16 = 500000;
        } else if (i11 == 8) {
            i16 = 1000000;
            i11 = 8;
        }
        return zzgxz.zza((i16 * (i15 != -1 ? zzgxs.zzb(i15, 8, RoundingMode.CEILING) : zzc(i11))) / 1000000);
    }

    private static int zzc(int i10) {
        int iZzf = zzaey.zzf(i10);
        zzgrc.zzi(iZzf != -2147483647);
        return iZzf;
    }
}
