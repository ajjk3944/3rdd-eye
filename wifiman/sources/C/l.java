package C;

import B.AbstractC2451o;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class l implements AbstractC2451o.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f2004a;

    /* renamed from: b, reason: collision with root package name */
    private final mh.r f2005b;

    public l(InterfaceC6835l interfaceC6835l, mh.r rVar) {
        this.f2004a = interfaceC6835l;
        this.f2005b = rVar;
    }

    public final mh.r a() {
        return this.f2005b;
    }

    @Override // B.AbstractC2451o.a
    public InterfaceC6835l getKey() {
        return this.f2004a;
    }
}
