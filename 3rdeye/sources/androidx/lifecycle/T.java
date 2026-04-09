package androidx.lifecycle;

import androidx.lifecycle.AbstractC1781n;
import java.io.Closeable;

/* compiled from: SavedStateHandleController.kt */
/* loaded from: classes.dex */
public final class T implements InterfaceC1788v, Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final String f16098b;

    /* renamed from: c, reason: collision with root package name */
    public final Q f16099c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16100d;

    public T(String str, Q q10) {
        this.f16098b = str;
        this.f16099c = q10;
    }

    public final void a(D1.c registry, AbstractC1781n lifecycle) {
        kotlin.jvm.internal.l.f(registry, "registry");
        kotlin.jvm.internal.l.f(lifecycle, "lifecycle");
        if (this.f16100d) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f16100d = true;
        lifecycle.addObserver(this);
        registry.c(this.f16098b, this.f16099c.f16096e);
    }

    @Override // androidx.lifecycle.InterfaceC1788v
    public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
        if (aVar == AbstractC1781n.a.ON_DESTROY) {
            this.f16100d = false;
            interfaceC1790x.getLifecycle().removeObserver(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
