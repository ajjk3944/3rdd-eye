package Rh;

import Rh.f0;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
class A implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final String f19856a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19857b;

    public A(String str, String str2) {
        this.f19856a = str;
        this.f19857b = str2;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return X.s(this.f19856a, this.f19857b, (f0.a.C0723a) obj);
    }
}
