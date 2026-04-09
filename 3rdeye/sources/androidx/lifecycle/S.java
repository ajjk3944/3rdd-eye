package androidx.lifecycle;

import androidx.lifecycle.AbstractC1781n;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class S implements InterfaceC1788v {

    /* renamed from: b, reason: collision with root package name */
    public final V f16097b;

    public S(V v10) {
        this.f16097b = v10;
    }

    @Override // androidx.lifecycle.InterfaceC1788v
    public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
        if (aVar == AbstractC1781n.a.ON_CREATE) {
            interfaceC1790x.getLifecycle().removeObserver(this);
            this.f16097b.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
