package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public interface ouw {
    int ouw(Uri uri, ContentValues contentValues, String str, String[] strArr);

    int ouw(Uri uri, String str, String[] strArr);

    Cursor ouw(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    Uri ouw(Uri uri, ContentValues contentValues);

    String ouw();

    String ouw(Uri uri);
}
