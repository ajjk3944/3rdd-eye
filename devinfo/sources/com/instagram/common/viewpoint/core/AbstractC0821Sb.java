package com.instagram.common.viewpoint.core;

import android.content.ContentResolver;
import android.database.Cursor;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0821Sb {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{61, 53, 56, 79, 64, 74, 92, 65, 71, 74, 71, 74, 127, 115, 114, 104, 121, 114, 104, 38, 51, 51, 127, 115, 113, 50, 122, 125, 127, 121, 126, 115, 115, 119, 50, 119, 125, 104, 125, 114, 125, 50, 108, 110, 115, 106, 117, 120, 121, 110, 50, 93, 104, 104, 110, 117, 126, 105, 104, 117, 115, 114, 85, 120, 76, 110, 115, 106, 117, 120, 121, 110, 18, 23, 19, 23, 10, 33, 10, 12, 31, 29, 21, 23, 16, 25};
    }

    public static C0820Sa A00(ContentResolver contentResolver) {
        String strA01 = A01(72, 14, AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID);
        String strA012 = A01(3, 9, 33);
        String strA013 = A01(0, 3, 83);
        Cursor c9 = null;
        try {
            c9 = contentResolver.query(XB.A00(A01(12, 60, 19)), new String[]{strA013, strA012, strA01}, null, null, null);
            if (c9 == null || !c9.moveToFirst()) {
                return new C0820Sa(null, null, false);
            }
            String string = c9.getString(c9.getColumnIndex(strA013));
            String attributionId = c9.getString(c9.getColumnIndex(strA012));
            C0820Sa c0820Sa = new C0820Sa(string, attributionId, Boolean.valueOf(c9.getString(c9.getColumnIndex(strA01))).booleanValue());
            if (c9 != null) {
                c9.close();
            }
            return c0820Sa;
        } finally {
            if (c9 != null) {
                c9.close();
            }
        }
    }
}
