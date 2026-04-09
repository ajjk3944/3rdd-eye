package f6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import nk.k;
import nm.d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements e6.a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f23659b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f23660c = new String[0];

    /* renamed from: d, reason: collision with root package name */
    public static final Object f23661d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f23662e;

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f23663a;

    static {
        b6.a aVar = new b6.a(10);
        yj.g gVar = yj.g.f37636b;
        f23661d = a.a.t(gVar, aVar);
        f23662e = a.a.t(gVar, new b6.a(11));
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        this.f23663a = sQLiteDatabase;
    }

    @Override // e6.a
    public final void B() {
        this.f23663a.endTransaction();
    }

    @Override // e6.a
    public final boolean K() {
        return this.f23663a.inTransaction();
    }

    @Override // e6.a
    public final boolean M() {
        return this.f23663a.isWriteAheadLoggingEnabled();
    }

    @Override // e6.a
    public final int R(ContentValues contentValues, Object[] objArr) throws SQLException {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(f23659b[3]);
        sb2.append("WorkSpec SET ");
        int i4 = 0;
        int i10 = 0;
        for (String str : contentValues.keySet()) {
            sb2.append(i10 > 0 ? "," : "");
            sb2.append(str);
            objArr2[i10] = contentValues.get(str);
            sb2.append("=?");
            i10++;
        }
        for (int i11 = size; i11 < length; i11++) {
            objArr2[i11] = objArr[i11 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb2.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        j jVarL = l(sb2.toString());
        while (i4 < length) {
            Object obj = objArr2[i4];
            i4++;
            if (obj == null) {
                jVarL.d(i4);
            } else if (obj instanceof byte[]) {
                jVarL.f23687a.bindBlob(i4, (byte[]) obj);
            } else if (obj instanceof Float) {
                jVarL.H(((Number) obj).floatValue(), i4);
            } else if (obj instanceof Double) {
                jVarL.H(((Number) obj).doubleValue(), i4);
            } else if (obj instanceof Long) {
                jVarL.a(i4, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                jVarL.a(i4, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                jVarL.a(i4, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                jVarL.a(i4, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                jVarL.k(i4, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i4 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                jVarL.a(i4, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return jVarL.f23688b.executeUpdateDelete();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23663a.close();
    }

    @Override // e6.a
    public final void f() {
        this.f23663a.beginTransaction();
    }

    @Override // e6.a
    public final Cursor h(d0 d0Var) {
        final a aVar = new a(0, d0Var);
        Cursor cursorRawQueryWithFactory = this.f23663a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: f6.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) aVar.b(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, ((w5.e) d0Var.f30011b).f36485b, f23660c, null);
        k.d(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // e6.a
    public final boolean isOpen() {
        return this.f23663a.isOpen();
    }

    @Override // e6.a
    public final void j(String str) throws SQLException {
        k.e(str, "sql");
        this.f23663a.execSQL(str);
    }

    @Override // e6.a
    public final j l(String str) throws SQLException {
        k.e(str, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f23663a.compileStatement(str);
        k.d(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new j(sQLiteStatementCompileStatement);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yj.f] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, yj.f] */
    @Override // e6.a
    public final void o() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ?? r22 = f23662e;
        if (((Method) r22.getValue()) != null) {
            ?? r32 = f23661d;
            if (((Method) r32.getValue()) != null) {
                Method method = (Method) r22.getValue();
                k.b(method);
                Method method2 = (Method) r32.getValue();
                k.b(method2);
                Object objInvoke = method2.invoke(this.f23663a, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        f();
    }

    @Override // e6.a
    public final void s(Object[] objArr) throws SQLException {
        this.f23663a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // e6.a
    public final void t() {
        this.f23663a.setTransactionSuccessful();
    }

    @Override // e6.a
    public final void u() {
        this.f23663a.beginTransactionNonExclusive();
    }
}
