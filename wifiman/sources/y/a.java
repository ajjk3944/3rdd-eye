package Y;

import Zg.AbstractC3678j;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a extends AbstractC3678j {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return j((Map.Entry) obj);
        }
        return false;
    }

    public final boolean j(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return s(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return v((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean s(Map.Entry entry);

    public final boolean v(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return y(entry);
    }

    public abstract boolean y(Map.Entry entry);
}
