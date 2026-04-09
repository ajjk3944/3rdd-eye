package j$.util.stream;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public class s6 extends w6 implements IntConsumer {
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.w6
    public final void p(Object obj, int i4, int i10, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i4 < i10) {
            intConsumer.accept(iArr[i4]);
            i4++;
        }
    }

    @Override // j$.util.stream.w6
    public final int q(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            g((IntConsumer) consumer);
        } else {
            if (i8.f26621a) {
                i8.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.util.c.b((r6) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.w6
    public final Object[] t() {
        return new int[8][];
    }

    @Override // j$.util.stream.w6
    public final Object newArray(int i4) {
        return new int[i4];
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i4) {
        u();
        int[] iArr = (int[]) this.f26804e;
        int i10 = this.f26515b;
        this.f26515b = i10 + 1;
        iArr[i10] = i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Spliterator.OfInt ofIntSpliterator = spliterator();
        Objects.requireNonNull(ofIntSpliterator);
        return new j$.util.f1(ofIntSpliterator);
    }

    @Override // j$.util.stream.w6, java.lang.Iterable, j$.util.stream.e2
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Spliterator.OfInt spliterator() {
        return new r6(this, 0, this.f26516c, 0, this.f26515b);
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f26516c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f26516c), Arrays.toString(Arrays.copyOf(iArr, TTAdConstant.MATE_VALID)));
    }
}
