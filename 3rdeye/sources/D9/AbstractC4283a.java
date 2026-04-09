package d9;

import c9.AbstractC2085f;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.l;

/* compiled from: MapBuilder.kt */
/* renamed from: d9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4283a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC2085f<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry<? extends K, ? extends V> element = (Map.Entry) obj;
        l.f(element, "element");
        return ((C4286d) this).f37572b.g(element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        l.f(element, "element");
        C4285c<K, V> c4285c = ((C4286d) this).f37572b;
        c4285c.getClass();
        c4285c.d();
        int iJ = c4285c.j(element.getKey());
        if (iJ >= 0) {
            V[] vArr = c4285c.f37554c;
            l.c(vArr);
            if (l.b(vArr[iJ], element.getValue())) {
                c4285c.n(iJ);
                return true;
            }
        }
        return false;
    }
}
