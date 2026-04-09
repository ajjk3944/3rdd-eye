package com.instagram.common.viewpoint.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.applovin.shadow.okio.Utf8;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5Q, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C5Q {
    public static byte[] A00;
    public static String[] A01 = {"ftBSrscYCZrU1XGsUffOBJlxDQfDqofj", "6A6pNCV2uhgoYcLypb", "8GOV2FUSZps1pTbJ4je5MwftASUnZkM1", "4wRLkwVxN17llLy", "8LQiKKC5rqzUsPzG", "bVt1RMPFhi5Vk9jMxK8mGuGgg99xJtg4", "bUya0H86JSXRIIoahVHYTIdtcqgWtSBf", "i4ePvK4hrBrPNKxpSWALXVVM3"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(SQLiteDatabase sQLiteDatabase, int i4, String str) throws C5N {
        try {
            if (!C5C.A19(sQLiteDatabase, A01(159, 17, 73))) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query(A01(159, 17, 73), new String[]{A01(244, 7, 93)}, A01(183, 32, 22), A05(i4, str), null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return -1;
                }
                cursorQuery.moveToNext();
                int i10 = cursorQuery.getInt(0);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return i10;
            } finally {
            }
        } catch (SQLException e2) {
            throw new C5N(e2);
        }
    }

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{53, 36, 51, 55, 34, 51, 86, 34, 55, 52, 58, 51, 86, Utf8.REPLACEMENT_BYTE, 48, 86, 56, 57, 34, 86, 51, 46, Utf8.REPLACEMENT_BYTE, 37, 34, 37, 86, 51, 14, 25, 38, 26, 23, 15, 19, 4, 32, 19, 4, 5, 31, 25, 24, 5, 86, 94, 16, 19, 23, 2, 3, 4, 19, 86, Utf8.REPLACEMENT_BYTE, 56, 34, 51, 49, 51, 36, 86, 56, 57, 34, 86, 56, 35, 58, 58, 90, 31, 24, 5, 2, 23, 24, 21, 19, 41, 3, 31, 18, 86, 34, 51, 46, 34, 86, 56, 57, 34, 86, 56, 35, 58, 58, 90, 0, 19, 4, 5, 31, 25, 24, 86, Utf8.REPLACEMENT_BYTE, 56, 34, 51, 49, 51, 36, 86, 56, 57, 34, 86, 56, 35, 58, 58, 90, 38, 36, Utf8.REPLACEMENT_BYTE, 59, 55, 36, 47, 86, 61, 51, 47, 86, 94, 16, 19, 23, 2, 3, 4, 19, 90, 86, 31, 24, 5, 2, 23, 24, 21, 19, 41, 3, 31, 18, 95, 95, 29, 32, 55, 8, 52, 57, 33, 61, 42, 14, 61, 42, 43, 49, 55, 54, 43, 103, 100, 96, 117, 116, 115, 100, 97, 98, 102, 115, 114, 117, 98, 39, 58, 39, 56, 39, 70, 73, 67, 39, 110, 105, 116, 115, 102, 105, 100, 98, 88, 114, 110, 99, 39, 58, 39, 56, 64, 72, 72, 64, 9, 66, 95, 72, 9, 67, 70, 83, 70, 69, 70, 84, 66, 9, 14, 19, 20, 1, 14, 3, 5, Utf8.REPLACEMENT_BYTE, 21, 9, 4, 58, 41, 62, Utf8.REPLACEMENT_BYTE, 37, 35, 34};
        String[] strArr = A01;
        if (strArr[6].charAt(14) == strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        A01[7] = "SNjSmBwt36dpbjCWXjm4KdaDp";
    }

    static {
        A02();
        AnonymousClass35.A03(A01(215, 17, 54));
    }

    public static void A03(SQLiteDatabase sQLiteDatabase, int i4, String str) throws C5N {
        String strA01 = A01(159, 17, 73);
        try {
            if (!C5C.A19(sQLiteDatabase, strA01)) {
                return;
            }
            sQLiteDatabase.delete(strA01, A01(183, 32, 22), A05(i4, str));
        } catch (SQLException e2) {
            throw new C5N(e2);
        }
    }

    public static void A04(SQLiteDatabase sQLiteDatabase, int i4, String str, int i10) throws C5N, SQLException {
        try {
            sQLiteDatabase.execSQL(A01(0, 159, FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT));
            ContentValues contentValues = new ContentValues();
            contentValues.put(A01(176, 7, 16), Integer.valueOf(i4));
            contentValues.put(A01(232, 12, AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID), str);
            contentValues.put(A01(244, 7, 93), Integer.valueOf(i10));
            sQLiteDatabase.replaceOrThrow(A01(159, 17, 73), null, contentValues);
        } catch (SQLException e2) {
            throw new C5N(e2);
        }
    }

    public static String[] A05(int i4, String str) {
        return new String[]{Integer.toString(i4), str};
    }
}
