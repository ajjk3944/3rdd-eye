package v0;

import T.InterfaceC3551q0;
import T.t1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class c implements InterfaceC8184b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f63355a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f63356b;

    public /* synthetic */ c(int i10, InterfaceC6835l interfaceC6835l, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, interfaceC6835l);
    }

    @Override // v0.InterfaceC8184b
    public int a() {
        return ((C8183a) this.f63356b.getValue()).i();
    }

    public void b(int i10) {
        this.f63356b.setValue(C8183a.c(i10));
    }

    private c(int i10, InterfaceC6835l interfaceC6835l) {
        this.f63355a = interfaceC6835l;
        this.f63356b = t1.d(C8183a.c(i10), null, 2, null);
    }
}
