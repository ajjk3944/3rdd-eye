package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lh0 extends jw0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13492a;

    /* renamed from: b, reason: collision with root package name */
    public final w81 f13493b;

    public lh0(Context context, w81 w81Var) {
        super(context, "AdMobOfflineBufferedPings.db", ((Integer) va.s.f36163e.f36166c.a(sk.f16420y9)).intValue());
        this.f13492a = context;
        this.f13493b = w81Var;
    }

    public static void g(SQLiteDatabase sQLiteDatabase, za.l lVar) {
        SQLiteDatabase sQLiteDatabase2;
        String[] strArr;
        String string;
        String string2;
        sQLiteDatabase.beginTransaction();
        try {
            strArr = new String[]{"timestamp", "url"};
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("event_state = 1");
            string = sb2.toString();
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        try {
            Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", strArr, string, null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr2 = new String[count];
            int i4 = 0;
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
                        ua.j.C.f35267k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() - j;
                        String encodedQuery = uri.getEncodedQuery();
                        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                        builderClearQuery.appendQueryParameter("bd", Long.toString(jCurrentTimeMillis));
                        String strValueOf = String.valueOf(builderClearQuery.build());
                        StringBuilder sb3 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length());
                        sb3.append(strValueOf);
                        sb3.append("&");
                        sb3.append(encodedQuery);
                        string2 = sb3.toString();
                    }
                    strArr2[i4] = string2;
                }
                i4++;
            }
            cursorQuery.close();
            sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase2.setTransactionSuccessful();
            sQLiteDatabase2.endTransaction();
            for (int i10 = 0; i10 < count; i10++) {
                lVar.a(null, strArr2[i10]);
            }
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            sQLiteDatabase2.endTransaction();
            throw th4;
        }
    }

    public final void c(lr0 lr0Var) {
        qe qeVar = new qe(6, this);
        ex exVar = (ex) this.f13493b;
        vd.b bVarE = exVar.e(qeVar);
        int i4 = 0;
        bVarE.a(new q81(i4, bVarE, new kh0(i4, this, lr0Var)), exVar);
    }

    public final void e(String str) {
        c(new m91(str, 9));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i10) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i10) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
