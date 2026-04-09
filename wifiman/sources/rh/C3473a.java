package Rh;

import Rh.AbstractC3476d;
import mh.InterfaceC6835l;

/* renamed from: Rh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C3473a implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3476d f19890a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3476d.a f19891b;

    public C3473a(AbstractC3476d abstractC3476d, AbstractC3476d.a aVar) {
        this.f19890a = abstractC3476d;
        this.f19891b = aVar;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return Boolean.valueOf(AbstractC3476d.i(this.f19890a, this.f19891b, obj));
    }
}
