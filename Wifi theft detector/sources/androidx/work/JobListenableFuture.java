package androidx.work;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.r1;

/* loaded from: classes.dex */
public final class JobListenableFuture implements com.google.common.util.concurrent.a {

    /* renamed from: a, reason: collision with root package name */
    public final r1 f4293a;

    /* renamed from: b, reason: collision with root package name */
    public final n2.a f4294b;

    public JobListenableFuture(r1 job, n2.a underlying) {
        kotlin.jvm.internal.p.e(job, "job");
        kotlin.jvm.internal.p.e(underlying, "underlying");
        this.f4293a = job;
        this.f4294b = underlying;
        job.U(new l9.l() { // from class: androidx.work.JobListenableFuture.1
            {
                super(1);
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return y8.s.f25199a;
            }

            public final void invoke(Throwable th) {
                if (th == null) {
                    if (!JobListenableFuture.this.f4294b.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else {
                    if (th instanceof CancellationException) {
                        JobListenableFuture.this.f4294b.cancel(true);
                        return;
                    }
                    n2.a aVar = JobListenableFuture.this.f4294b;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    aVar.p(th);
                }
            }
        });
    }

    @Override // com.google.common.util.concurrent.a
    public void addListener(Runnable runnable, Executor executor) {
        this.f4294b.addListener(runnable, executor);
    }

    public final void b(Object obj) {
        this.f4294b.o(obj);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f4294b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f4294b.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f4294b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f4294b.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f4294b.get(j10, timeUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ JobListenableFuture(r1 r1Var, n2.a aVar, int i10, kotlin.jvm.internal.i iVar) {
        if ((i10 & 2) != 0) {
            aVar = n2.a.s();
            kotlin.jvm.internal.p.d(aVar, "create()");
        }
        this(r1Var, aVar);
    }
}
