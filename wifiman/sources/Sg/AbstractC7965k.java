package sg;

import gg.InterfaceC5914d;
import ig.AbstractC6152a;
import java.util.Objects;
import kg.n;
import kg.q;
import lg.EnumC6593c;

/* renamed from: sg.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC7965k {
    static boolean a(Object obj, n nVar, InterfaceC5914d interfaceC5914d) {
        gg.f fVar;
        if (!(obj instanceof q)) {
            return false;
        }
        try {
            Object obj2 = ((q) obj).get();
            if (obj2 != null) {
                Object objApply = nVar.apply(obj2);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                fVar = (gg.f) objApply;
            } else {
                fVar = null;
            }
            if (fVar == null) {
                EnumC6593c.complete(interfaceC5914d);
            } else {
                fVar.e(interfaceC5914d);
            }
            return true;
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC6593c.error(th2, interfaceC5914d);
            return true;
        }
    }
}
