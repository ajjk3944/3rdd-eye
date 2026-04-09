package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Lj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2695Lj {
    public static byte[] A0W;
    public static String[] A0X = {"lVJcyHuE1PJb579Sb1LAAlg5vS4NZYMV", "qyLkbqfl0JpOOnDgJdZjiTPjgkzmhXwK", "qCNdEz7ripOZNNb3yCY8Ki49zW8UWRt4", "Cjqz4QIw8w0k6KevPFem8GYP4yUKgFOK", "ptM4eVx6M57F8Ll6MNcW2L659ErB2sOY", "McIwIiSAB", "OKPGVpQZykPiX00cv", "DTBK8GKi"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final C2693Lh A0H;
    public final C2694Li A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final Map<String, String> A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0W, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            byte b10 = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 89);
            if (A0X[4].charAt(24) == 'w') {
                throw new RuntimeException();
            }
            A0X[3] = "PXVGXjtmkErHxa13ZrhtcOEvw3ek";
            bArrCopyOfRange[i12] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0W = new byte[]{72, 68};
    }

    static {
        A01();
    }

    public C2695Lj() {
        this(A00(0, 0, 39), -1L, false, -1, -1, -1, -1, false, false, -1, -1L, new C2694Li(), -1L, false, -1, -1, -1L, -1L, -1, null, -1, null, null, C2693Lh.A02, -1, false, A00(0, 0, 39), A00(0, 0, 39), A00(0, 0, 39), null, -1L, -1L);
    }

    public C2695Lj(C2695Lj c2695Lj) {
        this(c2695Lj, c2695Lj.A0N);
    }

    public C2695Lj(C2695Lj c2695Lj, String str) {
        this(c2695Lj.A0M, c2695Lj.A0A, c2695Lj.A0T, c2695Lj.A08, c2695Lj.A07, c2695Lj.A00, c2695Lj.A09, c2695Lj.A0V, c2695Lj.A0S, c2695Lj.A05, c2695Lj.A0C, c2695Lj.A0I, c2695Lj.A0F, c2695Lj.A0U, c2695Lj.A06, c2695Lj.A02, c2695Lj.A0E, c2695Lj.A0B, c2695Lj.A01, c2695Lj.A0Q, c2695Lj.A04, c2695Lj.A0K, c2695Lj.A0J, c2695Lj.A0H, c2695Lj.A03, c2695Lj.A0R, c2695Lj.A0O, c2695Lj.A0L, c2695Lj.A0P, str, -1L, -1L);
    }

    public C2695Lj(String str, long j4, boolean z10, int i, int i10, int i11, int i12, boolean z11, boolean z12, int i13, long j10, C2694Li c2694Li, long j11, boolean z13, int i14, int i15, long j12, long j13, int i16, Map<String, String> map, int i17, String str2, String str3, C2693Lh c2693Lh, int i18, boolean z14, String str4, String str5, String str6, String str7, long j14, long j15) {
        this.A0Q = new HashMap();
        this.A0M = str;
        this.A0A = j4;
        this.A0T = z10;
        this.A08 = i;
        this.A07 = i10;
        this.A00 = i11;
        this.A09 = i12;
        this.A0V = z11;
        this.A0S = z12;
        this.A05 = i13;
        this.A0C = j10;
        this.A0I = c2694Li;
        this.A0F = j11;
        this.A0U = z13;
        this.A06 = i14;
        this.A02 = i15;
        this.A0E = j12;
        this.A0B = j13;
        this.A01 = i16;
        this.A04 = i17;
        this.A0J = str3;
        this.A0K = str2;
        if (map != null) {
            this.A0Q.putAll(map);
        }
        this.A0H = c2693Lh;
        this.A03 = i18;
        this.A0R = z14;
        this.A0O = str4;
        this.A0L = str5;
        this.A0P = str6;
        this.A0N = str7;
        this.A0G = j14;
        this.A0D = j15;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(this.A0M);
        String strA00 = A00(0, 2, 61);
        return sbAppend.append(strA00).append(this.A0A).append(strA00).append(this.A0T).append(strA00).append(this.A08).append(strA00).append(this.A07).append(strA00).append(this.A00).append(strA00).append(this.A09).append(strA00).append(this.A0V).append(strA00).append(this.A0S).append(strA00).append(this.A05).append(strA00).append(this.A0E).append(strA00).append(this.A0B).append(strA00).append(this.A01).append(strA00).append(this.A04).append(strA00).append(this.A06).append(strA00).append(this.A02).append(strA00).append(this.A03).append(strA00).append(this.A0R).append(strA00).append(this.A0O).toString();
    }
}
