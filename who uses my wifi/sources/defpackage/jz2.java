package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jz2 extends le3 {
    public final Context f;
    public final pq3 g;

    public jz2(Context context, pq3 pq3Var) {
        super(((Integer) tw1.e.c.a(mz1.Z8)).intValue(), context, "AdMobOfflineBufferedPings.db");
        this.f = context;
        this.g = pq3Var;
    }

    public static void f(SQLiteDatabase sQLiteDatabase, ug4 ug4Var) {
        SQLiteDatabase sQLiteDatabase2;
        String[] strArr;
        String string;
        String string2;
        sQLiteDatabase.beginTransaction();
        try {
            strArr = new String[]{"timestamp", "url"};
            StringBuilder sb = new StringBuilder(15);
            sb.append("event_state = 1");
            string = sb.toString();
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        try {
            Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", strArr, string, null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr2 = new String[count];
            int i = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("timestamp");
                int columnIndex2 = cursorQuery.getColumnIndex("url");
                if (columnIndex2 != -1) {
                    long j = cursorQuery.getLong(columnIndex);
                    String string3 = cursorQuery.getString(columnIndex2);
                    if (string3 == null) {
                        string2 = "";
                    } else {
                        Uri uri = Uri.parse(string3);
                        hg4.C.k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() - j;
                        String encodedQuery = uri.getEncodedQuery();
                        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                        builderClearQuery.appendQueryParameter("bd", Long.toString(jCurrentTimeMillis));
                        String strValueOf = String.valueOf(builderClearQuery.build());
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length());
                        sb2.append(strValueOf);
                        sb2.append("&");
                        sb2.append(encodedQuery);
                        string2 = sb2.toString();
                    }
                    strArr2[i] = string2;
                }
                i++;
            }
            cursorQuery.close();
            sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase2.setTransactionSuccessful();
            sQLiteDatabase2.endTransaction();
            for (int i2 = 0; i2 < count; i2++) {
                ug4Var.a(strArr2[i2], null);
            }
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            sQLiteDatabase2.endTransaction();
            throw th3;
        }
    }

    public final void a(o93 o93Var) {
        xs1 xs1Var = new xs1(7, this);
        ld2 ld2Var = (ld2) this.g;
        n70 n70VarC = ld2Var.c(xs1Var);
        n70VarC.c(new jq3(n70VarC, new kf3(this, o93Var, 24), 0), ld2Var);
    }

    public final void c(String str) {
        a(new gs3(str, 5));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
