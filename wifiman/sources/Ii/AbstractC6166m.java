package ii;

import Zg.AbstractC3689v;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ii.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6166m {
    public static final Set a(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setF = ((InterfaceC6164k) it.next()).f();
            if (setF == null) {
                return null;
            }
            AbstractC3689v.C(hashSet, setF);
        }
        return hashSet;
    }
}
