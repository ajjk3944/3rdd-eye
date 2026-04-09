package Nh;

import mh.InterfaceC6835l;

/* renamed from: Nh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C3374a implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final C3375b f16492a;

    public C3374a(C3375b c3375b) {
        this.f16492a = c3375b;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return Boolean.valueOf(C3375b.h(this.f16492a, (Qh.r) obj));
    }
}
