package h5;

import a4.p;

/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2367a implements InterfaceC2373g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2374h f20481a;

    public AbstractC2367a(InterfaceC2374h interfaceC2374h) {
        this.f20481a = interfaceC2374h;
    }

    @Override // h5.InterfaceC2373g
    public final InterfaceC2374h getKey() {
        return this.f20481a;
    }

    @Override // h5.InterfaceC2375i
    public InterfaceC2373g h(InterfaceC2374h interfaceC2374h) {
        q5.i.e(interfaceC2374h, "key");
        if (q5.i.a(getKey(), interfaceC2374h)) {
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
    public InterfaceC2375i n(InterfaceC2374h interfaceC2374h) {
        return p.m(this, interfaceC2374h);
    }

    @Override // h5.InterfaceC2375i
    public final Object o(Object obj, p5.p pVar) {
        return pVar.h(obj, this);
    }
}
