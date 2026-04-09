package vj;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class j {
    public static final Map a() {
        return new ConcurrentHashMap();
    }

    public static final List b() {
        return new LinkedList();
    }
}
