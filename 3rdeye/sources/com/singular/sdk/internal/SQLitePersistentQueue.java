package com.singular.sdk.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;

/* loaded from: classes2.dex */
public class SQLitePersistentQueue implements Queue {
    private static final SingularLog logger = SingularLog.getLogger("SQLitePersistentQueue");
    private SQLiteManager sqlite;

    public SQLitePersistentQueue(Context context) {
        this.sqlite = new SQLiteManager(new SQLiteHelper(context.getApplicationContext()));
    }

    @Override // com.singular.sdk.internal.Queue
    public synchronized void add(String str) throws IOException {
        if (this.sqlite.insert(str) == -1) {
            throw new IOException("Failed to add element = " + str);
        }
    }

    @Override // com.singular.sdk.internal.Queue
    public synchronized String peek() throws IOException {
        return this.sqlite.getHead();
    }

    @Override // com.singular.sdk.internal.Queue
    public synchronized void remove() throws IOException {
        this.sqlite.removeHead();
    }

    public static class SQLiteManager {
        private final SQLiteHelper helper;

        public SQLiteManager(SQLiteHelper sQLiteHelper) {
            this.helper = sQLiteHelper;
        }

        private long getCount(SQLiteDatabase sQLiteDatabase) throws IOException {
            Cursor cursorRawQuery = null;
            try {
                try {
                    cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(_id) FROM events", null);
                    cursorRawQuery.moveToFirst();
                    long j4 = cursorRawQuery.getLong(0);
                    SQLitePersistentQueue.logger.debug("getCount() = %d", Long.valueOf(j4));
                    cursorRawQuery.close();
                    return j4;
                } catch (SQLException e4) {
                    throw new IOException(e4);
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }

        private long getMinId(SQLiteDatabase sQLiteDatabase) throws IOException {
            Cursor cursorRawQuery = null;
            try {
                try {
                    cursorRawQuery = sQLiteDatabase.rawQuery("SELECT MIN(_id) FROM events", null);
                    cursorRawQuery.moveToFirst();
                    long j4 = cursorRawQuery.getLong(0);
                    SQLitePersistentQueue.logger.debug("getMinId() id = %d", Long.valueOf(j4));
                    cursorRawQuery.close();
                    return j4;
                } catch (SQLException e4) {
                    throw new IOException(e4);
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }

        public String getHead() throws Throwable {
            SQLiteDatabase readableDatabase;
            Cursor cursor = null;
            String string = null;
            cursor = null;
            cursor = null;
            cursor = null;
            try {
                readableDatabase = this.helper.getReadableDatabase();
                try {
                    try {
                        long minId = getMinId(readableDatabase);
                        Cursor cursorQuery = readableDatabase.query("events", new String[]{AppMeasurementSdk.ConditionalUserProperty.VALUE}, "_id = ?", new String[]{String.valueOf(minId)}, null, null, null);
                        try {
                            cursorQuery.moveToFirst();
                            if (cursorQuery.getCount() != 0) {
                                string = cursorQuery.getString(0);
                            }
                            SQLitePersistentQueue.logger.debug("getHead() _id = %d, value = %s", Long.valueOf(minId), string);
                            cursorQuery.close();
                            readableDatabase.close();
                            return string;
                        } catch (SQLException e4) {
                            e = e4;
                            cursor = cursorQuery;
                            throw new IOException(e);
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (readableDatabase != null) {
                                readableDatabase.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (SQLException e10) {
                    e = e10;
                }
            } catch (SQLException e11) {
                e = e11;
                readableDatabase = null;
            } catch (Throwable th3) {
                th = th3;
                readableDatabase = null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long insert(java.lang.String r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.String r0 = "insert() row = "
                android.content.ContentValues r1 = new android.content.ContentValues
                r1.<init>()
                java.lang.String r2 = "value"
                r1.put(r2, r9)
                r9 = 0
                com.singular.sdk.internal.SQLitePersistentQueue$SQLiteHelper r2 = r8.helper     // Catch: java.lang.Throwable -> L5e android.database.SQLException -> L62
                android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L5e android.database.SQLException -> L62
                java.lang.String r3 = "events"
                long r3 = r2.insert(r3, r9, r1)     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                com.singular.sdk.internal.SingularLog r9 = com.singular.sdk.internal.SQLitePersistentQueue.access$000()     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                r1.append(r3)     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                r9.debug(r0)     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                long r0 = r8.getCount(r2)     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                r5 = 10000(0x2710, double:4.9407E-320)
                int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r9 <= 0) goto L5a
                com.singular.sdk.internal.SingularLog r9 = com.singular.sdk.internal.SQLitePersistentQueue.access$000()     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                java.lang.String r5 = "Pruning Queue; current size = %d; max size = %d"
                java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                r1 = 10000(0x2710, float:1.4013E-41)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                r7 = 0
                r6[r7] = r0     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                r0 = 1
                r6[r0] = r1     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                r9.debug(r5, r6)     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                r8.removeHead(r2)     // Catch: java.lang.Throwable -> L56 android.database.SQLException -> L58
                goto L5a
            L56:
                r9 = move-exception
                goto L6b
            L58:
                r9 = move-exception
                goto L65
            L5a:
                r2.close()
                return r3
            L5e:
                r0 = move-exception
                r2 = r9
                r9 = r0
                goto L6b
            L62:
                r0 = move-exception
                r2 = r9
                r9 = r0
            L65:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L56
                r0.<init>(r9)     // Catch: java.lang.Throwable -> L56
                throw r0     // Catch: java.lang.Throwable -> L56
            L6b:
                if (r2 == 0) goto L70
                r2.close()
            L70:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.singular.sdk.internal.SQLitePersistentQueue.SQLiteManager.insert(java.lang.String):long");
        }

        public String removeHead() throws IOException {
            SQLiteDatabase writableDatabase = null;
            try {
                writableDatabase = this.helper.getWritableDatabase();
                return removeHead(writableDatabase);
            } finally {
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }

        private String removeHead(SQLiteDatabase sQLiteDatabase) throws Throwable {
            Cursor cursor = null;
            try {
                try {
                    long minId = getMinId(sQLiteDatabase);
                    String[] strArr = {AppMeasurementSdk.ConditionalUserProperty.VALUE};
                    String[] strArr2 = {String.valueOf(minId)};
                    Cursor cursorQuery = sQLiteDatabase.query("events", strArr, "_id = ?", strArr2, null, null, null);
                    try {
                        cursorQuery.moveToFirst();
                        if (cursorQuery.getCount() == 0) {
                            cursorQuery.close();
                            return null;
                        }
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        sQLiteDatabase.delete("events", "_id = ?", strArr2);
                        SQLitePersistentQueue.logger.debug("removeHead() _id = %d", Long.valueOf(minId));
                        cursorQuery.close();
                        return string;
                    } catch (SQLException e4) {
                        e = e4;
                        cursor = cursorQuery;
                        throw new IOException(e);
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (SQLException e10) {
                e = e10;
            }
        }
    }

    public static class SQLiteHelper extends SQLiteOpenHelper implements BaseColumns {
        private static final String COLUMN_NAME_VALUE = "value";
        private static final String COMMA_SEP = ",";
        private static final String DATABASE_NAME = "singular-1.db";
        private static final int DATABASE_VERSION = 1;
        private static final String SQL_CREATE_ENTRIES = "CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,value TEXT )";
        private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS events";
        private static final String TABLE_NAME = "events";
        private static final String TEXT_TYPE = " TEXT";

        public SQLiteHelper(Context context) {
            super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        }
    }
}
