package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class X1 extends S1 implements R1 {

    /* renamed from: b, reason: collision with root package name */
    public long f20979b;

    public /* synthetic */ void accept(double d6) {
        AbstractC2510w1.D();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC2510w1.K();
        throw null;
    }

    public /* synthetic */ void accept(long j6) {
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

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final void c(long j6) {
        this.f20979b = 0L;
    }
}
