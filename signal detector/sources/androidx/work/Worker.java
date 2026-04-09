package androidx.work;

import V0.l;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import f4.InterfaceFutureC2326a;
import g1.k;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: f, reason: collision with root package name */
    public k f5664f;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract l doWork();

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC2326a startWork() {
        this.f5664f = new k();
        getBackgroundExecutor().execute(new C0.k(8, this));
        return this.f5664f;
    }
}
