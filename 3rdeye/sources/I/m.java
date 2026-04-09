package I;

import C.S;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: ImmediateFuture.java */
/* loaded from: classes.dex */
public abstract class m<V> implements A4.a<V> {

    /* compiled from: ImmediateFuture.java */
    public static class a<V> extends m<V> {

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f2365b;

        public a(Throwable th) {
            this.f2365b = th;
        }

        @Override // java.util.concurrent.Future
        public final V get() throws ExecutionException {
            throw new ExecutionException(this.f2365b);
        }

        public final String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f2365b + "]]";
        }
    }

    /* compiled from: ImmediateFuture.java */
    public static final class b<V> extends a<V> implements ScheduledFuture<V> {
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* compiled from: ImmediateFuture.java */
    public static final class c<V> extends m<V> {

        /* renamed from: c, reason: collision with root package name */
        public static final c f2366c = new c(null);

        /* renamed from: b, reason: collision with root package name */
        public final V f2367b;

        public c(V v10) {
            this.f2367b = v10;
        }

        @Override // java.util.concurrent.Future
        public final V get() {
            return this.f2367b;
        }

        public final String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f2367b + "]]";
        }
    }

    @Override // A4.a
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            S.c("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e4);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j4, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }
}
