package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class AD extends C1977pz {
    public static byte[] A07;
    public static final AnonymousClass23<AD> A08;
    public static final String A09;
    public static final String A0A;
    public static final String A0B;
    public static final String A0C;
    public static final String A0D;
    public static final String A0E;
    public final boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C1996qI A04;
    public final C3C A05;
    public final String A06;

    public static /* synthetic */ AD A00(Bundle bundle) {
        return new AD(bundle);
    }

    public static String A05(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{120, -67, -54, -54, -57, -54, -124, 120, -63, -58, -68, -67, -48, -107, -83, -95, -25, -16, -13, -18, -30, -11, -66, -37, -49, 21, 30, 33, 28, 16, 35, 14, 34, 36, 31, 31, 30, 33, 35, 20, 19, -20, -21, -47, -45, -26, -18, -16, -11, -26, -95, -26, -13, -13, -16, -13, -53, -25, -19, -22, -37, -35, -104, -35, -22, -22, -25, -22, -50, -25, -34, -15, -23, -34, -36, -19, -34, -35, -103, -21, -18, -25, -19, -30, -26, -34, -103, -34, -21, -21, -24, -21};
    }

    static {
        A07();
        A08 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.ot
            @Override // com.instagram.common.viewpoint.core.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                return AD.A00(bundle);
            }
        };
        A0E = C5C.A0h(1001);
        A0D = C5C.A0h(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
        A0C = C5C.A0h(1003);
        A0A = C5C.A0h(TTAdConstant.IMAGE_MODE_CAROUSEL_IMG);
        A0B = C5C.A0h(WebSocketProtocol.CLOSE_NO_STATUS_CODE);
        A09 = C5C.A0h(1006);
    }

    public AD(int i4, Throwable th2, int i10) {
        this(i4, th2, null, i10, null, -1, null, 4, false);
    }

    public AD(int i4, Throwable th2, String str, int i10, String str2, int i11, C1996qI c1996qI, int i12, boolean z3) {
        this(A06(i4, th2, str, str2, i11, c1996qI, i12), th2, i10, i4, str2, i11, c1996qI, i12, null, SystemClock.elapsedRealtime(), z3);
    }

    public AD(Bundle bundle) {
        C1996qI c1996qI;
        super(bundle);
        this.A03 = bundle.getInt(A0E, 2);
        this.A06 = bundle.getString(A0D);
        this.A02 = bundle.getInt(A0C, -1);
        Bundle bundle2 = bundle.getBundle(A0A);
        if (bundle2 == null) {
            c1996qI = null;
        } else {
            c1996qI = (C1996qI) C1996qI.A0b.A6f(bundle2);
        }
        this.A04 = c1996qI;
        this.A01 = bundle.getInt(A0B, 4);
        this.A00 = bundle.getBoolean(A09, false);
        this.A05 = null;
    }

    public AD(String str, Throwable th2, int i4, int i10, String str2, int i11, C1996qI c1996qI, int i12, C3C c3c, long j, boolean z3) {
        super(str, th2, i4, j);
        AbstractC02203y.A07(!z3 || i10 == 1);
        AbstractC02203y.A07(th2 != null || i10 == 3);
        this.A03 = i10;
        this.A06 = str2;
        this.A02 = i11;
        this.A04 = c1996qI;
        this.A01 = i12;
        this.A05 = c3c;
        this.A00 = z3;
    }

    public static AD A01(IOException iOException, int i4) {
        return new AD(0, iOException, i4);
    }

    @Deprecated
    public static AD A02(RuntimeException runtimeException) {
        return A03(runtimeException, 1000);
    }

    public static AD A03(RuntimeException runtimeException, int i4) {
        return new AD(2, runtimeException, i4);
    }

    public static AD A04(Throwable th2, String str, int i4, C1996qI c1996qI, int i10, boolean z3, int i11) {
        int i12 = i10;
        if (c1996qI == null) {
            i12 = 4;
        }
        return new AD(1, th2, null, i11, str, i4, c1996qI, i12, z3);
    }

    public static String A06(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}, value = "Throwable cause - linked with Error reporting") int i4, Throwable th2, String str, String str2, int i10, C1996qI c1996qI, int i11) {
        String message;
        String strA05;
        if (str == null) {
            message = th2 == null ? null : th2.getMessage();
        } else {
            message = str;
        }
        if (message != null) {
            return message;
        }
        switch (i4) {
            case 0:
                strA05 = A05(56, 12, 59);
                break;
            case 1:
                StringBuilder sbAppend = new StringBuilder().append(str2);
                String message2 = A05(0, 14, 27);
                StringBuilder sbAppend2 = sbAppend.append(message2).append(i10);
                String message3 = A05(14, 9, 68);
                StringBuilder sbAppend3 = sbAppend2.append(message3).append(c1996qI);
                String message4 = A05(23, 19, 114);
                StringBuilder sbAppend4 = sbAppend3.append(message4);
                String message5 = C5C.A0g(i11);
                strA05 = sbAppend4.append(message5).toString();
                break;
            case 2:
            default:
                strA05 = A05(68, 24, 60);
                break;
            case 3:
                strA05 = A05(44, 12, 68);
                break;
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sbAppend5 = new StringBuilder().append(strA05);
            String message6 = A05(42, 2, 116);
            return sbAppend5.append(message6).append(str).toString();
        }
        return strA05;
    }
}
