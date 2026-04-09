package kotlinx.serialization.json.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public abstract class p {
    public static final Map a(int i10) {
        return new ConcurrentHashMap(i10);
    }
}
