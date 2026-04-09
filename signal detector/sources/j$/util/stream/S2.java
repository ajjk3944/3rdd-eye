package j$.util.stream;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import j$.util.AbstractC2383c;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public class S2 extends Y2 implements DoubleConsumer {
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.Y2
    public final void q(Object obj, int i, int i3, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i < i3) {
            doubleConsumer.accept(dArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.Y2
    public final int r(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            g((DoubleConsumer) consumer);
        } else {
            if (K3.f20903a) {
                K3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            AbstractC2383c.a((R2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.Y2
    public final Object[] u() {
        return new double[8][];
    }

    @Override // j$.util.stream.Y2
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d6) {
        v();
        double[] dArr = (double[]) this.f20987e;
        int i = this.f21051b;
        this.f21051b = i + 1;
        dArr[i] = d6;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.F fSpliterator = spliterator();
        Objects.requireNonNull(fSpliterator);
        return new j$.util.T(fSpliterator);
    }

    @Override // j$.util.stream.Y2, java.lang.Iterable
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public j$.util.F spliterator() {
        return new R2(this, 0, this.f21052c, 0, this.f21051b);
    }

    public final String toString() {
        double[] dArr = (double[]) b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f21052c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f21052c), Arrays.toString(Arrays.copyOf(dArr, TTAdConstant.MATE_VALID)));
    }
}
