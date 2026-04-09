package androidx.lifecycle;

import h5.InterfaceC2375i;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294p implements InterfaceC0296s, InterfaceC3044u {

    /* renamed from: a, reason: collision with root package name */
    public final C0300w f5251a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2375i f5252b;

    public C0294p(C0300w c0300w, InterfaceC2375i interfaceC2375i) {
        q5.i.e(interfaceC2375i, "coroutineContext");
        this.f5251a = c0300w;
        this.f5252b = interfaceC2375i;
        if (c0300w.f5259d == EnumC0292n.f5243a) {
            AbstractC3046w.d(interfaceC2375i, null);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0296s
    public final void d(InterfaceC0298u interfaceC0298u, EnumC0291m enumC0291m) {
        C0300w c0300w = this.f5251a;
        if (c0300w.f5259d.compareTo(EnumC0292n.f5243a) <= 0) {
            c0300w.f(this);
            AbstractC3046w.d(this.f5252b, null);
        }
    }

    @Override // z5.InterfaceC3044u
    public final InterfaceC2375i k() {
        return this.f5252b;
    }
}
