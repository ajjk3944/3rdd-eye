package io.appmetrica.analytics.impl;

import android.database.Cursor;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* renamed from: io.appmetrica.analytics.impl.e5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4578e5 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final String f40783a = "sessions";

    /* renamed from: b, reason: collision with root package name */
    public final int f40784b = 200;

    /* renamed from: c, reason: collision with root package name */
    public final String f40785c = FacebookMediationAdapter.KEY_ID;

    /* renamed from: d, reason: collision with root package name */
    public final String f40786d = "start_time";

    /* renamed from: e, reason: collision with root package name */
    public final String f40787e = "report_request_parameters";

    /* renamed from: f, reason: collision with root package name */
    public final String f40788f = "server_time_offset";

    /* renamed from: g, reason: collision with root package name */
    public final String f40789g = "type";

    /* renamed from: h, reason: collision with root package name */
    public final String f40790h = "obtained_before_first_sync";
    public final M7 i = new M7(null, 1, 0 == true ? 1 : 0);

    public final L7 a(Cursor cursor) {
        try {
            Long lValueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f40785c)));
            int i = cursor.getInt(cursor.getColumnIndexOrThrow(this.f40789g));
            Tk tk = Tk.FOREGROUND;
            boolean z10 = true;
            if (i != 0) {
                tk = Tk.BACKGROUND;
                if (i != 1) {
                    tk = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f40787e));
            Long lValueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f40786d)));
            Long lValueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f40788f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f40790h)) != 1) {
                z10 = false;
            }
            return new L7(lValueOf, tk, string, new K7(lValueOf2, lValueOf3, Boolean.valueOf(z10)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e A[PHI: r2 r12
  0x005e: PHI (r2v4 android.database.sqlite.SQLiteDatabase) = (r2v2 android.database.sqlite.SQLiteDatabase), (r2v6 android.database.sqlite.SQLiteDatabase) binds: [B:29:0x005c, B:49:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x005e: PHI (r12v7 android.database.Cursor) = (r12v2 android.database.Cursor), (r12v8 android.database.Cursor) binds: [B:29:0x005c, B:49:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void runScript(android.database.sqlite.SQLiteDatabase r12) throws android.database.SQLException {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r3 = r11.f40783a     // Catch: java.lang.Throwable -> L5a
            int r2 = r11.f40784b     // Catch: java.lang.Throwable -> L5a
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L5a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5b
        L19:
            boolean r3 = r12.moveToNext()     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L5e
            io.appmetrica.analytics.impl.L7 r3 = r11.a(r12)     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L19
            java.lang.Long r4 = r3.f39745a     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5c
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L19
            io.appmetrica.analytics.impl.Tk r4 = r3.f39746b     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            java.lang.String r4 = r3.f39747c     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L5c
            if (r4 != 0) goto L42
            goto L19
        L42:
            io.appmetrica.analytics.impl.K7 r4 = r3.f39748d     // Catch: java.lang.Throwable -> L5c
            java.lang.Long r4 = r4.f39712a     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L19
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5c
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L19
            io.appmetrica.analytics.impl.M7 r4 = r11.i     // Catch: java.lang.Throwable -> L5c
            android.content.ContentValues r3 = r4.fromModel(r3)     // Catch: java.lang.Throwable -> L5c
            r0.add(r3)     // Catch: java.lang.Throwable -> L5c
            goto L19
        L5a:
            r2 = r12
        L5b:
            r12 = r1
        L5c:
            if (r12 == 0) goto L61
        L5e:
            r12.close()
        L61:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r3 = "DROP TABLE IF EXISTS "
            r12.<init>(r3)
            java.lang.String r3 = r11.f40783a
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r2.execSQL(r12)
            java.lang.String r12 = "CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )"
            r2.execSQL(r12)
            java.util.Iterator r12 = r0.iterator()
        L7d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r12.next()
            android.content.ContentValues r0 = (android.content.ContentValues) r0
            java.lang.String r3 = "sessions"
            r2.insertOrThrow(r3, r1, r0)     // Catch: java.lang.Throwable -> L7d
            goto L7d
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4578e5.runScript(android.database.sqlite.SQLiteDatabase):void");
    }
}
