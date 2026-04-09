package pi;

import mh.InterfaceC6824a;
import ri.InterfaceC7619j;

/* renamed from: pi.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C7349f implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final u0 f58120a;

    /* renamed from: b, reason: collision with root package name */
    private final ri.o f58121b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7619j f58122c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC7619j f58123d;

    public C7349f(u0 u0Var, ri.o oVar, InterfaceC7619j interfaceC7619j, InterfaceC7619j interfaceC7619j2) {
        this.f58120a = u0Var;
        this.f58121b = oVar;
        this.f58122c = interfaceC7619j;
        this.f58123d = interfaceC7619j2;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return Boolean.valueOf(C7351g.y(this.f58120a, this.f58121b, this.f58122c, this.f58123d));
    }
}
