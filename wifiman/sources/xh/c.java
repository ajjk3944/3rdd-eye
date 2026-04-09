package xh;

import java.util.Map;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
class c implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final Class f66107a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f66108b;

    public c(Class cls, Map map) {
        this.f66107a = cls;
        this.f66108b = map;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return f.l(this.f66107a, this.f66108b);
    }
}
