package n3;

import a3.EnumC3757e;
import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6868a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray f54292a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap f54293b;

    static {
        HashMap map = new HashMap();
        f54293b = map;
        map.put(EnumC3757e.DEFAULT, 0);
        f54293b.put(EnumC3757e.VERY_LOW, 1);
        f54293b.put(EnumC3757e.HIGHEST, 2);
        for (EnumC3757e enumC3757e : f54293b.keySet()) {
            f54292a.append(((Integer) f54293b.get(enumC3757e)).intValue(), enumC3757e);
        }
    }

    public static int a(EnumC3757e enumC3757e) {
        Integer num = (Integer) f54293b.get(enumC3757e);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC3757e);
    }

    public static EnumC3757e b(int i10) {
        EnumC3757e enumC3757e = (EnumC3757e) f54292a.get(i10);
        if (enumC3757e != null) {
            return enumC3757e;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
