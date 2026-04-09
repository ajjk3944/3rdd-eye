package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2476p1 extends AbstractC2485r1 implements InterfaceC2467n2 {

    /* renamed from: h, reason: collision with root package name */
    public final long[] f21134h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2467n2
    public final /* synthetic */ void l(Long l2) {
        AbstractC2510w1.I(this, l2);
    }

    public C2476p1(Spliterator spliterator, AbstractC2510w1 abstractC2510w1, long[] jArr) {
        super(spliterator, abstractC2510w1, jArr.length);
        this.f21134h = jArr;
    }

    public C2476p1(C2476p1 c2476p1, Spliterator spliterator, long j6, long j7) {
        super(c2476p1, spliterator, j6, j7, c2476p1.f21134h.length);
        this.f21134h = c2476p1.f21134h;
    }

    @Override // j$.util.stream.AbstractC2485r1
    public final AbstractC2485r1 a(Spliterator spliterator, long j6, long j7) {
        return new C2476p1(this, spliterator, j6, j7);
    }

    @Override // j$.util.stream.AbstractC2485r1, j$.util.stream.InterfaceC2472o2
    public final void accept(long j6) {
        int i = this.f21151f;
        if (i >= this.f21152g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f21151f));
        }
        long[] jArr = this.f21134h;
        this.f21151f = i + 1;
        jArr[i] = j6;
    }
}
