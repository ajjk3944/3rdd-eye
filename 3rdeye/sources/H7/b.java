package H7;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* compiled from: AndroidDatabaseOpenHelper.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0038b f2276a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2277b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2278c;

    /* compiled from: AndroidDatabaseOpenHelper.kt */
    public final class a implements d {

        /* renamed from: b, reason: collision with root package name */
        public final SQLiteDatabase f2279b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f2280c;

        public a(b bVar, SQLiteDatabase mDb, c cVar) {
            kotlin.jvm.internal.l.f(mDb, "mDb");
            this.f2280c = bVar;
            this.f2279b = mDb;
        }

        @Override // H7.d
        public final Cursor V(String query, String[] strArr) {
            kotlin.jvm.internal.l.f(query, "query");
            Cursor cursorRawQuery = this.f2279b.rawQuery(query, strArr);
            kotlin.jvm.internal.l.e(cursorRawQuery, "mDb.rawQuery(query, selectionArgs)");
            return cursorRawQuery;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            C0038b c0038b = this.f2280c.f2276a;
            SQLiteDatabase mDb = this.f2279b;
            synchronized (c0038b) {
                try {
                    kotlin.jvm.internal.l.f(mDb, "mDb");
                    if (mDb.equals(c0038b.f2287g)) {
                        c0038b.f2285e.remove(Thread.currentThread());
                        if (c0038b.f2285e.isEmpty()) {
                            while (true) {
                                int i = c0038b.f2286f;
                                c0038b.f2286f = i - 1;
                                if (i <= 0) {
                                    break;
                                }
                                SQLiteDatabase sQLiteDatabase = c0038b.f2287g;
                                kotlin.jvm.internal.l.c(sQLiteDatabase);
                                sQLiteDatabase.close();
                            }
                        }
                    } else if (mDb.equals(c0038b.f2284d)) {
                        c0038b.f2282b.remove(Thread.currentThread());
                        if (c0038b.f2282b.isEmpty()) {
                            while (true) {
                                int i10 = c0038b.f2283c;
                                c0038b.f2283c = i10 - 1;
                                if (i10 <= 0) {
                                    break;
                                }
                                SQLiteDatabase sQLiteDatabase2 = c0038b.f2284d;
                                kotlin.jvm.internal.l.c(sQLiteDatabase2);
                                sQLiteDatabase2.close();
                            }
                        }
                    } else {
                        mDb.close();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // H7.d
        public final void r() {
            this.f2279b.beginTransaction();
        }

        @Override // H7.d
        public final SQLiteStatement t(String sql) throws SQLException {
            kotlin.jvm.internal.l.f(sql, "sql");
            SQLiteStatement sQLiteStatementCompileStatement = this.f2279b.compileStatement(sql);
            kotlin.jvm.internal.l.e(sQLiteStatementCompileStatement, "mDb.compileStatement(sql)");
            return sQLiteStatementCompileStatement;
        }

        @Override // H7.d
        public final void u() {
            this.f2279b.setTransactionSuccessful();
        }

        @Override // H7.d
        public final void v() {
            this.f2279b.endTransaction();
        }
    }

    /* compiled from: AndroidDatabaseOpenHelper.kt */
    /* renamed from: H7.b$b, reason: collision with other inner class name */
    public static final class C0038b {

        /* renamed from: a, reason: collision with root package name */
        public final H7.a f2281a;

        /* renamed from: c, reason: collision with root package name */
        public int f2283c;

        /* renamed from: d, reason: collision with root package name */
        public SQLiteDatabase f2284d;

        /* renamed from: f, reason: collision with root package name */
        public int f2286f;

        /* renamed from: g, reason: collision with root package name */
        public SQLiteDatabase f2287g;

        /* renamed from: b, reason: collision with root package name */
        public final LinkedHashSet f2282b = new LinkedHashSet();

        /* renamed from: e, reason: collision with root package name */
        public final LinkedHashSet f2285e = new LinkedHashSet();

        public C0038b(H7.a aVar) {
            this.f2281a = aVar;
        }
    }

    /* compiled from: AndroidDatabaseOpenHelper.kt */
    public static final class c {
    }

    public b(Context context, String str, F7.j jVar, F7.k kVar) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f2277b = new Object();
        this.f2278c = new HashMap();
        this.f2276a = new C0038b(new H7.a(context, str, jVar, this, kVar));
    }

    public final a a(SQLiteDatabase sqLiteDatabase) {
        c cVar;
        kotlin.jvm.internal.l.f(sqLiteDatabase, "sqLiteDatabase");
        synchronized (this.f2277b) {
            cVar = (c) this.f2278c.get(sqLiteDatabase);
            if (cVar == null) {
                cVar = new c();
                this.f2278c.put(sqLiteDatabase, cVar);
            }
        }
        return new a(this, sqLiteDatabase, cVar);
    }
}
