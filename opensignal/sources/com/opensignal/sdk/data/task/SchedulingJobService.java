package com.opensignal.sdk.data.task;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Bundle;
import br.l;
import cj.t;
import gi.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/opensignal/sdk/data/task/SchedulingJobService;", "Landroid/app/job/JobService;", "()V", "onStartJob", "", "params", "Landroid/app/job/JobParameters;", "onStopJob", "com.opensignal_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
/* loaded from: classes.dex */
public final class SchedulingJobService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters params) {
        l.e(params, "params");
        ch.l lVar = ch.l.f3962t5;
        Context applicationContext = getApplicationContext();
        l.d(applicationContext, "getApplicationContext(...)");
        if (lVar.f3775a == null) {
            lVar.f3775a = applicationContext;
        }
        Bundle transientExtras = params.getTransientExtras();
        l.d(transientExtras, "getTransientExtras(...)");
        if (lVar.f3906u == null) {
            lVar.f3906u = new a(5);
        }
        a aVar = lVar.f3906u;
        if (aVar == null) {
            l.l("_jobSchedulerTaskMapper");
            throw null;
        }
        si.a aVar2 = (si.a) aVar.g(transientExtras);
        Context applicationContext2 = getApplicationContext();
        l.d(applicationContext2, "getApplicationContext(...)");
        t.b(applicationContext2, aVar2.f22059a, aVar2.f22060b, aVar2.f22061c, "");
        jobFinished(params, false);
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters params) {
        l.e(params, "params");
        return false;
    }
}
