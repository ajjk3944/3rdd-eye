package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.o3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2473o3 implements InterfaceC2462m2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f21131b;

    public /* synthetic */ C2473o3(IntConsumer intConsumer, int i) {
        this.f21130a = i;
        this.f21131b = intConsumer;
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
        switch (this.f21130a) {
            case 0:
                AbstractC2510w1.D();
                throw null;
            default:
                AbstractC2510w1.D();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC2462m2, j$.util.stream.InterfaceC2472o2
    public final void accept(int i) {
        switch (this.f21130a) {
            case 0:
                this.f21131b.accept(i);
                break;
            default:
                ((U2) this.f21131b).accept(i);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void accept(long j6) {
        switch (this.f21130a) {
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
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        switch (this.f21130a) {
            case 0:
                d((Integer) obj);
                break;
            default:
                d((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f21130a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f21130a) {
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void c(long j6) {
        int i = this.f21130a;
    }

    @Override // j$.util.stream.InterfaceC2462m2
    public final /* synthetic */ void d(Integer num) {
        switch (this.f21130a) {
            case 0:
                AbstractC2510w1.G(this, num);
                break;
            default:
                AbstractC2510w1.G(this, num);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ boolean e() {
        switch (this.f21130a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void m() {
        int i = this.f21130a;
    }
}
