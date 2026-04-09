package h9;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum k {
    target,
    root,
    nth_child,
    nth_last_child,
    nth_of_type,
    nth_last_of_type,
    first_child,
    last_child,
    first_of_type,
    last_of_type,
    only_child,
    only_of_type,
    empty,
    not,
    lang,
    link,
    visited,
    hover,
    active,
    focus,
    enabled,
    disabled,
    checked,
    indeterminate,
    UNSUPPORTED;

    private static final Map<String, k> cache = new HashMap();

    static {
        for (k kVar : values()) {
            if (kVar != UNSUPPORTED) {
                cache.put(kVar.name().replace('_', '-'), kVar);
            }
        }
    }

    public static k fromString(String str) {
        k kVar = cache.get(str);
        return kVar != null ? kVar : UNSUPPORTED;
    }
}
