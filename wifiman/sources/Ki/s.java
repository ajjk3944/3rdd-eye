package Ki;

import Ii.L;
import Ki.w;
import Yg.J;
import dh.InterfaceC5384i;

/* loaded from: classes4.dex */
final class s extends h implements t {
    public s(InterfaceC5384i interfaceC5384i, g gVar) {
        super(interfaceC5384i, gVar, true, true);
    }

    @Override // Ii.AbstractC3043a
    protected void O0(Throwable th2, boolean z10) {
        if (S0().f(th2) || z10) {
            return;
        }
        L.a(getContext(), th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ii.AbstractC3043a
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public void P0(J j10) {
        w.a.a(S0(), null, 1, null);
    }

    @Override // Ki.t
    public /* bridge */ /* synthetic */ w g() {
        return R0();
    }

    @Override // Ii.AbstractC3043a, Ii.D0, Ii.InterfaceC3091y0
    public boolean isActive() {
        return super.isActive();
    }
}
