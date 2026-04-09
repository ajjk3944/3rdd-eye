package l2;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import java.util.List;
import l2.p;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f23112a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.a f23113b;

    /* renamed from: c, reason: collision with root package name */
    public final q1.g f23114c;

    /* renamed from: d, reason: collision with root package name */
    public final q1.g f23115d;

    /* renamed from: e, reason: collision with root package name */
    public final q1.g f23116e;

    /* renamed from: f, reason: collision with root package name */
    public final q1.g f23117f;

    /* renamed from: g, reason: collision with root package name */
    public final q1.g f23118g;

    /* renamed from: h, reason: collision with root package name */
    public final q1.g f23119h;

    /* renamed from: i, reason: collision with root package name */
    public final q1.g f23120i;

    /* renamed from: j, reason: collision with root package name */
    public final q1.g f23121j;

    public class a extends q1.a {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // q1.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(u1.f fVar, p pVar) throws Throwable {
            String str = pVar.f23092a;
            if (str == null) {
                fVar.R(1);
            } else {
                fVar.i(1, str);
            }
            fVar.s(2, v.j(pVar.f23093b));
            String str2 = pVar.f23094c;
            if (str2 == null) {
                fVar.R(3);
            } else {
                fVar.i(3, str2);
            }
            String str3 = pVar.f23095d;
            if (str3 == null) {
                fVar.R(4);
            } else {
                fVar.i(4, str3);
            }
            byte[] bArrK = androidx.work.d.k(pVar.f23096e);
            if (bArrK == null) {
                fVar.R(5);
            } else {
                fVar.N(5, bArrK);
            }
            byte[] bArrK2 = androidx.work.d.k(pVar.f23097f);
            if (bArrK2 == null) {
                fVar.R(6);
            } else {
                fVar.N(6, bArrK2);
            }
            fVar.s(7, pVar.f23098g);
            fVar.s(8, pVar.f23099h);
            fVar.s(9, pVar.f23100i);
            fVar.s(10, pVar.f23102k);
            fVar.s(11, v.a(pVar.f23103l));
            fVar.s(12, pVar.f23104m);
            fVar.s(13, pVar.f23105n);
            fVar.s(14, pVar.f23106o);
            fVar.s(15, pVar.f23107p);
            fVar.s(16, pVar.f23108q ? 1L : 0L);
            fVar.s(17, v.i(pVar.f23109r));
            androidx.work.b bVar = pVar.f23101j;
            if (bVar == null) {
                fVar.R(18);
                fVar.R(19);
                fVar.R(20);
                fVar.R(21);
                fVar.R(22);
                fVar.R(23);
                fVar.R(24);
                fVar.R(25);
                return;
            }
            fVar.s(18, v.h(bVar.b()));
            fVar.s(19, bVar.g() ? 1L : 0L);
            fVar.s(20, bVar.h() ? 1L : 0L);
            fVar.s(21, bVar.f() ? 1L : 0L);
            fVar.s(22, bVar.i() ? 1L : 0L);
            fVar.s(23, bVar.c());
            fVar.s(24, bVar.d());
            byte[] bArrC = v.c(bVar.a());
            if (bArrC == null) {
                fVar.R(25);
            } else {
                fVar.N(25, bArrC);
            }
        }
    }

    public class b extends q1.g {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class c extends q1.g {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class d extends q1.g {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    public class e extends q1.g {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public class f extends q1.g {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public class g extends q1.g {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class h extends q1.g {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public class i extends q1.g {
        public i(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // q1.g
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(RoomDatabase roomDatabase) {
        this.f23112a = roomDatabase;
        this.f23113b = new a(roomDatabase);
        this.f23114c = new b(roomDatabase);
        this.f23115d = new c(roomDatabase);
        this.f23116e = new d(roomDatabase);
        this.f23117f = new e(roomDatabase);
        this.f23118g = new f(roomDatabase);
        this.f23119h = new g(roomDatabase);
        this.f23120i = new h(roomDatabase);
        this.f23121j = new i(roomDatabase);
    }

    @Override // l2.q
    public void a(String str) {
        this.f23112a.b();
        u1.f fVarA = this.f23114c.a();
        if (str == null) {
            fVarA.R(1);
        } else {
            fVarA.i(1, str);
        }
        this.f23112a.c();
        try {
            fVarA.z();
            this.f23112a.r();
        } finally {
            this.f23112a.g();
            this.f23114c.f(fVarA);
        }
    }

    @Override // l2.q
    public int b(WorkInfo$State workInfo$State, String... strArr) {
        this.f23112a.b();
        StringBuilder sbB = s1.e.b();
        sbB.append("UPDATE workspec SET state=");
        sbB.append("?");
        sbB.append(" WHERE id IN (");
        s1.e.a(sbB, strArr.length);
        sbB.append(")");
        u1.f fVarD = this.f23112a.d(sbB.toString());
        fVarD.s(1, v.j(workInfo$State));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                fVarD.R(i10);
            } else {
                fVarD.i(i10, str);
            }
            i10++;
        }
        this.f23112a.c();
        try {
            int iZ = fVarD.z();
            this.f23112a.r();
            return iZ;
        } finally {
            this.f23112a.g();
        }
    }

    @Override // l2.q
    public List c(long j10) throws Throwable {
        q1.d dVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        q1.d dVarA = q1.d.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        dVarA.s(1, j10);
        this.f23112a.b();
        Cursor cursorB = s1.c.b(this.f23112a, dVarA, false, null);
        try {
            iB = s1.b.b(cursorB, "required_network_type");
            iB2 = s1.b.b(cursorB, "requires_charging");
            iB3 = s1.b.b(cursorB, "requires_device_idle");
            iB4 = s1.b.b(cursorB, "requires_battery_not_low");
            iB5 = s1.b.b(cursorB, "requires_storage_not_low");
            iB6 = s1.b.b(cursorB, "trigger_content_update_delay");
            iB7 = s1.b.b(cursorB, "trigger_max_content_delay");
            iB8 = s1.b.b(cursorB, "content_uri_triggers");
            iB9 = s1.b.b(cursorB, "id");
            iB10 = s1.b.b(cursorB, "state");
            iB11 = s1.b.b(cursorB, "worker_class_name");
            iB12 = s1.b.b(cursorB, "input_merger_class_name");
            iB13 = s1.b.b(cursorB, "input");
            iB14 = s1.b.b(cursorB, "output");
            dVar = dVarA;
        } catch (Throwable th) {
            th = th;
            dVar = dVarA;
        }
        try {
            int iB15 = s1.b.b(cursorB, "initial_delay");
            int iB16 = s1.b.b(cursorB, "interval_duration");
            int iB17 = s1.b.b(cursorB, "flex_duration");
            int iB18 = s1.b.b(cursorB, "run_attempt_count");
            int iB19 = s1.b.b(cursorB, "backoff_policy");
            int iB20 = s1.b.b(cursorB, "backoff_delay_duration");
            int iB21 = s1.b.b(cursorB, "period_start_time");
            int iB22 = s1.b.b(cursorB, "minimum_retention_duration");
            int iB23 = s1.b.b(cursorB, "schedule_requested_at");
            int iB24 = s1.b.b(cursorB, "run_in_foreground");
            int iB25 = s1.b.b(cursorB, "out_of_quota_policy");
            int i10 = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB9);
                int i11 = iB9;
                String string2 = cursorB.getString(iB11);
                int i12 = iB11;
                androidx.work.b bVar = new androidx.work.b();
                int i13 = iB;
                bVar.k(v.e(cursorB.getInt(iB)));
                bVar.m(cursorB.getInt(iB2) != 0);
                bVar.n(cursorB.getInt(iB3) != 0);
                bVar.l(cursorB.getInt(iB4) != 0);
                bVar.o(cursorB.getInt(iB5) != 0);
                int i14 = iB2;
                int i15 = iB3;
                bVar.p(cursorB.getLong(iB6));
                bVar.q(cursorB.getLong(iB7));
                bVar.j(v.b(cursorB.getBlob(iB8)));
                p pVar = new p(string, string2);
                pVar.f23093b = v.g(cursorB.getInt(iB10));
                pVar.f23095d = cursorB.getString(iB12);
                pVar.f23096e = androidx.work.d.g(cursorB.getBlob(iB13));
                int i16 = i10;
                pVar.f23097f = androidx.work.d.g(cursorB.getBlob(i16));
                int i17 = iB15;
                i10 = i16;
                pVar.f23098g = cursorB.getLong(i17);
                int i18 = iB12;
                int i19 = iB16;
                pVar.f23099h = cursorB.getLong(i19);
                int i20 = iB4;
                int i21 = iB17;
                pVar.f23100i = cursorB.getLong(i21);
                int i22 = iB18;
                pVar.f23102k = cursorB.getInt(i22);
                int i23 = iB19;
                pVar.f23103l = v.d(cursorB.getInt(i23));
                iB17 = i21;
                int i24 = iB20;
                pVar.f23104m = cursorB.getLong(i24);
                int i25 = iB21;
                pVar.f23105n = cursorB.getLong(i25);
                iB21 = i25;
                int i26 = iB22;
                pVar.f23106o = cursorB.getLong(i26);
                int i27 = iB23;
                pVar.f23107p = cursorB.getLong(i27);
                int i28 = iB24;
                pVar.f23108q = cursorB.getInt(i28) != 0;
                int i29 = iB25;
                pVar.f23109r = v.f(cursorB.getInt(i29));
                pVar.f23101j = bVar;
                arrayList.add(pVar);
                iB20 = i24;
                iB4 = i20;
                iB19 = i23;
                iB2 = i14;
                iB25 = i29;
                iB12 = i18;
                iB15 = i17;
                iB16 = i19;
                iB18 = i22;
                iB23 = i27;
                iB9 = i11;
                iB11 = i12;
                iB = i13;
                iB24 = i28;
                iB22 = i26;
                iB3 = i15;
            }
            cursorB.close();
            dVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            dVar.release();
            throw th;
        }
    }

    @Override // l2.q
    public List d() throws Throwable {
        q1.d dVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        q1.d dVarA = q1.d.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f23112a.b();
        Cursor cursorB = s1.c.b(this.f23112a, dVarA, false, null);
        try {
            iB = s1.b.b(cursorB, "required_network_type");
            iB2 = s1.b.b(cursorB, "requires_charging");
            iB3 = s1.b.b(cursorB, "requires_device_idle");
            iB4 = s1.b.b(cursorB, "requires_battery_not_low");
            iB5 = s1.b.b(cursorB, "requires_storage_not_low");
            iB6 = s1.b.b(cursorB, "trigger_content_update_delay");
            iB7 = s1.b.b(cursorB, "trigger_max_content_delay");
            iB8 = s1.b.b(cursorB, "content_uri_triggers");
            iB9 = s1.b.b(cursorB, "id");
            iB10 = s1.b.b(cursorB, "state");
            iB11 = s1.b.b(cursorB, "worker_class_name");
            iB12 = s1.b.b(cursorB, "input_merger_class_name");
            iB13 = s1.b.b(cursorB, "input");
            iB14 = s1.b.b(cursorB, "output");
            dVar = dVarA;
        } catch (Throwable th) {
            th = th;
            dVar = dVarA;
        }
        try {
            int iB15 = s1.b.b(cursorB, "initial_delay");
            int iB16 = s1.b.b(cursorB, "interval_duration");
            int iB17 = s1.b.b(cursorB, "flex_duration");
            int iB18 = s1.b.b(cursorB, "run_attempt_count");
            int iB19 = s1.b.b(cursorB, "backoff_policy");
            int iB20 = s1.b.b(cursorB, "backoff_delay_duration");
            int iB21 = s1.b.b(cursorB, "period_start_time");
            int iB22 = s1.b.b(cursorB, "minimum_retention_duration");
            int iB23 = s1.b.b(cursorB, "schedule_requested_at");
            int iB24 = s1.b.b(cursorB, "run_in_foreground");
            int iB25 = s1.b.b(cursorB, "out_of_quota_policy");
            int i10 = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB9);
                int i11 = iB9;
                String string2 = cursorB.getString(iB11);
                int i12 = iB11;
                androidx.work.b bVar = new androidx.work.b();
                int i13 = iB;
                bVar.k(v.e(cursorB.getInt(iB)));
                bVar.m(cursorB.getInt(iB2) != 0);
                bVar.n(cursorB.getInt(iB3) != 0);
                bVar.l(cursorB.getInt(iB4) != 0);
                bVar.o(cursorB.getInt(iB5) != 0);
                int i14 = iB2;
                int i15 = iB3;
                bVar.p(cursorB.getLong(iB6));
                bVar.q(cursorB.getLong(iB7));
                bVar.j(v.b(cursorB.getBlob(iB8)));
                p pVar = new p(string, string2);
                pVar.f23093b = v.g(cursorB.getInt(iB10));
                pVar.f23095d = cursorB.getString(iB12);
                pVar.f23096e = androidx.work.d.g(cursorB.getBlob(iB13));
                int i16 = i10;
                pVar.f23097f = androidx.work.d.g(cursorB.getBlob(i16));
                i10 = i16;
                int i17 = iB15;
                pVar.f23098g = cursorB.getLong(i17);
                int i18 = iB13;
                int i19 = iB16;
                pVar.f23099h = cursorB.getLong(i19);
                int i20 = iB4;
                int i21 = iB17;
                pVar.f23100i = cursorB.getLong(i21);
                int i22 = iB18;
                pVar.f23102k = cursorB.getInt(i22);
                int i23 = iB19;
                pVar.f23103l = v.d(cursorB.getInt(i23));
                iB17 = i21;
                int i24 = iB20;
                pVar.f23104m = cursorB.getLong(i24);
                int i25 = iB21;
                pVar.f23105n = cursorB.getLong(i25);
                iB21 = i25;
                int i26 = iB22;
                pVar.f23106o = cursorB.getLong(i26);
                int i27 = iB23;
                pVar.f23107p = cursorB.getLong(i27);
                int i28 = iB24;
                pVar.f23108q = cursorB.getInt(i28) != 0;
                int i29 = iB25;
                pVar.f23109r = v.f(cursorB.getInt(i29));
                pVar.f23101j = bVar;
                arrayList.add(pVar);
                iB20 = i24;
                iB4 = i20;
                iB19 = i23;
                iB25 = i29;
                iB2 = i14;
                iB13 = i18;
                iB15 = i17;
                iB16 = i19;
                iB18 = i22;
                iB23 = i27;
                iB9 = i11;
                iB11 = i12;
                iB = i13;
                iB24 = i28;
                iB22 = i26;
                iB3 = i15;
            }
            cursorB.close();
            dVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            dVar.release();
            throw th;
        }
    }

    @Override // l2.q
    public List e(String str) {
        q1.d dVarA = q1.d.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            dVarA.R(1);
        } else {
            dVarA.i(1, str);
        }
        this.f23112a.b();
        Cursor cursorB = s1.c.b(this.f23112a, dVarA, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            dVarA.release();
        }
    }

    @Override // l2.q
    public WorkInfo$State f(String str) {
        q1.d dVarA = q1.d.a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            dVarA.R(1);
        } else {
            dVarA.i(1, str);
        }
        this.f23112a.b();
        Cursor cursorB = s1.c.b(this.f23112a, dVarA, false, null);
        try {
            return cursorB.moveToFirst() ? v.g(cursorB.getInt(0)) : null;
        } finally {
            cursorB.close();
            dVarA.release();
        }
    }

    @Override // l2.q
    public p g(String str) throws Throwable {
        q1.d dVar;
        p pVar;
        q1.d dVarA = q1.d.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            dVarA.R(1);
        } else {
            dVarA.i(1, str);
        }
        this.f23112a.b();
        Cursor cursorB = s1.c.b(this.f23112a, dVarA, false, null);
        try {
            int iB = s1.b.b(cursorB, "required_network_type");
            int iB2 = s1.b.b(cursorB, "requires_charging");
            int iB3 = s1.b.b(cursorB, "requires_device_idle");
            int iB4 = s1.b.b(cursorB, "requires_battery_not_low");
            int iB5 = s1.b.b(cursorB, "requires_storage_not_low");
            int iB6 = s1.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = s1.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = s1.b.b(cursorB, "content_uri_triggers");
            int iB9 = s1.b.b(cursorB, "id");
            int iB10 = s1.b.b(cursorB, "state");
            int iB11 = s1.b.b(cursorB, "worker_class_name");
            int iB12 = s1.b.b(cursorB, "input_merger_class_name");
            int iB13 = s1.b.b(cursorB, "input");
            int iB14 = s1.b.b(cursorB, "output");
            dVar = dVarA;
            try {
                int iB15 = s1.b.b(cursorB, "initial_delay");
                int iB16 = s1.b.b(cursorB, "interval_duration");
                int iB17 = s1.b.b(cursorB, "flex_duration");
                int iB18 = s1.b.b(cursorB, "run_attempt_count");
                int iB19 = s1.b.b(cursorB, "backoff_policy");
                int iB20 = s1.b.b(cursorB, "backoff_delay_duration");
                int iB21 = s1.b.b(cursorB, "period_start_time");
                int iB22 = s1.b.b(cursorB, "minimum_retention_duration");
                int iB23 = s1.b.b(cursorB, "schedule_requested_at");
                int iB24 = s1.b.b(cursorB, "run_in_foreground");
                int iB25 = s1.b.b(cursorB, "out_of_quota_policy");
                if (cursorB.moveToFirst()) {
                    String string = cursorB.getString(iB9);
                    String string2 = cursorB.getString(iB11);
                    androidx.work.b bVar = new androidx.work.b();
                    bVar.k(v.e(cursorB.getInt(iB)));
                    bVar.m(cursorB.getInt(iB2) != 0);
                    bVar.n(cursorB.getInt(iB3) != 0);
                    bVar.l(cursorB.getInt(iB4) != 0);
                    bVar.o(cursorB.getInt(iB5) != 0);
                    bVar.p(cursorB.getLong(iB6));
                    bVar.q(cursorB.getLong(iB7));
                    bVar.j(v.b(cursorB.getBlob(iB8)));
                    p pVar2 = new p(string, string2);
                    pVar2.f23093b = v.g(cursorB.getInt(iB10));
                    pVar2.f23095d = cursorB.getString(iB12);
                    pVar2.f23096e = androidx.work.d.g(cursorB.getBlob(iB13));
                    pVar2.f23097f = androidx.work.d.g(cursorB.getBlob(iB14));
                    pVar2.f23098g = cursorB.getLong(iB15);
                    pVar2.f23099h = cursorB.getLong(iB16);
                    pVar2.f23100i = cursorB.getLong(iB17);
                    pVar2.f23102k = cursorB.getInt(iB18);
                    pVar2.f23103l = v.d(cursorB.getInt(iB19));
                    pVar2.f23104m = cursorB.getLong(iB20);
                    pVar2.f23105n = cursorB.getLong(iB21);
                    pVar2.f23106o = cursorB.getLong(iB22);
                    pVar2.f23107p = cursorB.getLong(iB23);
                    pVar2.f23108q = cursorB.getInt(iB24) != 0;
                    pVar2.f23109r = v.f(cursorB.getInt(iB25));
                    pVar2.f23101j = bVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                cursorB.close();
                dVar.release();
                return pVar;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                dVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dVar = dVarA;
        }
    }

    @Override // l2.q
    public List h(String str) {
        q1.d dVarA = q1.d.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            dVarA.R(1);
        } else {
            dVarA.i(1, str);
        }
        this.f23112a.b();
        Cursor cursorB = s1.c.b(this.f23112a, dVarA, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            dVarA.release();
        }
    }

    @Override // l2.q
    public List i(String str) {
        q1.d dVarA = q1.d.a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            dVarA.R(1);
        } else {
            dVarA.i(1, str);
        }
        this.f23112a.b();
        Cursor cursorB = s1.c.b(this.f23112a, dVarA, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(androidx.work.d.g(cursorB.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorB.close();
            dVarA.release();
        }
    }

    @Override // l2.q
    public List j(int i10) throws Throwable {
        q1.d dVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        q1.d dVarA = q1.d.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        dVarA.s(1, i10);
        this.f23112a.b();
        Cursor cursorB = s1.c.b(this.f23112a, dVarA, false, null);
        try {
            iB = s1.b.b(cursorB, "required_network_type");
            iB2 = s1.b.b(cursorB, "requires_charging");
            iB3 = s1.b.b(cursorB, "requires_device_idle");
            iB4 = s1.b.b(cursorB, "requires_battery_not_low");
            iB5 = s1.b.b(cursorB, "requires_storage_not_low");
            iB6 = s1.b.b(cursorB, "trigger_content_update_delay");
            iB7 = s1.b.b(cursorB, "trigger_max_content_delay");
            iB8 = s1.b.b(cursorB, "content_uri_triggers");
            iB9 = s1.b.b(cursorB, "id");
            iB10 = s1.b.b(cursorB, "state");
            iB11 = s1.b.b(cursorB, "worker_class_name");
            iB12 = s1.b.b(cursorB, "input_merger_class_name");
            iB13 = s1.b.b(cursorB, "input");
            iB14 = s1.b.b(cursorB, "output");
            dVar = dVarA;
        } catch (Throwable th) {
            th = th;
            dVar = dVarA;
        }
        try {
            int iB15 = s1.b.b(cursorB, "initial_delay");
            int iB16 = s1.b.b(cursorB, "interval_duration");
            int iB17 = s1.b.b(cursorB, "flex_duration");
            int iB18 = s1.b.b(cursorB, "run_attempt_count");
            int iB19 = s1.b.b(cursorB, "backoff_policy");
            int iB20 = s1.b.b(cursorB, "backoff_delay_duration");
            int iB21 = s1.b.b(cursorB, "period_start_time");
            int iB22 = s1.b.b(cursorB, "minimum_retention_duration");
            int iB23 = s1.b.b(cursorB, "schedule_requested_at");
            int iB24 = s1.b.b(cursorB, "run_in_foreground");
            int iB25 = s1.b.b(cursorB, "out_of_quota_policy");
            int i11 = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB9);
                int i12 = iB9;
                String string2 = cursorB.getString(iB11);
                int i13 = iB11;
                androidx.work.b bVar = new androidx.work.b();
                int i14 = iB;
                bVar.k(v.e(cursorB.getInt(iB)));
                bVar.m(cursorB.getInt(iB2) != 0);
                bVar.n(cursorB.getInt(iB3) != 0);
                bVar.l(cursorB.getInt(iB4) != 0);
                bVar.o(cursorB.getInt(iB5) != 0);
                int i15 = iB2;
                int i16 = iB3;
                bVar.p(cursorB.getLong(iB6));
                bVar.q(cursorB.getLong(iB7));
                bVar.j(v.b(cursorB.getBlob(iB8)));
                p pVar = new p(string, string2);
                pVar.f23093b = v.g(cursorB.getInt(iB10));
                pVar.f23095d = cursorB.getString(iB12);
                pVar.f23096e = androidx.work.d.g(cursorB.getBlob(iB13));
                int i17 = i11;
                pVar.f23097f = androidx.work.d.g(cursorB.getBlob(i17));
                i11 = i17;
                int i18 = iB15;
                pVar.f23098g = cursorB.getLong(i18);
                int i19 = iB12;
                int i20 = iB16;
                pVar.f23099h = cursorB.getLong(i20);
                int i21 = iB4;
                int i22 = iB17;
                pVar.f23100i = cursorB.getLong(i22);
                int i23 = iB18;
                pVar.f23102k = cursorB.getInt(i23);
                int i24 = iB19;
                pVar.f23103l = v.d(cursorB.getInt(i24));
                iB17 = i22;
                int i25 = iB20;
                pVar.f23104m = cursorB.getLong(i25);
                int i26 = iB21;
                pVar.f23105n = cursorB.getLong(i26);
                iB21 = i26;
                int i27 = iB22;
                pVar.f23106o = cursorB.getLong(i27);
                int i28 = iB23;
                pVar.f23107p = cursorB.getLong(i28);
                int i29 = iB24;
                pVar.f23108q = cursorB.getInt(i29) != 0;
                int i30 = iB25;
                pVar.f23109r = v.f(cursorB.getInt(i30));
                pVar.f23101j = bVar;
                arrayList.add(pVar);
                iB20 = i25;
                iB4 = i21;
                iB19 = i24;
                iB25 = i30;
                iB2 = i15;
                iB12 = i19;
                iB15 = i18;
                iB16 = i20;
                iB18 = i23;
                iB23 = i28;
                iB9 = i12;
                iB11 = i13;
                iB = i14;
                iB24 = i29;
                iB22 = i27;
                iB3 = i16;
            }
            cursorB.close();
            dVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            dVar.release();
            throw th;
        }
    }

    @Override // l2.q
    public int k() {
        this.f23112a.b();
        u1.f fVarA = this.f23120i.a();
        this.f23112a.c();
        try {
            int iZ = fVarA.z();
            this.f23112a.r();
            return iZ;
        } finally {
            this.f23112a.g();
            this.f23120i.f(fVarA);
        }
    }

    @Override // l2.q
    public int l(String str, long j10) {
        this.f23112a.b();
        u1.f fVarA = this.f23119h.a();
        fVarA.s(1, j10);
        if (str == null) {
            fVarA.R(2);
        } else {
            fVarA.i(2, str);
        }
        this.f23112a.c();
        try {
            int iZ = fVarA.z();
            this.f23112a.r();
            return iZ;
        } finally {
            this.f23112a.g();
            this.f23119h.f(fVarA);
        }
    }

    @Override // l2.q
    public List m(String str) {
        q1.d dVarA = q1.d.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            dVarA.R(1);
        } else {
            dVarA.i(1, str);
        }
        this.f23112a.b();
        Cursor cursorB = s1.c.b(this.f23112a, dVarA, false, null);
        try {
            int iB = s1.b.b(cursorB, "id");
            int iB2 = s1.b.b(cursorB, "state");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f23110a = cursorB.getString(iB);
                bVar.f23111b = v.g(cursorB.getInt(iB2));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            cursorB.close();
            dVarA.release();
        }
    }

    @Override // l2.q
    public List n(int i10) throws Throwable {
        q1.d dVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        q1.d dVarA = q1.d.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        dVarA.s(1, i10);
        this.f23112a.b();
        Cursor cursorB = s1.c.b(this.f23112a, dVarA, false, null);
        try {
            iB = s1.b.b(cursorB, "required_network_type");
            iB2 = s1.b.b(cursorB, "requires_charging");
            iB3 = s1.b.b(cursorB, "requires_device_idle");
            iB4 = s1.b.b(cursorB, "requires_battery_not_low");
            iB5 = s1.b.b(cursorB, "requires_storage_not_low");
            iB6 = s1.b.b(cursorB, "trigger_content_update_delay");
            iB7 = s1.b.b(cursorB, "trigger_max_content_delay");
            iB8 = s1.b.b(cursorB, "content_uri_triggers");
            iB9 = s1.b.b(cursorB, "id");
            iB10 = s1.b.b(cursorB, "state");
            iB11 = s1.b.b(cursorB, "worker_class_name");
            iB12 = s1.b.b(cursorB, "input_merger_class_name");
            iB13 = s1.b.b(cursorB, "input");
            iB14 = s1.b.b(cursorB, "output");
            dVar = dVarA;
        } catch (Throwable th) {
            th = th;
            dVar = dVarA;
        }
        try {
            int iB15 = s1.b.b(cursorB, "initial_delay");
            int iB16 = s1.b.b(cursorB, "interval_duration");
            int iB17 = s1.b.b(cursorB, "flex_duration");
            int iB18 = s1.b.b(cursorB, "run_attempt_count");
            int iB19 = s1.b.b(cursorB, "backoff_policy");
            int iB20 = s1.b.b(cursorB, "backoff_delay_duration");
            int iB21 = s1.b.b(cursorB, "period_start_time");
            int iB22 = s1.b.b(cursorB, "minimum_retention_duration");
            int iB23 = s1.b.b(cursorB, "schedule_requested_at");
            int iB24 = s1.b.b(cursorB, "run_in_foreground");
            int iB25 = s1.b.b(cursorB, "out_of_quota_policy");
            int i11 = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB9);
                int i12 = iB9;
                String string2 = cursorB.getString(iB11);
                int i13 = iB11;
                androidx.work.b bVar = new androidx.work.b();
                int i14 = iB;
                bVar.k(v.e(cursorB.getInt(iB)));
                bVar.m(cursorB.getInt(iB2) != 0);
                bVar.n(cursorB.getInt(iB3) != 0);
                bVar.l(cursorB.getInt(iB4) != 0);
                bVar.o(cursorB.getInt(iB5) != 0);
                int i15 = iB2;
                int i16 = iB3;
                bVar.p(cursorB.getLong(iB6));
                bVar.q(cursorB.getLong(iB7));
                bVar.j(v.b(cursorB.getBlob(iB8)));
                p pVar = new p(string, string2);
                pVar.f23093b = v.g(cursorB.getInt(iB10));
                pVar.f23095d = cursorB.getString(iB12);
                pVar.f23096e = androidx.work.d.g(cursorB.getBlob(iB13));
                int i17 = i11;
                pVar.f23097f = androidx.work.d.g(cursorB.getBlob(i17));
                i11 = i17;
                int i18 = iB15;
                pVar.f23098g = cursorB.getLong(i18);
                int i19 = iB12;
                int i20 = iB16;
                pVar.f23099h = cursorB.getLong(i20);
                int i21 = iB4;
                int i22 = iB17;
                pVar.f23100i = cursorB.getLong(i22);
                int i23 = iB18;
                pVar.f23102k = cursorB.getInt(i23);
                int i24 = iB19;
                pVar.f23103l = v.d(cursorB.getInt(i24));
                iB17 = i22;
                int i25 = iB20;
                pVar.f23104m = cursorB.getLong(i25);
                int i26 = iB21;
                pVar.f23105n = cursorB.getLong(i26);
                iB21 = i26;
                int i27 = iB22;
                pVar.f23106o = cursorB.getLong(i27);
                int i28 = iB23;
                pVar.f23107p = cursorB.getLong(i28);
                int i29 = iB24;
                pVar.f23108q = cursorB.getInt(i29) != 0;
                int i30 = iB25;
                pVar.f23109r = v.f(cursorB.getInt(i30));
                pVar.f23101j = bVar;
                arrayList.add(pVar);
                iB20 = i25;
                iB4 = i21;
                iB19 = i24;
                iB25 = i30;
                iB2 = i15;
                iB12 = i19;
                iB15 = i18;
                iB16 = i20;
                iB18 = i23;
                iB23 = i28;
                iB9 = i12;
                iB11 = i13;
                iB = i14;
                iB24 = i29;
                iB22 = i27;
                iB3 = i16;
            }
            cursorB.close();
            dVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            dVar.release();
            throw th;
        }
    }

    @Override // l2.q
    public void o(String str, androidx.work.d dVar) throws Throwable {
        this.f23112a.b();
        u1.f fVarA = this.f23115d.a();
        byte[] bArrK = androidx.work.d.k(dVar);
        if (bArrK == null) {
            fVarA.R(1);
        } else {
            fVarA.N(1, bArrK);
        }
        if (str == null) {
            fVarA.R(2);
        } else {
            fVarA.i(2, str);
        }
        this.f23112a.c();
        try {
            fVarA.z();
            this.f23112a.r();
        } finally {
            this.f23112a.g();
            this.f23115d.f(fVarA);
        }
    }

    @Override // l2.q
    public void p(p pVar) {
        this.f23112a.b();
        this.f23112a.c();
        try {
            this.f23113b.h(pVar);
            this.f23112a.r();
        } finally {
            this.f23112a.g();
        }
    }

    @Override // l2.q
    public List q() throws Throwable {
        q1.d dVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        q1.d dVarA = q1.d.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f23112a.b();
        Cursor cursorB = s1.c.b(this.f23112a, dVarA, false, null);
        try {
            iB = s1.b.b(cursorB, "required_network_type");
            iB2 = s1.b.b(cursorB, "requires_charging");
            iB3 = s1.b.b(cursorB, "requires_device_idle");
            iB4 = s1.b.b(cursorB, "requires_battery_not_low");
            iB5 = s1.b.b(cursorB, "requires_storage_not_low");
            iB6 = s1.b.b(cursorB, "trigger_content_update_delay");
            iB7 = s1.b.b(cursorB, "trigger_max_content_delay");
            iB8 = s1.b.b(cursorB, "content_uri_triggers");
            iB9 = s1.b.b(cursorB, "id");
            iB10 = s1.b.b(cursorB, "state");
            iB11 = s1.b.b(cursorB, "worker_class_name");
            iB12 = s1.b.b(cursorB, "input_merger_class_name");
            iB13 = s1.b.b(cursorB, "input");
            iB14 = s1.b.b(cursorB, "output");
            dVar = dVarA;
        } catch (Throwable th) {
            th = th;
            dVar = dVarA;
        }
        try {
            int iB15 = s1.b.b(cursorB, "initial_delay");
            int iB16 = s1.b.b(cursorB, "interval_duration");
            int iB17 = s1.b.b(cursorB, "flex_duration");
            int iB18 = s1.b.b(cursorB, "run_attempt_count");
            int iB19 = s1.b.b(cursorB, "backoff_policy");
            int iB20 = s1.b.b(cursorB, "backoff_delay_duration");
            int iB21 = s1.b.b(cursorB, "period_start_time");
            int iB22 = s1.b.b(cursorB, "minimum_retention_duration");
            int iB23 = s1.b.b(cursorB, "schedule_requested_at");
            int iB24 = s1.b.b(cursorB, "run_in_foreground");
            int iB25 = s1.b.b(cursorB, "out_of_quota_policy");
            int i10 = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB9);
                int i11 = iB9;
                String string2 = cursorB.getString(iB11);
                int i12 = iB11;
                androidx.work.b bVar = new androidx.work.b();
                int i13 = iB;
                bVar.k(v.e(cursorB.getInt(iB)));
                bVar.m(cursorB.getInt(iB2) != 0);
                bVar.n(cursorB.getInt(iB3) != 0);
                bVar.l(cursorB.getInt(iB4) != 0);
                bVar.o(cursorB.getInt(iB5) != 0);
                int i14 = iB2;
                int i15 = iB3;
                bVar.p(cursorB.getLong(iB6));
                bVar.q(cursorB.getLong(iB7));
                bVar.j(v.b(cursorB.getBlob(iB8)));
                p pVar = new p(string, string2);
                pVar.f23093b = v.g(cursorB.getInt(iB10));
                pVar.f23095d = cursorB.getString(iB12);
                pVar.f23096e = androidx.work.d.g(cursorB.getBlob(iB13));
                int i16 = i10;
                pVar.f23097f = androidx.work.d.g(cursorB.getBlob(i16));
                i10 = i16;
                int i17 = iB15;
                pVar.f23098g = cursorB.getLong(i17);
                int i18 = iB13;
                int i19 = iB16;
                pVar.f23099h = cursorB.getLong(i19);
                int i20 = iB4;
                int i21 = iB17;
                pVar.f23100i = cursorB.getLong(i21);
                int i22 = iB18;
                pVar.f23102k = cursorB.getInt(i22);
                int i23 = iB19;
                pVar.f23103l = v.d(cursorB.getInt(i23));
                iB17 = i21;
                int i24 = iB20;
                pVar.f23104m = cursorB.getLong(i24);
                int i25 = iB21;
                pVar.f23105n = cursorB.getLong(i25);
                iB21 = i25;
                int i26 = iB22;
                pVar.f23106o = cursorB.getLong(i26);
                int i27 = iB23;
                pVar.f23107p = cursorB.getLong(i27);
                int i28 = iB24;
                pVar.f23108q = cursorB.getInt(i28) != 0;
                int i29 = iB25;
                pVar.f23109r = v.f(cursorB.getInt(i29));
                pVar.f23101j = bVar;
                arrayList.add(pVar);
                iB20 = i24;
                iB4 = i20;
                iB19 = i23;
                iB25 = i29;
                iB2 = i14;
                iB13 = i18;
                iB15 = i17;
                iB16 = i19;
                iB18 = i22;
                iB23 = i27;
                iB9 = i11;
                iB11 = i12;
                iB = i13;
                iB24 = i28;
                iB22 = i26;
                iB3 = i15;
            }
            cursorB.close();
            dVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            dVar.release();
            throw th;
        }
    }

    @Override // l2.q
    public boolean r() {
        boolean z10 = false;
        q1.d dVarA = q1.d.a("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f23112a.b();
        Cursor cursorB = s1.c.b(this.f23112a, dVarA, false, null);
        try {
            if (cursorB.moveToFirst()) {
                if (cursorB.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            cursorB.close();
            dVarA.release();
        }
    }

    @Override // l2.q
    public int s(String str) {
        this.f23112a.b();
        u1.f fVarA = this.f23118g.a();
        if (str == null) {
            fVarA.R(1);
        } else {
            fVarA.i(1, str);
        }
        this.f23112a.c();
        try {
            int iZ = fVarA.z();
            this.f23112a.r();
            return iZ;
        } finally {
            this.f23112a.g();
            this.f23118g.f(fVarA);
        }
    }

    @Override // l2.q
    public int t(String str) {
        this.f23112a.b();
        u1.f fVarA = this.f23117f.a();
        if (str == null) {
            fVarA.R(1);
        } else {
            fVarA.i(1, str);
        }
        this.f23112a.c();
        try {
            int iZ = fVarA.z();
            this.f23112a.r();
            return iZ;
        } finally {
            this.f23112a.g();
            this.f23117f.f(fVarA);
        }
    }

    @Override // l2.q
    public void u(String str, long j10) {
        this.f23112a.b();
        u1.f fVarA = this.f23116e.a();
        fVarA.s(1, j10);
        if (str == null) {
            fVarA.R(2);
        } else {
            fVarA.i(2, str);
        }
        this.f23112a.c();
        try {
            fVarA.z();
            this.f23112a.r();
        } finally {
            this.f23112a.g();
            this.f23116e.f(fVarA);
        }
    }
}
