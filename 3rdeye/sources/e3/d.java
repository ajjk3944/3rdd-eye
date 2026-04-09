package E3;

import E3.e;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.singular.sdk.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import y3.r;

/* compiled from: JobInfoScheduler.java */
/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1380a;

    /* renamed from: b, reason: collision with root package name */
    public final F3.d f1381b;

    /* renamed from: c, reason: collision with root package name */
    public final e f1382c;

    public d(Context context, F3.d dVar, e eVar) {
        this.f1380a = context;
        this.f1381b = dVar;
        this.f1382c = eVar;
    }

    @Override // E3.n
    public final void a(r rVar, int i) {
        b(rVar, i, false);
    }

    @Override // E3.n
    public final void b(r rVar, int i, boolean z10) {
        Context context = this.f1380a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(rVar.b().getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(ByteBuffer.allocate(4).putInt(I3.a.a(rVar.d())).array());
        if (rVar.c() != null) {
            adler32.update(rVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i) {
                        C3.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", rVar);
                        return;
                    }
                }
            }
        }
        long jE0 = this.f1381b.e0(rVar);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        v3.e eVarD = rVar.d();
        e eVar = this.f1382c;
        builder.setMinimumLatency(eVar.b(eVarD, jE0, i));
        Set<e.b> setB = eVar.c().get(eVarD).b();
        if (setB.contains(e.b.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setB.contains(e.b.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (setB.contains(e.b.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", rVar.b());
        persistableBundle.putInt("priority", I3.a.a(rVar.d()));
        if (rVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(rVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {rVar, Integer.valueOf(value), Long.valueOf(eVar.b(rVar.d(), jE0, i)), Long.valueOf(jE0), Integer.valueOf(i)};
        String strC = C3.a.c("JobInfoScheduler");
        if (Log.isLoggable(strC, 3)) {
            Log.d(strC, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}
