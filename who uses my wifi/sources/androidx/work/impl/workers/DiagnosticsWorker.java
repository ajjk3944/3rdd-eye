package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import defpackage.ex0;
import defpackage.gw3;
import defpackage.h2;
import defpackage.h80;
import defpackage.ha1;
import defpackage.im;
import defpackage.l92;
import defpackage.oa1;
import defpackage.q70;
import defpackage.r70;
import defpackage.ri;
import defpackage.rq0;
import defpackage.sz0;
import defpackage.t83;
import defpackage.wl2;
import defpackage.yb;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    static {
        h80.f("DiagnosticsWrkr");
    }

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(gw3 gw3Var, l92 l92Var, t83 t83Var, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            oa1 oa1Var = (oa1) obj;
            sz0 sz0VarF = t83Var.F(oa1Var.a);
            Integer numValueOf = sz0VarF != null ? Integer.valueOf(sz0VarF.b) : null;
            String str2 = oa1Var.a;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) gw3Var.g;
            rq0 rq0VarF = rq0.f("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str2 == null) {
                rq0VarF.h(1);
            } else {
                rq0VarF.i(str2, 1);
            }
            workDatabase_Impl.b();
            Cursor cursorG = workDatabase_Impl.g(rq0VarF);
            try {
                ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList2.add(cursorG.getString(0));
                }
                cursorG.close();
                rq0VarF.k();
                ArrayList arrayListZ = l92Var.z(oa1Var.a);
                String strJoin = TextUtils.join(",", arrayList2);
                String strJoin2 = TextUtils.join(",", arrayListZ);
                String str3 = oa1Var.a;
                String str4 = oa1Var.c;
                switch (oa1Var.b) {
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
                sb.append(ex0.m(sb2, strJoin, "\t ", strJoin2, "\t"));
            } catch (Throwable th) {
                cursorG.close();
                rq0VarF.k();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final r70 doWork() throws Throwable {
        rq0 rq0Var;
        int iJ;
        int iJ2;
        int iJ3;
        int iJ4;
        int iJ5;
        int iJ6;
        int iJ7;
        int iJ8;
        int iJ9;
        int iJ10;
        int iJ11;
        t83 t83Var;
        gw3 gw3Var;
        l92 l92Var;
        int i;
        WorkDatabase workDatabase = ha1.j0(getApplicationContext()).r;
        h2 h2VarN = workDatabase.n();
        gw3 gw3VarL = workDatabase.l();
        l92 l92VarO = workDatabase.o();
        t83 t83VarK = workDatabase.k();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        h2VarN.getClass();
        rq0 rq0VarF = rq0.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        rq0VarF.g(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) h2VarN.a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(rq0VarF);
        try {
            iJ = yb.j(cursorG, "required_network_type");
            iJ2 = yb.j(cursorG, "requires_charging");
            iJ3 = yb.j(cursorG, "requires_device_idle");
            iJ4 = yb.j(cursorG, "requires_battery_not_low");
            iJ5 = yb.j(cursorG, "requires_storage_not_low");
            iJ6 = yb.j(cursorG, "trigger_content_update_delay");
            iJ7 = yb.j(cursorG, "trigger_max_content_delay");
            iJ8 = yb.j(cursorG, "content_uri_triggers");
            iJ9 = yb.j(cursorG, "id");
            iJ10 = yb.j(cursorG, "state");
            iJ11 = yb.j(cursorG, "worker_class_name");
            rq0Var = rq0VarF;
        } catch (Throwable th) {
            th = th;
            rq0Var = rq0VarF;
        }
        try {
            int iJ12 = yb.j(cursorG, "input_merger_class_name");
            int iJ13 = yb.j(cursorG, "input");
            int iJ14 = yb.j(cursorG, "output");
            int iJ15 = yb.j(cursorG, "initial_delay");
            int iJ16 = yb.j(cursorG, "interval_duration");
            int iJ17 = yb.j(cursorG, "flex_duration");
            int iJ18 = yb.j(cursorG, "run_attempt_count");
            int iJ19 = yb.j(cursorG, "backoff_policy");
            int iJ20 = yb.j(cursorG, "backoff_delay_duration");
            int iJ21 = yb.j(cursorG, "period_start_time");
            int iJ22 = yb.j(cursorG, "minimum_retention_duration");
            int iJ23 = yb.j(cursorG, "schedule_requested_at");
            int iJ24 = yb.j(cursorG, "run_in_foreground");
            int iJ25 = yb.j(cursorG, "out_of_quota_policy");
            int i2 = iJ14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iJ9);
                int i3 = iJ9;
                String string2 = cursorG.getString(iJ11);
                int i4 = iJ11;
                ri riVar = new ri();
                int i5 = iJ;
                riVar.a = wl2.l(cursorG.getInt(iJ));
                riVar.b = cursorG.getInt(iJ2) != 0;
                riVar.c = cursorG.getInt(iJ3) != 0;
                riVar.d = cursorG.getInt(iJ4) != 0;
                riVar.e = cursorG.getInt(iJ5) != 0;
                int i6 = iJ2;
                int i7 = iJ3;
                riVar.f = cursorG.getLong(iJ6);
                riVar.g = cursorG.getLong(iJ7);
                riVar.h = wl2.b(cursorG.getBlob(iJ8));
                oa1 oa1Var = new oa1(string, string2);
                oa1Var.b = wl2.n(cursorG.getInt(iJ10));
                oa1Var.d = cursorG.getString(iJ12);
                oa1Var.e = im.a(cursorG.getBlob(iJ13));
                int i8 = i2;
                oa1Var.f = im.a(cursorG.getBlob(i8));
                int i9 = iJ12;
                int i10 = iJ15;
                oa1Var.g = cursorG.getLong(i10);
                int i11 = iJ16;
                int i12 = iJ10;
                oa1Var.h = cursorG.getLong(i11);
                int i13 = iJ4;
                int i14 = iJ17;
                oa1Var.i = cursorG.getLong(i14);
                int i15 = iJ18;
                oa1Var.k = cursorG.getInt(i15);
                int i16 = iJ19;
                int i17 = iJ13;
                oa1Var.l = wl2.k(cursorG.getInt(i16));
                int i18 = iJ20;
                oa1Var.m = cursorG.getLong(i18);
                int i19 = iJ21;
                oa1Var.n = cursorG.getLong(i19);
                int i20 = iJ22;
                oa1Var.o = cursorG.getLong(i20);
                int i21 = iJ23;
                oa1Var.p = cursorG.getLong(i21);
                int i22 = iJ24;
                oa1Var.q = cursorG.getInt(i22) != 0;
                int i23 = iJ25;
                oa1Var.r = wl2.m(cursorG.getInt(i23));
                oa1Var.j = riVar;
                arrayList.add(oa1Var);
                iJ18 = i15;
                iJ10 = i12;
                iJ16 = i11;
                iJ21 = i19;
                iJ4 = i13;
                i2 = i8;
                iJ24 = i22;
                iJ2 = i6;
                iJ15 = i10;
                iJ13 = i17;
                iJ17 = i14;
                iJ19 = i16;
                iJ22 = i20;
                iJ20 = i18;
                iJ11 = i4;
                iJ = i5;
                iJ25 = i23;
                iJ23 = i21;
                iJ12 = i9;
                iJ9 = i3;
                iJ3 = i7;
            }
            cursorG.close();
            rq0Var.k();
            ArrayList arrayListC = h2VarN.c();
            ArrayList arrayListA = h2VarN.a();
            if (arrayList.isEmpty()) {
                t83Var = t83VarK;
                gw3Var = gw3VarL;
                l92Var = l92VarO;
                i = 0;
            } else {
                i = 0;
                h80.d().e(new Throwable[0]);
                h80 h80VarD = h80.d();
                t83Var = t83VarK;
                gw3Var = gw3VarL;
                l92Var = l92VarO;
                a(gw3Var, l92Var, t83Var, arrayList);
                h80VarD.e(new Throwable[0]);
            }
            if (!arrayListC.isEmpty()) {
                h80.d().e(new Throwable[i]);
                h80 h80VarD2 = h80.d();
                a(gw3Var, l92Var, t83Var, arrayListC);
                h80VarD2.e(new Throwable[i]);
            }
            if (!arrayListA.isEmpty()) {
                h80.d().e(new Throwable[i]);
                h80 h80VarD3 = h80.d();
                a(gw3Var, l92Var, t83Var, arrayListA);
                h80VarD3.e(new Throwable[i]);
            }
            return new q70(im.c);
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            rq0Var.k();
            throw th;
        }
    }
}
