package com.instagram.common.viewpoint.core;

import android.media.MediaCodec;
import com.applovin.shadow.okio.Utf8;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class BA extends Exception {
    public static byte[] A05;
    public final B3 A00;
    public final BA A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    static {
        A05();
    }

    public static String A03(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{0, 12, 49, 16, 22, 26, 17, 16, 7, 85, 28, 27, 28, 1, 85, 19, 20, 28, 25, 16, 17, 79, 85, 101, 68, 66, 78, 69, 68, 83, 1, 72, 79, 72, 85, 1, 71, 64, 72, 77, 68, 69, 27, 1, 122, Utf8.REPLACEMENT_BYTE, 78, 66, 29, 17, 19, 80, 24, 31, 29, 27, 28, 17, 17, 21, 80, 31, 26, 13, 80, 31, 16, 26, 12, 17, 23, 26, 6, 80, 19, 27, 26, 23, 31, 77, 80, 27, 6, 17, 14, 18, 31, 7, 27, 12, 80, 19, 27, 26, 23, 31, 29, 17, 26, 27, 29, 80, 51, 27, 26, 23, 31, 61, 17, 26, 27, 29, 44, 27, 16, 26, 27, 12, 27, 12, 33, 36, 47, 45, 21};
    }

    public BA(C1996qI c1996qI, Throwable th2, boolean z3, int i4) {
        this(A03(23, 22, 80) + i4 + A03(45, 3, 19) + c1996qI, th2, c1996qI.A0W, z3, null, A02(i4), null);
    }

    public BA(C1996qI c1996qI, Throwable th2, boolean z3, B3 b32) {
        this(A03(2, 21, 4) + b32.A03 + A03(0, 2, 93) + c1996qI, th2, c1996qI.A0W, z3, b32, C5C.A02 >= 21 ? A04(th2) : null, null);
    }

    public BA(String str, Throwable th2, String str2, boolean z3, B3 b32, String str3, BA ba2) {
        super(str, th2);
        this.A03 = str2;
        this.A04 = z3;
        this.A00 = b32;
        this.A02 = str3;
        this.A01 = ba2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BA A00(BA ba2) {
        return new BA(getMessage(), getCause(), this.A03, this.A04, this.A00, this.A02, ba2);
    }

    public static String A02(int i4) {
        String strA03 = i4 < 0 ? A03(121, 4, 59) : A03(0, 0, 98);
        StringBuilder sb2 = new StringBuilder();
        String sign = A03(48, 73, 15);
        return sb2.append(sign).append(strA03).append(Math.abs(i4)).toString();
    }

    public static String A04(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
