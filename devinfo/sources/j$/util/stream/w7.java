package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class w7 extends z7 implements j$.util.u0, DoubleConsumer {

    /* renamed from: f, reason: collision with root package name */
    public double f26806f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.f(this, consumer);
    }

    @Override // j$.util.stream.c8
    public final Spliterator b(Spliterator spliterator) {
        return new w7((j$.util.u0) spliterator, this);
    }

    @Override // j$.util.stream.z7
    public final void g(Object obj) {
        ((DoubleConsumer) obj).accept(this.f26806f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f26806f = d10;
    }

    @Override // j$.util.stream.z7
    public final g7 j(int i4) {
        return new d7(i4);
    }
}
