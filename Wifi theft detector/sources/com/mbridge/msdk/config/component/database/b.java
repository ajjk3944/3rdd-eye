package com.mbridge.msdk.config.component.database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

/* loaded from: classes3.dex */
class b extends SQLiteOpenHelper {
    public b(Context context) {
        super(context, "component_data.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    private void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        ArrayList<String> arrayListA = c.a("CREATE_");
        if (arrayListA == null || arrayListA.isEmpty()) {
            return;
        }
        int size = arrayListA.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayListA.get(i10);
            i10++;
            sQLiteDatabase.execSQL(str);
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        ArrayList<String> arrayListA = c.a("DROP_");
        if (arrayListA == null || arrayListA.isEmpty()) {
            return;
        }
        int size = arrayListA.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayListA.get(i10);
            i10++;
            sQLiteDatabase.execSQL(str);
        }
    }

    private boolean c(SQLiteDatabase sQLiteDatabase) {
        return (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || sQLiteDatabase.isReadOnly()) ? false : true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (c(sQLiteDatabase)) {
            a(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        super.onDowngrade(sQLiteDatabase, i10, i11);
        if (c(sQLiteDatabase)) {
            b(sQLiteDatabase);
            a(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        if (c(sQLiteDatabase)) {
            b(sQLiteDatabase);
            a(sQLiteDatabase);
        }
    }
}
