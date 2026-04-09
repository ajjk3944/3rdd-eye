package L4;

import C0.p;
import C0.q;
import C0.r;
import android.database.SQLException;
import androidx.work.impl.WorkDatabase_Impl;
import com.lefan.signal.db.CellInfoZoom_Impl;
import com.lefan.signal.db.MacDataBaseRoom_Impl;
import com.lefan.signal.db.SquatterRoom_Impl;
import com.lefan.signal.network.webSpeed.WebSpeedRoom_Impl;
import com.lefan.signal.tracroute.TraceDataRoom_Impl;
import com.lefan.signal.ui.noise.NoiseZoom_Impl;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends q {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2611c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f2612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(p pVar, int i) {
        super(1, 0);
        this.f2611c = i;
        this.f2612d = pVar;
    }

    @Override // C0.q
    public final void a(H0.c cVar) throws SQLException {
        switch (this.f2611c) {
            case 0:
                cVar.h("CREATE TABLE IF NOT EXISTS `cellInfo` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `cell_id` TEXT, `address` TEXT, `latitude` REAL, `longitude` REAL, `radius` REAL NOT NULL)");
                cVar.h("CREATE UNIQUE INDEX IF NOT EXISTS `index_cellInfo_cell_id` ON `cellInfo` (`cell_id`)");
                cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e1acf26c65bda7e96a54b6af7b99400c')");
                break;
            case 1:
                cVar.h("CREATE TABLE IF NOT EXISTS `macvendor` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `brand` TEXT, `mac` TEXT)");
                cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '74c39f16249e2a68289487feb1726a4e')");
                break;
            case 2:
                cVar.h("CREATE TABLE IF NOT EXISTS `squatter` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `brand` TEXT, `mac` TEXT, `type` INTEGER NOT NULL, `host` TEXT, `isKnown` INTEGER NOT NULL)");
                cVar.h("CREATE UNIQUE INDEX IF NOT EXISTS `index_squatter_mac` ON `squatter` (`mac`)");
                cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4fd916d54fa9fd5f4691e298a7914018')");
                break;
            case 3:
                cVar.h("CREATE TABLE IF NOT EXISTS `web_speed` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT, `name` TEXT, `logo` TEXT)");
                cVar.h("CREATE UNIQUE INDEX IF NOT EXISTS `index_web_speed_url` ON `web_speed` (`url`)");
                cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a04822d74099a211bf85897bcf3658f9')");
                break;
            case 4:
                cVar.h("CREATE TABLE IF NOT EXISTS `noise` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `minValue` REAL NOT NULL, `avgValue` REAL NOT NULL, `maxValue` REAL NOT NULL, `lat` REAL, `lon` REAL, `address` TEXT, `step` TEXT)");
                cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '94008e2e42566fb73cc099430dbee2ef')");
                break;
            case 5:
                cVar.h("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.h("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                cVar.h("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                cVar.h("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
                cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                cVar.h("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                cVar.h("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.h("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.h("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                cVar.h("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                cVar.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
                break;
            default:
                cVar.h("CREATE TABLE IF NOT EXISTS `trace_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `trace_link` TEXT, `trace_time` INTEGER NOT NULL)");
                cVar.h("CREATE UNIQUE INDEX IF NOT EXISTS `index_trace_history_trace_link` ON `trace_history` (`trace_link`)");
                cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8bf5d7ad52292ddb1bd344cc68dc3de4')");
                break;
        }
    }

    @Override // C0.q
    public final void b(H0.c cVar) throws SQLException {
        int i = this.f2611c;
        p pVar = this.f2612d;
        switch (i) {
            case 0:
                cVar.h("DROP TABLE IF EXISTS `cellInfo`");
                List list = ((CellInfoZoom_Impl) pVar).f1092f;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((W0.f) it.next()).getClass();
                    }
                    break;
                }
                break;
            case 1:
                cVar.h("DROP TABLE IF EXISTS `macvendor`");
                List list2 = ((MacDataBaseRoom_Impl) pVar).f1092f;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((W0.f) it2.next()).getClass();
                    }
                    break;
                }
                break;
            case 2:
                cVar.h("DROP TABLE IF EXISTS `squatter`");
                List list3 = ((SquatterRoom_Impl) pVar).f1092f;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((W0.f) it3.next()).getClass();
                    }
                    break;
                }
                break;
            case 3:
                cVar.h("DROP TABLE IF EXISTS `web_speed`");
                List list4 = ((WebSpeedRoom_Impl) pVar).f1092f;
                if (list4 != null) {
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        ((W0.f) it4.next()).getClass();
                    }
                    break;
                }
                break;
            case 4:
                cVar.h("DROP TABLE IF EXISTS `noise`");
                List list5 = ((NoiseZoom_Impl) pVar).f1092f;
                if (list5 != null) {
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        ((W0.f) it5.next()).getClass();
                    }
                    break;
                }
                break;
            case 5:
                cVar.h("DROP TABLE IF EXISTS `Dependency`");
                cVar.h("DROP TABLE IF EXISTS `WorkSpec`");
                cVar.h("DROP TABLE IF EXISTS `WorkTag`");
                cVar.h("DROP TABLE IF EXISTS `SystemIdInfo`");
                cVar.h("DROP TABLE IF EXISTS `WorkName`");
                cVar.h("DROP TABLE IF EXISTS `WorkProgress`");
                cVar.h("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) pVar;
                int i3 = WorkDatabase_Impl.f5676t;
                List list6 = workDatabase_Impl.f1092f;
                if (list6 != null) {
                    int size = list6.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        ((W0.f) workDatabase_Impl.f1092f.get(i6)).getClass();
                    }
                    break;
                }
                break;
            default:
                cVar.h("DROP TABLE IF EXISTS `trace_history`");
                List list7 = ((TraceDataRoom_Impl) pVar).f1092f;
                if (list7 != null) {
                    Iterator it6 = list7.iterator();
                    while (it6.hasNext()) {
                        ((W0.f) it6.next()).getClass();
                    }
                    break;
                }
                break;
        }
    }

    @Override // C0.q
    public final void h(H0.c cVar) {
        int i = this.f2611c;
        p pVar = this.f2612d;
        switch (i) {
            case 0:
                List list = ((CellInfoZoom_Impl) pVar).f1092f;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((W0.f) it.next()).getClass();
                    }
                    break;
                }
                break;
            case 1:
                List list2 = ((MacDataBaseRoom_Impl) pVar).f1092f;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((W0.f) it2.next()).getClass();
                    }
                    break;
                }
                break;
            case 2:
                List list3 = ((SquatterRoom_Impl) pVar).f1092f;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((W0.f) it3.next()).getClass();
                    }
                    break;
                }
                break;
            case 3:
                List list4 = ((WebSpeedRoom_Impl) pVar).f1092f;
                if (list4 != null) {
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        ((W0.f) it4.next()).getClass();
                    }
                    break;
                }
                break;
            case 4:
                List list5 = ((NoiseZoom_Impl) pVar).f1092f;
                if (list5 != null) {
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        ((W0.f) it5.next()).getClass();
                    }
                    break;
                }
                break;
            case 5:
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) pVar;
                int i3 = WorkDatabase_Impl.f5676t;
                List list6 = workDatabase_Impl.f1092f;
                if (list6 != null) {
                    int size = list6.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        ((W0.f) workDatabase_Impl.f1092f.get(i6)).getClass();
                    }
                    break;
                }
                break;
            default:
                List list7 = ((TraceDataRoom_Impl) pVar).f1092f;
                if (list7 != null) {
                    Iterator it6 = list7.iterator();
                    while (it6.hasNext()) {
                        ((W0.f) it6.next()).getClass();
                    }
                    break;
                }
                break;
        }
    }

    @Override // C0.q
    public final void i(H0.c cVar) throws SQLException {
        switch (this.f2611c) {
            case 0:
                ((CellInfoZoom_Impl) this.f2612d).f1087a = cVar;
                ((CellInfoZoom_Impl) this.f2612d).k(cVar);
                List list = ((CellInfoZoom_Impl) this.f2612d).f1092f;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((W0.f) it.next()).getClass();
                        W0.f.a(cVar);
                    }
                    break;
                }
                break;
            case 1:
                ((MacDataBaseRoom_Impl) this.f2612d).f1087a = cVar;
                ((MacDataBaseRoom_Impl) this.f2612d).k(cVar);
                List list2 = ((MacDataBaseRoom_Impl) this.f2612d).f1092f;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((W0.f) it2.next()).getClass();
                        W0.f.a(cVar);
                    }
                    break;
                }
                break;
            case 2:
                ((SquatterRoom_Impl) this.f2612d).f1087a = cVar;
                ((SquatterRoom_Impl) this.f2612d).k(cVar);
                List list3 = ((SquatterRoom_Impl) this.f2612d).f1092f;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((W0.f) it3.next()).getClass();
                        W0.f.a(cVar);
                    }
                    break;
                }
                break;
            case 3:
                ((WebSpeedRoom_Impl) this.f2612d).f1087a = cVar;
                ((WebSpeedRoom_Impl) this.f2612d).k(cVar);
                List list4 = ((WebSpeedRoom_Impl) this.f2612d).f1092f;
                if (list4 != null) {
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        ((W0.f) it4.next()).getClass();
                        W0.f.a(cVar);
                    }
                    break;
                }
                break;
            case 4:
                ((NoiseZoom_Impl) this.f2612d).f1087a = cVar;
                ((NoiseZoom_Impl) this.f2612d).k(cVar);
                List list5 = ((NoiseZoom_Impl) this.f2612d).f1092f;
                if (list5 != null) {
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        ((W0.f) it5.next()).getClass();
                        W0.f.a(cVar);
                    }
                    break;
                }
                break;
            case 5:
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2612d;
                int i = WorkDatabase_Impl.f5676t;
                workDatabase_Impl.f1087a = cVar;
                cVar.h("PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) this.f2612d).k(cVar);
                List list6 = ((WorkDatabase_Impl) this.f2612d).f1092f;
                if (list6 != null) {
                    int size = list6.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((W0.f) ((WorkDatabase_Impl) this.f2612d).f1092f.get(i3)).getClass();
                        W0.f.a(cVar);
                    }
                    break;
                }
                break;
            default:
                ((TraceDataRoom_Impl) this.f2612d).f1087a = cVar;
                ((TraceDataRoom_Impl) this.f2612d).k(cVar);
                List list7 = ((TraceDataRoom_Impl) this.f2612d).f1092f;
                if (list7 != null) {
                    Iterator it6 = list7.iterator();
                    while (it6.hasNext()) {
                        ((W0.f) it6.next()).getClass();
                        W0.f.a(cVar);
                    }
                    break;
                }
                break;
        }
    }

    @Override // C0.q
    public final void j(H0.c cVar) throws IOException, SQLException {
        switch (this.f2611c) {
            case 0:
                R2.a.g(cVar);
                break;
            case 1:
                R2.a.g(cVar);
                break;
            case 2:
                R2.a.g(cVar);
                break;
            case 3:
                R2.a.g(cVar);
                break;
            case 4:
                R2.a.g(cVar);
                break;
            case 5:
                R2.a.g(cVar);
                break;
            default:
                R2.a.g(cVar);
                break;
        }
    }

    @Override // C0.q
    public final r k(H0.c cVar) {
        switch (this.f2611c) {
            case 0:
                HashMap map = new HashMap(6);
                map.put("id", new E0.a("id", true, 1, "INTEGER", 1, null));
                map.put("cell_id", new E0.a("cell_id", false, 0, "TEXT", 1, null));
                map.put("address", new E0.a("address", false, 0, "TEXT", 1, null));
                map.put("latitude", new E0.a("latitude", false, 0, "REAL", 1, null));
                map.put("longitude", new E0.a("longitude", false, 0, "REAL", 1, null));
                map.put("radius", new E0.a("radius", true, 0, "REAL", 1, null));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new E0.d("index_cellInfo_cell_id", true, Arrays.asList("cell_id"), Arrays.asList("ASC")));
                E0.e eVar = new E0.e("cellInfo", map, hashSet, hashSet2);
                E0.e eVarA = E0.e.a(cVar, "cellInfo");
                if (!eVar.equals(eVarA)) {
                    break;
                } else {
                    break;
                }
            case 1:
                HashMap map2 = new HashMap(3);
                map2.put("id", new E0.a("id", true, 1, "INTEGER", 1, null));
                map2.put("brand", new E0.a("brand", false, 0, "TEXT", 1, null));
                map2.put("mac", new E0.a("mac", false, 0, "TEXT", 1, null));
                E0.e eVar2 = new E0.e("macvendor", map2, new HashSet(0), new HashSet(0));
                E0.e eVarA2 = E0.e.a(cVar, "macvendor");
                if (!eVar2.equals(eVarA2)) {
                    break;
                } else {
                    break;
                }
            case 2:
                HashMap map3 = new HashMap(6);
                map3.put("id", new E0.a("id", true, 1, "INTEGER", 1, null));
                map3.put("brand", new E0.a("brand", false, 0, "TEXT", 1, null));
                map3.put("mac", new E0.a("mac", false, 0, "TEXT", 1, null));
                map3.put("type", new E0.a("type", true, 0, "INTEGER", 1, null));
                map3.put("host", new E0.a("host", false, 0, "TEXT", 1, null));
                map3.put("isKnown", new E0.a("isKnown", true, 0, "INTEGER", 1, null));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new E0.d("index_squatter_mac", true, Arrays.asList("mac"), Arrays.asList("ASC")));
                E0.e eVar3 = new E0.e("squatter", map3, hashSet3, hashSet4);
                E0.e eVarA3 = E0.e.a(cVar, "squatter");
                if (!eVar3.equals(eVarA3)) {
                    break;
                } else {
                    break;
                }
            case 3:
                HashMap map4 = new HashMap(4);
                map4.put("id", new E0.a("id", true, 1, "INTEGER", 1, null));
                map4.put("url", new E0.a("url", false, 0, "TEXT", 1, null));
                map4.put("name", new E0.a("name", false, 0, "TEXT", 1, null));
                map4.put("logo", new E0.a("logo", false, 0, "TEXT", 1, null));
                HashSet hashSet5 = new HashSet(0);
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new E0.d("index_web_speed_url", true, Arrays.asList("url"), Arrays.asList("ASC")));
                E0.e eVar4 = new E0.e("web_speed", map4, hashSet5, hashSet6);
                E0.e eVarA4 = E0.e.a(cVar, "web_speed");
                if (!eVar4.equals(eVarA4)) {
                    break;
                } else {
                    break;
                }
            case 4:
                HashMap map5 = new HashMap(9);
                map5.put("id", new E0.a("id", true, 1, "INTEGER", 1, null));
                map5.put("time", new E0.a("time", true, 0, "INTEGER", 1, null));
                map5.put("minValue", new E0.a("minValue", true, 0, "REAL", 1, null));
                map5.put("avgValue", new E0.a("avgValue", true, 0, "REAL", 1, null));
                map5.put("maxValue", new E0.a("maxValue", true, 0, "REAL", 1, null));
                map5.put("lat", new E0.a("lat", false, 0, "REAL", 1, null));
                map5.put("lon", new E0.a("lon", false, 0, "REAL", 1, null));
                map5.put("address", new E0.a("address", false, 0, "TEXT", 1, null));
                map5.put("step", new E0.a("step", false, 0, "TEXT", 1, null));
                E0.e eVar5 = new E0.e("noise", map5, new HashSet(0), new HashSet(0));
                E0.e eVarA5 = E0.e.a(cVar, "noise");
                if (!eVar5.equals(eVarA5)) {
                    break;
                } else {
                    break;
                }
            case 5:
                HashMap map6 = new HashMap(2);
                map6.put("work_spec_id", new E0.a("work_spec_id", true, 1, "TEXT", 1, null));
                map6.put("prerequisite_id", new E0.a("prerequisite_id", true, 2, "TEXT", 1, null));
                HashSet hashSet7 = new HashSet(2);
                hashSet7.add(new E0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSet7.add(new E0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet8 = new HashSet(2);
                hashSet8.add(new E0.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id")));
                hashSet8.add(new E0.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id")));
                E0.e eVar6 = new E0.e("Dependency", map6, hashSet7, hashSet8);
                E0.e eVarA6 = E0.e.a(cVar, "Dependency");
                if (!eVar6.equals(eVarA6)) {
                    break;
                } else {
                    HashMap map7 = new HashMap(25);
                    map7.put("id", new E0.a("id", true, 1, "TEXT", 1, null));
                    map7.put("state", new E0.a("state", true, 0, "INTEGER", 1, null));
                    map7.put("worker_class_name", new E0.a("worker_class_name", true, 0, "TEXT", 1, null));
                    map7.put("input_merger_class_name", new E0.a("input_merger_class_name", false, 0, "TEXT", 1, null));
                    map7.put("input", new E0.a("input", true, 0, "BLOB", 1, null));
                    map7.put("output", new E0.a("output", true, 0, "BLOB", 1, null));
                    map7.put("initial_delay", new E0.a("initial_delay", true, 0, "INTEGER", 1, null));
                    map7.put("interval_duration", new E0.a("interval_duration", true, 0, "INTEGER", 1, null));
                    map7.put("flex_duration", new E0.a("flex_duration", true, 0, "INTEGER", 1, null));
                    map7.put("run_attempt_count", new E0.a("run_attempt_count", true, 0, "INTEGER", 1, null));
                    map7.put("backoff_policy", new E0.a("backoff_policy", true, 0, "INTEGER", 1, null));
                    map7.put("backoff_delay_duration", new E0.a("backoff_delay_duration", true, 0, "INTEGER", 1, null));
                    map7.put("period_start_time", new E0.a("period_start_time", true, 0, "INTEGER", 1, null));
                    map7.put("minimum_retention_duration", new E0.a("minimum_retention_duration", true, 0, "INTEGER", 1, null));
                    map7.put("schedule_requested_at", new E0.a("schedule_requested_at", true, 0, "INTEGER", 1, null));
                    map7.put("run_in_foreground", new E0.a("run_in_foreground", true, 0, "INTEGER", 1, null));
                    map7.put("out_of_quota_policy", new E0.a("out_of_quota_policy", true, 0, "INTEGER", 1, null));
                    map7.put("required_network_type", new E0.a("required_network_type", false, 0, "INTEGER", 1, null));
                    map7.put("requires_charging", new E0.a("requires_charging", true, 0, "INTEGER", 1, null));
                    map7.put("requires_device_idle", new E0.a("requires_device_idle", true, 0, "INTEGER", 1, null));
                    map7.put("requires_battery_not_low", new E0.a("requires_battery_not_low", true, 0, "INTEGER", 1, null));
                    map7.put("requires_storage_not_low", new E0.a("requires_storage_not_low", true, 0, "INTEGER", 1, null));
                    map7.put("trigger_content_update_delay", new E0.a("trigger_content_update_delay", true, 0, "INTEGER", 1, null));
                    map7.put("trigger_max_content_delay", new E0.a("trigger_max_content_delay", true, 0, "INTEGER", 1, null));
                    map7.put("content_uri_triggers", new E0.a("content_uri_triggers", false, 0, "BLOB", 1, null));
                    HashSet hashSet9 = new HashSet(0);
                    HashSet hashSet10 = new HashSet(2);
                    hashSet10.add(new E0.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at")));
                    hashSet10.add(new E0.d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time")));
                    E0.e eVar7 = new E0.e("WorkSpec", map7, hashSet9, hashSet10);
                    E0.e eVarA7 = E0.e.a(cVar, "WorkSpec");
                    if (!eVar7.equals(eVarA7)) {
                        break;
                    } else {
                        HashMap map8 = new HashMap(2);
                        map8.put("tag", new E0.a("tag", true, 1, "TEXT", 1, null));
                        map8.put("work_spec_id", new E0.a("work_spec_id", true, 2, "TEXT", 1, null));
                        HashSet hashSet11 = new HashSet(1);
                        hashSet11.add(new E0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                        HashSet hashSet12 = new HashSet(1);
                        hashSet12.add(new E0.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id")));
                        E0.e eVar8 = new E0.e("WorkTag", map8, hashSet11, hashSet12);
                        E0.e eVarA8 = E0.e.a(cVar, "WorkTag");
                        if (!eVar8.equals(eVarA8)) {
                            break;
                        } else {
                            HashMap map9 = new HashMap(2);
                            map9.put("work_spec_id", new E0.a("work_spec_id", true, 1, "TEXT", 1, null));
                            map9.put("system_id", new E0.a("system_id", true, 0, "INTEGER", 1, null));
                            HashSet hashSet13 = new HashSet(1);
                            hashSet13.add(new E0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                            E0.e eVar9 = new E0.e("SystemIdInfo", map9, hashSet13, new HashSet(0));
                            E0.e eVarA9 = E0.e.a(cVar, "SystemIdInfo");
                            if (!eVar9.equals(eVarA9)) {
                                break;
                            } else {
                                HashMap map10 = new HashMap(2);
                                map10.put("name", new E0.a("name", true, 1, "TEXT", 1, null));
                                map10.put("work_spec_id", new E0.a("work_spec_id", true, 2, "TEXT", 1, null));
                                HashSet hashSet14 = new HashSet(1);
                                hashSet14.add(new E0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                                HashSet hashSet15 = new HashSet(1);
                                hashSet15.add(new E0.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id")));
                                E0.e eVar10 = new E0.e("WorkName", map10, hashSet14, hashSet15);
                                E0.e eVarA10 = E0.e.a(cVar, "WorkName");
                                if (!eVar10.equals(eVarA10)) {
                                    break;
                                } else {
                                    HashMap map11 = new HashMap(2);
                                    map11.put("work_spec_id", new E0.a("work_spec_id", true, 1, "TEXT", 1, null));
                                    map11.put("progress", new E0.a("progress", true, 0, "BLOB", 1, null));
                                    HashSet hashSet16 = new HashSet(1);
                                    hashSet16.add(new E0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                                    E0.e eVar11 = new E0.e("WorkProgress", map11, hashSet16, new HashSet(0));
                                    E0.e eVarA11 = E0.e.a(cVar, "WorkProgress");
                                    if (!eVar11.equals(eVarA11)) {
                                        break;
                                    } else {
                                        HashMap map12 = new HashMap(2);
                                        map12.put("key", new E0.a("key", true, 1, "TEXT", 1, null));
                                        map12.put("long_value", new E0.a("long_value", false, 0, "INTEGER", 1, null));
                                        E0.e eVar12 = new E0.e("Preference", map12, new HashSet(0), new HashSet(0));
                                        E0.e eVarA12 = E0.e.a(cVar, "Preference");
                                        if (!eVar12.equals(eVarA12)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            default:
                HashMap map13 = new HashMap(3);
                map13.put("id", new E0.a("id", true, 1, "INTEGER", 1, null));
                map13.put("trace_link", new E0.a("trace_link", false, 0, "TEXT", 1, null));
                map13.put("trace_time", new E0.a("trace_time", true, 0, "INTEGER", 1, null));
                HashSet hashSet17 = new HashSet(0);
                HashSet hashSet18 = new HashSet(1);
                hashSet18.add(new E0.d("index_trace_history_trace_link", true, Arrays.asList("trace_link"), Arrays.asList("ASC")));
                E0.e eVar13 = new E0.e("trace_history", map13, hashSet17, hashSet18);
                E0.e eVarA13 = E0.e.a(cVar, "trace_history");
                if (!eVar13.equals(eVarA13)) {
                    break;
                } else {
                    break;
                }
        }
        return new r(true, (String) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MacDataBaseRoom_Impl macDataBaseRoom_Impl) {
        super(6, 0);
        this.f2611c = 1;
        this.f2612d = macDataBaseRoom_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SquatterRoom_Impl squatterRoom_Impl) {
        super(13, 0);
        this.f2611c = 2;
        this.f2612d = squatterRoom_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WorkDatabase_Impl workDatabase_Impl) {
        super(12, 0);
        this.f2611c = 5;
        this.f2612d = workDatabase_Impl;
    }
}
