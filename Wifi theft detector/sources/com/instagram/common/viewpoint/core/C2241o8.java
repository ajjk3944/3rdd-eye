package com.instagram.common.viewpoint.core;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.o8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2241o8 implements BY {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{13, 27, 29, Flags.CD, 12, 27, 83, 14, 18, 31, 7, 28, 31, 29, 21, 10, 21, 24, 25, 19, 83, 29, 10, 31};
    }

    public C2241o8() {
    }

    @Override // com.instagram.common.viewpoint.core.BY
    public final int A7P() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.instagram.common.viewpoint.core.BY
    public final MediaCodecInfo A7Q(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // com.instagram.common.viewpoint.core.BY
    public final boolean AAR(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.BY
    public final boolean AAS(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 15, 117).equals(str) && A00(15, 9, 119).equals(str2);
    }

    @Override // com.instagram.common.viewpoint.core.BY
    public final boolean AJ4() {
        return false;
    }
}
