package ni;

import mh.InterfaceC6835l;
import ni.C6981m;

/* renamed from: ni.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6983o implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final C6981m.c f54784a;

    /* renamed from: b, reason: collision with root package name */
    private final C6981m f54785b;

    public C6983o(C6981m.c cVar, C6981m c6981m) {
        this.f54784a = cVar;
        this.f54785b = c6981m;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return C6981m.c.f(this.f54784a, this.f54785b, (Zh.f) obj);
    }
}
