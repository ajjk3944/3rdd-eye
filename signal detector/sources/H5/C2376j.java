package h5;

import java.io.Serializable;
import p5.p;

/* renamed from: h5.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2376j implements InterfaceC2375i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final C2376j f20486a = new C2376j();

    @Override // h5.InterfaceC2375i
    public final InterfaceC2373g h(InterfaceC2374h interfaceC2374h) {
        q5.i.e(interfaceC2374h, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // h5.InterfaceC2375i
    public final InterfaceC2375i m(InterfaceC2375i interfaceC2375i) {
        q5.i.e(interfaceC2375i, "context");
        return interfaceC2375i;
    }

    @Override // h5.InterfaceC2375i
    public final InterfaceC2375i n(InterfaceC2374h interfaceC2374h) {
        q5.i.e(interfaceC2374h, "key");
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // h5.InterfaceC2375i
    public final Object o(Object obj, p pVar) {
        return obj;
    }
}
