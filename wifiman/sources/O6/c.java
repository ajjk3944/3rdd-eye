package O6;

import gg.y;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class c implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f17589a;

    public c(InterfaceC8708a interfaceC8708a) {
        this.f17589a = interfaceC8708a;
    }

    public static c a(InterfaceC8708a interfaceC8708a) {
        return new c(interfaceC8708a);
    }

    public static b c(y yVar) {
        return new b(yVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c((y) this.f17589a.get());
    }
}
