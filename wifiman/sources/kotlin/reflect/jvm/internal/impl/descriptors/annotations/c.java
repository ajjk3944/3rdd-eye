package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import Bh.InterfaceC2495e;
import Bh.g0;
import fi.AbstractC5833e;
import java.util.Map;
import pi.S;

/* loaded from: classes4.dex */
public interface c {

    public static final class a {
        public static Zh.c a(c cVar) {
            InterfaceC2495e interfaceC2495eL = AbstractC5833e.l(cVar);
            if (interfaceC2495eL == null) {
                return null;
            }
            if (kotlin.reflect.jvm.internal.impl.types.error.l.m(interfaceC2495eL)) {
                interfaceC2495eL = null;
            }
            if (interfaceC2495eL != null) {
                return AbstractC5833e.k(interfaceC2495eL);
            }
            return null;
        }
    }

    Map a();

    Zh.c e();

    S getType();

    g0 j();
}
