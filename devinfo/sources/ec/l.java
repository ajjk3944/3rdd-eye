package ec;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.jw0;
import com.google.android.gms.internal.measurement.p8;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends jw0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22843a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a8.a f22844b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context) {
        super(context, "google_app_measurement.db");
        this.f22844b = mVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f22843a) {
            case 0:
                m mVar = (m) this.f22844b;
                o1 o1Var = (o1) mVar.f218b;
                o1 o1Var2 = (o1) mVar.f218b;
                o1Var.getClass();
                androidx.recyclerview.widget.d dVar = mVar.f22891f;
                if (dVar.f1323b != 0) {
                    ((tb.a) dVar.f1324c).getClass();
                    if (SystemClock.elapsedRealtime() - dVar.f1323b < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((tb.a) dVar.f1324c).getClass();
                    dVar.f1323b = SystemClock.elapsedRealtime();
                    s0 s0Var = o1Var2.f22954f;
                    o1.m(s0Var);
                    s0Var.g.d("Opening the database failed, dropping and recreating it");
                    if (!o1Var2.f22949a.getDatabasePath("google_app_measurement.db").delete()) {
                        s0 s0Var2 = o1Var2.f22954f;
                        o1.m(s0Var2);
                        s0Var2.g.e("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        dVar.f1323b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e2) {
                        s0 s0Var3 = o1Var2.f22954f;
                        o1.m(s0Var3);
                        s0Var3.g.e(e2, "Failed to open freshly created database");
                        throw e2;
                    }
                }
            default:
                n0 n0Var = (n0) this.f22844b;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e10) {
                    throw e10;
                } catch (SQLiteException unused2) {
                    o1 o1Var3 = (o1) n0Var.f218b;
                    s0 s0Var4 = o1Var3.f22954f;
                    o1.m(s0Var4);
                    s0Var4.g.d("Opening the local database failed, dropping and recreating it");
                    if (!o1Var3.f22949a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        s0 s0Var5 = o1Var3.f22954f;
                        o1.m(s0Var5);
                        s0Var5.g.e("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e11) {
                        s0 s0Var6 = ((o1) n0Var.f218b).f22954f;
                        o1.m(s0Var6);
                        s0Var6.g.e(e11, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f22843a) {
            case 0:
                s0 s0Var = ((o1) ((m) this.f22844b).f218b).f22954f;
                o1.m(s0Var);
                b2.f(s0Var, sQLiteDatabase);
                break;
            default:
                s0 s0Var2 = ((o1) ((n0) this.f22844b).f218b).f22954f;
                o1.m(s0Var2);
                b2.f(s0Var2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i10) {
        int i11 = this.f22843a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        switch (this.f22843a) {
            case 0:
                o1 o1Var = (o1) ((m) this.f22844b).f218b;
                s0 s0Var = o1Var.f22954f;
                o1.m(s0Var);
                b2.d(s0Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", m.g);
                s0 s0Var2 = o1Var.f22954f;
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", m.f22882i);
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", m.j);
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", m.f22884l);
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", m.f22883k);
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", m.f22885m);
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", m.f22886n);
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", m.f22887o);
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", m.f22888p);
                p8.a();
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", m.f22889q);
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", m.f22881h);
                o1.m(s0Var2);
                b2.d(s0Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                s0 s0Var3 = ((o1) ((n0) this.f22844b).f218b).f22954f;
                o1.m(s0Var3);
                b2.d(s0Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", n0.f22905f);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i10) {
        int i11 = this.f22843a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n0 n0Var, Context context) {
        super(context, "google_app_measurement_local.db");
        this.f22844b = n0Var;
    }

    private final void c(SQLiteDatabase sQLiteDatabase, int i4, int i10) {
    }

    private final void e(SQLiteDatabase sQLiteDatabase, int i4, int i10) {
    }

    private final void g(SQLiteDatabase sQLiteDatabase, int i4, int i10) {
    }

    private final void m(SQLiteDatabase sQLiteDatabase, int i4, int i10) {
    }
}
