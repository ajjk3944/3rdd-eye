package com.instagram.common.viewpoint.core;

import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03438t extends Exception {
    public static byte[] A03;
    public final int A00;
    public final C1996qI A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{60, 127, 119, 45, 58, 60, 48, 41, 58, 45, 62, 61, 51, 58, 118, 123, 126, 114, 60, 39, Utf8.REPLACEMENT_BYTE, 29, 52, 19, 39, 54, 59, 61, 6, 32, 51, 49, 57, 19, 62, 62, 61, 49, 51, 38, 55, 54, 111, 42, 38, 86, 98, 115, 126, 120, 67, 101, 118, 116, 124, 55, 126, 121, 126, 99, 55, 113, 118, 126, 123, 114, 115, 55, 44, 0, 1, 9, 6, 8, 71};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "D23918943: Monitor the audio track usage")
    public C03438t(int i4, int i10, int i11, int i12, C1996qI c1996qI, boolean z3, Exception exc, int i13) {
        StringBuilder sbAppend = new StringBuilder().append(A00(45, 23, 86)).append(i4);
        String strA00 = A00(0, 1, 93);
        StringBuilder sbAppend2 = sbAppend.append(strA00).append(A00(68, 7, 46)).append(i10);
        String strA002 = A00(43, 2, 71);
        super(sbAppend2.append(strA002).append(i11).append(strA002).append(i12).append(A00(15, 28, 19)).append(i13).append(strA00).append(c1996qI).append(z3 ? A00(1, 14, 30) : A00(0, 0, 74)).toString(), exc);
        this.A00 = i4;
        this.A02 = z3;
        this.A01 = c1996qI;
    }
}
