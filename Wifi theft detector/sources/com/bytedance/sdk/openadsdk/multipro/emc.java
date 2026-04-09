package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public interface emc {
    int emc(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr);

    int emc(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr);

    Cursor emc(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2);

    Uri emc(@NonNull Uri uri, @Nullable ContentValues contentValues);

    @NonNull
    String emc();

    String emc(@NonNull Uri uri);
}
