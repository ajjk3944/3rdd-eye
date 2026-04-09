package Ei;

import Ci.g;
import Zg.AbstractC3677i;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class f extends AbstractC3677i implements g.a {

    /* renamed from: a, reason: collision with root package name */
    private Ei.d f4776a;

    /* renamed from: b, reason: collision with root package name */
    private Hi.f f4777b;

    /* renamed from: c, reason: collision with root package name */
    private t f4778c;

    /* renamed from: d, reason: collision with root package name */
    private Object f4779d;

    /* renamed from: e, reason: collision with root package name */
    private int f4780e;

    /* renamed from: f, reason: collision with root package name */
    private int f4781f;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4782a = new a();

        a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC6492s.d(obj, obj2));
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4783a = new b();

        b() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC6492s.d(obj, obj2));
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4784a = new c();

        c() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Fi.a b10) {
            AbstractC6492s.i(b10, "b");
            return Boolean.valueOf(AbstractC6492s.d(obj, b10.e()));
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final d f4785a = new d();

        d() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Fi.a b10) {
            AbstractC6492s.i(b10, "b");
            return Boolean.valueOf(AbstractC6492s.d(obj, b10.e()));
        }
    }

    public f(Ei.d map) {
        AbstractC6492s.i(map, "map");
        this.f4776a = map;
        this.f4777b = new Hi.f();
        this.f4778c = map.t();
        this.f4781f = map.size();
    }

    @Override // Zg.AbstractC3677i
    public Set b() {
        return new h(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        t tVarA = t.f4797e.a();
        AbstractC6492s.g(tVarA, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        p(tVarA);
        r(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f4778c.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // Zg.AbstractC3677i
    public Set d() {
        return new j(this);
    }

    @Override // Zg.AbstractC3677i
    public int e() {
        return this.f4781f;
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
        return map instanceof Ei.d ? this.f4778c.k(((Ei.d) obj).t(), a.f4782a) : map instanceof f ? this.f4778c.k(((f) obj).f4778c, b.f4783a) : map instanceof Fi.c ? this.f4778c.k(((Fi.c) obj).s().t(), c.f4784a) : map instanceof Fi.d ? this.f4778c.k(((Fi.d) obj).h().f4778c, d.f4785a) : Hi.e.f7981a.b(this, map);
    }

    @Override // Zg.AbstractC3677i
    public Collection f() {
        return new l(this);
    }

    @Override // Ci.g.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Ei.d a() {
        Ei.d dVar = this.f4776a;
        if (dVar != null) {
            return dVar;
        }
        Ei.d dVar2 = new Ei.d(this.f4778c, size());
        this.f4776a = dVar2;
        this.f4777b = new Hi.f();
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f4778c.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final Ei.d h() {
        return this.f4776a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return Hi.e.f7981a.c(this);
    }

    public final int i() {
        return this.f4780e;
    }

    public final t j() {
        return this.f4778c;
    }

    public final Hi.f k() {
        return this.f4777b;
    }

    public final void n(int i10) {
        this.f4780e = i10;
    }

    public final void p(t value) {
        AbstractC6492s.i(value, "value");
        if (value != this.f4778c) {
            this.f4778c = value;
            this.f4776a = null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f4779d = null;
        p(this.f4778c.y(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this));
        return this.f4779d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map from) {
        AbstractC6492s.i(from, "from");
        if (from.isEmpty()) {
            return;
        }
        Ei.d dVarA = from instanceof Ei.d ? (Ei.d) from : null;
        if (dVarA == null) {
            f fVar = from instanceof f ? (f) from : null;
            dVarA = fVar != null ? fVar.a() : null;
        }
        if (dVarA == null) {
            super.putAll(from);
            return;
        }
        Hi.b bVar = new Hi.b(0, 1, null);
        int size = size();
        t tVar = this.f4778c;
        t tVarT = dVarA.t();
        AbstractC6492s.g(tVarT, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        p(tVar.z(tVarT, 0, bVar, this));
        int size2 = (dVarA.size() + size) - bVar.a();
        if (size != size2) {
            r(size2);
        }
    }

    public final void q(Object obj) {
        this.f4779d = obj;
    }

    public void r(int i10) {
        this.f4781f = i10;
        this.f4780e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f4779d = null;
        t tVarB = this.f4778c.B(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (tVarB == null) {
            tVarB = t.f4797e.a();
            AbstractC6492s.g(tVarB, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        p(tVarB);
        return this.f4779d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        t tVarC = this.f4778c.C(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (tVarC == null) {
            tVarC = t.f4797e.a();
            AbstractC6492s.g(tVarC, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        p(tVarC);
        return size != size();
    }
}
