package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class I implements J3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20878a;

    /* renamed from: b, reason: collision with root package name */
    public Object f20879b;

    @Override // j$.util.stream.InterfaceC2472o2, j$.util.stream.InterfaceC2457l2, java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d6) {
        AbstractC2510w1.D();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public /* synthetic */ void accept(int i) {
        AbstractC2510w1.K();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public /* synthetic */ void accept(long j6) {
        AbstractC2510w1.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void c(long j6) {
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void m() {
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void o(Object obj) {
        if (this.f20878a) {
            return;
        }
        this.f20878a = true;
        this.f20879b = obj;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final boolean e() {
        return this.f20878a;
    }
}
