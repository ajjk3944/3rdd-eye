package G6;

import G6.InterfaceC2891a;
import z2.InterfaceC8708a;

/* renamed from: G6.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2906p implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f7065a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f7066b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f7067c;

    public C2906p(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        this.f7065a = interfaceC8708a;
        this.f7066b = interfaceC8708a2;
        this.f7067c = interfaceC8708a3;
    }

    public static C2906p a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        return new C2906p(interfaceC8708a, interfaceC8708a2, interfaceC8708a3);
    }

    public static N6.j c(int i10, InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return (N6.j) y2.e.d(InterfaceC2891a.c.o(i10, interfaceC8708a, interfaceC8708a2));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public N6.j get() {
        return c(((Integer) this.f7065a.get()).intValue(), this.f7066b, this.f7067c);
    }
}
