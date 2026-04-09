package I;

import E.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import o0.b;

/* compiled from: ListFuture.java */
/* loaded from: classes.dex */
public final class q<V> implements A4.a<List<V>> {

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2374b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f2375c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2376d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f2377e;

    /* renamed from: f, reason: collision with root package name */
    public final b.d f2378f;

    /* renamed from: g, reason: collision with root package name */
    public b.a<List<V>> f2379g;

    public q(ArrayList arrayList, boolean z10, H.b bVar) {
        this.f2374b = arrayList;
        this.f2375c = new ArrayList(arrayList.size());
        this.f2376d = z10;
        this.f2377e = new AtomicInteger(arrayList.size());
        b.d dVarA = o0.b.a(new n(this));
        this.f2378f = dVarA;
        dVarA.addListener(new o(this, 0), u.y());
        if (this.f2374b.isEmpty()) {
            this.f2379g.b(new ArrayList(this.f2375c));
            return;
        }
        for (int i = 0; i < this.f2374b.size(); i++) {
            this.f2375c.add(null);
        }
        ArrayList arrayList2 = this.f2374b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            A4.a aVar = (A4.a) arrayList2.get(i10);
            aVar.addListener(new p(this, i10, aVar), bVar);
        }
    }

    @Override // A4.a
    public final void addListener(Runnable runnable, Executor executor) {
        this.f2378f.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        ArrayList arrayList = this.f2374b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((A4.a) it.next()).cancel(z10);
            }
        }
        return this.f2378f.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (List) this.f2378f.f44804c.get(j4, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2378f.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2378f.f44804c.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        ArrayList arrayList = this.f2374b;
        if (arrayList != null && !isDone()) {
            Iterator it = arrayList.iterator();
            loop0: while (it.hasNext()) {
                A4.a aVar = (A4.a) it.next();
                while (!aVar.isDone()) {
                    try {
                        aVar.get();
                    } catch (Error e4) {
                        throw e4;
                    } catch (InterruptedException e10) {
                        throw e10;
                    } catch (Throwable unused) {
                        if (this.f2376d) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) this.f2378f.f44804c.get();
    }
}
