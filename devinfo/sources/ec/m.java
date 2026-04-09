package ec;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.p8;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends b4 {
    public static final String[] g = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f22881h = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f22882i = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] j = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f22883k = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f22884l = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f22885m = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f22886n = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f22887o = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: p, reason: collision with root package name */
    public static final String[] f22888p = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: q, reason: collision with root package name */
    public static final String[] f22889q = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: e, reason: collision with root package name */
    public final l f22890e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.d f22891f;

    public m(g4 g4Var) {
        super(g4Var);
        this.f22891f = new androidx.recyclerview.widget.d(((o1) this.f218b).f22957k);
        ((o1) this.f218b).getClass();
        this.f22890e = new l(this, ((o1) this.f218b).f22949a);
    }

    public static final String e0(List list) {
        return list.isEmpty() ? "" : d.h.t(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void k0(ContentValues contentValues, Object obj) {
        pb.y.e("value");
        pb.y.h(obj);
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

    public final void A0(String str, String str2) {
        pb.y.e(str);
        pb.y.e(str2);
        B();
        C();
        try {
            q0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            o1 o1Var = (o1) this.f218b;
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.g("Error deleting conditional property", s0.J(str), o1Var.j.c(str2), e2);
        }
    }

    public final List B0(String str, String str2, String str3) {
        pb.y.e(str);
        B();
        C();
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
        return C0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        r3 = r2.f22954f;
        ec.o1.m(r3);
        r3.g.e(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List C0(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.C0(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ec.x0 D0(java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.D0(java.lang.String):ec.x0");
    }

    public final void E0(x0 x0Var, boolean z3) {
        o1 o1Var = (o1) this.f218b;
        o1 o1Var2 = x0Var.f23138a;
        B();
        C();
        String strD = x0Var.D();
        pb.y.h(strD);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strD);
        z1 z1Var = z1.ANALYTICS_STORAGE;
        g4 g4Var = this.f23175c;
        if (z3) {
            contentValues.put("app_instance_id", (String) null);
        } else if (g4Var.e(strD).i(z1Var)) {
            contentValues.put("app_instance_id", x0Var.E());
        }
        contentValues.put("gmp_app_id", x0Var.G());
        if (g4Var.e(strD).i(z1.AD_STORAGE)) {
            l1 l1Var = o1Var2.g;
            o1.m(l1Var);
            l1Var.B();
            contentValues.put("resettable_device_id_hash", x0Var.f23142e);
        }
        l1 l1Var2 = o1Var2.g;
        o1.m(l1Var2);
        l1Var2.B();
        contentValues.put("last_bundle_index", Long.valueOf(x0Var.g));
        l1 l1Var3 = o1Var2.g;
        o1.m(l1Var3);
        l1Var3.B();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(x0Var.f23144h));
        l1 l1Var4 = o1Var2.g;
        o1.m(l1Var4);
        l1Var4.B();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(x0Var.f23145i));
        contentValues.put("app_version", x0Var.N());
        l1 l1Var5 = o1Var2.g;
        o1.m(l1Var5);
        l1Var5.B();
        contentValues.put("app_store", x0Var.f23147l);
        l1 l1Var6 = o1Var2.g;
        o1.m(l1Var6);
        l1Var6.B();
        contentValues.put("gmp_version", Long.valueOf(x0Var.f23148m));
        l1 l1Var7 = o1Var2.g;
        o1.m(l1Var7);
        l1Var7.B();
        contentValues.put("dev_cert_hash", Long.valueOf(x0Var.f23149n));
        l1 l1Var8 = o1Var2.g;
        o1.m(l1Var8);
        l1Var8.B();
        contentValues.put("measurement_enabled", Boolean.valueOf(x0Var.f23150o));
        l1 l1Var9 = o1Var2.g;
        l1 l1Var10 = o1Var2.g;
        o1.m(l1Var9);
        l1Var9.B();
        contentValues.put("day", Long.valueOf(x0Var.J));
        o1.m(l1Var10);
        l1Var10.B();
        contentValues.put("daily_public_events_count", Long.valueOf(x0Var.K));
        o1.m(l1Var10);
        l1Var10.B();
        contentValues.put("daily_events_count", Long.valueOf(x0Var.L));
        o1.m(l1Var10);
        l1Var10.B();
        contentValues.put("daily_conversions_count", Long.valueOf(x0Var.M));
        l1 l1Var11 = o1Var2.g;
        o1.m(l1Var11);
        l1Var11.B();
        contentValues.put("config_fetched_time", Long.valueOf(x0Var.R));
        l1 l1Var12 = o1Var2.g;
        o1.m(l1Var12);
        l1Var12.B();
        contentValues.put("failed_config_fetch_time", Long.valueOf(x0Var.S));
        contentValues.put("app_version_int", Long.valueOf(x0Var.P()));
        contentValues.put("firebase_instance_id", x0Var.J());
        o1.m(l1Var10);
        l1Var10.B();
        contentValues.put("daily_error_events_count", Long.valueOf(x0Var.N));
        o1.m(l1Var10);
        l1Var10.B();
        contentValues.put("daily_realtime_events_count", Long.valueOf(x0Var.O));
        o1.m(l1Var10);
        l1Var10.B();
        contentValues.put("health_monitor_sample", x0Var.P);
        contentValues.put("android_id", (Long) 0L);
        l1 l1Var13 = o1Var2.g;
        o1.m(l1Var13);
        l1Var13.B();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(x0Var.f23151p));
        contentValues.put("dynamite_version", Long.valueOf(x0Var.b()));
        if (g4Var.e(strD).i(z1Var)) {
            l1 l1Var14 = o1Var2.g;
            o1.m(l1Var14);
            l1Var14.B();
            contentValues.put("session_stitching_token", x0Var.f23155t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(x0Var.y()));
        l1 l1Var15 = o1Var2.g;
        o1.m(l1Var15);
        l1Var15.B();
        contentValues.put("target_os_version", Long.valueOf(x0Var.f23157v));
        l1 l1Var16 = o1Var2.g;
        o1.m(l1Var16);
        l1Var16.B();
        contentValues.put("session_stitching_token_hash", Long.valueOf(x0Var.f23158w));
        p8.a();
        g gVar = o1Var.f22952d;
        s0 s0Var = o1Var.f22954f;
        if (gVar.L(strD, d0.Q0)) {
            l1 l1Var17 = o1Var2.g;
            o1.m(l1Var17);
            l1Var17.B();
            contentValues.put("ad_services_version", Integer.valueOf(x0Var.f23159x));
            l1 l1Var18 = o1Var2.g;
            o1.m(l1Var18);
            l1Var18.B();
            contentValues.put("attribution_eligibility_status", Long.valueOf(x0Var.B));
        }
        l1 l1Var19 = o1Var2.g;
        o1.m(l1Var19);
        l1Var19.B();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(x0Var.f23160y));
        contentValues.put("npa_metadata_value", x0Var.w());
        l1 l1Var20 = o1Var2.g;
        o1.m(l1Var20);
        l1Var20.B();
        contentValues.put("bundle_delivery_index", Long.valueOf(x0Var.F));
        contentValues.put("sgtm_preview_key", x0Var.C());
        o1.m(l1Var10);
        l1Var10.B();
        contentValues.put("dma_consent_state", Integer.valueOf(x0Var.D));
        o1.m(l1Var10);
        l1Var10.B();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(x0Var.E));
        contentValues.put("serialized_npa_metadata", x0Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(x0Var.t()));
        l1 l1Var21 = o1Var2.g;
        o1.m(l1Var21);
        l1Var21.B();
        ArrayList arrayList = x0Var.f23154s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                o1.m(s0Var);
                s0Var.j.e(strD, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (o1Var.f22952d.L(null, d0.L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        l1 l1Var22 = o1Var2.g;
        o1.m(l1Var22);
        l1Var22.B();
        contentValues.put("unmatched_pfo", x0Var.f23161z);
        l1 l1Var23 = o1Var2.g;
        o1.m(l1Var23);
        l1Var23.B();
        contentValues.put("unmatched_uwa", x0Var.A);
        l1 l1Var24 = o1Var2.g;
        o1.m(l1Var24);
        l1Var24.B();
        contentValues.put("ad_campaign_info", x0Var.H);
        try {
            SQLiteDatabase sQLiteDatabaseQ0 = q0();
            if (sQLiteDatabaseQ0.update("apps", contentValues, "app_id = ?", new String[]{strD}) == 0 && sQLiteDatabaseQ0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                o1.m(s0Var);
                s0Var.g.e(s0.J(strD), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e2) {
            o1.m(s0Var);
            s0Var.g.f(s0.J(strD), e2, "Error storing app. appId");
        }
    }

    public final long F(String str, com.google.android.gms.internal.measurement.h3 h3Var, String str2, Map map, x2 x2Var, Long l10) {
        int iDelete;
        o1 o1Var = (o1) this.f218b;
        B();
        C();
        pb.y.h(h3Var);
        pb.y.e(str);
        B();
        C();
        if (i0()) {
            g4 g4Var = this.f23175c;
            long jA = g4Var.f22738i.g.a();
            tb.a aVar = o1Var.f22957k;
            s0 s0Var = o1Var.f22954f;
            aVar.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) d0.N.a(null)).longValue()) {
                g4Var.f22738i.g.b(jElapsedRealtime);
                B();
                C();
                if (i0() && (iDelete = q0().delete("upload_queue", d0(), new String[0])) > 0) {
                    o1.m(s0Var);
                    s0Var.f23060o.e(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                pb.y.e(str);
                B();
                C();
                try {
                    int iJ = o1Var.f22952d.J(str, d0.A);
                    if (iJ > 0) {
                        q0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iJ)});
                    }
                } catch (SQLiteException e2) {
                    o1.m(s0Var);
                    s0Var.g.f(s0.J(str), e2, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrA = h3Var.a();
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
        contentValues.put("upload_type", Integer.valueOf(x2Var.f23174a));
        tb.a aVar2 = o1Var.f22957k;
        s0 s0Var2 = o1Var.f22954f;
        aVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long jInsert = q0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            o1.m(s0Var2);
            s0Var2.g.e(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e10) {
            o1.m(s0Var2);
            s0Var2.g.f(str, e10, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    public final j F0(long j8, String str, boolean z3, boolean z10, boolean z11, boolean z12) {
        return G0(j8, str, 1L, false, false, z3, false, z10, z11, z12);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List G(java.lang.String r19, ec.z3 r20, int r21) {
        /*
            r18 = this;
            pb.y.e(r19)
            r18.B()
            r18.C()
            java.lang.String r0 = " AND NOT "
            java.lang.String r1 = "app_id=?"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r18.q0()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
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
            java.util.List r6 = r6.f23254a     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r6 = e0(r6)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r7 = r18.d0()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
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
            ec.h4 r1 = r3.c0(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
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
            java.lang.Object r1 = r3.f218b     // Catch: java.lang.Throwable -> Ldb
            ec.o1 r1 = (ec.o1) r1     // Catch: java.lang.Throwable -> Ldb
            ec.s0 r1 = r1.f22954f     // Catch: java.lang.Throwable -> Ldb
            ec.o1.m(r1)     // Catch: java.lang.Throwable -> Ldb
            com.google.android.gms.internal.ads.or r1 = r1.g     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. appId"
            r5 = r19
            r1.f(r5, r0, r4)     // Catch: java.lang.Throwable -> Ldb
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
        throw new UnsupportedOperationException("Method not decompiled: ec.m.G(java.lang.String, ec.z3, int):java.util.List");
    }

    public final j G0(long j8, String str, long j9, boolean z3, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        o1 o1Var = (o1) this.f218b;
        pb.y.e(str);
        B();
        C();
        String[] strArr = {str};
        j jVar = new j();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseQ0 = q0();
                cursorQuery = sQLiteDatabaseQ0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j8) {
                        jVar.f22806b = cursorQuery.getLong(1);
                        jVar.f22805a = cursorQuery.getLong(2);
                        jVar.f22807c = cursorQuery.getLong(3);
                        jVar.f22808d = cursorQuery.getLong(4);
                        jVar.f22809e = cursorQuery.getLong(5);
                        jVar.f22810f = cursorQuery.getLong(6);
                        jVar.g = cursorQuery.getLong(7);
                    }
                    if (z3) {
                        jVar.f22806b += j9;
                    }
                    if (z10) {
                        jVar.f22805a += j9;
                    }
                    if (z11) {
                        jVar.f22807c += j9;
                    }
                    if (z12) {
                        jVar.f22808d += j9;
                    }
                    if (z13) {
                        jVar.f22809e += j9;
                    }
                    if (z14) {
                        jVar.f22810f += j9;
                    }
                    if (z15) {
                        jVar.g += j9;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j8));
                    contentValues.put("daily_public_events_count", Long.valueOf(jVar.f22805a));
                    contentValues.put("daily_events_count", Long.valueOf(jVar.f22806b));
                    contentValues.put("daily_conversions_count", Long.valueOf(jVar.f22807c));
                    contentValues.put("daily_error_events_count", Long.valueOf(jVar.f22808d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(jVar.f22809e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(jVar.f22810f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(jVar.g));
                    sQLiteDatabaseQ0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    s0 s0Var = o1Var.f22954f;
                    o1.m(s0Var);
                    s0Var.j.e(s0.J(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e2) {
                s0 s0Var2 = o1Var.f22954f;
                o1.m(s0Var2);
                s0Var2.g.f(s0.J(str), e2, "Error updating daily counts. appId");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return jVar;
        } catch (Throwable th2) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public final boolean H(String str) {
        x2[] x2VarArr = {x2.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(x2VarArr[0].f23174a));
        String strE0 = e0(arrayList);
        String strD0 = d0();
        return l0(a0.g.p(new StringBuilder((strE0.length() + 61) + strD0.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strE0, " AND NOT ", strD0), new String[]{str}) != 0;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:109), block:B:19:0x006c */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yb.e H0(java.lang.String r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f218b
            r1 = r0
            ec.o1 r1 = (ec.o1) r1
            pb.y.e(r12)
            r11.B()
            r11.C()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.q0()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
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
            ec.s0 r6 = r1.f22954f     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            ec.o1.m(r6)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            com.google.android.gms.internal.ads.or r6 = r6.g     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            ec.r0 r8 = ec.s0.J(r12)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r6.e(r8, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
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
            yb.e r6 = new yb.e     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r7 = 15
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
            ec.s0 r1 = r1.f22954f     // Catch: java.lang.Throwable -> L59
            ec.o1.m(r1)     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.or r1 = r1.g     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "Error querying remote config. appId"
            ec.r0 r12 = ec.s0.J(r12)     // Catch: java.lang.Throwable -> L59
            r1.f(r12, r0, r4)     // Catch: java.lang.Throwable -> L59
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
        throw new UnsupportedOperationException("Method not decompiled: ec.m.H0(java.lang.String):yb.e");
    }

    public final void I(Long l10) {
        o1 o1Var = (o1) this.f218b;
        B();
        C();
        try {
            if (q0().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                s0 s0Var = o1Var.f22954f;
                o1.m(s0Var);
                s0Var.j.d("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e2) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.g.e(e2, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e2;
        }
    }

    public final void I0(com.google.android.gms.internal.measurement.j3 j3Var, boolean z3) {
        B();
        C();
        pb.y.e(j3Var.p());
        pb.y.k(j3Var.b2());
        L();
        o1 o1Var = (o1) this.f218b;
        tb.a aVar = o1Var.f22957k;
        s0 s0Var = o1Var.f22954f;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC2 = j3Var.c2();
        c0 c0Var = d0.S;
        if (jC2 < jCurrentTimeMillis - ((Long) c0Var.a(null)).longValue() || j3Var.c2() > ((Long) c0Var.a(null)).longValue() + jCurrentTimeMillis) {
            o1.m(s0Var);
            s0Var.j.g("Storing bundle outside of the max uploading time span. appId, now, timestamp", s0.J(j3Var.p()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j3Var.c2()));
        }
        byte[] bArrA = j3Var.a();
        try {
            w0 w0Var = this.f23175c.g;
            g4.U(w0Var);
            byte[] bArrN0 = w0Var.n0(bArrA);
            o1.m(s0Var);
            s0Var.f23060o.e(Integer.valueOf(bArrN0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", j3Var.p());
            contentValues.put("bundle_end_timestamp", Long.valueOf(j3Var.c2()));
            contentValues.put("data", bArrN0);
            contentValues.put("has_realtime", Integer.valueOf(z3 ? 1 : 0));
            if (j3Var.p0()) {
                contentValues.put("retry_count", Integer.valueOf(j3Var.q0()));
            }
            try {
                if (q0().insert("queue", null, contentValues) == -1) {
                    o1.m(s0Var);
                    s0Var.g.e(s0.J(j3Var.p()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e2) {
                o1.m(s0Var);
                s0Var.g.f(s0.J(j3Var.p()), e2, "Error storing bundle. appId");
            }
        } catch (IOException e10) {
            o1.m(s0Var);
            s0Var.g.f(s0.J(j3Var.p()), e10, "Data loss. Failed to serialize bundle. appId");
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
    public final java.lang.String J() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.q0()
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
            java.lang.Object r3 = r6.f218b     // Catch: java.lang.Throwable -> L1a
            ec.o1 r3 = (ec.o1) r3     // Catch: java.lang.Throwable -> L1a
            ec.s0 r3 = r3.f22954f     // Catch: java.lang.Throwable -> L1a
            ec.o1.m(r3)     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.or r3 = r3.g     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.e(r2, r4)     // Catch: java.lang.Throwable -> L1a
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
        throw new UnsupportedOperationException("Method not decompiled: ec.m.J():java.lang.String");
    }

    public final void K(long j8) {
        B();
        C();
        try {
            if (q0().delete("queue", "rowid=?", new String[]{String.valueOf(j8)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e2) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.g.e(e2, "Failed to delete a bundle in a queue table");
            throw e2;
        }
    }

    public final void L() {
        B();
        C();
        if (i0()) {
            g4 g4Var = this.f23175c;
            long jA = g4Var.f22738i.f22871f.a();
            o1 o1Var = (o1) this.f218b;
            o1Var.f22957k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) d0.N.a(null)).longValue()) {
                g4Var.f22738i.f22871f.b(jElapsedRealtime);
                B();
                C();
                if (i0()) {
                    SQLiteDatabase sQLiteDatabaseQ0 = q0();
                    o1Var.f22957k.getClass();
                    int iDelete = sQLiteDatabaseQ0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) d0.S.a(null)).longValue())});
                    if (iDelete > 0) {
                        s0 s0Var = o1Var.f22954f;
                        o1.m(s0Var);
                        s0Var.f23060o.e(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void M(ArrayList arrayList) throws SQLException {
        o1 o1Var = (o1) this.f218b;
        B();
        C();
        pb.y.h(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (i0()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strM = r5.c.m(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (l0(r5.c.m(new StringBuilder(strM.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strM, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                s0 s0Var = o1Var.f22954f;
                o1.m(s0Var);
                s0Var.j.d("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseQ0 = q0();
                StringBuilder sb2 = new StringBuilder(strM.length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(strM);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseQ0.execSQL(sb2.toString());
            } catch (SQLiteException e2) {
                s0 s0Var2 = o1Var.f22954f;
                o1.m(s0Var2);
                s0Var2.g.e(e2, "Error incrementing retry count. error");
            }
        }
    }

    public final void N(Long l10) {
        o1 o1Var = (o1) this.f218b;
        B();
        C();
        if (i0()) {
            StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l10);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (l0(sb2.toString(), null) > 0) {
                s0 s0Var = o1Var.f22954f;
                o1.m(s0Var);
                s0Var.j.d("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseQ0 = q0();
                o1Var.f22957k.getClass();
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
                sQLiteDatabaseQ0.execSQL(sb4.toString());
            } catch (SQLiteException e2) {
                s0 s0Var2 = o1Var.f22954f;
                o1.m(s0Var2);
                s0Var2.g.e(e2, "Error incrementing retry count. error");
            }
        }
    }

    public final Object O(Cursor cursor, int i4) {
        o1 o1Var = (o1) this.f218b;
        int type = cursor.getType(i4);
        if (type == 0) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.d("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i4));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i4));
        }
        if (type == 3) {
            return cursor.getString(i4);
        }
        if (type != 4) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.g.e(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        s0 s0Var3 = o1Var.f22954f;
        o1.m(s0Var3);
        s0Var3.g.d("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long P(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f218b
            ec.o1 r0 = (ec.o1) r0
            java.lang.String r1 = "select first_open_count from app2 where app_id=?"
            pb.y.e(r14)
            java.lang.String r2 = "first_open_count"
            pb.y.e(r2)
            r13.B()
            r13.C()
            android.database.sqlite.SQLiteDatabase r3 = r13.q0()
            r3.beginTransaction()
            r4 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = 48
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r6.append(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String[] r6 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = -1
            long r9 = r13.m0(r1, r6, r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
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
            ec.s0 r1 = r0.f22954f     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            ec.o1.m(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            com.google.android.gms.internal.ads.or r1 = r1.g     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r6 = "Failed to insert column (got -1). appId"
            ec.r0 r9 = ec.s0.J(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.f(r9, r2, r6)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
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
            ec.s0 r1 = r0.f22954f     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            ec.o1.m(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            com.google.android.gms.internal.ads.or r1 = r1.g     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r4 = "Failed to update column (got 0). appId"
            ec.r0 r5 = ec.s0.J(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.f(r5, r2, r4)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
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
            ec.s0 r0 = r0.f22954f     // Catch: java.lang.Throwable -> L6d
            ec.o1.m(r0)     // Catch: java.lang.Throwable -> L6d
            com.google.android.gms.internal.ads.or r0 = r0.g     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "Error inserting column. appId"
            ec.r0 r14 = ec.s0.J(r14)     // Catch: java.lang.Throwable -> L6d
            r0.g(r6, r14, r2, r1)     // Catch: java.lang.Throwable -> L6d
            r7 = r4
        Lbd:
            r3.endTransaction()
            return r7
        Lc1:
            r3.endTransaction()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.P(java.lang.String):long");
    }

    public final boolean Q(String str, String str2) {
        return l0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final long R(String str) {
        pb.y.e(str);
        return m0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void S(String str, Long l10, long j8, com.google.android.gms.internal.measurement.b3 b3Var) {
        B();
        C();
        pb.y.h(b3Var);
        pb.y.e(str);
        o1 o1Var = (o1) this.f218b;
        byte[] bArrA = b3Var.a();
        s0 s0Var = o1Var.f22954f;
        s0 s0Var2 = o1Var.f22954f;
        o1.m(s0Var);
        s0Var.f23060o.f(o1Var.j.a(str), Integer.valueOf(bArrA.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j8));
        contentValues.put("main_event", bArrA);
        try {
            if (q0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                o1.m(s0Var2);
                s0Var2.g.e(s0.J(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e2) {
            o1.m(s0Var2);
            s0Var2.g.f(s0.J(str), e2, "Error storing complex main event. appId");
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
    public final void T(java.lang.String r26, java.lang.Long r27, java.lang.String r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.T(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
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
    public final ec.a2 U(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f218b
            ec.o1 r0 = (ec.o1) r0
            pb.y.h(r5)
            r4.B()
            r4.C()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r1 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r4.q0()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            android.database.Cursor r5 = r3.rawQuery(r1, r5)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            if (r1 != 0) goto L36
            ec.s0 r1 = r0.f22954f     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            ec.o1.m(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            com.google.android.gms.internal.ads.or r1 = r1.f23060o     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            java.lang.String r3 = "No data found"
            r1.d(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
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
            ec.a2 r2 = ec.a2.c(r3, r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
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
            ec.s0 r0 = r0.f22954f     // Catch: java.lang.Throwable -> L32
            ec.o1.m(r0)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.ads.or r0 = r0.g     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "Error querying database."
            r0.e(r1, r3)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L5c
            goto L2e
        L5c:
            if (r2 != 0) goto L61
            ec.a2 r5 = ec.a2.f22541c
            return r5
        L61:
            return r2
        L62:
            if (r2 == 0) goto L67
            r2.close()
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.U(java.lang.String):ec.a2");
    }

    public final void V(String str, v3 v3Var) {
        B();
        C();
        pb.y.e(str);
        o1 o1Var = (o1) this.f218b;
        tb.a aVar = o1Var.f22957k;
        s0 s0Var = o1Var.f22954f;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c0 c0Var = d0.f22671w0;
        long jLongValue = jCurrentTimeMillis - ((Long) c0Var.a(null)).longValue();
        long j8 = v3Var.f23102b;
        if (j8 < jLongValue || j8 > ((Long) c0Var.a(null)).longValue() + jCurrentTimeMillis) {
            o1.m(s0Var);
            s0Var.j.g("Storing trigger URI outside of the max retention time span. appId, now, timestamp", s0.J(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j8));
        }
        o1.m(s0Var);
        s0Var.f23060o.d("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", v3Var.f23101a);
        contentValues.put("source", Integer.valueOf(v3Var.f23103c));
        contentValues.put("timestamp_millis", Long.valueOf(j8));
        try {
            if (q0().insert("trigger_uris", null, contentValues) == -1) {
                o1.m(s0Var);
                s0Var.g.e(s0.J(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e2) {
            o1.m(s0Var);
            s0Var.g.f(s0.J(str), e2, "Error storing trigger URI. appId");
        }
    }

    public final void W(String str, a2 a2Var) {
        pb.y.h(str);
        pb.y.h(a2Var);
        B();
        C();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", a2Var.g());
        contentValues.put("consent_source", Integer.valueOf(a2Var.f22543b));
        Y(contentValues);
    }

    public final String X(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = q0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e2) {
                s0 s0Var = ((o1) this.f218b).f22954f;
                o1.m(s0Var);
                s0Var.g.f(str, e2, "Database error");
                throw e2;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public final void Y(ContentValues contentValues) {
        o1 o1Var = (o1) this.f218b;
        try {
            SQLiteDatabase sQLiteDatabaseQ0 = q0();
            if (contentValues.getAsString("app_id") == null) {
                s0 s0Var = o1Var.f22954f;
                o1.m(s0Var);
                s0Var.f23055i.e(s0.J("app_id"), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (sQLiteDatabaseQ0.update("consent_settings", contentValues, r6.toString(), new String[]{r5}) == 0 && sQLiteDatabaseQ0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                s0 s0Var2 = o1Var.f22954f;
                o1.m(s0Var2);
                s0Var2.g.f(s0.J("consent_settings"), s0.J("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e2) {
            s0 s0Var3 = o1Var.f22954f;
            o1.m(s0Var3);
            s0Var3.g.g("Error storing into table. key", s0.J("consent_settings"), s0.J("app_id"), e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ec.r Z(java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.Z(java.lang.String, java.lang.String, java.lang.String):ec.r");
    }

    public final void a0(String str, r rVar) {
        o1 o1Var = (o1) this.f218b;
        pb.y.h(rVar);
        B();
        C();
        ContentValues contentValues = new ContentValues();
        String str2 = rVar.f23030a;
        contentValues.put("app_id", str2);
        contentValues.put("name", rVar.f23031b);
        contentValues.put("lifetime_count", Long.valueOf(rVar.f23032c));
        contentValues.put("current_bundle_count", Long.valueOf(rVar.f23033d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rVar.f23035f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rVar.g));
        contentValues.put("last_bundled_day", rVar.f23036h);
        contentValues.put("last_sampled_complex_event_id", rVar.f23037i);
        contentValues.put("last_sampling_rate", rVar.j);
        contentValues.put("current_session_count", Long.valueOf(rVar.f23034e));
        Boolean bool = rVar.f23038k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (q0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                s0 s0Var = o1Var.f22954f;
                o1.m(s0Var);
                s0Var.g.e(s0.J(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e2) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.g.f(s0.J(str2), e2, "Error storing event aggregates. appId");
        }
    }

    public final void b0(String str, String str2) {
        pb.y.e(str2);
        B();
        C();
        try {
            q0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e2) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.g.f(s0.J(str2), e2, "Error deleting snapshot. appId");
        }
    }

    public final h4 c0(String str, long j8, byte[] bArr, String str2, String str3, int i4, int i10, long j9, long j10, long j11) {
        x2 x2Var;
        o1 o1Var = (o1) this.f218b;
        if (TextUtils.isEmpty(str2)) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.f23059n.d("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.g3 g3Var = (com.google.android.gms.internal.measurement.g3) w0.o0(com.google.android.gms.internal.measurement.h3.w(), bArr);
            x2[] x2VarArrValues = x2.values();
            int length = x2VarArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    x2Var = x2.UNKNOWN;
                    break;
                }
                x2Var = x2VarArrValues[i11];
                if (x2Var.f23174a == i4) {
                    break;
                }
                i11++;
            }
            if (x2Var != x2.GOOGLE_SIGNAL && x2Var != x2.GOOGLE_SIGNAL_PENDING && i10 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.h3) g3Var.f19740b).p()).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.i3 i3Var = (com.google.android.gms.internal.measurement.i3) ((com.google.android.gms.internal.measurement.j3) it.next()).i();
                    i3Var.b();
                    ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).T0(i10);
                    arrayList.add((com.google.android.gms.internal.measurement.j3) i3Var.f());
                }
                g3Var.b();
                ((com.google.android.gms.internal.measurement.h3) g3Var.f19740b).B();
                g3Var.b();
                ((com.google.android.gms.internal.measurement.h3) g3Var.f19740b).A(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length2 = strArrSplit.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        break;
                    }
                    String str4 = strArrSplit[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split("=", 2);
                    if (strArrSplit2.length != 2) {
                        s0 s0Var2 = o1Var.f22954f;
                        o1.m(s0Var2);
                        s0Var2.g.e(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i12++;
                }
            }
            return new h4(j8, (com.google.android.gms.internal.measurement.h3) g3Var.f(), str2, map, x2Var, j9, j10, j11, i10);
        } catch (IOException e2) {
            s0 s0Var3 = o1Var.f22954f;
            o1.m(s0Var3);
            s0Var3.g.f(str, e2, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String d0() {
        ((o1) this.f218b).f22957k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l10 = (Long) d0.T.a(null);
        l10.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l10 + ")";
        String strS = je.u.s(((Long) d0.S.a(null)).longValue(), ")", d.h.y(jCurrentTimeMillis, "(upload_type != 1 AND ABS(creation_timestamp - ", ") > "));
        StringBuilder sb2 = new StringBuilder(je.u.l(str.length(), 5, strS.length(), 1));
        je.u.B(sb2, "(", str, " OR ", strS);
        sb2.append(")");
        return sb2.toString();
    }

    public final void f0(String str, a2 a2Var) {
        pb.y.h(str);
        B();
        C();
        W(str, U(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", a2Var.g());
        Y(contentValues);
    }

    public final a2 g0(String str) {
        pb.y.h(str);
        B();
        C();
        return a2.c(100, X("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final r h0(String str, com.google.android.gms.internal.measurement.b3 b3Var, String str2) {
        r rVarZ = Z("events", str, b3Var.s());
        if (rVarZ != null) {
            long j8 = rVarZ.f23034e + 1;
            long j9 = rVarZ.f23033d + 1;
            return new r(rVarZ.f23030a, rVarZ.f23031b, rVarZ.f23032c + 1, j9, j8, rVarZ.f23035f, rVarZ.g, rVarZ.f23036h, rVarZ.f23037i, rVarZ.j, rVarZ.f23038k);
        }
        o1 o1Var = (o1) this.f218b;
        s0 s0Var = o1Var.f22954f;
        o1.m(s0Var);
        s0Var.j.f(s0.J(str), o1Var.j.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new r(str, b3Var.s(), 1L, 1L, 1L, b3Var.u(), 0L, null, null, null, null);
    }

    public final boolean i0() {
        return ((o1) this.f218b).f22949a.getDatabasePath("google_app_measurement.db").exists();
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
    public final void j0(java.lang.String r21, long r22, long r24, b8.d r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.j0(java.lang.String, long, long, b8.d):void");
    }

    public final long l0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = q0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j8 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j8;
            } catch (SQLiteException e2) {
                s0 s0Var = ((o1) this.f218b).f22954f;
                o1.m(s0Var);
                s0Var.g.f(str, e2, "Database error");
                throw e2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long m0(String str, String[] strArr, long j8) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = q0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j8 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j8;
            } catch (SQLiteException e2) {
                s0 s0Var = ((o1) this.f218b).f22954f;
                o1.m(s0Var);
                s0Var.g.f(str, e2, "Database error");
                throw e2;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public final void n0() {
        C();
        q0().beginTransaction();
    }

    public final void o0() {
        C();
        q0().setTransactionSuccessful();
    }

    public final void p0() {
        C();
        q0().endTransaction();
    }

    public final SQLiteDatabase q0() {
        B();
        try {
            return this.f22890e.getWritableDatabase();
        } catch (SQLiteException e2) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.j.e(e2, "Error opening database");
            throw e2;
        }
    }

    public final void r0(String str) {
        r rVarZ;
        b0("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = q0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (rVarZ = Z("events", str, string)) != null) {
                            a0("events_snapshot", rVarZ);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e2) {
                s0 s0Var = ((o1) this.f218b).f22954f;
                o1.m(s0Var);
                s0Var.g.f(s0.J(str), e2, "Error creating snapshot. appId");
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
    public final void s0(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.s0(java.lang.String):void");
    }

    public final void t0(String str, String str2) {
        pb.y.e(str);
        pb.y.e(str2);
        B();
        C();
        try {
            q0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            o1 o1Var = (o1) this.f218b;
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.g("Error deleting user property. appId", s0.J(str), o1Var.j.c(str2), e2);
        }
    }

    public final boolean u0(j4 j4Var) {
        o1 o1Var = (o1) this.f218b;
        String str = j4Var.f22825b;
        B();
        C();
        String str2 = j4Var.f22824a;
        String str3 = j4Var.f22826c;
        if (v0(str2, str3) == null) {
            if (l4.A0(str3)) {
                if (l0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(o1Var.f22952d.J(str2, d0.W), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jL0 = l0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                o1Var.getClass();
                if (jL0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(j4Var.f22827d));
        k0(contentValues, j4Var.f22828e);
        try {
            if (q0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.e(s0.J(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e2) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.g.f(s0.J(str2), e2, "Error storing user property. appId");
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
    public final ec.j4 v0(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f218b
            r1 = r0
            ec.o1 r1 = (ec.o1) r1
            pb.y.e(r12)
            pb.y.e(r13)
            r11.B()
            r11.C()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.q0()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
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
            java.lang.Object r10 = r11.O(r3, r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r10 != 0) goto L44
            goto L95
        L44:
            r0 = 2
            java.lang.String r6 = r3.getString(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            ec.j4 r4 = new ec.j4     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r12 == 0) goto L6d
            ec.s0 r12 = r1.f22954f     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            ec.o1.m(r12)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            com.google.android.gms.internal.ads.or r12 = r12.g     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r13 = "Got multiple records for user property, expected one. appId"
            ec.r0 r0 = ec.s0.J(r5)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r12.e(r0, r13)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
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
            ec.s0 r13 = r1.f22954f     // Catch: java.lang.Throwable -> L67
            ec.o1.m(r13)     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.internal.ads.or r13 = r13.g     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Error querying user property. appId"
            ec.r0 r4 = ec.s0.J(r5)     // Catch: java.lang.Throwable -> L67
            ec.o0 r1 = r1.j     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.c(r7)     // Catch: java.lang.Throwable -> L67
            r13.g(r0, r4, r1, r12)     // Catch: java.lang.Throwable -> L67
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
        throw new UnsupportedOperationException("Method not decompiled: ec.m.v0(java.lang.String, java.lang.String):ec.j4");
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
    public final java.util.List w0(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f218b
            r1 = r0
            ec.o1 r1 = (ec.o1) r1
            pb.y.e(r13)
            r12.B()
            r12.C()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1000"
            r11 = 0
            android.database.sqlite.SQLiteDatabase r2 = r12.q0()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
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
            java.lang.Object r9 = r12.O(r11, r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r9 != 0) goto L73
            ec.s0 r2 = r1.f22954f     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            ec.o1.m(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            com.google.android.gms.internal.ads.or r2 = r2.g     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            java.lang.String r3 = "Read invalid user property value, ignoring it. appId"
            ec.r0 r4 = ec.s0.J(r13)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2.e(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r4 = r13
            goto L7c
        L70:
            r0 = move-exception
            r13 = r0
            goto La2
        L73:
            ec.j4 r3 = new ec.j4     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
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
            ec.s0 r13 = r1.f22954f     // Catch: java.lang.Throwable -> L70
            ec.o1.m(r13)     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.internal.ads.or r13 = r13.g     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "Error querying user properties. appId"
            ec.r0 r2 = ec.s0.J(r4)     // Catch: java.lang.Throwable -> L70
            r13.f(r2, r0, r1)     // Catch: java.lang.Throwable -> L70
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
        throw new UnsupportedOperationException("Method not decompiled: ec.m.w0(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        ec.o1.m(r13);
        r13.g.e(1000, "Read more than the max allowed user properties, ignoring excess");
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
    public final java.util.List x0(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.x0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean y0(e eVar) {
        o1 o1Var = (o1) this.f218b;
        B();
        C();
        String str = eVar.f22688a;
        pb.y.h(str);
        if (v0(str, eVar.f22690c.f22800b) == null) {
            long jL0 = l0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            o1Var.getClass();
            if (jL0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", eVar.f22689b);
        contentValues.put("name", eVar.f22690c.f22800b);
        Object objA = eVar.f22690c.a();
        pb.y.h(objA);
        k0(contentValues, objA);
        contentValues.put("active", Boolean.valueOf(eVar.f22692e));
        contentValues.put("trigger_event_name", eVar.f22693f);
        contentValues.put("trigger_timeout", Long.valueOf(eVar.f22694h));
        u uVar = eVar.g;
        l4 l4Var = o1Var.f22956i;
        s0 s0Var = o1Var.f22954f;
        o1.k(l4Var);
        contentValues.put("timed_out_event", l4.g0(uVar));
        contentValues.put("creation_timestamp", Long.valueOf(eVar.f22691d));
        o1.k(l4Var);
        contentValues.put("triggered_event", l4.g0(eVar.f22695i));
        contentValues.put("triggered_timestamp", Long.valueOf(eVar.f22690c.f22801c));
        contentValues.put("time_to_live", Long.valueOf(eVar.j));
        contentValues.put("expired_event", l4.g0(eVar.f22696k));
        try {
            if (q0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            o1.m(s0Var);
            s0Var.g.e(s0.J(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e2) {
            o1.m(s0Var);
            s0Var.g.f(s0.J(str), e2, "Error storing conditional user property");
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
    public final ec.e z0(java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m.z0(java.lang.String, java.lang.String):ec.e");
    }

    @Override // ec.b4
    public final void E() {
    }
}
