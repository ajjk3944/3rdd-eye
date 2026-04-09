package H0;

import A2.C0117e;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1731b = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f1732a;

    public c(SQLiteDatabase sQLiteDatabase) {
        this.f1732a = sQLiteDatabase;
    }

    public final void a() {
        this.f1732a.beginTransaction();
    }

    public final void b() {
        this.f1732a.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1732a.close();
    }

    public final j d(String str) throws SQLException {
        q5.i.e(str, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f1732a.compileStatement(str);
        q5.i.d(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new j(sQLiteStatementCompileStatement);
    }

    public final void e() {
        this.f1732a.endTransaction();
    }

    public final void h(String str) throws SQLException {
        q5.i.e(str, "sql");
        this.f1732a.execSQL(str);
    }

    public final boolean isOpen() {
        return this.f1732a.isOpen();
    }

    public final void k(Object[] objArr) throws SQLException {
        q5.i.e(objArr, "bindArgs");
        this.f1732a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean m() {
        return this.f1732a.inTransaction();
    }

    public final boolean n() {
        SQLiteDatabase sQLiteDatabase = this.f1732a;
        q5.i.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor o(G0.d dVar) {
        final b bVar = new b(dVar);
        Cursor cursorRawQueryWithFactory = this.f1732a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: H0.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                G0.d dVar2 = bVar.f1730b;
                q5.i.b(sQLiteQuery);
                dVar2.q(new i(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, dVar.n(), f1731b, null);
        q5.i.d(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    public final Cursor p(String str) {
        q5.i.e(str, "query");
        return o(new C0117e(str));
    }

    public final void q() {
        this.f1732a.setTransactionSuccessful();
    }
}
