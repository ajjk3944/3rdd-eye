package j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class z2 extends i2 implements w1 {
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

    @Override // j$.util.stream.m5, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        v3.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.w1
    public final e2 build() {
        int i4 = this.f26608b;
        Object[] objArr = this.f26607a;
        if (i4 >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f26608b), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        Object[] objArr = this.f26607a;
        if (j != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(objArr.length)));
        }
        this.f26608b = 0;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        int i4 = this.f26608b;
        Object[] objArr = this.f26607a;
        if (i4 < objArr.length) {
            this.f26608b = i4 + 1;
            objArr[i4] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.m5
    public final void end() {
        int i4 = this.f26608b;
        Object[] objArr = this.f26607a;
        if (i4 < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f26608b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // j$.util.stream.i2
    public final String toString() {
        Object[] objArr = this.f26607a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f26608b), Arrays.toString(objArr));
    }
}
