package com.opensignal.sdk.data.task;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Bundle;
import ch.l;
import ch.n;
import cj.c;
import cj.d;
import cj.e;
import cj.i;
import cj.j;
import kc.f;
import kotlin.Metadata;
import lq.h;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/opensignal/sdk/data/task/ExecutingJobService;", "Landroid/app/job/JobService;", "<init>", "()V", "Landroid/app/job/JobParameters;", "params", "", "onStartJob", "(Landroid/app/job/JobParameters;)Z", "onStopJob", "Lcj/j;", "jobServiceCommandExecutor$delegate", "Llq/h;", "getJobServiceCommandExecutor", "()Lcj/j;", "jobServiceCommandExecutor", "Companion", "cj/c", "com.opensignal_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
/* loaded from: classes.dex */
public final class ExecutingJobService extends JobService {
    public static final c Companion = new c();

    /* renamed from: jobServiceCommandExecutor$delegate, reason: from kotlin metadata */
    private final h jobServiceCommandExecutor = f.F(d.f3980d);

    private final j getJobServiceCommandExecutor() {
        return (j) this.jobServiceCommandExecutor.getValue();
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters params) {
        if ((params != null ? params.getTransientExtras() : null) == null) {
            n.g("ExecutingJobService", "No extras found. Do nothing");
            return false;
        }
        l lVar = l.f3962t5;
        Context applicationContext = getApplicationContext();
        br.l.d(applicationContext, "getApplicationContext(...)");
        if (lVar.f3775a == null) {
            lVar.f3775a = applicationContext;
        }
        Bundle transientExtras = params.getTransientExtras();
        br.l.d(transientExtras, "getTransientExtras(...)");
        String string = transientExtras.getString("EXECUTION_TYPE");
        e eVarValueOf = string != null ? e.valueOf(string) : null;
        getJobServiceCommandExecutor().f3987g = this;
        getJobServiceCommandExecutor().b1(eVarValueOf, new i(params));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters params) {
        getJobServiceCommandExecutor().f3987g = null;
        return false;
    }
}
