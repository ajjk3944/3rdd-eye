package com.facebook.ads.redexgen.core;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Rt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2858Rt {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{61, 53, 56, 79, 64, 74, 92, 65, 71, 74, 71, 74, 127, 115, 114, 104, 121, 114, 104, 38, 51, 51, 127, 115, 113, 50, 122, 125, 127, 121, 126, 115, 115, 119, 50, 119, 125, 104, 125, 114, 125, 50, 108, 110, 115, 106, 117, 120, 121, 110, 50, 93, 104, 104, 110, 117, 126, 105, 104, 117, 115, 114, 85, 120, 76, 110, 115, 106, 117, 120, 121, 110, 18, 23, 19, 23, 10, 33, 10, 12, 31, 29, 21, 23, 16, 25};
    }

    public static C2857Rs A00(ContentResolver contentResolver) {
        String strA01 = A01(72, 14, 113);
        String strA012 = A01(3, 9, 33);
        String strA013 = A01(0, 3, 83);
        Cursor c10 = null;
        try {
            c10 = contentResolver.query(WQ.A00(A01(12, 60, 19)), new String[]{strA013, strA012, strA01}, null, null, null);
            if (c10 == null || !c10.moveToFirst()) {
                return new C2857Rs(null, null, false);
            }
            String string = c10.getString(c10.getColumnIndex(strA013));
            String attributionId = c10.getString(c10.getColumnIndex(strA012));
            C2857Rs c2857Rs = new C2857Rs(string, attributionId, Boolean.valueOf(c10.getString(c10.getColumnIndex(strA01))).booleanValue());
            if (c10 != null) {
                c10.close();
            }
            return c2857Rs;
        } finally {
            if (c10 != null) {
                c10.close();
            }
        }
    }
}
