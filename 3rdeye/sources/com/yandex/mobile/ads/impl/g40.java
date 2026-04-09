package com.yandex.mobile.ads.impl;

import android.media.MediaDrm;
import com.facebook.ads.AdError;

/* loaded from: classes3.dex */
final class g40 {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        int iA = s82.a(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo());
        if (iA == 2 || iA == 4) {
            return 6005;
        }
        if (iA == 10) {
            return 6004;
        }
        if (iA == 7) {
            return 6005;
        }
        if (iA == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (iA) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (iA) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }
}
