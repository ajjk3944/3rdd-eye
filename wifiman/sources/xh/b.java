package xh;

import java.util.Map;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
class b implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f66106a;

    public b(Map map) {
        this.f66106a = map;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return Integer.valueOf(f.j(this.f66106a));
    }
}
