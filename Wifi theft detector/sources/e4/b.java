package e4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

/* loaded from: classes2.dex */
public class b implements u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20893a;

    /* renamed from: b, reason: collision with root package name */
    public final f4.d f20894b;

    /* renamed from: c, reason: collision with root package name */
    public final SchedulerConfig f20895c;

    public b(Context context, f4.d dVar, SchedulerConfig schedulerConfig) {
        this.f20893a = context;
        this.f20894b = dVar;
        this.f20895c = schedulerConfig;
    }

    @Override // e4.u
    public void a(x3.o oVar, int i10) {
        b(oVar, i10, false);
    }

    @Override // e4.u
    public void b(x3.o oVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f20893a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f20893a.getSystemService("jobscheduler");
        int iC = c(oVar);
        if (!z10 && d(jobScheduler, iC, i10)) {
            b4.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long jL = this.f20894b.L(oVar);
        JobInfo.Builder builderC = this.f20895c.c(new JobInfo.Builder(iC, componentName), oVar.d(), jL, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, i4.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        b4.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(iC), Long.valueOf(this.f20895c.g(oVar.d(), jL, i10)), Long.valueOf(jL), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    public int c(x3.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f20893a.getPackageName().getBytes(Charset.forName(C.UTF8_NAME)));
        adler32.update(oVar.b().getBytes(Charset.forName(C.UTF8_NAME)));
        adler32.update(ByteBuffer.allocate(4).putInt(i4.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i10, int i11) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i12 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
            }
        }
        return false;
    }
}
