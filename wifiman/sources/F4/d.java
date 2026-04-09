package F4;

import f5.InterfaceC5535a;
import f5.InterfaceC5536b;
import java.util.Set;

/* loaded from: classes3.dex */
public interface d {
    default Object a(Class cls) {
        return f(A.b(cls));
    }

    default Set b(A a10) {
        return (Set) h(a10).get();
    }

    InterfaceC5535a c(A a10);

    InterfaceC5536b d(A a10);

    default InterfaceC5536b e(Class cls) {
        return d(A.b(cls));
    }

    default Object f(A a10) {
        InterfaceC5536b interfaceC5536bD = d(a10);
        if (interfaceC5536bD == null) {
            return null;
        }
        return interfaceC5536bD.get();
    }

    default Set g(Class cls) {
        return b(A.b(cls));
    }

    InterfaceC5536b h(A a10);

    default InterfaceC5535a i(Class cls) {
        return c(A.b(cls));
    }
}
