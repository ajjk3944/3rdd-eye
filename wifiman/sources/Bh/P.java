package Bh;

import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
class P implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final Zh.c f1767a;

    public P(Zh.c cVar) {
        this.f1767a = cVar;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return Boolean.valueOf(Q.g(this.f1767a, (Zh.c) obj));
    }
}
