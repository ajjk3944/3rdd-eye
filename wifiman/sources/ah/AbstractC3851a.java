package ah;

import Zg.AbstractC3678j;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ah.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3851a extends AbstractC3678j {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return j((Map.Entry) obj);
        }
        return false;
    }

    public final boolean j(Map.Entry element) {
        AbstractC6492s.i(element, "element");
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

    public abstract /* bridge */ boolean v(Map.Entry entry);
}
