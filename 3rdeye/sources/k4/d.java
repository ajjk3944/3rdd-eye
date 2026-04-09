package K4;

import O4.B;
import O4.F;
import O4.U;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: FirebaseCrashlytics.java */
/* loaded from: classes2.dex */
public final class d implements Callable<Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f3145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f3146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V4.e f3147c;

    public d(boolean z10, F f10, V4.e eVar) {
        this.f3145a = z10;
        this.f3146b = f10;
        this.f3147c = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        if (!this.f3145a) {
            return null;
        }
        F f10 = this.f3146b;
        B b10 = new B(f10, this.f3147c);
        ExecutorService executorService = U.f10289a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ExecutorService executorService2 = f10.f10244l;
        executorService2.execute(new J4.e(b10, executorService2, taskCompletionSource, 3));
        taskCompletionSource.getTask();
        return null;
    }
}
