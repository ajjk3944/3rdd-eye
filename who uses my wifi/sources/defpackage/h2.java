package defpackage;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h2 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public h2() {
        this.a = new ArrayBlockingQueue(100);
        this.b = new LinkedHashMap();
        this.c = new HashMap();
        this.g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    }

    public ArrayList a() throws Throwable {
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
        int iJ12;
        int iJ13;
        rq0 rq0VarF = rq0.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        rq0VarF.g(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            iJ12 = yb.j(cursorG, "input_merger_class_name");
            iJ13 = yb.j(cursorG, "input");
            rq0Var = rq0VarF;
        } catch (Throwable th) {
            th = th;
            rq0Var = rq0VarF;
        }
        try {
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
            int i = iJ14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iJ9);
                int i2 = iJ9;
                String string2 = cursorG.getString(iJ11);
                int i3 = iJ11;
                ri riVar = new ri();
                int i4 = iJ;
                riVar.a = wl2.l(cursorG.getInt(iJ));
                riVar.b = cursorG.getInt(iJ2) != 0;
                riVar.c = cursorG.getInt(iJ3) != 0;
                riVar.d = cursorG.getInt(iJ4) != 0;
                riVar.e = cursorG.getInt(iJ5) != 0;
                int i5 = iJ2;
                int i6 = iJ3;
                riVar.f = cursorG.getLong(iJ6);
                riVar.g = cursorG.getLong(iJ7);
                riVar.h = wl2.b(cursorG.getBlob(iJ8));
                oa1 oa1Var = new oa1(string, string2);
                oa1Var.b = wl2.n(cursorG.getInt(iJ10));
                oa1Var.d = cursorG.getString(iJ12);
                oa1Var.e = im.a(cursorG.getBlob(iJ13));
                int i7 = i;
                oa1Var.f = im.a(cursorG.getBlob(i7));
                int i8 = iJ13;
                int i9 = iJ15;
                oa1Var.g = cursorG.getLong(i9);
                i = i7;
                int i10 = iJ16;
                oa1Var.h = cursorG.getLong(i10);
                int i11 = iJ4;
                int i12 = iJ17;
                oa1Var.i = cursorG.getLong(i12);
                int i13 = iJ18;
                oa1Var.k = cursorG.getInt(i13);
                int i14 = iJ19;
                oa1Var.l = wl2.k(cursorG.getInt(i14));
                iJ17 = i12;
                int i15 = iJ20;
                oa1Var.m = cursorG.getLong(i15);
                int i16 = iJ21;
                oa1Var.n = cursorG.getLong(i16);
                iJ21 = i16;
                int i17 = iJ22;
                oa1Var.o = cursorG.getLong(i17);
                int i18 = iJ23;
                oa1Var.p = cursorG.getLong(i18);
                int i19 = iJ24;
                oa1Var.q = cursorG.getInt(i19) != 0;
                int i20 = iJ25;
                oa1Var.r = wl2.m(cursorG.getInt(i20));
                oa1Var.j = riVar;
                arrayList.add(oa1Var);
                iJ20 = i15;
                iJ4 = i11;
                iJ19 = i14;
                iJ25 = i20;
                iJ2 = i5;
                iJ15 = i9;
                iJ16 = i10;
                iJ18 = i13;
                iJ23 = i18;
                iJ11 = i3;
                iJ = i4;
                iJ24 = i19;
                iJ22 = i17;
                iJ13 = i8;
                iJ9 = i2;
                iJ3 = i6;
            }
            cursorG.close();
            rq0Var.k();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            rq0Var.k();
            throw th;
        }
    }

    public ArrayList b(int i) throws Throwable {
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
        int iJ12;
        int iJ13;
        rq0 rq0VarF = rq0.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        rq0VarF.g(1, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
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
            iJ12 = yb.j(cursorG, "input_merger_class_name");
            iJ13 = yb.j(cursorG, "input");
            rq0Var = rq0VarF;
        } catch (Throwable th) {
            th = th;
            rq0Var = rq0VarF;
        }
        try {
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
                int i9 = iJ15;
                int i10 = iJ13;
                oa1Var.g = cursorG.getLong(i9);
                i2 = i8;
                int i11 = iJ16;
                oa1Var.h = cursorG.getLong(i11);
                int i12 = iJ4;
                int i13 = iJ17;
                oa1Var.i = cursorG.getLong(i13);
                int i14 = iJ18;
                oa1Var.k = cursorG.getInt(i14);
                int i15 = iJ19;
                oa1Var.l = wl2.k(cursorG.getInt(i15));
                iJ17 = i13;
                int i16 = iJ20;
                oa1Var.m = cursorG.getLong(i16);
                int i17 = iJ21;
                oa1Var.n = cursorG.getLong(i17);
                iJ21 = i17;
                int i18 = iJ22;
                oa1Var.o = cursorG.getLong(i18);
                int i19 = iJ23;
                oa1Var.p = cursorG.getLong(i19);
                int i20 = iJ24;
                oa1Var.q = cursorG.getInt(i20) != 0;
                int i21 = iJ25;
                oa1Var.r = wl2.m(cursorG.getInt(i21));
                oa1Var.j = riVar;
                arrayList.add(oa1Var);
                iJ20 = i16;
                iJ4 = i12;
                iJ19 = i15;
                iJ25 = i21;
                iJ2 = i6;
                iJ23 = i19;
                iJ9 = i3;
                iJ11 = i4;
                iJ = i5;
                iJ24 = i20;
                iJ13 = i10;
                iJ15 = i9;
                iJ16 = i11;
                iJ18 = i14;
                iJ22 = i18;
                iJ3 = i7;
            }
            cursorG.close();
            rq0Var.k();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            rq0Var.k();
            throw th;
        }
    }

    public ArrayList c() throws Throwable {
        rq0 rq0Var;
        rq0 rq0VarF = rq0.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(rq0VarF);
        try {
            int iJ = yb.j(cursorG, "required_network_type");
            int iJ2 = yb.j(cursorG, "requires_charging");
            int iJ3 = yb.j(cursorG, "requires_device_idle");
            int iJ4 = yb.j(cursorG, "requires_battery_not_low");
            int iJ5 = yb.j(cursorG, "requires_storage_not_low");
            int iJ6 = yb.j(cursorG, "trigger_content_update_delay");
            int iJ7 = yb.j(cursorG, "trigger_max_content_delay");
            int iJ8 = yb.j(cursorG, "content_uri_triggers");
            int iJ9 = yb.j(cursorG, "id");
            int iJ10 = yb.j(cursorG, "state");
            int iJ11 = yb.j(cursorG, "worker_class_name");
            int iJ12 = yb.j(cursorG, "input_merger_class_name");
            int iJ13 = yb.j(cursorG, "input");
            rq0Var = rq0VarF;
            try {
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
                int i = iJ14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iJ9);
                    int i2 = iJ9;
                    String string2 = cursorG.getString(iJ11);
                    int i3 = iJ11;
                    ri riVar = new ri();
                    int i4 = iJ;
                    riVar.a = wl2.l(cursorG.getInt(iJ));
                    riVar.b = cursorG.getInt(iJ2) != 0;
                    riVar.c = cursorG.getInt(iJ3) != 0;
                    riVar.d = cursorG.getInt(iJ4) != 0;
                    riVar.e = cursorG.getInt(iJ5) != 0;
                    int i5 = iJ2;
                    int i6 = iJ3;
                    riVar.f = cursorG.getLong(iJ6);
                    riVar.g = cursorG.getLong(iJ7);
                    riVar.h = wl2.b(cursorG.getBlob(iJ8));
                    oa1 oa1Var = new oa1(string, string2);
                    oa1Var.b = wl2.n(cursorG.getInt(iJ10));
                    oa1Var.d = cursorG.getString(iJ12);
                    oa1Var.e = im.a(cursorG.getBlob(iJ13));
                    int i7 = i;
                    oa1Var.f = im.a(cursorG.getBlob(i7));
                    int i8 = iJ13;
                    int i9 = iJ15;
                    oa1Var.g = cursorG.getLong(i9);
                    i = i7;
                    int i10 = iJ16;
                    oa1Var.h = cursorG.getLong(i10);
                    int i11 = iJ4;
                    int i12 = iJ17;
                    oa1Var.i = cursorG.getLong(i12);
                    int i13 = iJ18;
                    oa1Var.k = cursorG.getInt(i13);
                    int i14 = iJ19;
                    oa1Var.l = wl2.k(cursorG.getInt(i14));
                    iJ17 = i12;
                    int i15 = iJ20;
                    oa1Var.m = cursorG.getLong(i15);
                    int i16 = iJ21;
                    oa1Var.n = cursorG.getLong(i16);
                    iJ21 = i16;
                    int i17 = iJ22;
                    oa1Var.o = cursorG.getLong(i17);
                    int i18 = iJ23;
                    oa1Var.p = cursorG.getLong(i18);
                    int i19 = iJ24;
                    oa1Var.q = cursorG.getInt(i19) != 0;
                    int i20 = iJ25;
                    oa1Var.r = wl2.m(cursorG.getInt(i20));
                    oa1Var.j = riVar;
                    arrayList.add(oa1Var);
                    iJ20 = i15;
                    iJ4 = i11;
                    iJ19 = i14;
                    iJ25 = i20;
                    iJ2 = i5;
                    iJ15 = i9;
                    iJ16 = i10;
                    iJ18 = i13;
                    iJ23 = i18;
                    iJ11 = i3;
                    iJ = i4;
                    iJ24 = i19;
                    iJ22 = i17;
                    iJ13 = i8;
                    iJ9 = i2;
                    iJ3 = i6;
                }
                cursorG.close();
                rq0Var.k();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                rq0Var.k();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            rq0Var = rq0VarF;
        }
    }

    public ArrayList d() {
        rq0 rq0Var;
        rq0 rq0VarF = rq0.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(rq0VarF);
        try {
            int iJ = yb.j(cursorG, "required_network_type");
            int iJ2 = yb.j(cursorG, "requires_charging");
            int iJ3 = yb.j(cursorG, "requires_device_idle");
            int iJ4 = yb.j(cursorG, "requires_battery_not_low");
            int iJ5 = yb.j(cursorG, "requires_storage_not_low");
            int iJ6 = yb.j(cursorG, "trigger_content_update_delay");
            int iJ7 = yb.j(cursorG, "trigger_max_content_delay");
            int iJ8 = yb.j(cursorG, "content_uri_triggers");
            int iJ9 = yb.j(cursorG, "id");
            int iJ10 = yb.j(cursorG, "state");
            int iJ11 = yb.j(cursorG, "worker_class_name");
            int iJ12 = yb.j(cursorG, "input_merger_class_name");
            int iJ13 = yb.j(cursorG, "input");
            rq0Var = rq0VarF;
            try {
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
                int i = iJ14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iJ9);
                    int i2 = iJ9;
                    String string2 = cursorG.getString(iJ11);
                    int i3 = iJ11;
                    ri riVar = new ri();
                    int i4 = iJ;
                    riVar.a = wl2.l(cursorG.getInt(iJ));
                    riVar.b = cursorG.getInt(iJ2) != 0;
                    riVar.c = cursorG.getInt(iJ3) != 0;
                    riVar.d = cursorG.getInt(iJ4) != 0;
                    riVar.e = cursorG.getInt(iJ5) != 0;
                    int i5 = iJ2;
                    int i6 = iJ3;
                    riVar.f = cursorG.getLong(iJ6);
                    riVar.g = cursorG.getLong(iJ7);
                    riVar.h = wl2.b(cursorG.getBlob(iJ8));
                    oa1 oa1Var = new oa1(string, string2);
                    oa1Var.b = wl2.n(cursorG.getInt(iJ10));
                    oa1Var.d = cursorG.getString(iJ12);
                    oa1Var.e = im.a(cursorG.getBlob(iJ13));
                    int i7 = i;
                    oa1Var.f = im.a(cursorG.getBlob(i7));
                    int i8 = iJ13;
                    int i9 = iJ15;
                    oa1Var.g = cursorG.getLong(i9);
                    i = i7;
                    int i10 = iJ16;
                    oa1Var.h = cursorG.getLong(i10);
                    int i11 = iJ4;
                    int i12 = iJ17;
                    oa1Var.i = cursorG.getLong(i12);
                    int i13 = iJ18;
                    oa1Var.k = cursorG.getInt(i13);
                    int i14 = iJ19;
                    oa1Var.l = wl2.k(cursorG.getInt(i14));
                    iJ17 = i12;
                    int i15 = iJ20;
                    oa1Var.m = cursorG.getLong(i15);
                    int i16 = iJ21;
                    oa1Var.n = cursorG.getLong(i16);
                    iJ21 = i16;
                    int i17 = iJ22;
                    oa1Var.o = cursorG.getLong(i17);
                    int i18 = iJ23;
                    oa1Var.p = cursorG.getLong(i18);
                    int i19 = iJ24;
                    oa1Var.q = cursorG.getInt(i19) != 0;
                    int i20 = iJ25;
                    oa1Var.r = wl2.m(cursorG.getInt(i20));
                    oa1Var.j = riVar;
                    arrayList.add(oa1Var);
                    iJ20 = i15;
                    iJ4 = i11;
                    iJ19 = i14;
                    iJ25 = i20;
                    iJ2 = i5;
                    iJ15 = i9;
                    iJ16 = i10;
                    iJ18 = i13;
                    iJ23 = i18;
                    iJ11 = i3;
                    iJ = i4;
                    iJ24 = i19;
                    iJ22 = i17;
                    iJ13 = i8;
                    iJ9 = i2;
                    iJ3 = i6;
                }
                cursorG.close();
                rq0Var.k();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                rq0Var.k();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            rq0Var = rq0VarF;
        }
    }

    public int e(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        rq0 rq0VarF = rq0.f("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            rq0VarF.h(1);
        } else {
            rq0VarF.i(str, 1);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(rq0VarF);
        try {
            return cursorG.moveToFirst() ? wl2.n(cursorG.getInt(0)) : 0;
        } finally {
            cursorG.close();
            rq0VarF.k();
        }
    }

    public ArrayList f() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        rq0 rq0VarF = rq0.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        rq0VarF.h(1);
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(rq0VarF);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            rq0VarF.k();
        }
    }

    public ArrayList g() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        rq0 rq0VarF = rq0.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        rq0VarF.i("offline_ping_sender_work", 1);
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(rq0VarF);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            rq0VarF.k();
        }
    }

    public oa1 h(String str) {
        rq0 rq0Var;
        oa1 oa1Var;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        rq0 rq0VarF = rq0.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            rq0VarF.h(1);
        } else {
            rq0VarF.i(str, 1);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(rq0VarF);
        try {
            int iJ = yb.j(cursorG, "required_network_type");
            int iJ2 = yb.j(cursorG, "requires_charging");
            int iJ3 = yb.j(cursorG, "requires_device_idle");
            int iJ4 = yb.j(cursorG, "requires_battery_not_low");
            int iJ5 = yb.j(cursorG, "requires_storage_not_low");
            int iJ6 = yb.j(cursorG, "trigger_content_update_delay");
            int iJ7 = yb.j(cursorG, "trigger_max_content_delay");
            int iJ8 = yb.j(cursorG, "content_uri_triggers");
            int iJ9 = yb.j(cursorG, "id");
            int iJ10 = yb.j(cursorG, "state");
            int iJ11 = yb.j(cursorG, "worker_class_name");
            int iJ12 = yb.j(cursorG, "input_merger_class_name");
            int iJ13 = yb.j(cursorG, "input");
            int iJ14 = yb.j(cursorG, "output");
            rq0Var = rq0VarF;
            try {
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
                if (cursorG.moveToFirst()) {
                    String string = cursorG.getString(iJ9);
                    String string2 = cursorG.getString(iJ11);
                    ri riVar = new ri();
                    riVar.a = wl2.l(cursorG.getInt(iJ));
                    riVar.b = cursorG.getInt(iJ2) != 0;
                    riVar.c = cursorG.getInt(iJ3) != 0;
                    riVar.d = cursorG.getInt(iJ4) != 0;
                    riVar.e = cursorG.getInt(iJ5) != 0;
                    riVar.f = cursorG.getLong(iJ6);
                    riVar.g = cursorG.getLong(iJ7);
                    riVar.h = wl2.b(cursorG.getBlob(iJ8));
                    oa1Var = new oa1(string, string2);
                    oa1Var.b = wl2.n(cursorG.getInt(iJ10));
                    oa1Var.d = cursorG.getString(iJ12);
                    oa1Var.e = im.a(cursorG.getBlob(iJ13));
                    oa1Var.f = im.a(cursorG.getBlob(iJ14));
                    oa1Var.g = cursorG.getLong(iJ15);
                    oa1Var.h = cursorG.getLong(iJ16);
                    oa1Var.i = cursorG.getLong(iJ17);
                    oa1Var.k = cursorG.getInt(iJ18);
                    oa1Var.l = wl2.k(cursorG.getInt(iJ19));
                    oa1Var.m = cursorG.getLong(iJ20);
                    oa1Var.n = cursorG.getLong(iJ21);
                    oa1Var.o = cursorG.getLong(iJ22);
                    oa1Var.p = cursorG.getLong(iJ23);
                    oa1Var.q = cursorG.getInt(iJ24) != 0;
                    oa1Var.r = wl2.m(cursorG.getInt(iJ25));
                    oa1Var.j = riVar;
                } else {
                    oa1Var = null;
                }
                cursorG.close();
                rq0Var.k();
                return oa1Var;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                rq0Var.k();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            rq0Var = rq0VarF;
        }
    }

    public void i(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        tz0 tz0Var = (tz0) this.f;
        px pxVarA = tz0Var.a();
        if (str == null) {
            pxVarA.g(1);
        } else {
            pxVarA.h(str, 1);
        }
        workDatabase_Impl.c();
        try {
            pxVarA.i.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            tz0Var.c(pxVarA);
        }
    }

    public void j(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        tz0 tz0Var = (tz0) this.h;
        px pxVarA = tz0Var.a();
        pxVarA.f(1, j);
        if (str == null) {
            pxVarA.g(2);
        } else {
            pxVarA.h(str, 2);
        }
        workDatabase_Impl.c();
        try {
            pxVarA.i.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            tz0Var.c(pxVarA);
        }
    }

    public void k(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        tz0 tz0Var = (tz0) this.g;
        px pxVarA = tz0Var.a();
        if (str == null) {
            pxVarA.g(1);
        } else {
            pxVarA.h(str, 1);
        }
        workDatabase_Impl.c();
        try {
            pxVarA.i.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            tz0Var.c(pxVarA);
        }
    }

    public void l(String str, im imVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        tz0 tz0Var = (tz0) this.d;
        px pxVarA = tz0Var.a();
        byte[] bArrC = im.c(imVar);
        if (bArrC == null) {
            pxVarA.g(1);
        } else {
            pxVarA.c(1, bArrC);
        }
        if (str == null) {
            pxVarA.g(2);
        } else {
            pxVarA.h(str, 2);
        }
        workDatabase_Impl.c();
        try {
            pxVarA.t();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            tz0Var.c(pxVarA);
        }
    }

    public void m(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        tz0 tz0Var = (tz0) this.e;
        px pxVarA = tz0Var.a();
        pxVarA.f(1, j);
        if (str == null) {
            pxVarA.g(2);
        } else {
            pxVarA.h(str, 2);
        }
        workDatabase_Impl.c();
        try {
            pxVarA.t();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            tz0Var.c(pxVarA);
        }
    }

    public void n(int i, String... strArr) throws SQLException {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append("?");
            if (i2 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String string = sb.toString();
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        SQLiteStatement sQLiteStatementCompileStatement = ((SQLiteDatabase) workDatabase_Impl.c.j().g).compileStatement(string);
        sQLiteStatementCompileStatement.bindLong(1, wl2.w(i));
        int i3 = 2;
        for (String str : strArr) {
            if (str == null) {
                sQLiteStatementCompileStatement.bindNull(i3);
            } else {
                sQLiteStatementCompileStatement.bindString(i3, str);
            }
            i3++;
        }
        workDatabase_Impl.c();
        try {
            sQLiteStatementCompileStatement.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public vg0 o() {
        i41.P((Context) this.c, Context.class);
        i41.P((HashMap) this.g, Map.class);
        i41.P((fr1) this.h, fr1.class);
        i41.P((eg3) this.i, eg3.class);
        return new vg0((ep2) this.a, (p21) this.b, (Context) this.c, (View) this.d, (Activity) this.e, (String) this.f, (HashMap) this.g, (fr1) this.h, (eg3) this.i);
    }

    public LinkedHashMap p(LinkedHashMap linkedHashMap, Map map) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap2.get(str);
            qz1 qz1Var = (qz1) ((HashMap) this.c).get(str);
            if (qz1Var == null) {
                qz1Var = qz1.b;
            }
            linkedHashMap2.put(str, qz1Var.a(str3, str2));
        }
        return linkedHashMap2;
    }

    public void q(a83 a83Var) {
        n70 n70VarB;
        synchronized (this) {
            Iterator it = a83Var.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    n70VarB = pu1.B(new hx2(3));
                    break;
                }
                zz2 zz2VarA = ((gl2) this.c).a((String) it.next(), a83Var.b);
                if (zz2VarA != null && zz2VarA.a((h83) this.i, a83Var)) {
                    n70VarB = pu1.N(zz2VarA.b((h83) this.i, a83Var), a83Var.R, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.b);
                    break;
                }
            }
        }
        ((o13) this.d).b((h83) this.i, a83Var, n70VarB, (db3) this.e);
        n70VarB.c(new jq3(n70VarB, new mr2(this, a83Var, 5), 0), (Executor) this.a);
    }

    public void r(LinkedHashMap linkedHashMap, sz1 sz1Var) {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.d).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (sz1Var != null) {
            String str = sz1Var.g;
            String str2 = sz1Var.f;
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&it=");
                sb.append(str2);
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append("&blat=");
                sb.append(str);
            }
            string = sb.toString();
        }
        FileOutputStream fileOutputStream = null;
        if (!((AtomicBoolean) this.h).get()) {
            lf4 lf4Var = hg4.C.c;
            new w72((Context) this.e, (String) this.f, string, null).r1();
            return;
        }
        File file = (File) this.i;
        if (file == null) {
            gi2.i0("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                        gi2.q0(5);
                    }
                } catch (IOException unused2) {
                    fileOutputStream = fileOutputStream2;
                    gi2.q0(5);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                            gi2.q0(5);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                            gi2.q0(5);
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public h2(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new io(workDatabase_Impl, 5);
        this.c = new tz0(workDatabase_Impl, 3);
        this.d = new tz0(workDatabase_Impl, 4);
        this.e = new tz0(workDatabase_Impl, 5);
        this.f = new tz0(workDatabase_Impl, 6);
        this.g = new tz0(workDatabase_Impl, 7);
        this.h = new tz0(workDatabase_Impl, 8);
        this.i = new tz0(workDatabase_Impl, 9);
        new AtomicBoolean(false);
    }
}
