package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class NW {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-121, -122, -128, -109, 125, -126, -120, 121, 123, -122, 117, -120, 125, -125, -126, -109, 121, -122, -122, -125, -122, -109, -127, -125, 120, 121, -109, 127, 121, -115};
    }

    public static AdSettings.IntegrationErrorMode A00(C3272dL c3272dL) {
        AdSettings.IntegrationErrorMode integrationErrorMode = (AdSettings.IntegrationErrorMode) AdInternalSettings.sSettingsBundle.getSerializable(A01(0, 30, 9));
        if (integrationErrorMode == null) {
            integrationErrorMode = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
        }
        AdSettings.IntegrationErrorMode integrationErrorMode2 = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
        if (integrationErrorMode == integrationErrorMode2 && !A03(c3272dL)) {
            return AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CALLBACK_MODE;
        }
        return integrationErrorMode;
    }

    public static boolean A03(C3272dL c3272dL) {
        return (c3272dL.getApplicationInfo().flags & 2) != 0;
    }
}
