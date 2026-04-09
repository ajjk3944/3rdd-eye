package s2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.r;
import r2.C7558a;
import r2.C7559b;

/* renamed from: s2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7880c implements SupportSQLiteDatabase {

    /* renamed from: b, reason: collision with root package name */
    public static final a f61142b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f61143c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f61144d = new String[0];

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f61145a;

    /* renamed from: s2.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: s2.c$b */
    static final class b extends AbstractC6494u implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SupportSQLiteQuery f61146a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SupportSQLiteQuery supportSQLiteQuery) {
            super(4);
            this.f61146a = supportSQLiteQuery;
        }

        @Override // mh.r
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor y(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            SupportSQLiteQuery supportSQLiteQuery = this.f61146a;
            AbstractC6492s.f(sQLiteQuery);
            supportSQLiteQuery.a(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C7880c(SQLiteDatabase delegate) {
        AbstractC6492s.i(delegate, "delegate");
        this.f61145a = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor j(r tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (Cursor) tmp0.y(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor p(SupportSQLiteQuery query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AbstractC6492s.i(query, "$query");
        AbstractC6492s.f(sQLiteQuery);
        query.a(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.f61145a.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.f61145a.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f61145a.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public SupportSQLiteStatement compileStatement(String sql) throws SQLException {
        AbstractC6492s.i(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f61145a.compileStatement(sql);
        AbstractC6492s.h(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new h(sQLiteStatementCompileStatement);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.f61145a.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(String sql) throws SQLException {
        AbstractC6492s.i(sql, "sql");
        this.f61145a.execSQL(sql);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public List getAttachedDbs() {
        return this.f61145a.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public String getPath() {
        return this.f61145a.getPath();
    }

    public final boolean h(SQLiteDatabase sqLiteDatabase) {
        AbstractC6492s.i(sqLiteDatabase, "sqLiteDatabase");
        return AbstractC6492s.d(this.f61145a, sqLiteDatabase);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.f61145a.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(String table, int i10, ContentValues values) {
        AbstractC6492s.i(table, "table");
        AbstractC6492s.i(values, "values");
        return this.f61145a.insertWithOnConflict(table, null, values, i10);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.f61145a.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isWriteAheadLoggingEnabled() {
        return C7559b.b(this.f61145a);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(String query) {
        AbstractC6492s.i(query, "query");
        return query(new C7558a(query));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.f61145a.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(String table, int i10, ContentValues values, String str, Object[] objArr) throws SQLException {
        AbstractC6492s.i(table, "table");
        AbstractC6492s.i(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(f61143c[i10]);
        sb2.append(table);
        sb2.append(" SET ");
        int i11 = 0;
        for (String str2 : values.keySet()) {
            sb2.append(i11 > 0 ? "," : "");
            sb2.append(str2);
            objArr2[i11] = values.get(str2);
            sb2.append("=?");
            i11++;
        }
        if (objArr != null) {
            for (int i12 = size; i12 < length; i12++) {
                objArr2[i12] = objArr[i12 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = compileStatement(string);
        C7558a.f60046c.b(supportSQLiteStatementCompileStatement, objArr2);
        return supportSQLiteStatementCompileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(SupportSQLiteQuery query) {
        AbstractC6492s.i(query, "query");
        final b bVar = new b(query);
        Cursor cursorRawQueryWithFactory = this.f61145a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: s2.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return C7880c.j(bVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.h(), f61144d, null);
        AbstractC6492s.h(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        AbstractC6492s.i(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f61145a;
        String strH = query.h();
        String[] strArr = f61144d;
        AbstractC6492s.f(cancellationSignal);
        return C7559b.c(sQLiteDatabase, strH, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: s2.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return C7880c.p(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }
}
