package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class QO {
    public static byte[] A02;
    public static String[] A03 = {"eKMrgqlCE6gemHc3i8XP3AKPCikI", "F056EMXFpemItrIKSNHDMT", "UP7tmvacf", "VwJuHcYZb6pOUF9c5fygzqO1xhwXl8", "rbSS0TX92cN6cYo9TUPXDkEXEuy61J", "qalk034xToBy0kTaZmHtwYGALLiE8EwC", "z1", "iDDMQnl7H0FoGDQAr6PhZLTqZy2Xncag"};
    public long A00 = 0;
    public QO A01;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{47, 47};
    }

    static {
        A02();
    }

    private void A01() {
        if (this.A01 == null) {
            this.A01 = new QO();
        }
    }

    public final int A03(int i4) {
        if (this.A01 == null) {
            if (i4 >= 64) {
                return Long.bitCount(this.A00);
            }
            long j = this.A00;
            long j8 = (1 << i4) - 1;
            if (A03[6].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "eBNk3oMk3zKdgPZGJWBoIC6ya78Y9W";
            strArr[4] = "SZljZRIwDL4qj86IVN03h7W6Ja49N5";
            return Long.bitCount(j & j8);
        }
        if (i4 < 64) {
            return Long.bitCount(this.A00 & ((1 << i4) - 1));
        }
        return this.A01.A03(i4 - 64) + Long.bitCount(this.A00);
    }

    public final void A04() {
        this.A00 = 0L;
        if (this.A01 != null) {
            QO qo = this.A01;
            String[] strArr = A03;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "MSI1mtfoMLAkHcYJR6PW0K";
            strArr2[7] = "fUjJFSbhC3MyLq7bD4XnyNju1VoRa1IS";
            qo.A04();
        }
    }

    public final void A05(int i4) {
        if (i4 >= 64) {
            if (this.A01 != null) {
                QO qo = this.A01;
                int i10 = i4 - 64;
                if (A03[6].length() != 2) {
                    throw new RuntimeException();
                }
                A03[6] = "gh";
                qo.A05(i10);
                return;
            }
            return;
        }
        this.A00 &= ~(1 << i4);
    }

    public final void A06(int i4) {
        if (i4 >= 64) {
            A01();
            this.A01.A06(i4 - 64);
        } else {
            this.A00 |= 1 << i4;
        }
    }

    public final void A07(int i4, boolean z3) {
        if (i4 >= 64) {
            A01();
            this.A01.A07(i4 - 64, z3);
            return;
        }
        boolean z10 = (this.A00 & Long.MIN_VALUE) != 0;
        long j = (1 << i4) - 1;
        long j8 = this.A00 & j;
        long j9 = this.A00;
        long mask = ~j;
        this.A00 = j8 | ((j9 & mask) << 1);
        if (z3) {
            A06(i4);
        } else {
            A05(i4);
        }
        if (!z10 && this.A01 == null) {
            return;
        }
        A01();
        this.A01.A07(0, z10);
    }

    public final boolean A08(int i4) {
        if (i4 < 64) {
            return (this.A00 & (1 << i4)) != 0;
        }
        A01();
        return this.A01.A08(i4 - 64);
    }

    public final boolean A09(int i4) {
        if (i4 >= 64) {
            A01();
            return this.A01.A09(i4 - 64);
        }
        long j = 1 << i4;
        boolean z3 = (this.A00 & j) != 0;
        long mask = this.A00;
        this.A00 = mask & (~j);
        long j8 = j - 1;
        long j9 = this.A00 & j8;
        long mask2 = this.A00;
        long before = ~j8;
        this.A00 = j9 | Long.rotateRight(mask2 & before, 1);
        if (this.A01 != null) {
            if (this.A01.A08(0)) {
                A06(63);
            }
            this.A01.A09(0);
        }
        return z3;
    }

    public final String toString() {
        return this.A01 == null ? Long.toBinaryString(this.A00) : this.A01.toString() + A00(0, 2, 114) + Long.toBinaryString(this.A00);
    }
}
