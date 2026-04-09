package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2456l1 extends C2451k1 implements InterfaceC2514x0 {
    @Override // j$.util.stream.InterfaceC2472o2, j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d6) {
        AbstractC2510w1.D();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void accept(int i) {
        AbstractC2510w1.K();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2467n2
    public final /* synthetic */ void l(Long l2) {
        AbstractC2510w1.I(this, l2);
    }

    @Override // j$.util.stream.InterfaceC2519y0
    public final /* bridge */ /* synthetic */ G0 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.InterfaceC2514x0, j$.util.stream.InterfaceC2519y0
    public final E0 build() {
        int i = this.f21107b;
        long[] jArr = this.f21106a;
        if (i >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f21107b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        long[] jArr = this.f21106a;
        if (j6 != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j6), Integer.valueOf(jArr.length)));
        }
        this.f21107b = 0;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void accept(long j6) {
        int i = this.f21107b;
        long[] jArr = this.f21106a;
        if (i < jArr.length) {
            this.f21107b = i + 1;
            jArr[i] = j6;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void m() {
        int i = this.f21107b;
        long[] jArr = this.f21106a;
        if (i < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f21107b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // j$.util.stream.C2451k1
    public final String toString() {
        long[] jArr = this.f21106a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f21107b), Arrays.toString(jArr));
    }
}
