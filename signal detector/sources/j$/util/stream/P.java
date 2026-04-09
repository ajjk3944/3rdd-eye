package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class P implements I3, J3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20935a;

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
    public final /* synthetic */ void c(long j6) {
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2472o2
    public final /* synthetic */ void m() {
    }

    public P(boolean z6) {
        this.f20935a = z6;
    }

    @Override // j$.util.stream.I3
    public final int v() {
        if (this.f20935a) {
            return 0;
        }
        return EnumC2413c3.f21038r;
    }

    public final void a(AbstractC2510w1 abstractC2510w1, Spliterator spliterator) {
        if (this.f20935a) {
            new Q(abstractC2510w1, spliterator, this).invoke();
        } else {
            new S(abstractC2510w1, spliterator, abstractC2510w1.x0(this)).invoke();
        }
    }
}
