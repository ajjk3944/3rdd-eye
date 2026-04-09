package e2;

import A9.A;
import A9.C0575f;
import android.os.Handler;
import android.os.Looper;
import c2.s;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: WorkManagerTaskExecutor.java */
/* loaded from: classes.dex */
public final class c implements InterfaceC4306b {

    /* renamed from: a, reason: collision with root package name */
    public final s f37700a;

    /* renamed from: b, reason: collision with root package name */
    public final A f37701b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f37702c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final a f37703d = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.this.f37702c.post(runnable);
        }
    }

    public c(ExecutorService executorService) {
        s sVar = new s(executorService);
        this.f37700a = sVar;
        this.f37701b = C0575f.c(sVar);
    }

    @Override // e2.InterfaceC4306b
    public final A a() {
        return this.f37701b;
    }

    @Override // e2.InterfaceC4306b
    public final a b() {
        return this.f37703d;
    }

    @Override // e2.InterfaceC4306b
    public final s c() {
        return this.f37700a;
    }

    @Override // e2.InterfaceC4306b
    public final void d(Runnable runnable) {
        this.f37700a.execute(runnable);
    }
}
