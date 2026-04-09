package I;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0.b;

/* compiled from: FutureChain.java */
/* loaded from: classes.dex */
public class d<V> implements A4.a<V> {

    /* renamed from: b, reason: collision with root package name */
    public final A4.a<V> f2345b;

    /* renamed from: c, reason: collision with root package name */
    public b.a<V> f2346c;

    /* compiled from: FutureChain.java */
    public class a implements b.c<V> {
        public a() {
        }

        @Override // o0.b.c
        public final Object i(b.a<V> aVar) {
            d dVar = d.this;
            A2.l.q("The result can only set once!", dVar.f2346c == null);
            dVar.f2346c = aVar;
            return "FutureChain[" + dVar + "]";
        }
    }

    public d(A4.a<V> aVar) {
        aVar.getClass();
        this.f2345b = aVar;
    }

    public static <V> d<V> a(A4.a<V> aVar) {
        return aVar instanceof d ? (d) aVar : new d<>(aVar);
    }

    @Override // A4.a
    public final void addListener(Runnable runnable, Executor executor) {
        this.f2345b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f2345b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return this.f2345b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2345b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2345b.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f2345b.get(j4, timeUnit);
    }

    public d() {
        this.f2345b = o0.b.a(new a());
    }
}
