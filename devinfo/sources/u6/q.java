package u6;

import androidx.work.impl.WorkDatabase_Impl;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.measurement.d5;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import pb.l0;
import t5.f0;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends t5.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase_Impl f35171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.f35171d = workDatabase_Impl;
    }

    @Override // t5.t
    public final void a(d6.a aVar) throws Exception {
        nk.k.e(aVar, "connection");
        i0.g(aVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        i0.g(aVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        i0.g(aVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        i0.g(aVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        i0.g(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        i0.g(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        i0.g(aVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        i0.g(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        i0.g(aVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        i0.g(aVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        i0.g(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        i0.g(aVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        i0.g(aVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        i0.g(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        i0.g(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // t5.t
    public final void b(d6.a aVar) throws Exception {
        nk.k.e(aVar, "connection");
        i0.g(aVar, "DROP TABLE IF EXISTS `Dependency`");
        i0.g(aVar, "DROP TABLE IF EXISTS `WorkSpec`");
        i0.g(aVar, "DROP TABLE IF EXISTS `WorkTag`");
        i0.g(aVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
        i0.g(aVar, "DROP TABLE IF EXISTS `WorkName`");
        i0.g(aVar, "DROP TABLE IF EXISTS `WorkProgress`");
        i0.g(aVar, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // t5.t
    public final void c(d6.a aVar) {
        nk.k.e(aVar, "connection");
    }

    @Override // t5.t
    public final void d(d6.a aVar) throws Exception {
        nk.k.e(aVar, "connection");
        i0.g(aVar, "PRAGMA foreign_keys = ON");
        t5.g gVarF = this.f35171d.f();
        f0 f0Var = gVarF.f34236b;
        f0Var.getClass();
        d6.c cVarS = aVar.S("PRAGMA query_only");
        try {
            cVarS.P();
            boolean zR = cVarS.r();
            d5.c(cVarS, null);
            if (!zR) {
                i0.g(aVar, "PRAGMA temp_store = MEMORY");
                i0.g(aVar, "PRAGMA recursive_triggers = 1");
                i0.g(aVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (f0Var.f34229d) {
                    i0.g(aVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    i0.g(aVar, vk.p.u0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                b5.i0 i0Var = f0Var.f34232h;
                ReentrantLock reentrantLock = (ReentrantLock) i0Var.f1821b;
                reentrantLock.lock();
                try {
                    i0Var.f1820a = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (gVarF.g) {
            }
        } finally {
        }
    }

    @Override // t5.t
    public final void e(d6.a aVar) {
        nk.k.e(aVar, "connection");
    }

    @Override // t5.t
    public final void f(d6.a aVar) throws Exception {
        nk.k.e(aVar, "connection");
        ak.c cVarF = cm.g.f();
        d6.c cVarS = aVar.S("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cVarS.P()) {
            try {
                cVarF.add(cVarS.D(0));
            } finally {
            }
        }
        d5.c(cVarS, null);
        ListIterator listIterator = cm.g.d(cVarF).listIterator(0);
        while (true) {
            ak.a aVar2 = (ak.a) listIterator;
            if (!aVar2.hasNext()) {
                return;
            }
            String str = (String) aVar2.next();
            if (vk.p.w0(str, "room_fts_content_sync_", false)) {
                i0.g(aVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // t5.t
    public final l0 g(d6.a aVar) throws Exception {
        nk.k.e(aVar, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new z5.g("work_spec_id", true, 1, "TEXT", 1, null));
        linkedHashMap.put("prerequisite_id", new z5.g("prerequisite_id", true, 2, "TEXT", 1, null));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new z5.h("WorkSpec", "CASCADE", "CASCADE", cm.g.s("work_spec_id"), cm.g.s(FacebookMediationAdapter.KEY_ID)));
        linkedHashSet.add(new z5.h("WorkSpec", "CASCADE", "CASCADE", cm.g.s("prerequisite_id"), cm.g.s(FacebookMediationAdapter.KEY_ID)));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new z5.i("index_Dependency_work_spec_id", false, cm.g.s("work_spec_id"), cm.g.s("ASC")));
        linkedHashSet2.add(new z5.i("index_Dependency_prerequisite_id", false, cm.g.s("prerequisite_id"), cm.g.s("ASC")));
        z5.j jVar = new z5.j("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        z5.j jVarT = nh.a.t(aVar, "Dependency");
        if (!jVar.equals(jVarT)) {
            return new l0(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + jVar + "\n Found:\n" + jVarT);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(FacebookMediationAdapter.KEY_ID, new z5.g(FacebookMediationAdapter.KEY_ID, true, 1, "TEXT", 1, null));
        linkedHashMap2.put("state", new z5.g("state", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("worker_class_name", new z5.g("worker_class_name", true, 0, "TEXT", 1, null));
        linkedHashMap2.put("input_merger_class_name", new z5.g("input_merger_class_name", true, 0, "TEXT", 1, null));
        linkedHashMap2.put("input", new z5.g("input", true, 0, "BLOB", 1, null));
        linkedHashMap2.put("output", new z5.g("output", true, 0, "BLOB", 1, null));
        linkedHashMap2.put("initial_delay", new z5.g("initial_delay", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("interval_duration", new z5.g("interval_duration", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("flex_duration", new z5.g("flex_duration", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("run_attempt_count", new z5.g("run_attempt_count", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("backoff_policy", new z5.g("backoff_policy", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("backoff_delay_duration", new z5.g("backoff_delay_duration", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("last_enqueue_time", new z5.g("last_enqueue_time", true, 0, "INTEGER", 1, "-1"));
        linkedHashMap2.put("minimum_retention_duration", new z5.g("minimum_retention_duration", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("schedule_requested_at", new z5.g("schedule_requested_at", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("run_in_foreground", new z5.g("run_in_foreground", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("out_of_quota_policy", new z5.g("out_of_quota_policy", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("period_count", new z5.g("period_count", true, 0, "INTEGER", 1, "0"));
        linkedHashMap2.put("generation", new z5.g("generation", true, 0, "INTEGER", 1, "0"));
        linkedHashMap2.put("next_schedule_time_override", new z5.g("next_schedule_time_override", true, 0, "INTEGER", 1, "9223372036854775807"));
        linkedHashMap2.put("next_schedule_time_override_generation", new z5.g("next_schedule_time_override_generation", true, 0, "INTEGER", 1, "0"));
        linkedHashMap2.put("stop_reason", new z5.g("stop_reason", true, 0, "INTEGER", 1, "-256"));
        linkedHashMap2.put("trace_tag", new z5.g("trace_tag", false, 0, "TEXT", 1, null));
        linkedHashMap2.put("backoff_on_system_interruptions", new z5.g("backoff_on_system_interruptions", false, 0, "INTEGER", 1, null));
        linkedHashMap2.put("required_network_type", new z5.g("required_network_type", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("required_network_request", new z5.g("required_network_request", true, 0, "BLOB", 1, "x''"));
        linkedHashMap2.put("requires_charging", new z5.g("requires_charging", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("requires_device_idle", new z5.g("requires_device_idle", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("requires_battery_not_low", new z5.g("requires_battery_not_low", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("requires_storage_not_low", new z5.g("requires_storage_not_low", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("trigger_content_update_delay", new z5.g("trigger_content_update_delay", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("trigger_max_content_delay", new z5.g("trigger_max_content_delay", true, 0, "INTEGER", 1, null));
        linkedHashMap2.put("content_uri_triggers", new z5.g("content_uri_triggers", true, 0, "BLOB", 1, null));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new z5.i("index_WorkSpec_schedule_requested_at", false, cm.g.s("schedule_requested_at"), cm.g.s("ASC")));
        linkedHashSet4.add(new z5.i("index_WorkSpec_last_enqueue_time", false, cm.g.s("last_enqueue_time"), cm.g.s("ASC")));
        z5.j jVar2 = new z5.j("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        z5.j jVarT2 = nh.a.t(aVar, "WorkSpec");
        if (!jVar2.equals(jVarT2)) {
            return new l0(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + jVar2 + "\n Found:\n" + jVarT2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new z5.g("tag", true, 1, "TEXT", 1, null));
        linkedHashMap3.put("work_spec_id", new z5.g("work_spec_id", true, 2, "TEXT", 1, null));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new z5.h("WorkSpec", "CASCADE", "CASCADE", cm.g.s("work_spec_id"), cm.g.s(FacebookMediationAdapter.KEY_ID)));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new z5.i("index_WorkTag_work_spec_id", false, cm.g.s("work_spec_id"), cm.g.s("ASC")));
        z5.j jVar3 = new z5.j("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        z5.j jVarT3 = nh.a.t(aVar, "WorkTag");
        if (!jVar3.equals(jVarT3)) {
            return new l0(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + jVar3 + "\n Found:\n" + jVarT3);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new z5.g("work_spec_id", true, 1, "TEXT", 1, null));
        linkedHashMap4.put("generation", new z5.g("generation", true, 2, "INTEGER", 1, "0"));
        linkedHashMap4.put("system_id", new z5.g("system_id", true, 0, "INTEGER", 1, null));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new z5.h("WorkSpec", "CASCADE", "CASCADE", cm.g.s("work_spec_id"), cm.g.s(FacebookMediationAdapter.KEY_ID)));
        z5.j jVar4 = new z5.j("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        z5.j jVarT4 = nh.a.t(aVar, "SystemIdInfo");
        if (!jVar4.equals(jVarT4)) {
            return new l0(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + jVar4 + "\n Found:\n" + jVarT4);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new z5.g("name", true, 1, "TEXT", 1, null));
        linkedHashMap5.put("work_spec_id", new z5.g("work_spec_id", true, 2, "TEXT", 1, null));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new z5.h("WorkSpec", "CASCADE", "CASCADE", cm.g.s("work_spec_id"), cm.g.s(FacebookMediationAdapter.KEY_ID)));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new z5.i("index_WorkName_work_spec_id", false, cm.g.s("work_spec_id"), cm.g.s("ASC")));
        z5.j jVar5 = new z5.j("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        z5.j jVarT5 = nh.a.t(aVar, "WorkName");
        if (!jVar5.equals(jVarT5)) {
            return new l0(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + jVar5 + "\n Found:\n" + jVarT5);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new z5.g("work_spec_id", true, 1, "TEXT", 1, null));
        linkedHashMap6.put("progress", new z5.g("progress", true, 0, "BLOB", 1, null));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new z5.h("WorkSpec", "CASCADE", "CASCADE", cm.g.s("work_spec_id"), cm.g.s(FacebookMediationAdapter.KEY_ID)));
        z5.j jVar6 = new z5.j("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        z5.j jVarT6 = nh.a.t(aVar, "WorkProgress");
        if (!jVar6.equals(jVarT6)) {
            return new l0(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + jVar6 + "\n Found:\n" + jVarT6);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new z5.g("key", true, 1, "TEXT", 1, null));
        linkedHashMap7.put("long_value", new z5.g("long_value", false, 0, "INTEGER", 1, null));
        z5.j jVar7 = new z5.j("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        z5.j jVarT7 = nh.a.t(aVar, "Preference");
        if (jVar7.equals(jVarT7)) {
            return new l0(true, null);
        }
        return new l0(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + jVar7 + "\n Found:\n" + jVarT7);
    }
}
