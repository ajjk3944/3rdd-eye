package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.r1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2485r1 extends CountedCompleter implements InterfaceC2472o2 {

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f21146a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2510w1 f21147b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21148c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21149d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21150e;

    /* renamed from: f, reason: collision with root package name */
    public int f21151f;

    /* renamed from: g, reason: collision with root package name */
    public int f21152g;

    public abstract AbstractC2485r1 a(Spliterator spliterator, long j6, long j7);

    public /* synthetic */ void accept(double d6) {
        AbstractC2510w1.D();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC2510w1.K();
        throw null;
    }

    public /* synthetic */ void accept(long j6) {
        AbstractC2510w1.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void m() {
    }

    public AbstractC2485r1(Spliterator spliterator, AbstractC2510w1 abstractC2510w1, int i) {
        this.f21146a = spliterator;
        this.f21147b = abstractC2510w1;
        this.f21148c = AbstractC2419e.e(spliterator.estimateSize());
        this.f21149d = 0L;
        this.f21150e = i;
    }

    public AbstractC2485r1(AbstractC2485r1 abstractC2485r1, Spliterator spliterator, long j6, long j7, int i) {
        super(abstractC2485r1);
        this.f21146a = spliterator;
        this.f21147b = abstractC2485r1.f21147b;
        this.f21148c = abstractC2485r1.f21148c;
        this.f21149d = j6;
        this.f21150e = j7;
        if (j6 < 0 || j7 < 0 || (j6 + j7) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j6), Long.valueOf(j6), Long.valueOf(j7), Integer.valueOf(i)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f21146a;
        AbstractC2485r1 abstractC2485r1A = this;
        while (spliterator.estimateSize() > abstractC2485r1A.f21148c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            abstractC2485r1A.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            AbstractC2485r1 abstractC2485r1 = abstractC2485r1A;
            abstractC2485r1.a(spliteratorTrySplit, abstractC2485r1A.f21149d, jEstimateSize).fork();
            abstractC2485r1A = abstractC2485r1.a(spliterator, abstractC2485r1.f21149d + jEstimateSize, abstractC2485r1.f21150e - jEstimateSize);
        }
        AbstractC2485r1 abstractC2485r12 = abstractC2485r1A;
        abstractC2485r12.f21147b.w0(spliterator, abstractC2485r12);
        abstractC2485r12.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        long j7 = this.f21150e;
        if (j6 > j7) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.f21149d;
        this.f21151f = i;
        this.f21152g = i + ((int) j7);
    }
}
