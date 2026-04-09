package com.bytedance.sdk.component.le.ouw.ouw.ouw;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.ouw.ouw.vt;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    public static int ouw(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
            return ouw.ouw(context).ouw().ouw(str, str2, strArr);
        } catch (Throwable unused) {
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
            return 0;
        }
    }

    public static int ouw(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return ouw.ouw(context).ouw().ouw(str, contentValues, str2, strArr);
        } catch (Throwable unused) {
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
            return 0;
        }
    }

    public static Cursor ouw(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return ouw.ouw(context).ouw().ouw(str, strArr, str2, strArr2, null, null, str3);
        } catch (Throwable unused) {
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
            return null;
        }
    }

    public static void ouw(Context context, String str) {
        boolean zVt;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            vt.C0055vt c0055vtOuw = ouw.ouw(context).ouw();
            String strDecode = Uri.decode(str);
            try {
                c0055vtOuw.ouw();
                c0055vtOuw.ouw.execSQL(strDecode);
            } finally {
                if (!zVt) {
                }
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        }
    }
}
