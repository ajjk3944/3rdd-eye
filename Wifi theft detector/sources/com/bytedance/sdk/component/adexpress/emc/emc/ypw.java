package com.bytedance.sdk.component.adexpress.emc.emc;

import android.content.ContentValues;
import android.database.Cursor;

/* loaded from: classes.dex */
public interface ypw {
    int emc(String str, ContentValues contentValues, String str2, String[] strArr);

    int emc(String str, String str2, String[] strArr);

    Cursor emc(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5);

    void emc(String str, ContentValues contentValues);
}
