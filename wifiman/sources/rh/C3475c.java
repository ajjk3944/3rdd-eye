package Rh;

import Rh.AbstractC3476d;
import mh.InterfaceC6835l;

/* renamed from: Rh.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C3475c implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3476d f19896a;

    /* renamed from: b, reason: collision with root package name */
    private final ri.o f19897b;

    public C3475c(AbstractC3476d abstractC3476d, ri.o oVar) {
        this.f19896a = abstractC3476d;
        this.f19897b = oVar;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return AbstractC3476d.I(this.f19896a, this.f19897b, (AbstractC3476d.a) obj);
    }
}
