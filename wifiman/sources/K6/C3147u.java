package K6;

import K6.InterfaceC3130c;
import z2.InterfaceC8708a;

/* renamed from: K6.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3147u implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10453a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f10454b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f10455c;

    public C3147u(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        this.f10453a = interfaceC8708a;
        this.f10454b = interfaceC8708a2;
        this.f10455c = interfaceC8708a3;
    }

    public static C3147u a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        return new C3147u(interfaceC8708a, interfaceC8708a2, interfaceC8708a3);
    }

    public static C3146t c(O6.a aVar, InterfaceC3130c.a aVar2, gg.y yVar) {
        return new C3146t(aVar, aVar2, yVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3146t get() {
        return c((O6.a) this.f10453a.get(), (InterfaceC3130c.a) this.f10454b.get(), (gg.y) this.f10455c.get());
    }
}
