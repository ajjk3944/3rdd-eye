package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfv {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i, int i10, boolean[] zArr) {
        int i11 = i10 - i;
        zzdd.zzf(i11 >= 0);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            zzi(zArr);
            return i - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i] == 1) {
            zzi(zArr);
            return i - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            zzi(zArr);
            return i - 1;
        }
        int i12 = i10 - 1;
        int i13 = i + 2;
        while (i13 < i12) {
            byte b10 = bArr[i13];
            if ((b10 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b10 == 1) {
                    zzi(zArr);
                    return i14;
                }
                i13 = i14;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static int zzb(zzz zzzVar) {
        String str = zzzVar.zzo;
        if (Objects.equals(str, "video/avc")) {
            return 1;
        }
        return (Objects.equals(str, "video/hevc") || zzay.zzg(zzzVar.zzk, "video/hevc")) ? 2 : 0;
    }

    public static int zzc(byte[] bArr, int i) {
        int i10;
        synchronized (zzc) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i) {
                while (true) {
                    try {
                        if (i11 >= i - 2) {
                            i11 = i;
                            break;
                        }
                        int i13 = i11 + 1;
                        if (bArr[i11] == 0 && bArr[i13] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11 = i13;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i11 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i12) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i - i12;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = zzd[i16] - i14;
                System.arraycopy(bArr, i14, bArr, i15, i17);
                int i18 = i15 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i15 = i18 + 2;
                bArr[i19] = 0;
                i14 += i17 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i15, i10 - i15);
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzfp zzd(byte[] r36, int r37, int r38, com.google.android.gms.internal.ads.zzfs r39) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfv.zzd(byte[], int, int, com.google.android.gms.internal.ads.zzfs):com.google.android.gms.internal.ads.zzfp");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x05f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzfs zze(byte[] r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 2155
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfv.zze(byte[], int, int):com.google.android.gms.internal.ads.zzfs");
    }

    public static zzft zzf(byte[] bArr, int i, int i10) {
        zzfw zzfwVar = new zzfw(bArr, 4, i10);
        int iZzc = zzfwVar.zzc();
        int iZzc2 = zzfwVar.zzc();
        zzfwVar.zze();
        return new zzft(iZzc, iZzc2, zzfwVar.zzh());
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c A[PHI: r2
  0x016c: PHI (r2v6 int) = (r2v4 int), (r2v3 int) binds: [B:87:0x0171, B:83:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016f A[PHI: r2
  0x016f: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v7 int) binds: [B:74:0x0156, B:76:0x015a, B:78:0x015e, B:80:0x0162, B:82:0x0166, B:84:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzfu zzg(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfv.zzg(byte[], int, int):com.google.android.gms.internal.ads.zzfu");
    }

    public static String zzh(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i10 = zzfyf.zzd;
                zzfyc zzfycVar = new zzfyc();
                int i11 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i11 >= length2) {
                        break;
                    }
                    int iZza = zza(bArr, i11, length2, zArr);
                    if (iZza != length2) {
                        zzfycVar.zzf(Integer.valueOf(iZza));
                    }
                    i11 = iZza + 3;
                }
                zzfyf zzfyfVarZzi = zzfycVar.zzi();
                for (int i12 = 0; i12 < zzfyfVarZzi.size(); i12++) {
                    if (((Integer) zzfyfVarZzi.get(i12)).intValue() + 3 < length) {
                        zzfw zzfwVar = new zzfw(bArr, ((Integer) zzfyfVarZzi.get(i12)).intValue() + 3, length);
                        zzfj zzfjVarZzm = zzm(zzfwVar);
                        if (zzfjVarZzm.zza == 33 && zzfjVarZzm.zzb == 0) {
                            zzfwVar.zzf(4);
                            int iZza2 = zzfwVar.zza(3);
                            zzfwVar.zze();
                            zzfk zzfkVarZzn = zzn(zzfwVar, true, iZza2, null);
                            return zzdk.zzd(zzfkVarZzn.zza, zzfkVarZzn.zzb, zzfkVarZzn.zzc, zzfkVarZzn.zzd, zzfkVarZzn.zze, zzfkVarZzn.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void zzi(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean zzj(byte[] bArr, int i, int i10, zzz zzzVar) {
        String str = zzzVar.zzo;
        if (Objects.equals(str, "video/avc")) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) != 0) {
                return true;
            }
            int i11 = b10 & 31;
            return (i11 == 1 || i11 == 9 || i11 == 14) ? false : true;
        }
        if (Objects.equals(str, "video/hevc")) {
            zzfj zzfjVarZzm = zzm(new zzfw(bArr, 4, i10 + 4));
            int i12 = zzfjVarZzm.zza;
            if (i12 == 35) {
                return false;
            }
            return (i12 <= 14 && i12 % 2 == 0 && zzfjVarZzm.zzc == zzzVar.zzF + (-1)) ? false : true;
        }
        return true;
    }

    private static int zzk(int i, int i10, int i11, int i12) {
        return i - ((i11 + i12) * (i10 == 1 ? 2 : 1));
    }

    private static int zzl(int i, int i10, int i11, int i12) {
        int i13 = 2;
        if (i10 != 1 && i10 != 2) {
            i13 = 1;
        }
        return i - ((i11 + i12) * i13);
    }

    private static zzfj zzm(zzfw zzfwVar) {
        zzfwVar.zze();
        return new zzfj(zzfwVar.zza(6), zzfwVar.zza(6), zzfwVar.zza(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzfk zzn(com.google.android.gms.internal.ads.zzfw r18, boolean r19, int r20, com.google.android.gms.internal.ads.zzfk r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L41
            r2 = 2
            int r2 = r0.zza(r2)
            boolean r7 = r0.zzh()
            r8 = 5
            int r8 = r0.zza(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.zzh()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.zza(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
        L3b:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L41:
            if (r2 == 0) goto L4f
            int r3 = r2.zza
            boolean r7 = r2.zzb
            int r8 = r2.zzc
            int r10 = r2.zzd
            int[] r4 = r2.zze
            r12 = r3
            goto L3b
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.zza(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.zzh()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.zzh()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.zzf(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.zzf(r5)
        L79:
            com.google.android.gms.internal.ads.zzfk r11 = new com.google.android.gms.internal.ads.zzfk
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfv.zzn(com.google.android.gms.internal.ads.zzfw, boolean, int, com.google.android.gms.internal.ads.zzfk):com.google.android.gms.internal.ads.zzfk");
    }

    private static void zzo(zzfw zzfwVar) {
        int iZzc = zzfwVar.zzc() + 1;
        zzfwVar.zzf(8);
        for (int i = 0; i < iZzc; i++) {
            zzfwVar.zzc();
            zzfwVar.zzc();
            zzfwVar.zze();
        }
        zzfwVar.zzf(20);
    }
}
