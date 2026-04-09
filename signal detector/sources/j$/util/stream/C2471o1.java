package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2471o1 extends AbstractC2485r1 implements InterfaceC2462m2 {

    /* renamed from: h, reason: collision with root package name */
    public final int[] f21129h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC2462m2
    public final /* synthetic */ void d(Integer num) {
        AbstractC2510w1.G(this, num);
    }

    public C2471o1(Spliterator spliterator, AbstractC2510w1 abstractC2510w1, int[] iArr) {
        super(spliterator, abstractC2510w1, iArr.length);
        this.f21129h = iArr;
    }

    public C2471o1(C2471o1 c2471o1, Spliterator spliterator, long j6, long j7) {
        super(c2471o1, spliterator, j6, j7, c2471o1.f21129h.length);
        this.f21129h = c2471o1.f21129h;
    }

    @Override // j$.util.stream.AbstractC2485r1
    public final AbstractC2485r1 a(Spliterator spliterator, long j6, long j7) {
        return new C2471o1(this, spliterator, j6, j7);
    }

    @Override // j$.util.stream.AbstractC2485r1, j$.util.stream.InterfaceC2472o2
    public final void accept(int i) {
        int i3 = this.f21151f;
        if (i3 >= this.f21152g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f21151f));
        }
        int[] iArr = this.f21129h;
        this.f21151f = i3 + 1;
        iArr[i3] = i;
    }
}
