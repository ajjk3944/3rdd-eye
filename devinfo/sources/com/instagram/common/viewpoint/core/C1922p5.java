package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.p5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1922p5 extends C02495b {
    public static byte[] A02;
    public final int A00;
    public final C02565i A01;

    static {
        A06();
    }

    public static String A05(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A02 = new byte[]{-39, -30, -37, -41, -24, -22, -37, -18, -22, -92, -96, -28, -27, -22, -106, -26, -37, -24, -29, -33, -22, -22, -37, -38, -92, -96};
    }

    public C1922p5(C02565i c02565i, int i4, int i10) {
        super(A03(i4, i10));
        this.A01 = c02565i;
        this.A00 = i10;
    }

    public C1922p5(IOException iOException, C02565i c02565i, int i4, int i10) {
        super(iOException, A03(i4, i10));
        this.A01 = c02565i;
        this.A00 = i10;
    }

    public C1922p5(String str, C02565i c02565i, int i4, int i10) {
        super(str, A03(i4, i10));
        this.A01 = c02565i;
        this.A00 = i10;
    }

    public C1922p5(String str, IOException iOException, C02565i c02565i, int i4, int i10) {
        super(str, iOException, A03(i4, i10));
        this.A01 = c02565i;
        this.A00 = i10;
    }

    public static int A03(int i4, int i10) {
        if (i4 == 2000 && i10 == 1) {
            return AdError.INTERNAL_ERROR_CODE;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.instagram.common.viewpoint.core.C1922p5 A04(java.io.IOException r4, com.instagram.common.viewpoint.core.C02565i r5, int r6) {
        /*
            java.lang.String r1 = r4.getMessage()
            boolean r0 = r4 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L1a
            r1 = 2002(0x7d2, float:2.805E-42)
        La:
            r0 = 2007(0x7d7, float:2.812E-42)
            if (r1 != r0) goto L14
            com.facebook.ads.redexgen.X.AM r0 = new com.facebook.ads.redexgen.X.AM
            r0.<init>(r4, r5)
        L13:
            return r0
        L14:
            com.facebook.ads.redexgen.X.p5 r0 = new com.facebook.ads.redexgen.X.p5
            r0.<init>(r4, r5, r1, r6)
            goto L13
        L1a:
            boolean r0 = r4 instanceof java.io.InterruptedIOException
            if (r0 == 0) goto L21
            r1 = 1004(0x3ec, float:1.407E-42)
            goto La
        L21:
            if (r1 == 0) goto L39
            java.lang.String r3 = com.instagram.common.viewpoint.core.AbstractC1631k7.A01(r1)
            r2 = 0
            r1 = 26
            r0 = 62
            java.lang.String r0 = A05(r2, r1, r0)
            boolean r0 = r3.matches(r0)
            if (r0 == 0) goto L39
            r1 = 2007(0x7d7, float:2.812E-42)
            goto La
        L39:
            r1 = 2001(0x7d1, float:2.804E-42)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1922p5.A04(java.io.IOException, com.facebook.ads.redexgen.X.5i, int):com.facebook.ads.redexgen.X.p5");
    }
}
