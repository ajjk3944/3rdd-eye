package G6;

import G6.InterfaceC2891a;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class w implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f7081a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f7082b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f7083c;

    public w(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        this.f7081a = interfaceC8708a;
        this.f7082b = interfaceC8708a2;
        this.f7083c = interfaceC8708a3;
    }

    public static w a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        return new w(interfaceC8708a, interfaceC8708a2, interfaceC8708a3);
    }

    public static N6.q c(int i10, InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return (N6.q) y2.e.d(InterfaceC2891a.c.v(i10, interfaceC8708a, interfaceC8708a2));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public N6.q get() {
        return c(((Integer) this.f7081a.get()).intValue(), this.f7082b, this.f7083c);
    }
}
