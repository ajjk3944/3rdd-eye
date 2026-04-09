package p;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7175c {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f57284a;

    public C7175c(int i10, float f10) {
        this.f57284a = new LinkedHashMap(i10, f10, true);
    }

    public final Object a(Object key) {
        AbstractC6492s.i(key, "key");
        return this.f57284a.get(key);
    }

    public final Set b() {
        Set setEntrySet = this.f57284a.entrySet();
        AbstractC6492s.h(setEntrySet, "map.entries");
        return setEntrySet;
    }

    public final boolean c() {
        return this.f57284a.isEmpty();
    }

    public final Object d(Object key, Object value) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(value, "value");
        return this.f57284a.put(key, value);
    }

    public final Object e(Object key) {
        AbstractC6492s.i(key, "key");
        return this.f57284a.remove(key);
    }
}
