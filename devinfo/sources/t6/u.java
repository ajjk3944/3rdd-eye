package t6;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import me.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f34394a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f34395b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f34396c = new AtomicInteger(-256);

    /* renamed from: d, reason: collision with root package name */
    public boolean f34397d;

    public u(Context context, WorkerParameters workerParameters) {
        this.f34394a = context;
        this.f34395b = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f34394a;
    }

    public Executor getBackgroundExecutor() {
        return this.f34395b.f1605f;
    }

    public abstract vd.b getForegroundInfoAsync();

    public final UUID getId() {
        return this.f34395b.f1600a;
    }

    public final h getInputData() {
        return this.f34395b.f1601b;
    }

    public final Network getNetwork() {
        return (Network) this.f34395b.f1603d.f25418d;
    }

    public final int getRunAttemptCount() {
        return this.f34395b.f1604e;
    }

    public final int getStopReason() {
        return this.f34396c.get();
    }

    public final Set<String> getTags() {
        return this.f34395b.f1602c;
    }

    public d7.a getTaskExecutor() {
        return this.f34395b.f1606h;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.f34395b.f1603d.f25416b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.f34395b.f1603d.f25417c;
    }

    public l0 getWorkerFactory() {
        return this.f34395b.f1607i;
    }

    public final boolean isStopped() {
        return this.f34396c.get() != -256;
    }

    public final boolean isUsed() {
        return this.f34397d;
    }

    public final vd.b setForegroundAsync(m mVar) {
        c7.r rVar = this.f34395b.f1608k;
        Context applicationContext = getApplicationContext();
        return t1.i((c7.l) rVar.f2804a.f148e, "setForegroundAsync", new c7.q(rVar, getId(), mVar, applicationContext, 0));
    }

    public vd.b setProgressAsync(h hVar) {
        c7.s sVar = this.f34395b.j;
        getApplicationContext();
        return t1.i((c7.l) sVar.f2809b.f148e, "updateProgress", new c1.b(sVar, getId(), hVar, 1));
    }

    public final void setUsed() {
        this.f34397d = true;
    }

    public abstract vd.b startWork();

    public final void stop(int i4) {
        if (this.f34396c.compareAndSet(-256, i4)) {
            onStopped();
        }
    }

    public void onStopped() {
    }
}
