package Gh;

import java.lang.reflect.Method;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
class p implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final q f7488a;

    public p(q qVar) {
        this.f7488a = qVar;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return Boolean.valueOf(q.T(this.f7488a, (Method) obj));
    }
}
