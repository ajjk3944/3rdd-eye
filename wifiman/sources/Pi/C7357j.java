package pi;

import mh.InterfaceC6835l;
import pi.AbstractC7369p;

/* renamed from: pi.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C7357j implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7369p f58134a;

    public C7357j(AbstractC7369p abstractC7369p) {
        this.f58134a = abstractC7369p;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return AbstractC7369p.C(this.f58134a, (AbstractC7369p.b) obj);
    }
}
