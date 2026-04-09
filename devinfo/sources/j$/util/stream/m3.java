package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class m3 extends q3 implements j5 {

    /* renamed from: h, reason: collision with root package name */
    public final double[] f26669h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void n(Double d10) {
        v3.E(this, d10);
    }

    public m3(Spliterator spliterator, v3 v3Var, double[] dArr) {
        super(spliterator, v3Var, dArr.length);
        this.f26669h = dArr;
    }

    public m3(m3 m3Var, Spliterator spliterator, long j, long j8) {
        super(m3Var, spliterator, j, j8, m3Var.f26669h.length);
        this.f26669h = m3Var.f26669h;
    }

    @Override // j$.util.stream.q3
    public final q3 a(Spliterator spliterator, long j, long j8) {
        return new m3(this, spliterator, j, j8);
    }

    @Override // j$.util.stream.q3, j$.util.stream.m5
    public final void accept(double d10) {
        int i4 = this.f26732f;
        if (i4 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f26732f));
        }
        double[] dArr = this.f26669h;
        this.f26732f = i4 + 1;
        dArr[i4] = d10;
    }
}
