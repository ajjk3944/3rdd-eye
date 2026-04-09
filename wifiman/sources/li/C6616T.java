package li;

import mh.InterfaceC6835l;

/* renamed from: li.T, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6616T implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final C6620X f52677a;

    public C6616T(C6620X c6620x) {
        this.f52677a = c6620x;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return C6620X.v(this.f52677a, ((Number) obj).intValue());
    }
}
