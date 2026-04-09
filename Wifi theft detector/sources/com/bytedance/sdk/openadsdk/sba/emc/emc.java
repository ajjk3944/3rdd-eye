package com.bytedance.sdk.openadsdk.sba.emc;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.ul;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class emc extends SQLiteOpenHelper {
    private static volatile emc ypw;
    final Context emc;

    private emc(Context context) {
        super(context, "pag_monitor.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.emc = context;
    }

    public static SQLiteDatabase emc() {
        try {
            emc emcVarXq = xq();
            if (emcVarXq == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = emcVarXq.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    private static emc xq() {
        if (ypw == null) {
            synchronized (emc.class) {
                try {
                    if (ypw == null) {
                        ypw = new emc(com.bytedance.sdk.openadsdk.sba.emc.emc());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ypw;
    }

    public static SQLiteDatabase ypw() {
        try {
            emc emcVarXq = xq();
            if (emcVarXq == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = emcVarXq.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(new StringBuilder("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )").toString());
        } catch (Throwable th) {
            Log.e("MonitorSQLiteOpenHelper", th.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (i10 <= i11) {
                onCreate(sQLiteDatabase);
            } else {
                emc(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    private void emc(SQLiteDatabase sQLiteDatabase) throws SQLException {
        ArrayList<String> arrayListYpw = ypw(sQLiteDatabase);
        if (arrayListYpw == null || arrayListYpw.size() <= 0) {
            return;
        }
        int size = arrayListYpw.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayListYpw.get(i10);
            i10++;
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", str));
        }
    }

    private ArrayList<String> ypw(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                cursorRawQuery.close();
            }
            return arrayList;
        } catch (Exception e10) {
            ul.xq("MonitorSQLiteOpenHelper", e10.getMessage());
            return arrayList;
        }
    }
}
