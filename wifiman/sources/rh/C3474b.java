package Rh;

import mh.InterfaceC6835l;

/* renamed from: Rh.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C3474b implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final j0 f19893a;

    /* renamed from: b, reason: collision with root package name */
    private final C3480h[] f19894b;

    public C3474b(j0 j0Var, C3480h[] c3480hArr) {
        this.f19893a = j0Var;
        this.f19894b = c3480hArr;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return AbstractC3476d.e(this.f19893a, this.f19894b, ((Number) obj).intValue());
    }
}
