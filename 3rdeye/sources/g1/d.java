package G1;

import F1.a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import b9.C2001h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l;

/* compiled from: FrameworkSQLiteDatabase.android.kt */
/* loaded from: classes.dex */
public final class d implements F1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f1862c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f1863d = new String[0];

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1864e;

    /* renamed from: f, reason: collision with root package name */
    public static final Object f1865f;

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f1866b;

    /* compiled from: FrameworkSQLiteDatabase.android.kt */
    public static final class a {
    }

    static {
        b9.i iVar = b9.i.NONE;
        f1864e = C2001h.a(iVar, new B8.a(1));
        f1865f = C2001h.a(iVar, new c(0));
    }

    public d(SQLiteDatabase sQLiteDatabase) {
        this.f1866b = sQLiteDatabase;
    }

    @Override // F1.b
    public final void C(String sql) throws SQLException {
        l.f(sql, "sql");
        this.f1866b.execSQL(sql);
    }

    @Override // F1.b
    public final Cursor E(F1.e eVar) {
        final G1.a aVar = new G1.a(eVar);
        Cursor cursorRawQueryWithFactory = this.f1866b.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: G1.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                a aVar2 = aVar;
                l.c(sQLiteQuery);
                aVar2.f1859b.a(new i(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.c(), f1863d, null);
        l.e(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // F1.b
    public final int G0(ContentValues contentValues, Object[] objArr) throws SQLException {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(f1862c[3]);
        sb.append("WorkSpec SET ");
        int i = 0;
        for (String str : contentValues.keySet()) {
            sb.append(i > 0 ? StringUtils.COMMA : "");
            sb.append(str);
            objArr2[i] = contentValues.get(str);
            sb.append("=?");
            i++;
        }
        for (int i10 = size; i10 < length; i10++) {
            objArr2[i10] = objArr[i10 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        F1.f fVarT = t(sb.toString());
        a.C0025a.a(fVarT, objArr2);
        return ((j) fVarT).f1890c.executeUpdateDelete();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [b9.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [b9.g, java.lang.Object] */
    @Override // F1.b
    public final void J() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ?? r22 = f1865f;
        if (((Method) r22.getValue()) != null) {
            ?? r32 = f1864e;
            if (((Method) r32.getValue()) != null) {
                Method method = (Method) r22.getValue();
                l.c(method);
                Method method2 = (Method) r32.getValue();
                l.c(method2);
                Object objInvoke = method2.invoke(this.f1866b, new Object[0]);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        r();
    }

    @Override // F1.b
    public final void U(Object[] objArr) throws SQLException {
        this.f1866b.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // F1.b
    public final void Y() {
        this.f1866b.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1866b.close();
    }

    @Override // F1.b
    public final boolean isOpen() {
        return this.f1866b.isOpen();
    }

    @Override // F1.b
    public final void r() {
        this.f1866b.beginTransaction();
    }

    @Override // F1.b
    public final boolean s0() {
        return this.f1866b.inTransaction();
    }

    @Override // F1.b
    public final F1.f t(String sql) throws SQLException {
        l.f(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f1866b.compileStatement(sql);
        l.e(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new j(sQLiteStatementCompileStatement);
    }

    @Override // F1.b
    public final void u() {
        this.f1866b.setTransactionSuccessful();
    }

    @Override // F1.b
    public final void v() {
        this.f1866b.endTransaction();
    }

    @Override // F1.b
    public final boolean z0() {
        return this.f1866b.isWriteAheadLoggingEnabled();
    }
}
