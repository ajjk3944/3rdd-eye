package Ei;

import Zg.AbstractC3678j;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class a extends AbstractC3678j {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return j((Map.Entry) obj);
        }
        return false;
    }

    public final boolean j(Map.Entry element) {
        AbstractC6492s.i(element, "element");
        if ((element != null ? element : null) == null) {
            return false;
        }
        return s(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return v((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean s(Map.Entry entry);

    public final boolean v(Map.Entry element) {
        AbstractC6492s.i(element, "element");
        if ((element != null ? element : null) == null) {
            return false;
        }
        return y(element);
    }

    public abstract boolean y(Map.Entry entry);
}
