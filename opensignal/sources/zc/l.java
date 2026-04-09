package zc;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class l extends k3 {
    public static final String[] B = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] D = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] E = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] F = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    public static final String[] G = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] H = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] I = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] J = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] K = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] L = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] M = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: x, reason: collision with root package name */
    public final k f26985x;

    /* renamed from: y, reason: collision with root package name */
    public final dj.i f26986y;

    public l(p3 p3Var) {
        super(p3Var);
        this.f26986y = new dj.i(((c1) this.f1504d).G);
        ((c1) this.f1504d).getClass();
        this.f26985x = new k(this, ((c1) this.f1504d).f26884a);
    }

    public static final String V1(List list) {
        return list.isEmpty() ? "" : h0.b.o(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void b2(ContentValues contentValues, Object obj) {
        cc.s.e("value");
        cc.s.h(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A1() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.h2()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L37
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L27
        L1e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3d
        L22:
            r0 = move-exception
            goto L3d
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            java.lang.Object r3 = r6.f1504d     // Catch: java.lang.Throwable -> L1a
            zc.c1 r3 = (zc.c1) r3     // Catch: java.lang.Throwable -> L1a
            zc.j0 r3 = r3.f26889y     // Catch: java.lang.Throwable -> L1a
            zc.c1.g(r3)     // Catch: java.lang.Throwable -> L1a
            su.b r3 = r3.B     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.c(r2, r4)     // Catch: java.lang.Throwable -> L1a
        L37:
            if (r0 == 0) goto L3c
            r0.close()
        L3c:
            return r1
        L3d:
            if (r1 == 0) goto L42
            r1.close()
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l.A1():java.lang.String");
    }

    public final void B1(long j) {
        s1();
        t1();
        try {
            if (h2().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e4) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.B.c(e4, "Failed to delete a bundle in a queue table");
            throw e4;
        }
    }

    public final void C1() {
        s1();
        t1();
        if (Z1()) {
            p3 p3Var = this.f26981g;
            long jE = p3Var.E.f27287y.e();
            c1 c1Var = (c1) this.f1504d;
            c1Var.G.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jE) > ((Long) u.M.a(null)).longValue()) {
                p3Var.E.f27287y.f(jElapsedRealtime);
                s1();
                t1();
                if (Z1()) {
                    SQLiteDatabase sQLiteDatabaseH2 = h2();
                    c1Var.G.getClass();
                    int iDelete = sQLiteDatabaseH2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) u.R.a(null)).longValue())});
                    if (iDelete > 0) {
                        j0 j0Var = c1Var.f26889y;
                        c1.g(j0Var);
                        j0Var.K.c(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void D1(ArrayList arrayList) throws SQLException {
        c1 c1Var = (c1) this.f1504d;
        s1();
        t1();
        cc.s.h(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (Z1()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strS = h0.b.s(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (c2(h0.b.s(new StringBuilder(strS.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strS, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                j0 j0Var = c1Var.f26889y;
                c1.g(j0Var);
                j0Var.F.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseH2 = h2();
                StringBuilder sb2 = new StringBuilder(strS.length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(strS);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseH2.execSQL(sb2.toString());
            } catch (SQLiteException e4) {
                j0 j0Var2 = c1Var.f26889y;
                c1.g(j0Var2);
                j0Var2.B.c(e4, "Error incrementing retry count. error");
            }
        }
    }

    public final void E1(Long l10) {
        c1 c1Var = (c1) this.f1504d;
        s1();
        t1();
        if (Z1()) {
            StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l10);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (c2(sb2.toString(), null) > 0) {
                j0 j0Var = c1Var.f26889y;
                c1.g(j0Var);
                j0Var.F.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseH2 = h2();
                c1Var.G.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb3 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(jCurrentTimeMillis);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder(string.length() + 34 + l10.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(string);
                sb4.append(" WHERE rowid = ");
                sb4.append(l10);
                sb4.append(" AND retry_count < 2147483647");
                sQLiteDatabaseH2.execSQL(sb4.toString());
            } catch (SQLiteException e4) {
                j0 j0Var2 = c1Var.f26889y;
                c1.g(j0Var2);
                j0Var2.B.c(e4, "Error incrementing retry count. error");
            }
        }
    }

    public final Object F1(Cursor cursor, int i10) {
        c1 c1Var = (c1) this.f1504d;
        int type = cursor.getType(i10);
        if (type == 0) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.B.b("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.B.c(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        j0 j0Var3 = c1Var.f26889y;
        c1.g(j0Var3);
        j0Var3.B.b("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long G1(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f1504d
            zc.c1 r0 = (zc.c1) r0
            java.lang.String r1 = "select first_open_count from app2 where app_id=?"
            cc.s.e(r14)
            java.lang.String r2 = "first_open_count"
            cc.s.e(r2)
            r13.s1()
            r13.t1()
            android.database.sqlite.SQLiteDatabase r3 = r13.h2()
            r3.beginTransaction()
            r4 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = 48
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r6.append(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String[] r6 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = -1
            long r9 = r13.d2(r1, r6, r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            java.lang.String r6 = "app2"
            java.lang.String r11 = "app_id"
            if (r1 != 0) goto L72
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r10 = "previous_install_count"
            r1.put(r10, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            r10 = 5
            long r9 = r3.insertWithOnConflict(r6, r9, r1, r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 != 0) goto L71
            zc.j0 r1 = r0.f26889y     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            zc.c1.g(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            su.b r1 = r1.B     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r6 = "Failed to insert column (got -1). appId"
            zc.i0 r9 = zc.j0.A1(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.d(r9, r2, r6)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            goto Lbd
        L6d:
            r14 = move-exception
            goto Lc1
        L6f:
            r1 = move-exception
            goto Lac
        L71:
            r9 = r4
        L72:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r11 = 1
            long r11 = r11 + r9
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r2, r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r11 = "app_id = ?"
            java.lang.String[] r12 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = r3.update(r6, r1, r11, r12)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            long r11 = (long) r1     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 != 0) goto La6
            zc.j0 r1 = r0.f26889y     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            zc.c1.g(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            su.b r1 = r1.B     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r4 = "Failed to update column (got 0). appId"
            zc.i0 r5 = zc.j0.A1(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.d(r5, r2, r4)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            goto Lbd
        La4:
            r1 = move-exception
            goto Lab
        La6:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r7 = r9
            goto Lbd
        Lab:
            r4 = r9
        Lac:
            zc.j0 r0 = r0.f26889y     // Catch: java.lang.Throwable -> L6d
            zc.c1.g(r0)     // Catch: java.lang.Throwable -> L6d
            su.b r0 = r0.B     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "Error inserting column. appId"
            zc.i0 r14 = zc.j0.A1(r14)     // Catch: java.lang.Throwable -> L6d
            r0.e(r6, r14, r2, r1)     // Catch: java.lang.Throwable -> L6d
            r7 = r4
        Lbd:
            r3.endTransaction()
            return r7
        Lc1:
            r3.endTransaction()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l.G1(java.lang.String):long");
    }

    public final boolean H1(String str, String str2) {
        return c2("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final long I1(String str) {
        cc.s.e(str);
        return d2("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void J1(String str, Long l10, long j, com.google.android.gms.internal.measurement.z2 z2Var) {
        s1();
        t1();
        cc.s.h(z2Var);
        cc.s.e(str);
        c1 c1Var = (c1) this.f1504d;
        byte[] bArrA = z2Var.a();
        j0 j0Var = c1Var.f26889y;
        j0 j0Var2 = c1Var.f26889y;
        c1.g(j0Var);
        j0Var.K.d(c1Var.F.a(str), Integer.valueOf(bArrA.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrA);
        try {
            if (h2().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                c1.g(j0Var2);
                j0Var2.B.c(j0.A1(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e4) {
            c1.g(j0Var2);
            j0Var2.B.d(j0.A1(str), e4, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029c A[Catch: SQLiteException -> 0x02b8, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x02b8, blocks: (B:94:0x0281, B:96:0x029c), top: B:107:0x0281 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K1(java.lang.String r26, java.lang.Long r27, java.lang.String r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l.K1(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zc.o1 L1(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f1504d
            zc.c1 r0 = (zc.c1) r0
            cc.s.h(r5)
            r4.s1()
            r4.t1()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r1 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r4.h2()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            android.database.Cursor r5 = r3.rawQuery(r1, r5)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            if (r1 != 0) goto L36
            zc.j0 r1 = r0.f26889y     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            zc.c1.g(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            su.b r1 = r1.K     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            java.lang.String r3 = "No data found"
            r1.b(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
        L2e:
            r5.close()
            goto L5c
        L32:
            r0 = move-exception
            goto L45
        L34:
            r1 = move-exception
            goto L4d
        L36:
            r1 = 0
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            r3 = 1
            int r3 = r5.getInt(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            zc.o1 r2 = zc.o1.c(r3, r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            goto L2e
        L45:
            r2 = r5
            goto L62
        L47:
            r5 = move-exception
            r0 = r5
            goto L62
        L4a:
            r5 = move-exception
            r1 = r5
            r5 = r2
        L4d:
            zc.j0 r0 = r0.f26889y     // Catch: java.lang.Throwable -> L32
            zc.c1.g(r0)     // Catch: java.lang.Throwable -> L32
            su.b r0 = r0.B     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "Error querying database."
            r0.c(r1, r3)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L5c
            goto L2e
        L5c:
            if (r2 != 0) goto L61
            zc.o1 r5 = zc.o1.f27052c
            return r5
        L61:
            return r2
        L62:
            if (r2 == 0) goto L67
            r2.close()
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l.L1(java.lang.String):zc.o1");
    }

    public final void M1(String str, zzoh zzohVar) {
        s1();
        t1();
        cc.s.e(str);
        c1 c1Var = (c1) this.f1504d;
        gc.a aVar = c1Var.G;
        j0 j0Var = c1Var.f26889y;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        t tVar = u.f27213v0;
        long jLongValue = jCurrentTimeMillis - ((Long) tVar.a(null)).longValue();
        long j = zzohVar.f5410d;
        if (j < jLongValue || j > ((Long) tVar.a(null)).longValue() + jCurrentTimeMillis) {
            c1.g(j0Var);
            j0Var.F.e("Storing trigger URI outside of the max retention time span. appId, now, timestamp", j0.A1(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        c1.g(j0Var);
        j0Var.K.b("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzohVar.f5409a);
        contentValues.put("source", Integer.valueOf(zzohVar.f5411g));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (h2().insert("trigger_uris", null, contentValues) == -1) {
                c1.g(j0Var);
                j0Var.B.c(j0.A1(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e4) {
            c1.g(j0Var);
            j0Var.B.d(j0.A1(str), e4, "Error storing trigger URI. appId");
        }
    }

    public final void N1(String str, o1 o1Var) {
        cc.s.h(str);
        cc.s.h(o1Var);
        s1();
        t1();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", o1Var.g());
        contentValues.put("consent_source", Integer.valueOf(o1Var.f27054b));
        P1(contentValues);
    }

    public final String O1(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = h2().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e4) {
                j0 j0Var = ((c1) this.f1504d).f26889y;
                c1.g(j0Var);
                j0Var.B.d(str, e4, "Database error");
                throw e4;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public final void P1(ContentValues contentValues) {
        c1 c1Var = (c1) this.f1504d;
        try {
            SQLiteDatabase sQLiteDatabaseH2 = h2();
            if (contentValues.getAsString("app_id") == null) {
                j0 j0Var = c1Var.f26889y;
                c1.g(j0Var);
                j0Var.E.c(j0.A1("app_id"), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (sQLiteDatabaseH2.update("consent_settings", contentValues, r6.toString(), new String[]{r5}) == 0 && sQLiteDatabaseH2.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                j0 j0Var2 = c1Var.f26889y;
                c1.g(j0Var2);
                j0Var2.B.d(j0.A1("consent_settings"), j0.A1("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e4) {
            j0 j0Var3 = c1Var.f26889y;
            c1.g(j0Var3);
            j0Var3.B.e("Error storing into table. key", j0.A1("consent_settings"), j0.A1("app_id"), e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zc.p Q1(java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l.Q1(java.lang.String, java.lang.String, java.lang.String):zc.p");
    }

    public final void R1(String str, p pVar) {
        c1 c1Var = (c1) this.f1504d;
        cc.s.h(pVar);
        s1();
        t1();
        ContentValues contentValues = new ContentValues();
        String str2 = pVar.f27061a;
        contentValues.put("app_id", str2);
        contentValues.put("name", pVar.f27062b);
        contentValues.put("lifetime_count", Long.valueOf(pVar.f27063c));
        contentValues.put("current_bundle_count", Long.valueOf(pVar.f27064d));
        contentValues.put("last_fire_timestamp", Long.valueOf(pVar.f27066f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(pVar.f27067g));
        contentValues.put("last_bundled_day", pVar.f27068h);
        contentValues.put("last_sampled_complex_event_id", pVar.f27069i);
        contentValues.put("last_sampling_rate", pVar.j);
        contentValues.put("current_session_count", Long.valueOf(pVar.f27065e));
        Boolean bool = pVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (h2().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                j0 j0Var = c1Var.f26889y;
                c1.g(j0Var);
                j0Var.B.c(j0.A1(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e4) {
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.B.d(j0.A1(str2), e4, "Error storing event aggregates. appId");
        }
    }

    public final void S1(String str, String str2) {
        cc.s.e(str2);
        s1();
        t1();
        try {
            h2().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e4) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.B.d(j0.A1(str2), e4, "Error deleting snapshot. appId");
        }
    }

    public final q3 T1(String str, long j, byte[] bArr, String str2, String str3, int i10, int i11, long j7, long j10, long j11) {
        c1 c1Var = (c1) this.f1504d;
        if (TextUtils.isEmpty(str2)) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.J.b("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) m0.f2(com.google.android.gms.internal.measurement.f3.w(), bArr);
            k2 k2VarZzb = k2.zzb(i10);
            if (k2VarZzb != k2.GOOGLE_SIGNAL && k2VarZzb != k2.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.f3) e3Var.f5042d).p()).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.g3 g3Var = (com.google.android.gms.internal.measurement.g3) ((com.google.android.gms.internal.measurement.h3) it.next()).i();
                    g3Var.b();
                    ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).T0(i11);
                    arrayList.add((com.google.android.gms.internal.measurement.h3) g3Var.e());
                }
                e3Var.b();
                ((com.google.android.gms.internal.measurement.f3) e3Var.f5042d).B();
                e3Var.b();
                ((com.google.android.gms.internal.measurement.f3) e3Var.f5042d).A(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length = strArrSplit.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    String str4 = strArrSplit[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split("=", 2);
                    if (strArrSplit2.length != 2) {
                        j0 j0Var2 = c1Var.f26889y;
                        c1.g(j0Var2);
                        j0Var2.B.c(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i12++;
                }
            }
            return new q3(j, (com.google.android.gms.internal.measurement.f3) e3Var.e(), str2, map, k2VarZzb, j7, j10, j11, i11);
        } catch (IOException e4) {
            j0 j0Var3 = c1Var.f26889y;
            c1.g(j0Var3);
            j0Var3.B.d(str, e4, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String U1() {
        ((c1) this.f1504d).G.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        k2 k2Var = k2.GOOGLE_SIGNAL;
        int iZza = k2Var.zza();
        Long l10 = (Long) u.S.a(null);
        l10.getClass();
        String str = "(upload_type = " + iZza + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l10 + ")";
        String str2 = "(upload_type != " + k2Var.zza() + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + ((Long) u.R.a(null)).longValue() + ")";
        StringBuilder sb2 = new StringBuilder(str.length() + 5 + str2.length() + 1);
        w.g.q(sb2, "(", str, " OR ", str2);
        sb2.append(")");
        return sb2.toString();
    }

    public final void W1(String str, o1 o1Var) {
        cc.s.h(str);
        s1();
        t1();
        N1(str, L1(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", o1Var.g());
        P1(contentValues);
    }

    public final o1 X1(String str) {
        cc.s.h(str);
        s1();
        t1();
        return o1.c(100, O1("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final p Y1(String str, com.google.android.gms.internal.measurement.z2 z2Var, String str2) {
        p pVarQ1 = Q1("events", str, z2Var.s());
        if (pVarQ1 != null) {
            long j = pVarQ1.f27065e + 1;
            long j7 = pVarQ1.f27064d + 1;
            return new p(pVarQ1.f27061a, pVarQ1.f27062b, pVarQ1.f27063c + 1, j7, j, pVarQ1.f27066f, pVarQ1.f27067g, pVarQ1.f27068h, pVarQ1.f27069i, pVarQ1.j, pVarQ1.k);
        }
        c1 c1Var = (c1) this.f1504d;
        j0 j0Var = c1Var.f26889y;
        c1.g(j0Var);
        j0Var.F.d(j0.A1(str), c1Var.F.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new p(str, z2Var.s(), 1L, 1L, 1L, z2Var.u(), 0L, null, null, null, null);
    }

    public final boolean Z1() {
        return ((c1) this.f1504d).f26884a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8 A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TRY_LEAVE, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a2(java.lang.String r21, long r22, long r24, zc.q0 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l.a2(java.lang.String, long, long, zc.q0):void");
    }

    public final long c2(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = h2().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e4) {
                j0 j0Var = ((c1) this.f1504d).f26889y;
                c1.g(j0Var);
                j0Var.B.d(str, e4, "Database error");
                throw e4;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long d2(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = h2().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e4) {
                j0 j0Var = ((c1) this.f1504d).f26889y;
                c1.g(j0Var);
                j0Var.B.d(str, e4, "Database error");
                throw e4;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public final void e2() {
        t1();
        h2().beginTransaction();
    }

    public final void f2() {
        t1();
        h2().setTransactionSuccessful();
    }

    public final void g2() {
        t1();
        h2().endTransaction();
    }

    public final SQLiteDatabase h2() {
        s1();
        try {
            return this.f26985x.getWritableDatabase();
        } catch (SQLiteException e4) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.F.c(e4, "Error opening database");
            throw e4;
        }
    }

    public final void i2(String str) {
        p pVarQ1;
        S1("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = h2().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (pVarQ1 = Q1("events", str, string)) != null) {
                            R1("events_snapshot", pVarQ1);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e4) {
                j0 j0Var = ((c1) this.f1504d).f26889y;
                c1.g(j0Var);
                j0Var.B.d(j0.A1(str), e4, "Error creating snapshot. appId");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j2(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l.j2(java.lang.String):void");
    }

    public final void k2(String str, String str2) {
        cc.s.e(str);
        cc.s.e(str2);
        s1();
        t1();
        try {
            h2().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e4) {
            c1 c1Var = (c1) this.f1504d;
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.B.e("Error deleting user property. appId", j0.A1(str), c1Var.F.c(str2), e4);
        }
    }

    public final boolean l2(r3 r3Var) {
        c1 c1Var = (c1) this.f1504d;
        String str = r3Var.f27134b;
        s1();
        t1();
        String str2 = r3Var.f27133a;
        String str3 = r3Var.f27135c;
        if (m2(str2, str3) == null) {
            if (s3.q2(str3)) {
                if (c2("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(c1Var.f26887r.A1(str2, u.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jC2 = c2("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                c1Var.getClass();
                if (jC2 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(r3Var.f27136d));
        b2(contentValues, r3Var.f27137e);
        try {
            if (h2().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.B.c(j0.A1(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e4) {
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.B.d(j0.A1(str2), e4, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zc.r3 m2(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f1504d
            r1 = r0
            zc.c1 r1 = (zc.c1) r1
            cc.s.e(r12)
            cc.s.e(r13)
            r11.s1()
            r11.t1()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.h2()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r4 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r5 = "value"
            java.lang.String r6 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r6 = "app_id=? and name=?"
            java.lang.String[] r7 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L37
            goto L95
        L37:
            r0 = 0
            long r8 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r0 = 1
            java.lang.Object r10 = r11.F1(r3, r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r10 != 0) goto L44
            goto L95
        L44:
            r0 = 2
            java.lang.String r6 = r3.getString(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            zc.r3 r4 = new zc.r3     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r12 == 0) goto L6d
            zc.j0 r12 = r1.f26889y     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            zc.c1.g(r12)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            su.b r12 = r12.B     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r13 = "Got multiple records for user property, expected one. appId"
            zc.i0 r0 = zc.j0.A1(r5)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r12.c(r0, r13)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            goto L6d
        L67:
            r0 = move-exception
            r12 = r0
            goto L75
        L6a:
            r0 = move-exception
        L6b:
            r12 = r0
            goto L7f
        L6d:
            r3.close()
            return r4
        L71:
            r0 = move-exception
            r5 = r12
            r7 = r13
            goto L6b
        L75:
            r2 = r3
            goto L9b
        L77:
            r0 = move-exception
            r12 = r0
            goto L9b
        L7a:
            r0 = move-exception
            r5 = r12
            r7 = r13
            r12 = r0
            r3 = r2
        L7f:
            zc.j0 r13 = r1.f26889y     // Catch: java.lang.Throwable -> L67
            zc.c1.g(r13)     // Catch: java.lang.Throwable -> L67
            su.b r13 = r13.B     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Error querying user property. appId"
            zc.i0 r4 = zc.j0.A1(r5)     // Catch: java.lang.Throwable -> L67
            zc.f0 r1 = r1.F     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.c(r7)     // Catch: java.lang.Throwable -> L67
            r13.e(r0, r4, r1, r12)     // Catch: java.lang.Throwable -> L67
        L95:
            if (r3 == 0) goto L9a
            r3.close()
        L9a:
            return r2
        L9b:
            if (r2 == 0) goto La0
            r2.close()
        La0:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l.m2(java.lang.String, java.lang.String):zc.r3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List n2(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f1504d
            r1 = r0
            zc.c1 r1 = (zc.c1) r1
            cc.s.e(r13)
            r12.s1()
            r12.t1()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1000"
            r11 = 0
            android.database.sqlite.SQLiteDatabase r2 = r12.h2()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r9 = "rowid"
            r1.getClass()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            boolean r2 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r2 == 0) goto L9c
        L3f:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2 = 1
            java.lang.String r2 = r11.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r2 != 0) goto L4d
            java.lang.String r2 = ""
        L4d:
            r5 = r2
            goto L52
        L4f:
            r0 = move-exception
            r4 = r13
            goto L8a
        L52:
            r2 = 2
            long r7 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2 = 3
            java.lang.Object r9 = r12.F1(r11, r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r9 != 0) goto L73
            zc.j0 r2 = r1.f26889y     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            zc.c1.g(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            su.b r2 = r2.B     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            java.lang.String r3 = "Read invalid user property value, ignoring it. appId"
            zc.i0 r4 = zc.j0.A1(r13)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2.c(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r4 = r13
            goto L7c
        L70:
            r0 = move-exception
            r13 = r0
            goto La2
        L73:
            zc.r3 r3 = new zc.r3     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
            r0.add(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
        L7c:
            boolean r13 = r11.moveToNext()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
            if (r13 != 0) goto L83
            goto L9c
        L83:
            r13 = r4
            goto L3f
        L85:
            r0 = move-exception
            goto L8a
        L87:
            r0 = move-exception
            r4 = r13
            r13 = r0
        L8a:
            zc.j0 r13 = r1.f26889y     // Catch: java.lang.Throwable -> L70
            zc.c1.g(r13)     // Catch: java.lang.Throwable -> L70
            su.b r13 = r13.B     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "Error querying user properties. appId"
            zc.i0 r2 = zc.j0.A1(r4)     // Catch: java.lang.Throwable -> L70
            r13.d(r2, r0, r1)     // Catch: java.lang.Throwable -> L70
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L70
        L9c:
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r0
        La2:
            if (r11 == 0) goto La7
            r11.close()
        La7:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l.n2(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        zc.c1.g(r13);
        r13.B.c(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List o2(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l.o2(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean p2(zzah zzahVar) {
        c1 c1Var = (c1) this.f1504d;
        s1();
        t1();
        String str = zzahVar.f5397a;
        cc.s.h(str);
        if (m2(str, zzahVar.f5399g.f5421d) == null) {
            long jC2 = c2("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            c1Var.getClass();
            if (jC2 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzahVar.f5398d);
        contentValues.put("name", zzahVar.f5399g.f5421d);
        Object objD = zzahVar.f5399g.d();
        cc.s.h(objD);
        b2(contentValues, objD);
        contentValues.put("active", Boolean.valueOf(zzahVar.f5401x));
        contentValues.put("trigger_event_name", zzahVar.f5402y);
        contentValues.put("trigger_timeout", Long.valueOf(zzahVar.D));
        zzbg zzbgVar = zzahVar.B;
        s3 s3Var = c1Var.E;
        j0 j0Var = c1Var.f26889y;
        c1.e(s3Var);
        contentValues.put("timed_out_event", s3.W1(zzbgVar));
        contentValues.put("creation_timestamp", Long.valueOf(zzahVar.f5400r));
        c1.e(s3Var);
        contentValues.put("triggered_event", s3.W1(zzahVar.E));
        contentValues.put("triggered_timestamp", Long.valueOf(zzahVar.f5399g.f5422g));
        contentValues.put("time_to_live", Long.valueOf(zzahVar.F));
        contentValues.put("expired_event", s3.W1(zzahVar.G));
        try {
            if (h2().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            c1.g(j0Var);
            j0Var.B.c(j0.A1(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e4) {
            c1.g(j0Var);
            j0Var.B.d(j0.A1(str), e4, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:247), block:B:29:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzah q2(java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l.q2(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzah");
    }

    public final void r2(String str, String str2) {
        cc.s.e(str);
        cc.s.e(str2);
        s1();
        t1();
        try {
            h2().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e4) {
            c1 c1Var = (c1) this.f1504d;
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.B.e("Error deleting conditional property", j0.A1(str), c1Var.F.c(str2), e4);
        }
    }

    public final List s2(String str, String str2, String str3) {
        cc.s.e(str);
        s1();
        t1();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return t2(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        r3 = r2.f26889y;
        zc.c1.g(r3);
        r3.B.c(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List t2(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l.t2(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zc.n0 u2(java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l.u2(java.lang.String):zc.n0");
    }

    public final void v2(n0 n0Var, boolean z10) {
        c1 c1Var = (c1) this.f1504d;
        c1 c1Var2 = n0Var.f27019a;
        s1();
        t1();
        String strD = n0Var.D();
        cc.s.h(strD);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strD);
        p3 p3Var = this.f26981g;
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (p3Var.a(strD).i(n1.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", n0Var.E());
        }
        contentValues.put("gmp_app_id", n0Var.G());
        if (p3Var.a(strD).i(n1.AD_STORAGE)) {
            a1 a1Var = c1Var2.B;
            c1.g(a1Var);
            a1Var.s1();
            contentValues.put("resettable_device_id_hash", n0Var.f27023e);
        }
        a1 a1Var2 = c1Var2.B;
        c1.g(a1Var2);
        a1Var2.s1();
        contentValues.put("last_bundle_index", Long.valueOf(n0Var.f27025g));
        a1 a1Var3 = c1Var2.B;
        c1.g(a1Var3);
        a1Var3.s1();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(n0Var.f27026h));
        a1 a1Var4 = c1Var2.B;
        c1.g(a1Var4);
        a1Var4.s1();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(n0Var.f27027i));
        contentValues.put("app_version", n0Var.N());
        a1 a1Var5 = c1Var2.B;
        c1.g(a1Var5);
        a1Var5.s1();
        contentValues.put("app_store", n0Var.f27028l);
        a1 a1Var6 = c1Var2.B;
        c1.g(a1Var6);
        a1Var6.s1();
        contentValues.put("gmp_version", Long.valueOf(n0Var.f27029m));
        a1 a1Var7 = c1Var2.B;
        c1.g(a1Var7);
        a1Var7.s1();
        contentValues.put("dev_cert_hash", Long.valueOf(n0Var.f27030n));
        a1 a1Var8 = c1Var2.B;
        c1.g(a1Var8);
        a1Var8.s1();
        contentValues.put("measurement_enabled", Boolean.valueOf(n0Var.f27031o));
        a1 a1Var9 = c1Var2.B;
        a1 a1Var10 = c1Var2.B;
        c1.g(a1Var9);
        a1Var9.s1();
        contentValues.put("day", Long.valueOf(n0Var.J));
        c1.g(a1Var10);
        a1Var10.s1();
        contentValues.put("daily_public_events_count", Long.valueOf(n0Var.K));
        c1.g(a1Var10);
        a1Var10.s1();
        contentValues.put("daily_events_count", Long.valueOf(n0Var.L));
        c1.g(a1Var10);
        a1Var10.s1();
        contentValues.put("daily_conversions_count", Long.valueOf(n0Var.M));
        a1 a1Var11 = c1Var2.B;
        c1.g(a1Var11);
        a1Var11.s1();
        contentValues.put("config_fetched_time", Long.valueOf(n0Var.R));
        a1 a1Var12 = c1Var2.B;
        c1.g(a1Var12);
        a1Var12.s1();
        contentValues.put("failed_config_fetch_time", Long.valueOf(n0Var.S));
        contentValues.put("app_version_int", Long.valueOf(n0Var.P()));
        contentValues.put("firebase_instance_id", n0Var.J());
        c1.g(a1Var10);
        a1Var10.s1();
        contentValues.put("daily_error_events_count", Long.valueOf(n0Var.N));
        c1.g(a1Var10);
        a1Var10.s1();
        contentValues.put("daily_realtime_events_count", Long.valueOf(n0Var.O));
        c1.g(a1Var10);
        a1Var10.s1();
        contentValues.put("health_monitor_sample", n0Var.P);
        contentValues.put("android_id", (Long) 0L);
        a1 a1Var13 = c1Var2.B;
        c1.g(a1Var13);
        a1Var13.s1();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(n0Var.f27032p));
        contentValues.put("dynamite_version", Long.valueOf(n0Var.b()));
        if (p3Var.a(strD).i(n1.ANALYTICS_STORAGE)) {
            a1 a1Var14 = c1Var2.B;
            c1.g(a1Var14);
            a1Var14.s1();
            contentValues.put("session_stitching_token", n0Var.f27036t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(n0Var.y()));
        a1 a1Var15 = c1Var2.B;
        c1.g(a1Var15);
        a1Var15.s1();
        contentValues.put("target_os_version", Long.valueOf(n0Var.f27038v));
        a1 a1Var16 = c1Var2.B;
        c1.g(a1Var16);
        a1Var16.s1();
        contentValues.put("session_stitching_token_hash", Long.valueOf(n0Var.f27039w));
        q8.a();
        f fVar = c1Var.f26887r;
        j0 j0Var = c1Var.f26889y;
        if (fVar.C1(strD, u.P0)) {
            a1 a1Var17 = c1Var2.B;
            c1.g(a1Var17);
            a1Var17.s1();
            contentValues.put("ad_services_version", Integer.valueOf(n0Var.f27040x));
            a1 a1Var18 = c1Var2.B;
            c1.g(a1Var18);
            a1Var18.s1();
            contentValues.put("attribution_eligibility_status", Long.valueOf(n0Var.B));
        }
        a1 a1Var19 = c1Var2.B;
        c1.g(a1Var19);
        a1Var19.s1();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(n0Var.f27041y));
        contentValues.put("npa_metadata_value", n0Var.w());
        a1 a1Var20 = c1Var2.B;
        c1.g(a1Var20);
        a1Var20.s1();
        contentValues.put("bundle_delivery_index", Long.valueOf(n0Var.F));
        contentValues.put("sgtm_preview_key", n0Var.C());
        c1.g(a1Var10);
        a1Var10.s1();
        contentValues.put("dma_consent_state", Integer.valueOf(n0Var.D));
        c1.g(a1Var10);
        a1Var10.s1();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(n0Var.E));
        contentValues.put("serialized_npa_metadata", n0Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(n0Var.t()));
        a1 a1Var21 = c1Var2.B;
        c1.g(a1Var21);
        a1Var21.s1();
        ArrayList arrayList = n0Var.f27035s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                c1.g(j0Var);
                j0Var.F.c(strD, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (c1Var.f26887r.C1(null, u.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        a1 a1Var22 = c1Var2.B;
        c1.g(a1Var22);
        a1Var22.s1();
        contentValues.put("unmatched_pfo", n0Var.f27042z);
        a1 a1Var23 = c1Var2.B;
        c1.g(a1Var23);
        a1Var23.s1();
        contentValues.put("unmatched_uwa", n0Var.A);
        a1 a1Var24 = c1Var2.B;
        c1.g(a1Var24);
        a1Var24.s1();
        contentValues.put("ad_campaign_info", n0Var.H);
        try {
            SQLiteDatabase sQLiteDatabaseH2 = h2();
            if (sQLiteDatabaseH2.update("apps", contentValues, "app_id = ?", new String[]{strD}) == 0 && sQLiteDatabaseH2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                c1.g(j0Var);
                j0Var.B.c(j0.A1(strD), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e4) {
            c1.g(j0Var);
            j0Var.B.d(j0.A1(strD), e4, "Error storing app. appId");
        }
    }

    public final long w1(String str, com.google.android.gms.internal.measurement.f3 f3Var, String str2, Map map, k2 k2Var, Long l10) {
        int iDelete;
        c1 c1Var = (c1) this.f1504d;
        s1();
        t1();
        cc.s.h(f3Var);
        cc.s.e(str);
        s1();
        t1();
        if (Z1()) {
            p3 p3Var = this.f26981g;
            long jE = p3Var.E.B.e();
            gc.a aVar = c1Var.G;
            j0 j0Var = c1Var.f26889y;
            aVar.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jE) > ((Long) u.M.a(null)).longValue()) {
                p3Var.E.B.f(jElapsedRealtime);
                s1();
                t1();
                if (Z1() && (iDelete = h2().delete("upload_queue", U1(), new String[0])) > 0) {
                    c1.g(j0Var);
                    j0Var.K.c(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                cc.s.e(str);
                s1();
                t1();
                try {
                    int iA1 = c1Var.f26887r.A1(str, u.A);
                    if (iA1 > 0) {
                        h2().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iA1)});
                    }
                } catch (SQLiteException e4) {
                    c1.g(j0Var);
                    j0Var.B.d(j0.A1(str), e4, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(c7.a.d(1, str3) + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrA = f3Var.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrA);
        contentValues.put("upload_uri", str2);
        StringBuilder sb3 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb3.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb3.append((CharSequence) "\r\n");
            }
        }
        contentValues.put("upload_headers", sb3.toString());
        contentValues.put("upload_type", Integer.valueOf(k2Var.zza()));
        gc.a aVar2 = c1Var.G;
        j0 j0Var2 = c1Var.f26889y;
        aVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long jInsert = h2().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            c1.g(j0Var2);
            j0Var2.B.c(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e10) {
            c1.g(j0Var2);
            j0Var2.B.d(str, e10, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    public final h w2(long j, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        return x2(j, str, 1L, false, false, z10, false, z11, z12, z13);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List x1(java.lang.String r19, com.google.android.gms.measurement.internal.zzoo r20, int r21) {
        /*
            r18 = this;
            cc.s.e(r19)
            r18.s1()
            r18.t1()
            java.lang.String r0 = " AND NOT "
            java.lang.String r1 = "app_id=?"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r18.h2()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r4 = "upload_queue"
            java.lang.String r5 = "rowId"
            java.lang.String r6 = "app_id"
            java.lang.String r7 = "measurement_batch"
            java.lang.String r8 = "upload_uri"
            java.lang.String r9 = "upload_headers"
            java.lang.String r10 = "upload_type"
            java.lang.String r11 = "retry_count"
            java.lang.String r12 = "creation_timestamp"
            java.lang.String r13 = "associated_row_id"
            java.lang.String r14 = "last_upload_timestamp"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r6 = r20
            java.util.List r6 = r6.f5418a     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r6 = V1(r6)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r7 = r18.U1()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r6.length()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r8 + 17
            int r9 = r7.length()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r6)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r7)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String[] r7 = new java.lang.String[]{r19}     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r10 = "creation_timestamp ASC"
            if (r21 <= 0) goto L66
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r11 = r0
            goto L67
        L66:
            r11 = r2
        L67:
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
        L72:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            if (r1 == 0) goto Lb9
            r1 = 0
            long r5 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 2
            byte[] r7 = r2.getBlob(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 3
            java.lang.String r8 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 4
            java.lang.String r9 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 5
            int r10 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 6
            int r11 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 7
            long r12 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 8
            long r14 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 9
            long r16 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r3 = r18
            r4 = r19
            zc.q3 r1 = r3.T1(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            if (r1 == 0) goto L72
            r0.add(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            goto L72
        Lb5:
            r0 = move-exception
            goto Lbc
        Lb7:
            r0 = move-exception
            goto Lbf
        Lb9:
            r3 = r18
            goto Ld5
        Lbc:
            r3 = r18
            goto Ldc
        Lbf:
            r3 = r18
            java.lang.Object r1 = r3.f1504d     // Catch: java.lang.Throwable -> Ldb
            zc.c1 r1 = (zc.c1) r1     // Catch: java.lang.Throwable -> Ldb
            zc.j0 r1 = r1.f26889y     // Catch: java.lang.Throwable -> Ldb
            zc.c1.g(r1)     // Catch: java.lang.Throwable -> Ldb
            su.b r1 = r1.B     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. appId"
            r5 = r19
            r1.d(r5, r0, r4)     // Catch: java.lang.Throwable -> Ldb
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> Ldb
        Ld5:
            if (r2 == 0) goto Lda
            r2.close()
        Lda:
            return r0
        Ldb:
            r0 = move-exception
        Ldc:
            if (r2 == 0) goto Le1
            r2.close()
        Le1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l.x1(java.lang.String, com.google.android.gms.measurement.internal.zzoo, int):java.util.List");
    }

    public final h x2(long j, String str, long j7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        c1 c1Var = (c1) this.f1504d;
        cc.s.e(str);
        s1();
        t1();
        String[] strArr = {str};
        h hVar = new h();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseH2 = h2();
                cursorQuery = sQLiteDatabaseH2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        hVar.f26946b = cursorQuery.getLong(1);
                        hVar.f26945a = cursorQuery.getLong(2);
                        hVar.f26947c = cursorQuery.getLong(3);
                        hVar.f26948d = cursorQuery.getLong(4);
                        hVar.f26949e = cursorQuery.getLong(5);
                        hVar.f26950f = cursorQuery.getLong(6);
                        hVar.f26951g = cursorQuery.getLong(7);
                    }
                    if (z10) {
                        hVar.f26946b += j7;
                    }
                    if (z11) {
                        hVar.f26945a += j7;
                    }
                    if (z12) {
                        hVar.f26947c += j7;
                    }
                    if (z13) {
                        hVar.f26948d += j7;
                    }
                    if (z14) {
                        hVar.f26949e += j7;
                    }
                    if (z15) {
                        hVar.f26950f += j7;
                    }
                    if (z16) {
                        hVar.f26951g += j7;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(hVar.f26945a));
                    contentValues.put("daily_events_count", Long.valueOf(hVar.f26946b));
                    contentValues.put("daily_conversions_count", Long.valueOf(hVar.f26947c));
                    contentValues.put("daily_error_events_count", Long.valueOf(hVar.f26948d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(hVar.f26949e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(hVar.f26950f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(hVar.f26951g));
                    sQLiteDatabaseH2.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    j0 j0Var = c1Var.f26889y;
                    c1.g(j0Var);
                    j0Var.F.c(j0.A1(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e4) {
                j0 j0Var2 = c1Var.f26889y;
                c1.g(j0Var2);
                j0Var2.B.d(j0.A1(str), e4, "Error updating daily counts. appId");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return hVar;
        } catch (Throwable th2) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public final boolean y1(String str) {
        k2[] k2VarArr = {k2.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(k2VarArr[0].zza()));
        String strV1 = V1(arrayList);
        String strU1 = U1();
        StringBuilder sb2 = new StringBuilder(strV1.length() + 61 + strU1.length());
        sb2.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb2.append(strV1);
        sb2.append(" AND NOT ");
        sb2.append(strU1);
        return c2(sb2.toString(), new String[]{str}) != 0;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:109), block:B:19:0x006c */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final qm.c y2(java.lang.String r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f1504d
            r1 = r0
            zc.c1 r1 = (zc.c1) r1
            cc.s.e(r12)
            r11.s1()
            r11.t1()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.h2()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r4 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String r6 = "e_tag"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r0 != 0) goto L33
            goto L83
        L33:
            r0 = 0
            byte[] r0 = r3.getBlob(r0)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r4 = 1
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r5 = 2
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            boolean r6 = r3.moveToNext()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r6 == 0) goto L5e
            zc.j0 r6 = r1.f26889y     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            zc.c1.g(r6)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            su.b r6 = r6.B     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            zc.i0 r8 = zc.j0.A1(r12)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r6.c(r8, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            goto L5e
        L59:
            r0 = move-exception
            r12 = r0
            goto L6c
        L5c:
            r0 = move-exception
            goto L73
        L5e:
            if (r0 != 0) goto L61
            goto L83
        L61:
            qm.c r6 = new qm.c     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r7 = 25
            r6.<init>(r0, r4, r5, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r3.close()
            return r6
        L6c:
            r2 = r3
            goto L89
        L6e:
            r0 = move-exception
            r12 = r0
            goto L89
        L71:
            r0 = move-exception
            r3 = r2
        L73:
            zc.j0 r1 = r1.f26889y     // Catch: java.lang.Throwable -> L59
            zc.c1.g(r1)     // Catch: java.lang.Throwable -> L59
            su.b r1 = r1.B     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "Error querying remote config. appId"
            zc.i0 r12 = zc.j0.A1(r12)     // Catch: java.lang.Throwable -> L59
            r1.d(r12, r0, r4)     // Catch: java.lang.Throwable -> L59
        L83:
            if (r3 == 0) goto L88
            r3.close()
        L88:
            return r2
        L89:
            if (r2 == 0) goto L8e
            r2.close()
        L8e:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l.y2(java.lang.String):qm.c");
    }

    public final void z1(Long l10) {
        c1 c1Var = (c1) this.f1504d;
        s1();
        t1();
        try {
            if (h2().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                j0 j0Var = c1Var.f26889y;
                c1.g(j0Var);
                j0Var.F.b("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e4) {
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.B.c(e4, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e4;
        }
    }

    public final void z2(com.google.android.gms.internal.measurement.h3 h3Var, boolean z10) {
        s1();
        t1();
        cc.s.e(h3Var.p());
        if (!h3Var.b2()) {
            throw new IllegalStateException();
        }
        C1();
        c1 c1Var = (c1) this.f1504d;
        gc.a aVar = c1Var.G;
        j0 j0Var = c1Var.f26889y;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC2 = h3Var.c2();
        t tVar = u.R;
        if (jC2 < jCurrentTimeMillis - ((Long) tVar.a(null)).longValue() || h3Var.c2() > ((Long) tVar.a(null)).longValue() + jCurrentTimeMillis) {
            c1.g(j0Var);
            j0Var.F.e("Storing bundle outside of the max uploading time span. appId, now, timestamp", j0.A1(h3Var.p()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(h3Var.c2()));
        }
        byte[] bArrA = h3Var.a();
        try {
            m0 m0Var = this.f26981g.B;
            p3.Q(m0Var);
            byte[] bArrE2 = m0Var.e2(bArrA);
            c1.g(j0Var);
            j0Var.K.c(Integer.valueOf(bArrE2.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", h3Var.p());
            contentValues.put("bundle_end_timestamp", Long.valueOf(h3Var.c2()));
            contentValues.put("data", bArrE2);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (h3Var.p0()) {
                contentValues.put("retry_count", Integer.valueOf(h3Var.q0()));
            }
            try {
                if (h2().insert("queue", null, contentValues) == -1) {
                    c1.g(j0Var);
                    j0Var.B.c(j0.A1(h3Var.p()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e4) {
                c1.g(j0Var);
                j0Var.B.d(j0.A1(h3Var.p()), e4, "Error storing bundle. appId");
            }
        } catch (IOException e10) {
            c1.g(j0Var);
            j0Var.B.d(j0.A1(h3Var.p()), e10, "Data loss. Failed to serialize bundle. appId");
        }
    }

    @Override // zc.k3
    public final void v1() {
    }
}
