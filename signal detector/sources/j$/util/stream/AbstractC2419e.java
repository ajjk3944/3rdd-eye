package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2419e extends CountedCompleter {

    /* renamed from: g, reason: collision with root package name */
    public static final int f21055g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2510w1 f21056a;

    /* renamed from: b, reason: collision with root package name */
    public Spliterator f21057b;

    /* renamed from: c, reason: collision with root package name */
    public long f21058c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC2419e f21059d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC2419e f21060e;

    /* renamed from: f, reason: collision with root package name */
    public Object f21061f;

    public abstract Object a();

    public abstract AbstractC2419e c(Spliterator spliterator);

    public AbstractC2419e(AbstractC2510w1 abstractC2510w1, Spliterator spliterator) {
        super(null);
        this.f21056a = abstractC2510w1;
        this.f21057b = spliterator;
        this.f21058c = 0L;
    }

    public AbstractC2419e(AbstractC2419e abstractC2419e, Spliterator spliterator) {
        super(abstractC2419e);
        this.f21057b = spliterator;
        this.f21056a = abstractC2419e.f21056a;
        this.f21058c = abstractC2419e.f21058c;
    }

    public static long e(long j6) {
        long j7 = j6 / f21055g;
        if (j7 > 0) {
            return j7;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f21061f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public void d(Object obj) {
        this.f21061f = obj;
    }

    public final boolean b() {
        return ((AbstractC2419e) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f21057b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f21058c;
        if (jE == 0) {
            jE = e(jEstimateSize);
            this.f21058c = jE;
        }
        boolean z6 = false;
        AbstractC2419e abstractC2419e = this;
        while (jEstimateSize > jE && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC2419e abstractC2419eC = abstractC2419e.c(spliteratorTrySplit);
            abstractC2419e.f21059d = abstractC2419eC;
            AbstractC2419e abstractC2419eC2 = abstractC2419e.c(spliterator);
            abstractC2419e.f21060e = abstractC2419eC2;
            abstractC2419e.setPendingCount(1);
            if (z6) {
                spliterator = spliteratorTrySplit;
                abstractC2419e = abstractC2419eC;
                abstractC2419eC = abstractC2419eC2;
            } else {
                abstractC2419e = abstractC2419eC2;
            }
            z6 = !z6;
            abstractC2419eC.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC2419e.d(abstractC2419e.a());
        abstractC2419e.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f21057b = null;
        this.f21060e = null;
        this.f21059d = null;
    }
}
