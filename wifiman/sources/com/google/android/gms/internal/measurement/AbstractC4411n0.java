package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.internal.measurement.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4411n0 extends SQLiteOpenHelper {
    public AbstractC4411n0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        this(context, str, null, 1, AbstractC4442r0.f35442a);
    }

    private AbstractC4411n0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10, AbstractC4442r0 abstractC4442r0) {
        super(context, (str == null || AbstractC4379j0.a().d(str, abstractC4442r0, EnumC4427p0.SQLITE_OPEN_HELPER_TYPE).equals("")) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
