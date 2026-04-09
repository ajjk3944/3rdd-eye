package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jf {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public jf(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            t50 t50Var = (t50) entry.getValue();
            List arrayList = (List) this.a.get(t50Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(t50Var, arrayList);
            }
            arrayList.add((kf) entry.getKey());
        }
    }

    public static void a(List list, b60 b60Var, t50 t50Var, a60 a60Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                kf kfVar = (kf) list.get(size);
                Method method = kfVar.b;
                try {
                    int i = kfVar.a;
                    if (i == 0) {
                        method.invoke(a60Var, null);
                    } else if (i == 1) {
                        method.invoke(a60Var, b60Var);
                    } else if (i == 2) {
                        method.invoke(a60Var, b60Var, t50Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
