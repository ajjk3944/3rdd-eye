package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.media.AudioManager;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class Y7 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 5);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{100, 92, 111, 123, 106, 103, 97, 121, 109, 108, 119, 104, 116, 121, 97, 7, 0, 2, 7, 0, 11};
    }

    public static float A00(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(A01(2, 5, 11));
        if (audioManager != null) {
            int streamVolume = audioManager.getStreamVolume(3);
            int volume = audioManager.getStreamMaxVolume(3);
            if (volume > 0) {
                return (streamVolume * 1.0f) / volume;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static void A03(Map<String, String> map, boolean z3, boolean z10) {
        String strA01 = A01(1, 1, 104);
        String strA012 = A01(0, 1, 81);
        map.put(A01(7, 8, 29), z3 ? strA01 : strA012);
        if (!z10) {
            strA01 = strA012;
        }
        map.put(A01(15, 6, FacebookMediationAdapter.ERROR_NULL_CONTEXT), strA01);
    }
}
