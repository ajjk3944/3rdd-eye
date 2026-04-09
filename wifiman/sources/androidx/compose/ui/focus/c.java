package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import k0.InterfaceC6354b;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class c extends e.c implements InterfaceC6354b {

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC6835l f28821n;

    /* renamed from: o, reason: collision with root package name */
    private k0.l f28822o;

    public c(InterfaceC6835l interfaceC6835l) {
        this.f28821n = interfaceC6835l;
    }

    public final void D2(InterfaceC6835l interfaceC6835l) {
        this.f28821n = interfaceC6835l;
    }

    @Override // k0.InterfaceC6354b
    public void J1(k0.l lVar) {
        if (AbstractC6492s.d(this.f28822o, lVar)) {
            return;
        }
        this.f28822o = lVar;
        this.f28821n.invoke(lVar);
    }
}
