package T;

import mh.InterfaceC6824a;

/* loaded from: classes.dex */
abstract /* synthetic */ class p1 {

    /* renamed from: a, reason: collision with root package name */
    private static final u1 f21185a = new u1();

    /* renamed from: b, reason: collision with root package name */
    private static final u1 f21186b = new u1();

    public static final V.b b() {
        u1 u1Var = f21186b;
        V.b bVar = (V.b) u1Var.a();
        if (bVar != null) {
            return bVar;
        }
        V.b bVar2 = new V.b(new I[0], 0);
        u1Var.b(bVar2);
        return bVar2;
    }

    public static final z1 c(n1 n1Var, InterfaceC6824a interfaceC6824a) {
        return new G(interfaceC6824a, n1Var);
    }

    public static final z1 d(InterfaceC6824a interfaceC6824a) {
        return new G(interfaceC6824a, null);
    }
}
