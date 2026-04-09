package com.bytedance.sdk.component.ycc.emc.emc.emc;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.ycc.emc.msw;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class dg extends SQLiteOpenHelper {
    final Context emc;

    public dg(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.emc = context;
    }

    private void emc(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.ycc.emc.emc.emc.emc.emc.ypw(msw.uym().dg().ypw()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.ycc.emc.emc.emc.emc.dg.xq(msw.uym().dg().emc()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.ycc.emc.emc.emc.emc.uym.xq(msw.uym().dg().dg()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.ycc.emc.emc.emc.emc.ycc.emc(msw.uym().dg().bw()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.ycc.emc.ycc.ycc.ypw());
    }

    private ArrayList<String> xq(SQLiteDatabase sQLiteDatabase) {
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

    private void ypw(SQLiteDatabase sQLiteDatabase) throws SQLException {
        ArrayList<String> arrayListXq = xq(sQLiteDatabase);
        if (arrayListXq == null || arrayListXq.size() <= 0) {
            return;
        }
        int size = arrayListXq.size();
        int i = 0;
        while (i < size) {
            String str = arrayListXq.get(i);
            i++;
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str + " ;");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            emc(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i3) {
        try {
            if (i <= i3) {
                emc(sQLiteDatabase);
            } else {
                ypw(sQLiteDatabase);
                emc(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }
}
