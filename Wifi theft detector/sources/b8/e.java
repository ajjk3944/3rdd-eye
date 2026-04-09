package b8;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.IOException;

/* loaded from: classes3.dex */
public class e extends SQLiteOpenHelper {

    /* renamed from: c, reason: collision with root package name */
    public static String f4633c = "";

    /* renamed from: a, reason: collision with root package name */
    public Context f4634a;

    /* renamed from: b, reason: collision with root package name */
    public SQLiteDatabase f4635b;

    public e(Context context) throws IOException {
        super(context, x7.a.f24982a, (SQLiteDatabase.CursorFactory) null, 1);
        this.f4634a = context;
        try {
            f4633c = context.getDatabasePath(x7.a.f24982a).getParent().toString();
            if (f.c(this.f4634a)) {
                h();
            } else {
                d();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            SQLiteDatabase sQLiteDatabase = this.f4635b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            super.close();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void d() {
        getReadableDatabase();
    }

    public void h() {
        this.f4635b = SQLiteDatabase.openDatabase(f4633c + "/" + x7.a.f24982a, null, 0);
    }

    public String j(String str) {
        String string = "Unknow";
        try {
            Cursor cursorRawQuery = this.f4635b.rawQuery("select * from vendor where id=\"" + str.toUpperCase() + "\";", new String[0]);
            if (cursorRawQuery != null && cursorRawQuery.moveToNext()) {
                string = cursorRawQuery.getString(1);
            }
            cursorRawQuery.close();
            return string;
        } catch (Exception e10) {
            e10.printStackTrace();
            return string;
        }
    }

    public void k(String str, String str2) throws SQLException {
        try {
            this.f4635b.execSQL("insert into vendor values(\"" + str.toUpperCase() + "\", \"" + str2 + "\");");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
