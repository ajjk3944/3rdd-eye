package a1;

import a1.d;
import c9.C2097r;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import p9.l;

/* compiled from: Preferences.kt */
/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1643a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f14083a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f14084b;

    /* compiled from: Preferences.kt */
    /* renamed from: a1.a$a, reason: collision with other inner class name */
    public static final class C0209a extends m implements l<Map.Entry<d.a<?>, Object>, CharSequence> {

        /* renamed from: g, reason: collision with root package name */
        public static final C0209a f14085g = new C0209a(1);

        @Override // p9.l
        public final CharSequence invoke(Map.Entry<d.a<?>, Object> entry) {
            Map.Entry<d.a<?>, Object> entry2 = entry;
            kotlin.jvm.internal.l.f(entry2, "entry");
            return "  " + entry2.getKey().f14090a + " = " + entry2.getValue();
        }
    }

    public C1643a() {
        this(false, 3);
    }

    @Override // a1.d
    public final Map<d.a<?>, Object> a() {
        Map<d.a<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.f14083a);
        kotlin.jvm.internal.l.e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    @Override // a1.d
    public final <T> T b(d.a<T> key) {
        kotlin.jvm.internal.l.f(key, "key");
        return (T) this.f14083a.get(key);
    }

    public final void c(d.a<?> key, Object obj) {
        kotlin.jvm.internal.l.f(key, "key");
        AtomicBoolean atomicBoolean = this.f14084b;
        if (atomicBoolean.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        LinkedHashMap linkedHashMap = this.f14083a;
        if (obj == null) {
            if (atomicBoolean.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            linkedHashMap.remove(key);
        } else {
            if (!(obj instanceof Set)) {
                linkedHashMap.put(key, obj);
                return;
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(C2097r.L0((Iterable) obj));
            kotlin.jvm.internal.l.e(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
            linkedHashMap.put(key, setUnmodifiableSet);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1643a)) {
            return false;
        }
        return kotlin.jvm.internal.l.b(this.f14083a, ((C1643a) obj).f14083a);
    }

    public final int hashCode() {
        return this.f14083a.hashCode();
    }

    public final String toString() {
        return C2097r.u0(this.f14083a.entrySet(), ",\n", "{\n", "\n}", C0209a.f14085g, 24);
    }

    public /* synthetic */ C1643a(boolean z10, int i) {
        this(new LinkedHashMap(), (i & 2) != 0 ? true : z10);
    }

    public C1643a(LinkedHashMap linkedHashMap, boolean z10) {
        this.f14083a = linkedHashMap;
        this.f14084b = new AtomicBoolean(z10);
    }
}
