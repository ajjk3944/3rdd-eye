package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.af, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3107af {
    public static byte[] A00;
    public static String[] A01 = {"e7juOHCMVCS96MucXvvyM5upzpE0CxcL", "6Axk6XM18YFtFlcC0tEdKqjogVlmemrm", "CHYE97fUe", "94l1C", "pvrd7E3JtMrEOvPAC3lcGaqqDdvc2Rnk", "mswd2ljSuB4EOxjza27Iz7krcpdQKmDN", "x2gmwPWroRNX0socjzMaFBH0Y3mBhUE3", "1dJrelJWCcDuEHtNsp3IaM8Oqex3ZZ7a"};

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-73, -32, 10, -73, -32, 5, 10, 11, -8, 5, 11, -73, -2, -8, 4, -4, 10, -73, -8, 3, 3, 6, 14, -4, -5, -47, -73, -121, -80, -38, -121, -80, -43, -38, -37, -56, -43, -37, -121, -50, -56, -44, -52, -38, -95, -121, -57, 14, 22, 22, 14, 19, 12, -57, 13, 8, 19, 19, 9, 8, 10, 18, -57, 28, 25, 19, -57, 8, 29, 8, 16, 19, 8, 9, 19, 12, -31, -57, 79, -104, -94, -126, -93, -98, -95, -108, 105, 79, 90, -95, -9, -22, -27, -26, -16, -95, -10, -13, -19, -95, -22, -12, -95, -17, -10, -19, -19, -69, -95, 4, 16, 14, -49, 7, 2, 4, 6, 3, 16, 16, 12, -49, 12, 2, 21, 2, 15, 2, -42, -41, -46, -43, -56, -35, -34, -39, -36, -49, -55, -33, -36, -42, -55, -31, -49, -52, -55, -48, -53, -42, -42, -52, -53, -51, -43, -30, -43, -48, -47, -37, -53, -31, -34, -40};
        String[] strArr = A01;
        if (strArr[5].charAt(19) != strArr[7].charAt(19)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "ump74";
        strArr2[2] = "QJx5Vwz5z";
    }

    static {
        A02();
    }

    public static AbstractC3106ae A00(C3110ai c3110ai, Bundle bundle, boolean z10) throws SecurityException {
        AbstractC3106ae c2649Jp;
        c3110ai.A06().A0H().A00(false);
        C2726Mp c2726MpA20 = c3110ai.A05().A20();
        double dA00 = AbstractC3097aV.A00(c2726MpA20);
        boolean isWatchAndBrowse = c3110ai.A05().A20().A0T();
        boolean zA06 = AbstractC3097aV.A06(c3110ai.A00(), c3110ai.A01(), dA00);
        MH mhA00 = MI.A00(c3110ai.A06(), c3110ai.A07(), A01(0, 0, 8), WQ.A00(c3110ai.A05().A20().A0J().A05()), new HashMap(), c3110ai.A05().A21());
        boolean z11 = !TextUtils.isEmpty(c2726MpA20.A0H().A09());
        if (U7.A1u(c3110ai.A06())) {
            C3272dL c3272dLA06 = c3110ai.A06();
            String[] strArr = A01;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "oHCvC4ERmXYMU8sW9KKIPv7pnY2wXb01";
            strArr2[7] = "G3HUaMks2xBdg2z9mSbIts1gYwx1OgmU";
            c3272dLA06.A0B().AK2(c3110ai.A02(), c3110ai.A05().A25(), z11);
        }
        boolean zA04 = A04(c3110ai, z11);
        if ((isWatchAndBrowse && (mhA00 instanceof C7O)) || zA04) {
            c2649Jp = A03(c3110ai) ? new C2626Is(c3110ai) : new JU(c3110ai, zA04);
        } else if (z11) {
            c2649Jp = new C22905d(c3110ai);
        } else {
            if (c3110ai.A05().A1U()) {
                return new C2657Jx(c3110ai);
            }
            if (c3110ai.A05().A1b()) {
                c2649Jp = new C22925f(c3110ai);
            } else if (U7.A2a(c3110ai.A06())) {
                c2649Jp = new C22915e(c3110ai, zA06);
            } else if (zA06) {
                c2649Jp = new C2654Ju(c3110ai, c3110ai.A00() == 2);
            } else {
                c2649Jp = new C2649Jp(c3110ai, AbstractC3097aV.A04(dA00));
            }
        }
        if (z10) {
            c2649Jp.A1G(c2726MpA20, c3110ai.A05().A25(), dA00, bundle);
        }
        return c2649Jp;
    }

    public static boolean A03(C3110ai c3110ai) {
        if (!c3110ai.A05().A1o()) {
            boolean zA1U = c3110ai.A05().A1U();
            String[] strArr = A01;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "BfXu055milBajq8QiXDIPY7ZZDWb7rZy";
            strArr2[7] = "zfsTxDhfKJjHYbZVz1DIv6IoDbSXcVhK";
            if (!zA1U) {
                return false;
            }
        }
        return true;
    }

    public static boolean A04(C3110ai c3110ai, boolean z10) throws SecurityException {
        boolean z11 = false;
        if (!c3110ai.A05().A1r() || !z10) {
            return false;
        }
        Uri uriA00 = WQ.A00(c3110ai.A05().A20().A0J().A05());
        String authority = uriA00.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            c3110ai.A06().A0F().ABk();
            return false;
        }
        boolean isInstantGamesEnabled = authority.equals(A01(128, 5, 58));
        boolean isInstantGames = uriA00.getQueryParameter(A01(155, 9, 67)) == null;
        String queryParameter = uriA00.getQueryParameter(A01(133, 22, 65));
        boolean isGoogleFallBackUrlAvailable = !TextUtils.isEmpty(queryParameter) && queryParameter.contains(c3110ai.A05().A0w());
        boolean zEquals = c3110ai.A06().getPackageName().equals(A01(109, 19, 120));
        boolean zA1s = c3110ai.A05().A1s();
        if (isInstantGamesEnabled && isInstantGames && isGoogleFallBackUrlAvailable && (!zEquals || zA1s)) {
            z11 = true;
        }
        if (!z11 && Build.VERSION.SDK_INT >= 24) {
            c3110ai.A06().A0F().ABj(A01(78, 11, 6) + isInstantGamesEnabled + A01(89, 20, 88) + isInstantGames + A01(46, 32, 126) + isGoogleFallBackUrlAvailable + A01(27, 19, 62) + zEquals + A01(0, 27, 110) + zA1s);
        }
        return z11;
    }
}
