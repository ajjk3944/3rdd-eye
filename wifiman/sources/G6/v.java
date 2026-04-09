package G6;

import G6.InterfaceC2891a;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class v implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f7078a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f7079b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f7080c;

    public v(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        this.f7078a = interfaceC8708a;
        this.f7079b = interfaceC8708a2;
        this.f7080c = interfaceC8708a3;
    }

    public static v a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        return new v(interfaceC8708a, interfaceC8708a2, interfaceC8708a3);
    }

    public static String[][] c(int i10, int i11, boolean z10) {
        return (String[][]) y2.e.d(InterfaceC2891a.c.u(i10, i11, z10));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String[][] get() {
        return c(((Integer) this.f7078a.get()).intValue(), ((Integer) this.f7079b.get()).intValue(), ((Boolean) this.f7080c.get()).booleanValue());
    }
}
