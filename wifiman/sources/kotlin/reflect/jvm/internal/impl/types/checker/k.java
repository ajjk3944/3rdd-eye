package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
class k implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final List f52155a;

    public k(List list) {
        this.f52155a = list;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return n.f(this.f52155a);
    }
}
