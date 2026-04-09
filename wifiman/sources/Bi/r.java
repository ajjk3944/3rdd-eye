package bi;

import Bh.InterfaceC2491a;
import Yg.J;
import Zg.AbstractC3689v;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import xi.C8545l;

/* loaded from: classes4.dex */
public abstract class r {
    public static final Collection b(Collection collection, InterfaceC6835l descriptorByHandle) {
        AbstractC6492s.i(collection, "<this>");
        AbstractC6492s.i(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C8545l c8545lA = C8545l.f66170c.a();
        while (!linkedList.isEmpty()) {
            Object objQ0 = AbstractC3689v.q0(linkedList);
            C8545l c8545lA2 = C8545l.f66170c.a();
            Collection collectionQ = o.q(objQ0, linkedList, descriptorByHandle, new q(c8545lA2));
            AbstractC6492s.h(collectionQ, "extractMembersOverridableInBothWays(...)");
            if (collectionQ.size() == 1 && c8545lA2.isEmpty()) {
                Object objQ02 = AbstractC3689v.Q0(collectionQ);
                AbstractC6492s.h(objQ02, "single(...)");
                c8545lA.add(objQ02);
            } else {
                Object objL = o.L(collectionQ, descriptorByHandle);
                InterfaceC2491a interfaceC2491a = (InterfaceC2491a) descriptorByHandle.invoke(objL);
                for (Object obj : collectionQ) {
                    AbstractC6492s.f(obj);
                    if (!o.B(interfaceC2491a, (InterfaceC2491a) descriptorByHandle.invoke(obj))) {
                        c8545lA2.add(obj);
                    }
                }
                if (!c8545lA2.isEmpty()) {
                    c8545lA.addAll(c8545lA2);
                }
                c8545lA.add(objL);
            }
        }
        return c8545lA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(C8545l c8545l, Object obj) {
        AbstractC6492s.f(obj);
        c8545l.add(obj);
        return J.f24997a;
    }
}
