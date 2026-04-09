package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class SZ {
    public static byte[] A00;
    public static String[] A01 = {"T8", "", "As3hIStO2xNa0GSSHrkEVjQu", "DXoFAMJTZKDaTyX0if7pZrkyLA7XvGsC", "niDMG5wZxQy0H8acRFWa8hH2XuraMrTN", "878XRXnWNCNw6FCwqGtfz4QO6Hd03tfb", "ID5FT62NpqbpmPra08cWCCHJVsi2pDHC", "txdj"};
    public static final AtomicReference<SX> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[7].length() != 4) {
                throw new RuntimeException();
            }
            A01[6] = "PcSdqCtN9qYKSfDsPVWrfTZjyuiu0dLa";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 86);
            i12++;
        }
    }

    public static void A05() {
        A00 = new byte[]{19, 27, 22, 17, 33, 40, 23, 36, 36, 27, 22, 23, 17, 15, 24, 15, 28, 19, 13, 43, 38, 40, 35, 33, 49, 56, 39, 52, 52, 43, 38, 39};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 12));
    }

    public static SX A00() {
        SX advertisingIdInfo = A02.get();
        if (advertisingIdInfo == null) {
            return SX.A00();
        }
        return advertisingIdInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.instagram.common.viewpoint.core.SX A01(com.instagram.common.viewpoint.core.T8 r5, com.instagram.common.viewpoint.core.SX r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L29
        Lc:
            com.facebook.ads.redexgen.X.SX r0 = com.instagram.common.viewpoint.core.AbstractC0824Sf.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.Tc r5 = r5.A08()
            int r4 = com.instagram.common.viewpoint.core.AbstractC0848Td.A1Q
            com.facebook.ads.redexgen.X.Te r3 = new com.facebook.ads.redexgen.X.Te
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 84
            java.lang.String r0 = A04(r2, r1, r0)
            r5.ABC(r0, r4, r3)
        L29:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.SZ.A01(com.facebook.ads.redexgen.X.T8, com.facebook.ads.redexgen.X.SX):com.facebook.ads.redexgen.X.SX");
    }

    public static SX A02(T8 t82, SX sx, SY sy) {
        C0820Sa c0820SaA00 = null;
        try {
            if (AbstractC0885Uo.A06(t82) && (sx == null || TextUtils.isEmpty(sx.A03()))) {
                c0820SaA00 = AbstractC0821Sb.A00(t82.getContentResolver());
            }
        } catch (Throwable th2) {
            t82.A08().ABC(A04(12, 7, 84), AbstractC0848Td.A1S, new C0849Te(th2));
        }
        if (c0820SaA00 != null && c0820SaA00.A01 != null) {
            A03.set(c0820SaA00.A01);
            sy.A05(c0820SaA00.A01);
        }
        if (sx == null && c0820SaA00 != null && !TextUtils.isEmpty(c0820SaA00.A00)) {
            return new SX(c0820SaA00.A00, c0820SaA00.A02, SW.A04);
        }
        return sx;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 12);
        }
        return attributionId;
    }

    public static void A06(SY sy) {
        A02.set(sy.A02());
        A03.set(sy.A03());
    }

    public static void A07(T8 t82) {
        long jA01;
        SX advertisingIdInfo;
        try {
            SY sy = new SY(t82);
            A06(sy);
            if (A08()) {
                return;
            }
            SX advertisingIdInfo2 = A02.get();
            if (advertisingIdInfo2 != null && !TextUtils.isEmpty(advertisingIdInfo2.A03())) {
                jA01 = advertisingIdInfo2.A01();
            } else {
                jA01 = -1;
            }
            if (jA01 > 0 && System.currentTimeMillis() - jA01 < AbstractC0885Uo.A00(t82)) {
                return;
            }
            if (AbstractC0885Uo.A07(t82)) {
                advertisingIdInfo = A01(t82, A02(t82, null, sy));
            } else {
                advertisingIdInfo = A02(t82, A01(t82, null), sy);
            }
            if (advertisingIdInfo != null && !TextUtils.isEmpty(advertisingIdInfo.A03())) {
                A02.set(advertisingIdInfo);
                sy.A04(advertisingIdInfo);
            }
        } catch (Throwable t10) {
            t82.A08().ABC(A04(12, 7, 84), AbstractC0848Td.A1R, new C0849Te(t10));
        }
    }

    public static boolean A08() {
        boolean z3 = false;
        boolean updated = XD.A04();
        if (updated) {
            String strA04 = A04(0, 12, 92);
            boolean updated2 = XD.A05(strA04);
            if (updated2) {
                A03.set(XD.A01(strA04));
                z3 = true;
            }
        }
        boolean zA04 = XD.A04();
        if (A01[7].length() != 4) {
            throw new RuntimeException();
        }
        A01[6] = "Cpq5b7Aomj18wFHDN8BPNJlk9AiHAVMm";
        if (!zA04) {
            return z3;
        }
        String strA042 = A04(19, 13, 108);
        boolean updated3 = XD.A05(strA042);
        if (updated3) {
            String strA01 = XD.A01(strA042);
            AtomicReference<SX> atomicReference = A02;
            if (strA01 == null) {
                if (A01[7].length() != 4) {
                    A01[7] = "Ywke";
                    strA01 = A04(0, 0, 2);
                } else {
                    A01[5] = "aB8iQRCNNWTx0AWcZvgXlT81SikGsrWB";
                    strA01 = A04(0, 0, 12);
                }
            }
            atomicReference.set(new SX(strA01, false, SW.A03));
            return true;
        }
        return z3;
    }
}
