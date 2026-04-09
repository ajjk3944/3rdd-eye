package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class H2 {
    public static byte[] A04;
    public static String[] A05 = {"uP2VmRjmPrkQ", "gRGWgf4lLYF9Rif8PQPDNbGokb9BUMtV", "bSjOyzwe8Lqn79dPeHIi8kfJVgfNJaEZ", "7R1XMZQjg8S2TiXm1wE8kLqT1leJFKD3", "sD", "qKJRf3b", "Q40N8hoONMcQBFaHNU", "iAP6W7CwppN1UlUQVXHbR"};
    public C0914Gw A00;
    public final int A01;
    public final C2172n0 A02;
    public final H1 A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 35);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{7, 32, 56, 47, 34, 39, 42, 110, 45, 47, 61, 43};
    }

    static {
        A03();
    }

    public H2(InterfaceC0915Gx interfaceC0915Gx, H1 h12, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.A03 = h12;
        this.A01 = i10;
        this.A02 = new C2172n0(interfaceC0915Gx, j10, j11, j12, j13, j14, j15);
    }

    private final int A00(InterfaceC2165ms interfaceC2165ms, long j10, HV hv) {
        if (j10 != interfaceC2165ms.A8n()) {
            hv.A00 = j10;
            return 1;
        }
        if (A05[5].length() != 7) {
            throw new RuntimeException();
        }
        A05[4] = "eb0wJDSKJb6zWnRAqReB9UTGfXv";
        return 0;
    }

    private final C0914Gw A01(long j10) {
        return new C0914Gw(j10, this.A02.A05(j10), this.A02.A05, this.A02.A02, this.A02.A04, this.A02.A01, this.A02.A00);
    }

    private final void A04(boolean z10, long j10) {
        this.A00 = null;
        this.A03.AFs();
    }

    private final boolean A05(InterfaceC2165ms interfaceC2165ms, long j10) throws IOException {
        long jA8n = j10 - interfaceC2165ms.A8n();
        if (jA8n >= 0 && jA8n <= 262144) {
            interfaceC2165ms.AK3((int) jA8n);
            return true;
        }
        return false;
    }

    public final int A06(InterfaceC2165ms interfaceC2165ms, HV hv) throws IOException {
        while (true) {
            C0914Gw c0914Gw = (C0914Gw) AbstractC05983y.A02(this.A00);
            long jA01 = c0914Gw.A01();
            long jA00 = c0914Gw.A00();
            long jA02 = c0914Gw.A02();
            if (jA00 - jA01 <= this.A01) {
                A04(false, jA01);
                String[] strArr = A05;
                if (strArr[3].charAt(1) != strArr[1].charAt(1)) {
                    throw new RuntimeException();
                }
                A05[5] = "cjf3Phs";
                return A00(interfaceC2165ms, jA01, hv);
            }
            if (!A05(interfaceC2165ms, jA02)) {
                return A00(interfaceC2165ms, jA02, hv);
            }
            interfaceC2165ms.AIl();
            C0917Gz c0917GzAIw = this.A03.AIw(interfaceC2165ms, c0914Gw.A04());
            switch (c0917GzAIw.A00) {
                case -3:
                    A04(false, jA02);
                    return A00(interfaceC2165ms, jA02, hv);
                case -2:
                    c0914Gw.A0D(c0917GzAIw.A02, c0917GzAIw.A01);
                    break;
                case -1:
                    c0914Gw.A0C(c0917GzAIw.A02, c0917GzAIw.A01);
                    break;
                case 0:
                    A05(interfaceC2165ms, c0917GzAIw.A01);
                    long floorPosition = c0917GzAIw.A01;
                    A04(true, floorPosition);
                    return A00(interfaceC2165ms, c0917GzAIw.A01, hv);
                default:
                    throw new IllegalStateException(A02(0, 12, 109));
            }
        }
    }

    public final C2172n0 A07() {
        return this.A02;
    }

    public final void A08(long j10) {
        if (this.A00 != null && this.A00.A03() == j10) {
            return;
        }
        this.A00 = A01(j10);
    }

    public final boolean A09() {
        return this.A00 != null;
    }
}
