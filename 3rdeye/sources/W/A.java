package W;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: QualitySelector.java */
/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final List<C1635x> f13060a;

    /* renamed from: b, reason: collision with root package name */
    public final C1617e f13061b;

    public A(List list, C1617e c1617e) {
        A2.l.k("No preferred quality and fallback strategy.", (list.isEmpty() && c1617e == C1628p.f13297a) ? false : true);
        this.f13060a = Collections.unmodifiableList(new ArrayList(list));
        this.f13061b = c1617e;
    }

    public static A a(List list, C1617e c1617e) {
        A2.l.p(list, "qualities cannot be null");
        A2.l.k("qualities cannot be empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1635x c1635x = (C1635x) it.next();
            A2.l.k("qualities contain invalid quality: " + c1635x, C1635x.f13314h.contains(c1635x));
        }
        return new A(list, c1617e);
    }

    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.f13060a + ", fallbackStrategy=" + this.f13061b + "}";
    }
}
