package com.google.android.gms.internal.ads;

import N7.C1094a9;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaem {
    private static final String[] zza = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] zzb = {44100, 48000, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] zze = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] zzf = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] zzg = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zzb(int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!zzm(i) || (i10 = (i >>> 19) & 3) == 1 || (i11 = (i >>> 17) & 3) == 0 || (i12 = (i >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = i12 - 1;
        int i15 = zzb[i13];
        if (i10 == 2) {
            i15 /= 2;
        } else if (i10 == 0) {
            i15 /= 4;
        }
        int i16 = (i >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? zzc[i14] : zzd[i14]) * 12) / i15) + i16) * 4;
        }
        int i17 = i10 == 3 ? i11 == 2 ? zze[i14] : zzf[i14] : zzg[i14];
        if (i10 == 3) {
            return C1094a9.d(i17, 144, i15, i16);
        }
        return C1094a9.d(i11 == 1 ? 72 : 144, i17, i15, i16);
    }

    public static int zzc(int i) {
        int i10;
        int i11;
        if (!zzm(i) || (i10 = (i >>> 19) & 3) == 1 || (i11 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i12 = i >>> 12;
        int i13 = (i >>> 10) & 3;
        int i14 = i12 & 15;
        if (i14 == 0 || i14 == 15 || i13 == 3) {
            return -1;
        }
        return zzl(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i, int i10) {
        return i10 != 1 ? i10 != 2 ? 384 : 1152 : i == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzm(int i) {
        return (i & (-2097152)) == -2097152;
    }
}
