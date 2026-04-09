package di;

import Bh.G;
import mh.InterfaceC6835l;
import pi.S;

/* loaded from: classes4.dex */
class y implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final S f46114a;

    public y(S s10) {
        this.f46114a = s10;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return z.c(this.f46114a, (G) obj);
    }
}
