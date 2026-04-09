package wi;

import ii.InterfaceC6164k;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC6492s;
import xi.C8544k;

/* renamed from: wi.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8399a {
    public static final Collection a(Collection collection, Collection collection2) {
        AbstractC6492s.i(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final C8544k b(Iterable scopes) {
        AbstractC6492s.i(scopes, "scopes");
        C8544k c8544k = new C8544k();
        for (Object obj : scopes) {
            InterfaceC6164k interfaceC6164k = (InterfaceC6164k) obj;
            if (interfaceC6164k != null && interfaceC6164k != InterfaceC6164k.b.f49223b) {
                c8544k.add(obj);
            }
        }
        return c8544k;
    }
}
