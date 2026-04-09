package D5;

import h5.InterfaceC2373g;
import h5.InterfaceC2374h;
import h5.InterfaceC2375i;
import p5.p;

/* loaded from: classes3.dex */
public final class e implements InterfaceC2375i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2375i f1300b;

    public e(InterfaceC2375i interfaceC2375i, Throwable th) {
        this.f1299a = th;
        this.f1300b = interfaceC2375i;
    }

    @Override // h5.InterfaceC2375i
    public final InterfaceC2373g h(InterfaceC2374h interfaceC2374h) {
        return this.f1300b.h(interfaceC2374h);
    }

    @Override // h5.InterfaceC2375i
    public final InterfaceC2375i m(InterfaceC2375i interfaceC2375i) {
        return this.f1300b.m(interfaceC2375i);
    }

    @Override // h5.InterfaceC2375i
    public final InterfaceC2375i n(InterfaceC2374h interfaceC2374h) {
        return this.f1300b.n(interfaceC2374h);
    }

    @Override // h5.InterfaceC2375i
    public final Object o(Object obj, p pVar) {
        return this.f1300b.o(obj, pVar);
    }
}
