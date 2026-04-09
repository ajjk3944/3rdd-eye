package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class KY {
    public static byte[] A09;
    public static String[] A0A = {"YKrx4tQL3HFlbX0m6cI7YSMmMtJDnVWt", "EhNKRydGslBNjHwz4Qke8RkUgCBaonuc", "lVt1vjccWtobRJMyEDSjQomkweVugX5V", "X5vaF2wJa8umjlLI", "q53FR06vPOBUDZ08SG0Q3HmIsvEwqM01", "eDYPuZuNQVkkkUOb40HZTr2GxKWyUyQ4", "7DZ3geXrHcZNODb56yin0lXQD6ovjT1O", "oKDHpDD8v386AT9biWd"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C4R A08 = new C4R(0);
    public long A01 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public long A00 = -9223372036854775807L;
    public final C4J A07 = new C4J();

    public static String A05(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{-89, -103, -50, -20, -30, -25, -32, -103, -51, -62, -58, -66, -40, -50, -57, -52, -66, -51, -103, -30, -25, -20, -19, -34, -38, -35, -89, -119, -82, -74, -95, -84, -87, -92, 96, -92, -75, -78, -95, -76, -87, -81, -82, 122, 96, -95, -64, -111, -62, -65, -82, -63, -74, -68, -69, -97, -78, -82, -79, -78, -65};
    }

    static {
        A06();
    }

    public KY(int i) {
        this.A06 = i;
    }

    private int A00(InterfaceC3738lN interfaceC3738lN) {
        this.A07.A0i(AbstractC22614a.A07);
        this.A03 = true;
        interfaceC3738lN.AI1();
        return 0;
    }

    private int A01(InterfaceC3738lN interfaceC3738lN, C2576Gt c2576Gt, int i) throws IOException {
        int iMin = (int) Math.min(this.A06, interfaceC3738lN.A8G());
        if (interfaceC3738lN.A8f() != 0) {
            c2576Gt.A00 = 0;
            return 1;
        }
        this.A07.A0d(iMin);
        interfaceC3738lN.AI1();
        interfaceC3738lN.AG9(this.A07.A0l(), 0, iMin);
        this.A01 = A03(this.A07, i);
        this.A04 = true;
        return 0;
    }

    private int A02(InterfaceC3738lN interfaceC3738lN, C2576Gt c2576Gt, int i) throws IOException {
        long inputLength = interfaceC3738lN.A8G();
        int iMin = (int) Math.min(this.A06, inputLength);
        long inputLength2 = inputLength - iMin;
        if (interfaceC3738lN.A8f() != inputLength2) {
            c2576Gt.A00 = inputLength2;
            return 1;
        }
        this.A07.A0d(iMin);
        interfaceC3738lN.AI1();
        interfaceC3738lN.AG9(this.A07.A0l(), 0, iMin);
        this.A02 = A04(this.A07, i);
        this.A05 = true;
        return 0;
    }

    private long A03(C4J c4j, int i) {
        int iA0A = c4j.A0A();
        for (int iA09 = c4j.A09(); iA09 < iA0A; iA09++) {
            int searchEndPosition = c4j.A0l()[iA09];
            if (searchEndPosition == 71) {
                long jA01 = AbstractC2666Kg.A01(c4j, iA09, i);
                if (jA01 != -9223372036854775807L) {
                    return jA01;
                }
            }
        }
        return -9223372036854775807L;
    }

    private long A04(C4J c4j, int i) {
        int iA09 = c4j.A09();
        int iA0A = c4j.A0A();
        for (int i10 = iA0A - 188; i10 >= iA09; i10--) {
            if (AbstractC2666Kg.A03(c4j.A0l(), iA09, iA0A, i10)) {
                long jA01 = AbstractC2666Kg.A01(c4j, i10, i);
                if (jA01 != -9223372036854775807L) {
                    return jA01;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int A07(InterfaceC3738lN interfaceC3738lN, C2576Gt c2576Gt, int i) throws IOException {
        if (i <= 0) {
            return A00(interfaceC3738lN);
        }
        if (!this.A05) {
            return A02(interfaceC3738lN, c2576Gt, i);
        }
        if (this.A02 == -9223372036854775807L) {
            return A00(interfaceC3738lN);
        }
        if (!this.A04) {
            int iA01 = A01(interfaceC3738lN, c2576Gt, i);
            if (A0A[0].charAt(2) == 'O') {
                throw new RuntimeException();
            }
            A0A[0] = "U4EwafF7WjzJM20D4nSEnM6oLnkPTMDI";
            return iA01;
        }
        if (this.A01 == -9223372036854775807L) {
            return A00(interfaceC3738lN);
        }
        this.A00 = this.A08.A06(this.A02) - this.A08.A06(this.A01);
        if (this.A00 < 0) {
            AnonymousClass44.A07(A05(45, 16, 60), A05(27, 18, 47) + this.A00 + A05(0, 27, 104));
            this.A00 = -9223372036854775807L;
        }
        return A00(interfaceC3738lN);
    }

    public final long A08() {
        return this.A00;
    }

    public final C4R A09() {
        return this.A08;
    }

    public final boolean A0A() {
        return this.A03;
    }
}
