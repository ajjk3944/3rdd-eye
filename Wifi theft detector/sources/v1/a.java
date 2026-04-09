package v1;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import java.util.List;
import u1.f;

/* loaded from: classes.dex */
public class a implements u1.b {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f24680b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f24681c = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f24682a;

    /* renamed from: v1.a$a, reason: collision with other inner class name */
    public class C0491a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u1.e f24683a;

        public C0491a(u1.e eVar) {
            this.f24683a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f24683a.e(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u1.e f24685a;

        public b(u1.e eVar) {
            this.f24685a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f24685a.e(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f24682a = sQLiteDatabase;
    }

    @Override // u1.b
    public void B() {
        this.f24682a.setTransactionSuccessful();
    }

    @Override // u1.b
    public void C(String str, Object[] objArr) throws SQLException {
        this.f24682a.execSQL(str, objArr);
    }

    @Override // u1.b
    public void E() {
        this.f24682a.endTransaction();
    }

    @Override // u1.b
    public f J(String str) {
        return new e(this.f24682a.compileStatement(str));
    }

    @Override // u1.b
    public Cursor M(u1.e eVar) {
        return this.f24682a.rawQueryWithFactory(new C0491a(eVar), eVar.d(), f24681c, null);
    }

    @Override // u1.b
    public Cursor O(String str) {
        return M(new u1.a(str));
    }

    @Override // u1.b
    public boolean S() {
        return this.f24682a.inTransaction();
    }

    @Override // u1.b
    public Cursor T(u1.e eVar, CancellationSignal cancellationSignal) {
        return this.f24682a.rawQueryWithFactory(new b(eVar), eVar.d(), f24681c, null, cancellationSignal);
    }

    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f24682a == sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24682a.close();
    }

    @Override // u1.b
    public String getPath() {
        return this.f24682a.getPath();
    }

    @Override // u1.b
    public boolean isOpen() {
        return this.f24682a.isOpen();
    }

    @Override // u1.b
    public void u() {
        this.f24682a.beginTransaction();
    }

    @Override // u1.b
    public List x() {
        return this.f24682a.getAttachedDbs();
    }

    @Override // u1.b
    public void y(String str) throws SQLException {
        this.f24682a.execSQL(str);
    }
}
