package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzahc {
    public static final zzaha zza = new Object() { // from class: com.google.android.gms.internal.ads.zzaha
    };

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.zzav zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzaha r13, com.google.android.gms.internal.ads.zzago r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahc.zza(byte[], int, com.google.android.gms.internal.ads.zzaha, com.google.android.gms.internal.ads.zzago):com.google.android.gms.internal.ads.zzav");
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i10) {
        int iZzd = zzd(bArr, i);
        if (i10 == 0 || i10 == 3) {
            return iZzd;
        }
        while (true) {
            int length = bArr.length;
            if (iZzd >= length - 1) {
                return length;
            }
            int i11 = iZzd + 1;
            if ((iZzd - i) % 2 == 0 && bArr[i11] == 0) {
                return iZzd;
            }
            iZzd = zzd(bArr, i11);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zze(zzen zzenVar, int i) {
        byte[] bArrZzN = zzenVar.zzN();
        int iZzc = zzenVar.zzc();
        int i10 = iZzc;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= iZzc + i) {
                return i;
            }
            if ((bArrZzN[i10] & 255) == 255 && bArrZzN[i11] == 0) {
                System.arraycopy(bArrZzN, i10 + 2, bArrZzN, i11, (i - (i10 - iZzc)) - 2);
                i--;
            }
            i10 = i11;
        }
    }

    private static zzfyf zzf(byte[] bArr, int i, int i10) {
        if (i10 >= bArr.length) {
            return zzfyf.zzo("");
        }
        int i11 = zzfyf.zzd;
        zzfyc zzfycVar = new zzfyc();
        int iZzc = zzc(bArr, i10, i);
        while (i10 < iZzc) {
            zzfycVar.zzf(new String(bArr, i10, iZzc - i10, zzi(i)));
            i10 = zzb(i) + iZzc;
            iZzc = zzc(bArr, i10, i);
        }
        zzfyf zzfyfVarZzi = zzfycVar.zzi();
        return zzfyfVarZzi.isEmpty() ? zzfyf.zzo("") : zzfyfVarZzi;
    }

    private static String zzg(byte[] bArr, int i, int i10, Charset charset) {
        return (i10 <= i || i10 > bArr.length) ? "" : new String(bArr, i, i10 - i, charset);
    }

    private static String zzh(int i, int i10, int i11, int i12, int i13) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    private static Charset zzi(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean zzj(com.google.android.gms.internal.ads.zzen r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r1.zzc()
        L8:
            int r3 = r1.zza()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La7
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r1.zzg()     // Catch: java.lang.Throwable -> L22
            long r8 = r1.zzu()     // Catch: java.lang.Throwable -> L22
            int r10 = r1.zzq()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lab
        L25:
            int r7 = r1.zzo()     // Catch: java.lang.Throwable -> L22
            int r8 = r1.zzo()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L22
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            goto La7
        L3b:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r24 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
        L48:
            r4 = r6
            goto La7
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L72
            goto L73
        L72:
            r4 = r6
        L73:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8d
        L7b:
            if (r0 != r3) goto L8b
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L89
            goto L8d
        L89:
            r4 = r6
            goto L8d
        L8b:
            r3 = r6
            r4 = r3
        L8d:
            if (r4 == 0) goto L91
            int r3 = r3 + 4
        L91:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L22
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L97
            goto L48
        L97:
            int r3 = r1.zza()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L22
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La1
            goto L48
        La1:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L22
            r1.zzM(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        La7:
            r1.zzL(r2)
            return r4
        Lab:
            r1.zzL(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahc.zzj(com.google.android.gms.internal.ads.zzen, int, int, boolean):boolean");
    }

    private static byte[] zzk(byte[] bArr, int i, int i10) {
        return i10 <= i ? zzex.zzb : Arrays.copyOfRange(bArr, i, i10);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a5 A[Catch: all -> 0x013e, Exception -> 0x0262, OutOfMemoryError -> 0x0267, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a5, B:167:0x02e5, B:169:0x02fb, B:164:0x02c7, B:166:0x02df, B:185:0x0329, B:192:0x036c, B:195:0x03a1, B:198:0x03b2, B:199:0x03ba, B:201:0x03c0, B:203:0x03c7, B:204:0x03cb, B:212:0x03ec, B:216:0x0417, B:218:0x0422, B:219:0x0458, B:220:0x0465, B:222:0x046b, B:224:0x0472, B:225:0x0476, B:229:0x048c, B:237:0x049f, B:239:0x04c9, B:240:0x04d8, B:241:0x04e3), top: B:254:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c7 A[Catch: all -> 0x013e, Exception -> 0x0262, OutOfMemoryError -> 0x0267, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a5, B:167:0x02e5, B:169:0x02fb, B:164:0x02c7, B:166:0x02df, B:185:0x0329, B:192:0x036c, B:195:0x03a1, B:198:0x03b2, B:199:0x03ba, B:201:0x03c0, B:203:0x03c7, B:204:0x03cb, B:212:0x03ec, B:216:0x0417, B:218:0x0422, B:219:0x0458, B:220:0x0465, B:222:0x046b, B:224:0x0472, B:225:0x0476, B:229:0x048c, B:237:0x049f, B:239:0x04c9, B:240:0x04d8, B:241:0x04e3), top: B:254:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0503  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzahd zzl(int r33, com.google.android.gms.internal.ads.zzen r34, boolean r35, int r36, com.google.android.gms.internal.ads.zzaha r37) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahc.zzl(int, com.google.android.gms.internal.ads.zzen, boolean, int, com.google.android.gms.internal.ads.zzaha):com.google.android.gms.internal.ads.zzahd");
    }
}
