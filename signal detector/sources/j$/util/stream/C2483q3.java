package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.q3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2483q3 implements InterfaceC2467n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LongConsumer f21144b;

    public /* synthetic */ C2483q3(LongConsumer longConsumer, int i) {
        this.f21143a = i;
        this.f21144b = longConsumer;
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
        switch (this.f21143a) {
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
        switch (this.f21143a) {
            case 0:
                AbstractC2510w1.K();
                throw null;
            default:
                AbstractC2510w1.K();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC2467n2, j$.util.stream.InterfaceC2472o2
    public final void accept(long j6) {
        switch (this.f21143a) {
            case 0:
                this.f21144b.accept(j6);
                break;
            default:
                ((W2) this.f21144b).accept(j6);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        switch (this.f21143a) {
            case 0:
                l((Long) obj);
                break;
            default:
                l((Long) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f21143a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f21143a) {
        }
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void c(long j6) {
        int i = this.f21143a;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ boolean e() {
        switch (this.f21143a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC2467n2
    public final /* synthetic */ void l(Long l2) {
        switch (this.f21143a) {
            case 0:
                AbstractC2510w1.I(this, l2);
                break;
            default:
                AbstractC2510w1.I(this, l2);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void m() {
        int i = this.f21143a;
    }
}
