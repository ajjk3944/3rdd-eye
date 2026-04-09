package j3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import c3.AbstractC4215p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import g3.AbstractC5861a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import k3.InterfaceC6370d;
import n3.AbstractC6868a;

/* loaded from: classes.dex */
public class d implements x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50056a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6370d f50057b;

    /* renamed from: c, reason: collision with root package name */
    private final f f50058c;

    public d(Context context, InterfaceC6370d interfaceC6370d, f fVar) {
        this.f50056a = context;
        this.f50057b = interfaceC6370d;
        this.f50058c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }

    @Override // j3.x
    public void a(AbstractC4215p abstractC4215p, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f50056a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f50056a.getSystemService("jobscheduler");
        int iC = c(abstractC4215p);
        if (!z10 && d(jobScheduler, iC, i10)) {
            AbstractC5861a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC4215p);
            return;
        }
        long jA0 = this.f50057b.a0(abstractC4215p);
        JobInfo.Builder builderC = this.f50058c.c(new JobInfo.Builder(iC, componentName), abstractC4215p.d(), jA0, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", abstractC4215p.b());
        persistableBundle.putInt("priority", AbstractC6868a.a(abstractC4215p.d()));
        if (abstractC4215p.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC4215p.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        AbstractC5861a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC4215p, Integer.valueOf(iC), Long.valueOf(this.f50058c.g(abstractC4215p.d(), jA0, i10)), Long.valueOf(jA0), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    @Override // j3.x
    public void b(AbstractC4215p abstractC4215p, int i10) {
        a(abstractC4215p, i10, false);
    }

    int c(AbstractC4215p abstractC4215p) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f50056a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC4215p.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(AbstractC6868a.a(abstractC4215p.d())).array());
        if (abstractC4215p.c() != null) {
            adler32.update(abstractC4215p.c());
        }
        return (int) adler32.getValue();
    }
}
