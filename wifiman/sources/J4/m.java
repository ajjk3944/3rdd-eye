package j4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f50129a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f50129a = new HashMap();
        new k4.i("PlayCoreVersion");
    }

    public static synchronized Map a() {
        Map map;
        map = f50129a;
        map.put("java", 20002);
        return map;
    }
}
