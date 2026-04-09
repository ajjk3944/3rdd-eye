package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
/* renamed from: com.facebook.ads.redexgen.X.Iu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0585Iu {
    public static byte[] A01;

    @MetaExoPlayerCustomization("Adding TYPE_xml")
    public static final int A02;
    public final int A00;

    public static String A03(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-26, -37, -38, -114};
    }

    static {
        A04();
        A02 = C5C.A0D(A03(0, 4, 3));
    }

    public AbstractC0585Iu(int i4) {
        this.A00 = i4;
    }

    public static int A00(int i4) {
        return 16777215 & i4;
    }

    public static int A01(int i4) {
        return (i4 >> 24) & 255;
    }

    public static String A02(int i4) {
        return A03(0, 0, 9) + ((char) ((i4 >> 24) & 255)) + ((char) ((i4 >> 16) & 255)) + ((char) ((i4 >> 8) & 255)) + ((char) (i4 & 255));
    }

    public String toString() {
        return A02(this.A00);
    }
}
