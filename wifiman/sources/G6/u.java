package G6;

import G6.InterfaceC2891a;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class u implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f7076a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f7077b;

    public u(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f7076a = interfaceC8708a;
        this.f7077b = interfaceC8708a2;
    }

    public static u a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new u(interfaceC8708a, interfaceC8708a2);
    }

    public static String[][] c(int i10, int i11) {
        return (String[][]) y2.e.d(InterfaceC2891a.c.t(i10, i11));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String[][] get() {
        return c(((Integer) this.f7076a.get()).intValue(), ((Integer) this.f7077b.get()).intValue());
    }
}
