package qm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f20911c = Boolean.FALSE;

    /* renamed from: d, reason: collision with root package name */
    public static a f20912d;

    /* renamed from: a, reason: collision with root package name */
    public final pi.a f20913a;

    /* renamed from: b, reason: collision with root package name */
    public SQLiteDatabase f20914b = null;

    public a(Context context) {
        this.f20913a = new pi.a(context, "CellsAPI_db", null, 18, 1);
    }

    public static a c(Context context) {
        if (f20912d == null) {
            f20912d = new a(context);
        }
        return f20912d;
    }

    public final void a() {
        SQLiteDatabase sQLiteDatabase = this.f20914b;
        if (sQLiteDatabase == null || sQLiteDatabase.isOpen()) {
            f20911c = Boolean.FALSE;
            this.f20913a.close();
        }
    }

    public final com.staircase3.opensignal.utils.j b(int i10, int i11, int i12) {
        SQLiteDatabase sQLiteDatabase = this.f20914b;
        Cursor cursorQuery = sQLiteDatabase.query("CellsAPI", null, "lac=" + (i11 + "") + " AND cid=" + (i10 + "") + " AND psc=" + (i12 + ""), null, null, null, null);
        com.staircase3.opensignal.utils.j jVar = new com.staircase3.opensignal.utils.j();
        if (cursorQuery.moveToFirst()) {
            jVar = new com.staircase3.opensignal.utils.j(cursorQuery.getFloat(4), cursorQuery.getFloat(5));
        }
        cursorQuery.close();
        return jVar;
    }

    public final void d(String str, String str2, String str3, String str4, float f10, float f11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("network_type", str);
        contentValues.put("cid", str3);
        contentValues.put("lac", str2);
        contentValues.put("psc", str4);
        contentValues.put("lat", Float.valueOf(f10));
        contentValues.put("lng", Float.valueOf(f11));
        this.f20914b.insert("CellsAPI", null, contentValues);
    }

    public final void e() throws SQLException {
        boolean zBooleanValue = f20911c.booleanValue();
        pi.a aVar = this.f20913a;
        if (zBooleanValue) {
            aVar.close();
            f20911c = Boolean.FALSE;
        }
        try {
            this.f20914b = aVar.getWritableDatabase();
            f20911c = Boolean.TRUE;
        } catch (Exception e4) {
            try {
                this.f20914b.execSQL("create table CellsAPI (_id integer primary key autoincrement, cid text, lac text, psc text, lat real, lng real, network_type text );");
                e4.printStackTrace();
            } catch (Exception unused) {
            }
            this.f20914b = aVar.getWritableDatabase();
        }
    }
}
