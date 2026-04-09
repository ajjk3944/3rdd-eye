package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C4452s2;
import com.google.android.gms.internal.measurement.C4468u2;
import com.google.android.gms.internal.measurement.C4480v6;
import com.google.android.gms.internal.measurement.C4484w2;
import com.google.android.gms.internal.measurement.C4492x2;
import com.google.android.gms.internal.measurement.C4508z2;
import com.google.android.gms.internal.measurement.D4;
import com.google.android.gms.internal.measurement.P1;
import com.google.android.gms.internal.measurement.Q1;
import com.google.android.gms.internal.measurement.R1;
import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.measurement.internal.C4839e4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.C7010a;
import org.snmp4j.mp.SnmpConstants;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4933q extends U6 {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f36652f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    static final String[] f36653g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f36654h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f36655i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f36656j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f36657k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f36658l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f36659m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f36660n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f36661o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: p, reason: collision with root package name */
    private static final String[] f36662p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d, reason: collision with root package name */
    private final C4996y f36663d;

    /* renamed from: e, reason: collision with root package name */
    private final H6 f36664e;

    C4933q(C4833d7 c4833d7) {
        super(c4833d7);
        this.f36664e = new H6(zzb());
        this.f36663d = new C4996y(this, zza(), "google_app_measurement.db");
    }

    private final String B0() {
        long jA = zzb().a();
        Locale locale = Locale.US;
        EnumC4954s5 enumC4954s5 = EnumC4954s5.GOOGLE_SIGNAL;
        Integer numValueOf = Integer.valueOf(enumC4954s5.zza());
        Long lValueOf = Long.valueOf(jA);
        Long l10 = (Long) N.f36045S.a(null);
        l10.longValue();
        return "(" + String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", numValueOf, lValueOf, l10) + " OR " + String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", Integer.valueOf(enumC4954s5.zza()), Long.valueOf(jA), Long.valueOf(C4893l.N())) + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long E(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = x().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j10;
                }
                long j11 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j11;
            } catch (SQLiteException e10) {
                zzj().C().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    private final long E0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = x().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                zzj().C().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    private final C4492x2 F0(String str, long j10) throws Throwable {
        C4492x2 c4492x2;
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = x().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str, Long.toString(j10)}, null, null, "rowid", "2");
                try {
                    try {
                        if (!cursorQuery.moveToFirst()) {
                            zzj().C().b("Raw event metadata record is missing. appId", L2.r(str));
                            cursorQuery.close();
                            return null;
                        }
                        try {
                            C4492x2 c4492x22 = (C4492x2) ((com.google.android.gms.internal.measurement.D4) ((C4492x2.a) s7.C(C4492x2.D2(), cursorQuery.getBlob(0))).p());
                            try {
                                if (cursorQuery.moveToNext()) {
                                    zzj().H().b("Get multiple raw event metadata records, expected one. appId", L2.r(str));
                                }
                                cursorQuery.close();
                                cursorQuery.close();
                                return c4492x22;
                            } catch (SQLiteException e10) {
                                cursor = cursorQuery;
                                c4492x2 = c4492x22;
                                e = e10;
                                zzj().C().c("Data loss. Error selecting raw event. appId", L2.r(str), e);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return c4492x2;
                            }
                        } catch (IOException e11) {
                            zzj().C().c("Data loss. Failed to merge raw event metadata. appId", L2.r(str), e11);
                            cursorQuery.close();
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    cursor = cursorQuery;
                    c4492x2 = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLiteException e13) {
            e = e13;
            c4492x2 = null;
        }
    }

    private static String H0(List list) {
        return list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    private final n7 L(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12, long j13) {
        EnumC4954s5 enumC4954s5;
        if (TextUtils.isEmpty(str2)) {
            zzj().B().a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            C4484w2.a aVar = (C4484w2.a) s7.C(C4484w2.L(), bArr);
            EnumC4954s5[] enumC4954s5ArrValues = EnumC4954s5.values();
            int length = enumC4954s5ArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    enumC4954s5 = EnumC4954s5.UNKNOWN;
                    break;
                }
                enumC4954s5 = enumC4954s5ArrValues[i12];
                if (enumC4954s5.zza() == i10) {
                    break;
                }
                i12++;
            }
            if (enumC4954s5 != EnumC4954s5.GOOGLE_SIGNAL && enumC4954s5 != EnumC4954s5.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = aVar.G().iterator();
                while (it.hasNext()) {
                    C4492x2.a aVar2 = (C4492x2.a) ((C4492x2) it.next()).v();
                    aVar2.H0(i11);
                    arrayList.add((C4492x2) ((com.google.android.gms.internal.measurement.D4) aVar2.p()));
                }
                aVar.D();
                aVar.z(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length2 = strArrSplit.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        break;
                    }
                    String str4 = strArrSplit[i13];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split("=", 2);
                    if (strArrSplit2.length != 2) {
                        zzj().C().b("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i13++;
                }
            }
            return new q7().j(j10).d((C4484w2) ((com.google.android.gms.internal.measurement.D4) aVar.p())).f(str2).g(map).e(enumC4954s5).h(j11).c(j12).i(j13).b(i11).a();
        } catch (IOException e10) {
            zzj().C().c("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
            return null;
        }
    }

    private final boolean L0(String str, List list) {
        AbstractC7901p.f(str);
        q();
        j();
        SQLiteDatabase sQLiteDatabaseX = x();
        try {
            long jE0 = E0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, a().u(str, N.f36049U)));
            if (jE0 <= iMax) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                Integer num = (Integer) list.get(i10);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String str2 = "(" + TextUtils.join(",", arrayList) + ")";
            StringBuilder sb2 = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb2.append(str2);
            sb2.append(" order by rowid desc limit -1 offset ?)");
            return sQLiteDatabaseX.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)}) > 0;
        } catch (SQLiteException e10) {
            zzj().C().c("Database error querying filters. appId", L2.r(str), e10);
            return false;
        }
    }

    private final Object M(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            zzj().C().a("Loaded invalid null value from database");
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
            zzj().C().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        zzj().C().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object N(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.InterfaceC5004z r5) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.x()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            if (r4 != 0) goto L25
            com.google.android.gms.measurement.internal.L2 r4 = r2.zzj()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            com.google.android.gms.measurement.internal.N2 r4 = r4.G()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            java.lang.String r5 = "No data found"
            r4.a(r5)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r0
        L20:
            r4 = move-exception
            r0 = r3
            goto L44
        L23:
            r4 = move-exception
            goto L31
        L25:
            java.lang.Object r4 = r5.a(r3)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r4
        L2d:
            r4 = move-exception
            goto L44
        L2f:
            r4 = move-exception
            r3 = r0
        L31:
            com.google.android.gms.measurement.internal.L2 r5 = r2.zzj()     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.measurement.internal.N2 r5 = r5.C()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "Error querying database."
            r5.b(r1, r4)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L43
            r3.close()
        L43:
            return r0
        L44:
            if (r0 == 0) goto L49
            r0.close()
        L49:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4933q.N(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.z):java.lang.Object");
    }

    private final String O(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = x().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return str2;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e10) {
                zzj().C().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.measurement.internal.H O0(java.lang.String r29, java.lang.String r30, java.lang.String r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4933q.O0(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.H");
    }

    private static void T(ContentValues contentValues, String str, Object obj) {
        AbstractC7901p.f(str);
        AbstractC7901p.l(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    private final void Y(String str, H h10) {
        AbstractC7901p.l(h10);
        j();
        q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", h10.f35902a);
        contentValues.put("name", h10.f35903b);
        contentValues.put("lifetime_count", Long.valueOf(h10.f35904c));
        contentValues.put("current_bundle_count", Long.valueOf(h10.f35905d));
        contentValues.put("last_fire_timestamp", Long.valueOf(h10.f35907f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(h10.f35908g));
        contentValues.put("last_bundled_day", h10.f35909h);
        contentValues.put("last_sampled_complex_event_id", h10.f35910i);
        contentValues.put("last_sampling_rate", h10.f35911j);
        contentValues.put("current_session_count", Long.valueOf(h10.f35906e));
        Boolean bool = h10.f35912k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (x().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().C().b("Failed to insert/update event aggregates (got -1). appId", L2.r(h10.f35902a));
            }
        } catch (SQLiteException e10) {
            zzj().C().c("Error storing event aggregates. appId", L2.r(h10.f35902a), e10);
        }
    }

    private final void b0(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseX = x();
            if (contentValues.getAsString(str2) == null) {
                zzj().D().b("Value of the primary key is not set.", L2.r(str2));
                return;
            }
            if (sQLiteDatabaseX.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && sQLiteDatabaseX.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().C().c("Failed to insert/update table (got -1). key", L2.r(str), L2.r(str2));
            }
        } catch (SQLiteException e10) {
            zzj().C().d("Error storing into table. key", L2.r(str), L2.r(str2), e10);
        }
    }

    private final void c1(String str, String str2) {
        AbstractC7901p.f(str2);
        j();
        q();
        try {
            x().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            zzj().C().c("Error deleting snapshot. appId", L2.r(str2), e10);
        }
    }

    private final boolean e0(long j10, I i10, long j11, boolean z10) {
        j();
        q();
        AbstractC7901p.l(i10);
        AbstractC7901p.f(i10.f35924a);
        byte[] bArrI = k().A(i10).i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", i10.f35924a);
        contentValues.put("name", i10.f35925b);
        contentValues.put("timestamp", Long.valueOf(i10.f35927d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j11));
        contentValues.put("data", bArrI);
        contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
        try {
            long jUpdate = x().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j10)});
            if (jUpdate == 1) {
                return true;
            }
            zzj().C().c("Failed to update raw event. appId, updatedRows", L2.r(i10.f35924a), Long.valueOf(jUpdate));
            return false;
        } catch (SQLiteException e10) {
            zzj().C().c("Error updating raw event. appId", L2.r(i10.f35924a), e10);
            return false;
        }
    }

    private final boolean j0(String str, int i10, com.google.android.gms.internal.measurement.Q1 q12) {
        q();
        j();
        AbstractC7901p.f(str);
        AbstractC7901p.l(q12);
        if (q12.M().isEmpty()) {
            zzj().H().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", L2.r(str), Integer.valueOf(i10), String.valueOf(q12.S() ? Integer.valueOf(q12.I()) : null));
            return false;
        }
        byte[] bArrI = q12.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", q12.S() ? Integer.valueOf(q12.I()) : null);
        contentValues.put("event_name", q12.M());
        contentValues.put("session_scoped", q12.T() ? Boolean.valueOf(q12.Q()) : null);
        contentValues.put("data", bArrI);
        try {
            if (x().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().C().b("Failed to insert event filter (got -1). appId", L2.r(str));
            return true;
        } catch (SQLiteException e10) {
            zzj().C().c("Error storing event filter. appId", L2.r(str), e10);
            return false;
        }
    }

    private final boolean k0(String str, int i10, com.google.android.gms.internal.measurement.T1 t12) {
        q();
        j();
        AbstractC7901p.f(str);
        AbstractC7901p.l(t12);
        if (t12.J().isEmpty()) {
            zzj().H().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", L2.r(str), Integer.valueOf(i10), String.valueOf(t12.N() ? Integer.valueOf(t12.j()) : null));
            return false;
        }
        byte[] bArrI = t12.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", t12.N() ? Integer.valueOf(t12.j()) : null);
        contentValues.put("property_name", t12.J());
        contentValues.put("session_scoped", t12.O() ? Boolean.valueOf(t12.M()) : null);
        contentValues.put("data", bArrI);
        try {
            if (x().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().C().b("Failed to insert property filter (got -1). appId", L2.r(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().C().c("Error storing property filter. appId", L2.r(str), e10);
            return false;
        }
    }

    private final int l1(String str) {
        AbstractC7901p.f(str);
        j();
        q();
        try {
            int iU = a().u(str, N.f36009A);
            if (iU <= 0) {
                return 0;
            }
            return x().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iU)});
        } catch (SQLiteException e10) {
            zzj().C().c("Error deleting over the limit queued batches. appId", L2.r(str), e10);
            return 0;
        }
    }

    public final long A(C4492x2 c4492x2) {
        j();
        q();
        AbstractC7901p.l(c4492x2);
        AbstractC7901p.f(c4492x2.V());
        byte[] bArrI = c4492x2.i();
        long jW = k().w(bArrI);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c4492x2.V());
        contentValues.put("metadata_fingerprint", Long.valueOf(jW));
        contentValues.put("metadata", bArrI);
        try {
            x().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jW;
        } catch (SQLiteException e10) {
            zzj().C().c("Error storing raw event metadata. appId", L2.r(c4492x2.V()), e10);
            throw e10;
        }
    }

    public final long C(String str) {
        AbstractC7901p.f(str);
        j();
        q();
        try {
            return x().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(SnmpConstants.MILLISECOND_TO_NANOSECOND, a().u(str, N.f36109q))))});
        } catch (SQLiteException e10) {
            zzj().C().c("Error deleting over the limit events. appId", L2.r(str), e10);
            return 0L;
        }
    }

    public final long C0(String str) {
        AbstractC7901p.f(str);
        return E("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final long D(String str, C4484w2 c4484w2, String str2, Map map, EnumC4954s5 enumC4954s5, Long l10) {
        int iDelete;
        j();
        q();
        AbstractC7901p.l(c4484w2);
        AbstractC7901p.f(str);
        if (!a().p(N.f36034M0)) {
            return -1L;
        }
        j();
        q();
        if (q0()) {
            long jA = o().f36637f.a();
            long jC = zzb().c();
            if (Math.abs(jC - jA) > C4893l.O()) {
                o().f36637f.b(jC);
                j();
                q();
                if (q0() && (iDelete = x().delete("upload_queue", B0(), new String[0])) > 0) {
                    zzj().G().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
                if (a().p(N.f36040P0)) {
                    l1(str);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
        }
        byte[] bArrI = c4484w2.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrI);
        contentValues.put("upload_uri", str2);
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb2.append((CharSequence) arrayList.get(0));
            int i10 = 1;
            while (i10 < size) {
                sb2.append((CharSequence) "\r\n");
                Object obj = arrayList.get(i10);
                i10++;
                sb2.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb2.toString());
        contentValues.put("upload_type", Integer.valueOf(enumC4954s5.zza()));
        contentValues.put("creation_timestamp", Long.valueOf(zzb().a()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long jInsert = x().insert("upload_queue", null, contentValues);
            if (jInsert == -1) {
                zzj().C().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            }
            return jInsert;
        } catch (SQLiteException e10) {
            zzj().C().c("Error storing MeasurementBatch to upload_queue. appId", str, e10);
            return -1L;
        }
    }

    protected final long D0(String str, String str2) {
        AbstractC7901p.f(str);
        AbstractC7901p.f(str2);
        j();
        q();
        SQLiteDatabase sQLiteDatabaseX = x();
        sQLiteDatabaseX.beginTransaction();
        long j10 = 0;
        try {
            try {
                long jE = E("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (jE == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseX.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzj().C().c("Failed to insert column (got -1). appId", L2.r(str), str2);
                        return -1L;
                    }
                    jE = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + jE));
                    if (sQLiteDatabaseX.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        zzj().C().c("Failed to update column (got 0). appId", L2.r(str), str2);
                        return -1L;
                    }
                    sQLiteDatabaseX.setTransactionSuccessful();
                    return jE;
                } catch (SQLiteException e10) {
                    long j11 = jE;
                    e = e10;
                    j10 = j11;
                    zzj().C().d("Error inserting column. appId", L2.r(str), str2, e);
                    sQLiteDatabaseX.endTransaction();
                    return j10;
                }
            } catch (SQLiteException e11) {
                e = e11;
            }
        } finally {
            sQLiteDatabaseX.endTransaction();
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0031: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:10:0x0031 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair F(java.lang.String r6, java.lang.Long r7) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.j()
            r5.q()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.x()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String[] r3 = new java.lang.String[]{r6, r3}     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            if (r2 != 0) goto L35
            com.google.android.gms.measurement.internal.L2 r6 = r5.zzj()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.N2 r6 = r6.G()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r7 = "Main event not found"
            r6.a(r7)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r0
        L30:
            r6 = move-exception
            r0 = r1
            goto L8a
        L33:
            r6 = move-exception
            goto L77
        L35:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r3 = 1
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.internal.measurement.s2$a r4 = com.google.android.gms.internal.measurement.C4452s2.R()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.g5 r2 = com.google.android.gms.measurement.internal.s7.C(r4, r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.s2$a r2 = (com.google.android.gms.internal.measurement.C4452s2.a) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.h5 r2 = r2.p()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.D4 r2 = (com.google.android.gms.internal.measurement.D4) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.s2 r2 = (com.google.android.gms.internal.measurement.C4452s2) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            android.util.Pair r6 = android.util.Pair.create(r2, r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r6
        L5d:
            r2 = move-exception
            com.google.android.gms.measurement.internal.L2 r3 = r5.zzj()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.N2 r3 = r3.C()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.L2.r(r6)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r3.d(r4, r6, r7, r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r0
        L73:
            r6 = move-exception
            goto L8a
        L75:
            r6 = move-exception
            r1 = r0
        L77:
            com.google.android.gms.measurement.internal.L2 r7 = r5.zzj()     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.measurement.internal.N2 r7 = r7.C()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Error selecting main event"
            r7.b(r2, r6)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L89
            r1.close()
        L89:
            return r0
        L8a:
            if (r0 == 0) goto L8f
            r0.close()
        L8f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4933q.F(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final C4972v G(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        AbstractC7901p.f(str);
        j();
        q();
        String[] strArr = {str};
        C4972v c4972v = new C4972v();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX = x();
                Cursor cursorQuery = sQLiteDatabaseX.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    zzj().H().b("Not updating daily counts, app is not known. appId", L2.r(str));
                    cursorQuery.close();
                    return c4972v;
                }
                if (cursorQuery.getLong(0) == j10) {
                    c4972v.f36794b = cursorQuery.getLong(1);
                    c4972v.f36793a = cursorQuery.getLong(2);
                    c4972v.f36795c = cursorQuery.getLong(3);
                    c4972v.f36796d = cursorQuery.getLong(4);
                    c4972v.f36797e = cursorQuery.getLong(5);
                    c4972v.f36798f = cursorQuery.getLong(6);
                    c4972v.f36799g = cursorQuery.getLong(7);
                }
                if (z10) {
                    c4972v.f36794b += j11;
                }
                if (z11) {
                    c4972v.f36793a += j11;
                }
                if (z12) {
                    c4972v.f36795c += j11;
                }
                if (z13) {
                    c4972v.f36796d += j11;
                }
                if (z14) {
                    c4972v.f36797e += j11;
                }
                if (z15) {
                    c4972v.f36798f += j11;
                }
                if (z16) {
                    c4972v.f36799g += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(c4972v.f36793a));
                contentValues.put("daily_events_count", Long.valueOf(c4972v.f36794b));
                contentValues.put("daily_conversions_count", Long.valueOf(c4972v.f36795c));
                contentValues.put("daily_error_events_count", Long.valueOf(c4972v.f36796d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c4972v.f36797e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(c4972v.f36798f));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(c4972v.f36799g));
                sQLiteDatabaseX.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c4972v;
            } catch (SQLiteException e10) {
                zzj().C().c("Error updating daily counts. appId", L2.r(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return c4972v;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String G0(long r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r3.j()
            r3.q()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.x()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            if (r5 != 0) goto L35
            com.google.android.gms.measurement.internal.L2 r5 = r3.zzj()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.N2 r5 = r5.G()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.a(r1)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r4.close()
            return r0
        L30:
            r5 = move-exception
            r0 = r4
            goto L55
        L33:
            r5 = move-exception
            goto L42
        L35:
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r4.close()
            return r5
        L3e:
            r5 = move-exception
            goto L55
        L40:
            r5 = move-exception
            r4 = r0
        L42:
            com.google.android.gms.measurement.internal.L2 r1 = r3.zzj()     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.measurement.internal.N2 r1 = r1.C()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r5)     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L54
            r4.close()
        L54:
            return r0
        L55:
            if (r0 == 0) goto L5a
            r0.close()
        L5a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4933q.G0(long):java.lang.String");
    }

    public final C4972v H(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return G(j10, str, 1L, false, false, z12, false, z14, z15, z16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        zzj().C().b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List I0(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4933q.I0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    final void J0(Long l10) throws SQLException {
        String str;
        j();
        q();
        AbstractC7901p.l(l10);
        if (a().p(N.f36034M0) && q0()) {
            if (E0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l10 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                zzj().H().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseX = x();
                if (a().p(N.f36040P0)) {
                    str = " SET retry_count = retry_count + 1, last_upload_timestamp = " + zzb().a();
                } else {
                    str = " SET retry_count = retry_count + 1 ";
                }
                sQLiteDatabaseX.execSQL("UPDATE upload_queue" + str + " WHERE rowid = " + l10 + " AND retry_count < 2147483647");
            } catch (SQLiteException e10) {
                zzj().C().b("Error incrementing retry count. error", e10);
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0092: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:16:0x0092 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.n7 K(long r19) throws java.lang.Throwable {
        /*
            r18 = this;
            com.google.android.gms.measurement.internal.l r0 = r18.a()
            com.google.android.gms.measurement.internal.q2 r1 = com.google.android.gms.measurement.internal.N.f36040P0
            boolean r0 = r0.p(r1)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            r18.j()
            r18.q()
            android.database.sqlite.SQLiteDatabase r2 = r18.x()     // Catch: java.lang.Throwable -> L96 android.database.sqlite.SQLiteException -> L98
            java.lang.String r3 = "upload_queue"
            java.lang.String r4 = "rowId"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "measurement_batch"
            java.lang.String r7 = "upload_uri"
            java.lang.String r8 = "upload_headers"
            java.lang.String r9 = "upload_type"
            java.lang.String r10 = "retry_count"
            java.lang.String r11 = "creation_timestamp"
            java.lang.String r12 = "associated_row_id"
            java.lang.String r13 = "last_upload_timestamp"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}     // Catch: java.lang.Throwable -> L96 android.database.sqlite.SQLiteException -> L98
            java.lang.String r5 = "rowId=?"
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch: java.lang.Throwable -> L96 android.database.sqlite.SQLiteException -> L98
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L96 android.database.sqlite.SQLiteException -> L98
            java.lang.String r10 = "1"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L96 android.database.sqlite.SQLiteException -> L98
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            if (r0 != 0) goto L4f
            r2.close()
            return r1
        L4f:
            r0 = 1
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            java.lang.Object r0 = s3.AbstractC7901p.l(r0)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r0 = 2
            byte[] r7 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r0 = 3
            java.lang.String r8 = r2.getString(r0)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r0 = 4
            java.lang.String r9 = r2.getString(r0)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r0 = 5
            int r10 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r0 = 6
            int r11 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r0 = 7
            long r12 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r0 = 8
            long r14 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r0 = 9
            long r16 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r3 = r18
            r5 = r19
            com.google.android.gms.measurement.internal.n7 r0 = r3.L(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r2.close()
            return r0
        L91:
            r0 = move-exception
            r1 = r2
            goto Lb1
        L94:
            r0 = move-exception
            goto L9a
        L96:
            r0 = move-exception
            goto Lb1
        L98:
            r0 = move-exception
            r2 = r1
        L9a:
            com.google.android.gms.measurement.internal.L2 r3 = r18.zzj()     // Catch: java.lang.Throwable -> L91
            com.google.android.gms.measurement.internal.N2 r3 = r3.C()     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. rowId"
            java.lang.Long r5 = java.lang.Long.valueOf(r19)     // Catch: java.lang.Throwable -> L91
            r3.c(r4, r5, r0)     // Catch: java.lang.Throwable -> L91
            if (r2 == 0) goto Lb0
            r2.close()
        Lb0:
            return r1
        Lb1:
            if (r1 == 0) goto Lb6
            r1.close()
        Lb6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4933q.K(long):com.google.android.gms.measurement.internal.n7");
    }

    public final void K0(String str, C4839e4 c4839e4) {
        AbstractC7901p.l(str);
        AbstractC7901p.l(c4839e4);
        j();
        q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c4839e4.v());
        contentValues.put("consent_source", Integer.valueOf(c4839e4.b()));
        b0("consent_settings", "app_id", contentValues);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:10:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle M0(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.j()
            r5.q()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.x()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            if (r2 != 0) goto L31
            com.google.android.gms.measurement.internal.L2 r6 = r5.zzj()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.N2 r6 = r6.G()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r2 = "Default event parameters not found"
            r6.a(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L2c:
            r6 = move-exception
            r0 = r1
            goto L84
        L2f:
            r6 = move-exception
            goto L71
        L31:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.internal.measurement.s2$a r3 = com.google.android.gms.internal.measurement.C4452s2.R()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.g5 r2 = com.google.android.gms.measurement.internal.s7.C(r3, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.s2$a r2 = (com.google.android.gms.internal.measurement.C4452s2.a) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.h5 r2 = r2.p()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.D4 r2 = (com.google.android.gms.internal.measurement.D4) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.s2 r2 = (com.google.android.gms.internal.measurement.C4452s2) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            r5.k()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.util.List r6 = r2.U()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.s7.x(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r6
        L57:
            r2 = move-exception
            com.google.android.gms.measurement.internal.L2 r3 = r5.zzj()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.N2 r3 = r3.C()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.L2.r(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r3.c(r4, r6, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L6d:
            r6 = move-exception
            goto L84
        L6f:
            r6 = move-exception
            r1 = r0
        L71:
            com.google.android.gms.measurement.internal.L2 r2 = r5.zzj()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.N2 r2 = r2.C()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r6)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L83
            r1.close()
        L83:
            return r0
        L84:
            if (r0 == 0) goto L89
            r0.close()
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4933q.M0(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0053: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:14:0x0053 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C4877j N0(java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4933q.N0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.j");
    }

    public final List P(String str, int i10, int i11) {
        byte[] bArrF0;
        long jO;
        long jO2;
        j();
        q();
        int i12 = 1;
        AbstractC7901p.a(i10 > 0);
        AbstractC7901p.a(i11 > 0);
        AbstractC7901p.f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = x().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i10));
                if (!cursorQuery.moveToFirst()) {
                    List listEmptyList = Collections.emptyList();
                    cursorQuery.close();
                    return listEmptyList;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (true) {
                    long j10 = cursorQuery.getLong(0);
                    try {
                        bArrF0 = k().f0(cursorQuery.getBlob(i12));
                    } catch (IOException e10) {
                        zzj().C().c("Failed to unzip queued bundle. appId", L2.r(str), e10);
                    }
                    if (!arrayList.isEmpty() && bArrF0.length + length > i11) {
                        break;
                    }
                    try {
                        C4492x2.a aVar = (C4492x2.a) s7.C(C4492x2.D2(), bArrF0);
                        if (!arrayList.isEmpty()) {
                            C4492x2 c4492x2 = (C4492x2) ((Pair) arrayList.get(0)).first;
                            C4492x2 c4492x22 = (C4492x2) ((com.google.android.gms.internal.measurement.D4) aVar.p());
                            if (!c4492x2.a0().equals(c4492x22.a0()) || !c4492x2.Z().equals(c4492x22.Z()) || c4492x2.r0() != c4492x22.r0() || !c4492x2.b0().equals(c4492x22.b0())) {
                                break;
                            }
                            Iterator it = c4492x2.o0().iterator();
                            while (true) {
                                jO = -1;
                                if (!it.hasNext()) {
                                    jO2 = -1;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.C2 c22 = (com.google.android.gms.internal.measurement.C2) it.next();
                                if ("_npa".equals(c22.T())) {
                                    jO2 = c22.O();
                                    break;
                                }
                            }
                            Iterator it2 = c4492x22.o0().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                com.google.android.gms.internal.measurement.C2 c23 = (com.google.android.gms.internal.measurement.C2) it2.next();
                                if ("_npa".equals(c23.T())) {
                                    jO = c23.O();
                                    break;
                                }
                            }
                            if (jO2 != jO) {
                                break;
                            }
                        }
                        if (!cursorQuery.isNull(2)) {
                            aVar.H0(cursorQuery.getInt(2));
                        }
                        length += bArrF0.length;
                        arrayList.add(Pair.create((C4492x2) ((com.google.android.gms.internal.measurement.D4) aVar.p()), Long.valueOf(j10)));
                    } catch (IOException e11) {
                        zzj().C().c("Failed to merge queued bundle. appId", L2.r(str), e11);
                    }
                    if (!cursorQuery.moveToNext() || length > i11) {
                        break;
                    }
                    i12 = 1;
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e12) {
                zzj().C().c("Error querying bundles. appId", L2.r(str), e12);
                List listEmptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return listEmptyList2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final H P0(String str, String str2) {
        return O0("events", str, str2);
    }

    public final List Q(String str, Q6 q62, int i10) {
        if (!a().p(N.f36040P0)) {
            return Collections.emptyList();
        }
        AbstractC7901p.f(str);
        j();
        q();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = x().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "app_id=?" + H0(q62.f36189a) + " AND NOT " + B0(), new String[]{str}, null, null, "creation_timestamp ASC", i10 > 0 ? String.valueOf(i10) : null);
                ArrayList arrayList = new ArrayList();
                while (cursorQuery.moveToNext()) {
                    n7 n7VarL = L(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                    if (n7VarL != null) {
                        arrayList.add(n7VarL);
                    }
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e10) {
                zzj().C().c("Error to querying MeasurementBatch from upload_queue. appId", str, e10);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C4864h2 Q0(java.lang.String r52) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4933q.Q0(java.lang.String):com.google.android.gms.measurement.internal.h2");
    }

    public final List R(String str, String str2, String str3) {
        AbstractC7901p.f(str);
        j();
        q();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb2.append(" and name glob ?");
        }
        return S(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0059: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:14:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C4948s R0(java.lang.String r10) throws java.lang.Throwable {
        /*
            r9 = this;
            s3.AbstractC7901p.f(r10)
            r9.j()
            r9.q()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.x()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            if (r2 != 0) goto L31
            r1.close()
            return r0
        L31:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            boolean r5 = r1.moveToNext()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            if (r5 == 0) goto L5d
            com.google.android.gms.measurement.internal.L2 r5 = r9.zzj()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            com.google.android.gms.measurement.internal.N2 r5 = r5.C()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.L2.r(r10)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r5.b(r6, r7)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            goto L5d
        L58:
            r10 = move-exception
            r0 = r1
            goto L87
        L5b:
            r2 = move-exception
            goto L70
        L5d:
            if (r2 != 0) goto L63
            r1.close()
            return r0
        L63:
            com.google.android.gms.measurement.internal.s r5 = new com.google.android.gms.measurement.internal.s     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r1.close()
            return r5
        L6c:
            r10 = move-exception
            goto L87
        L6e:
            r2 = move-exception
            r1 = r0
        L70:
            com.google.android.gms.measurement.internal.L2 r3 = r9.zzj()     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.measurement.internal.N2 r3 = r3.C()     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.L2.r(r10)     // Catch: java.lang.Throwable -> L58
            r3.c(r4, r10, r2)     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L86
            r1.close()
        L86:
            return r0
        L87:
            if (r0 == 0) goto L8c
            r0.close()
        L8c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4933q.R0(java.lang.String):com.google.android.gms.measurement.internal.s");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        zzj().C().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List S(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4933q.S(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:19:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.u7 S0(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            s3.AbstractC7901p.f(r11)
            s3.AbstractC7901p.f(r12)
            r10.j()
            r10.q()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.x()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            if (r2 != 0) goto L34
            r1.close()
            return r0
        L34:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            r2 = 1
            java.lang.Object r9 = r10.M(r1, r2)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            if (r9 != 0) goto L44
            r1.close()
            return r0
        L44:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            com.google.android.gms.measurement.internal.u7 r2 = new com.google.android.gms.measurement.internal.u7     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            if (r3 == 0) goto L6e
            com.google.android.gms.measurement.internal.L2 r3 = r10.zzj()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            com.google.android.gms.measurement.internal.N2 r3 = r3.C()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.L2.r(r11)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            r3.b(r4, r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            goto L6e
        L69:
            r11 = move-exception
            r0 = r1
            goto L95
        L6c:
            r2 = move-exception
            goto L76
        L6e:
            r1.close()
            return r2
        L72:
            r11 = move-exception
            goto L95
        L74:
            r2 = move-exception
            r1 = r0
        L76:
            com.google.android.gms.measurement.internal.L2 r3 = r10.zzj()     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.N2 r3 = r3.C()     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.L2.r(r11)     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.D2 r5 = r10.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r12 = r5.g(r12)     // Catch: java.lang.Throwable -> L69
            r3.d(r4, r11, r12, r2)     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L94
            r1.close()
        L94:
            return r0
        L95:
            if (r0 == 0) goto L9a
            r0.close()
        L9a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4933q.S0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.u7");
    }

    public final D T0(String str) {
        AbstractC7901p.l(str);
        j();
        q();
        return D.d(O("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void U(H h10) {
        Y("events", h10);
    }

    final Map U0(String str, String str2) {
        q();
        j();
        AbstractC7901p.f(str);
        AbstractC7901p.f(str2);
        C7010a c7010a = new C7010a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = x().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.Q1 q12 = (com.google.android.gms.internal.measurement.Q1) ((com.google.android.gms.internal.measurement.D4) ((Q1.a) s7.C(com.google.android.gms.internal.measurement.Q1.J(), cursorQuery.getBlob(1))).p());
                        int i10 = cursorQuery.getInt(0);
                        List arrayList = (List) c7010a.get(Integer.valueOf(i10));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c7010a.put(Integer.valueOf(i10), arrayList);
                        }
                        arrayList.add(q12);
                    } catch (IOException e10) {
                        zzj().C().c("Failed to merge filter. appId", L2.r(str), e10);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c7010a;
            } catch (SQLiteException e11) {
                zzj().C().c("Database error querying filters. appId", L2.r(str), e11);
                Map mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final void V(C4864h2 c4864h2, boolean z10, boolean z11) {
        AbstractC7901p.l(c4864h2);
        j();
        q();
        String strL = c4864h2.l();
        AbstractC7901p.l(strL);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strL);
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f36173b.a0(strL).m(C4839e4.a.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", c4864h2.m());
        }
        contentValues.put("gmp_app_id", c4864h2.q());
        if (this.f36173b.a0(strL).m(C4839e4.a.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", c4864h2.s());
        }
        contentValues.put("last_bundle_index", Long.valueOf(c4864h2.G0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c4864h2.I0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c4864h2.E0()));
        contentValues.put("app_version", c4864h2.o());
        contentValues.put("app_store", c4864h2.n());
        contentValues.put("gmp_version", Long.valueOf(c4864h2.A0()));
        contentValues.put("dev_cert_hash", Long.valueOf(c4864h2.u0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c4864h2.A()));
        contentValues.put("day", Long.valueOf(c4864h2.s0()));
        contentValues.put("daily_public_events_count", Long.valueOf(c4864h2.n0()));
        contentValues.put("daily_events_count", Long.valueOf(c4864h2.k0()));
        contentValues.put("daily_conversions_count", Long.valueOf(c4864h2.e0()));
        contentValues.put("config_fetched_time", Long.valueOf(c4864h2.b0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c4864h2.y0()));
        contentValues.put("app_version_int", Long.valueOf(c4864h2.V()));
        contentValues.put("firebase_instance_id", c4864h2.p());
        contentValues.put("daily_error_events_count", Long.valueOf(c4864h2.h0()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c4864h2.q0()));
        contentValues.put("health_monitor_sample", c4864h2.r());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c4864h2.z()));
        contentValues.put("admob_app_id", c4864h2.j());
        contentValues.put("dynamite_version", Long.valueOf(c4864h2.w0()));
        if (this.f36173b.a0(strL).m(C4839e4.a.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", c4864h2.u());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c4864h2.C()));
        contentValues.put("target_os_version", Long.valueOf(c4864h2.K0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(c4864h2.J0()));
        if (com.google.android.gms.internal.measurement.U6.a() && a().D(strL, N.f36052V0)) {
            contentValues.put("ad_services_version", Integer.valueOf(c4864h2.a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(c4864h2.Y()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c4864h2.D()));
        contentValues.put("npa_metadata_value", c4864h2.L0());
        contentValues.put("bundle_delivery_index", Long.valueOf(c4864h2.C0()));
        contentValues.put("sgtm_preview_key", c4864h2.v());
        contentValues.put("dma_consent_state", Integer.valueOf(c4864h2.Q()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c4864h2.L()));
        contentValues.put("serialized_npa_metadata", c4864h2.t());
        if (a().D(strL, N.f36040P0)) {
            contentValues.put("client_upload_eligibility", Integer.valueOf(c4864h2.F()));
        }
        List listW = c4864h2.w();
        if (listW != null) {
            if (listW.isEmpty()) {
                zzj().H().b("Safelisted events should not be an empty list. appId", strL);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listW));
            }
        }
        if (C4480v6.a() && a().p(N.f36028J0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", c4864h2.M0());
        contentValues.put("unmatched_uwa", c4864h2.N0());
        contentValues.put("ad_campaign_info", c4864h2.E());
        try {
            SQLiteDatabase sQLiteDatabaseX = x();
            if (sQLiteDatabaseX.update("apps", contentValues, "app_id = ?", new String[]{strL}) == 0 && sQLiteDatabaseX.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzj().C().b("Failed to insert/update app (got -1). appId", L2.r(strL));
            }
        } catch (SQLiteException e10) {
            zzj().C().c("Error storing app. appId", L2.r(strL), e10);
        }
    }

    public final C4839e4 V0(String str) {
        AbstractC7901p.l(str);
        j();
        q();
        return C4839e4.p(O("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void W(Long l10) {
        j();
        q();
        AbstractC7901p.l(l10);
        if (a().p(N.f36034M0)) {
            try {
                if (x().delete("upload_queue", "rowid=?", new String[]{String.valueOf(l10)}) != 1) {
                    zzj().H().a("Deleted fewer rows from upload_queue than expected");
                }
            } catch (SQLiteException e10) {
                zzj().C().b("Failed to delete a MeasurementBatch in a upload_queue table", e10);
                throw e10;
            }
        }
    }

    final Map W0(String str, String str2) {
        q();
        j();
        AbstractC7901p.f(str);
        AbstractC7901p.f(str2);
        C7010a c7010a = new C7010a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = x().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.T1 t12 = (com.google.android.gms.internal.measurement.T1) ((com.google.android.gms.internal.measurement.D4) ((T1.a) s7.C(com.google.android.gms.internal.measurement.T1.H(), cursorQuery.getBlob(1))).p());
                        int i10 = cursorQuery.getInt(0);
                        List arrayList = (List) c7010a.get(Integer.valueOf(i10));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c7010a.put(Integer.valueOf(i10), arrayList);
                        }
                        arrayList.add(t12);
                    } catch (IOException e10) {
                        zzj().C().c("Failed to merge filter", L2.r(str), e10);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c7010a;
            } catch (SQLiteException e11) {
                zzj().C().c("Database error querying filters. appId", L2.r(str), e11);
                Map mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final void X(String str, D d10) {
        AbstractC7901p.l(str);
        AbstractC7901p.l(d10);
        j();
        q();
        C4839e4 c4839e4X0 = X0(str);
        C4839e4 c4839e4 = C4839e4.f36433c;
        if (c4839e4X0 == c4839e4) {
            K0(str, c4839e4);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", d10.j());
        b0("consent_settings", "app_id", contentValues);
    }

    public final C4839e4 X0(String str) {
        AbstractC7901p.l(str);
        j();
        q();
        C4839e4 c4839e4 = (C4839e4) N("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new InterfaceC5004z() { // from class: com.google.android.gms.measurement.internal.t
            @Override // com.google.android.gms.measurement.internal.InterfaceC5004z
            public final Object a(Cursor cursor) {
                return C4839e4.f(cursor.getString(0), cursor.getInt(1));
            }
        });
        return c4839e4 == null ? C4839e4.f36433c : c4839e4;
    }

    public final void Y0(String str, String str2) {
        AbstractC7901p.f(str);
        AbstractC7901p.f(str2);
        j();
        q();
        try {
            x().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzj().C().d("Error deleting user property. appId", L2.r(str), c().g(str2), e10);
        }
    }

    public final void Z(String str, C4839e4 c4839e4) {
        AbstractC7901p.l(str);
        AbstractC7901p.l(c4839e4);
        j();
        q();
        K0(str, X0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c4839e4.v());
        b0("consent_settings", "app_id", contentValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.n7 Z0(java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4933q.Z0(java.lang.String):com.google.android.gms.measurement.internal.n7");
    }

    public final void a0(String str, Long l10, String str2, Bundle bundle) {
        C4492x2 c4492x2F0;
        String str3 = str;
        AbstractC7901p.l(bundle);
        j();
        q();
        C4980w c4980w = (!a().p(N.f36078f1) || l10 == null) ? new C4980w(this, str3) : new C4980w(this, str3, l10.longValue());
        List<C4964u> listA = c4980w.a();
        while (!listA.isEmpty()) {
            for (C4964u c4964u : listA) {
                if (!TextUtils.isEmpty(str2) && (c4492x2F0 = F0(str3, c4964u.f36775b)) != null) {
                    Iterator it = c4492x2F0.o0().iterator();
                    while (it.hasNext()) {
                        if (((com.google.android.gms.internal.measurement.C2) it.next()).T().equals(str2)) {
                            break;
                        }
                    }
                }
                s7 s7VarK = k();
                C4452s2 c4452s2 = c4964u.f36777d;
                Bundle bundle2 = new Bundle();
                for (C4468u2 c4468u2 : c4452s2.U()) {
                    if (c4468u2.Y()) {
                        bundle2.putDouble(c4468u2.V(), c4468u2.F());
                    } else if (c4468u2.Z()) {
                        bundle2.putFloat(c4468u2.V(), c4468u2.M());
                    } else if (c4468u2.a0()) {
                        bundle2.putLong(c4468u2.V(), c4468u2.R());
                    } else if (c4468u2.c0()) {
                        bundle2.putString(c4468u2.V(), c4468u2.W());
                    } else if (c4468u2.X().isEmpty()) {
                        s7VarK.zzj().C().b("Unexpected parameter type for parameter", c4468u2);
                    } else {
                        bundle2.putParcelableArray(c4468u2.V(), s7.e0(c4468u2.X()));
                    }
                }
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                String strT = c4452s2.T();
                if (string == null) {
                    string = "";
                }
                P2 p22 = new P2(strT, string, bundle2, c4452s2.Q());
                g().J(p22.f36165d, bundle);
                e0(c4964u.f36774a, new I(this.f36331a, p22.f36163b, str, c4964u.f36777d.T(), c4964u.f36777d.Q(), c4964u.f36777d.P(), p22.f36165d), c4964u.f36775b, c4964u.f36776c);
                str3 = str;
            }
            listA = c4980w.a();
            str3 = str;
        }
    }

    public final boolean a1(String str, String str2) {
        return E0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final List b1(String str) {
        AbstractC7901p.f(str);
        j();
        q();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = x().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new K6(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e10) {
                zzj().C().c("Error querying trigger uris. appId", L2.r(str), e10);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    final void c0(String str, List list) {
        boolean z10;
        boolean z11;
        AbstractC7901p.l(list);
        for (int i10 = 0; i10 < list.size(); i10++) {
            P1.a aVarX = (P1.a) ((com.google.android.gms.internal.measurement.P1) list.get(i10)).v();
            if (aVarX.u() != 0) {
                for (int i11 = 0; i11 < aVarX.u(); i11++) {
                    Q1.a aVar = (Q1.a) aVarX.z(i11).v();
                    Q1.a aVar2 = (Q1.a) ((D4.b) aVar.clone());
                    String strB = AbstractC4898l4.b(aVar.A());
                    if (strB != null) {
                        aVar2.x(strB);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    for (int i12 = 0; i12 < aVar.u(); i12++) {
                        com.google.android.gms.internal.measurement.R1 r1Z = aVar.z(i12);
                        String strA = AbstractC4882j4.a(r1Z.K());
                        if (strA != null) {
                            aVar2.w(i12, (com.google.android.gms.internal.measurement.R1) ((com.google.android.gms.internal.measurement.D4) ((R1.a) r1Z.v()).u(strA).p()));
                            z11 = true;
                        }
                    }
                    if (z11) {
                        P1.a aVarW = aVarX.w(i11, aVar2);
                        list.set(i10, (com.google.android.gms.internal.measurement.P1) ((com.google.android.gms.internal.measurement.D4) aVarW.p()));
                        aVarX = aVarW;
                    }
                }
            }
            if (aVarX.A() != 0) {
                for (int i13 = 0; i13 < aVarX.A(); i13++) {
                    com.google.android.gms.internal.measurement.T1 t1B = aVarX.B(i13);
                    String strA2 = AbstractC4914n4.a(t1B.J());
                    if (strA2 != null) {
                        aVarX = aVarX.x(i13, ((T1.a) t1B.v()).u(strA2));
                        list.set(i10, (com.google.android.gms.internal.measurement.P1) ((com.google.android.gms.internal.measurement.D4) aVarX.p()));
                    }
                }
            }
        }
        q();
        j();
        AbstractC7901p.f(str);
        AbstractC7901p.l(list);
        SQLiteDatabase sQLiteDatabaseX = x();
        sQLiteDatabaseX.beginTransaction();
        try {
            q();
            j();
            AbstractC7901p.f(str);
            SQLiteDatabase sQLiteDatabaseX2 = x();
            sQLiteDatabaseX2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseX2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.P1 p12 = (com.google.android.gms.internal.measurement.P1) it.next();
                q();
                j();
                AbstractC7901p.f(str);
                AbstractC7901p.l(p12);
                if (p12.O()) {
                    int iJ = p12.j();
                    Iterator it2 = p12.M().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.Q1) it2.next()).S()) {
                                zzj().H().c("Event filter with no ID. Audience definition ignored. appId, audienceId", L2.r(str), Integer.valueOf(iJ));
                                break;
                            }
                        } else {
                            Iterator it3 = p12.N().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!((com.google.android.gms.internal.measurement.T1) it3.next()).N()) {
                                        zzj().H().c("Property filter with no ID. Audience definition ignored. appId, audienceId", L2.r(str), Integer.valueOf(iJ));
                                        break;
                                    }
                                } else {
                                    Iterator it4 = p12.M().iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            if (!j0(str, iJ, (com.google.android.gms.internal.measurement.Q1) it4.next())) {
                                                z10 = false;
                                                break;
                                            }
                                        } else {
                                            z10 = true;
                                            break;
                                        }
                                    }
                                    if (z10) {
                                        Iterator it5 = p12.N().iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                if (!k0(str, iJ, (com.google.android.gms.internal.measurement.T1) it5.next())) {
                                                    z10 = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z10) {
                                        q();
                                        j();
                                        AbstractC7901p.f(str);
                                        SQLiteDatabase sQLiteDatabaseX3 = x();
                                        sQLiteDatabaseX3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iJ)});
                                        sQLiteDatabaseX3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iJ)});
                                    }
                                }
                            }
                        }
                    }
                } else {
                    zzj().H().b("Audience with no ID. appId", L2.r(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                com.google.android.gms.internal.measurement.P1 p13 = (com.google.android.gms.internal.measurement.P1) it6.next();
                arrayList.add(p13.O() ? Integer.valueOf(p13.j()) : null);
            }
            L0(str, arrayList);
            sQLiteDatabaseX.setTransactionSuccessful();
            sQLiteDatabaseX.endTransaction();
        } catch (Throwable th2) {
            sQLiteDatabaseX.endTransaction();
            throw th2;
        }
    }

    final void d0(List list) throws SQLException {
        j();
        q();
        AbstractC7901p.l(list);
        AbstractC7901p.n(list.size());
        if (q0()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (E0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                zzj().H().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                x().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                zzj().C().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final List d1(String str) {
        AbstractC7901p.f(str);
        j();
        q();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = x().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursorQuery.getLong(2);
                    Object objM = M(cursorQuery, 3);
                    if (objM == null) {
                        zzj().C().b("Read invalid user property value, ignoring it. appId", L2.r(str));
                    } else {
                        arrayList.add(new u7(str, str2, string, j10, objM));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e10) {
                zzj().C().c("Error querying user properties. appId", L2.r(str), e10);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    final Map e1(String str) {
        q();
        j();
        AbstractC7901p.f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = x().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                C7010a c7010a = new C7010a();
                do {
                    int i10 = cursorQuery.getInt(0);
                    try {
                        c7010a.put(Integer.valueOf(i10), (C4508z2) ((com.google.android.gms.internal.measurement.D4) ((C4508z2.a) s7.C(C4508z2.Q(), cursorQuery.getBlob(1))).p()));
                    } catch (IOException e10) {
                        zzj().C().d("Failed to merge filter results. appId, audienceId, error", L2.r(str), Integer.valueOf(i10), e10);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c7010a;
            } catch (SQLiteException e11) {
                zzj().C().c("Database error querying filter results. appId", L2.r(str), e11);
                Map mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final boolean f0(C4492x2 c4492x2, boolean z10) {
        j();
        q();
        AbstractC7901p.l(c4492x2);
        AbstractC7901p.f(c4492x2.V());
        AbstractC7901p.o(c4492x2.P0());
        n1();
        long jA = zzb().a();
        if (c4492x2.l2() < jA - C4893l.N() || c4492x2.l2() > C4893l.N() + jA) {
            zzj().H().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", L2.r(c4492x2.V()), Long.valueOf(jA), Long.valueOf(c4492x2.l2()));
        }
        try {
            byte[] bArrD0 = k().d0(c4492x2.i());
            zzj().G().b("Saving bundle, size", Integer.valueOf(bArrD0.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c4492x2.V());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c4492x2.l2()));
            contentValues.put("data", bArrD0);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (c4492x2.W0()) {
                contentValues.put("retry_count", Integer.valueOf(c4492x2.G1()));
            }
            try {
                if (x().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzj().C().b("Failed to insert bundle (got -1). appId", L2.r(c4492x2.V()));
                return false;
            } catch (SQLiteException e10) {
                zzj().C().c("Error storing bundle. appId", L2.r(c4492x2.V()), e10);
                return false;
            }
        } catch (IOException e11) {
            zzj().C().c("Data loss. Failed to serialize bundle. appId", L2.r(c4492x2.V()), e11);
            return false;
        }
    }

    final Map f1(String str) {
        AbstractC7901p.f(str);
        C7010a c7010a = new C7010a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = x().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.Q1 q12 = (com.google.android.gms.internal.measurement.Q1) ((com.google.android.gms.internal.measurement.D4) ((Q1.a) s7.C(com.google.android.gms.internal.measurement.Q1.J(), cursorQuery.getBlob(1))).p());
                        if (q12.R()) {
                            int i10 = cursorQuery.getInt(0);
                            List arrayList = (List) c7010a.get(Integer.valueOf(i10));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                c7010a.put(Integer.valueOf(i10), arrayList);
                            }
                            arrayList.add(q12);
                        }
                    } catch (IOException e10) {
                        zzj().C().c("Failed to merge filter. appId", L2.r(str), e10);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c7010a;
            } catch (SQLiteException e11) {
                zzj().C().c("Database error querying filters. appId", L2.r(str), e11);
                Map mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final boolean g0(C4877j c4877j) {
        AbstractC7901p.l(c4877j);
        j();
        q();
        String str = c4877j.f36543a;
        AbstractC7901p.l(str);
        if (S0(str, c4877j.f36545c.f36713b) == null && E0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c4877j.f36544b);
        contentValues.put("name", c4877j.f36545c.f36713b);
        T(contentValues, "value", AbstractC7901p.l(c4877j.f36545c.b()));
        contentValues.put("active", Boolean.valueOf(c4877j.f36547e));
        contentValues.put("trigger_event_name", c4877j.f36548f);
        contentValues.put("trigger_timeout", Long.valueOf(c4877j.f36550h));
        g();
        contentValues.put("timed_out_event", x7.m0(c4877j.f36549g));
        contentValues.put("creation_timestamp", Long.valueOf(c4877j.f36546d));
        g();
        contentValues.put("triggered_event", x7.m0(c4877j.f36551i));
        contentValues.put("triggered_timestamp", Long.valueOf(c4877j.f36545c.f36714c));
        contentValues.put("time_to_live", Long.valueOf(c4877j.f36552j));
        g();
        contentValues.put("expired_event", x7.m0(c4877j.f36553k));
        try {
            if (x().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().C().b("Failed to insert/update conditional user property (got -1)", L2.r(str));
            return true;
        } catch (SQLiteException e10) {
            zzj().C().c("Error storing conditional user property", L2.r(str), e10);
            return true;
        }
    }

    final Map g1(String str) {
        q();
        j();
        AbstractC7901p.f(str);
        C7010a c7010a = new C7010a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = x().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!cursorRawQuery.moveToFirst()) {
                    Map mapEmptyMap = Collections.emptyMap();
                    cursorRawQuery.close();
                    return mapEmptyMap;
                }
                do {
                    int i10 = cursorRawQuery.getInt(0);
                    List arrayList = (List) c7010a.get(Integer.valueOf(i10));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        c7010a.put(Integer.valueOf(i10), arrayList);
                    }
                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                } while (cursorRawQuery.moveToNext());
                cursorRawQuery.close();
                return c7010a;
            } catch (SQLiteException e10) {
                zzj().C().c("Database error querying scoped filters. appId", L2.r(str), e10);
                Map mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final boolean h0(I i10, long j10, boolean z10) {
        j();
        q();
        AbstractC7901p.l(i10);
        AbstractC7901p.f(i10.f35924a);
        byte[] bArrI = k().A(i10).i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", i10.f35924a);
        contentValues.put("name", i10.f35925b);
        contentValues.put("timestamp", Long.valueOf(i10.f35927d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j10));
        contentValues.put("data", bArrI);
        contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
        try {
            if (x().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().C().b("Failed to insert raw event (got -1). appId", L2.r(i10.f35924a));
            return false;
        } catch (SQLiteException e10) {
            zzj().C().c("Error storing raw event. appId", L2.r(i10.f35924a), e10);
            return false;
        }
    }

    public final void h1(String str) {
        H hP0;
        c1("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = x().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string != null && (hP0 = P0(str, string)) != null) {
                        Y("events_snapshot", hP0);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            } catch (SQLiteException e10) {
                zzj().C().c("Error creating snapshot. appId", L2.r(str), e10);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public final boolean i0(u7 u7Var) {
        AbstractC7901p.l(u7Var);
        j();
        q();
        if (S0(u7Var.f36788a, u7Var.f36790c) == null) {
            if (x7.F0(u7Var.f36790c)) {
                if (E0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{u7Var.f36788a}) >= a().m(u7Var.f36788a, N.f36051V, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(u7Var.f36790c) && E0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{u7Var.f36788a, u7Var.f36789b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", u7Var.f36788a);
        contentValues.put("origin", u7Var.f36789b);
        contentValues.put("name", u7Var.f36790c);
        contentValues.put("set_timestamp", Long.valueOf(u7Var.f36791d));
        T(contentValues, "value", u7Var.f36792e);
        try {
            if (x().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().C().b("Failed to insert/update user property (got -1). appId", L2.r(u7Var.f36788a));
            return true;
        } catch (SQLiteException e10) {
            zzj().C().c("Error storing user property. appId", L2.r(u7Var.f36788a), e10);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i1(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4933q.i1(java.lang.String):void");
    }

    public final void j1() {
        q();
        x().beginTransaction();
    }

    public final boolean k1(String str) {
        if (!a().p(N.f36034M0)) {
            return false;
        }
        if (!a().p(N.f36040P0)) {
            String strB0 = B0();
            StringBuilder sb2 = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ");
            sb2.append(strB0);
            return E0(sb2.toString(), new String[]{str}) != 0;
        }
        EnumC4954s5[] enumC4954s5Arr = {EnumC4954s5.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        for (int i10 = 0; i10 <= 0; i10++) {
            arrayList.add(Integer.valueOf(enumC4954s5Arr[0].zza()));
        }
        String strH0 = H0(arrayList);
        String strB02 = B0();
        StringBuilder sb3 = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb3.append(strH0);
        sb3.append(" AND NOT ");
        sb3.append(strB02);
        return E0(sb3.toString(), new String[]{str}) != 0;
    }

    final boolean l0(String str, long j10) {
        if (!a().p(N.f36078f1) && zzb().a() > 15000 + j10) {
            return false;
        }
        try {
            if (E("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0) {
                return false;
            }
            return E("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0;
        } catch (SQLiteException e10) {
            zzj().C().b("Error checking backfill conditions", e10);
            return false;
        }
    }

    final boolean m0(String str, Bundle bundle) {
        j();
        q();
        byte[] bArrI = k().A(new I(this.f36331a, "", str, "dep", 0L, 0L, bundle)).i();
        zzj().G().c("Saving default event parameters, appId, data size", c().c(str), Integer.valueOf(bArrI.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrI);
        try {
            if (x().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().C().b("Failed to insert default event parameters (got -1). appId", L2.r(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().C().c("Error storing default event parameters. appId", L2.r(str), e10);
            return false;
        }
    }

    public final void m1() {
        q();
        x().endTransaction();
    }

    public final boolean n0(String str, K6 k62) {
        j();
        q();
        AbstractC7901p.l(k62);
        AbstractC7901p.f(str);
        long jA = zzb().a();
        long j10 = k62.f35972b;
        C4936q2 c4936q2 = N.f36118u0;
        if (j10 < jA - ((Long) c4936q2.a(null)).longValue() || k62.f35972b > ((Long) c4936q2.a(null)).longValue() + jA) {
            zzj().H().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", L2.r(str), Long.valueOf(jA), Long.valueOf(k62.f35972b));
        }
        zzj().G().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", k62.f35971a);
        contentValues.put("source", Integer.valueOf(k62.f35973c));
        contentValues.put("timestamp_millis", Long.valueOf(k62.f35972b));
        try {
            if (x().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzj().C().b("Failed to insert trigger URI (got -1). appId", L2.r(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().C().c("Error storing trigger URI. appId", L2.r(str), e10);
            return false;
        }
    }

    final void n1() {
        int iDelete;
        j();
        q();
        if (q0()) {
            long jA = o().f36636e.a();
            long jC = zzb().c();
            if (Math.abs(jC - jA) > C4893l.O()) {
                o().f36636e.b(jC);
                j();
                q();
                if (!q0() || (iDelete = x().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().a()), String.valueOf(C4893l.N())})) <= 0) {
                    return;
                }
                zzj().G().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    public final boolean o0(String str, Long l10, long j10, C4452s2 c4452s2) {
        j();
        q();
        AbstractC7901p.l(c4452s2);
        AbstractC7901p.f(str);
        AbstractC7901p.l(l10);
        byte[] bArrI = c4452s2.i();
        zzj().G().c("Saving complex main event, appId, data size", c().c(str), Integer.valueOf(bArrI.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrI);
        try {
            if (x().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().C().b("Failed to insert complex main event (got -1). appId", L2.r(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().C().c("Error storing complex main event. appId", L2.r(str), e10);
            return false;
        }
    }

    public final void o1() {
        q();
        x().setTransactionSuccessful();
    }

    public final boolean p0() {
        return E0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final boolean p1() {
        return E0("select count(1) > 0 from raw_events", null) != 0;
    }

    protected final boolean q0() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean q1() {
        return E0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    @Override // com.google.android.gms.measurement.internal.U6
    protected final boolean t() {
        return false;
    }

    public final long u() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = x().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                zzj().C().b("Error querying raw events", e10);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public final long v() {
        return E("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long w() {
        return E("select max(timestamp) from raw_events", null, 0L);
    }

    final SQLiteDatabase x() {
        j();
        try {
            return this.f36663d.getWritableDatabase();
        } catch (SQLiteException e10) {
            zzj().H().b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String y() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.x()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3c
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            com.google.android.gms.measurement.internal.L2 r3 = r6.zzj()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.N2 r3 = r3.C()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r0 == 0) goto L41
            r0.close()
        L41:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4933q.y():java.lang.String");
    }

    public final int z(String str, String str2) {
        AbstractC7901p.f(str);
        AbstractC7901p.f(str2);
        j();
        q();
        try {
            return x().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzj().C().d("Error deleting conditional property", L2.r(str), c().g(str2), e10);
            return 0;
        }
    }
}
