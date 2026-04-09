package androidx.lifecycle;

import androidx.lifecycle.AbstractC4013k;
import java.io.Closeable;
import kotlin.jvm.internal.AbstractC6492s;
import q2.C7416d;

/* loaded from: classes.dex */
public final class G implements InterfaceC4015m, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final String f31602a;

    /* renamed from: b, reason: collision with root package name */
    private final E f31603b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31604c;

    public G(String key, E handle) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(handle, "handle");
        this.f31602a = key;
        this.f31603b = handle;
    }

    public final void a(C7416d registry, AbstractC4013k lifecycle) {
        AbstractC6492s.i(registry, "registry");
        AbstractC6492s.i(lifecycle, "lifecycle");
        if (this.f31604c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f31604c = true;
        lifecycle.a(this);
        registry.h(this.f31602a, this.f31603b.g());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.lifecycle.InterfaceC4015m
    public void j(InterfaceC4017o source, AbstractC4013k.a event) {
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(event, "event");
        if (event == AbstractC4013k.a.ON_DESTROY) {
            this.f31604c = false;
            source.O().c(this);
        }
    }

    public final E s() {
        return this.f31603b;
    }

    public final boolean v() {
        return this.f31604c;
    }
}
