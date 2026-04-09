package j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class k3 extends j3 implements v1 {
    @Override // j$.util.stream.m5
    public final /* synthetic */ void accept(double d10) {
        v3.D();
        throw null;
    }

    @Override // j$.util.stream.m5, j$.util.stream.k5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i4) {
        v3.K();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void l(Long l10) {
        v3.I(this, l10);
    }

    @Override // j$.util.stream.w1
    public final /* bridge */ /* synthetic */ e2 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.v1, j$.util.stream.w1
    public final c2 build() {
        int i4 = this.f26627b;
        long[] jArr = this.f26626a;
        if (i4 >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f26627b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        long[] jArr = this.f26626a;
        if (j != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(jArr.length)));
        }
        this.f26627b = 0;
    }

    @Override // j$.util.stream.m5, java.util.function.LongConsumer
    public final void accept(long j) {
        int i4 = this.f26627b;
        long[] jArr = this.f26626a;
        if (i4 < jArr.length) {
            this.f26627b = i4 + 1;
            jArr[i4] = j;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.m5
    public final void end() {
        int i4 = this.f26627b;
        long[] jArr = this.f26626a;
        if (i4 < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f26627b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // j$.util.stream.j3
    public final String toString() {
        long[] jArr = this.f26626a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f26627b), Arrays.toString(jArr));
    }
}
