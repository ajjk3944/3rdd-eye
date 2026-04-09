package i4;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static SparseArray f21598a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static HashMap f21599b;

    static {
        HashMap map = new HashMap();
        f21599b = map;
        map.put(Priority.DEFAULT, 0);
        f21599b.put(Priority.VERY_LOW, 1);
        f21599b.put(Priority.HIGHEST, 2);
        for (Priority priority : f21599b.keySet()) {
            f21598a.append(((Integer) f21599b.get(priority)).intValue(), priority);
        }
    }

    public static int a(Priority priority) {
        Integer num = (Integer) f21599b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    public static Priority b(int i10) {
        Priority priority = (Priority) f21598a.get(i10);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
