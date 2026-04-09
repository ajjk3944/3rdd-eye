package Fi;

import Ci.g;
import Zg.AbstractC3677i;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class d extends AbstractC3677i implements g.a {

    /* renamed from: a, reason: collision with root package name */
    private Fi.c f6699a;

    /* renamed from: b, reason: collision with root package name */
    private Object f6700b;

    /* renamed from: c, reason: collision with root package name */
    private Object f6701c;

    /* renamed from: d, reason: collision with root package name */
    private final Ei.f f6702d;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6703a = new a();

        a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Fi.a a10, Fi.a b10) {
            AbstractC6492s.i(a10, "a");
            AbstractC6492s.i(b10, "b");
            return Boolean.valueOf(AbstractC6492s.d(a10.e(), b10.e()));
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6704a = new b();

        b() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Fi.a a10, Fi.a b10) {
            AbstractC6492s.i(a10, "a");
            AbstractC6492s.i(b10, "b");
            return Boolean.valueOf(AbstractC6492s.d(a10.e(), b10.e()));
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f6705a = new c();

        c() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Fi.a a10, Object obj) {
            AbstractC6492s.i(a10, "a");
            return Boolean.valueOf(AbstractC6492s.d(a10.e(), obj));
        }
    }

    /* renamed from: Fi.d$d, reason: collision with other inner class name */
    static final class C0271d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C0271d f6706a = new C0271d();

        C0271d() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Fi.a a10, Object obj) {
            AbstractC6492s.i(a10, "a");
            return Boolean.valueOf(AbstractC6492s.d(a10.e(), obj));
        }
    }

    public d(Fi.c map) {
        AbstractC6492s.i(map, "map");
        this.f6699a = map;
        this.f6700b = map.r();
        this.f6701c = map.u();
        this.f6702d = map.s().c();
    }

    @Override // Ci.g.a
    public Ci.g a() {
        Fi.c cVar = this.f6699a;
        if (cVar != null) {
            Hi.a.a(this.f6702d.h() != null);
            Hi.a.a(this.f6700b == cVar.r());
            Hi.a.a(this.f6701c == cVar.u());
            return cVar;
        }
        Hi.a.a(this.f6702d.h() == null);
        Fi.c cVar2 = new Fi.c(this.f6700b, this.f6701c, this.f6702d.a());
        this.f6699a = cVar2;
        return cVar2;
    }

    @Override // Zg.AbstractC3677i
    public Set b() {
        return new e(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (!this.f6702d.isEmpty()) {
            this.f6699a = null;
        }
        this.f6702d.clear();
        Hi.c cVar = Hi.c.f7979a;
        this.f6700b = cVar;
        this.f6701c = cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f6702d.containsKey(obj);
    }

    @Override // Zg.AbstractC3677i
    public Set d() {
        return new g(this);
    }

    @Override // Zg.AbstractC3677i
    public int e() {
        return this.f6702d.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        return map instanceof Fi.c ? this.f6702d.j().k(((Fi.c) obj).s().t(), a.f6703a) : map instanceof d ? this.f6702d.j().k(((d) obj).f6702d.j(), b.f6704a) : map instanceof Ei.d ? this.f6702d.j().k(((Ei.d) obj).t(), c.f6705a) : map instanceof Ei.f ? this.f6702d.j().k(((Ei.f) obj).j(), C0271d.f6706a) : Hi.e.f7981a.b(this, map);
    }

    @Override // Zg.AbstractC3677i
    public Collection f() {
        return new j(this);
    }

    public final Object g() {
        return this.f6700b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Fi.a aVar = (Fi.a) this.f6702d.get(obj);
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    public final Ei.f h() {
        return this.f6702d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return Hi.e.f7981a.c(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        Fi.a aVar = (Fi.a) this.f6702d.get(obj);
        if (aVar != null) {
            if (aVar.e() == obj2) {
                return obj2;
            }
            this.f6699a = null;
            this.f6702d.put(obj, aVar.h(obj2));
            return aVar.e();
        }
        this.f6699a = null;
        if (isEmpty()) {
            this.f6700b = obj;
            this.f6701c = obj;
            this.f6702d.put(obj, new Fi.a(obj2));
        } else {
            Object obj3 = this.f6701c;
            Object obj4 = this.f6702d.get(obj3);
            AbstractC6492s.f(obj4);
            Hi.a.a(!r2.a());
            this.f6702d.put(obj3, ((Fi.a) obj4).f(obj));
            this.f6702d.put(obj, new Fi.a(obj2, obj3));
            this.f6701c = obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Fi.a aVar = (Fi.a) this.f6702d.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f6699a = null;
        if (aVar.b()) {
            V v10 = this.f6702d.get(aVar.d());
            AbstractC6492s.f(v10);
            this.f6702d.put(aVar.d(), ((Fi.a) v10).f(aVar.c()));
        } else {
            this.f6700b = aVar.c();
        }
        if (aVar.a()) {
            V v11 = this.f6702d.get(aVar.c());
            AbstractC6492s.f(v11);
            this.f6702d.put(aVar.c(), ((Fi.a) v11).g(aVar.d()));
        } else {
            this.f6701c = aVar.d();
        }
        return aVar.e();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        Fi.a aVar = (Fi.a) this.f6702d.get(obj);
        if (aVar == null || !AbstractC6492s.d(aVar.e(), obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
