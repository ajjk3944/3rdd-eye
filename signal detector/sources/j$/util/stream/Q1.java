package j$.util.stream;

import j$.util.C2395o;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class Q1 implements R1, InterfaceC2467n2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20948a;

    /* renamed from: b, reason: collision with root package name */
    public long f20949b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f20950c;

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

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void m() {
    }

    public Q1(LongBinaryOperator longBinaryOperator) {
        this.f20950c = longBinaryOperator;
    }

    @Override // j$.util.stream.R1
    public final void i(R1 r12) {
        Q1 q12 = (Q1) r12;
        if (q12.f20948a) {
            return;
        }
        accept(q12.f20949b);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f20948a = true;
        this.f20949b = 0L;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void accept(long j6) {
        if (this.f20948a) {
            this.f20948a = false;
            this.f20949b = j6;
        } else {
            this.f20949b = this.f20950c.applyAsLong(this.f20949b, j6);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f20948a ? C2395o.f20813c : new C2395o(this.f20949b);
    }
}
