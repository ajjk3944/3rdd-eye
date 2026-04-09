package h9;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum a3 {
    svg,
    a,
    circle,
    clipPath,
    defs,
    desc,
    ellipse,
    g,
    image,
    line,
    linearGradient,
    marker,
    mask,
    path,
    pattern,
    polygon,
    polyline,
    radialGradient,
    rect,
    solidColor,
    stop,
    style,
    SWITCH,
    symbol,
    text,
    textPath,
    title,
    tref,
    tspan,
    use,
    view,
    UNSUPPORTED;

    private static final Map<String, a3> cache = new HashMap();

    static {
        for (a3 a3Var : values()) {
            if (a3Var == SWITCH) {
                cache.put("switch", a3Var);
            } else if (a3Var != UNSUPPORTED) {
                cache.put(a3Var.name(), a3Var);
            }
        }
    }

    public static a3 fromString(String str) {
        a3 a3Var = cache.get(str);
        return a3Var != null ? a3Var : UNSUPPORTED;
    }
}
