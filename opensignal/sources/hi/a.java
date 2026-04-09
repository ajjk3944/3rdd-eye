package hi;

import ak.u;
import android.content.ContentValues;
import android.database.Cursor;
import br.l;
import ch.n;
import gk.f;
import rj.b;
import rj.c;
import rj.d;
import rj.e;
import yh.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10789a;

    public /* synthetic */ a(int i10) {
        this.f10789a = i10;
    }

    public static boolean a(String str, Cursor cursor, boolean z10) {
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex >= 0 ? cursor.getLong(columnIndex) == 1 : z10;
    }

    public static int d(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return cursor.getInt(columnIndex);
        }
        return 0;
    }

    public final double b(Cursor cursor, String str) {
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex >= 0) {
                return cursor.getDouble(columnIndex);
            }
            return 0.0d;
        } catch (Exception e4) {
            n.c("DatabaseTable", e4.getLocalizedMessage());
            j(e4, str);
            return 0.0d;
        }
    }

    public final Double c(Cursor cursor, String str) {
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex >= 0) {
                return Double.valueOf(cursor.getDouble(columnIndex));
            }
            return null;
        } catch (Exception e4) {
            n.c("DatabaseTable", e4.getLocalizedMessage());
            j(e4, str);
            return null;
        }
    }

    public final Object e(Cursor cursor) {
        switch (this.f10789a) {
            case 0:
                long jF = f(cursor, "id");
                String strI = i("ip_address", cursor, "");
                long jF2 = f(cursor, "last_modification_date");
                double dB = b(cursor, "latitude");
                double dB2 = b(cursor, "longitude");
                String strI2 = i("provider", cursor, "saved");
                long jF3 = f(cursor, "elapsed_real_time_ms");
                long jF4 = f(cursor, "receive_time");
                long jF5 = f(cursor, "utc_time");
                double dB3 = b(cursor, "altitude");
                double dB4 = b(cursor, "speed");
                double dB5 = b(cursor, "bearing");
                double dB6 = b(cursor, "accuracy");
                int iD = d(cursor, "satellite_count");
                boolean zA = a("from_mock_provider", cursor, false);
                Double dC = c(cursor, "msl_altitude_meters");
                Double dC2 = c(cursor, "msl_altitude_accuracy_meters");
                Double dC3 = c(cursor, "altitude_accuracy_meters");
                return new rj.a(jF, strI, jF2, new u(dB, dB2, strI2, jF3, jF4, jF5, dB3, (float) dB4, (float) dB5, (float) dB6, iD, zA, dC, dC2 != null ? Float.valueOf((float) dC2.doubleValue()) : null, dC3 != null ? Float.valueOf((float) dC3.doubleValue()) : null));
            case 1:
                long jF6 = f(cursor, "id");
                long jF7 = f(cursor, "task_id");
                String strH = h(cursor, "task_name");
                String str = strH == null ? "" : strH;
                String strH2 = h(cursor, "job_type");
                String str2 = strH2 == null ? "" : strH2;
                long jF8 = f(cursor, "time_in_millis");
                String strH3 = h(cursor, "data");
                return new b(jF6, jF7, jF8, str, str2, strH3 == null ? "" : strH3);
            case 2:
                String strH4 = h(cursor, "id");
                if (strH4 == null) {
                    return null;
                }
                String strH5 = h(cursor, "value");
                if (strH5 == null) {
                    strH5 = "";
                }
                return new c(strH4, strH5);
            case 3:
                long jF9 = f(cursor, "id");
                String strH6 = h(cursor, "task_name");
                String str3 = strH6 == null ? "" : strH6;
                int iD2 = d(cursor, "connection_type");
                long jF10 = f(cursor, "execution_date");
                int iD3 = d(cursor, "test_type");
                Double dC4 = c(cursor, "download");
                double dDoubleValue = dC4 != null ? dC4.doubleValue() : -1.0d;
                m mVar = m.NOT_PERFORMED;
                int value = mVar.getValue();
                int columnIndex = cursor.getColumnIndex("download_test_status");
                if (columnIndex >= 0) {
                    value = cursor.getInt(columnIndex);
                }
                Double dC5 = c(cursor, "upload");
                double dDoubleValue2 = dC5 != null ? dC5.doubleValue() : -1.0d;
                int value2 = mVar.getValue();
                int columnIndex2 = cursor.getColumnIndex("upload_test_status");
                if (columnIndex2 >= 0) {
                    value2 = cursor.getInt(columnIndex2);
                }
                Double dC6 = c(cursor, "latency");
                double dDoubleValue3 = dC6 != null ? dC6.doubleValue() : -1.0d;
                int value3 = mVar.getValue();
                int columnIndex3 = cursor.getColumnIndex("latency_test_status");
                if (columnIndex3 >= 0) {
                    value3 = cursor.getInt(columnIndex3);
                }
                Double dC7 = c(cursor, "jitter");
                double dDoubleValue4 = dC7 != null ? dC7.doubleValue() : -1.0d;
                Double dC8 = c(cursor, "packet_discard");
                double dDoubleValue5 = dC8 != null ? dC8.doubleValue() : -1.0d;
                Double dC9 = c(cursor, "icmp");
                double dDoubleValue6 = dC9 != null ? dC9.doubleValue() : -1.0d;
                int value4 = mVar.getValue();
                int columnIndex4 = cursor.getColumnIndex("icmp_test_status");
                if (columnIndex4 >= 0) {
                    value4 = cursor.getInt(columnIndex4);
                }
                int iD4 = d(cursor, "rssi");
                Double dC10 = c(cursor, "lat");
                double dDoubleValue7 = dC10 != null ? dC10.doubleValue() : 0.0d;
                Double dC11 = c(cursor, "lng");
                return new d(jF9, str3, jF10, iD2, dDoubleValue, value, dDoubleValue2, value2, dDoubleValue3, value3, dDoubleValue4, dDoubleValue5, dDoubleValue6, value4, iD4, dDoubleValue7, dC11 != null ? dC11.doubleValue() : 0.0d, iD3, i("connection_id", cursor, ""), f(cursor, "connection_start_date"), i("connection_ssid", cursor, ""), i("connection_access_point", cursor, ""), d(cursor, "connection_technology"));
            case 4:
                long jF11 = f(cursor, "id");
                String strH7 = h(cursor, "task_name");
                String str4 = strH7 == null ? "" : strH7;
                int iD5 = d(cursor, "network_type");
                int iD6 = d(cursor, "network_connection_type");
                String strH8 = h(cursor, "consumption_date");
                String str5 = strH8 == null ? "" : strH8;
                int iD7 = d(cursor, "foreground_execution_count");
                int iD8 = d(cursor, "background_execution_count");
                String strH9 = h(cursor, "foreground_data_usage");
                String str6 = strH9 == null ? "" : strH9;
                String strH10 = h(cursor, "background_data_usage");
                String str7 = strH10 == null ? "" : strH10;
                String strH11 = h(cursor, "foreground_download_data_usage");
                String str8 = strH11 == null ? "" : strH11;
                String strH12 = h(cursor, "background_download_data_usage");
                String str9 = strH12 == null ? "" : strH12;
                String strH13 = h(cursor, "foreground_upload_data_usage");
                String str10 = strH13 == null ? "" : strH13;
                String strH14 = h(cursor, "background_upload_data_usage");
                String str11 = strH14 == null ? "" : strH14;
                String strH15 = h(cursor, "network_generation");
                return new e(jF11, str4, iD5, iD6, strH15 == null ? "" : strH15, str5, iD7, iD8, str6, str7, str8, str9, str10, str11, a("excluded_from_sdk_data_usage_limits", cursor, false));
            default:
                long jF12 = f(cursor, "id");
                String strH16 = h(cursor, "name");
                String str12 = strH16 == null ? "" : strH16;
                String strH17 = h(cursor, "execute_triggers");
                String str13 = strH17 == null ? "" : strH17;
                String strH18 = h(cursor, "interruption_triggers");
                String str14 = strH18 == null ? "" : strH18;
                long jF13 = f(cursor, "initial_delay");
                long jF14 = f(cursor, "repeat_period");
                int iD9 = d(cursor, "repeat_count");
                String strH19 = h(cursor, "jobs");
                String str15 = strH19 == null ? "" : strH19;
                long jF15 = f(cursor, "starting_execute_time");
                long jF16 = f(cursor, "last_successful_execute_time");
                long jF17 = f(cursor, "schedule_time");
                int iD10 = d(cursor, "current_execute_count");
                boolean zA2 = a("reschedule_for_triggers", cursor, false);
                boolean zA3 = a("manual_execution", cursor, false);
                boolean zA4 = a("consent_required", cursor, false);
                String strH20 = h(cursor, "data_endpoint");
                if (strH20 == null) {
                    strH20 = "";
                }
                String strH21 = h(cursor, "state");
                String str16 = strH21 == null ? "" : strH21;
                long jF18 = f(cursor, "added_time");
                boolean zA5 = a("is_scheduled_in_pipeline", cursor, false);
                boolean zA6 = a("is_network_intensive", cursor, false);
                String strH22 = h(cursor, "reschedule_on_fail_from_this_task_onwards");
                String str17 = strH22 == null ? "" : strH22;
                String strH23 = h(cursor, "reschedule_on_interrupt_from_this_task_onwards");
                String str18 = strH23 == null ? "" : strH23;
                long jF19 = f(cursor, "spacing_delay_in_millis");
                String str19 = strH20;
                boolean zA7 = a("use_cross_task_delay", cursor, false);
                String strH24 = h(cursor, "schedule_type");
                f.Companion.getClass();
                f fVarA = gk.e.a(strH24);
                long jF20 = f(cursor, "data_usage_limits_kilobytes");
                long jF21 = f(cursor, "data_usage_limits_days");
                boolean zA8 = a("excluded_from_sdk_data_usage_limits", cursor, false);
                int iD11 = d(cursor, "data_usage_limits_app_status_mode");
                String strH25 = h(cursor, "cross_task_delay_groups");
                String str20 = strH25 == null ? "" : strH25;
                int iD12 = d(cursor, "priority");
                String strH26 = h(cursor, "last_location");
                return new rj.f(jF12, str12, str19, str13, str14, jF13, jF14, jF19, iD9, str15, fVarA, jF18, jF15, jF16, jF17, iD10, str16, zA2, zA3, zA4, zA5, zA6, str17, str18, zA7, jF20, jF21, zA8, iD11, str20, iD12, strH26 != null ? strH26 : "", h(cursor, "wifi_ssid_regex"), a("save_partial_jobs_results", cursor, true), a("should_log_events", cursor, false));
        }
    }

    public final long f(Cursor cursor, String str) {
        l.e(cursor, "cursor");
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex >= 0) {
                return cursor.getLong(columnIndex);
            }
            return 0L;
        } catch (Exception e4) {
            n.c("DatabaseTable", e4.getLocalizedMessage());
            j(e4, str);
            return 0L;
        }
    }

    public final String g() {
        switch (this.f10789a) {
            case 0:
                return "ip_cache";
            case 1:
                return "job_results";
            case 2:
                return "key_value_data";
            case 3:
                return "qos_results";
            case 4:
                return "task_stats";
            default:
                return "scheduled_tasks";
        }
    }

    public final String h(Cursor cursor, String str) {
        l.e(cursor, "cursor");
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex >= 0) {
                return cursor.getString(columnIndex);
            }
            return null;
        } catch (Exception e4) {
            n.c("DatabaseTable", e4.getLocalizedMessage());
            j(e4, str);
            return null;
        }
    }

    public final String i(String str, Cursor cursor, String str2) {
        try {
            int columnIndex = cursor.getColumnIndex(str);
            String string = columnIndex >= 0 ? cursor.getString(columnIndex) : str2;
            l.b(string);
            return string;
        } catch (Exception e4) {
            n.c("DatabaseTable", e4.getLocalizedMessage());
            j(e4, str);
            return str2;
        }
    }

    public final void j(Exception exc, String str) {
        StringBuilder sbU = c7.a.u("Error reading Column: ", str, " from table: ");
        sbU.append(g());
        sbU.append(". Exception: ");
        sbU.append(exc.getLocalizedMessage());
        String string = sbU.toString();
        ch.l.f3962t5.r();
        cj.a.E(exc, string);
    }

    public final ContentValues k(Object obj) {
        switch (this.f10789a) {
            case 0:
                rj.a aVar = (rj.a) obj;
                l.e(aVar, "item");
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", Long.valueOf(aVar.f21545a));
                contentValues.put("ip_address", aVar.f21546b);
                contentValues.put("last_modification_date", Long.valueOf(aVar.f21547c));
                u uVar = aVar.f21548d;
                contentValues.put("latitude", Double.valueOf(uVar.f721a));
                contentValues.put("longitude", Double.valueOf(uVar.f722b));
                contentValues.put("provider", uVar.f723c);
                contentValues.put("elapsed_real_time_ms", Long.valueOf(uVar.f724d));
                contentValues.put("receive_time", Long.valueOf(uVar.f725e));
                contentValues.put("utc_time", Long.valueOf(uVar.f726f));
                contentValues.put("altitude", Double.valueOf(uVar.f727g));
                contentValues.put("speed", Float.valueOf(uVar.f728h));
                contentValues.put("bearing", Float.valueOf(uVar.f729i));
                contentValues.put("accuracy", Float.valueOf(uVar.j));
                contentValues.put("satellite_count", Integer.valueOf(uVar.k));
                contentValues.put("from_mock_provider", Boolean.valueOf(uVar.f730l));
                contentValues.put("msl_altitude_meters", uVar.f731m);
                contentValues.put("msl_altitude_accuracy_meters", uVar.f732n);
                contentValues.put("altitude_accuracy_meters", uVar.f733o);
                return contentValues;
            case 1:
                b bVar = (b) obj;
                l.e(bVar, "item");
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("id", Long.valueOf(bVar.f21549a));
                contentValues2.put("task_id", Long.valueOf(bVar.f21550b));
                contentValues2.put("task_name", bVar.f21551c);
                contentValues2.put("job_type", bVar.f21552d);
                contentValues2.put("time_in_millis", Long.valueOf(bVar.f21553e));
                contentValues2.put("data", bVar.f21554f);
                return contentValues2;
            case 2:
                c cVar = (c) obj;
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("id", cVar != null ? cVar.f21555a : null);
                contentValues3.put("value", cVar != null ? cVar.f21556b : null);
                return contentValues3;
            case 3:
                d dVar = (d) obj;
                l.e(dVar, "item");
                ContentValues contentValues4 = new ContentValues();
                contentValues4.put("task_name", dVar.f21558b);
                contentValues4.put("connection_type", Integer.valueOf(dVar.f21560d));
                contentValues4.put("execution_date", Long.valueOf(dVar.f21559c));
                contentValues4.put("test_type", Integer.valueOf(dVar.f21572r));
                contentValues4.put("download", Double.valueOf(dVar.f21561e));
                contentValues4.put("download_test_status", Integer.valueOf(dVar.f21562f));
                contentValues4.put("upload", Double.valueOf(dVar.f21563g));
                contentValues4.put("upload_test_status", Integer.valueOf(dVar.f21564h));
                contentValues4.put("latency", Double.valueOf(dVar.f21565i));
                contentValues4.put("latency_test_status", Integer.valueOf(dVar.j));
                contentValues4.put("jitter", Double.valueOf(dVar.k));
                contentValues4.put("packet_discard", Double.valueOf(dVar.f21566l));
                contentValues4.put("icmp", Double.valueOf(dVar.f21567m));
                contentValues4.put("icmp_test_status", Integer.valueOf(dVar.f21568n));
                contentValues4.put("rssi", Integer.valueOf(dVar.f21569o));
                contentValues4.put("lat", Double.valueOf(dVar.f21570p));
                contentValues4.put("lng", Double.valueOf(dVar.f21571q));
                contentValues4.put("connection_id", dVar.f21573s);
                contentValues4.put("connection_start_date", Long.valueOf(dVar.f21574t));
                contentValues4.put("connection_ssid", dVar.f21575u);
                contentValues4.put("connection_access_point", dVar.f21576v);
                contentValues4.put("connection_technology", Integer.valueOf(dVar.f21577w));
                return contentValues4;
            case 4:
                e eVar = (e) obj;
                l.e(eVar, "item");
                ContentValues contentValues5 = new ContentValues();
                contentValues5.put("id", Long.valueOf(eVar.f21578a));
                contentValues5.put("task_name", eVar.f21579b);
                contentValues5.put("network_type", Integer.valueOf(eVar.f21580c));
                contentValues5.put("network_connection_type", Integer.valueOf(eVar.f21581d));
                contentValues5.put("network_generation", eVar.f21582e);
                contentValues5.put("consumption_date", eVar.f21583f);
                contentValues5.put("foreground_execution_count", Integer.valueOf(eVar.f21584g));
                contentValues5.put("background_execution_count", Integer.valueOf(eVar.f21585h));
                contentValues5.put("foreground_data_usage", eVar.f21586i);
                contentValues5.put("background_data_usage", eVar.j);
                contentValues5.put("foreground_download_data_usage", eVar.k);
                contentValues5.put("background_download_data_usage", eVar.f21587l);
                contentValues5.put("foreground_upload_data_usage", eVar.f21588m);
                contentValues5.put("background_upload_data_usage", eVar.f21589n);
                contentValues5.put("excluded_from_sdk_data_usage_limits", Boolean.valueOf(eVar.f21590o));
                return contentValues5;
            default:
                rj.f fVar = (rj.f) obj;
                l.e(fVar, "item");
                ContentValues contentValues6 = new ContentValues();
                contentValues6.put("id", Long.valueOf(fVar.f21591a));
                contentValues6.put("name", fVar.f21592b);
                contentValues6.put("execute_triggers", fVar.f21594d);
                contentValues6.put("interruption_triggers", fVar.f21595e);
                contentValues6.put("initial_delay", Long.valueOf(fVar.f21596f));
                contentValues6.put("repeat_period", Long.valueOf(fVar.f21597g));
                contentValues6.put("repeat_count", Integer.valueOf(fVar.f21599i));
                contentValues6.put("jobs", fVar.j);
                contentValues6.put("starting_execute_time", Long.valueOf(fVar.f21601m));
                contentValues6.put("last_successful_execute_time", Long.valueOf(fVar.f21602n));
                contentValues6.put("schedule_time", Long.valueOf(fVar.f21603o));
                contentValues6.put("current_execute_count", Integer.valueOf(fVar.f21604p));
                contentValues6.put("reschedule_for_triggers", Boolean.valueOf(fVar.f21606r));
                contentValues6.put("manual_execution", Boolean.valueOf(fVar.f21607s));
                contentValues6.put("consent_required", Boolean.valueOf(fVar.f21608t));
                contentValues6.put("data_endpoint", fVar.f21593c);
                contentValues6.put("state", fVar.f21605q);
                contentValues6.put("added_time", Long.valueOf(fVar.f21600l));
                contentValues6.put("schedule_type", fVar.k.name());
                contentValues6.put("is_scheduled_in_pipeline", Boolean.valueOf(fVar.f21609u));
                contentValues6.put("is_network_intensive", Boolean.valueOf(fVar.f21610v));
                contentValues6.put("reschedule_on_fail_from_this_task_onwards", fVar.f21611w);
                contentValues6.put("reschedule_on_interrupt_from_this_task_onwards", fVar.f21612x);
                contentValues6.put("spacing_delay_in_millis", Long.valueOf(fVar.f21598h));
                contentValues6.put("use_cross_task_delay", Boolean.valueOf(fVar.f21613y));
                contentValues6.put("data_usage_limits_kilobytes", Long.valueOf(fVar.f21614z));
                contentValues6.put("data_usage_limits_days", Long.valueOf(fVar.A));
                contentValues6.put("excluded_from_sdk_data_usage_limits", Boolean.valueOf(fVar.B));
                contentValues6.put("data_usage_limits_app_status_mode", Integer.valueOf(fVar.C));
                contentValues6.put("cross_task_delay_groups", fVar.D);
                contentValues6.put("priority", Integer.valueOf(fVar.E));
                contentValues6.put("last_location", fVar.F);
                contentValues6.put("wifi_ssid_regex", fVar.G);
                contentValues6.put("save_partial_jobs_results", Boolean.valueOf(fVar.H));
                contentValues6.put("should_log_events", Boolean.valueOf(fVar.I));
                return contentValues6;
        }
    }
}
