package w1;

import b9.C1992A;
import com.yandex.mobile.ads.impl.L;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: TransactionExecutor.android.kt */
/* loaded from: classes.dex */
public final class p implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f47278b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque<Runnable> f47279c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f47280d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f47281e;

    public p(Executor executor) {
        kotlin.jvm.internal.l.f(executor, "executor");
        this.f47278b = executor;
        this.f47279c = new ArrayDeque<>();
        this.f47281e = new Object();
    }

    public final void a() {
        synchronized (this.f47281e) {
            try {
                Runnable runnablePoll = this.f47279c.poll();
                Runnable runnable = runnablePoll;
                this.f47280d = runnable;
                if (runnablePoll != null) {
                    this.f47278b.execute(runnable);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        kotlin.jvm.internal.l.f(command, "command");
        synchronized (this.f47281e) {
            try {
                this.f47279c.offer(new L(22, command, this));
                if (this.f47280d == null) {
                    a();
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
