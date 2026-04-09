package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class A3 extends B3 implements j$.util.K, LongConsumer {

    /* renamed from: f, reason: collision with root package name */
    public long f20825f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.h(this, consumer);
    }

    @Override // j$.util.stream.E3
    public final Spliterator b(Spliterator spliterator) {
        return new A3((j$.util.K) spliterator, this);
    }

    @Override // j$.util.stream.B3
    public final void g(Object obj) {
        ((LongConsumer) obj).accept(this.f20825f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f20825f = j6;
    }

    @Override // j$.util.stream.B3
    public final AbstractC2443i3 j(int i) {
        return new C2438h3(i);
    }
}
