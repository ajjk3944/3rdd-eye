package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class m0 extends p0 implements k5 {

    /* renamed from: b, reason: collision with root package name */
    public final IntConsumer f26666b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void d(Integer num) {
        v3.G(this, num);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.g8
    public final Object f(a aVar, Spliterator spliterator) {
        aVar.w0(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.g8
    public final /* bridge */ /* synthetic */ Object j(v3 v3Var, Spliterator spliterator) {
        a(v3Var, spliterator);
        return null;
    }

    public m0(IntConsumer intConsumer, boolean z3) {
        super(z3);
        this.f26666b = intConsumer;
    }

    @Override // j$.util.stream.p0, j$.util.stream.m5, j$.util.stream.k5, java.util.function.IntConsumer
    public final void accept(int i4) {
        this.f26666b.accept(i4);
    }
}
