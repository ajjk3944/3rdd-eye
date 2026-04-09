package K6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class m0 implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10423a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f10424b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f10425c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f10426d;

    public m0(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        this.f10423a = interfaceC8708a;
        this.f10424b = interfaceC8708a2;
        this.f10425c = interfaceC8708a3;
        this.f10426d = interfaceC8708a4;
    }

    public static m0 a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        return new m0(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4);
    }

    public static l0 c(gg.y yVar, C3128a c3128a, Object obj, Object obj2) {
        return new l0(yVar, c3128a, (A) obj, (T) obj2);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0 get() {
        return c((gg.y) this.f10423a.get(), (C3128a) this.f10424b.get(), this.f10425c.get(), this.f10426d.get());
    }
}
