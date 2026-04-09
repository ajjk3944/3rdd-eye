package I3;

import android.util.SparseArray;
import g0.C4356c;
import java.util.HashMap;
import v3.e;

/* compiled from: PriorityMapping.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray<e> f2431a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap<e, Integer> f2432b;

    static {
        HashMap<e, Integer> map = new HashMap<>();
        f2432b = map;
        map.put(e.DEFAULT, 0);
        map.put(e.VERY_LOW, 1);
        map.put(e.HIGHEST, 2);
        for (e eVar : map.keySet()) {
            f2431a.append(f2432b.get(eVar).intValue(), eVar);
        }
    }

    public static int a(e eVar) {
        Integer num = f2432b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    public static e b(int i) {
        e eVar = f2431a.get(i);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException(C4356c.h(i, "Unknown Priority for value "));
    }
}
