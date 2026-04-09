package T;

import Zg.AbstractC3689v;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class O0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f20969a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f20970b = new Object();

    public static final Object a(Map map, Object obj) {
        List list = (List) map.get(obj);
        if (list == null) {
            return null;
        }
        Object objL = AbstractC3689v.L(list);
        if (!list.isEmpty()) {
            return objL;
        }
        map.remove(obj);
        return objL;
    }
}
