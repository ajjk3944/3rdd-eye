package bi;

import Bh.AbstractC2509t;
import Bh.InterfaceC2492b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class w {
    public static final InterfaceC2492b a(Collection descriptors) {
        Integer numD;
        AbstractC6492s.i(descriptors, "descriptors");
        descriptors.isEmpty();
        Iterator it = descriptors.iterator();
        InterfaceC2492b interfaceC2492b = null;
        while (it.hasNext()) {
            InterfaceC2492b interfaceC2492b2 = (InterfaceC2492b) it.next();
            if (interfaceC2492b == null || ((numD = AbstractC2509t.d(interfaceC2492b.getVisibility(), interfaceC2492b2.getVisibility())) != null && numD.intValue() < 0)) {
                interfaceC2492b = interfaceC2492b2;
            }
        }
        AbstractC6492s.f(interfaceC2492b);
        return interfaceC2492b;
    }
}
