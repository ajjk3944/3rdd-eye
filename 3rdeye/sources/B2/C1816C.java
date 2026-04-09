package b2;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.t;
import b2.C1842w;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: WorkSpecDao_Impl.java */
/* renamed from: b2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1816C implements InterfaceC1843x {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f17092a;

    /* renamed from: b, reason: collision with root package name */
    public final C1814A f17093b;

    /* renamed from: c, reason: collision with root package name */
    public final C1815B f17094c;

    /* renamed from: d, reason: collision with root package name */
    public final C1845z f17095d;

    /* renamed from: e, reason: collision with root package name */
    public final C1831l f17096e;

    /* renamed from: f, reason: collision with root package name */
    public final C1832m f17097f;

    /* renamed from: g, reason: collision with root package name */
    public final C1840u f17098g;

    /* renamed from: h, reason: collision with root package name */
    public final C1844y f17099h;
    public final C1845z i;

    /* renamed from: j, reason: collision with root package name */
    public final C1831l f17100j;

    /* renamed from: k, reason: collision with root package name */
    public final C1832m f17101k;

    /* renamed from: l, reason: collision with root package name */
    public final C1844y f17102l;

    /* renamed from: m, reason: collision with root package name */
    public final C1845z f17103m;

    /* renamed from: n, reason: collision with root package name */
    public final C1831l f17104n;

    /* renamed from: o, reason: collision with root package name */
    public final C1844y f17105o;

    public C1816C(WorkDatabase_Impl workDatabase_Impl) {
        this.f17092a = workDatabase_Impl;
        this.f17093b = new C1814A(workDatabase_Impl);
        this.f17094c = new C1815B(workDatabase_Impl);
        this.f17095d = new C1845z(workDatabase_Impl, 1);
        this.f17096e = new C1831l(workDatabase_Impl, 2);
        this.f17097f = new C1832m(workDatabase_Impl, 4);
        this.f17098g = new C1840u(workDatabase_Impl, 3);
        this.f17099h = new C1844y(workDatabase_Impl, 2);
        this.i = new C1845z(workDatabase_Impl, 2);
        this.f17100j = new C1831l(workDatabase_Impl, 3);
        this.f17101k = new C1832m(workDatabase_Impl, 2);
        new C1840u(workDatabase_Impl, 1);
        this.f17102l = new C1844y(workDatabase_Impl, 0);
        this.f17103m = new C1845z(workDatabase_Impl, 0);
        this.f17104n = new C1831l(workDatabase_Impl, 1);
        new C1832m(workDatabase_Impl, 3);
        new C1840u(workDatabase_Impl, 2);
        this.f17105o = new C1844y(workDatabase_Impl, 1);
    }

    @Override // b2.InterfaceC1843x
    public final void A(C1842w c1842w) {
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f17093b.j(c1842w);
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
        }
    }

    @Override // b2.InterfaceC1843x
    public final int B() throws IOException {
        w1.o oVarD = w1.o.d(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            return cursorY.moveToFirst() ? cursorY.getInt(0) : 0;
        } finally {
            cursorY.close();
            oVarD.release();
        }
    }

    @Override // b2.InterfaceC1843x
    public final int C() {
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        C1831l c1831l = this.f17104n;
        F1.f fVarC = c1831l.c();
        workDatabase_Impl.c();
        try {
            int iG = fVarC.G();
            workDatabase_Impl.r();
            return iG;
        } finally {
            workDatabase_Impl.n();
            c1831l.h(fVarC);
        }
    }

    @Override // b2.InterfaceC1843x
    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        C1845z c1845z = this.f17095d;
        F1.f fVarC = c1845z.c();
        if (str == null) {
            fVarC.f(1);
        } else {
            fVarC.h(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarC.G();
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
            c1845z.h(fVarC);
        }
    }

    @Override // b2.InterfaceC1843x
    public final ArrayList b() throws Throwable {
        w1.o oVar;
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
        w1.o oVarD = w1.o.d(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        oVarD.b(1, 200);
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            iB = C1.a.b(cursorY, FacebookMediationAdapter.KEY_ID);
            iB2 = C1.a.b(cursorY, "state");
            iB3 = C1.a.b(cursorY, "worker_class_name");
            iB4 = C1.a.b(cursorY, "input_merger_class_name");
            iB5 = C1.a.b(cursorY, "input");
            iB6 = C1.a.b(cursorY, "output");
            iB7 = C1.a.b(cursorY, "initial_delay");
            iB8 = C1.a.b(cursorY, "interval_duration");
            iB9 = C1.a.b(cursorY, "flex_duration");
            iB10 = C1.a.b(cursorY, "run_attempt_count");
            iB11 = C1.a.b(cursorY, "backoff_policy");
            iB12 = C1.a.b(cursorY, "backoff_delay_duration");
            iB13 = C1.a.b(cursorY, "last_enqueue_time");
            oVar = oVarD;
        } catch (Throwable th) {
            th = th;
            oVar = oVarD;
        }
        try {
            int iB14 = C1.a.b(cursorY, "minimum_retention_duration");
            int iB15 = C1.a.b(cursorY, "schedule_requested_at");
            int iB16 = C1.a.b(cursorY, "run_in_foreground");
            int iB17 = C1.a.b(cursorY, "out_of_quota_policy");
            int iB18 = C1.a.b(cursorY, "period_count");
            int iB19 = C1.a.b(cursorY, "generation");
            int iB20 = C1.a.b(cursorY, "next_schedule_time_override");
            int iB21 = C1.a.b(cursorY, "next_schedule_time_override_generation");
            int iB22 = C1.a.b(cursorY, "stop_reason");
            int iB23 = C1.a.b(cursorY, "required_network_type");
            int iB24 = C1.a.b(cursorY, "requires_charging");
            int iB25 = C1.a.b(cursorY, "requires_device_idle");
            int iB26 = C1.a.b(cursorY, "requires_battery_not_low");
            int iB27 = C1.a.b(cursorY, "requires_storage_not_low");
            int iB28 = C1.a.b(cursorY, "trigger_content_update_delay");
            int iB29 = C1.a.b(cursorY, "trigger_max_content_delay");
            int iB30 = C1.a.b(cursorY, "content_uri_triggers");
            int i = iB14;
            ArrayList arrayList = new ArrayList(cursorY.getCount());
            while (cursorY.moveToNext()) {
                byte[] blob = null;
                String string = cursorY.isNull(iB) ? null : cursorY.getString(iB);
                t.b bVarF = C1819F.f(cursorY.getInt(iB2));
                String string2 = cursorY.isNull(iB3) ? null : cursorY.getString(iB3);
                String string3 = cursorY.isNull(iB4) ? null : cursorY.getString(iB4);
                androidx.work.e eVarG = androidx.work.e.g(cursorY.isNull(iB5) ? null : cursorY.getBlob(iB5));
                androidx.work.e eVarG2 = androidx.work.e.g(cursorY.isNull(iB6) ? null : cursorY.getBlob(iB6));
                long j4 = cursorY.getLong(iB7);
                long j10 = cursorY.getLong(iB8);
                long j11 = cursorY.getLong(iB9);
                int i10 = cursorY.getInt(iB10);
                androidx.work.a aVarC = C1819F.c(cursorY.getInt(iB11));
                long j12 = cursorY.getLong(iB12);
                long j13 = cursorY.getLong(iB13);
                int i11 = i;
                long j14 = cursorY.getLong(i11);
                int i12 = iB;
                int i13 = iB15;
                long j15 = cursorY.getLong(i13);
                iB15 = i13;
                int i14 = iB16;
                boolean z10 = cursorY.getInt(i14) != 0;
                iB16 = i14;
                int i15 = iB17;
                androidx.work.r rVarE = C1819F.e(cursorY.getInt(i15));
                iB17 = i15;
                int i16 = iB18;
                int i17 = cursorY.getInt(i16);
                iB18 = i16;
                int i18 = iB19;
                int i19 = cursorY.getInt(i18);
                iB19 = i18;
                int i20 = iB20;
                long j16 = cursorY.getLong(i20);
                iB20 = i20;
                int i21 = iB21;
                int i22 = cursorY.getInt(i21);
                iB21 = i21;
                int i23 = iB22;
                int i24 = cursorY.getInt(i23);
                iB22 = i23;
                int i25 = iB23;
                androidx.work.n nVarD = C1819F.d(cursorY.getInt(i25));
                iB23 = i25;
                int i26 = iB24;
                boolean z11 = cursorY.getInt(i26) != 0;
                iB24 = i26;
                int i27 = iB25;
                boolean z12 = cursorY.getInt(i27) != 0;
                iB25 = i27;
                int i28 = iB26;
                boolean z13 = cursorY.getInt(i28) != 0;
                iB26 = i28;
                int i29 = iB27;
                boolean z14 = cursorY.getInt(i29) != 0;
                iB27 = i29;
                int i30 = iB28;
                long j17 = cursorY.getLong(i30);
                iB28 = i30;
                int i31 = iB29;
                long j18 = cursorY.getLong(i31);
                iB29 = i31;
                int i32 = iB30;
                if (!cursorY.isNull(i32)) {
                    blob = cursorY.getBlob(i32);
                }
                iB30 = i32;
                arrayList.add(new C1842w(string, bVarF, string2, string3, eVarG, eVarG2, j4, j10, j11, new androidx.work.d(nVarD, z11, z12, z13, z14, j17, j18, C1819F.b(blob)), i10, aVarC, j12, j13, j14, j15, z10, rVarE, i17, i19, j16, i22, i24));
                iB = i12;
                i = i11;
            }
            cursorY.close();
            oVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorY.close();
            oVar.release();
            throw th;
        }
    }

    @Override // b2.InterfaceC1843x
    public final void c(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        C1840u c1840u = this.f17098g;
        F1.f fVarC = c1840u.c();
        if (str == null) {
            fVarC.f(1);
        } else {
            fVarC.h(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarC.G();
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
            c1840u.h(fVarC);
        }
    }

    @Override // b2.InterfaceC1843x
    public final int d(long j4, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        C1845z c1845z = this.f17103m;
        F1.f fVarC = c1845z.c();
        fVarC.b(1, j4);
        if (str == null) {
            fVarC.f(2);
        } else {
            fVarC.h(2, str);
        }
        workDatabase_Impl.c();
        try {
            int iG = fVarC.G();
            workDatabase_Impl.r();
            return iG;
        } finally {
            workDatabase_Impl.n();
            c1845z.h(fVarC);
        }
    }

    @Override // b2.InterfaceC1843x
    public final ArrayList e(String str) throws IOException {
        w1.o oVarD = w1.o.d(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            oVarD.f(1);
        } else {
            oVarD.h(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            ArrayList arrayList = new ArrayList(cursorY.getCount());
            while (cursorY.moveToNext()) {
                String id = cursorY.isNull(0) ? null : cursorY.getString(0);
                t.b state = C1819F.f(cursorY.getInt(1));
                kotlin.jvm.internal.l.f(id, "id");
                kotlin.jvm.internal.l.f(state, "state");
                C1842w.b bVar = new C1842w.b();
                bVar.f17160a = id;
                bVar.f17161b = state;
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            cursorY.close();
            oVarD.release();
        }
    }

    @Override // b2.InterfaceC1843x
    public final ArrayList f(long j4) throws Throwable {
        w1.o oVar;
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
        w1.o oVarD = w1.o.d(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        oVarD.b(1, j4);
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            iB = C1.a.b(cursorY, FacebookMediationAdapter.KEY_ID);
            iB2 = C1.a.b(cursorY, "state");
            iB3 = C1.a.b(cursorY, "worker_class_name");
            iB4 = C1.a.b(cursorY, "input_merger_class_name");
            iB5 = C1.a.b(cursorY, "input");
            iB6 = C1.a.b(cursorY, "output");
            iB7 = C1.a.b(cursorY, "initial_delay");
            iB8 = C1.a.b(cursorY, "interval_duration");
            iB9 = C1.a.b(cursorY, "flex_duration");
            iB10 = C1.a.b(cursorY, "run_attempt_count");
            iB11 = C1.a.b(cursorY, "backoff_policy");
            iB12 = C1.a.b(cursorY, "backoff_delay_duration");
            iB13 = C1.a.b(cursorY, "last_enqueue_time");
            oVar = oVarD;
        } catch (Throwable th) {
            th = th;
            oVar = oVarD;
        }
        try {
            int iB14 = C1.a.b(cursorY, "minimum_retention_duration");
            int iB15 = C1.a.b(cursorY, "schedule_requested_at");
            int iB16 = C1.a.b(cursorY, "run_in_foreground");
            int iB17 = C1.a.b(cursorY, "out_of_quota_policy");
            int iB18 = C1.a.b(cursorY, "period_count");
            int iB19 = C1.a.b(cursorY, "generation");
            int iB20 = C1.a.b(cursorY, "next_schedule_time_override");
            int iB21 = C1.a.b(cursorY, "next_schedule_time_override_generation");
            int iB22 = C1.a.b(cursorY, "stop_reason");
            int iB23 = C1.a.b(cursorY, "required_network_type");
            int iB24 = C1.a.b(cursorY, "requires_charging");
            int iB25 = C1.a.b(cursorY, "requires_device_idle");
            int iB26 = C1.a.b(cursorY, "requires_battery_not_low");
            int iB27 = C1.a.b(cursorY, "requires_storage_not_low");
            int iB28 = C1.a.b(cursorY, "trigger_content_update_delay");
            int iB29 = C1.a.b(cursorY, "trigger_max_content_delay");
            int iB30 = C1.a.b(cursorY, "content_uri_triggers");
            int i = iB14;
            ArrayList arrayList = new ArrayList(cursorY.getCount());
            while (cursorY.moveToNext()) {
                byte[] blob = null;
                String string = cursorY.isNull(iB) ? null : cursorY.getString(iB);
                t.b bVarF = C1819F.f(cursorY.getInt(iB2));
                String string2 = cursorY.isNull(iB3) ? null : cursorY.getString(iB3);
                String string3 = cursorY.isNull(iB4) ? null : cursorY.getString(iB4);
                androidx.work.e eVarG = androidx.work.e.g(cursorY.isNull(iB5) ? null : cursorY.getBlob(iB5));
                androidx.work.e eVarG2 = androidx.work.e.g(cursorY.isNull(iB6) ? null : cursorY.getBlob(iB6));
                long j10 = cursorY.getLong(iB7);
                long j11 = cursorY.getLong(iB8);
                long j12 = cursorY.getLong(iB9);
                int i10 = cursorY.getInt(iB10);
                androidx.work.a aVarC = C1819F.c(cursorY.getInt(iB11));
                long j13 = cursorY.getLong(iB12);
                long j14 = cursorY.getLong(iB13);
                int i11 = i;
                long j15 = cursorY.getLong(i11);
                int i12 = iB;
                int i13 = iB15;
                long j16 = cursorY.getLong(i13);
                iB15 = i13;
                int i14 = iB16;
                boolean z10 = cursorY.getInt(i14) != 0;
                iB16 = i14;
                int i15 = iB17;
                androidx.work.r rVarE = C1819F.e(cursorY.getInt(i15));
                iB17 = i15;
                int i16 = iB18;
                int i17 = cursorY.getInt(i16);
                iB18 = i16;
                int i18 = iB19;
                int i19 = cursorY.getInt(i18);
                iB19 = i18;
                int i20 = iB20;
                long j17 = cursorY.getLong(i20);
                iB20 = i20;
                int i21 = iB21;
                int i22 = cursorY.getInt(i21);
                iB21 = i21;
                int i23 = iB22;
                int i24 = cursorY.getInt(i23);
                iB22 = i23;
                int i25 = iB23;
                androidx.work.n nVarD = C1819F.d(cursorY.getInt(i25));
                iB23 = i25;
                int i26 = iB24;
                boolean z11 = cursorY.getInt(i26) != 0;
                iB24 = i26;
                int i27 = iB25;
                boolean z12 = cursorY.getInt(i27) != 0;
                iB25 = i27;
                int i28 = iB26;
                boolean z13 = cursorY.getInt(i28) != 0;
                iB26 = i28;
                int i29 = iB27;
                boolean z14 = cursorY.getInt(i29) != 0;
                iB27 = i29;
                int i30 = iB28;
                long j18 = cursorY.getLong(i30);
                iB28 = i30;
                int i31 = iB29;
                long j19 = cursorY.getLong(i31);
                iB29 = i31;
                int i32 = iB30;
                if (!cursorY.isNull(i32)) {
                    blob = cursorY.getBlob(i32);
                }
                iB30 = i32;
                arrayList.add(new C1842w(string, bVarF, string2, string3, eVarG, eVarG2, j10, j11, j12, new androidx.work.d(nVarD, z11, z12, z13, z14, j18, j19, C1819F.b(blob)), i10, aVarC, j13, j14, j15, j16, z10, rVarE, i17, i19, j17, i22, i24));
                iB = i12;
                i = i11;
            }
            cursorY.close();
            oVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorY.close();
            oVar.release();
            throw th;
        }
    }

    @Override // b2.InterfaceC1843x
    public final ArrayList g(int i) throws Throwable {
        w1.o oVar;
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
        w1.o oVarD = w1.o.d(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        oVarD.b(1, i);
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            iB = C1.a.b(cursorY, FacebookMediationAdapter.KEY_ID);
            iB2 = C1.a.b(cursorY, "state");
            iB3 = C1.a.b(cursorY, "worker_class_name");
            iB4 = C1.a.b(cursorY, "input_merger_class_name");
            iB5 = C1.a.b(cursorY, "input");
            iB6 = C1.a.b(cursorY, "output");
            iB7 = C1.a.b(cursorY, "initial_delay");
            iB8 = C1.a.b(cursorY, "interval_duration");
            iB9 = C1.a.b(cursorY, "flex_duration");
            iB10 = C1.a.b(cursorY, "run_attempt_count");
            iB11 = C1.a.b(cursorY, "backoff_policy");
            iB12 = C1.a.b(cursorY, "backoff_delay_duration");
            iB13 = C1.a.b(cursorY, "last_enqueue_time");
            oVar = oVarD;
        } catch (Throwable th) {
            th = th;
            oVar = oVarD;
        }
        try {
            int iB14 = C1.a.b(cursorY, "minimum_retention_duration");
            int iB15 = C1.a.b(cursorY, "schedule_requested_at");
            int iB16 = C1.a.b(cursorY, "run_in_foreground");
            int iB17 = C1.a.b(cursorY, "out_of_quota_policy");
            int iB18 = C1.a.b(cursorY, "period_count");
            int iB19 = C1.a.b(cursorY, "generation");
            int iB20 = C1.a.b(cursorY, "next_schedule_time_override");
            int iB21 = C1.a.b(cursorY, "next_schedule_time_override_generation");
            int iB22 = C1.a.b(cursorY, "stop_reason");
            int iB23 = C1.a.b(cursorY, "required_network_type");
            int iB24 = C1.a.b(cursorY, "requires_charging");
            int iB25 = C1.a.b(cursorY, "requires_device_idle");
            int iB26 = C1.a.b(cursorY, "requires_battery_not_low");
            int iB27 = C1.a.b(cursorY, "requires_storage_not_low");
            int iB28 = C1.a.b(cursorY, "trigger_content_update_delay");
            int iB29 = C1.a.b(cursorY, "trigger_max_content_delay");
            int iB30 = C1.a.b(cursorY, "content_uri_triggers");
            int i10 = iB14;
            ArrayList arrayList = new ArrayList(cursorY.getCount());
            while (cursorY.moveToNext()) {
                byte[] blob = null;
                String string = cursorY.isNull(iB) ? null : cursorY.getString(iB);
                t.b bVarF = C1819F.f(cursorY.getInt(iB2));
                String string2 = cursorY.isNull(iB3) ? null : cursorY.getString(iB3);
                String string3 = cursorY.isNull(iB4) ? null : cursorY.getString(iB4);
                androidx.work.e eVarG = androidx.work.e.g(cursorY.isNull(iB5) ? null : cursorY.getBlob(iB5));
                androidx.work.e eVarG2 = androidx.work.e.g(cursorY.isNull(iB6) ? null : cursorY.getBlob(iB6));
                long j4 = cursorY.getLong(iB7);
                long j10 = cursorY.getLong(iB8);
                long j11 = cursorY.getLong(iB9);
                int i11 = cursorY.getInt(iB10);
                androidx.work.a aVarC = C1819F.c(cursorY.getInt(iB11));
                long j12 = cursorY.getLong(iB12);
                long j13 = cursorY.getLong(iB13);
                int i12 = i10;
                long j14 = cursorY.getLong(i12);
                int i13 = iB;
                int i14 = iB15;
                long j15 = cursorY.getLong(i14);
                iB15 = i14;
                int i15 = iB16;
                boolean z10 = cursorY.getInt(i15) != 0;
                iB16 = i15;
                int i16 = iB17;
                androidx.work.r rVarE = C1819F.e(cursorY.getInt(i16));
                iB17 = i16;
                int i17 = iB18;
                int i18 = cursorY.getInt(i17);
                iB18 = i17;
                int i19 = iB19;
                int i20 = cursorY.getInt(i19);
                iB19 = i19;
                int i21 = iB20;
                long j16 = cursorY.getLong(i21);
                iB20 = i21;
                int i22 = iB21;
                int i23 = cursorY.getInt(i22);
                iB21 = i22;
                int i24 = iB22;
                int i25 = cursorY.getInt(i24);
                iB22 = i24;
                int i26 = iB23;
                androidx.work.n nVarD = C1819F.d(cursorY.getInt(i26));
                iB23 = i26;
                int i27 = iB24;
                boolean z11 = cursorY.getInt(i27) != 0;
                iB24 = i27;
                int i28 = iB25;
                boolean z12 = cursorY.getInt(i28) != 0;
                iB25 = i28;
                int i29 = iB26;
                boolean z13 = cursorY.getInt(i29) != 0;
                iB26 = i29;
                int i30 = iB27;
                boolean z14 = cursorY.getInt(i30) != 0;
                iB27 = i30;
                int i31 = iB28;
                long j17 = cursorY.getLong(i31);
                iB28 = i31;
                int i32 = iB29;
                long j18 = cursorY.getLong(i32);
                iB29 = i32;
                int i33 = iB30;
                if (!cursorY.isNull(i33)) {
                    blob = cursorY.getBlob(i33);
                }
                iB30 = i33;
                arrayList.add(new C1842w(string, bVarF, string2, string3, eVarG, eVarG2, j4, j10, j11, new androidx.work.d(nVarD, z11, z12, z13, z14, j17, j18, C1819F.b(blob)), i11, aVarC, j12, j13, j14, j15, z10, rVarE, i18, i20, j16, i23, i25));
                iB = i13;
                i10 = i12;
            }
            cursorY.close();
            oVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorY.close();
            oVar.release();
            throw th;
        }
    }

    @Override // b2.InterfaceC1843x
    public final int h(t.b bVar, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        C1831l c1831l = this.f17096e;
        F1.f fVarC = c1831l.c();
        fVarC.b(1, C1819F.j(bVar));
        if (str == null) {
            fVarC.f(2);
        } else {
            fVarC.h(2, str);
        }
        workDatabase_Impl.c();
        try {
            int iG = fVarC.G();
            workDatabase_Impl.r();
            return iG;
        } finally {
            workDatabase_Impl.n();
            c1831l.h(fVarC);
        }
    }

    @Override // b2.InterfaceC1843x
    public final void i(long j4, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        C1845z c1845z = this.i;
        F1.f fVarC = c1845z.c();
        fVarC.b(1, j4);
        if (str == null) {
            fVarC.f(2);
        } else {
            fVarC.h(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarC.G();
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
            c1845z.h(fVarC);
        }
    }

    @Override // b2.InterfaceC1843x
    public final void j(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        C1844y c1844y = this.f17102l;
        F1.f fVarC = c1844y.c();
        if (str == null) {
            fVarC.f(1);
        } else {
            fVarC.h(1, str);
        }
        fVarC.b(2, i);
        workDatabase_Impl.c();
        try {
            fVarC.G();
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
            c1844y.h(fVarC);
        }
    }

    @Override // b2.InterfaceC1843x
    public final ArrayList k() throws Throwable {
        w1.o oVar;
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
        w1.o oVarD = w1.o.d(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            iB = C1.a.b(cursorY, FacebookMediationAdapter.KEY_ID);
            iB2 = C1.a.b(cursorY, "state");
            iB3 = C1.a.b(cursorY, "worker_class_name");
            iB4 = C1.a.b(cursorY, "input_merger_class_name");
            iB5 = C1.a.b(cursorY, "input");
            iB6 = C1.a.b(cursorY, "output");
            iB7 = C1.a.b(cursorY, "initial_delay");
            iB8 = C1.a.b(cursorY, "interval_duration");
            iB9 = C1.a.b(cursorY, "flex_duration");
            iB10 = C1.a.b(cursorY, "run_attempt_count");
            iB11 = C1.a.b(cursorY, "backoff_policy");
            iB12 = C1.a.b(cursorY, "backoff_delay_duration");
            iB13 = C1.a.b(cursorY, "last_enqueue_time");
            oVar = oVarD;
        } catch (Throwable th) {
            th = th;
            oVar = oVarD;
        }
        try {
            int iB14 = C1.a.b(cursorY, "minimum_retention_duration");
            int iB15 = C1.a.b(cursorY, "schedule_requested_at");
            int iB16 = C1.a.b(cursorY, "run_in_foreground");
            int iB17 = C1.a.b(cursorY, "out_of_quota_policy");
            int iB18 = C1.a.b(cursorY, "period_count");
            int iB19 = C1.a.b(cursorY, "generation");
            int iB20 = C1.a.b(cursorY, "next_schedule_time_override");
            int iB21 = C1.a.b(cursorY, "next_schedule_time_override_generation");
            int iB22 = C1.a.b(cursorY, "stop_reason");
            int iB23 = C1.a.b(cursorY, "required_network_type");
            int iB24 = C1.a.b(cursorY, "requires_charging");
            int iB25 = C1.a.b(cursorY, "requires_device_idle");
            int iB26 = C1.a.b(cursorY, "requires_battery_not_low");
            int iB27 = C1.a.b(cursorY, "requires_storage_not_low");
            int iB28 = C1.a.b(cursorY, "trigger_content_update_delay");
            int iB29 = C1.a.b(cursorY, "trigger_max_content_delay");
            int iB30 = C1.a.b(cursorY, "content_uri_triggers");
            int i = iB14;
            ArrayList arrayList = new ArrayList(cursorY.getCount());
            while (cursorY.moveToNext()) {
                byte[] blob = null;
                String string = cursorY.isNull(iB) ? null : cursorY.getString(iB);
                t.b bVarF = C1819F.f(cursorY.getInt(iB2));
                String string2 = cursorY.isNull(iB3) ? null : cursorY.getString(iB3);
                String string3 = cursorY.isNull(iB4) ? null : cursorY.getString(iB4);
                androidx.work.e eVarG = androidx.work.e.g(cursorY.isNull(iB5) ? null : cursorY.getBlob(iB5));
                androidx.work.e eVarG2 = androidx.work.e.g(cursorY.isNull(iB6) ? null : cursorY.getBlob(iB6));
                long j4 = cursorY.getLong(iB7);
                long j10 = cursorY.getLong(iB8);
                long j11 = cursorY.getLong(iB9);
                int i10 = cursorY.getInt(iB10);
                androidx.work.a aVarC = C1819F.c(cursorY.getInt(iB11));
                long j12 = cursorY.getLong(iB12);
                long j13 = cursorY.getLong(iB13);
                int i11 = i;
                long j14 = cursorY.getLong(i11);
                int i12 = iB;
                int i13 = iB15;
                long j15 = cursorY.getLong(i13);
                iB15 = i13;
                int i14 = iB16;
                boolean z10 = cursorY.getInt(i14) != 0;
                iB16 = i14;
                int i15 = iB17;
                androidx.work.r rVarE = C1819F.e(cursorY.getInt(i15));
                iB17 = i15;
                int i16 = iB18;
                int i17 = cursorY.getInt(i16);
                iB18 = i16;
                int i18 = iB19;
                int i19 = cursorY.getInt(i18);
                iB19 = i18;
                int i20 = iB20;
                long j16 = cursorY.getLong(i20);
                iB20 = i20;
                int i21 = iB21;
                int i22 = cursorY.getInt(i21);
                iB21 = i21;
                int i23 = iB22;
                int i24 = cursorY.getInt(i23);
                iB22 = i23;
                int i25 = iB23;
                androidx.work.n nVarD = C1819F.d(cursorY.getInt(i25));
                iB23 = i25;
                int i26 = iB24;
                boolean z11 = cursorY.getInt(i26) != 0;
                iB24 = i26;
                int i27 = iB25;
                boolean z12 = cursorY.getInt(i27) != 0;
                iB25 = i27;
                int i28 = iB26;
                boolean z13 = cursorY.getInt(i28) != 0;
                iB26 = i28;
                int i29 = iB27;
                boolean z14 = cursorY.getInt(i29) != 0;
                iB27 = i29;
                int i30 = iB28;
                long j17 = cursorY.getLong(i30);
                iB28 = i30;
                int i31 = iB29;
                long j18 = cursorY.getLong(i31);
                iB29 = i31;
                int i32 = iB30;
                if (!cursorY.isNull(i32)) {
                    blob = cursorY.getBlob(i32);
                }
                iB30 = i32;
                arrayList.add(new C1842w(string, bVarF, string2, string3, eVarG, eVarG2, j4, j10, j11, new androidx.work.d(nVarD, z11, z12, z13, z14, j17, j18, C1819F.b(blob)), i10, aVarC, j12, j13, j14, j15, z10, rVarE, i17, i19, j16, i22, i24));
                iB = i12;
                i = i11;
            }
            cursorY.close();
            oVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorY.close();
            oVar.release();
            throw th;
        }
    }

    @Override // b2.InterfaceC1843x
    public final void l(String str, androidx.work.e eVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        C1844y c1844y = this.f17099h;
        F1.f fVarC = c1844y.c();
        byte[] bArrI = androidx.work.e.i(eVar);
        if (bArrI == null) {
            fVarC.f(1);
        } else {
            fVarC.b0(1, bArrI);
        }
        if (str == null) {
            fVarC.f(2);
        } else {
            fVarC.h(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarC.G();
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
            c1844y.h(fVarC);
        }
    }

    @Override // b2.InterfaceC1843x
    public final ArrayList m() throws Throwable {
        w1.o oVar;
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
        w1.o oVarD = w1.o.d(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            iB = C1.a.b(cursorY, FacebookMediationAdapter.KEY_ID);
            iB2 = C1.a.b(cursorY, "state");
            iB3 = C1.a.b(cursorY, "worker_class_name");
            iB4 = C1.a.b(cursorY, "input_merger_class_name");
            iB5 = C1.a.b(cursorY, "input");
            iB6 = C1.a.b(cursorY, "output");
            iB7 = C1.a.b(cursorY, "initial_delay");
            iB8 = C1.a.b(cursorY, "interval_duration");
            iB9 = C1.a.b(cursorY, "flex_duration");
            iB10 = C1.a.b(cursorY, "run_attempt_count");
            iB11 = C1.a.b(cursorY, "backoff_policy");
            iB12 = C1.a.b(cursorY, "backoff_delay_duration");
            iB13 = C1.a.b(cursorY, "last_enqueue_time");
            oVar = oVarD;
        } catch (Throwable th) {
            th = th;
            oVar = oVarD;
        }
        try {
            int iB14 = C1.a.b(cursorY, "minimum_retention_duration");
            int iB15 = C1.a.b(cursorY, "schedule_requested_at");
            int iB16 = C1.a.b(cursorY, "run_in_foreground");
            int iB17 = C1.a.b(cursorY, "out_of_quota_policy");
            int iB18 = C1.a.b(cursorY, "period_count");
            int iB19 = C1.a.b(cursorY, "generation");
            int iB20 = C1.a.b(cursorY, "next_schedule_time_override");
            int iB21 = C1.a.b(cursorY, "next_schedule_time_override_generation");
            int iB22 = C1.a.b(cursorY, "stop_reason");
            int iB23 = C1.a.b(cursorY, "required_network_type");
            int iB24 = C1.a.b(cursorY, "requires_charging");
            int iB25 = C1.a.b(cursorY, "requires_device_idle");
            int iB26 = C1.a.b(cursorY, "requires_battery_not_low");
            int iB27 = C1.a.b(cursorY, "requires_storage_not_low");
            int iB28 = C1.a.b(cursorY, "trigger_content_update_delay");
            int iB29 = C1.a.b(cursorY, "trigger_max_content_delay");
            int iB30 = C1.a.b(cursorY, "content_uri_triggers");
            int i = iB14;
            ArrayList arrayList = new ArrayList(cursorY.getCount());
            while (cursorY.moveToNext()) {
                byte[] blob = null;
                String string = cursorY.isNull(iB) ? null : cursorY.getString(iB);
                t.b bVarF = C1819F.f(cursorY.getInt(iB2));
                String string2 = cursorY.isNull(iB3) ? null : cursorY.getString(iB3);
                String string3 = cursorY.isNull(iB4) ? null : cursorY.getString(iB4);
                androidx.work.e eVarG = androidx.work.e.g(cursorY.isNull(iB5) ? null : cursorY.getBlob(iB5));
                androidx.work.e eVarG2 = androidx.work.e.g(cursorY.isNull(iB6) ? null : cursorY.getBlob(iB6));
                long j4 = cursorY.getLong(iB7);
                long j10 = cursorY.getLong(iB8);
                long j11 = cursorY.getLong(iB9);
                int i10 = cursorY.getInt(iB10);
                androidx.work.a aVarC = C1819F.c(cursorY.getInt(iB11));
                long j12 = cursorY.getLong(iB12);
                long j13 = cursorY.getLong(iB13);
                int i11 = i;
                long j14 = cursorY.getLong(i11);
                int i12 = iB;
                int i13 = iB15;
                long j15 = cursorY.getLong(i13);
                iB15 = i13;
                int i14 = iB16;
                boolean z10 = cursorY.getInt(i14) != 0;
                iB16 = i14;
                int i15 = iB17;
                androidx.work.r rVarE = C1819F.e(cursorY.getInt(i15));
                iB17 = i15;
                int i16 = iB18;
                int i17 = cursorY.getInt(i16);
                iB18 = i16;
                int i18 = iB19;
                int i19 = cursorY.getInt(i18);
                iB19 = i18;
                int i20 = iB20;
                long j16 = cursorY.getLong(i20);
                iB20 = i20;
                int i21 = iB21;
                int i22 = cursorY.getInt(i21);
                iB21 = i21;
                int i23 = iB22;
                int i24 = cursorY.getInt(i23);
                iB22 = i23;
                int i25 = iB23;
                androidx.work.n nVarD = C1819F.d(cursorY.getInt(i25));
                iB23 = i25;
                int i26 = iB24;
                boolean z11 = cursorY.getInt(i26) != 0;
                iB24 = i26;
                int i27 = iB25;
                boolean z12 = cursorY.getInt(i27) != 0;
                iB25 = i27;
                int i28 = iB26;
                boolean z13 = cursorY.getInt(i28) != 0;
                iB26 = i28;
                int i29 = iB27;
                boolean z14 = cursorY.getInt(i29) != 0;
                iB27 = i29;
                int i30 = iB28;
                long j17 = cursorY.getLong(i30);
                iB28 = i30;
                int i31 = iB29;
                long j18 = cursorY.getLong(i31);
                iB29 = i31;
                int i32 = iB30;
                if (!cursorY.isNull(i32)) {
                    blob = cursorY.getBlob(i32);
                }
                iB30 = i32;
                arrayList.add(new C1842w(string, bVarF, string2, string3, eVarG, eVarG2, j4, j10, j11, new androidx.work.d(nVarD, z11, z12, z13, z14, j17, j18, C1819F.b(blob)), i10, aVarC, j12, j13, j14, j15, z10, rVarE, i17, i19, j16, i22, i24));
                iB = i12;
                i = i11;
            }
            cursorY.close();
            oVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorY.close();
            oVar.release();
            throw th;
        }
    }

    @Override // b2.InterfaceC1843x
    public final void n(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        C1844y c1844y = this.f17105o;
        F1.f fVarC = c1844y.c();
        fVarC.b(1, i);
        if (str == null) {
            fVarC.f(2);
        } else {
            fVarC.h(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarC.G();
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
            c1844y.h(fVarC);
        }
    }

    @Override // b2.InterfaceC1843x
    public final ArrayList o() throws IOException {
        w1.o oVarD = w1.o.d(0, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            ArrayList arrayList = new ArrayList(cursorY.getCount());
            while (cursorY.moveToNext()) {
                arrayList.add(cursorY.isNull(0) ? null : cursorY.getString(0));
            }
            return arrayList;
        } finally {
            cursorY.close();
            oVarD.release();
        }
    }

    @Override // b2.InterfaceC1843x
    public final boolean p() throws IOException {
        boolean z10 = false;
        w1.o oVarD = w1.o.d(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            if (cursorY.moveToFirst()) {
                if (cursorY.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            cursorY.close();
            oVarD.release();
        }
    }

    @Override // b2.InterfaceC1843x
    public final ArrayList q(String str) throws IOException {
        w1.o oVarD = w1.o.d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            oVarD.f(1);
        } else {
            oVarD.h(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            ArrayList arrayList = new ArrayList(cursorY.getCount());
            while (cursorY.moveToNext()) {
                arrayList.add(cursorY.isNull(0) ? null : cursorY.getString(0));
            }
            return arrayList;
        } finally {
            cursorY.close();
            oVarD.release();
        }
    }

    @Override // b2.InterfaceC1843x
    public final void r(C1842w c1842w) {
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            C1815B c1815b = this.f17094c;
            F1.f fVarC = c1815b.c();
            try {
                c1815b.i(fVarC, c1842w);
                fVarC.G();
                c1815b.h(fVarC);
                workDatabase_Impl.r();
            } catch (Throwable th) {
                c1815b.h(fVarC);
                throw th;
            }
        } finally {
            workDatabase_Impl.n();
        }
    }

    @Override // b2.InterfaceC1843x
    public final ArrayList s() throws Throwable {
        w1.o oVar;
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
        w1.o oVarD = w1.o.d(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            iB = C1.a.b(cursorY, FacebookMediationAdapter.KEY_ID);
            iB2 = C1.a.b(cursorY, "state");
            iB3 = C1.a.b(cursorY, "worker_class_name");
            iB4 = C1.a.b(cursorY, "input_merger_class_name");
            iB5 = C1.a.b(cursorY, "input");
            iB6 = C1.a.b(cursorY, "output");
            iB7 = C1.a.b(cursorY, "initial_delay");
            iB8 = C1.a.b(cursorY, "interval_duration");
            iB9 = C1.a.b(cursorY, "flex_duration");
            iB10 = C1.a.b(cursorY, "run_attempt_count");
            iB11 = C1.a.b(cursorY, "backoff_policy");
            iB12 = C1.a.b(cursorY, "backoff_delay_duration");
            iB13 = C1.a.b(cursorY, "last_enqueue_time");
            oVar = oVarD;
        } catch (Throwable th) {
            th = th;
            oVar = oVarD;
        }
        try {
            int iB14 = C1.a.b(cursorY, "minimum_retention_duration");
            int iB15 = C1.a.b(cursorY, "schedule_requested_at");
            int iB16 = C1.a.b(cursorY, "run_in_foreground");
            int iB17 = C1.a.b(cursorY, "out_of_quota_policy");
            int iB18 = C1.a.b(cursorY, "period_count");
            int iB19 = C1.a.b(cursorY, "generation");
            int iB20 = C1.a.b(cursorY, "next_schedule_time_override");
            int iB21 = C1.a.b(cursorY, "next_schedule_time_override_generation");
            int iB22 = C1.a.b(cursorY, "stop_reason");
            int iB23 = C1.a.b(cursorY, "required_network_type");
            int iB24 = C1.a.b(cursorY, "requires_charging");
            int iB25 = C1.a.b(cursorY, "requires_device_idle");
            int iB26 = C1.a.b(cursorY, "requires_battery_not_low");
            int iB27 = C1.a.b(cursorY, "requires_storage_not_low");
            int iB28 = C1.a.b(cursorY, "trigger_content_update_delay");
            int iB29 = C1.a.b(cursorY, "trigger_max_content_delay");
            int iB30 = C1.a.b(cursorY, "content_uri_triggers");
            int i = iB14;
            ArrayList arrayList = new ArrayList(cursorY.getCount());
            while (cursorY.moveToNext()) {
                byte[] blob = null;
                String string = cursorY.isNull(iB) ? null : cursorY.getString(iB);
                t.b bVarF = C1819F.f(cursorY.getInt(iB2));
                String string2 = cursorY.isNull(iB3) ? null : cursorY.getString(iB3);
                String string3 = cursorY.isNull(iB4) ? null : cursorY.getString(iB4);
                androidx.work.e eVarG = androidx.work.e.g(cursorY.isNull(iB5) ? null : cursorY.getBlob(iB5));
                androidx.work.e eVarG2 = androidx.work.e.g(cursorY.isNull(iB6) ? null : cursorY.getBlob(iB6));
                long j4 = cursorY.getLong(iB7);
                long j10 = cursorY.getLong(iB8);
                long j11 = cursorY.getLong(iB9);
                int i10 = cursorY.getInt(iB10);
                androidx.work.a aVarC = C1819F.c(cursorY.getInt(iB11));
                long j12 = cursorY.getLong(iB12);
                long j13 = cursorY.getLong(iB13);
                int i11 = i;
                long j14 = cursorY.getLong(i11);
                int i12 = iB;
                int i13 = iB15;
                long j15 = cursorY.getLong(i13);
                iB15 = i13;
                int i14 = iB16;
                boolean z10 = cursorY.getInt(i14) != 0;
                iB16 = i14;
                int i15 = iB17;
                androidx.work.r rVarE = C1819F.e(cursorY.getInt(i15));
                iB17 = i15;
                int i16 = iB18;
                int i17 = cursorY.getInt(i16);
                iB18 = i16;
                int i18 = iB19;
                int i19 = cursorY.getInt(i18);
                iB19 = i18;
                int i20 = iB20;
                long j16 = cursorY.getLong(i20);
                iB20 = i20;
                int i21 = iB21;
                int i22 = cursorY.getInt(i21);
                iB21 = i21;
                int i23 = iB22;
                int i24 = cursorY.getInt(i23);
                iB22 = i23;
                int i25 = iB23;
                androidx.work.n nVarD = C1819F.d(cursorY.getInt(i25));
                iB23 = i25;
                int i26 = iB24;
                boolean z11 = cursorY.getInt(i26) != 0;
                iB24 = i26;
                int i27 = iB25;
                boolean z12 = cursorY.getInt(i27) != 0;
                iB25 = i27;
                int i28 = iB26;
                boolean z13 = cursorY.getInt(i28) != 0;
                iB26 = i28;
                int i29 = iB27;
                boolean z14 = cursorY.getInt(i29) != 0;
                iB27 = i29;
                int i30 = iB28;
                long j17 = cursorY.getLong(i30);
                iB28 = i30;
                int i31 = iB29;
                long j18 = cursorY.getLong(i31);
                iB29 = i31;
                int i32 = iB30;
                if (!cursorY.isNull(i32)) {
                    blob = cursorY.getBlob(i32);
                }
                iB30 = i32;
                arrayList.add(new C1842w(string, bVarF, string2, string3, eVarG, eVarG2, j4, j10, j11, new androidx.work.d(nVarD, z11, z12, z13, z14, j17, j18, C1819F.b(blob)), i10, aVarC, j12, j13, j14, j15, z10, rVarE, i17, i19, j16, i22, i24));
                iB = i12;
                i = i11;
            }
            cursorY.close();
            oVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorY.close();
            oVar.release();
            throw th;
        }
    }

    @Override // b2.InterfaceC1843x
    public final t.b t(String str) throws IOException {
        w1.o oVarD = w1.o.d(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            oVarD.f(1);
        } else {
            oVarD.h(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            t.b bVarF = null;
            if (cursorY.moveToFirst()) {
                Integer numValueOf = cursorY.isNull(0) ? null : Integer.valueOf(cursorY.getInt(0));
                if (numValueOf != null) {
                    bVarF = C1819F.f(numValueOf.intValue());
                }
            }
            return bVarF;
        } finally {
            cursorY.close();
            oVarD.release();
        }
    }

    @Override // b2.InterfaceC1843x
    public final C1842w u(String str) throws Throwable {
        w1.o oVar;
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
        w1.o oVarD = w1.o.d(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            oVarD.f(1);
        } else {
            oVarD.h(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            iB = C1.a.b(cursorY, FacebookMediationAdapter.KEY_ID);
            iB2 = C1.a.b(cursorY, "state");
            iB3 = C1.a.b(cursorY, "worker_class_name");
            iB4 = C1.a.b(cursorY, "input_merger_class_name");
            iB5 = C1.a.b(cursorY, "input");
            iB6 = C1.a.b(cursorY, "output");
            iB7 = C1.a.b(cursorY, "initial_delay");
            iB8 = C1.a.b(cursorY, "interval_duration");
            iB9 = C1.a.b(cursorY, "flex_duration");
            iB10 = C1.a.b(cursorY, "run_attempt_count");
            iB11 = C1.a.b(cursorY, "backoff_policy");
            iB12 = C1.a.b(cursorY, "backoff_delay_duration");
            iB13 = C1.a.b(cursorY, "last_enqueue_time");
            oVar = oVarD;
        } catch (Throwable th) {
            th = th;
            oVar = oVarD;
        }
        try {
            int iB14 = C1.a.b(cursorY, "minimum_retention_duration");
            int iB15 = C1.a.b(cursorY, "schedule_requested_at");
            int iB16 = C1.a.b(cursorY, "run_in_foreground");
            int iB17 = C1.a.b(cursorY, "out_of_quota_policy");
            int iB18 = C1.a.b(cursorY, "period_count");
            int iB19 = C1.a.b(cursorY, "generation");
            int iB20 = C1.a.b(cursorY, "next_schedule_time_override");
            int iB21 = C1.a.b(cursorY, "next_schedule_time_override_generation");
            int iB22 = C1.a.b(cursorY, "stop_reason");
            int iB23 = C1.a.b(cursorY, "required_network_type");
            int iB24 = C1.a.b(cursorY, "requires_charging");
            int iB25 = C1.a.b(cursorY, "requires_device_idle");
            int iB26 = C1.a.b(cursorY, "requires_battery_not_low");
            int iB27 = C1.a.b(cursorY, "requires_storage_not_low");
            int iB28 = C1.a.b(cursorY, "trigger_content_update_delay");
            int iB29 = C1.a.b(cursorY, "trigger_max_content_delay");
            int iB30 = C1.a.b(cursorY, "content_uri_triggers");
            C1842w c1842w = null;
            byte[] blob = null;
            if (cursorY.moveToFirst()) {
                String string = cursorY.isNull(iB) ? null : cursorY.getString(iB);
                t.b bVarF = C1819F.f(cursorY.getInt(iB2));
                String string2 = cursorY.isNull(iB3) ? null : cursorY.getString(iB3);
                String string3 = cursorY.isNull(iB4) ? null : cursorY.getString(iB4);
                androidx.work.e eVarG = androidx.work.e.g(cursorY.isNull(iB5) ? null : cursorY.getBlob(iB5));
                androidx.work.e eVarG2 = androidx.work.e.g(cursorY.isNull(iB6) ? null : cursorY.getBlob(iB6));
                long j4 = cursorY.getLong(iB7);
                long j10 = cursorY.getLong(iB8);
                long j11 = cursorY.getLong(iB9);
                int i = cursorY.getInt(iB10);
                androidx.work.a aVarC = C1819F.c(cursorY.getInt(iB11));
                long j12 = cursorY.getLong(iB12);
                long j13 = cursorY.getLong(iB13);
                long j14 = cursorY.getLong(iB14);
                long j15 = cursorY.getLong(iB15);
                boolean z10 = cursorY.getInt(iB16) != 0;
                androidx.work.r rVarE = C1819F.e(cursorY.getInt(iB17));
                int i10 = cursorY.getInt(iB18);
                int i11 = cursorY.getInt(iB19);
                long j16 = cursorY.getLong(iB20);
                int i12 = cursorY.getInt(iB21);
                int i13 = cursorY.getInt(iB22);
                androidx.work.n nVarD = C1819F.d(cursorY.getInt(iB23));
                boolean z11 = cursorY.getInt(iB24) != 0;
                boolean z12 = cursorY.getInt(iB25) != 0;
                boolean z13 = cursorY.getInt(iB26) != 0;
                boolean z14 = cursorY.getInt(iB27) != 0;
                long j17 = cursorY.getLong(iB28);
                long j18 = cursorY.getLong(iB29);
                if (!cursorY.isNull(iB30)) {
                    blob = cursorY.getBlob(iB30);
                }
                c1842w = new C1842w(string, bVarF, string2, string3, eVarG, eVarG2, j4, j10, j11, new androidx.work.d(nVarD, z11, z12, z13, z14, j17, j18, C1819F.b(blob)), i, aVarC, j12, j13, j14, j15, z10, rVarE, i10, i11, j16, i12, i13);
            }
            cursorY.close();
            oVar.release();
            return c1842w;
        } catch (Throwable th2) {
            th = th2;
            cursorY.close();
            oVar.release();
            throw th;
        }
    }

    @Override // b2.InterfaceC1843x
    public final int v(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        C1832m c1832m = this.f17101k;
        F1.f fVarC = c1832m.c();
        if (str == null) {
            fVarC.f(1);
        } else {
            fVarC.h(1, str);
        }
        workDatabase_Impl.c();
        try {
            int iG = fVarC.G();
            workDatabase_Impl.r();
            return iG;
        } finally {
            workDatabase_Impl.n();
            c1832m.h(fVarC);
        }
    }

    @Override // b2.InterfaceC1843x
    public final int w(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        C1832m c1832m = this.f17097f;
        F1.f fVarC = c1832m.c();
        if (str == null) {
            fVarC.f(1);
        } else {
            fVarC.h(1, str);
        }
        workDatabase_Impl.c();
        try {
            int iG = fVarC.G();
            workDatabase_Impl.r();
            return iG;
        } finally {
            workDatabase_Impl.n();
            c1832m.h(fVarC);
        }
    }

    @Override // b2.InterfaceC1843x
    public final ArrayList x(String str) throws IOException {
        w1.o oVarD = w1.o.d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            oVarD.f(1);
        } else {
            oVarD.h(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            ArrayList arrayList = new ArrayList(cursorY.getCount());
            while (cursorY.moveToNext()) {
                arrayList.add(cursorY.isNull(0) ? null : cursorY.getString(0));
            }
            return arrayList;
        } finally {
            cursorY.close();
            oVarD.release();
        }
    }

    @Override // b2.InterfaceC1843x
    public final ArrayList y(String str) throws IOException {
        w1.o oVarD = w1.o.d(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        if (str == null) {
            oVarD.f(1);
        } else {
            oVarD.h(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            ArrayList arrayList = new ArrayList(cursorY.getCount());
            while (cursorY.moveToNext()) {
                arrayList.add(androidx.work.e.g(cursorY.isNull(0) ? null : cursorY.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorY.close();
            oVarD.release();
        }
    }

    @Override // b2.InterfaceC1843x
    public final int z(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f17092a;
        workDatabase_Impl.b();
        C1831l c1831l = this.f17100j;
        F1.f fVarC = c1831l.c();
        if (str == null) {
            fVarC.f(1);
        } else {
            fVarC.h(1, str);
        }
        workDatabase_Impl.c();
        try {
            int iG = fVarC.G();
            workDatabase_Impl.r();
            return iG;
        } finally {
            workDatabase_Impl.n();
            c1831l.h(fVarC);
        }
    }
}
