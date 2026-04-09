package j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class s2 extends r2 implements t1 {
    @Override // j$.util.stream.m5, j$.util.stream.k5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i4) {
        v3.K();
        throw null;
    }

    @Override // j$.util.stream.m5, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        v3.L();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void n(Double d10) {
        v3.E(this, d10);
    }

    @Override // j$.util.stream.w1
    public final /* bridge */ /* synthetic */ e2 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.t1, j$.util.stream.w1
    public final y1 build() {
        int i4 = this.f26744b;
        double[] dArr = this.f26743a;
        if (i4 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f26744b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        double[] dArr = this.f26743a;
        if (j != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(dArr.length)));
        }
        this.f26744b = 0;
    }

    @Override // j$.util.stream.m5
    public final void accept(double d10) {
        int i4 = this.f26744b;
        double[] dArr = this.f26743a;
        if (i4 < dArr.length) {
            this.f26744b = i4 + 1;
            dArr[i4] = d10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.m5
    public final void end() {
        int i4 = this.f26744b;
        double[] dArr = this.f26743a;
        if (i4 < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f26744b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.r2
    public final String toString() {
        double[] dArr = this.f26743a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f26744b), Arrays.toString(dArr));
    }
}
