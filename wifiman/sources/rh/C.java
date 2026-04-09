package Rh;

import Rh.f0;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
class C implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final String f19859a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19860b;

    public C(String str, String str2) {
        this.f19859a = str;
        this.f19860b = str2;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return X.v(this.f19859a, this.f19860b, (f0.a.C0723a) obj);
    }
}
