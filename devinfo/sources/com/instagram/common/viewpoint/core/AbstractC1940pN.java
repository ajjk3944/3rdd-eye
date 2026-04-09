package com.instagram.common.viewpoint.core;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.google.common.primitives.ElementTypesAreNonnullByDefault;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.pN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1940pN {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{0, 58, 59, 111, 32, 41, 111, 61, 46, 33, 40, 42, 117, 111, 106, 60};
    }

    public static char A00(byte b12, byte b22) {
        return (char) ((b12 << 8) | (b22 & 255));
    }

    public static char A01(long value) {
        char c9 = (char) value;
        AbstractC1666ki.A0H(((long) c9) == value, A02(0, 16, WebSocketProtocol.PAYLOAD_SHORT), value);
        return c9;
    }

    public static boolean A04(char[] array, char target) {
        for (char c9 : array) {
            if (c9 == target) {
                return true;
            }
        }
        return false;
    }
}
