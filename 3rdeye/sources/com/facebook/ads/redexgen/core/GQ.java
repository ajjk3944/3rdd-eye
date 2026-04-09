package com.facebook.ads.redexgen.core;

import com.android.billingclient.api.BillingClient;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class GQ {
    public static byte[] A04;
    public static String[] A05 = {"uP2VmRjmPrkQ", "gRGWgf4lLYF9Rif8PQPDNbGokb9BUMtV", "bSjOyzwe8Lqn79dPeHIi8kfJVgfNJaEZ", "7R1XMZQjg8S2TiXm1wE8kLqT1leJFKD3", "sD", "qKJRf3b", "Q40N8hoONMcQBFaHNU", "iAP6W7CwppN1UlUQVXHbR"};
    public GK A00;
    public final int A01;
    public final C3745lV A02;
    public final GP A03;

    public static String A02(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 35);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{7, 32, 56, 47, 34, 39, 42, 110, 45, 47, 61, 43};
    }

    static {
        A03();
    }

    public GQ(GL gl, GP gp, long j4, long j10, long j11, long j12, long j13, long j14, int i) {
        this.A03 = gp;
        this.A01 = i;
        this.A02 = new C3745lV(gl, j4, j10, j11, j12, j13, j14);
    }

    private final int A00(InterfaceC3738lN interfaceC3738lN, long j4, C2576Gt c2576Gt) {
        if (j4 != interfaceC3738lN.A8f()) {
            c2576Gt.A00 = j4;
            return 1;
        }
        if (A05[5].length() != 7) {
            throw new RuntimeException();
        }
        A05[4] = "eb0wJDSKJb6zWnRAqReB9UTGfXv";
        return 0;
    }

    private final GK A01(long j4) {
        return new GK(j4, this.A02.A05(j4), this.A02.A05, this.A02.A02, this.A02.A04, this.A02.A01, this.A02.A00);
    }

    private final void A04(boolean z10, long j4) {
        this.A00 = null;
        this.A03.AFA();
    }

    private final boolean A05(InterfaceC3738lN interfaceC3738lN, long j4) throws IOException {
        long jA8f = j4 - interfaceC3738lN.A8f();
        if (jA8f >= 0 && jA8f <= 262144) {
            interfaceC3738lN.AJJ((int) jA8f);
            return true;
        }
        return false;
    }

    public final int A06(InterfaceC3738lN interfaceC3738lN, C2576Gt c2576Gt) throws IOException {
        while (true) {
            GK gk = (GK) C3M.A02(this.A00);
            long jA01 = gk.A01();
            long jA00 = gk.A00();
            long jA02 = gk.A02();
            if (jA00 - jA01 <= this.A01) {
                A04(false, jA01);
                String[] strArr = A05;
                if (strArr[3].charAt(1) != strArr[1].charAt(1)) {
                    throw new RuntimeException();
                }
                A05[5] = "cjf3Phs";
                return A00(interfaceC3738lN, jA01, c2576Gt);
            }
            if (!A05(interfaceC3738lN, jA02)) {
                return A00(interfaceC3738lN, jA02, c2576Gt);
            }
            interfaceC3738lN.AI1();
            GN gnAIC = this.A03.AIC(interfaceC3738lN, gk.A04());
            switch (gnAIC.A00) {
                case BillingClient.BillingResponseCode.SERVICE_TIMEOUT /* -3 */:
                    A04(false, jA02);
                    return A00(interfaceC3738lN, jA02, c2576Gt);
                case -2:
                    gk.A0D(gnAIC.A02, gnAIC.A01);
                    break;
                case -1:
                    gk.A0C(gnAIC.A02, gnAIC.A01);
                    break;
                case 0:
                    A05(interfaceC3738lN, gnAIC.A01);
                    long floorPosition = gnAIC.A01;
                    A04(true, floorPosition);
                    return A00(interfaceC3738lN, gnAIC.A01, c2576Gt);
                default:
                    throw new IllegalStateException(A02(0, 12, 109));
            }
        }
    }

    public final C3745lV A07() {
        return this.A02;
    }

    public final void A08(long j4) {
        if (this.A00 != null && this.A00.A03() == j4) {
            return;
        }
        this.A00 = A01(j4);
    }

    public final boolean A09() {
        return this.A00 != null;
    }
}
