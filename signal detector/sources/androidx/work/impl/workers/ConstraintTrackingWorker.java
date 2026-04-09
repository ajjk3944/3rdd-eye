package androidx.work.impl.workers;

import V0.m;
import a1.InterfaceC0263b;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import f4.InterfaceFutureC2326a;
import g1.k;
import h1.InterfaceC2361a;
import java.util.List;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC0263b {

    /* renamed from: k, reason: collision with root package name */
    public static final String f5699k = m.h("ConstraintTrkngWrkr");

    /* renamed from: f, reason: collision with root package name */
    public final WorkerParameters f5700f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5701g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f5702h;
    public final k i;

    /* renamed from: j, reason: collision with root package name */
    public ListenableWorker f5703j;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5700f = workerParameters;
        this.f5701g = new Object();
        this.f5702h = false;
        this.i = new k();
    }

    @Override // a1.InterfaceC0263b
    public final void a(List list) {
        m.f().a(f5699k, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f5701g) {
            this.f5702h = true;
        }
    }

    @Override // a1.InterfaceC0263b
    public final void f(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceC2361a getTaskExecutor() {
        return W0.k.G(getApplicationContext()).f3993l;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f5703j;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f5703j;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f5703j.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC2326a startWork() {
        getBackgroundExecutor().execute(new C0.k(23, this));
        return this.i;
    }
}
