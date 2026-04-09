package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class q3 extends CountedCompleter implements m5 {

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f26727a;

    /* renamed from: b, reason: collision with root package name */
    public final v3 f26728b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26729c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26730d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26731e;

    /* renamed from: f, reason: collision with root package name */
    public int f26732f;
    public int g;

    public abstract q3 a(Spliterator spliterator, long j, long j8);

    public /* synthetic */ void accept(double d10) {
        v3.D();
        throw null;
    }

    public /* synthetic */ void accept(int i4) {
        v3.K();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        v3.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void end() {
    }

    public q3(Spliterator spliterator, v3 v3Var, int i4) {
        this.f26727a = spliterator;
        this.f26728b = v3Var;
        this.f26729c = d.e(spliterator.estimateSize());
        this.f26730d = 0L;
        this.f26731e = i4;
    }

    public q3(q3 q3Var, Spliterator spliterator, long j, long j8, int i4) {
        super(q3Var);
        this.f26727a = spliterator;
        this.f26728b = q3Var.f26728b;
        this.f26729c = q3Var.f26729c;
        this.f26730d = j;
        this.f26731e = j8;
        if (j < 0 || j8 < 0 || (j + j8) - 1 >= i4) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j8), Integer.valueOf(i4)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f26727a;
        q3 q3VarA = this;
        while (spliterator.estimateSize() > q3VarA.f26729c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            q3VarA.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            q3 q3Var = q3VarA;
            q3Var.a(spliteratorTrySplit, q3VarA.f26730d, jEstimateSize).fork();
            q3VarA = q3Var.a(spliterator, q3Var.f26730d + jEstimateSize, q3Var.f26731e - jEstimateSize);
        }
        q3 q3Var2 = q3VarA;
        q3Var2.f26728b.w0(spliterator, q3Var2);
        q3Var2.propagateCompletion();
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        long j8 = this.f26731e;
        if (j > j8) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i4 = (int) this.f26730d;
        this.f26732f = i4;
        this.g = i4 + ((int) j8);
    }
}
