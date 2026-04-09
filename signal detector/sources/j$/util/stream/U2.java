package j$.util.stream;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import j$.util.AbstractC2383c;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public class U2 extends Y2 implements IntConsumer {
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.Y2
    public final void q(Object obj, int i, int i3, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i3) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.Y2
    public final int r(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            g((IntConsumer) consumer);
        } else {
            if (K3.f20903a) {
                K3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            AbstractC2383c.b((T2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.Y2
    public final Object[] u() {
        return new int[8][];
    }

    @Override // j$.util.stream.Y2
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i) {
        v();
        int[] iArr = (int[]) this.f20987e;
        int i3 = this.f21051b;
        this.f21051b = i3 + 1;
        iArr[i3] = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Spliterator.OfInt ofIntSpliterator = spliterator();
        Objects.requireNonNull(ofIntSpliterator);
        return new j$.util.Q(ofIntSpliterator);
    }

    @Override // j$.util.stream.Y2, java.lang.Iterable
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Spliterator.OfInt spliterator() {
        return new T2(this, 0, this.f21052c, 0, this.f21051b);
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f21052c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f21052c), Arrays.toString(Arrays.copyOf(iArr, TTAdConstant.MATE_VALID)));
    }
}
