package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import f4.InterfaceFutureC2326a;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Mp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633Mp extends AbstractC1181fx {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9909a;

    /* renamed from: b, reason: collision with root package name */
    public final ID f9910b;

    public C0633Mp(Context context, ID id) {
        super(context, ((Integer) C2841s.f23267e.f23270c.a(H9.w9)).intValue(), "AdMobOfflineBufferedPings.db");
        this.f9909a = context;
        this.f9910b = id;
    }

    public static void d(SQLiteDatabase sQLiteDatabase, u2.n nVar) {
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
                    long j6 = cursorQuery.getLong(columnIndex);
                    String string3 = cursorQuery.getString(columnIndex2);
                    if (string3 == null) {
                        string2 = "";
                    } else {
                        Uri uri = Uri.parse(string3);
                        p2.j.f22785C.f22797k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() - j6;
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
            for (int i3 = 0; i3 < count; i3++) {
                nVar.a(null, strArr2[i3]);
            }
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            sQLiteDatabase2.endTransaction();
            throw th3;
        }
    }

    public final void a(Eu eu) {
        J6 j6 = new J6(6, this);
        C0623Mf c0623Mf = (C0623Mf) this.f9910b;
        InterfaceFutureC2326a interfaceFutureC2326aB = c0623Mf.b(j6);
        interfaceFutureC2326aB.a(new CD(interfaceFutureC2326aB, 0, new Nx(this, 22, eu)), c0623Mf);
    }

    public final void b(String str) {
        a(new C1952uE(str, 6));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i3) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i3) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
