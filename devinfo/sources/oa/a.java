package oa;

import android.util.SparseArray;
import ba.c;
import java.util.HashMap;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f30479a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f30480b;

    static {
        HashMap map = new HashMap();
        f30480b = map;
        map.put(c.f2090a, 0);
        map.put(c.f2091b, 1);
        map.put(c.f2092c, 2);
        for (c cVar : map.keySet()) {
            f30479a.append(((Integer) f30480b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f30480b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i4) {
        c cVar = (c) f30479a.get(i4);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(u.r(i4, "Unknown Priority for value "));
    }
}
