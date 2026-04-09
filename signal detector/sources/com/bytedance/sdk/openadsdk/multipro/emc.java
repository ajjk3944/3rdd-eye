package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
public interface emc {
    int emc(Uri uri, ContentValues contentValues, String str, String[] strArr);

    int emc(Uri uri, String str, String[] strArr);

    Cursor emc(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    Uri emc(Uri uri, ContentValues contentValues);

    String emc();

    String emc(Uri uri);
}
