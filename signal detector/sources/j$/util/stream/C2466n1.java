package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2466n1 extends AbstractC2485r1 implements InterfaceC2457l2 {

    /* renamed from: h, reason: collision with root package name */
    public final double[] f21124h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC2457l2
    public final /* synthetic */ void o(Double d6) {
        AbstractC2510w1.E(this, d6);
    }

    public C2466n1(Spliterator spliterator, AbstractC2510w1 abstractC2510w1, double[] dArr) {
        super(spliterator, abstractC2510w1, dArr.length);
        this.f21124h = dArr;
    }

    public C2466n1(C2466n1 c2466n1, Spliterator spliterator, long j6, long j7) {
        super(c2466n1, spliterator, j6, j7, c2466n1.f21124h.length);
        this.f21124h = c2466n1.f21124h;
    }

    @Override // j$.util.stream.AbstractC2485r1
    public final AbstractC2485r1 a(Spliterator spliterator, long j6, long j7) {
        return new C2466n1(this, spliterator, j6, j7);
    }

    @Override // j$.util.stream.AbstractC2485r1, j$.util.stream.InterfaceC2472o2, j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final void accept(double d6) {
        int i = this.f21151f;
        if (i >= this.f21152g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f21151f));
        }
        double[] dArr = this.f21124h;
        this.f21151f = i + 1;
        dArr[i] = d6;
    }
}
