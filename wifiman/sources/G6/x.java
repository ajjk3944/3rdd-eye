package G6;

import G6.InterfaceC2891a;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class x implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f7084a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f7085b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f7086c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f7087d;

    public x(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        this.f7084a = interfaceC8708a;
        this.f7085b = interfaceC8708a2;
        this.f7086c = interfaceC8708a3;
        this.f7087d = interfaceC8708a4;
    }

    public static x a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        return new x(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4);
    }

    public static N6.B c(int i10, InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        return (N6.B) y2.e.d(InterfaceC2891a.c.w(i10, interfaceC8708a, interfaceC8708a2, interfaceC8708a3));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public N6.B get() {
        return c(((Integer) this.f7084a.get()).intValue(), this.f7085b, this.f7086c, this.f7087d);
    }
}
