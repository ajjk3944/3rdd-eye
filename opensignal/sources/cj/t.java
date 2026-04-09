package cj;

import ak.v0;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.opensignal.sdk.data.task.ExecutingJobService;
import com.opensignal.sdk.data.task.TaskSdkService;

/* loaded from: classes.dex */
public final class t {
    public static void a(Context context, Bundle bundle) {
        ch.l lVar = ch.l.f3962t5;
        Context applicationContext = context.getApplicationContext();
        br.l.d(applicationContext, "getApplicationContext(...)");
        if (lVar.f3775a == null) {
            lVar.f3775a = applicationContext;
        }
        if (!lVar.F().c()) {
            TaskSdkService.Companion.getClass();
            context.startService(r.a(context, bundle));
            return;
        }
        ExecutingJobService.Companion.getClass();
        String string = bundle.getString("EXECUTION_TYPE");
        e eVarValueOf = string != null ? e.valueOf(string) : null;
        if (eVarValueOf == null) {
            ch.n.c("ExecutingJobService", "Execution type not found. Don't schedule.");
            return;
        }
        int id2 = eVarValueOf.getId() + 44884488;
        ch.n.b("ExecutingJobService", "Schedule Job: " + id2 + " executionType: " + eVarValueOf);
        JobInfo.Builder builder = new JobInfo.Builder(id2, new ComponentName(context, (Class<?>) ExecutingJobService.class));
        builder.setOverrideDeadline(3000L);
        builder.setPersisted(false);
        builder.setTransientExtras(bundle);
        try {
            JobInfo jobInfoBuild = builder.build();
            JobScheduler jobSchedulerT = lVar.T();
            int iSchedule = jobSchedulerT.schedule(jobInfoBuild);
            ch.n.b("ExecutingJobService", "Scheduled event result: " + iSchedule);
            if (iSchedule == 0) {
                String str = "Error scheduling in task executor " + jobInfoBuild + "\nTotal pending jobs is " + jobSchedulerT.getAllPendingJobs().size();
                ch.n.b("ExecutingJobService", str);
                lVar.r();
                a.F(str);
            }
        } catch (Exception e4) {
            ch.n.e("ExecutingJobService", e4);
            ch.l.f3962t5.r();
            a.E(e4, "ExecutingJobService: schedule()");
        }
    }

    public static Intent b(Context context, long j, String str, gk.c cVar, String str2) {
        br.l.e(context, "context");
        br.l.e(str, "taskType");
        br.l.e(cVar, "schedule");
        ch.l lVar = ch.l.f3962t5;
        lVar.k();
        Bundle bundle = new Bundle();
        ic.a.F(bundle, "EXECUTION_TYPE", e.SCHEDULE_TASK);
        bundle.putLong("SCHEDULE_TASK_ID", j);
        bundle.putString("SCHEDULE_TASK_TYPE", str);
        bundle.putString("SCHEDULE_JOB_NAME", "");
        bundle.putString("TASK_NAME_OVERRIDE", str2);
        if (cVar.f9624l ? false : lVar.F().c()) {
            a(context, bundle);
            ch.n.b("TaskServiceInternal", "Service can't be bound. Schedule but don't return intent");
            return null;
        }
        TaskSdkService.Companion.getClass();
        Intent intentA = r.a(context, bundle);
        context.startService(intentA);
        return intentA;
    }

    public static void c(Context context, String str) {
        gk.c cVar = gk.c.f9614o;
        br.l.e(context, "context");
        br.l.e(cVar, "schedule");
        ch.l lVar = ch.l.f3962t5;
        hk.h hVarS0 = lVar.P0().s0(str);
        if (hVarS0 == null) {
            v0 v0VarF0 = lVar.n().F0(str);
            hVarS0 = v0VarF0 != null ? lVar.N0().a(v0VarF0) : null;
        }
        if (hVarS0 == null) {
            ch.n.c("TaskServiceInternal", "Task does not exist. Returning null.");
        } else {
            hk.h hVar = hVarS0;
            b(context, hVar.f10804a, hVar.f10805b, cVar, "");
        }
    }

    public static void d(Context context, boolean z10) {
        br.l.e(context, "context");
        ch.l.f3962t5.k();
        Bundle bundle = new Bundle();
        ic.a.F(bundle, "EXECUTION_TYPE", e.SET_APP_VISIBLE);
        bundle.putBoolean("APP_VISIBLE", z10);
        a(context, bundle);
    }

    public static void e(Context context, boolean z10) {
        br.l.e(context, "context");
        ch.l.f3962t5.k();
        Bundle bundle = new Bundle();
        ic.a.F(bundle, "EXECUTION_TYPE", e.SET_CONSENT);
        bundle.putBoolean("CONSENT_GIVEN", z10);
        a(context, bundle);
    }
}
