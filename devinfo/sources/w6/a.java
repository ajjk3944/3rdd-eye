package w6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import e4.e0;
import java.util.List;
import nk.k;
import t6.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f36487a;

    static {
        String strG = v.g("SystemJobScheduler");
        k.d(strG, "tagWithPrefix(...)");
        f36487a = strG;
    }

    public static final List a(JobScheduler jobScheduler) {
        k.e(jobScheduler, "<this>");
        try {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            k.d(allPendingJobs, "getAllPendingJobs(...)");
            return allPendingJobs;
        } catch (Throwable th2) {
            v.e().d(f36487a, "getAllPendingJobs() is not reliable on this device.", th2);
            return null;
        }
    }

    public static final JobScheduler b(Context context) {
        k.e(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        k.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? e0.c(jobScheduler) : jobScheduler;
    }
}
