package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* loaded from: assets/audience_network/classes2.dex */
public final class AR extends Timeline {
    public static String[] A04 = {"nDkuZZEFG4iGMwbsGEvKBo4ueCI7wxif", "OM6NJOBBZMKrUazjZz4CdR8Ljfz9nzwy", "h9AdYD37MAF4FmuzDOyGIvEw", "VkmtOVI9Gbc78hEhNGIz4LiMtzYnUrU2", "bkWqGplua99PBwc9ED6yZtwvDtuw6KwN", "305DBImSoaz5MlD7g6qLfpiwFg5d3Fl", "QtOjLPNYFNek9UnmHWOFtbeX9w", "y2avdvKeY0dhYPEmFhuJXZmeyR2ks2D4"};
    public final BP<C1963pl> A00;
    public final BP<C1961pj> A01;
    public final int[] A02;
    public final int[] A03;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    /* JADX WARN: Incorrect condition in loop: B:7:0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AR(com.instagram.common.viewpoint.core.BP<com.instagram.common.viewpoint.core.C1961pj> r4, com.instagram.common.viewpoint.core.BP<com.instagram.common.viewpoint.core.C1963pl> r5, int[] r6) {
        /*
            r3 = this;
            r3.<init>()
            int r1 = r4.size()
            int r0 = r6.length
            if (r1 != r0) goto L26
            r0 = 1
        Lb:
            com.instagram.common.viewpoint.core.AbstractC02203y.A07(r0)
            r3.A01 = r4
            r3.A00 = r5
            r3.A02 = r6
            int r0 = r6.length
            int[] r0 = new int[r0]
            r3.A03 = r0
            r2 = 0
        L1a:
            int r0 = r6.length
            if (r2 >= r0) goto L28
            int[] r1 = r3.A03
            r0 = r6[r2]
            r1[r0] = r2
            int r2 = r2 + 1
            goto L1a
        L26:
            r0 = 0
            goto Lb
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AR.<init>(com.facebook.ads.redexgen.X.BP, com.facebook.ads.redexgen.X.BP, int[]):void");
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return this.A00.size();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return this.A01.size();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A08(int i4, int i10, boolean z3) {
        if (i10 == 1) {
            return i4;
        }
        if (i4 == A0C(z3)) {
            if (i10 == 2) {
                return A0B(z3);
            }
            return -1;
        }
        if (z3) {
            return this.A02[this.A03[i4] + 1];
        }
        return i4 + 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0A(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z3) {
        if (A0N()) {
            return -1;
        }
        if (!z3) {
            return 0;
        }
        int[] iArr = this.A02;
        if (A04[1].charAt(22) == 'H') {
            throw new RuntimeException();
        }
        A04[7] = "6ncpOYdEr0xsUZdZBYFnYejLEosAstPL";
        return iArr[0];
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0C(boolean z3) {
        if (A0N()) {
            return -1;
        }
        if (z3) {
            return this.A02[A07() - 1];
        }
        return A07() - 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C1963pl A0I(int i4, C1963pl p10, boolean z3) {
        C1963pl p11 = this.A00.get(i4);
        p10.A0G(p11.A03, p11.A04, p11.A00, p11.A01, p11.A02, p11.A06, p11.A05);
        return p10;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C1961pj A0L(int i4, C1961pj c1961pj, long j) {
        C1961pj c1961pj2 = this.A01.get(i4);
        c1961pj.A07(c1961pj2.A0C, c1961pj2.A09, c1961pj2.A0A, c1961pj2.A06, c1961pj2.A07, c1961pj2.A04, c1961pj2.A0G, c1961pj2.A0D, c1961pj2.A08, c1961pj2.A02, c1961pj2.A03, c1961pj2.A00, c1961pj2.A01, c1961pj2.A05);
        c1961pj.A0F = c1961pj2.A0F;
        return c1961pj;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final Object A0M(int i4) {
        throw new UnsupportedOperationException();
    }
}
