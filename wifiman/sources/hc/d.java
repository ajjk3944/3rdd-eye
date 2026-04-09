package hc;

import gg.s;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class d implements InterfaceC5974b, c {

    /* renamed from: a, reason: collision with root package name */
    private final Hg.d f48577a;

    /* renamed from: b, reason: collision with root package name */
    private final s f48578b;

    public d() {
        Hg.d dVarI1 = Hg.b.k1().i1();
        AbstractC6492s.h(dVarI1, "toSerialized(...)");
        this.f48577a = dVarI1;
        s sVarL1 = dVarI1.o0(Gg.a.a()).r0().l1();
        AbstractC6492s.h(sVarL1, "refCount(...)");
        this.f48578b = sVarL1;
    }

    @Override // hc.InterfaceC5974b
    public void a(C5973a toast) {
        AbstractC6492s.i(toast, "toast");
        Z7.b.h("TOAST SERVICE - show '" + toast + "'", null, 2, null);
        this.f48577a.h(toast);
    }

    @Override // hc.c
    public s b() {
        return this.f48578b;
    }
}
