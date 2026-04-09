package com.singular.sdk.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class BatchManagerPersistenceSqlite implements BatchManagerPersistence {
    private static final SingularLog logger = SingularLog.getLogger("BatchManagerPersistenceSqlite");
    private Context context;
    private SQLiteHelper helper;

    public BatchManagerPersistenceSqlite(Context context) {
        this.helper = new SQLiteHelper(context);
        this.context = context;
    }

    @Override // com.singular.sdk.internal.BatchManagerPersistence
    public boolean addEvent(String str, String str2) {
        logger.debug("addEvent: key: " + str + " value: " + str2);
        return this.helper.insert(str, str2);
    }

    @Override // com.singular.sdk.internal.BatchManagerPersistence
    public boolean deleteEvent(String str) {
        logger.debug("deleteEvent: key: " + str);
        return this.helper.delete(str);
    }

    @Override // com.singular.sdk.internal.BatchManagerPersistence
    public Set<Map.Entry<String, String>> getAllEvents() {
        SingularLog singularLog = logger;
        singularLog.debug("getAllEvents");
        Set<Map.Entry<String, String>> all = this.helper.getAll();
        singularLog.debug("getAllEvents: returning " + all.size() + " events");
        return all;
    }

    @Override // com.singular.sdk.internal.BatchManagerPersistence
    public long getSendId() {
        return Utils.getBatchSendId(this.context);
    }

    @Override // com.singular.sdk.internal.BatchManagerPersistence
    public long incSendId() {
        return Utils.incBatchSendId(this.context);
    }

    @Override // com.singular.sdk.internal.BatchManagerPersistence
    public boolean updateEvent(String str, String str2) {
        logger.debug("updateEvent: key: " + str + " value: " + str2);
        return this.helper.update(str, str2);
    }

    public static class SQLiteHelper extends SQLiteOpenHelper {
        private static final String COLUMN_NAME_KEY = "eventKey";
        private static final String COLUMN_NAME_VALUE = "value";
        private static final String COMMA_SEP = ",";
        private static final String DATABASE_NAME = "singular-batch-managerx-1.db";
        private static final int DATABASE_VERSION = 1;
        private static final String SQL_CREATE_ENTRIES = "CREATE TABLE events (eventKey  TEXT PRIMARY KEY NOT NULL,value TEXT )";
        private static final String TABLE_NAME = "events";
        private static final String TEXT_TYPE = " TEXT";
        private SQLiteDatabase db;

        public SQLiteHelper(Context context) {
            super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
            this.db = getWritableDatabase();
        }

        public boolean delete(String str) {
            BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.delete key: " + str);
            if (!keyExists(str)) {
                BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.delete key does not exist - returning false ");
                return false;
            }
            if (this.db.delete(TABLE_NAME, "eventKey =?", new String[]{str}) != 1) {
                BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.delete failed ");
                return false;
            }
            BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.delete - success ");
            return true;
        }

        public Set<Map.Entry<String, String>> getAll() {
            BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.getAll");
            HashSet hashSet = new HashSet();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = this.db.rawQuery("SELECT * FROM events", null);
                if (cursorRawQuery != null && cursorRawQuery.getCount() != 0) {
                    cursorRawQuery.moveToFirst();
                    do {
                        hashSet.add(new AbstractMap.SimpleEntry(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(COLUMN_NAME_KEY)), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("value"))));
                    } while (cursorRawQuery.moveToNext());
                }
            } catch (Throwable th) {
                try {
                    BatchManagerPersistenceSqlite.logger.error("SQLiteHelper.getAll exception: " + th.getMessage());
                    BatchManagerPersistenceSqlite.logger.error(Utils.formatException(th));
                    if (cursorRawQuery != null) {
                    }
                } finally {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                }
            }
            BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.getAll returning: " + hashSet.size() + " entries");
            return hashSet;
        }

        public boolean insert(String str, String str2) {
            BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.insert key: " + str + " value: " + str2);
            if (keyExists(str)) {
                BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.insert key already exists - returning false ");
                return false;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(COLUMN_NAME_KEY, str);
            contentValues.put("value", str2);
            if (this.db.insert(TABLE_NAME, null, contentValues) != -1) {
                BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.insert success ");
                return true;
            }
            BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.insert false ");
            return false;
        }

        public boolean keyExists(String str) {
            BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.keyExists: key: " + str);
            Cursor cursorRawQuery = this.db.rawQuery("SELECT * FROM events WHERE eventKey= ?", new String[]{str});
            if (cursorRawQuery != null && cursorRawQuery.getCount() != 0) {
                BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.keyExists: returning true ");
                cursorRawQuery.close();
                return true;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.keyExists: returning false ");
            return false;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
        }

        public boolean update(String str, String str2) {
            BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.update key: " + str + " value: " + str2);
            if (!keyExists(str)) {
                BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.update: key does not exist - returning false ");
                return false;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(COLUMN_NAME_KEY, str);
            contentValues.put("value", str2);
            if (this.db.replace(TABLE_NAME, null, contentValues) != -1) {
                BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.update - success");
                return true;
            }
            BatchManagerPersistenceSqlite.logger.debug("SQLiteHelper.update - failed");
            return false;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        }
    }
}
