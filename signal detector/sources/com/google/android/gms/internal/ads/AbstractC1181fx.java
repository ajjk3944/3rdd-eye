package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.internal.ads.fx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1181fx extends SQLiteOpenHelper {
    public AbstractC1181fx(Context context, int i, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, i);
    }
}
