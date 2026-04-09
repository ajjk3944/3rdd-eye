package li;

import mh.InterfaceC6824a;

/* renamed from: li.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6602E implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final C6608K f52625a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.n f52626b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC6626d f52627c;

    public C6602E(C6608K c6608k, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, EnumC6626d enumC6626d) {
        this.f52625a = c6608k;
        this.f52626b = nVar;
        this.f52627c = enumC6626d;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return C6608K.k(this.f52625a, this.f52626b, this.f52627c);
    }
}
