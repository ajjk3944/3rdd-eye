package androidx.work.impl;

import C1.g;
import D3.f;
import D9.G;
import F1.c;
import G1.d;
import K1.q;
import K4.b;
import T1.C1592d;
import T1.C1593e;
import T1.C1594f;
import T1.C1595g;
import T1.C1596h;
import android.content.Context;
import android.database.SQLException;
import androidx.room.c;
import b2.C1816C;
import b2.C1827h;
import b2.C1833n;
import b2.InterfaceC1818E;
import b2.InterfaceC1821b;
import b2.InterfaceC1824e;
import b2.InterfaceC1826g;
import b2.InterfaceC1829j;
import b2.InterfaceC1836q;
import b2.InterfaceC1839t;
import b2.InterfaceC1843x;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;
import w1.C5716b;
import w1.n;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: l, reason: collision with root package name */
    public volatile C1816C f16899l;

    /* renamed from: m, reason: collision with root package name */
    public volatile b f16900m;

    /* renamed from: n, reason: collision with root package name */
    public volatile f f16901n;

    /* renamed from: o, reason: collision with root package name */
    public volatile C1833n f16902o;

    /* renamed from: p, reason: collision with root package name */
    public volatile G f16903p;

    /* renamed from: q, reason: collision with root package name */
    public volatile q f16904q;

    /* renamed from: r, reason: collision with root package name */
    public volatile B0.f f16905r;

    /* renamed from: s, reason: collision with root package name */
    public volatile C1827h f16906s;

    public class a extends n.a {
        public a() {
        }

        public final void a(d dVar) throws SQLException {
            dVar.C("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            dVar.C("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            dVar.C("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            dVar.C("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            dVar.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            dVar.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            dVar.C("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            dVar.C("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            dVar.C("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            dVar.C("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            dVar.C("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            dVar.C("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            dVar.C("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            dVar.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            dVar.C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
        }

        public final n.b b(d dVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new g.a(1, "work_spec_id", "TEXT", null, true, 1));
            map.put("prerequisite_id", new g.a(2, "prerequisite_id", "TEXT", null, true, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new g.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            hashSet.add(new g.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new g.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new g.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            g gVar = new g("Dependency", map, hashSet, hashSet2);
            g gVarA = g.a(dVar, "Dependency");
            if (!gVar.equals(gVarA)) {
                return new n.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gVar + "\n Found:\n" + gVarA);
            }
            HashMap map2 = new HashMap(30);
            map2.put(FacebookMediationAdapter.KEY_ID, new g.a(1, FacebookMediationAdapter.KEY_ID, "TEXT", null, true, 1));
            map2.put("state", new g.a(0, "state", "INTEGER", null, true, 1));
            map2.put("worker_class_name", new g.a(0, "worker_class_name", "TEXT", null, true, 1));
            map2.put("input_merger_class_name", new g.a(0, "input_merger_class_name", "TEXT", null, true, 1));
            map2.put("input", new g.a(0, "input", "BLOB", null, true, 1));
            map2.put("output", new g.a(0, "output", "BLOB", null, true, 1));
            map2.put("initial_delay", new g.a(0, "initial_delay", "INTEGER", null, true, 1));
            map2.put("interval_duration", new g.a(0, "interval_duration", "INTEGER", null, true, 1));
            map2.put("flex_duration", new g.a(0, "flex_duration", "INTEGER", null, true, 1));
            map2.put("run_attempt_count", new g.a(0, "run_attempt_count", "INTEGER", null, true, 1));
            map2.put("backoff_policy", new g.a(0, "backoff_policy", "INTEGER", null, true, 1));
            map2.put("backoff_delay_duration", new g.a(0, "backoff_delay_duration", "INTEGER", null, true, 1));
            map2.put("last_enqueue_time", new g.a(0, "last_enqueue_time", "INTEGER", "-1", true, 1));
            map2.put("minimum_retention_duration", new g.a(0, "minimum_retention_duration", "INTEGER", null, true, 1));
            map2.put("schedule_requested_at", new g.a(0, "schedule_requested_at", "INTEGER", null, true, 1));
            map2.put("run_in_foreground", new g.a(0, "run_in_foreground", "INTEGER", null, true, 1));
            map2.put("out_of_quota_policy", new g.a(0, "out_of_quota_policy", "INTEGER", null, true, 1));
            map2.put("period_count", new g.a(0, "period_count", "INTEGER", CommonUrlParts.Values.FALSE_INTEGER, true, 1));
            map2.put("generation", new g.a(0, "generation", "INTEGER", CommonUrlParts.Values.FALSE_INTEGER, true, 1));
            map2.put("next_schedule_time_override", new g.a(0, "next_schedule_time_override", "INTEGER", "9223372036854775807", true, 1));
            map2.put("next_schedule_time_override_generation", new g.a(0, "next_schedule_time_override_generation", "INTEGER", CommonUrlParts.Values.FALSE_INTEGER, true, 1));
            map2.put("stop_reason", new g.a(0, "stop_reason", "INTEGER", "-256", true, 1));
            map2.put("required_network_type", new g.a(0, "required_network_type", "INTEGER", null, true, 1));
            map2.put("requires_charging", new g.a(0, "requires_charging", "INTEGER", null, true, 1));
            map2.put("requires_device_idle", new g.a(0, "requires_device_idle", "INTEGER", null, true, 1));
            map2.put("requires_battery_not_low", new g.a(0, "requires_battery_not_low", "INTEGER", null, true, 1));
            map2.put("requires_storage_not_low", new g.a(0, "requires_storage_not_low", "INTEGER", null, true, 1));
            map2.put("trigger_content_update_delay", new g.a(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
            map2.put("trigger_max_content_delay", new g.a(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
            map2.put("content_uri_triggers", new g.a(0, "content_uri_triggers", "BLOB", null, true, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new g.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new g.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            g gVar2 = new g("WorkSpec", map2, hashSet3, hashSet4);
            g gVarA2 = g.a(dVar, "WorkSpec");
            if (!gVar2.equals(gVarA2)) {
                return new n.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gVar2 + "\n Found:\n" + gVarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new g.a(1, "tag", "TEXT", null, true, 1));
            map3.put("work_spec_id", new g.a(2, "work_spec_id", "TEXT", null, true, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new g.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new g.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            g gVar3 = new g("WorkTag", map3, hashSet5, hashSet6);
            g gVarA3 = g.a(dVar, "WorkTag");
            if (!gVar3.equals(gVarA3)) {
                return new n.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gVar3 + "\n Found:\n" + gVarA3);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new g.a(1, "work_spec_id", "TEXT", null, true, 1));
            map4.put("generation", new g.a(2, "generation", "INTEGER", CommonUrlParts.Values.FALSE_INTEGER, true, 1));
            map4.put("system_id", new g.a(0, "system_id", "INTEGER", null, true, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new g.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            g gVar4 = new g("SystemIdInfo", map4, hashSet7, new HashSet(0));
            g gVarA4 = g.a(dVar, "SystemIdInfo");
            if (!gVar4.equals(gVarA4)) {
                return new n.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gVar4 + "\n Found:\n" + gVarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new g.a(1, AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", null, true, 1));
            map5.put("work_spec_id", new g.a(2, "work_spec_id", "TEXT", null, true, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new g.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new g.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            g gVar5 = new g("WorkName", map5, hashSet8, hashSet9);
            g gVarA5 = g.a(dVar, "WorkName");
            if (!gVar5.equals(gVarA5)) {
                return new n.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gVar5 + "\n Found:\n" + gVarA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new g.a(1, "work_spec_id", "TEXT", null, true, 1));
            map6.put("progress", new g.a(0, "progress", "BLOB", null, true, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new g.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
            g gVar6 = new g("WorkProgress", map6, hashSet10, new HashSet(0));
            g gVarA6 = g.a(dVar, "WorkProgress");
            if (!gVar6.equals(gVarA6)) {
                return new n.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + gVar6 + "\n Found:\n" + gVarA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new g.a(1, "key", "TEXT", null, true, 1));
            map7.put("long_value", new g.a(0, "long_value", "INTEGER", null, false, 1));
            g gVar7 = new g("Preference", map7, new HashSet(0), new HashSet(0));
            g gVarA7 = g.a(dVar, "Preference");
            if (gVar7.equals(gVarA7)) {
                return new n.b(true, null);
            }
            return new n.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + gVar7 + "\n Found:\n" + gVarA7);
        }
    }

    @Override // w1.k
    public final c d() {
        return new c(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // w1.k
    public final F1.c f(C5716b c5716b) {
        n nVar = new n(c5716b, new a());
        Context context = c5716b.f47198a;
        l.f(context, "context");
        return c5716b.f47200c.a(new c.b(context, c5716b.f47199b, nVar, false, false));
    }

    @Override // w1.k
    public final List g(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new C1593e(13, 14, 2), new C1594f(), new C1595g(16, 17, 2), new C1596h(17, 18, 1), new C1592d(18, 19, 2), new C1593e());
    }

    @Override // w1.k
    public final Set<Class<Object>> j() {
        return new HashSet();
    }

    @Override // w1.k
    public final Map<Class<?>, List<Class<?>>> k() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(InterfaceC1843x.class, list);
        map.put(InterfaceC1821b.class, list);
        map.put(InterfaceC1818E.class, list);
        map.put(InterfaceC1829j.class, list);
        map.put(InterfaceC1836q.class, list);
        map.put(InterfaceC1839t.class, list);
        map.put(InterfaceC1824e.class, list);
        map.put(InterfaceC1826g.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC1821b s() {
        b bVar;
        if (this.f16900m != null) {
            return this.f16900m;
        }
        synchronized (this) {
            try {
                if (this.f16900m == null) {
                    this.f16900m = new b(this);
                }
                bVar = this.f16900m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC1824e t() {
        B0.f fVar;
        if (this.f16905r != null) {
            return this.f16905r;
        }
        synchronized (this) {
            try {
                if (this.f16905r == null) {
                    this.f16905r = new B0.f(this);
                }
                fVar = this.f16905r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC1826g u() {
        C1827h c1827h;
        if (this.f16906s != null) {
            return this.f16906s;
        }
        synchronized (this) {
            try {
                if (this.f16906s == null) {
                    this.f16906s = new C1827h(this);
                }
                c1827h = this.f16906s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1827h;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC1829j v() {
        C1833n c1833n;
        if (this.f16902o != null) {
            return this.f16902o;
        }
        synchronized (this) {
            try {
                if (this.f16902o == null) {
                    this.f16902o = new C1833n(this);
                }
                c1833n = this.f16902o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1833n;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC1836q w() {
        G g10;
        if (this.f16903p != null) {
            return this.f16903p;
        }
        synchronized (this) {
            try {
                if (this.f16903p == null) {
                    this.f16903p = new G(this);
                }
                g10 = this.f16903p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return g10;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC1839t x() {
        q qVar;
        if (this.f16904q != null) {
            return this.f16904q;
        }
        synchronized (this) {
            try {
                if (this.f16904q == null) {
                    this.f16904q = new q(this);
                }
                qVar = this.f16904q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC1843x y() {
        C1816C c1816c;
        if (this.f16899l != null) {
            return this.f16899l;
        }
        synchronized (this) {
            try {
                if (this.f16899l == null) {
                    this.f16899l = new C1816C(this);
                }
                c1816c = this.f16899l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1816c;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC1818E z() {
        f fVar;
        if (this.f16901n != null) {
            return this.f16901n;
        }
        synchronized (this) {
            try {
                if (this.f16901n == null) {
                    this.f16901n = new f(this);
                }
                fVar = this.f16901n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }
}
