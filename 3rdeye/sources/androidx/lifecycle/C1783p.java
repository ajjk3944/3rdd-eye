package androidx.lifecycle;

import A9.InterfaceC0594o0;
import androidx.lifecycle.AbstractC1781n;

/* compiled from: LifecycleController.jvm.kt */
/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1783p {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1781n f16171a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1781n.b f16172b;

    /* renamed from: c, reason: collision with root package name */
    public final C1773f f16173c;

    /* renamed from: d, reason: collision with root package name */
    public final C1782o f16174d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.o, androidx.lifecycle.w] */
    public C1783p(AbstractC1781n lifecycle, AbstractC1781n.b minState, C1773f dispatchQueue, final InterfaceC0594o0 interfaceC0594o0) {
        kotlin.jvm.internal.l.f(lifecycle, "lifecycle");
        kotlin.jvm.internal.l.f(minState, "minState");
        kotlin.jvm.internal.l.f(dispatchQueue, "dispatchQueue");
        this.f16171a = lifecycle;
        this.f16172b = minState;
        this.f16173c = dispatchQueue;
        ?? r32 = new InterfaceC1788v() { // from class: androidx.lifecycle.o
            @Override // androidx.lifecycle.InterfaceC1788v
            public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
                C1783p this$0 = this.f16169b;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                InterfaceC0594o0 interfaceC0594o02 = interfaceC0594o0;
                if (interfaceC1790x.getLifecycle().getCurrentState() == AbstractC1781n.b.DESTROYED) {
                    interfaceC0594o02.c(null);
                    this$0.a();
                    return;
                }
                int iCompareTo = interfaceC1790x.getLifecycle().getCurrentState().compareTo(this$0.f16172b);
                C1773f c1773f = this$0.f16173c;
                if (iCompareTo < 0) {
                    c1773f.f16146a = true;
                } else if (c1773f.f16146a) {
                    if (c1773f.f16147b) {
                        throw new IllegalStateException("Cannot resume a finished dispatcher");
                    }
                    c1773f.f16146a = false;
                    c1773f.a();
                }
            }
        };
        this.f16174d = r32;
        if (lifecycle.getCurrentState() != AbstractC1781n.b.DESTROYED) {
            lifecycle.addObserver(r32);
        } else {
            interfaceC0594o0.c(null);
            a();
        }
    }

    public final void a() {
        this.f16171a.removeObserver(this.f16174d);
        C1773f c1773f = this.f16173c;
        c1773f.f16147b = true;
        c1773f.a();
    }
}
