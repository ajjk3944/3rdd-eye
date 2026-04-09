package P6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class t implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f18107a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f18108b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f18109c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f18110d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC8708a f18111e;

    public t(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4, InterfaceC8708a interfaceC8708a5) {
        this.f18107a = interfaceC8708a;
        this.f18108b = interfaceC8708a2;
        this.f18109c = interfaceC8708a3;
        this.f18110d = interfaceC8708a4;
        this.f18111e = interfaceC8708a5;
    }

    public static t a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4, InterfaceC8708a interfaceC8708a5) {
        return new t(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4, interfaceC8708a5);
    }

    public static s c(G g10, gg.s sVar, gg.s sVar2, x xVar, gg.y yVar) {
        return new s(g10, sVar, sVar2, xVar, yVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c((G) this.f18107a.get(), (gg.s) this.f18108b.get(), (gg.s) this.f18109c.get(), (x) this.f18110d.get(), (gg.y) this.f18111e.get());
    }
}
