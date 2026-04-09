package A;

import B.AbstractC2451o;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class j implements AbstractC2451o.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f88a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f89b;

    /* renamed from: c, reason: collision with root package name */
    private final mh.r f90c;

    public j(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, mh.r rVar) {
        this.f88a = interfaceC6835l;
        this.f89b = interfaceC6835l2;
        this.f90c = rVar;
    }

    public final mh.r a() {
        return this.f90c;
    }

    @Override // B.AbstractC2451o.a
    public InterfaceC6835l getKey() {
        return this.f88a;
    }

    @Override // B.AbstractC2451o.a
    public InterfaceC6835l getType() {
        return this.f89b;
    }
}
