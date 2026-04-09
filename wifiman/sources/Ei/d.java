package Ei;

import Ci.g;
import Zg.AbstractC3674f;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class d extends AbstractC3674f implements Ci.g {

    /* renamed from: d, reason: collision with root package name */
    public static final a f4765d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final d f4766e = new d(t.f4797e.a(), 0);

    /* renamed from: b, reason: collision with root package name */
    private final t f4767b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4768c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            d dVar = d.f4766e;
            AbstractC6492s.g(dVar, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }

        private a() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4769a = new b();

        b() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Fi.a b10) {
            AbstractC6492s.i(b10, "b");
            return Boolean.valueOf(AbstractC6492s.d(obj, b10.e()));
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4770a = new c();

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

    /* renamed from: Ei.d$d, reason: collision with other inner class name */
    static final class C0203d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C0203d f4771a = new C0203d();

        C0203d() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC6492s.d(obj, obj2));
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final e f4772a = new e();

        e() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC6492s.d(obj, obj2));
        }
    }

    public d(t node, int i10) {
        AbstractC6492s.i(node, "node");
        this.f4767b = node;
        this.f4768c = i10;
    }

    private final Ci.e r() {
        return new n(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f4767b.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // Zg.AbstractC3674f, java.util.Map
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
        return map instanceof Fi.c ? this.f4767b.k(((Fi.c) obj).s().f4767b, b.f4769a) : map instanceof Fi.d ? this.f4767b.k(((Fi.d) obj).h().j(), c.f4770a) : map instanceof d ? this.f4767b.k(((d) obj).f4767b, C0203d.f4771a) : map instanceof f ? this.f4767b.k(((f) obj).j(), e.f4772a) : super.equals(obj);
    }

    @Override // Zg.AbstractC3674f
    public final Set f() {
        return r();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f4767b.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // Zg.AbstractC3674f
    public int h() {
        return this.f4768c;
    }

    @Override // Zg.AbstractC3674f, java.util.Map
    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.Map, Ci.g
    public Ci.g putAll(Map m10) {
        AbstractC6492s.i(m10, "m");
        if (m10.isEmpty()) {
            return this;
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type kotlinx.collections.immutable.PersistentMap<K of kotlinx.collections.immutable.ExtensionsKt.mutate, V of kotlinx.collections.immutable.ExtensionsKt.mutate>");
        g.a aVarC = c();
        aVarC.putAll(m10);
        return aVarC.a();
    }

    @Override // Ci.g
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public f c() {
        return new f(this);
    }

    @Override // Zg.AbstractC3674f
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Ci.e g() {
        return new p(this);
    }

    public final t t() {
        return this.f4767b;
    }

    @Override // Zg.AbstractC3674f
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Ci.b i() {
        return new r(this);
    }
}
