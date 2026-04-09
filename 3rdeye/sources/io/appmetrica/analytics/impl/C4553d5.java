package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;

/* renamed from: io.appmetrica.analytics.impl.d5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4553d5 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final int f40685a = 2000;

    /* renamed from: b, reason: collision with root package name */
    public final String f40686b = "number";

    /* renamed from: c, reason: collision with root package name */
    public final String f40687c = "global_number";

    /* renamed from: d, reason: collision with root package name */
    public final String f40688d = "number_of_type";

    /* renamed from: e, reason: collision with root package name */
    public final String f40689e = AppMeasurementSdk.ConditionalUserProperty.NAME;

    /* renamed from: f, reason: collision with root package name */
    public final String f40690f = AppMeasurementSdk.ConditionalUserProperty.VALUE;

    /* renamed from: g, reason: collision with root package name */
    public final String f40691g = "type";

    /* renamed from: h, reason: collision with root package name */
    public final String f40692h = "time";
    public final String i = "session_id";

    /* renamed from: j, reason: collision with root package name */
    public final String f40693j = "error_environment";

    /* renamed from: k, reason: collision with root package name */
    public final String f40694k = "session_type";

    /* renamed from: l, reason: collision with root package name */
    public final String f40695l = "app_environment";

    /* renamed from: m, reason: collision with root package name */
    public final String f40696m = "app_environment_revision";

    /* renamed from: n, reason: collision with root package name */
    public final String f40697n = "truncated";

    /* renamed from: o, reason: collision with root package name */
    public final String f40698o = "custom_type";

    /* renamed from: p, reason: collision with root package name */
    public final String f40699p = "encrypting_mode";

    /* renamed from: q, reason: collision with root package name */
    public final String f40700q = "profile_id";

    /* renamed from: r, reason: collision with root package name */
    public final String f40701r = "first_occurrence_status";

    /* renamed from: s, reason: collision with root package name */
    public final String f40702s = AdRevenueConstants.SOURCE_KEY;

    /* renamed from: t, reason: collision with root package name */
    public final String f40703t = "attribution_id_changed";

    /* renamed from: u, reason: collision with root package name */
    public final String f40704u = "open_id";

    /* renamed from: v, reason: collision with root package name */
    public final String f40705v = "extras";

    /* renamed from: w, reason: collision with root package name */
    public final String f40706w = "reports";

    /* renamed from: x, reason: collision with root package name */
    public final C5093y7 f40707x = new C5093y7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C5068x7 c5068x7) {
        Long l5;
        EnumC4997ub enumC4997ub;
        Long l10;
        Long l11;
        Long l12 = c5068x7.f42046a;
        if (l12 == null || l12.longValue() < 10000000000L || c5068x7.f42047b == null || (l5 = c5068x7.f42048c) == null || l5.longValue() < 0 || (enumC4997ub = c5068x7.f42049d) == null || enumC4997ub == EnumC4997ub.EVENT_TYPE_UNDEFINED || (l10 = c5068x7.f42050e) == null || l10.longValue() < 0 || (l11 = c5068x7.f42051f) == null || l11.longValue() < 0) {
            return false;
        }
        Long l13 = c5068x7.f42052g.f41901d;
        if (l13 != null && l13.longValue() < 0) {
            return false;
        }
        Integer num = c5068x7.f42052g.i;
        return num == null || num.intValue() >= 0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) throws SQLException {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursorQuery;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor = null;
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                cursorQuery = sQLiteDatabase2.query(this.f40706w, null, null, null, null, null, null, String.valueOf(this.f40685a));
                while (cursorQuery.moveToNext()) {
                    try {
                        C5068x7 c5068x7A = a(cursorQuery);
                        if (c5068x7A != null && a(c5068x7A)) {
                            try {
                                sQLiteDatabase2.insertOrThrow("events", null, this.f40707x.fromModel(c5068x7A));
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursorQuery = cursor;
                            cursorQuery.close();
                        }
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f40706w);
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        cursorQuery.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f40706w);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0115 A[PHI: r4
  0x0115: PHI (r4v8 io.appmetrica.analytics.impl.E9) = (r4v7 io.appmetrica.analytics.impl.E9), (r4v9 io.appmetrica.analytics.impl.E9), (r4v10 io.appmetrica.analytics.impl.E9) binds: [B:38:0x0120, B:32:0x0113, B:35:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C5068x7 a(android.database.Cursor r32) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4553d5.a(android.database.Cursor):io.appmetrica.analytics.impl.x7");
    }
}
