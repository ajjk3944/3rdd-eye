package com.bytedance.adsdk.ouw.vt.yu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public enum lh implements fkw {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI("*", 4),
    DIVISION("/", 4),
    MOD("%", 4);

    public final String rn;
    public final int zih;
    private static final Map<String, lh> vm = new HashMap(128);

    /* renamed from: th, reason: collision with root package name */
    private static final Set<lh> f6823th = new HashSet();

    static {
        for (lh lhVar : values()) {
            vm.put(lhVar.rn, lhVar);
            f6823th.add(lhVar);
        }
    }

    lh(String str, int i4) {
        this.rn = str;
        this.zih = i4;
    }

    public static lh ouw(String str) {
        return vm.get(str);
    }

    public static boolean ouw(fkw fkwVar) {
        return fkwVar instanceof lh;
    }
}
