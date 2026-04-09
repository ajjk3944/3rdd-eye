package pi;

import java.util.Collection;
import mh.InterfaceC6835l;
import pi.u0;
import ri.InterfaceC7619j;

/* renamed from: pi.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C7347e implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final Collection f58111a;

    /* renamed from: b, reason: collision with root package name */
    private final u0 f58112b;

    /* renamed from: c, reason: collision with root package name */
    private final ri.o f58113c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC7619j f58114d;

    public C7347e(Collection collection, u0 u0Var, ri.o oVar, InterfaceC7619j interfaceC7619j) {
        this.f58111a = collection;
        this.f58112b = u0Var;
        this.f58113c = oVar;
        this.f58114d = interfaceC7619j;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return C7351g.x(this.f58111a, this.f58112b, this.f58113c, this.f58114d, (u0.a) obj);
    }
}
