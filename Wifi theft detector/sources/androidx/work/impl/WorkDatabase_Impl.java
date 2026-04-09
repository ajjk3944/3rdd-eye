package androidx.work.impl;

import androidx.core.app.NotificationCompat;
import androidx.room.RoomDatabase;
import androidx.room.d;
import androidx.room.g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import l2.b;
import l2.e;
import l2.f;
import l2.h;
import l2.i;
import l2.k;
import l2.l;
import l2.n;
import l2.o;
import l2.q;
import l2.r;
import l2.t;
import l2.u;
import s1.f;
import u1.c;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m, reason: collision with root package name */
    public volatile q f4383m;

    /* renamed from: n, reason: collision with root package name */
    public volatile b f4384n;

    /* renamed from: o, reason: collision with root package name */
    public volatile t f4385o;

    /* renamed from: p, reason: collision with root package name */
    public volatile h f4386p;

    /* renamed from: q, reason: collision with root package name */
    public volatile k f4387q;

    /* renamed from: r, reason: collision with root package name */
    public volatile n f4388r;

    /* renamed from: s, reason: collision with root package name */
    public volatile e f4389s;

    @Override // androidx.work.impl.WorkDatabase
    public n A() {
        n nVar;
        if (this.f4388r != null) {
            return this.f4388r;
        }
        synchronized (this) {
            try {
                if (this.f4388r == null) {
                    this.f4388r = new o(this);
                }
                nVar = this.f4388r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q B() {
        q qVar;
        if (this.f4383m != null) {
            return this.f4383m;
        }
        synchronized (this) {
            try {
                if (this.f4383m == null) {
                    this.f4383m = new r(this);
                }
                qVar = this.f4383m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public t C() {
        t tVar;
        if (this.f4385o != null) {
            return this.f4385o;
        }
        synchronized (this) {
            try {
                if (this.f4385o == null) {
                    this.f4385o = new u(this);
                }
                tVar = this.f4385o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    @Override // androidx.room.RoomDatabase
    public d e() {
        return new d(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    public c f(androidx.room.a aVar) {
        return aVar.f4057a.a(c.b.a(aVar.f4058b).c(aVar.f4059c).b(new g(aVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public b t() {
        b bVar;
        if (this.f4384n != null) {
            return this.f4384n;
        }
        synchronized (this) {
            try {
                if (this.f4384n == null) {
                    this.f4384n = new l2.c(this);
                }
                bVar = this.f4384n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public e x() {
        e eVar;
        if (this.f4389s != null) {
            return this.f4389s;
        }
        synchronized (this) {
            try {
                if (this.f4389s == null) {
                    this.f4389s = new f(this);
                }
                eVar = this.f4389s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public h y() {
        h hVar;
        if (this.f4386p != null) {
            return this.f4386p;
        }
        synchronized (this) {
            try {
                if (this.f4386p == null) {
                    this.f4386p = new i(this);
                }
                hVar = this.f4386p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k z() {
        k kVar;
        if (this.f4387q != null) {
            return this.f4387q;
        }
        synchronized (this) {
            try {
                if (this.f4387q == null) {
                    this.f4387q = new l(this);
                }
                kVar = this.f4387q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    public class a extends g.a {
        public a(int i10) {
            super(i10);
        }

        @Override // androidx.room.g.a
        public void a(u1.b bVar) {
            bVar.y("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.y("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.y("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.y("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.y("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.y("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            bVar.y("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.y("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.y("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.y("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.y("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.y("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.y("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.y("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.y("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.g.a
        public void b(u1.b bVar) {
            bVar.y("DROP TABLE IF EXISTS `Dependency`");
            bVar.y("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.y("DROP TABLE IF EXISTS `WorkTag`");
            bVar.y("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.y("DROP TABLE IF EXISTS `WorkName`");
            bVar.y("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.y("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f4031h != null) {
                int size = WorkDatabase_Impl.this.f4031h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.b) WorkDatabase_Impl.this.f4031h.get(i10)).b(bVar);
                }
            }
        }

        @Override // androidx.room.g.a
        public void c(u1.b bVar) {
            if (WorkDatabase_Impl.this.f4031h != null) {
                int size = WorkDatabase_Impl.this.f4031h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.b) WorkDatabase_Impl.this.f4031h.get(i10)).a(bVar);
                }
            }
        }

        @Override // androidx.room.g.a
        public void d(u1.b bVar) {
            WorkDatabase_Impl.this.f4024a = bVar;
            bVar.y("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m(bVar);
            if (WorkDatabase_Impl.this.f4031h != null) {
                int size = WorkDatabase_Impl.this.f4031h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((RoomDatabase.b) WorkDatabase_Impl.this.f4031h.get(i10)).c(bVar);
                }
            }
        }

        @Override // androidx.room.g.a
        public void f(u1.b bVar) {
            s1.c.a(bVar);
        }

        @Override // androidx.room.g.a
        public g.b g(u1.b bVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new f.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new f.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new f.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            s1.f fVar = new s1.f("Dependency", map, hashSet, hashSet2);
            s1.f fVarA = s1.f.a(bVar, "Dependency");
            if (!fVar.equals(fVarA)) {
                return new g.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + fVarA);
            }
            HashMap map2 = new HashMap(25);
            map2.put("id", new f.a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new f.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new f.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new f.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new f.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new f.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new f.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new f.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new f.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new f.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new f.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new f.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("period_start_time", new f.a("period_start_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new f.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new f.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new f.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new f.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("required_network_type", new f.a("required_network_type", "INTEGER", false, 0, null, 1));
            map2.put("requires_charging", new f.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new f.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new f.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new f.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new f.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new f.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new f.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new f.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new f.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            s1.f fVar2 = new s1.f("WorkSpec", map2, hashSet3, hashSet4);
            s1.f fVarA2 = s1.f.a(bVar, "WorkSpec");
            if (!fVar2.equals(fVarA2)) {
                return new g.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + fVarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new f.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new f.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            s1.f fVar3 = new s1.f("WorkTag", map3, hashSet5, hashSet6);
            s1.f fVarA3 = s1.f.a(bVar, "WorkTag");
            if (!fVar3.equals(fVarA3)) {
                return new g.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + fVarA3);
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("system_id", new f.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            s1.f fVar4 = new s1.f("SystemIdInfo", map4, hashSet7, new HashSet(0));
            s1.f fVarA4 = s1.f.a(bVar, "SystemIdInfo");
            if (!fVar4.equals(fVarA4)) {
                return new g.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + fVarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new f.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new f.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            s1.f fVar5 = new s1.f("WorkName", map5, hashSet8, hashSet9);
            s1.f fVarA5 = s1.f.a(bVar, "WorkName");
            if (!fVar5.equals(fVarA5)) {
                return new g.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + fVarA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put(NotificationCompat.CATEGORY_PROGRESS, new f.a(NotificationCompat.CATEGORY_PROGRESS, "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            s1.f fVar6 = new s1.f("WorkProgress", map6, hashSet10, new HashSet(0));
            s1.f fVarA6 = s1.f.a(bVar, "WorkProgress");
            if (!fVar6.equals(fVarA6)) {
                return new g.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + fVarA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new f.a("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new f.a("long_value", "INTEGER", false, 0, null, 1));
            s1.f fVar7 = new s1.f("Preference", map7, new HashSet(0), new HashSet(0));
            s1.f fVarA7 = s1.f.a(bVar, "Preference");
            if (fVar7.equals(fVarA7)) {
                return new g.b(true, null);
            }
            return new g.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + fVarA7);
        }

        @Override // androidx.room.g.a
        public void e(u1.b bVar) {
        }
    }
}
