package R1;

import R1.d;
import Zg.AbstractC3689v;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final Map f19540a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f19541b;

    /* renamed from: R1.a$a, reason: collision with other inner class name */
    static final class C0687a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final C0687a f19542a = new C0687a();

        C0687a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            AbstractC6492s.i(entry, "entry");
            return "  " + ((d.a) entry.getKey()).a() + " = " + entry.getValue();
        }
    }

    public /* synthetic */ a(Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    @Override // R1.d
    public Map a() {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f19540a);
        AbstractC6492s.h(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    @Override // R1.d
    public Object b(d.a key) {
        AbstractC6492s.i(key, "key");
        return this.f19540a.get(key);
    }

    public final void e() {
        if (this.f19541b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return AbstractC6492s.d(this.f19540a, ((a) obj).f19540a);
        }
        return false;
    }

    public final void f() {
        this.f19541b.set(true);
    }

    public final void g(d.b... pairs) {
        AbstractC6492s.i(pairs, "pairs");
        e();
        if (pairs.length <= 0) {
            return;
        }
        d.b bVar = pairs[0];
        throw null;
    }

    public final Object h(d.a key) {
        AbstractC6492s.i(key, "key");
        e();
        return this.f19540a.remove(key);
    }

    public int hashCode() {
        return this.f19540a.hashCode();
    }

    public final void i(d.a key, Object obj) {
        AbstractC6492s.i(key, "key");
        j(key, obj);
    }

    public final void j(d.a key, Object obj) {
        AbstractC6492s.i(key, "key");
        e();
        if (obj == null) {
            h(key);
            return;
        }
        if (!(obj instanceof Set)) {
            this.f19540a.put(key, obj);
            return;
        }
        Map map = this.f19540a;
        Set setUnmodifiableSet = Collections.unmodifiableSet(AbstractC3689v.n1((Iterable) obj));
        AbstractC6492s.h(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(key, setUnmodifiableSet);
    }

    public String toString() {
        return AbstractC3689v.z0(this.f19540a.entrySet(), ",\n", "{\n", "\n}", 0, null, C0687a.f19542a, 24, null);
    }

    public a(Map preferencesMap, boolean z10) {
        AbstractC6492s.i(preferencesMap, "preferencesMap");
        this.f19540a = preferencesMap;
        this.f19541b = new AtomicBoolean(z10);
    }
}
