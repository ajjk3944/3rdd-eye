package pi;

import ii.InterfaceC6164k;
import java.util.List;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
class U implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final v0 f58092a;

    /* renamed from: b, reason: collision with root package name */
    private final List f58093b;

    /* renamed from: c, reason: collision with root package name */
    private final r0 f58094c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f58095d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6164k f58096e;

    public U(v0 v0Var, List list, r0 r0Var, boolean z10, InterfaceC6164k interfaceC6164k) {
        this.f58092a = v0Var;
        this.f58093b = list;
        this.f58094c = r0Var;
        this.f58095d = z10;
        this.f58096e = interfaceC6164k;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return V.o(this.f58092a, this.f58093b, this.f58094c, this.f58095d, this.f58096e, (kotlin.reflect.jvm.internal.impl.types.checker.g) obj);
    }
}
