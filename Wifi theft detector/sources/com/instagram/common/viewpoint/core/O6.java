package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O6 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, 120};
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x00da */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(com.instagram.common.viewpoint.core.C1814gi r11, com.instagram.common.viewpoint.core.C1220Sx r12, com.instagram.common.viewpoint.core.C06897l r13) {
        /*
            com.facebook.ads.redexgen.X.Sv r3 = new com.facebook.ads.redexgen.X.Sv
            com.facebook.ads.redexgen.X.Nm r0 = r13.A2C()
            java.lang.String r4 = r0.A01()
            int r5 = com.instagram.common.viewpoint.core.C1651e4.A04
            int r6 = com.instagram.common.viewpoint.core.C1651e4.A04
            java.lang.String r7 = r13.A1D()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r8 = A00(r2, r1, r0)
            r3.<init>(r4, r5, r6, r7, r8)
            r12.A0d(r3)
            boolean r5 = r13.A1g()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            if (r5 == 0) goto L4f
            java.lang.String r2 = r13.A0x()
            java.lang.String r1 = r13.A1D()
            com.facebook.ads.redexgen.X.St r4 = new com.facebook.ads.redexgen.X.St
            r4.<init>(r2, r1, r0)
            r1 = 1
            r4.A04 = r1
            r3 = 0
            r2 = 5
            r1 = 66
            java.lang.String r1 = A00(r3, r2, r1)
            r4.A03 = r1
            r12.A0Y(r4)
        L4f:
            boolean r1 = com.instagram.common.viewpoint.core.C1741fX.A03()
            boolean r4 = com.instagram.common.viewpoint.core.C1264Up.A30(r11, r1)
            com.facebook.ads.redexgen.X.NR r1 = r13.A29()
            com.facebook.ads.redexgen.X.NU r1 = r1.A0H()
            java.lang.String r7 = r1.A09()
            com.facebook.ads.redexgen.X.St r6 = new com.facebook.ads.redexgen.X.St
            java.lang.String r8 = r13.A1D()
            com.facebook.ads.redexgen.X.NR r1 = r13.A29()
            com.facebook.ads.redexgen.X.NU r1 = r1.A0H()
            long r10 = r1.A06()
            r3 = 17
            r2 = 14
            r1 = 113(0x71, float:1.58E-43)
            java.lang.String r9 = A00(r3, r2, r1)
            r6.<init>(r7, r8, r9, r10)
            if (r5 == 0) goto Lfb
            if (r4 != 0) goto Lfb
            r12.A0Y(r6)
        L89:
            com.facebook.ads.redexgen.X.Sv r4 = new com.facebook.ads.redexgen.X.Sv
            com.facebook.ads.redexgen.X.NR r1 = r13.A29()
            com.facebook.ads.redexgen.X.NU r1 = r1.A0H()
            java.lang.String r5 = r1.A08()
            com.facebook.ads.redexgen.X.NR r1 = r13.A29()
            com.facebook.ads.redexgen.X.NU r1 = r1.A0H()
            int r6 = com.instagram.common.viewpoint.core.O1.A00(r1)
            com.facebook.ads.redexgen.X.NR r1 = r13.A29()
            com.facebook.ads.redexgen.X.NU r1 = r1.A0H()
            int r7 = com.instagram.common.viewpoint.core.O1.A01(r1)
            java.lang.String r8 = r13.A1D()
            r3 = 17
            r2 = 14
            r1 = 113(0x71, float:1.58E-43)
            java.lang.String r9 = A00(r3, r2, r1)
            r4.<init>(r5, r6, r7, r8, r9)
            r12.A0d(r4)
            com.instagram.common.viewpoint.core.O0.A00(r13, r12, r0)
            com.facebook.ads.redexgen.X.NR r0 = r13.A29()
            com.facebook.ads.redexgen.X.Nd r0 = r0.A0K()
            java.util.List r0 = r0.A02()
            java.util.Iterator r3 = r0.iterator()
        Ld6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lff
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            com.facebook.ads.redexgen.X.Sv r4 = new com.facebook.ads.redexgen.X.Sv
            java.lang.String r8 = r13.A1D()
            r2 = 17
            r1 = 14
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r9 = A00(r2, r1, r0)
            r6 = -1
            r7 = -1
            r4.<init>(r5, r6, r7, r8, r9)
            r12.A0d(r4)
            goto Ld6
        Lfb:
            r12.A0b(r6)
            goto L89
        Lff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.O6.A02(com.facebook.ads.redexgen.X.gi, com.facebook.ads.redexgen.X.Sx, com.facebook.ads.redexgen.X.7l):void");
    }

    public static void A03(C1814gi c1814gi, C1220Sx c1220Sx, C06897l c06897l) {
        int i10 = 0;
        for (NR nr : c06897l.A2G()) {
            C1218Sv c1218Sv = new C1218Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), c06897l.A1D(), A00(5, 12, 118));
            if (i10 == 0) {
                c1220Sx.A0c(c1218Sv);
            } else {
                c1220Sx.A0d(c1218Sv);
            }
            O0.A00(c06897l, c1220Sx, A00(17, 14, 113));
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c1220Sx.A0d(new C1218Sv(it.next(), -1, -1, c06897l.A1D(), A00(5, 12, 118)));
            }
            if (!TextUtils.isEmpty(nr.A0H().A09())) {
                new C1216St(nr.A0H().A09(), c06897l.A1D(), A00(5, 12, 118), nr.A0H().A06()).A04 = false;
            }
            i10++;
        }
    }
}
