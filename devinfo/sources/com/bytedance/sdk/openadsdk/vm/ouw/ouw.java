package com.bytedance.sdk.openadsdk.vm.ouw;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw extends SQLiteOpenHelper {
    private static volatile ouw vt;
    final Context ouw;

    private ouw(Context context) {
        super(context, "pag_monitor.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.ouw = context;
    }

    private static ouw lh() {
        if (vt == null) {
            synchronized (ouw.class) {
                try {
                    if (vt == null) {
                        vt = new ouw(com.bytedance.sdk.openadsdk.vm.ouw.ouw());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return vt;
    }

    public static SQLiteDatabase ouw() {
        try {
            ouw ouwVarLh = lh();
            if (ouwVarLh == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = ouwVarLh.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th2) {
            Log.i("MonitorSQLiteOpenHelper", th2.getMessage());
            return null;
        }
    }

    public static SQLiteDatabase vt() {
        try {
            ouw ouwVarLh = lh();
            if (ouwVarLh == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = ouwVarLh.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th2) {
            Log.i("MonitorSQLiteOpenHelper", th2.getMessage());
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )");
        } catch (Throwable th2) {
            Log.e("MonitorSQLiteOpenHelper", th2.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i10) {
        try {
            ko.vt("MonitorSQLiteOpenHelper", "onDowngradeold:" + i4 + " new:" + i10);
            if (i4 <= i10) {
                onCreate(sQLiteDatabase);
            } else {
                ouw(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i10) {
        ko.vt("MonitorSQLiteOpenHelper", "onUpgradeold:" + i4 + " new:" + i10);
    }

    private static void ouw(SQLiteDatabase sQLiteDatabase) throws SQLException {
        ArrayList<String> arrayListVt = vt(sQLiteDatabase);
        if (arrayListVt.size() > 0) {
            int size = arrayListVt.size();
            int i4 = 0;
            while (i4 < size) {
                String str = arrayListVt.get(i4);
                i4++;
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str + " ;");
            }
        }
    }

    private static ArrayList<String> vt(SQLiteDatabase sQLiteDatabase) {
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
        } catch (Exception e2) {
            qbp.lh("MonitorSQLiteOpenHelper", e2.getMessage());
            return arrayList;
        }
    }
}
