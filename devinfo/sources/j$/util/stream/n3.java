package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class n3 extends q3 implements k5 {

    /* renamed from: h, reason: collision with root package name */
    public final int[] f26680h;

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

    public n3(Spliterator spliterator, v3 v3Var, int[] iArr) {
        super(spliterator, v3Var, iArr.length);
        this.f26680h = iArr;
    }

    public n3(n3 n3Var, Spliterator spliterator, long j, long j8) {
        super(n3Var, spliterator, j, j8, n3Var.f26680h.length);
        this.f26680h = n3Var.f26680h;
    }

    @Override // j$.util.stream.q3
    public final q3 a(Spliterator spliterator, long j, long j8) {
        return new n3(this, spliterator, j, j8);
    }

    @Override // j$.util.stream.q3, j$.util.stream.m5, j$.util.stream.k5, java.util.function.IntConsumer
    public final void accept(int i4) {
        int i10 = this.f26732f;
        if (i10 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f26732f));
        }
        int[] iArr = this.f26680h;
        this.f26732f = i10 + 1;
        iArr[i10] = i4;
    }
}
