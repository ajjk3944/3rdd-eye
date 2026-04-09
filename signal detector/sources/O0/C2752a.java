package o0;

import h5.InterfaceC2375i;
import q5.i;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2752a implements AutoCloseable, InterfaceC3044u {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2375i f22664a;

    public C2752a(InterfaceC2375i interfaceC2375i) {
        i.e(interfaceC2375i, "coroutineContext");
        this.f22664a = interfaceC2375i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        AbstractC3046w.d(this.f22664a, null);
    }

    @Override // z5.InterfaceC3044u
    public final InterfaceC2375i k() {
        return this.f22664a;
    }
}
