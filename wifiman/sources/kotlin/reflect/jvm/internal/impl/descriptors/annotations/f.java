package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import Bh.G;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
class f implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.builtins.i f51908a;

    public f(kotlin.reflect.jvm.internal.impl.builtins.i iVar) {
        this.f51908a = iVar;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return g.d(this.f51908a, (G) obj);
    }
}
