package I;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import o0.b;

/* compiled from: ListFuture.java */
/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A4.a f2372c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f2373d;

    public p(q qVar, int i, A4.a aVar) {
        this.f2373d = qVar;
        this.f2371b = i;
        this.f2372c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.a aVar;
        ArrayList arrayList;
        int i = this.f2371b;
        A4.a aVar2 = this.f2372c;
        q qVar = this.f2373d;
        AtomicInteger atomicInteger = qVar.f2377e;
        ArrayList arrayList2 = qVar.f2375c;
        boolean zIsDone = qVar.isDone();
        boolean z10 = qVar.f2376d;
        if (zIsDone || arrayList2 == null) {
            A2.l.q("Future was done before all dependencies completed", z10);
            return;
        }
        try {
            try {
                try {
                    A2.l.q("Tried to set value from future which is not done", aVar2.isDone());
                    arrayList2.set(i, j.d(aVar2));
                    int iDecrementAndGet = atomicInteger.decrementAndGet();
                    A2.l.q("Less than 0 remaining futures", iDecrementAndGet >= 0);
                    if (iDecrementAndGet == 0) {
                        ArrayList arrayList3 = qVar.f2375c;
                        if (arrayList3 != null) {
                            qVar.f2379g.b(new ArrayList(arrayList3));
                        } else {
                            A2.l.q(null, qVar.isDone());
                        }
                    }
                } catch (Error e4) {
                    qVar.f2379g.d(e4);
                    int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                    A2.l.q("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                    if (iDecrementAndGet2 == 0) {
                        ArrayList arrayList4 = qVar.f2375c;
                        if (arrayList4 != null) {
                            aVar = qVar.f2379g;
                            arrayList = new ArrayList(arrayList4);
                            aVar.b(arrayList);
                            return;
                        }
                        A2.l.q(null, qVar.isDone());
                    }
                } catch (CancellationException unused) {
                    if (z10) {
                        qVar.cancel(false);
                    }
                    int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                    A2.l.q("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                    if (iDecrementAndGet3 == 0) {
                        ArrayList arrayList5 = qVar.f2375c;
                        if (arrayList5 != null) {
                            aVar = qVar.f2379g;
                            arrayList = new ArrayList(arrayList5);
                            aVar.b(arrayList);
                            return;
                        }
                        A2.l.q(null, qVar.isDone());
                    }
                }
            } catch (RuntimeException e10) {
                if (z10) {
                    qVar.f2379g.d(e10);
                }
                int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                A2.l.q("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                if (iDecrementAndGet4 == 0) {
                    ArrayList arrayList6 = qVar.f2375c;
                    if (arrayList6 != null) {
                        aVar = qVar.f2379g;
                        arrayList = new ArrayList(arrayList6);
                        aVar.b(arrayList);
                        return;
                    }
                    A2.l.q(null, qVar.isDone());
                }
            } catch (ExecutionException e11) {
                if (z10) {
                    qVar.f2379g.d(e11.getCause());
                }
                int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                A2.l.q("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                if (iDecrementAndGet5 == 0) {
                    ArrayList arrayList7 = qVar.f2375c;
                    if (arrayList7 != null) {
                        aVar = qVar.f2379g;
                        arrayList = new ArrayList(arrayList7);
                        aVar.b(arrayList);
                        return;
                    }
                    A2.l.q(null, qVar.isDone());
                }
            }
        } catch (Throwable th) {
            int iDecrementAndGet6 = atomicInteger.decrementAndGet();
            A2.l.q("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
            if (iDecrementAndGet6 == 0) {
                ArrayList arrayList8 = qVar.f2375c;
                if (arrayList8 != null) {
                    qVar.f2379g.b(new ArrayList(arrayList8));
                } else {
                    A2.l.q(null, qVar.isDone());
                }
            }
            throw th;
        }
    }
}
