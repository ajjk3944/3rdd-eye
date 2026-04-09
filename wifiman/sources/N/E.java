package N;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private final Map f13669a = new LinkedHashMap();

    public final void a(Object obj, float f10) {
        this.f13669a.put(obj, Float.valueOf(f10));
    }

    public final Map b() {
        return this.f13669a;
    }
}
