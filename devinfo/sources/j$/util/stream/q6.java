package j$.util.stream;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public class q6 extends w6 implements DoubleConsumer {
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.w6
    public final void p(Object obj, int i4, int i10, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i4 < i10) {
            doubleConsumer.accept(dArr[i4]);
            i4++;
        }
    }

    @Override // j$.util.stream.w6
    public final int q(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            g((DoubleConsumer) consumer);
        } else {
            if (i8.f26621a) {
                i8.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            j$.util.c.a((p6) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.w6
    public final Object[] t() {
        return new double[8][];
    }

    @Override // j$.util.stream.w6
    public final Object newArray(int i4) {
        return new double[i4];
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d10) {
        u();
        double[] dArr = (double[]) this.f26804e;
        int i4 = this.f26515b;
        this.f26515b = i4 + 1;
        dArr[i4] = d10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.u0 u0VarSpliterator = spliterator();
        Objects.requireNonNull(u0VarSpliterator);
        return new j$.util.h1(u0VarSpliterator);
    }

    @Override // j$.util.stream.w6, java.lang.Iterable, j$.util.stream.e2
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public j$.util.u0 spliterator() {
        return new p6(this, 0, this.f26516c, 0, this.f26515b);
    }

    public final String toString() {
        double[] dArr = (double[]) b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f26516c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f26516c), Arrays.toString(Arrays.copyOf(dArr, TTAdConstant.MATE_VALID)));
    }
}
