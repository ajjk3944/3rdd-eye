package p7;

import a1.o;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import br.l;
import bu.t;

/* loaded from: classes.dex */
public final class b implements o7.a {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f20315d = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f20316a;

    public b(SQLiteDatabase sQLiteDatabase) {
        this.f20316a = sQLiteDatabase;
    }

    @Override // o7.a
    public final void C() {
        this.f20316a.setTransactionSuccessful();
    }

    @Override // o7.a
    public final void E() {
        this.f20316a.beginTransactionNonExclusive();
    }

    @Override // o7.a
    public final void K() {
        this.f20316a.endTransaction();
    }

    @Override // o7.a
    public final boolean X() {
        return this.f20316a.inTransaction();
    }

    public final Cursor b(String str) {
        l.e(str, "query");
        return t(new t(str));
    }

    @Override // o7.a
    public final boolean c0() {
        SQLiteDatabase sQLiteDatabase = this.f20316a;
        l.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20316a.close();
    }

    @Override // o7.a
    public final void j() {
        this.f20316a.beginTransaction();
    }

    @Override // o7.a
    public final void l(String str) {
        l.e(str, "sql");
        this.f20316a.execSQL(str);
    }

    @Override // o7.a
    public final o7.e o(String str) throws SQLException {
        l.e(str, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f20316a.compileStatement(str);
        l.d(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new k(sQLiteStatementCompileStatement);
    }

    @Override // o7.a
    public final Cursor t(o7.d dVar) {
        final o oVar = new o(1, dVar);
        Cursor cursorRawQueryWithFactory = this.f20316a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: p7.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) oVar.l(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, dVar.f(), f20315d, null);
        l.d(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }
}
