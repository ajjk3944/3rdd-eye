package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2401a1 extends J0 implements InterfaceC2519y0 {
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

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void accept(long j6) {
        AbstractC2510w1.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2519y0
    public final G0 build() {
        int i = this.f20891b;
        Object[] objArr = this.f20890a;
        if (i >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f20891b), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        Object[] objArr = this.f20890a;
        if (j6 != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j6), Integer.valueOf(objArr.length)));
        }
        this.f20891b = 0;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        int i = this.f20891b;
        Object[] objArr = this.f20890a;
        if (i < objArr.length) {
            this.f20891b = i + 1;
            objArr[i] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void m() {
        int i = this.f20891b;
        Object[] objArr = this.f20890a;
        if (i < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f20891b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // j$.util.stream.J0
    public final String toString() {
        Object[] objArr = this.f20890a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f20891b), Arrays.toString(objArr));
    }
}
