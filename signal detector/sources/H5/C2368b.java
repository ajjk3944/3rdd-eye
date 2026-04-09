package h5;

import p5.p;

/* renamed from: h5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2368b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20482a;

    public /* synthetic */ C2368b(int i) {
        this.f20482a = i;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        C2369c c2369c;
        switch (this.f20482a) {
            case 0:
                String str = (String) obj;
                InterfaceC2373g interfaceC2373g = (InterfaceC2373g) obj2;
                q5.i.e(str, "acc");
                q5.i.e(interfaceC2373g, "element");
                if (str.length() == 0) {
                    return interfaceC2373g.toString();
                }
                return str + ", " + interfaceC2373g;
            default:
                InterfaceC2375i interfaceC2375i = (InterfaceC2375i) obj;
                InterfaceC2373g interfaceC2373g2 = (InterfaceC2373g) obj2;
                q5.i.e(interfaceC2375i, "acc");
                q5.i.e(interfaceC2373g2, "element");
                InterfaceC2375i interfaceC2375iN = interfaceC2375i.n(interfaceC2373g2.getKey());
                C2376j c2376j = C2376j.f20486a;
                if (interfaceC2375iN == c2376j) {
                    return interfaceC2373g2;
                }
                C2371e c2371e = C2371e.f20485a;
                InterfaceC2372f interfaceC2372f = (InterfaceC2372f) interfaceC2375iN.h(c2371e);
                if (interfaceC2372f == null) {
                    c2369c = new C2369c(interfaceC2375iN, interfaceC2373g2);
                } else {
                    InterfaceC2375i interfaceC2375iN2 = interfaceC2375iN.n(c2371e);
                    if (interfaceC2375iN2 == c2376j) {
                        return new C2369c(interfaceC2373g2, interfaceC2372f);
                    }
                    c2369c = new C2369c(new C2369c(interfaceC2375iN2, interfaceC2373g2), interfaceC2372f);
                }
                return c2369c;
        }
    }
}
