package I;

import E.u;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0.b;

/* compiled from: ChainingListenableFuture.java */
/* loaded from: classes.dex */
public final class b<I, O> extends d<O> implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public I.a<? super I, ? extends O> f2338d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f2339e = new LinkedBlockingQueue(1);

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f2340f = new CountDownLatch(1);

    /* renamed from: g, reason: collision with root package name */
    public A4.a<? extends I> f2341g;

    /* renamed from: h, reason: collision with root package name */
    public volatile A4.a<? extends O> f2342h;

    /* compiled from: ChainingListenableFuture.java */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A4.a f2343b;

        public a(A4.a aVar) {
            this.f2343b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                try {
                    b bVar = b.this;
                    Object objD = j.d(this.f2343b);
                    b.a<V> aVar = bVar.f2346c;
                    if (aVar != 0) {
                        aVar.b(objD);
                    }
                } catch (CancellationException unused) {
                    b.this.cancel(false);
                } catch (ExecutionException e4) {
                    b bVar2 = b.this;
                    Throwable cause = e4.getCause();
                    b.a<V> aVar2 = bVar2.f2346c;
                    if (aVar2 != 0) {
                        aVar2.d(cause);
                    }
                    b.this.f2342h = null;
                    return;
                }
                b.this.f2342h = null;
            } catch (Throwable th) {
                b.this.f2342h = null;
                throw th;
            }
        }
    }

    public b(I.a<? super I, ? extends O> aVar, A4.a<? extends I> aVar2) {
        this.f2338d = aVar;
        aVar2.getClass();
        this.f2341g = aVar2;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z10 = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // I.d, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11 = false;
        if (!this.f2345b.cancel(z10)) {
            return false;
        }
        while (true) {
            try {
                this.f2339e.put(Boolean.valueOf(z10));
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        A4.a<? extends I> aVar = this.f2341g;
        if (aVar != null) {
            aVar.cancel(z10);
        }
        A4.a<? extends O> aVar2 = this.f2342h;
        if (aVar2 != null) {
            aVar2.cancel(z10);
        }
        return true;
    }

    @Override // I.d, java.util.concurrent.Future
    public final O get() throws ExecutionException, InterruptedException {
        if (!this.f2345b.isDone()) {
            A4.a<? extends I> aVar = this.f2341g;
            if (aVar != null) {
                aVar.get();
            }
            this.f2340f.await();
            A4.a<? extends O> aVar2 = this.f2342h;
            if (aVar2 != null) {
                aVar2.get();
            }
        }
        return (O) this.f2345b.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A4.a<? extends I>, I.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [A4.a<? extends I>, I.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public final void run() {
        I.a<? super I, ? extends O> aVar;
        ?? r02 = (I.a<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        try {
                            A4.a<? extends O> aVarApply = this.f2338d.apply(j.d(this.f2341g));
                            this.f2342h = aVarApply;
                            if (this.f2345b.isCancelled()) {
                                aVarApply.cancel(((Boolean) b(this.f2339e)).booleanValue());
                                this.f2342h = null;
                            } else {
                                aVarApply.addListener(new a(aVarApply), u.y());
                            }
                        } catch (CancellationException unused) {
                            cancel(false);
                        } catch (ExecutionException e4) {
                            Throwable cause = e4.getCause();
                            b.a<V> aVar2 = this.f2346c;
                            if (aVar2 != 0) {
                                aVar2.d(cause);
                            }
                        }
                    } catch (Error e10) {
                        b.a<V> aVar3 = this.f2346c;
                        aVar = r02;
                        if (aVar3 != 0) {
                            aVar3.d(e10);
                            aVar = r02;
                        }
                    }
                } catch (Exception e11) {
                    b.a<V> aVar4 = this.f2346c;
                    aVar = r02;
                    if (aVar4 != 0) {
                        aVar4.d(e11);
                        aVar = r02;
                    }
                }
            } finally {
                this.f2338d = (I.a<? super I, ? extends O>) r02;
                this.f2341g = (A4.a<? extends I>) r02;
                this.f2340f.countDown();
            }
        } catch (UndeclaredThrowableException e12) {
            Throwable cause2 = e12.getCause();
            b.a<V> aVar5 = this.f2346c;
            aVar = r02;
            if (aVar5 != 0) {
                aVar5.d(cause2);
                aVar = r02;
            }
        }
    }

    @Override // I.d, java.util.concurrent.Future
    public final O get(long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.f2345b.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j4 = timeUnit2.convert(j4, timeUnit);
                timeUnit = timeUnit2;
            }
            A4.a<? extends I> aVar = this.f2341g;
            if (aVar != null) {
                long jNanoTime = System.nanoTime();
                aVar.get(j4, timeUnit);
                j4 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f2340f.await(j4, timeUnit)) {
                j4 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                A4.a<? extends O> aVar2 = this.f2342h;
                if (aVar2 != null) {
                    aVar2.get(j4, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) this.f2345b.get(j4, timeUnit);
    }
}
