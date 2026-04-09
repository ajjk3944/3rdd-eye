package w9;

import android.util.SparseArray;
import h0.b;
import j9.d;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f24385a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f24386b;

    static {
        HashMap map = new HashMap();
        f24386b = map;
        map.put(d.DEFAULT, 0);
        map.put(d.VERY_LOW, 1);
        map.put(d.HIGHEST, 2);
        for (d dVar : map.keySet()) {
            f24385a.append(((Integer) f24386b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f24386b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f24385a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(b.h(i10, "Unknown Priority for value "));
    }
}
