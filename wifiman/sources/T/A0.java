package T;

import java.util.Map;
import nh.InterfaceC6944a;
import nh.InterfaceC6948e;

/* loaded from: classes.dex */
public interface A0 extends Map, InterfaceC6944a, InterfaceC3563x, InterfaceC3559v {

    public interface a extends Map, InterfaceC6948e {
        A0 a();
    }

    A0 F(AbstractC3557u abstractC3557u, F1 f12);

    a c();

    @Override // T.InterfaceC3559v
    default Object m(AbstractC3557u abstractC3557u) {
        return AbstractC3565y.b(this, abstractC3557u);
    }
}
