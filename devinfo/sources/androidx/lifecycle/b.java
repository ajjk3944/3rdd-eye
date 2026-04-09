package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1097a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1098b;

    public b(HashMap map) {
        this.f1098b = map;
        for (Map.Entry entry : map.entrySet()) {
            r rVar = (r) entry.getValue();
            List arrayList = (List) this.f1097a.get(rVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f1097a.put(rVar, arrayList);
            }
            arrayList.add((c) entry.getKey());
        }
    }

    public static void a(List list, a0 a0Var, r rVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                Method method = cVar.f1107b;
                try {
                    int i4 = cVar.f1106a;
                    if (i4 == 0) {
                        method.invoke(obj, null);
                    } else if (i4 == 1) {
                        method.invoke(obj, a0Var);
                    } else if (i4 == 2) {
                        method.invoke(obj, a0Var, rVar);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to call observer method", e10.getCause());
                }
            }
        }
    }
}
