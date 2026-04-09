package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* loaded from: classes2.dex */
public abstract class d extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a, reason: collision with root package name */
    public final v3 f26542a;

    /* renamed from: b, reason: collision with root package name */
    public Spliterator f26543b;

    /* renamed from: c, reason: collision with root package name */
    public long f26544c;

    /* renamed from: d, reason: collision with root package name */
    public d f26545d;

    /* renamed from: e, reason: collision with root package name */
    public d f26546e;

    /* renamed from: f, reason: collision with root package name */
    public Object f26547f;

    public abstract Object a();

    public abstract d c(Spliterator spliterator);

    public d(v3 v3Var, Spliterator spliterator) {
        super(null);
        this.f26542a = v3Var;
        this.f26543b = spliterator;
        this.f26544c = 0L;
    }

    public d(d dVar, Spliterator spliterator) {
        super(dVar);
        this.f26543b = spliterator;
        this.f26542a = dVar.f26542a;
        this.f26544c = dVar.f26544c;
    }

    public static long e(long j) {
        long j8 = j / g;
        if (j8 > 0) {
            return j8;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f26547f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public void d(Object obj) {
        this.f26547f = obj;
    }

    public final boolean b() {
        return ((d) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f26543b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f26544c;
        if (jE == 0) {
            jE = e(jEstimateSize);
            this.f26544c = jE;
        }
        boolean z3 = false;
        d dVar = this;
        while (jEstimateSize > jE && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            d dVarC = dVar.c(spliteratorTrySplit);
            dVar.f26545d = dVarC;
            d dVarC2 = dVar.c(spliterator);
            dVar.f26546e = dVarC2;
            dVar.setPendingCount(1);
            if (z3) {
                spliterator = spliteratorTrySplit;
                dVar = dVarC;
                dVarC = dVarC2;
            } else {
                dVar = dVarC2;
            }
            z3 = !z3;
            dVarC.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        dVar.d(dVar.a());
        dVar.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f26543b = null;
        this.f26546e = null;
        this.f26545d = null;
    }
}
