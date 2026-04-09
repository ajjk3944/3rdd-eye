package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.m3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2463m3 implements InterfaceC2457l2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f21121b;

    public /* synthetic */ C2463m3(DoubleConsumer doubleConsumer, int i) {
        this.f21120a = i;
        this.f21121b = doubleConsumer;
    }

    private final /* synthetic */ void a(long j6) {
    }

    private final /* synthetic */ void b(long j6) {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }

    @Override // j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public final void accept(double d6) {
        switch (this.f21120a) {
            case 0:
                this.f21121b.accept(d6);
                break;
            default:
                ((S2) this.f21121b).accept(d6);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void accept(int i) {
        switch (this.f21120a) {
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
        switch (this.f21120a) {
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
        switch (this.f21120a) {
            case 0:
                o((Double) obj);
                break;
            default:
                o((Double) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f21120a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f21120a) {
        }
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void c(long j6) {
        int i = this.f21120a;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ boolean e() {
        switch (this.f21120a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void m() {
        int i = this.f21120a;
    }

    @Override // j$.util.stream.InterfaceC2457l2
    public final /* synthetic */ void o(Double d6) {
        switch (this.f21120a) {
            case 0:
                AbstractC2510w1.E(this, d6);
                break;
            default:
                AbstractC2510w1.E(this, d6);
                break;
        }
    }
}
