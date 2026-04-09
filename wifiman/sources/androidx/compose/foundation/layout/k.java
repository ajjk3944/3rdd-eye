package androidx.compose.foundation.layout;

import C0.B;
import C0.InterfaceC2534n;
import C0.InterfaceC2535o;
import z.J;

/* loaded from: classes.dex */
final class k extends j {

    /* renamed from: n, reason: collision with root package name */
    private J f28140n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f28141o;

    public k(J j10, boolean z10) {
        this.f28140n = j10;
        this.f28141o = z10;
    }

    @Override // androidx.compose.foundation.layout.j, E0.B
    public int A(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return this.f28140n == J.Min ? interfaceC2534n.R(i10) : interfaceC2534n.S(i10);
    }

    @Override // androidx.compose.foundation.layout.j
    public long D2(androidx.compose.ui.layout.m mVar, B b10, long j10) {
        int iR = this.f28140n == J.Min ? b10.R(Y0.b.k(j10)) : b10.S(Y0.b.k(j10));
        if (iR < 0) {
            iR = 0;
        }
        return Y0.b.f24516b.e(iR);
    }

    @Override // androidx.compose.foundation.layout.j
    public boolean E2() {
        return this.f28141o;
    }

    public void F2(boolean z10) {
        this.f28141o = z10;
    }

    public final void G2(J j10) {
        this.f28140n = j10;
    }

    @Override // androidx.compose.foundation.layout.j, E0.B
    public int r(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return this.f28140n == J.Min ? interfaceC2534n.R(i10) : interfaceC2534n.S(i10);
    }
}
