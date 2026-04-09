package net.sqlcipher.database;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteMisuseException;
import android.os.SystemClock;
import android.util.Log;
import net.sqlcipher.CursorWindow;

/* loaded from: classes4.dex */
public class SQLiteQuery extends SQLiteProgram {
    private static final String TAG = "Cursor";
    private String[] mBindArgs;
    private Object[] mObjectBindArgs;
    private int mOffsetIndex;

    SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, int i10, String[] strArr) {
        super(sQLiteDatabase, str);
        this.mOffsetIndex = i10;
        this.mBindArgs = strArr;
    }

    private final native int native_column_count();

    private final native String native_column_name(int i10);

    private final native int native_fill_window(CursorWindow cursorWindow, int i10, int i11, int i12, int i13, int i14);

    public void bindArguments(Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                bindNull(i10 + 1);
            } else if (obj instanceof Double) {
                bindDouble(i10 + 1, ((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                bindDouble(i10 + 1, ((Number) obj).floatValue());
            } else if (obj instanceof Long) {
                bindLong(i10 + 1, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                bindLong(i10 + 1, ((Number) obj).intValue());
            } else if (obj instanceof Boolean) {
                bindLong(i10 + 1, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else if (obj instanceof byte[]) {
                bindBlob(i10 + 1, (byte[]) obj);
            } else {
                bindString(i10 + 1, obj.toString());
            }
        }
    }

    @Override // net.sqlcipher.database.SQLiteProgram, r2.g
    public void bindDouble(int i10, double d10) {
        this.mBindArgs[i10 - 1] = Double.toString(d10);
        if (this.mClosed) {
            return;
        }
        super.bindDouble(i10, d10);
    }

    @Override // net.sqlcipher.database.SQLiteProgram, r2.g
    public void bindLong(int i10, long j10) {
        this.mBindArgs[i10 - 1] = Long.toString(j10);
        if (this.mClosed) {
            return;
        }
        super.bindLong(i10, j10);
    }

    @Override // net.sqlcipher.database.SQLiteProgram, r2.g
    public void bindNull(int i10) {
        this.mBindArgs[i10 - 1] = null;
        if (this.mClosed) {
            return;
        }
        super.bindNull(i10);
    }

    @Override // net.sqlcipher.database.SQLiteProgram, r2.g
    public void bindString(int i10, String str) {
        this.mBindArgs[i10 - 1] = str;
        if (this.mClosed) {
            return;
        }
        super.bindString(i10, str);
    }

    int columnCountLocked() {
        acquireReference();
        try {
            return native_column_count();
        } finally {
            releaseReference();
        }
    }

    String columnNameLocked(int i10) {
        acquireReference();
        try {
            return native_column_name(i10);
        } finally {
            releaseReference();
        }
    }

    int fillWindow(CursorWindow cursorWindow, int i10, int i11) {
        SystemClock.uptimeMillis();
        this.mDatabase.lock();
        try {
            acquireReference();
            try {
                try {
                    cursorWindow.acquireReference();
                    int iNative_fill_window = native_fill_window(cursorWindow, cursorWindow.getStartPosition(), cursorWindow.getRequiredPosition(), this.mOffsetIndex, i10, i11);
                    if (SQLiteDebug.DEBUG_SQL_STATEMENTS) {
                        Log.d(TAG, "fillWindow(): " + this.mSql);
                    }
                    cursorWindow.releaseReference();
                    return iNative_fill_window;
                } catch (SQLiteDatabaseCorruptException e10) {
                    this.mDatabase.onCorruption();
                    throw e10;
                } catch (IllegalStateException unused) {
                    cursorWindow.releaseReference();
                    releaseReference();
                    this.mDatabase.unlock();
                    return 0;
                }
            } catch (Throwable th2) {
                cursorWindow.releaseReference();
                throw th2;
            }
        } finally {
            releaseReference();
            this.mDatabase.unlock();
        }
    }

    void requery() {
        String[] strArr = this.mBindArgs;
        if (strArr != null) {
            int length = strArr.length;
            try {
                Object[] objArr = this.mObjectBindArgs;
                if (objArr != null) {
                    bindArguments(objArr);
                    return;
                }
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    super.bindString(i11, this.mBindArgs[i10]);
                    i10 = i11;
                }
            } catch (SQLiteMisuseException e10) {
                StringBuilder sb2 = new StringBuilder("mSql " + this.mSql);
                for (int i12 = 0; i12 < length; i12++) {
                    sb2.append(" ");
                    sb2.append(this.mBindArgs[i12]);
                }
                sb2.append(" ");
                throw new IllegalStateException(sb2.toString(), e10);
            }
        }
    }

    public String toString() {
        return "SQLiteQuery: " + this.mSql;
    }

    SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, int i10, Object[] objArr) {
        super(sQLiteDatabase, str);
        this.mOffsetIndex = i10;
        this.mObjectBindArgs = objArr;
        this.mBindArgs = new String[objArr != null ? objArr.length : 0];
    }
}
