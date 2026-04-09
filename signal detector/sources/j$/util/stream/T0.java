package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class T0 extends S0 implements InterfaceC2504v0 {
    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void accept(int i) {
        AbstractC2510w1.K();
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
        o((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2457l2
    public final /* synthetic */ void o(Double d6) {
        AbstractC2510w1.E(this, d6);
    }

    @Override // j$.util.stream.InterfaceC2519y0
    public final /* bridge */ /* synthetic */ G0 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.InterfaceC2504v0, j$.util.stream.InterfaceC2519y0
    public final A0 build() {
        int i = this.f20963b;
        double[] dArr = this.f20962a;
        if (i >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f20963b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        double[] dArr = this.f20962a;
        if (j6 != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j6), Integer.valueOf(dArr.length)));
        }
        this.f20963b = 0;
    }

    @Override // j$.util.stream.InterfaceC2472o2, j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final void accept(double d6) {
        int i = this.f20963b;
        double[] dArr = this.f20962a;
        if (i < dArr.length) {
            this.f20963b = i + 1;
            dArr[i] = d6;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void m() {
        int i = this.f20963b;
        double[] dArr = this.f20962a;
        if (i < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f20963b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.S0
    public final String toString() {
        double[] dArr = this.f20962a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f20963b), Arrays.toString(dArr));
    }
}
