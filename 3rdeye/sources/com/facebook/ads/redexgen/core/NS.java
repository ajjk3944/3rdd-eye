package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public abstract class NS {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, 120};
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x00d7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(com.facebook.ads.redexgen.core.C3272dL r12, com.facebook.ads.redexgen.core.SF r13, com.facebook.ads.redexgen.core.AnonymousClass73 r14) {
        /*
            com.facebook.ads.redexgen.X.SD r3 = new com.facebook.ads.redexgen.X.SD
            com.facebook.ads.redexgen.X.N9 r0 = r14.A23()
            java.lang.String r4 = r0.A01()
            int r5 = com.facebook.ads.redexgen.core.C3238cm.A04
            int r6 = com.facebook.ads.redexgen.core.C3238cm.A04
            java.lang.String r7 = r14.A17()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r8 = A00(r2, r1, r0)
            r3.<init>(r4, r5, r6, r7, r8)
            r13.A0d(r3)
            boolean r6 = r14.A1Y()
            if (r6 == 0) goto L4f
            java.lang.String r5 = r14.A0s()
            java.lang.String r4 = r14.A17()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            com.facebook.ads.redexgen.X.SB r3 = new com.facebook.ads.redexgen.X.SB
            r3.<init>(r5, r4, r0)
            r0 = 1
            r3.A04 = r0
            r2 = 0
            r1 = 5
            r0 = 66
            java.lang.String r0 = A00(r2, r1, r0)
            r3.A03 = r0
            r13.A0Y(r3)
        L4f:
            boolean r0 = com.facebook.ads.redexgen.core.C3327eF.A03()
            boolean r3 = com.facebook.ads.redexgen.core.U7.A2s(r12, r0)
            com.facebook.ads.redexgen.X.Mp r0 = r14.A20()
            com.facebook.ads.redexgen.X.Ms r0 = r0.A0H()
            java.lang.String r8 = r0.A09()
            com.facebook.ads.redexgen.X.SB r7 = new com.facebook.ads.redexgen.X.SB
            java.lang.String r9 = r14.A17()
            com.facebook.ads.redexgen.X.Mp r0 = r14.A20()
            com.facebook.ads.redexgen.X.Ms r0 = r0.A0H()
            long r11 = r0.A06()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r10 = A00(r2, r1, r0)
            r7.<init>(r8, r9, r10, r11)
            if (r6 == 0) goto Lf8
            if (r3 != 0) goto Lf8
            r13.A0Y(r7)
        L89:
            com.facebook.ads.redexgen.X.SD r3 = new com.facebook.ads.redexgen.X.SD
            com.facebook.ads.redexgen.X.Mp r0 = r14.A20()
            com.facebook.ads.redexgen.X.Ms r0 = r0.A0H()
            java.lang.String r4 = r0.A08()
            com.facebook.ads.redexgen.X.Mp r0 = r14.A20()
            com.facebook.ads.redexgen.X.Ms r0 = r0.A0H()
            int r5 = com.facebook.ads.redexgen.core.NN.A00(r0)
            com.facebook.ads.redexgen.X.Mp r0 = r14.A20()
            com.facebook.ads.redexgen.X.Ms r0 = r0.A0H()
            int r6 = com.facebook.ads.redexgen.core.NN.A01(r0)
            java.lang.String r7 = r14.A17()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r8 = A00(r2, r1, r0)
            r3.<init>(r4, r5, r6, r7, r8)
            r13.A0d(r3)
            com.facebook.ads.redexgen.X.Mp r0 = r14.A20()
            com.facebook.ads.redexgen.X.N0 r0 = r0.A0K()
            java.util.List r0 = r0.A02()
            java.util.Iterator r3 = r0.iterator()
        Ld3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lfc
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            com.facebook.ads.redexgen.X.SD r4 = new com.facebook.ads.redexgen.X.SD
            java.lang.String r8 = r14.A17()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r9 = A00(r2, r1, r0)
            r6 = -1
            r7 = -1
            r4.<init>(r5, r6, r7, r8, r9)
            r13.A0d(r4)
            goto Ld3
        Lf8:
            r13.A0b(r7)
            goto L89
        Lfc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.NS.A02(com.facebook.ads.redexgen.X.dL, com.facebook.ads.redexgen.X.SF, com.facebook.ads.redexgen.X.73):void");
    }

    public static void A03(C3272dL c3272dL, SF sf, AnonymousClass73 anonymousClass73) {
        int i = 0;
        for (C2726Mp c2726Mp : anonymousClass73.A27()) {
            SD sd = new SD(c2726Mp.A0H().A08(), NN.A00(c2726Mp.A0H()), NN.A01(c2726Mp.A0H()), anonymousClass73.A17(), A00(5, 12, 118));
            if (i == 0) {
                sf.A0c(sd);
            } else {
                sf.A0d(sd);
            }
            Iterator<String> it = c2726Mp.A0K().A02().iterator();
            while (it.hasNext()) {
                sf.A0d(new SD(it.next(), -1, -1, anonymousClass73.A17(), A00(5, 12, 118)));
            }
            if (!TextUtils.isEmpty(c2726Mp.A0H().A09())) {
                new SB(c2726Mp.A0H().A09(), anonymousClass73.A17(), A00(5, 12, 118), c2726Mp.A0H().A06()).A04 = false;
            }
            i++;
        }
    }
}
