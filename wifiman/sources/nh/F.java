package Nh;

import Nh.G;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
class F implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final G f16440a;

    /* renamed from: b, reason: collision with root package name */
    private final Mh.k f16441b;

    public F(G g10, Mh.k kVar) {
        this.f16440a = g10;
        this.f16441b = kVar;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return G.i0(this.f16440a, this.f16441b, (G.a) obj);
    }
}
