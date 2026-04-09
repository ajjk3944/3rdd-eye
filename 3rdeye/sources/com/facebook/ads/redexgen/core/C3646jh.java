package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.jh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3646jh implements GP {
    public static String[] A02 = {"icMuAGNUwG3qooMsLkIelsXOgqR", "wZwGdqwzUfLFhHeDnVqZXfrekI2t19Nm", "6NjHclQwJEhKen4shQzzT38fKShvFJl3", "cwvHChui6ScrilPVLNLxDwwq1RZibmTM", "KGSyfhH5I6lVnEy0NkdKQy5Ija", "JgLMaajFBM7mBqcCk", "W9ygPHkeZ", ""};
    public final C4J A00;
    public final C4R A01;

    public C3646jh(C4R c4r) {
        this.A01 = c4r;
        this.A00 = new C4J();
    }

    private GN A00(C4J c4j, long scrValue, long scrTimeUs) {
        int iA09 = -1;
        int iA092 = -1;
        long j4 = -9223372036854775807L;
        while (c4j.A07() >= 4) {
            if (C3645jg.A00(c4j.A0l(), c4j.A09()) != 442) {
                c4j.A0g(1);
            } else {
                c4j.A0g(4);
                long jA06 = KU.A06(c4j);
                if (jA06 != -9223372036854775807L) {
                    long jA062 = this.A01.A06(jA06);
                    if (jA062 > scrValue) {
                        if (j4 == -9223372036854775807L) {
                            return GN.A04(jA062, scrTimeUs);
                        }
                        return GN.A03(iA09 + scrTimeUs);
                    }
                    int startOfLastPacketPosition = A02[1].charAt(26);
                    if (startOfLastPacketPosition == 113) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[3] = "JRu5yfiOOmZm3e1j9KGmxzziCqUEhgmX";
                    strArr[2] = "rPvZuTIICj36zhJU166yjphfEhohU7nm";
                    long lastScrTimeUsInRange = 100000 + jA062;
                    if (lastScrTimeUsInRange > scrValue) {
                        return GN.A03(c4j.A09() + scrTimeUs);
                    }
                    j4 = jA062;
                    iA09 = c4j.A09();
                }
                A01(c4j);
                iA092 = c4j.A09();
            }
        }
        if (j4 != -9223372036854775807L) {
            return GN.A05(j4, iA092 + scrTimeUs);
        }
        return GN.A03;
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x005b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(com.facebook.ads.redexgen.core.C4J r5) {
        /*
            int r4 = r5.A0A()
            int r1 = r5.A07()
            r0 = 10
            if (r1 >= r0) goto L10
            r5.A0f(r4)
            return
        L10:
            r0 = 9
            r5.A0g(r0)
            int r0 = r5.A0I()
            r1 = r0 & 7
            int r0 = r5.A07()
            if (r0 >= r1) goto L25
            r5.A0f(r4)
            return
        L25:
            r5.A0g(r1)
            int r0 = r5.A07()
            r3 = 4
            if (r0 >= r3) goto L33
            r5.A0f(r4)
            return
        L33:
            byte[] r1 = r5.A0l()
            int r0 = r5.A09()
            int r1 = com.facebook.ads.redexgen.core.C3645jg.A01(r1, r0)
            r0 = 443(0x1bb, float:6.21E-43)
            if (r1 != r0) goto L57
            r5.A0g(r3)
            int r1 = r5.A0M()
            int r0 = r5.A07()
            if (r0 >= r1) goto L54
            r5.A0f(r4)
            return
        L54:
            r5.A0g(r1)
        L57:
            int r0 = r5.A07()
            if (r0 < r3) goto L71
            byte[] r1 = r5.A0l()
            int r0 = r5.A09()
            int r1 = com.facebook.ads.redexgen.core.C3645jg.A01(r1, r0)
            r0 = 442(0x1ba, float:6.2E-43)
            if (r1 == r0) goto L71
            r0 = 441(0x1b9, float:6.18E-43)
            if (r1 != r0) goto L72
        L71:
            return
        L72:
            int r1 = r1 >>> 8
            r0 = 1
            if (r1 == r0) goto L78
            goto L71
        L78:
            r5.A0g(r3)
            int r1 = r5.A07()
            r0 = 2
            if (r1 >= r0) goto L86
            r5.A0f(r4)
            return
        L86:
            int r2 = r5.A0M()
            int r1 = r5.A0A()
            int r0 = r5.A09()
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r1, r0)
            r5.A0f(r0)
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C3646jh.A01(com.facebook.ads.redexgen.X.4J):void");
    }

    @Override // com.facebook.ads.redexgen.core.GP
    public final void AFA() {
        this.A00.A0i(AbstractC22614a.A07);
    }

    @Override // com.facebook.ads.redexgen.core.GP
    public final GN AIC(InterfaceC3738lN interfaceC3738lN, long j4) throws IOException {
        long jA8f = interfaceC3738lN.A8f();
        int iMin = (int) Math.min(20000L, interfaceC3738lN.A8G() - jA8f);
        this.A00.A0d(iMin);
        interfaceC3738lN.AG9(this.A00.A0l(), 0, iMin);
        return A00(this.A00, j4, jA8f);
    }
}
