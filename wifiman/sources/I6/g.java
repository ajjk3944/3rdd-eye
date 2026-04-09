package I6;

import M6.x;
import gg.y;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class g implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f8645a;

    public g(InterfaceC8708a interfaceC8708a) {
        this.f8645a = interfaceC8708a;
    }

    public static g a(InterfaceC8708a interfaceC8708a) {
        return new g(interfaceC8708a);
    }

    public static x c(y yVar) {
        return (x) y2.e.d(b.e(yVar));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((y) this.f8645a.get());
    }
}
