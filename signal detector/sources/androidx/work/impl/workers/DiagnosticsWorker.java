package androidx.work.impl.workers;

import C0.t;
import I5.b;
import K4.c;
import V0.f;
import V0.l;
import V0.m;
import V2.e;
import V2.h;
import W0.k;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.d;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import e1.C2300c;
import h0.C2351a;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: g, reason: collision with root package name */
    public static final String f5704g = m.h("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String b(C2351a c2351a, h hVar, e eVar, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            e1.h hVar2 = (e1.h) obj;
            C2300c c2300cP = eVar.p(hVar2.f19908a);
            Integer numValueOf = c2300cP != null ? Integer.valueOf(c2300cP.f19901b) : null;
            String str2 = hVar2.f19908a;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c2351a.f20441b;
            t tVarA = t.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                tVarA.l(1);
            } else {
                tVarA.c(1, str2);
            }
            workDatabase_Impl.b();
            Cursor cursorL = workDatabase_Impl.l(tVarA);
            try {
                ArrayList arrayList2 = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    arrayList2.add(cursorL.getString(0));
                }
                cursorL.close();
                tVarA.b();
                ArrayList arrayListQ = hVar.q(hVar2.f19908a);
                String strJoin = TextUtils.join(",", arrayList2);
                String strJoin2 = TextUtils.join(",", arrayListQ);
                String str3 = hVar2.f19908a;
                String str4 = hVar2.f19910c;
                switch (hVar2.f19909b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                StringBuilder sb2 = new StringBuilder("\n");
                sb2.append(str3);
                sb2.append("\t ");
                sb2.append(str4);
                sb2.append("\t ");
                sb2.append(numValueOf);
                sb2.append("\t ");
                sb2.append(str);
                sb2.append("\t ");
                sb.append(AbstractC1135f5.o(sb2, strJoin, "\t ", strJoin2, "\t"));
            } catch (Throwable th) {
                cursorL.close();
                tVarA.b();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final l doWork() throws Throwable {
        t tVar;
        int iP;
        int iP2;
        int iP3;
        int iP4;
        int iP5;
        int iP6;
        int iP7;
        int iP8;
        int iP9;
        int iP10;
        int iP11;
        e eVar;
        C2351a c2351a;
        h hVar;
        int i;
        WorkDatabase workDatabase = k.G(getApplicationContext()).f3992k;
        c cVarT = workDatabase.t();
        C2351a c2351aR = workDatabase.r();
        h hVarU = workDatabase.u();
        e eVarQ = workDatabase.q();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        cVarT.getClass();
        t tVarA = t.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        tVarA.f(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVarT.f2209b;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(tVarA);
        try {
            iP = b.p(cursorL, "required_network_type");
            iP2 = b.p(cursorL, "requires_charging");
            iP3 = b.p(cursorL, "requires_device_idle");
            iP4 = b.p(cursorL, "requires_battery_not_low");
            iP5 = b.p(cursorL, "requires_storage_not_low");
            iP6 = b.p(cursorL, "trigger_content_update_delay");
            iP7 = b.p(cursorL, "trigger_max_content_delay");
            iP8 = b.p(cursorL, "content_uri_triggers");
            iP9 = b.p(cursorL, "id");
            iP10 = b.p(cursorL, "state");
            iP11 = b.p(cursorL, "worker_class_name");
            tVar = tVarA;
        } catch (Throwable th) {
            th = th;
            tVar = tVarA;
        }
        try {
            int iP12 = b.p(cursorL, "input_merger_class_name");
            int iP13 = b.p(cursorL, "input");
            int iP14 = b.p(cursorL, "output");
            int iP15 = b.p(cursorL, "initial_delay");
            int iP16 = b.p(cursorL, "interval_duration");
            int iP17 = b.p(cursorL, "flex_duration");
            int iP18 = b.p(cursorL, "run_attempt_count");
            int iP19 = b.p(cursorL, "backoff_policy");
            int iP20 = b.p(cursorL, "backoff_delay_duration");
            int iP21 = b.p(cursorL, "period_start_time");
            int iP22 = b.p(cursorL, "minimum_retention_duration");
            int iP23 = b.p(cursorL, "schedule_requested_at");
            int iP24 = b.p(cursorL, "run_in_foreground");
            int iP25 = b.p(cursorL, "out_of_quota_policy");
            int i3 = iP14;
            ArrayList arrayList = new ArrayList(cursorL.getCount());
            while (cursorL.moveToNext()) {
                String string = cursorL.getString(iP9);
                int i6 = iP9;
                String string2 = cursorL.getString(iP11);
                int i7 = iP11;
                V0.c cVar = new V0.c();
                int i8 = iP;
                cVar.f3808a = d.A(cursorL.getInt(iP));
                cVar.f3809b = cursorL.getInt(iP2) != 0;
                cVar.f3810c = cursorL.getInt(iP3) != 0;
                cVar.f3811d = cursorL.getInt(iP4) != 0;
                cVar.f3812e = cursorL.getInt(iP5) != 0;
                int i9 = iP2;
                int i10 = iP3;
                cVar.f3813f = cursorL.getLong(iP6);
                cVar.f3814g = cursorL.getLong(iP7);
                cVar.f3815h = d.g(cursorL.getBlob(iP8));
                e1.h hVar2 = new e1.h(string, string2);
                hVar2.f19909b = d.C(cursorL.getInt(iP10));
                hVar2.f19911d = cursorL.getString(iP12);
                hVar2.f19912e = f.a(cursorL.getBlob(iP13));
                int i11 = i3;
                hVar2.f19913f = f.a(cursorL.getBlob(i11));
                int i12 = iP10;
                int i13 = iP15;
                hVar2.f19914g = cursorL.getLong(i13);
                int i14 = iP16;
                int i15 = iP12;
                hVar2.f19915h = cursorL.getLong(i14);
                int i16 = iP4;
                int i17 = iP17;
                hVar2.i = cursorL.getLong(i17);
                int i18 = iP18;
                hVar2.f19917k = cursorL.getInt(i18);
                int i19 = iP19;
                int i20 = iP13;
                hVar2.f19918l = d.z(cursorL.getInt(i19));
                int i21 = iP20;
                hVar2.f19919m = cursorL.getLong(i21);
                int i22 = iP21;
                hVar2.f19920n = cursorL.getLong(i22);
                int i23 = iP22;
                hVar2.f19921o = cursorL.getLong(i23);
                int i24 = iP23;
                hVar2.f19922p = cursorL.getLong(i24);
                int i25 = iP24;
                hVar2.f19923q = cursorL.getInt(i25) != 0;
                int i26 = iP25;
                hVar2.f19924r = d.B(cursorL.getInt(i26));
                hVar2.f19916j = cVar;
                arrayList.add(hVar2);
                iP18 = i18;
                iP12 = i15;
                iP16 = i14;
                iP21 = i22;
                iP4 = i16;
                i3 = i11;
                iP24 = i25;
                iP2 = i9;
                iP15 = i13;
                iP13 = i20;
                iP17 = i17;
                iP19 = i19;
                iP22 = i23;
                iP20 = i21;
                iP11 = i7;
                iP = i8;
                iP25 = i26;
                iP23 = i24;
                iP10 = i12;
                iP9 = i6;
                iP3 = i10;
            }
            cursorL.close();
            tVar.b();
            ArrayList arrayListC = cVarT.c();
            ArrayList arrayListA = cVarT.a();
            boolean zIsEmpty = arrayList.isEmpty();
            String str = f5704g;
            if (zIsEmpty) {
                eVar = eVarQ;
                c2351a = c2351aR;
                hVar = hVarU;
                i = 0;
            } else {
                i = 0;
                m.f().g(str, "Recently completed work:\n\n", new Throwable[0]);
                eVar = eVarQ;
                c2351a = c2351aR;
                hVar = hVarU;
                m.f().g(str, b(c2351a, hVar, eVar, arrayList), new Throwable[0]);
            }
            if (!arrayListC.isEmpty()) {
                m.f().g(str, "Running work:\n\n", new Throwable[i]);
                m.f().g(str, b(c2351a, hVar, eVar, arrayListC), new Throwable[i]);
            }
            if (!arrayListA.isEmpty()) {
                m.f().g(str, "Enqueued work:\n\n", new Throwable[i]);
                m.f().g(str, b(c2351a, hVar, eVar, arrayListA), new Throwable[i]);
            }
            return new V0.k(f.f3820c);
        } catch (Throwable th2) {
            th = th2;
            cursorL.close();
            tVar.b();
            throw th;
        }
    }
}
