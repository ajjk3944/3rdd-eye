package C0;

import androidx.compose.ui.e;

/* loaded from: classes.dex */
public final class y extends e.c implements E0.B {

    /* renamed from: n, reason: collision with root package name */
    private mh.q f2167n;

    public y(mh.q qVar) {
        this.f2167n = qVar;
    }

    public final void D2(mh.q qVar) {
        this.f2167n = qVar;
    }

    @Override // E0.B
    public D b(androidx.compose.ui.layout.m mVar, B b10, long j10) {
        return (D) this.f2167n.s(mVar, b10, Y0.b.a(j10));
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f2167n + ')';
    }
}
