package Rh;

import Rh.f0;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
class D implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final String f19861a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19862b;

    public D(String str, String str2) {
        this.f19861a = str;
        this.f19862b = str2;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return X.w(this.f19861a, this.f19862b, (f0.a.C0723a) obj);
    }
}
