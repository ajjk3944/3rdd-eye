package h9;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class w2 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f10507a;

    static {
        HashMap map = new HashMap(9);
        f10507a = map;
        f2 f2Var = f2.pt;
        map.put("xx-small", new l0(0.694f, f2Var));
        map.put("x-small", new l0(0.833f, f2Var));
        map.put("small", new l0(10.0f, f2Var));
        map.put("medium", new l0(12.0f, f2Var));
        map.put("large", new l0(14.4f, f2Var));
        map.put("x-large", new l0(17.3f, f2Var));
        map.put("xx-large", new l0(20.7f, f2Var));
        f2 f2Var2 = f2.percent;
        map.put("smaller", new l0(83.33f, f2Var2));
        map.put("larger", new l0(120.0f, f2Var2));
    }
}
