package com.bytedance.adsdk.emc.ypw.dg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public enum xq implements bw {
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

    private final String sba;
    private final int yzg;
    private static final Map<String, xq> vk = new HashMap(128);
    private static final Set<xq> aa = new HashSet();

    static {
        for (xq xqVar : values()) {
            vk.put(xqVar.emc(), xqVar);
            aa.add(xqVar);
        }
    }

    xq(String str, int i) {
        this.sba = str;
        this.yzg = i;
    }

    public static xq emc(String str) {
        return vk.get(str);
    }

    public int ypw() {
        return this.yzg;
    }

    public static boolean emc(bw bwVar) {
        return bwVar instanceof xq;
    }

    public String emc() {
        return this.sba;
    }
}
