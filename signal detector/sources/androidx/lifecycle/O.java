package androidx.lifecycle;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class O implements InterfaceC0296s, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f5204a;

    /* renamed from: b, reason: collision with root package name */
    public final N f5205b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5206c;

    public O(String str, N n6) {
        this.f5204a = str;
        this.f5205b = n6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.InterfaceC0296s
    public final void d(InterfaceC0298u interfaceC0298u, EnumC0291m enumC0291m) {
        if (enumC0291m == EnumC0291m.ON_DESTROY) {
            this.f5206c = false;
            interfaceC0298u.j().f(this);
        }
    }

    public final void h(F0.f fVar, C0300w c0300w) {
        q5.i.e(fVar, "registry");
        q5.i.e(c0300w, "lifecycle");
        if (this.f5206c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f5206c = true;
        c0300w.a(this);
        fVar.f(this.f5204a, this.f5205b.f5203e);
    }
}
