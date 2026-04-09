package androidx.compose.ui.layout;

import C0.B;
import C0.D;
import C0.InterfaceC2524d;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
final class c extends e.c implements b {

    /* renamed from: n, reason: collision with root package name */
    private mh.q f28977n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC6835l f28978o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC6839p f28979p;

    public c(mh.q qVar, InterfaceC6835l interfaceC6835l, InterfaceC6839p interfaceC6839p) {
        this.f28977n = qVar;
        this.f28978o = interfaceC6835l;
        this.f28979p = interfaceC6839p;
    }

    public final void D2(mh.q qVar) {
        this.f28977n = qVar;
    }

    public final void E2(InterfaceC6835l interfaceC6835l) {
        this.f28978o = interfaceC6835l;
    }

    public final void F2(InterfaceC6839p interfaceC6839p) {
        this.f28979p = interfaceC6839p;
    }

    @Override // androidx.compose.ui.layout.b
    public D Q0(InterfaceC2524d interfaceC2524d, B b10, long j10) {
        return (D) this.f28977n.s(interfaceC2524d, b10, Y0.b.a(j10));
    }

    @Override // androidx.compose.ui.layout.b
    public boolean S(long j10) {
        return ((Boolean) this.f28978o.invoke(Y0.r.b(j10))).booleanValue();
    }

    @Override // androidx.compose.ui.layout.b
    public boolean k0(t.a aVar, C0.r rVar) {
        return ((Boolean) this.f28979p.invoke(aVar, rVar)).booleanValue();
    }
}
