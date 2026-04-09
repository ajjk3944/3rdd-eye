package A9;

import F9.m;

/* compiled from: LockFreeLinkedList.kt */
/* renamed from: A9.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0607v0 extends m.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0605u0 f288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0584j0 f289e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0607v0(AbstractC0603t0 abstractC0603t0, C0605u0 c0605u0, InterfaceC0584j0 interfaceC0584j0) {
        super(abstractC0603t0);
        this.f288d = c0605u0;
        this.f289e = interfaceC0584j0;
    }

    @Override // F9.AbstractC0659b
    public final F9.y c(Object obj) {
        if (this.f288d.L() == this.f289e) {
            return null;
        }
        return F9.l.f1767a;
    }
}
