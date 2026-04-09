package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import C.T;
import E3.f;
import I3.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import y3.j;
import y3.r;
import y3.u;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f22440b = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        u.b(getApplicationContext());
        j.a aVarA = r.a();
        aVarA.b(string);
        aVarA.f48080c = a.b(i);
        if (string2 != null) {
            aVarA.f48079b = Base64.decode(string2, 0);
        }
        E3.j jVar = u.a().f48105d;
        j jVarA = aVarA.a();
        T t10 = new T(3, this, jobParameters);
        jVar.getClass();
        jVar.f1401e.execute(new f(jVar, jVarA, i10, t10));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
