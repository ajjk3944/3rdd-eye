package kotlin.jvm.internal;

import java.util.List;

/* loaded from: classes4.dex */
public class P {
    public th.g a(AbstractC6489o abstractC6489o) {
        return abstractC6489o;
    }

    public th.d b(Class cls) {
        return new C6483i(cls);
    }

    public th.f c(Class cls, String str) {
        return new B(cls, str);
    }

    public th.i d(AbstractC6496w abstractC6496w) {
        return abstractC6496w;
    }

    public th.j e(AbstractC6498y abstractC6498y) {
        return abstractC6498y;
    }

    public th.m f(C c10) {
        return c10;
    }

    public th.n g(E e10) {
        return e10;
    }

    public th.o h(G g10) {
        return g10;
    }

    public String i(InterfaceC6488n interfaceC6488n) {
        String string = interfaceC6488n.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String j(AbstractC6494u abstractC6494u) {
        return i(abstractC6494u);
    }

    public th.p k(th.e eVar, List list, boolean z10) {
        return new Y(eVar, list, z10);
    }
}
