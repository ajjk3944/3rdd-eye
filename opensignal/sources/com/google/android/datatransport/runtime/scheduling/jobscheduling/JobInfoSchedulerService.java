package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import al.b;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import io.sentry.k;
import java.util.concurrent.Executor;
import m9.i;
import m9.o;
import s9.c;
import s9.e;
import w9.a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4019a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        o.b(getApplicationContext());
        k kVarA = i.a();
        kVarA.m0(string);
        kVarA.f12399r = a.b(i10);
        if (string2 != null) {
            kVarA.f12398g = Base64.decode(string2, 0);
        }
        b bVar = o.a().f16374d;
        ((Executor) bVar.f814f).execute(new e(bVar, kVarA.n(), i11, new c(this, 0, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
