package G6;

import G6.InterfaceC2891a;
import z2.InterfaceC8708a;

/* renamed from: G6.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2908s implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f7070a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f7071b;

    public C2908s(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f7070a = interfaceC8708a;
        this.f7071b = interfaceC8708a2;
    }

    public static C2908s a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new C2908s(interfaceC8708a, interfaceC8708a2);
    }

    public static gg.s c(int i10, P6.v vVar) {
        return (gg.s) y2.e.d(InterfaceC2891a.c.r(i10, vVar));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public gg.s get() {
        return c(((Integer) this.f7070a.get()).intValue(), (P6.v) this.f7071b.get());
    }
}
