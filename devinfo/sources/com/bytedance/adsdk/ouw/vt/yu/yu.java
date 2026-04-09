package com.bytedance.adsdk.ouw.vt.yu;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public enum yu implements fkw {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    COMMA(",");

    private static final Map<String, yu> ra;

    /* renamed from: le, reason: collision with root package name */
    public final String f6826le;

    static {
        HashMap map = new HashMap(128);
        ra = map;
        for (yu yuVar : map.values()) {
            ra.put(yuVar.f6826le, yuVar);
        }
    }

    yu(String str) {
        this.f6826le = str;
    }

    public static boolean ouw(fkw fkwVar) {
        return fkwVar instanceof yu;
    }
}
