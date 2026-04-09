package z5;

import h5.C2368b;
import h5.C2376j;
import h5.InterfaceC2373g;
import h5.InterfaceC2374h;
import h5.InterfaceC2375i;

/* loaded from: classes3.dex */
public final class m0 implements InterfaceC2373g, InterfaceC2374h {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f24544a = new m0();

    @Override // h5.InterfaceC2375i
    public final InterfaceC2373g h(InterfaceC2374h interfaceC2374h) {
        q5.i.e(interfaceC2374h, "key");
        if (q5.i.a(this, interfaceC2374h)) {
            return this;
        }
        return null;
    }

    @Override // h5.InterfaceC2375i
    public final InterfaceC2375i m(InterfaceC2375i interfaceC2375i) {
        q5.i.e(interfaceC2375i, "context");
        return interfaceC2375i == C2376j.f20486a ? this : (InterfaceC2375i) interfaceC2375i.o(this, new C2368b(1));
    }

    @Override // h5.InterfaceC2375i
    public final InterfaceC2375i n(InterfaceC2374h interfaceC2374h) {
        return a4.p.m(this, interfaceC2374h);
    }

    @Override // h5.InterfaceC2375i
    public final Object o(Object obj, p5.p pVar) {
        return pVar.h(obj, this);
    }

    @Override // h5.InterfaceC2373g
    public final InterfaceC2374h getKey() {
        return this;
    }
}
