package com.opensignal.sdk.data.task;

import a5.o;
import ah.f;
import ak.g;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import br.l;
import ch.n;
import cj.u;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/opensignal/sdk/data/task/TickJobService;", "Landroid/app/job/JobService;", "<init>", "()V", "Landroid/app/job/JobParameters;", "params", "", "onStartJob", "(Landroid/app/job/JobParameters;)Z", "onStopJob", "Companion", "cj/u", "com.opensignal_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(21)
/* loaded from: classes.dex */
public final class TickJobService extends JobService {
    public static final u Companion = new u();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStartJob$lambda$1(TickJobService tickJobService, JobParameters jobParameters) {
        l.e(tickJobService, "this$0");
        ch.l lVar = ch.l.f3962t5;
        String strC = lVar.F0().C();
        if (strC != null) {
            Context applicationContext = tickJobService.getApplicationContext();
            l.d(applicationContext, "getApplicationContext(...)");
            f.b(applicationContext, strC);
        }
        if (((g) lVar.n().f20680g).f529f.f449a.C) {
            tickJobService.jobFinished(jobParameters, false);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters params) {
        n.b("TickJobService", "onStartJob() called with: params = " + params);
        ch.l lVar = ch.l.f3962t5;
        Context applicationContext = getApplicationContext();
        l.d(applicationContext, "getApplicationContext(...)");
        if (lVar.f3775a == null) {
            lVar.f3775a = applicationContext;
        }
        lVar.I().execute(new o(this, 9, params));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters params) {
        return true;
    }
}
