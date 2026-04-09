package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Set;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
class y implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f52175a;

    public y(Set set) {
        this.f52175a = set;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return z.f(this.f52175a);
    }
}
