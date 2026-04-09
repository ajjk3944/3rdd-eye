package h9;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class x2 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f10514a;

    static {
        HashMap map = new HashMap(13);
        f10514a = map;
        map.put("normal", 400);
        map.put("bold", 700);
        c7.a.w(1, map, "bolder", -1, "lighter");
        c7.a.w(100, map, "100", 200, "200");
        map.put("300", 300);
        map.put("400", 400);
        c7.a.w(500, map, "500", 600, "600");
        c7.a.B(map, "700", 700, 800, "800");
        map.put("900", 900);
    }
}
