package androidx.compose.foundation.layout;

import C0.B;
import C0.InterfaceC2534n;
import C0.InterfaceC2535o;
import z.J;

/* loaded from: classes.dex */
final class h extends j {

    /* renamed from: n, reason: collision with root package name */
    private J f28135n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f28136o;

    public h(J j10, boolean z10) {
        this.f28135n = j10;
        this.f28136o = z10;
    }

    @Override // androidx.compose.foundation.layout.j
    public long D2(androidx.compose.ui.layout.m mVar, B b10, long j10) {
        int iS0 = this.f28135n == J.Min ? b10.s0(Y0.b.l(j10)) : b10.s(Y0.b.l(j10));
        if (iS0 < 0) {
            iS0 = 0;
        }
        return Y0.b.f24516b.d(iS0);
    }

    @Override // androidx.compose.foundation.layout.j
    public boolean E2() {
        return this.f28136o;
    }

    public void F2(boolean z10) {
        this.f28136o = z10;
    }

    public final void G2(J j10) {
        this.f28135n = j10;
    }

    @Override // androidx.compose.foundation.layout.j, E0.B
    public int p(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return this.f28135n == J.Min ? interfaceC2534n.s0(i10) : interfaceC2534n.s(i10);
    }

    @Override // androidx.compose.foundation.layout.j, E0.B
    public int v(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return this.f28135n == J.Min ? interfaceC2534n.s0(i10) : interfaceC2534n.s(i10);
    }
}
