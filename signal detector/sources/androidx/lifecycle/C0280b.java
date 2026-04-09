package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5234a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5235b;

    public C0280b(HashMap map) {
        this.f5235b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0291m enumC0291m = (EnumC0291m) entry.getValue();
            List arrayList = (List) this.f5234a.get(enumC0291m);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f5234a.put(enumC0291m, arrayList);
            }
            arrayList.add((C0281c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0298u interfaceC0298u, EnumC0291m enumC0291m, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0281c c0281c = (C0281c) list.get(size);
                Method method = c0281c.f5237b;
                try {
                    int i = c0281c.f5236a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC0298u);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC0298u, enumC0291m);
                    }
                } catch (IllegalAccessException e6) {
                    throw new RuntimeException(e6);
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException("Failed to call observer method", e7.getCause());
                }
            }
        }
    }
}
