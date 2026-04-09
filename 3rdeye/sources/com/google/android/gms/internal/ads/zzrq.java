package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzrq implements zzra {
    public zzrq(zzrp zzrpVar) {
    }

    public static int zza(int i, int i10, int i11) {
        return zzgbi.zzb(((i * i10) * i11) / 1000000);
    }

    public static final int zzb(int i, int i10, int i11, int i12, int i13, int i14) {
        int i15 = 250000;
        if (i11 == 0) {
            int iZza = zza(250000, i13, i12);
            int iZza2 = zza(750000, i13, i12);
            String str = zzex.zza;
            return Math.max(iZza, Math.min(i * 4, iZza2));
        }
        if (i11 == 1) {
            return zzgbi.zzb((zzc(i10) * 50000000) / 1000000);
        }
        if (i10 == 5) {
            i15 = 500000;
        } else if (i10 == 8) {
            i15 = 1000000;
            i10 = 8;
        }
        return zzgbi.zzb((i15 * (i14 != -1 ? zzgbb.zzb(i14, 8, RoundingMode.CEILING) : zzc(i10))) / 1000000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int zzc(int r2) {
        /*
            r0 = 20
            r1 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r2 == r0) goto L40
            r0 = 30
            if (r2 == r0) goto L3c
            switch(r2) {
                case 5: goto L38;
                case 6: goto L34;
                case 7: goto L30;
                case 8: goto L3c;
                case 9: goto L2c;
                case 10: goto L28;
                case 11: goto L25;
                case 12: goto L22;
                default: goto Le;
            }
        Le:
            switch(r2) {
                case 14: goto L1e;
                case 15: goto L1b;
                case 16: goto L17;
                case 17: goto L13;
                case 18: goto L34;
                default: goto L11;
            }
        L11:
            r2 = r1
            goto L43
        L13:
            r2 = 336000(0x52080, float:4.70836E-40)
            goto L43
        L17:
            r2 = 256000(0x3e800, float:3.58732E-40)
            goto L43
        L1b:
            r2 = 8000(0x1f40, float:1.121E-41)
            goto L43
        L1e:
            r2 = 3062500(0x2ebae4, float:4.291477E-39)
            goto L43
        L22:
            r2 = 7000(0x1b58, float:9.809E-42)
            goto L43
        L25:
            r2 = 16000(0x3e80, float:2.2421E-41)
            goto L43
        L28:
            r2 = 100000(0x186a0, float:1.4013E-40)
            goto L43
        L2c:
            r2 = 40000(0x9c40, float:5.6052E-41)
            goto L43
        L30:
            r2 = 192000(0x2ee00, float:2.6905E-40)
            goto L43
        L34:
            r2 = 768000(0xbb800, float:1.076197E-39)
            goto L43
        L38:
            r2 = 80000(0x13880, float:1.12104E-40)
            goto L43
        L3c:
            r2 = 2250000(0x225510, float:3.152922E-39)
            goto L43
        L40:
            r2 = 63750(0xf906, float:8.9333E-41)
        L43:
            if (r2 == r1) goto L47
            r0 = 1
            goto L48
        L47:
            r0 = 0
        L48:
            com.google.android.gms.internal.ads.zzdd.zzf(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrq.zzc(int):int");
    }
}
