package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0956Xm {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-33, -41, -37, -38, -41, -39};
    }

    public static Bundle A00(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AbstractC0720Oa.A01, A01(0, 6, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH));
        bundle.putString(AbstractC0720Oa.A00, str);
        return bundle;
    }
}
