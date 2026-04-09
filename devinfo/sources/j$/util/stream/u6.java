package j$.util.stream;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public class u6 extends w6 implements LongConsumer {
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.w6
    public final void p(Object obj, int i4, int i10, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i4 < i10) {
            longConsumer.accept(jArr[i4]);
            i4++;
        }
    }

    @Override // j$.util.stream.w6
    public final int q(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            g((LongConsumer) consumer);
        } else {
            if (i8.f26621a) {
                i8.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            j$.util.c.c((t6) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.w6
    public final Object[] t() {
        return new long[8][];
    }

    @Override // j$.util.stream.w6
    public final Object newArray(int i4) {
        return new long[i4];
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        u();
        long[] jArr = (long[]) this.f26804e;
        int i4 = this.f26515b;
        this.f26515b = i4 + 1;
        jArr[i4] = j;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.z0 z0VarSpliterator = spliterator();
        Objects.requireNonNull(z0VarSpliterator);
        return new j$.util.g1(z0VarSpliterator);
    }

    @Override // j$.util.stream.w6, java.lang.Iterable, j$.util.stream.e2
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public j$.util.z0 spliterator() {
        return new t6(this, 0, this.f26516c, 0, this.f26515b);
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f26516c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f26516c), Arrays.toString(Arrays.copyOf(jArr, TTAdConstant.MATE_VALID)));
    }
}
