package s;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f24188a;

    public c(int i10, float f10) {
        this.f24188a = new LinkedHashMap(i10, f10, true);
    }

    public final Object a(Object key) {
        p.e(key, "key");
        return this.f24188a.get(key);
    }

    public final Set b() {
        Set setEntrySet = this.f24188a.entrySet();
        p.d(setEntrySet, "map.entries");
        return setEntrySet;
    }

    public final boolean c() {
        return this.f24188a.isEmpty();
    }

    public final Object d(Object key, Object value) {
        p.e(key, "key");
        p.e(value, "value");
        return this.f24188a.put(key, value);
    }

    public final Object e(Object key) {
        p.e(key, "key");
        return this.f24188a.remove(key);
    }
}
