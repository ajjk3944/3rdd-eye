package j$.util.stream;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import j$.util.AbstractC2383c;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public class W2 extends Y2 implements LongConsumer {
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.Y2
    public final void q(Object obj, int i, int i3, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i < i3) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.Y2
    public final int r(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            g((LongConsumer) consumer);
        } else {
            if (K3.f20903a) {
                K3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            AbstractC2383c.c((V2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.Y2
    public final Object[] u() {
        return new long[8][];
    }

    @Override // j$.util.stream.Y2
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j6) {
        v();
        long[] jArr = (long[]) this.f20987e;
        int i = this.f21051b;
        this.f21051b = i + 1;
        jArr[i] = j6;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.K kSpliterator = spliterator();
        Objects.requireNonNull(kSpliterator);
        return new j$.util.S(kSpliterator);
    }

    @Override // j$.util.stream.Y2, java.lang.Iterable
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public j$.util.K spliterator() {
        return new V2(this, 0, this.f21052c, 0, this.f21051b);
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f21052c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f21052c), Arrays.toString(Arrays.copyOf(jArr, TTAdConstant.MATE_VALID)));
    }
}
