package J0;

import E0.v0;
import androidx.compose.ui.e;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class c extends e.c implements v0 {

    /* renamed from: n, reason: collision with root package name */
    private boolean f9590n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f9591o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC6835l f9592p;

    public c(boolean z10, boolean z11, InterfaceC6835l interfaceC6835l) {
        this.f9590n = z10;
        this.f9591o = z11;
        this.f9592p = interfaceC6835l;
    }

    @Override // E0.v0
    public boolean D0() {
        return this.f9591o;
    }

    public final void D2(boolean z10) {
        this.f9590n = z10;
    }

    public final void E2(InterfaceC6835l interfaceC6835l) {
        this.f9592p = interfaceC6835l;
    }

    @Override // E0.v0
    public boolean S1() {
        return this.f9590n;
    }

    @Override // E0.v0
    public void q(w wVar) {
        this.f9592p.invoke(wVar);
    }
}
