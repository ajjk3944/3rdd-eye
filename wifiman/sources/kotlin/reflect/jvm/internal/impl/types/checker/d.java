package kotlin.reflect.jvm.internal.impl.types.checker;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7337E;
import pi.AbstractC7346d0;
import pi.I;
import pi.L;
import pi.M0;
import pi.V;
import pi.W;

/* loaded from: classes4.dex */
public abstract class d {
    public static final M0 a(Collection types) {
        AbstractC7346d0 abstractC7346d0V0;
        AbstractC6492s.i(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (M0) AbstractC3689v.Q0(types);
        }
        Collection<M0> collection = types;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(collection, 10));
        boolean z10 = false;
        boolean z11 = false;
        for (M0 m02 : collection) {
            z10 = z10 || W.a(m02);
            if (m02 instanceof AbstractC7346d0) {
                abstractC7346d0V0 = (AbstractC7346d0) m02;
            } else {
                if (!(m02 instanceof I)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (AbstractC7337E.a(m02)) {
                    return m02;
                }
                abstractC7346d0V0 = ((I) m02).V0();
                z11 = true;
            }
            arrayList.add(abstractC7346d0V0);
        }
        if (z10) {
            return kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.INTERSECTION_OF_ERROR_TYPES, types.toString());
        }
        if (!z11) {
            return z.f52176a.d(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(L.d((M0) it.next()));
        }
        z zVar = z.f52176a;
        return V.e(zVar.d(arrayList), zVar.d(arrayList2));
    }
}
