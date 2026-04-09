package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class aa4 implements ca4 {
    public final Map a;

    public aa4(LinkedHashMap linkedHashMap) {
        this.a = Collections.unmodifiableMap(linkedHashMap);
    }
}
