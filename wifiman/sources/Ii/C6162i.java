package ii;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;

/* renamed from: ii.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6162i extends AbstractC6154a {

    /* renamed from: b, reason: collision with root package name */
    private final oi.i f49218b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6162i(InterfaceC6824a getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        AbstractC6492s.i(getScope, "getScope");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6164k k(InterfaceC6824a interfaceC6824a) {
        InterfaceC6164k interfaceC6164k = (InterfaceC6164k) interfaceC6824a.invoke();
        return interfaceC6164k instanceof AbstractC6154a ? ((AbstractC6154a) interfaceC6164k).h() : interfaceC6164k;
    }

    @Override // ii.AbstractC6154a
    protected InterfaceC6164k i() {
        return (InterfaceC6164k) this.f49218b.invoke();
    }

    public /* synthetic */ C6162i(oi.n nVar, InterfaceC6824a interfaceC6824a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? oi.f.f55716e : nVar, interfaceC6824a);
    }

    public C6162i(oi.n storageManager, InterfaceC6824a getScope) {
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(getScope, "getScope");
        this.f49218b = storageManager.f(new C6161h(getScope));
    }
}
