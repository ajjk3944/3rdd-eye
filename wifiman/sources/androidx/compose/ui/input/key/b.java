package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.e;
import mh.InterfaceC6835l;
import w0.C8248b;
import w0.InterfaceC8251e;

/* loaded from: classes.dex */
final class b extends e.c implements InterfaceC8251e {

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC6835l f28944n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC6835l f28945o;

    public b(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        this.f28944n = interfaceC6835l;
        this.f28945o = interfaceC6835l2;
    }

    public final void D2(InterfaceC6835l interfaceC6835l) {
        this.f28944n = interfaceC6835l;
    }

    public final void E2(InterfaceC6835l interfaceC6835l) {
        this.f28945o = interfaceC6835l;
    }

    @Override // w0.InterfaceC8251e
    public boolean Q(KeyEvent keyEvent) {
        InterfaceC6835l interfaceC6835l = this.f28945o;
        if (interfaceC6835l != null) {
            return ((Boolean) interfaceC6835l.invoke(C8248b.a(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // w0.InterfaceC8251e
    public boolean r0(KeyEvent keyEvent) {
        InterfaceC6835l interfaceC6835l = this.f28944n;
        if (interfaceC6835l != null) {
            return ((Boolean) interfaceC6835l.invoke(C8248b.a(keyEvent))).booleanValue();
        }
        return false;
    }
}
