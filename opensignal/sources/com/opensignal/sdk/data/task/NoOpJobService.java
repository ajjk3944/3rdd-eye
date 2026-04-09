package com.opensignal.sdk.data.task;

import a5.o;
import ah.f;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import br.l;
import ch.n;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/opensignal/sdk/data/task/NoOpJobService;", "Landroid/app/job/JobService;", "()V", "executor", "Ljava/util/concurrent/ExecutorService;", "onStartJob", "", "params", "Landroid/app/job/JobParameters;", "onStopJob", "com.opensignal_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(21)
/* loaded from: classes.dex */
public final class NoOpJobService extends JobService {
    private ExecutorService executor;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStartJob$lambda$1(NoOpJobService noOpJobService, JobParameters jobParameters) {
        l.e(noOpJobService, "this$0");
        l.e(jobParameters, "$params");
        try {
            try {
                String strC = ch.l.f3962t5.F0().C();
                if (strC != null) {
                    Context applicationContext = noOpJobService.getApplicationContext();
                    l.d(applicationContext, "getApplicationContext(...)");
                    f.b(applicationContext, strC);
                }
                Thread.sleep(180000L);
                noOpJobService.jobFinished(jobParameters, true);
            } catch (Exception e4) {
                n.d("NoOpJobService", "Error running LongRunningJobService", e4);
                Thread.currentThread().interrupt();
                noOpJobService.jobFinished(jobParameters, true);
            }
        } catch (Throwable th2) {
            noOpJobService.jobFinished(jobParameters, true);
            throw th2;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters params) {
        l.e(params, "params");
        ch.l lVar = ch.l.f3962t5;
        Context applicationContext = getApplicationContext();
        l.d(applicationContext, "getApplicationContext(...)");
        if (lVar.f3775a == null) {
            lVar.f3775a = applicationContext;
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(lVar.D0());
        l.d(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.executor = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new o(this, 8, params));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters params) {
        l.e(params, "params");
        ExecutorService executorService = this.executor;
        if (executorService != null) {
            executorService.shutdownNow();
            return false;
        }
        l.l("executor");
        throw null;
    }
}
