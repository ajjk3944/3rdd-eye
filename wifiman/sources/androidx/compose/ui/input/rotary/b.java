package androidx.compose.ui.input.rotary;

import androidx.compose.ui.e;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class b extends e.c implements A0.a {

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC6835l f28957n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC6835l f28958o;

    public b(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        this.f28957n = interfaceC6835l;
        this.f28958o = interfaceC6835l2;
    }

    public final void D2(InterfaceC6835l interfaceC6835l) {
        this.f28957n = interfaceC6835l;
    }

    public final void E2(InterfaceC6835l interfaceC6835l) {
        this.f28958o = interfaceC6835l;
    }

    @Override // A0.a
    public boolean J0(A0.b bVar) {
        InterfaceC6835l interfaceC6835l = this.f28958o;
        if (interfaceC6835l != null) {
            return ((Boolean) interfaceC6835l.invoke(bVar)).booleanValue();
        }
        return false;
    }

    @Override // A0.a
    public boolean Y0(A0.b bVar) {
        InterfaceC6835l interfaceC6835l = this.f28957n;
        if (interfaceC6835l != null) {
            return ((Boolean) interfaceC6835l.invoke(bVar)).booleanValue();
        }
        return false;
    }
}
