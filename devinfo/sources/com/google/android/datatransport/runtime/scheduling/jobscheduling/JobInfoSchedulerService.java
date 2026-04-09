package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.applovin.impl.sdk.z;
import com.google.android.gms.internal.consent_sdk.d;
import ea.i;
import ea.q;
import java.util.concurrent.Executor;
import k1.b;
import oa.a;
import yb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9012a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i4 = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        q.b(getApplicationContext());
        e eVarA = i.a();
        eVarA.v(string);
        eVarA.f37511d = a.b(i4);
        if (string2 != null) {
            eVarA.f37510c = Base64.decode(string2, 0);
        }
        d dVar = q.a().f22516d;
        ((Executor) dVar.f19299e).execute(new z(i10, 1, dVar, eVarA.i(), new b(1, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
