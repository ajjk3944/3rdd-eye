package F3;

import B3.a;
import B3.c;
import C.f0;
import G3.b;
import a9.InterfaceC1676a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import v3.C5677c;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
public final class m implements d, G3.b, c {

    /* renamed from: g, reason: collision with root package name */
    public static final C5677c f1618g = new C5677c("proto");

    /* renamed from: b, reason: collision with root package name */
    public final s f1619b;

    /* renamed from: c, reason: collision with root package name */
    public final H3.a f1620c;

    /* renamed from: d, reason: collision with root package name */
    public final H3.a f1621d;

    /* renamed from: e, reason: collision with root package name */
    public final e f1622e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1676a<String> f1623f;

    /* compiled from: SQLiteEventStore.java */
    public interface a<T, U> {
        U apply(T t10);
    }

    /* compiled from: SQLiteEventStore.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f1624a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1625b;

        public b(String str, String str2) {
            this.f1624a = str;
            this.f1625b = str2;
        }
    }

    public m(H3.a aVar, H3.a aVar2, e eVar, s sVar, InterfaceC1676a<String> interfaceC1676a) {
        this.f1619b = sVar;
        this.f1620c = aVar;
        this.f1621d = aVar2;
        this.f1622e = eVar;
        this.f1623f = interfaceC1676a;
    }

    public static String B(Iterable<g> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<g> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T D(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long l(SQLiteDatabase sQLiteDatabase, y3.j jVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f48075a, String.valueOf(I3.a.a(jVar.f48077c))));
        byte[] bArr = jVar.f48076b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            Cursor cursor = cursorQuery;
            return !cursor.moveToNext() ? null : Long.valueOf(cursor.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final ArrayList A(SQLiteDatabase sQLiteDatabase, y3.j jVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long l5 = l(sQLiteDatabase, jVar);
        if (l5 == null) {
            return arrayList;
        }
        D(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{l5.toString()}, null, null, null, String.valueOf(i)), new D3.b(this, (Object) arrayList, jVar, 2));
        return arrayList;
    }

    @Override // F3.d
    public final void E0(Iterable<g> iterable) {
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + B(iterable);
            SQLiteDatabase sQLiteDatabaseK = k();
            sQLiteDatabaseK.beginTransaction();
            try {
                sQLiteDatabaseK.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseK.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                try {
                    Cursor cursor = cursorRawQuery;
                    while (cursor.moveToNext()) {
                        c(cursor.getInt(0), c.a.MAX_RETRIES_REACHED, cursor.getString(1));
                    }
                    cursorRawQuery.close();
                    sQLiteDatabaseK.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    sQLiteDatabaseK.setTransactionSuccessful();
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            } finally {
                sQLiteDatabaseK.endTransaction();
            }
        }
    }

    @Override // F3.d
    public final Iterable H(y3.j jVar) {
        return (Iterable) n(new f0(2, this, jVar));
    }

    @Override // F3.d
    public final F3.b M0(y3.j jVar, y3.m mVar) {
        String strK = mVar.k();
        String strC = C3.a.c("SQLiteEventStore");
        if (Log.isLoggable(strC, 3)) {
            Log.d(strC, "Storing event with priority=" + jVar.f48077c + ", name=" + strK + " for destination " + jVar.f48075a);
        }
        long jLongValue = ((Long) n(new D3.b(this, (Object) mVar, jVar, 1))).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new F3.b(jLongValue, jVar, mVar);
    }

    @Override // F3.d
    public final Iterable<y3.r> N() {
        return (Iterable) n(new B4.h(3));
    }

    @Override // F3.d
    public final void O(final long j4, final y3.j jVar) {
        n(new a() { // from class: F3.i
            @Override // F3.m.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j4));
                y3.j jVar2 = jVar;
                v3.e eVar = jVar2.f48077c;
                String strValueOf = String.valueOf(I3.a.a(eVar));
                String str = jVar2.f48075a;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, strValueOf}) < 1) {
                    contentValues.put("backend_name", str);
                    contentValues.put("priority", Integer.valueOf(I3.a.a(eVar)));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // F3.c
    public final void a() {
        SQLiteDatabase sQLiteDatabaseK = k();
        sQLiteDatabaseK.beginTransaction();
        try {
            sQLiteDatabaseK.compileStatement("DELETE FROM log_event_dropped").execute();
            sQLiteDatabaseK.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f1620c.b()).execute();
            sQLiteDatabaseK.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseK.endTransaction();
        }
    }

    @Override // F3.c
    public final void c(long j4, c.a aVar, String str) {
        n(new j(str, j4, aVar));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1619b.close();
    }

    @Override // F3.c
    public final B3.a d() {
        int i = B3.a.f460e;
        a.C0002a c0002a = new a.C0002a();
        c0002a.f465a = null;
        c0002a.f466b = new ArrayList();
        c0002a.f467c = null;
        c0002a.f468d = "";
        HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseK = k();
        sQLiteDatabaseK.beginTransaction();
        try {
            B3.a aVar = (B3.a) D(sQLiteDatabaseK.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new k(this, map, c0002a));
            sQLiteDatabaseK.setTransactionSuccessful();
            return aVar;
        } finally {
            sQLiteDatabaseK.endTransaction();
        }
    }

    @Override // G3.b
    public final <T> T e(b.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseK = k();
        H3.a aVar2 = this.f1621d;
        long jB = aVar2.b();
        while (true) {
            try {
                sQLiteDatabaseK.beginTransaction();
                try {
                    T tExecute = aVar.execute();
                    sQLiteDatabaseK.setTransactionSuccessful();
                    return tExecute;
                } finally {
                    sQLiteDatabaseK.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e4) {
                if (aVar2.b() >= this.f1622e.a() + jB) {
                    throw new G3.a("Timed out while trying to acquire the lock.", e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // F3.d
    public final long e0(y3.r rVar) {
        Cursor cursorRawQuery = k().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{rVar.b(), String.valueOf(I3.a.a(rVar.d()))});
        try {
            Cursor cursor = cursorRawQuery;
            Long lValueOf = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            cursorRawQuery.close();
            return lValueOf.longValue();
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // F3.d
    public final boolean j0(y3.j jVar) {
        Boolean bool;
        SQLiteDatabase sQLiteDatabaseK = k();
        sQLiteDatabaseK.beginTransaction();
        try {
            Long l5 = l(sQLiteDatabaseK, jVar);
            if (l5 == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor cursorRawQuery = k().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{l5.toString()});
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    bool = boolValueOf;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            sQLiteDatabaseK.setTransactionSuccessful();
            sQLiteDatabaseK.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th2) {
            sQLiteDatabaseK.endTransaction();
            throw th2;
        }
    }

    public final SQLiteDatabase k() {
        s sVar = this.f1619b;
        Objects.requireNonNull(sVar);
        H3.a aVar = this.f1621d;
        long jB = aVar.b();
        while (true) {
            try {
                return sVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e4) {
                if (aVar.b() >= this.f1622e.a() + jB) {
                    throw new G3.a("Timed out while trying to open db.", e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final <T> T n(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase sQLiteDatabaseK = k();
        sQLiteDatabaseK.beginTransaction();
        try {
            T tApply = aVar.apply(sQLiteDatabaseK);
            sQLiteDatabaseK.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseK.endTransaction();
        }
    }

    @Override // F3.d
    public final int s() {
        long jB = this.f1620c.b() - this.f1622e.b();
        SQLiteDatabase sQLiteDatabaseK = k();
        sQLiteDatabaseK.beginTransaction();
        try {
            String[] strArr = {String.valueOf(jB)};
            Cursor cursorRawQuery = sQLiteDatabaseK.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
            try {
                Cursor cursor = cursorRawQuery;
                while (cursor.moveToNext()) {
                    c(cursor.getInt(0), c.a.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                cursorRawQuery.close();
                int iDelete = sQLiteDatabaseK.delete("events", "timestamp_ms < ?", strArr);
                sQLiteDatabaseK.setTransactionSuccessful();
                return iDelete;
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        } finally {
            sQLiteDatabaseK.endTransaction();
        }
    }

    @Override // F3.d
    public final void z(Iterable<g> iterable) {
        if (iterable.iterator().hasNext()) {
            k().compileStatement("DELETE FROM events WHERE _id in " + B(iterable)).execute();
        }
    }
}
