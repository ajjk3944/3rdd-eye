package com.instagram.common.viewpoint.core;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class H2 {
    public static byte[] A04;
    public static String[] A05 = {"uP2VmRjmPrkQ", "gRGWgf4lLYF9Rif8PQPDNbGokb9BUMtV", "bSjOyzwe8Lqn79dPeHIi8kfJVgfNJaEZ", "7R1XMZQjg8S2TiXm1wE8kLqT1leJFKD3", "sD", "qKJRf3b", "Q40N8hoONMcQBFaHNU", "iAP6W7CwppN1UlUQVXHbR"};
    public C0536Gw A00;
    public final int A01;
    public final C1794n0 A02;
    public final H1 A03;

    public static String A02(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i4, i4 + i10);
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

    public H2(InterfaceC0537Gx interfaceC0537Gx, H1 h12, long j, long j8, long j9, long j10, long j11, long j12, int i4) {
        this.A03 = h12;
        this.A01 = i4;
        this.A02 = new C1794n0(interfaceC0537Gx, j, j8, j9, j10, j11, j12);
    }

    private final int A00(InterfaceC1787ms interfaceC1787ms, long j, HV hv) {
        if (j != interfaceC1787ms.A8n()) {
            hv.A00 = j;
            return 1;
        }
        if (A05[5].length() != 7) {
            throw new RuntimeException();
        }
        A05[4] = "eb0wJDSKJb6zWnRAqReB9UTGfXv";
        return 0;
    }

    private final C0536Gw A01(long j) {
        return new C0536Gw(j, this.A02.A05(j), this.A02.A05, this.A02.A02, this.A02.A04, this.A02.A01, this.A02.A00);
    }

    private final void A04(boolean z3, long j) {
        this.A00 = null;
        this.A03.AFs();
    }

    private final boolean A05(InterfaceC1787ms interfaceC1787ms, long j) throws IOException {
        long jA8n = j - interfaceC1787ms.A8n();
        if (jA8n >= 0 && jA8n <= 262144) {
            interfaceC1787ms.AK3((int) jA8n);
            return true;
        }
        return false;
    }

    public final int A06(InterfaceC1787ms interfaceC1787ms, HV hv) throws IOException {
        while (true) {
            C0536Gw c0536Gw = (C0536Gw) AbstractC02203y.A02(this.A00);
            long jA01 = c0536Gw.A01();
            long jA00 = c0536Gw.A00();
            long jA02 = c0536Gw.A02();
            if (jA00 - jA01 <= this.A01) {
                A04(false, jA01);
                String[] strArr = A05;
                if (strArr[3].charAt(1) != strArr[1].charAt(1)) {
                    throw new RuntimeException();
                }
                A05[5] = "cjf3Phs";
                return A00(interfaceC1787ms, jA01, hv);
            }
            if (!A05(interfaceC1787ms, jA02)) {
                return A00(interfaceC1787ms, jA02, hv);
            }
            interfaceC1787ms.AIl();
            C0539Gz c0539GzAIw = this.A03.AIw(interfaceC1787ms, c0536Gw.A04());
            switch (c0539GzAIw.A00) {
                case -3:
                    A04(false, jA02);
                    return A00(interfaceC1787ms, jA02, hv);
                case -2:
                    c0536Gw.A0D(c0539GzAIw.A02, c0539GzAIw.A01);
                    break;
                case -1:
                    c0536Gw.A0C(c0539GzAIw.A02, c0539GzAIw.A01);
                    break;
                case 0:
                    A05(interfaceC1787ms, c0539GzAIw.A01);
                    long floorPosition = c0539GzAIw.A01;
                    A04(true, floorPosition);
                    return A00(interfaceC1787ms, c0539GzAIw.A01, hv);
                default:
                    throw new IllegalStateException(A02(0, 12, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD));
            }
        }
    }

    public final C1794n0 A07() {
        return this.A02;
    }

    public final void A08(long j) {
        if (this.A00 != null && this.A00.A03() == j) {
            return;
        }
        this.A00 = A01(j);
    }

    public final boolean A09() {
        return this.A00 != null;
    }
}
