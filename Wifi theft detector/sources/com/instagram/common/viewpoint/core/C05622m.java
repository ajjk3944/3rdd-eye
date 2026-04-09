package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;

/* renamed from: com.facebook.ads.redexgen.X.2m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05622m {
    public static String[] A02 = {"GJxubYlXsZiu90nLIAtZt0ZPoHJfDn5s", "BS8EJfUuntSU9isaC3nv1ANhy", "Gs0aOb6gQMfpDwhZyZjPrCKqfhvLXKwh", "iN3iHRJ6T765oBofKZIxuh5bzIdVCLFB", "wNf5fiO3vn7igkhJYRlF92Iu10jGyY95", "PRW1z97xqqsLulYYbCVWRoDib", "FY0aCr3Onb0", "4J82hMkwk7B8La5ZKR1JgNOMoJvqL0p2"};
    public boolean A00;
    public final SparseBooleanArray A01 = new SparseBooleanArray();

    public final C05622m A00(int i10) {
        AbstractC05983y.A08(!this.A00);
        this.A01.append(i10, true);
        return this;
    }

    public final C05622m A01(int i10, boolean z10) {
        if (z10) {
            C05622m c05622mA00 = A00(i10);
            if (A02[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "oVNjkypXGUiIrzEYrZV4GsKas1KVyN3y";
            strArr[3] = "tIVTdGxG4MXYUs0uHZXzBbuDNAp7p6hg";
            return c05622mA00;
        }
        return this;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.instagram.common.viewpoint.core.C05622m A02(com.instagram.common.viewpoint.core.C05632n r3) {
        /*
            r2 = this;
            r1 = 0
        L1:
            int r0 = r3.A00()
            if (r1 >= r0) goto L11
            int r0 = r3.A01(r1)
            r2.A00(r0)
            int r1 = r1 + 1
            goto L1
        L11:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C05622m.A02(com.facebook.ads.redexgen.X.2n):com.facebook.ads.redexgen.X.2m");
    }

    public final C05622m A03(int... iArr) {
        for (int i10 : iArr) {
            A00(i10);
        }
        return this;
    }

    public final C05632n A04() {
        AbstractC05983y.A08(!this.A00);
        this.A00 = true;
        return new C05632n(this.A01);
    }
}
