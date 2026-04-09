package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzacx {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Removed duplicated region for block: B:144:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029c A[PHI: r1 r5 r8
  0x029c: PHI (r1v4 int) = (r1v3 int), (r1v55 int) binds: [B:176:0x029e, B:169:0x0281] A[DONT_GENERATE, DONT_INLINE]
  0x029c: PHI (r5v2 int) = (r5v1 int), (r5v20 int) binds: [B:176:0x029e, B:169:0x0281] A[DONT_GENERATE, DONT_INLINE]
  0x029c: PHI (r8v3 int) = (r8v2 int), (r8v33 int) binds: [B:176:0x029e, B:169:0x0281] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x034b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzz zza(com.google.android.gms.internal.ads.zzen r22, java.lang.String r23, java.lang.String r24, com.google.android.gms.internal.ads.zzs r25) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacx.zza(com.google.android.gms.internal.ads.zzen, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzs):com.google.android.gms.internal.ads.zzz");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzacv zzb(com.google.android.gms.internal.ads.zzem r11) {
        /*
            r0 = 16
            int r1 = r11.zzd(r0)
            int r0 = r11.zzd(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.zzd(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.zzd(r0)
            r2 = 0
            r4 = 3
            if (r1 != r4) goto L39
            r1 = r2
        L2c:
            int r5 = r11.zzd(r0)
            int r5 = r5 + r1
            boolean r1 = r11.zzp()
            if (r1 != 0) goto L3b
            int r1 = r5 + 3
        L39:
            r5 = r1
            goto L40
        L3b:
            int r5 = r5 + 1
            int r1 = r5 << 2
            goto L2c
        L40:
            r1 = 10
            int r1 = r11.zzd(r1)
            boolean r6 = r11.zzp()
            if (r6 == 0) goto L55
            int r6 = r11.zzd(r4)
            if (r6 <= 0) goto L55
            r11.zzn(r0)
        L55:
            boolean r6 = r11.zzp()
            r7 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            r10 = 1
            if (r10 == r6) goto L65
            r6 = r7
            r7 = r9
            goto L66
        L65:
            r6 = r7
        L66:
            int r11 = r11.zzd(r3)
            if (r7 != r9) goto L76
            r9 = 13
            if (r11 != r9) goto L76
            int[] r11 = com.google.android.gms.internal.ads.zzacx.zzb
            r2 = r11[r9]
        L74:
            r9 = r2
            goto La2
        L76:
            if (r7 != r6) goto L74
            r6 = 14
            if (r11 >= r6) goto L74
            int[] r2 = com.google.android.gms.internal.ads.zzacx.zzb
            r2 = r2[r11]
            int r1 = r1 % 5
            r6 = 8
            if (r1 == r10) goto L9d
            r9 = 11
            if (r1 == r0) goto L98
            if (r1 == r4) goto L9d
            if (r1 == r3) goto L8f
            goto L74
        L8f:
            if (r11 == r4) goto L95
            if (r11 == r6) goto L95
            if (r11 != r9) goto L74
        L95:
            int r2 = r2 + 1
            goto L74
        L98:
            if (r11 == r6) goto L95
            if (r11 != r9) goto L74
            goto L95
        L9d:
            if (r11 == r4) goto L95
            if (r11 != r6) goto L74
            goto L95
        La2:
            com.google.android.gms.internal.ads.zzacv r4 = new com.google.android.gms.internal.ads.zzacv
            r6 = 2
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacx.zzb(com.google.android.gms.internal.ads.zzem):com.google.android.gms.internal.ads.zzacv");
    }

    public static void zzc(int i, zzen zzenVar) {
        zzenVar.zzI(7);
        byte[] bArrZzN = zzenVar.zzN();
        bArrZzN[0] = -84;
        bArrZzN[1] = 64;
        bArrZzN[2] = -1;
        bArrZzN[3] = -1;
        bArrZzN[4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArrZzN[5] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArrZzN[6] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    private static void zzd(zzem zzemVar, zzacu zzacuVar) throws zzaz {
        int iZzd = zzemVar.zzd(5);
        zzemVar.zzn(2);
        if (zzemVar.zzp()) {
            zzemVar.zzn(5);
        }
        if (iZzd >= 7 && iZzd <= 10) {
            zzemVar.zzm();
        }
        if (zzemVar.zzp()) {
            int iZzd2 = zzemVar.zzd(3);
            if (zzacuVar.zzb == -1 && iZzd >= 0 && iZzd <= 15 && (iZzd2 == 0 || iZzd2 == 1)) {
                zzacuVar.zzb = iZzd;
            }
            if (zzemVar.zzp()) {
                zzf(zzemVar);
            }
        }
    }

    private static void zze(zzem zzemVar, zzacu zzacuVar) throws zzaz {
        zzemVar.zzn(2);
        boolean zZzp = zzemVar.zzp();
        int iZzd = zzemVar.zzd(8);
        for (int i = 0; i < iZzd; i++) {
            zzemVar.zzn(2);
            if (zzemVar.zzp()) {
                zzemVar.zzn(5);
            }
            if (zZzp) {
                zzemVar.zzn(24);
            } else {
                if (zzemVar.zzp()) {
                    if (!zzemVar.zzp()) {
                        zzemVar.zzn(4);
                    }
                    zzacuVar.zzc = zzemVar.zzd(6) + 1;
                }
                zzemVar.zzn(4);
            }
        }
        if (zzemVar.zzp()) {
            zzemVar.zzn(3);
            if (zzemVar.zzp()) {
                zzf(zzemVar);
            }
        }
    }

    private static void zzf(zzem zzemVar) throws zzaz {
        int iZzd = zzemVar.zzd(6);
        if (iZzd < 2 || iZzd > 42) {
            throw zzaz.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iZzd)));
        }
        zzemVar.zzn(iZzd * 8);
    }

    private static boolean zzg(zzem zzemVar) {
        if (zzemVar.zza() < 66) {
            return false;
        }
        zzemVar.zzn(66);
        return true;
    }
}
