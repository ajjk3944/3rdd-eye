package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.app.KeyguardManager;
import android.util.Log;
import android.view.Window;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Xh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2997Xh {
    public static byte[] A00;
    public static String[] A01 = {"cuUzkH3QdbH3cJp2RF", "kphHRdIOrc0r15jsPfyG2Jy", "YnKzEWoXtdzuP95TROGjIP", "O6qhnuon9ci7avdCdn", "JszjlqJauoZ2AkEe", "2iwMqZkAQKEhQz1BEXGjAw", "tv2fwm9vcfvUl0RC5d9GYW3eB7CSJdU", "VWHYkG5jfvcYH9oXKfgyVS7MLxk2p9iO"};
    public static final String A02;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "jOZxNa7dXP1jVDPJoO";
            strArr2[0] = "z9aGKGtKVlVAFuhw7X";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 48);
            i12++;
        }
    }

    public static void A02() {
        A00 = new byte[]{79, 119, 122, 71, 92, 90, 79, 75, 86, 80, 81, 31, 86, 81, 31, 72, 86, 81, 91, 80, 72, 31, 86, 81, 89, 80, 31, 92, 87, 90, 92, 84, 98, 108, 112, 110, 124, 104, 123, 109, 91, 87, 66, 15, 20, 14, 22, 4, 96, 113, 115, 124, 112, 117, 100, 113, 117, 110, 96, 99};
    }

    static {
        A02();
        A02 = C2997Xh.class.getSimpleName();
    }

    public static Map<String, String> A01(@Nullable C3272dL c3272dL) {
        Window window;
        HashMap map = new HashMap();
        if (c3272dL == null) {
            return map;
        }
        try {
            map.put(A00(40, 3, 0), String.valueOf(A04(c3272dL)));
            Activity activityA0E = c3272dL.A0E();
            if (activityA0E != null && (window = activityA0E.getWindow()) != null) {
                int i = window.getAttributes().flags;
                int flags = window.getAttributes().type;
                map.put(A00(58, 2, 39), Integer.toString(flags));
                int type = 4194304 & i;
                String strA00 = A00(1, 1, 118);
                String flagDismissKeyguardEnabled = A00(0, 1, 79);
                map.put(A00(48, 5, 39), type > 0 ? strA00 : flagDismissKeyguardEnabled);
                int type2 = 524288 & i;
                if (A01[6].length() == 6) {
                    throw new RuntimeException();
                }
                A01[7] = "5jjmsuOSeLdxH4ITovSaNkR7tPO8fpvx";
                if (type2 <= 0) {
                    strA00 = flagDismissKeyguardEnabled;
                }
                map.put(A00(53, 5, 50), strA00);
            }
        } catch (Exception e4) {
            Log.e(A02, A00(2, 30, 15), e4);
            InterfaceC2884Su interfaceC2884SuA08 = c3272dL.A08();
            int type3 = AbstractC2885Sv.A2T;
            interfaceC2884SuA08.AAy(A00(43, 5, 77), type3, new C2886Sw(e4));
        }
        return map;
    }

    public static boolean A03(C3272dL c3272dL) {
        return !XQ.A04(A01(c3272dL));
    }

    public static boolean A04(C3272dL c3272dL) {
        KeyguardManager keyguardManager = (KeyguardManager) c3272dL.getSystemService(A00(32, 8, 57));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
