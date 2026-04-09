package s;

import E0.AbstractC2631i;
import E0.InterfaceC2630h;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import v0.C8183a;
import v0.InterfaceC8184b;

/* renamed from: s.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7862x extends e.c implements InterfaceC2630h, k0.h {

    /* renamed from: n, reason: collision with root package name */
    private final boolean f60793n;

    private final InterfaceC8184b D2() {
        return (InterfaceC8184b) AbstractC2631i.a(this, AbstractC3932k0.l());
    }

    @Override // androidx.compose.ui.e.c
    public boolean i2() {
        return this.f60793n;
    }

    @Override // k0.h
    public void o0(androidx.compose.ui.focus.k kVar) {
        kVar.w(!C8183a.f(D2().a(), C8183a.f63351b.b()));
    }
}
