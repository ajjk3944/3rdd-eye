package androidx.lifecycle;

import A9.C0572d0;
import androidx.lifecycle.AbstractC1781n;
import f9.InterfaceC4350h;

/* compiled from: Lifecycle.kt */
/* renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1786t extends r implements InterfaceC1788v {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1781n f16180b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4350h f16181c;

    public C1786t(AbstractC1781n abstractC1781n, InterfaceC4350h coroutineContext) {
        kotlin.jvm.internal.l.f(coroutineContext, "coroutineContext");
        this.f16180b = abstractC1781n;
        this.f16181c = coroutineContext;
        if (abstractC1781n.getCurrentState() == AbstractC1781n.b.DESTROYED) {
            C0572d0.b(coroutineContext, null);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1788v
    public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
        AbstractC1781n abstractC1781n = this.f16180b;
        if (abstractC1781n.getCurrentState().compareTo(AbstractC1781n.b.DESTROYED) <= 0) {
            abstractC1781n.removeObserver(this);
            C0572d0.b(this.f16181c, null);
        }
    }

    @Override // A9.E
    public final InterfaceC4350h k0() {
        return this.f16181c;
    }
}
