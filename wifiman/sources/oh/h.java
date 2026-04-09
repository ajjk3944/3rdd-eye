package Oh;

import Bh.InterfaceC2495e;
import mh.InterfaceC6835l;
import pi.AbstractC7346d0;

/* loaded from: classes4.dex */
class h implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2495e f17851a;

    /* renamed from: b, reason: collision with root package name */
    private final i f17852b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC7346d0 f17853c;

    /* renamed from: d, reason: collision with root package name */
    private final a f17854d;

    public h(InterfaceC2495e interfaceC2495e, i iVar, AbstractC7346d0 abstractC7346d0, a aVar) {
        this.f17851a = interfaceC2495e;
        this.f17852b = iVar;
        this.f17853c = abstractC7346d0;
        this.f17854d = aVar;
    }

    @Override // mh.InterfaceC6835l
    public Object invoke(Object obj) {
        return i.k(this.f17851a, this.f17852b, this.f17853c, this.f17854d, (kotlin.reflect.jvm.internal.impl.types.checker.g) obj);
    }
}
