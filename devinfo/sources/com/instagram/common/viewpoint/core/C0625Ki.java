package com.instagram.common.viewpoint.core;

import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Ki, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0625Ki {
    public static String[] A02 = {"qTeBguUhuyM1MFes5Wth7HwI8JVW0esL", "wy2OEDVCsbs7Li1HpnMScgVTk8nNd5Di", "4", "CU9fduzhq9VQNbJmZcJcyCUxTgO6nbWs", "5", "s", "JcGduWYdz", "iAKvMVZDfF33p8y0i7fbnjg8iQoR6jrx"};
    public static final Comparator<C0625Ki> A03 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Kh
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((C0625Ki) obj).A01.A00, ((C0625Ki) obj2).A01.A00);
        }
    };
    public final int A00;
    public final C0626Kj A01;

    public C0625Ki(C0626Kj c0626Kj, int i4) {
        this.A01 = c0626Kj;
        this.A00 = i4;
    }

    public static /* synthetic */ Comparator A03() {
        Comparator<C0625Ki> comparator = A03;
        if (A02[1].charAt(25) != '8') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = "h";
        strArr[5] = "u";
        return comparator;
    }
}
