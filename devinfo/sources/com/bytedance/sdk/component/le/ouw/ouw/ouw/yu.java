package com.bytedance.sdk.component.le.ouw.ouw.ouw;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.le.ouw.pno;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends SQLiteOpenHelper {
    final Context ouw;

    public yu(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.ouw = context;
    }

    private static ArrayList<String> lh(SQLiteDatabase sQLiteDatabase) {
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
        } catch (Exception unused) {
        }
        return arrayList;
    }

    private static void ouw(SQLiteDatabase sQLiteDatabase) throws SQLException {
        com.bytedance.sdk.component.le.ouw.lh.vt.yu();
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ouw.vt(pno.vt().ra.vt()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.yu.lh(pno.vt().ra.ouw()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ra.lh(pno.vt().ra.yu()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.le.ouw(pno.vt().ra.fkw()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.le.ouw.le.le.vt());
    }

    private static void vt(SQLiteDatabase sQLiteDatabase) throws SQLException {
        ArrayList<String> arrayListLh = lh(sQLiteDatabase);
        if (arrayListLh.size() > 0) {
            int size = arrayListLh.size();
            int i4 = 0;
            while (i4 < size) {
                String str = arrayListLh.get(i4);
                i4++;
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str + " ;");
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            ouw(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i10) {
        try {
            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
            if (i4 <= i10) {
                ouw(sQLiteDatabase);
                return;
            }
            vt(sQLiteDatabase);
            ouw(sQLiteDatabase);
            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
        } catch (Throwable unused) {
        }
    }
}
