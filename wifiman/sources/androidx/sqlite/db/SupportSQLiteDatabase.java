package androidx.sqlite.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public interface SupportSQLiteDatabase extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    SupportSQLiteStatement compileStatement(String str);

    void endTransaction();

    default void execPerConnectionSQL(String sql, Object[] objArr) {
        AbstractC6492s.i(sql, "sql");
        throw new UnsupportedOperationException();
    }

    void execSQL(String str);

    List getAttachedDbs();

    String getPath();

    boolean inTransaction();

    long insert(String str, int i10, ContentValues contentValues);

    default boolean isExecPerConnectionSQLSupported() {
        return false;
    }

    boolean isOpen();

    boolean isWriteAheadLoggingEnabled();

    Cursor query(SupportSQLiteQuery supportSQLiteQuery);

    Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal);

    Cursor query(String str);

    void setTransactionSuccessful();

    int update(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);
}
