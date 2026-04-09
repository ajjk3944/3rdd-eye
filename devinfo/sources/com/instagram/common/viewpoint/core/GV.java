package com.instagram.common.viewpoint.core;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class GV extends AbstractRunnableC0923Wc {
    public static byte[] A01;
    public static String[] A02 = {"ziFc1AxLwl06l9cm2ro8EEkTqcfxuLTc", "Ot3h47XlIqwqlb0VDKX34tYNREgAb88h", "XErmhi3UBKLFfekLEXmFG5T5AXnu", "x4ahbzSdp8w2tJq97wkZytqruvrbxvGd", "5eNtQA6JlDjBFR49aczWqHsgt2phfPFu", "5gzf4", "tgwS2khKEZgsCudiehRL6tpdm2kFQW", "Wy"};
    public final /* synthetic */ C4V A00;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 14);
            if (A02[5].length() != 5) {
                throw new RuntimeException();
            }
            A02[2] = "VyWbJGKy3Ebs7lO";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 1, 12, 13, 7, 72, 6, 13, 30, 13, 26, 72, 27, 28, 9, 26, 28, 13, 12, 72, 24, 4, 9, 17, 1, 6, 15};
    }

    static {
        A01();
    }

    public GV(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        if (!this.A00.A0F) {
            this.A00.A0Q(A00(0, 27, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH));
        }
    }
}
