package com.instagram.common.viewpoint.core;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Ki, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1003Ki {
    public static String[] A02 = {"qTeBguUhuyM1MFes5Wth7HwI8JVW0esL", "wy2OEDVCsbs7Li1HpnMScgVTk8nNd5Di", "4", "CU9fduzhq9VQNbJmZcJcyCUxTgO6nbWs", CampaignEx.CLICKMODE_ON, "s", "JcGduWYdz", "iAKvMVZDfF33p8y0i7fbnjg8iQoR6jrx"};
    public static final Comparator<C1003Ki> A03 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Kh
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((C1003Ki) obj).A01.A00, ((C1003Ki) obj2).A01.A00);
        }
    };
    public final int A00;
    public final C1004Kj A01;

    public C1003Ki(C1004Kj c1004Kj, int i10) {
        this.A01 = c1004Kj;
        this.A00 = i10;
    }

    public static /* synthetic */ Comparator A03() {
        Comparator<C1003Ki> comparator = A03;
        if (A02[1].charAt(25) != '8') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = "h";
        strArr[5] = "u";
        return comparator;
    }
}
