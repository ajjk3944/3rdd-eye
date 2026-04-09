package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2411c1 extends C2406b1 implements InterfaceC2509w0 {
    @Override // j$.util.stream.InterfaceC2472o2, j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d6) {
        AbstractC2510w1.D();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void accept(long j6) {
        AbstractC2510w1.L();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC2462m2
    public final /* synthetic */ void d(Integer num) {
        AbstractC2510w1.G(this, num);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2519y0
    public final /* bridge */ /* synthetic */ G0 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.InterfaceC2509w0, j$.util.stream.InterfaceC2519y0
    public final C0 build() {
        int i = this.f21013b;
        int[] iArr = this.f21012a;
        if (i >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f21013b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        int[] iArr = this.f21012a;
        if (j6 != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j6), Integer.valueOf(iArr.length)));
        }
        this.f21013b = 0;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void accept(int i) {
        int i3 = this.f21013b;
        int[] iArr = this.f21012a;
        if (i3 < iArr.length) {
            this.f21013b = i3 + 1;
            iArr[i3] = i;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void m() {
        int i = this.f21013b;
        int[] iArr = this.f21012a;
        if (i < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f21013b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.C2406b1
    public final String toString() {
        int[] iArr = this.f21012a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f21013b), Arrays.toString(iArr));
    }
}
