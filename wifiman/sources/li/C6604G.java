package li;

import mh.InterfaceC6824a;

/* renamed from: li.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6604G implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final C6608K f52631a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.n f52632b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC6626d f52633c;

    public C6604G(C6608K c6608k, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, EnumC6626d enumC6626d) {
        this.f52631a = c6608k;
        this.f52632b = nVar;
        this.f52633c = enumC6626d;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return C6608K.p(this.f52631a, this.f52632b, this.f52633c);
    }
}
