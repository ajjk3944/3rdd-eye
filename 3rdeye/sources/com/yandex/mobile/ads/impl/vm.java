package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
final class vm {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f34619c = {AppMeasurementSdk.ConditionalUserProperty.NAME, "length", "last_touch_timestamp"};

    /* renamed from: a, reason: collision with root package name */
    private final uv f34620a;

    /* renamed from: b, reason: collision with root package name */
    private String f34621b;

    public vm(f60 f60Var) {
        this.f34620a = f60Var;
    }

    public final HashMap a() throws tv {
        try {
            this.f34621b.getClass();
            Cursor cursorQuery = this.f34620a.getReadableDatabase().query(this.f34621b, f34619c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new um(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } finally {
            }
        } catch (Throwable th) {
            throw new tv(th);
        }
    }

    public final void a(long j4) throws tv {
        try {
            String hexString = Long.toHexString(j4);
            this.f34621b = "ExoPlayerCacheFileMetadata" + hexString;
            if (wa2.a(this.f34620a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f34620a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    wa2.a(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f34621b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f34621b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (Throwable th) {
            throw new tv(th);
        }
    }

    public final void a(String str) throws tv {
        this.f34621b.getClass();
        try {
            this.f34620a.getWritableDatabase().delete(this.f34621b, "name = ?", new String[]{str});
        } catch (Throwable th) {
            throw new tv(th);
        }
    }

    public final void a(Set<String> set) throws tv {
        this.f34621b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f34620a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f34621b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            throw new tv(th2);
        }
    }

    public final void a(String str, long j4, long j10) throws tv {
        this.f34621b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f34620a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
            contentValues.put("length", Long.valueOf(j4));
            contentValues.put("last_touch_timestamp", Long.valueOf(j10));
            writableDatabase.replaceOrThrow(this.f34621b, null, contentValues);
        } catch (Throwable th) {
            throw new tv(th);
        }
    }
}
