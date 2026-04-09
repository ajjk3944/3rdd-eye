package Ii;

/* renamed from: Ii.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3092z {
    public static final InterfaceC3088x a(InterfaceC3091y0 interfaceC3091y0) {
        return new C3090y(interfaceC3091y0);
    }

    public static /* synthetic */ InterfaceC3088x b(InterfaceC3091y0 interfaceC3091y0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC3091y0 = null;
        }
        return a(interfaceC3091y0);
    }

    public static final boolean c(InterfaceC3088x interfaceC3088x, Object obj) {
        Throwable thH = Yg.u.h(obj);
        return thH == null ? interfaceC3088x.S(obj) : interfaceC3088x.a(thH);
    }
}
