package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c9.C2097r;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.mn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4803mn implements TempCacheStorage {

    /* renamed from: a, reason: collision with root package name */
    public final Q6 f41273a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41274b;

    /* renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f41275c = new SystemTimeProvider();

    public C4803mn(Q6 q62, String str) {
        this.f41273a = q62;
        this.f41274b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<TempCacheStorage.Entry> get(String str, int i) {
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabaseA;
        SQLiteDatabase sQLiteDatabase;
        C4855on c4855on;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            sQLiteDatabaseA = this.f41273a.a();
            sQLiteDatabase = sQLiteDatabaseA;
        } catch (Throwable unused) {
            cursorQuery = null;
        }
        if (sQLiteDatabaseA != 0) {
            try {
                cursorQuery = sQLiteDatabaseA.query(false, this.f41274b, null, "scope=?", new String[]{str}, null, null, FacebookMediationAdapter.KEY_ID, String.valueOf(i));
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        try {
                            try {
                                c4855on = new C4855on(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(FacebookMediationAdapter.KEY_ID)), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("scope")), cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("timestamp")), cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("data")));
                            } catch (Throwable unused2) {
                                c4855on = null;
                            }
                            if (c4855on != null) {
                                arrayList.add(c4855on);
                            }
                        } catch (Throwable unused3) {
                            cursor = sQLiteDatabaseA;
                            sQLiteDatabaseA = cursor;
                            cursor = cursorQuery;
                            sQLiteDatabase = sQLiteDatabaseA;
                            AbstractC4623fo.a(cursor);
                            this.f41273a.a(sQLiteDatabase);
                            return arrayList;
                        }
                    }
                }
            } catch (Throwable unused4) {
                cursorQuery = null;
            }
            cursor = cursorQuery;
            sQLiteDatabase = sQLiteDatabaseA;
        }
        AbstractC4623fo.a(cursor);
        this.f41273a.a(sQLiteDatabase);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(String str, long j4, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseA;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = this.f41273a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("scope", str);
                    contentValues.put("timestamp", Long.valueOf(j4));
                    contentValues.put("data", bArr);
                    long jInsertOrThrow = sQLiteDatabaseA.insertOrThrow(this.f41274b, null, contentValues);
                    this.f41273a.a(sQLiteDatabaseA);
                    return jInsertOrThrow;
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    sQLiteDatabaseA = sQLiteDatabase;
                    this.f41273a.a(sQLiteDatabaseA);
                    return -1L;
                }
            }
        } catch (Throwable unused2) {
        }
        this.f41273a.a(sQLiteDatabaseA);
        return -1L;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j4) {
        a("id=?", new String[]{String.valueOf(j4)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(String str, long j4) {
        a("scope=? AND timestamp<?", new String[]{str, String.valueOf(this.f41275c.currentTimeMillis() - j4)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final TempCacheStorage.Entry get(String str) {
        return (TempCacheStorage.Entry) C2097r.q0(get(str, 1));
    }

    public final void a(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabaseA;
        try {
            sQLiteDatabaseA = this.f41273a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.delete(this.f41274b, str, strArr);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseA = null;
        }
        this.f41273a.a(sQLiteDatabaseA);
    }
}
