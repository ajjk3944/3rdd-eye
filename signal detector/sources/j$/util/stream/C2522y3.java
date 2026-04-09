package j$.util.stream;

import j$.util.AbstractC2383c;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.y3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2522y3 extends B3 implements j$.util.F, DoubleConsumer {

    /* renamed from: f, reason: collision with root package name */
    public double f21208f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2383c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2383c.f(this, consumer);
    }

    @Override // j$.util.stream.E3
    public final Spliterator b(Spliterator spliterator) {
        return new C2522y3((j$.util.F) spliterator, this);
    }

    @Override // j$.util.stream.B3
    public final void g(Object obj) {
        ((DoubleConsumer) obj).accept(this.f21208f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d6) {
        this.f21208f = d6;
    }

    @Override // j$.util.stream.B3
    public final AbstractC2443i3 j(int i) {
        return new C2428f3(i);
    }
}
