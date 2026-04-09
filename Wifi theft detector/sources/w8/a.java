package w8;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.vungle.ads.internal.signals.SignalManager;
import com.wifihacker.detector.task.ScanJobSchedulerService;
import g8.k;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static a f24841a;

    public static a b() {
        if (f24841a == null) {
            f24841a = new a();
        }
        return f24841a;
    }

    public void a(Context context) {
        ((JobScheduler) context.getSystemService("jobscheduler")).cancel(2);
    }

    public final long c(String str) {
        try {
            return new SimpleDateFormat("yy-MM-dd HH:mm:ss").parse(new SimpleDateFormat("yy-MM-dd").format(new Date()) + " " + str).getTime();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    public void d(Context context, int i10) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        JobInfo.Builder builder = new JobInfo.Builder(i10, new ComponentName(context.getPackageName(), ScanJobSchedulerService.class.getName()));
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == i10) {
                return;
            }
        }
        builder.setPeriodic(SignalManager.TWENTY_FOUR_HOURS_MILLIS);
        builder.setRequiredNetworkType(2);
        jobScheduler.schedule(builder.build());
    }

    public final void e(Context context, int i10, String str) {
        long jC = c(str) - System.currentTimeMillis();
        if (jC < 0) {
            jC += SignalManager.TWENTY_FOUR_HOURS_MILLIS;
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == i10) {
                return;
            }
        }
        JobInfo.Builder builder = new JobInfo.Builder(i10, new ComponentName(context.getPackageName(), ScanJobSchedulerService.class.getName()));
        builder.setMinimumLatency(jC);
        try {
            jobScheduler.schedule(builder.build());
        } catch (Exception e10) {
            k.c("ScanNoticeManager startScanJobScheduler exception", e10);
        }
    }

    public void f(Context context) {
        e(context, 1, "10:00:00");
        e(context, 2, "20:00:00");
    }
}
