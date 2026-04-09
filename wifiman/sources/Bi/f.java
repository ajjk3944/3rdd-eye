package bi;

import Bh.InterfaceC2491a;
import Bh.InterfaceC2503m;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
class f implements InterfaceC6839p {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2491a f33352a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2491a f33353b;

    public f(InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2) {
        this.f33352a = interfaceC2491a;
        this.f33353b = interfaceC2491a2;
    }

    @Override // mh.InterfaceC6839p
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(g.i(this.f33352a, this.f33353b, (InterfaceC2503m) obj, (InterfaceC2503m) obj2));
    }
}
