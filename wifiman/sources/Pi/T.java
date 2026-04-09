package pi;

import java.util.List;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
class T implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final v0 f58088a;

    /* renamed from: b, reason: collision with root package name */
    private final List f58089b;

    /* renamed from: c, reason: collision with root package name */
    private final r0 f58090c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f58091d;

    public T(v0 v0Var, List list, r0 r0Var, boolean z10) {
        this.f58088a = v0Var;
        this.f58089b = list;
        this.f58090c = r0Var;
        this.f58091d = z10;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return V.l(this.f58088a, this.f58089b, this.f58090c, this.f58091d, (kotlin.reflect.jvm.internal.impl.types.checker.g) obj);
    }
}
