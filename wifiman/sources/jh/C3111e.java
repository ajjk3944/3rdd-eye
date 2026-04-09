package Jh;

import Bh.InterfaceC2492b;
import Bh.f0;
import mh.InterfaceC6835l;

/* renamed from: Jh.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C3111e implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f10184a;

    public C3111e(f0 f0Var) {
        this.f10184a = f0Var;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return Boolean.valueOf(C3112f.l(this.f10184a, (InterfaceC2492b) obj));
    }
}
