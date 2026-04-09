package li;

import mh.InterfaceC6835l;

/* renamed from: li.S, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6615S implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final C6620X f52676a;

    public C6615S(C6620X c6620x) {
        this.f52676a = c6620x;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return C6620X.f(this.f52676a, ((Number) obj).intValue());
    }
}
