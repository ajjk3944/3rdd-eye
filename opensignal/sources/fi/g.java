package fi;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import br.l;
import ch.n;
import com.google.android.gms.internal.measurement.e5;
import g4.j;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import mq.w;

/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final List f8899a;

    /* renamed from: d, reason: collision with root package name */
    public final dj.h f8900d;

    /* renamed from: g, reason: collision with root package name */
    public final a2.g f8901g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, int i10, List list, dj.h hVar, a2.g gVar) {
        super(context, "opensignal-database", (SQLiteDatabase.CursorFactory) null, i10);
        l.e(hVar, "databaseUpgrader");
        this.f8899a = list;
        this.f8900d = hVar;
        this.f8901g = gVar;
    }

    public final void b(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws IOException, SQLException {
        rj.c cVar;
        ii.c cVar2;
        List<String> listI;
        n.b("DatabaseHelper", h0.b.l("Upgrade start. Current version: ", i10, i11, " New version: "));
        dj.h hVar = this.f8900d;
        hVar.getClass();
        n.b("DatabaseUpgrader", "Upgrading from " + i10 + " to " + i11);
        if (2 <= i11) {
            int i12 = 2;
            while (true) {
                n.b("DatabaseUpgrader", h0.b.h(i12, "Updating to.. version "));
                if (i12 <= i10) {
                    n.b("DatabaseUpgrader", h0.b.l("Skipping version ", i12, i10, " as it is before "));
                } else {
                    ii.c.Companion.getClass();
                    ii.c[] cVarArrValues = ii.c.values();
                    int length = cVarArrValues.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            cVar2 = cVarArrValues[i13];
                            if (cVar2.getVersion() != i12) {
                                i13++;
                            }
                        } else {
                            cVar2 = null;
                        }
                    }
                    switch (cVar2 == null ? -1 : ii.a.f11433a[cVar2.ordinal()]) {
                        case 1:
                            listI = e5.I("ALTER TABLE scheduled_tasks ADD COLUMN schedule_type TEXT;", "ALTER TABLE scheduled_tasks ADD COLUMN added_time INTEGER;", "CREATE TABLE IF NOT EXISTS currently_running_tasks (id INTEGER PRIMARY KEY);", "ALTER TABLE currently_running_tasks ADD COLUMN schedule_type TEXT;", "ALTER TABLE currently_running_tasks ADD COLUMN added_time INTEGER;");
                            break;
                        case 2:
                            listI = e5.I("ALTER TABLE scheduled_tasks ADD COLUMN is_scheduled_in_pipeline INTEGER DEFAULT 0;", "ALTER TABLE currently_running_tasks ADD COLUMN is_scheduled_in_pipeline INTEGER DEFAULT 1;");
                            break;
                        case 3:
                            listI = e5.I("ALTER TABLE scheduled_tasks ADD COLUMN is_network_intensive INTEGER;", "ALTER TABLE currently_running_tasks ADD COLUMN is_network_intensive INTEGER;");
                            break;
                        case 4:
                            listI = e5.I("ALTER TABLE scheduled_tasks ADD COLUMN update_schedule_on_failure INTEGER;", "ALTER TABLE currently_running_tasks ADD COLUMN update_schedule_on_failure INTEGER;");
                            break;
                        case j.STRING_FIELD_NUMBER /* 5 */:
                            listI = e5.H("create table if not exists key_value_data (id TEXT NOT NULL PRIMARY KEY, value TEXT NOT NULL);");
                            break;
                        case j.STRING_SET_FIELD_NUMBER /* 6 */:
                            listI = e5.I("ALTER TABLE scheduled_tasks ADD COLUMN spacing_delay_in_millis INTEGER;", "ALTER TABLE currently_running_tasks ADD COLUMN spacing_delay_in_millis INTEGER;");
                            break;
                        case j.DOUBLE_FIELD_NUMBER /* 7 */:
                            listI = e5.I("ALTER TABLE scheduled_tasks ADD COLUMN reschedule_on_fail_from_this_task_onwards TEXT;", "ALTER TABLE currently_running_tasks ADD COLUMN reschedule_on_fail_from_this_task_onwards TEXT;");
                            break;
                        case j.BYTES_FIELD_NUMBER /* 8 */:
                            listI = e5.H("create table if not exists task_stats (id INTEGER PRIMARY KEY AUTOINCREMENT, task_name TEXT NOT NULL, network_type INTEGER, network_connection_type INTEGER, consumption_date TEXT NOT NULL, foreground_execution_count INTEGER, background_execution_count INTEGER, foreground_data_usage TEXT NOT NULL, background_data_usage TEXT NOT NULL);");
                            break;
                        case 9:
                            listI = e5.I("ALTER TABLE task_stats ADD COLUMN foreground_download_data_usage TEXT NOT NULL DEFAULT 0;", "ALTER TABLE task_stats ADD COLUMN background_download_data_usage TEXT NOT NULL DEFAULT 0;", "ALTER TABLE task_stats ADD COLUMN foreground_upload_data_usage TEXT NOT NULL DEFAULT 0;", "ALTER TABLE task_stats ADD COLUMN background_upload_data_usage TEXT NOT NULL DEFAULT 0;");
                            break;
                        case 10:
                            listI = e5.I("ALTER TABLE scheduled_tasks ADD COLUMN use_cross_task_delay INTEGER;", "ALTER TABLE currently_running_tasks ADD COLUMN use_cross_task_delay INTEGER;");
                            break;
                        case 11:
                            listI = e5.H("ALTER TABLE task_stats ADD COLUMN network_generation TEXT;");
                            break;
                        case 12:
                            listI = e5.I("ALTER TABLE scheduled_tasks ADD COLUMN data_usage_limits_kilobytes INTEGER;", "ALTER TABLE scheduled_tasks ADD COLUMN data_usage_limits_days INTEGER;", "ALTER TABLE currently_running_tasks ADD COLUMN data_usage_limits_kilobytes INTEGER;", "ALTER TABLE currently_running_tasks ADD COLUMN data_usage_limits_days INTEGER;");
                            break;
                        case 13:
                            listI = e5.I("ALTER TABLE scheduled_tasks ADD COLUMN excluded_from_sdk_data_usage_limits BOOLEAN;", "ALTER TABLE currently_running_tasks ADD COLUMN excluded_from_sdk_data_usage_limits BOOLEAN;", "ALTER TABLE task_stats ADD COLUMN excluded_from_sdk_data_usage_limits BOOLEAN;");
                            break;
                        case 14:
                            listI = e5.I("ALTER TABLE scheduled_tasks ADD COLUMN data_usage_limits_app_status_mode INTEGER;", "ALTER TABLE currently_running_tasks ADD COLUMN data_usage_limits_app_status_mode INTEGER;");
                            break;
                        case 15:
                            listI = e5.I("ALTER TABLE scheduled_tasks ADD COLUMN cross_task_delay_groups TEXT;", "ALTER TABLE currently_running_tasks ADD COLUMN cross_task_delay_groups TEXT;");
                            break;
                        case 16:
                            listI = e5.I("ALTER TABLE scheduled_tasks ADD COLUMN priority INTEGER DEFAULT 0;", "ALTER TABLE currently_running_tasks ADD COLUMN priority INTEGER DEFAULT 0;");
                            break;
                        case 17:
                            listI = e5.I("ALTER TABLE scheduled_tasks ADD COLUMN last_location TEXT;", "ALTER TABLE currently_running_tasks ADD COLUMN last_location TEXT;");
                            break;
                        case 18:
                            listI = e5.I("ALTER TABLE scheduled_tasks ADD COLUMN wifi_ssid_regex TEXT;", "ALTER TABLE currently_running_tasks ADD COLUMN wifi_ssid_regex TEXT;");
                            break;
                        case 19:
                            listI = e5.H("DROP TABLE IF EXISTS currently_running_tasks");
                            break;
                        case 20:
                            listI = e5.H("DROP TABLE IF EXISTS triggers");
                            break;
                        case 21:
                            listI = e5.H("create table if not exists qos_results (id INTEGER PRIMARY KEY AUTOINCREMENT, task_name TEXT NOT NULL, connection_type INTEGER, execution_date INTEGER, test_type INTEGER, download REAL, download_test_status INTEGER, upload REAL, upload_test_status INTEGER, latency REAL, latency_test_status INTEGER, jitter REAL, packet_discard REAL, icmp REAL, icmp_test_status INTEGER, rssi INTEGER,lat REAL DEFAULT 0,lng REAL DEFAULT 0);");
                            break;
                        case 22:
                            listI = e5.H("DROP TABLE IF EXISTS broadcast_receivers");
                            break;
                        case 23:
                            listI = e5.H("ALTER TABLE scheduled_tasks ADD COLUMN save_partial_jobs_results INTEGER DEFAULT 1;");
                            break;
                        case 24:
                            listI = e5.H("ALTER TABLE scheduled_tasks ADD COLUMN reschedule_on_interrupt_from_this_task_onwards TEXT;");
                            break;
                        case 25:
                            listI = e5.H("ALTER TABLE scheduled_tasks ADD COLUMN should_log_events INTEGER DEFAULT 0;");
                            break;
                        case 26:
                            listI = e5.H("create table if not exists ip_cache (id INTEGER, ip_address TEXT NOT NULL, latitude REAL NOT NULL, longitude REAL NOT NULL, provider TEXT, last_modification_date INTEGER NOT NULL, elapsed_real_time_ms INTEGER NOT NULL, receive_time INTEGER NOT NULL, utc_time INTEGER NOT NULL, altitude REAL NOT NULL, speed REAL NOT NULL, bearing REAL NOT NULL, accuracy REAL NOT NULL, satellite_count INTEGER, from_mock_provider INTEGER, msl_altitude_meters REAL, msl_altitude_accuracy_meters REAL, altitude_accuracy_meters REAL, PRIMARY KEY (ip_address, latitude, longitude));");
                            break;
                        case 27:
                            listI = e5.I("ALTER TABLE qos_results ADD COLUMN connection_id TEXT DEFAULT '';", "ALTER TABLE qos_results ADD COLUMN connection_start_date INTEGER DEFAULT 0;", "ALTER TABLE qos_results ADD COLUMN connection_ssid TEXT DEFAULT '';", "ALTER TABLE qos_results ADD COLUMN connection_access_point TEXT DEFAULT '';", "ALTER TABLE qos_results ADD COLUMN connection_technology INTEGER DEFAULT -1;");
                            break;
                        default:
                            n.c("DatabaseUpgrader", "Trying to upgrade to an unknown version: " + i12);
                            hVar.f7402a.r();
                            cj.a.F("Trying to upgrade to an unknown version: " + i12);
                            listI = null;
                            break;
                    }
                    if (listI == null) {
                        listI = w.f16945a;
                    }
                    n.b("DatabaseUpgrader", "Version " + i12 + " SQL: " + listI);
                    for (String str : listI) {
                        n.b("DatabaseUpgrader", c7.a.p("Running query: ", str));
                        try {
                            sQLiteDatabase.execSQL(str);
                        } catch (Exception e4) {
                            n.e("DatabaseUpgrader", e4);
                        }
                    }
                }
                if (i12 != i11) {
                    i12++;
                }
            }
        }
        a2.g gVar = this.f8901g;
        gVar.getClass();
        b9.c cVar3 = (b9.c) gVar.f31a;
        String strValueOf = String.valueOf(i11);
        cVar3.getClass();
        l.e(strValueOf, "value");
        rj.c cVar4 = new rj.c("database-version", strValueOf);
        hi.a aVar = (hi.a) cVar3.f2478d;
        sQLiteDatabase.insertWithOnConflict(aVar.g(), null, aVar.k(cVar4), 5);
        cVar3.getClass();
        hi.a aVar2 = (hi.a) cVar3.f2478d;
        Cursor cursorQuery = sQLiteDatabase.query(aVar2.g(), null, "id=?", new String[]{"database-version"}, null, null, null);
        l.d(cursorQuery, "query(...)");
        try {
            String str2 = (!cursorQuery.moveToFirst() || (cVar = (rj.c) aVar2.e(cursorQuery)) == null) ? null : cVar.f21556b;
            cursorQuery.close();
            Integer numValueOf = str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null;
            n.b("DatabaseHelper", h0.b.h(numValueOf != null ? numValueOf.intValue() : 1, "storedVersionCode: "));
            n.b("DatabaseHelper", "Upgrade finished");
        } finally {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws IOException, SQLException {
        String str;
        l.e(sQLiteDatabase, "database");
        n.b("DatabaseHelper", "Database onCreate");
        Iterator it = this.f8899a.iterator();
        while (it.hasNext()) {
            switch (((hi.a) it.next()).f10789a) {
                case 0:
                    str = "create table if not exists ip_cache (id INTEGER, ip_address TEXT NOT NULL, latitude REAL NOT NULL, longitude REAL NOT NULL, provider TEXT, last_modification_date INTEGER NOT NULL, elapsed_real_time_ms INTEGER NOT NULL, receive_time INTEGER NOT NULL, utc_time INTEGER NOT NULL, altitude REAL NOT NULL, speed REAL NOT NULL, bearing REAL NOT NULL, accuracy REAL NOT NULL, satellite_count INTEGER, from_mock_provider INTEGER, msl_altitude_meters REAL, msl_altitude_accuracy_meters REAL, altitude_accuracy_meters REAL, PRIMARY KEY (ip_address, latitude, longitude));";
                    break;
                case 1:
                    str = "create table if not exists job_results (id INTEGER PRIMARY KEY, task_id INTEGER NOT NULL, task_name TEXT NOT NULL, job_type TEXT NOT NULL, time_in_millis INTEGER, data TEXT NOT NULL);";
                    break;
                case 2:
                    str = "create table if not exists key_value_data (id TEXT NOT NULL PRIMARY KEY, value TEXT NOT NULL);";
                    break;
                case 3:
                    str = "create table if not exists qos_results (id INTEGER PRIMARY KEY AUTOINCREMENT, task_name TEXT NOT NULL, connection_type INTEGER, execution_date INTEGER, test_type INTEGER, download REAL, download_test_status INTEGER, upload REAL, upload_test_status INTEGER, latency REAL, latency_test_status INTEGER, jitter REAL, packet_discard REAL, icmp REAL, icmp_test_status INTEGER, rssi INTEGER,lat REAL DEFAULT 0,lng REAL DEFAULT 0);";
                    break;
                case 4:
                    str = "create table if not exists task_stats (id INTEGER PRIMARY KEY AUTOINCREMENT, task_name TEXT NOT NULL, network_type INTEGER, network_connection_type INTEGER, consumption_date TEXT NOT NULL, foreground_execution_count INTEGER, background_execution_count INTEGER, foreground_data_usage TEXT NOT NULL, background_data_usage TEXT NOT NULL);";
                    break;
                default:
                    str = "create table if not exists scheduled_tasks (id INTEGER PRIMARY KEY, name TEXT NOT NULL, data_endpoint TEXT, execute_triggers TEXT NOT NULL, interruption_triggers TEXT NOT NULL, initial_delay INTEGER, repeat_period INTEGER, repeat_count INTEGER, jobs TEXT NOT NULL, starting_execute_time INTEGER, last_successful_execute_time INTEGER, schedule_time INTEGER, current_execute_count INTEGER, reschedule_for_triggers INTEGER, manual_execution INTEGER, consent_required INTEGER, state TEXT);";
                    break;
            }
            sQLiteDatabase.execSQL(str);
        }
        ii.c.Companion.getClass();
        b(sQLiteDatabase, 1, ii.b.a());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws IOException, SQLException {
        l.e(sQLiteDatabase, "database");
        n.b("DatabaseHelper", "Database onUpgrade");
        b(sQLiteDatabase, i10, i11);
    }
}
