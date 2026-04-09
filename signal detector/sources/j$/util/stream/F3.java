package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class F3 implements InterfaceC2472o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f20862b;

    public /* synthetic */ F3(Consumer consumer, int i) {
        this.f20861a = i;
        this.f20862b = consumer;
    }

    private final /* synthetic */ void a(long j6) {
    }

    private final /* synthetic */ void b(long j6) {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }

    @Override // j$.util.stream.InterfaceC2472o2, j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d6) {
        switch (this.f20861a) {
            case 0:
                AbstractC2510w1.D();
                throw null;
            default:
                AbstractC2510w1.D();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void accept(int i) {
        switch (this.f20861a) {
            case 0:
                AbstractC2510w1.K();
                throw null;
            default:
                AbstractC2510w1.K();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void accept(long j6) {
        switch (this.f20861a) {
            case 0:
                AbstractC2510w1.L();
                throw null;
            default:
                AbstractC2510w1.L();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        switch (this.f20861a) {
            case 0:
                ((Z2) this.f20862b).o(obj);
                break;
            default:
                this.f20862b.o(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f20861a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void c(long j6) {
        int i = this.f20861a;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ boolean e() {
        switch (this.f20861a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void m() {
        int i = this.f20861a;
    }
}
