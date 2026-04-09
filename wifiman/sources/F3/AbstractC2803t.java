package F3;

import java.util.Iterator;
import java.util.Set;

/* renamed from: F3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2803t {
    static int a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
