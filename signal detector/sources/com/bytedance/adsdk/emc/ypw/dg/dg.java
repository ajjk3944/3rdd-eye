package com.bytedance.adsdk.emc.ypw.dg;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum dg implements bw {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    COMMA(",");

    private static final Map<String, dg> ycc;
    private final String uym;

    static {
        HashMap map = new HashMap(128);
        ycc = map;
        for (dg dgVar : map.values()) {
            ycc.put(dgVar.emc(), dgVar);
        }
    }

    dg(String str) {
        this.uym = str;
    }

    public static boolean emc(bw bwVar) {
        return bwVar instanceof dg;
    }

    public String emc() {
        return this.uym;
    }
}
