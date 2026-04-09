package Fi;

import Ci.g;
import Zg.AbstractC3674f;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class c extends AbstractC3674f implements Ci.g {

    /* renamed from: e, reason: collision with root package name */
    public static final a f6690e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final c f6691f;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6692b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f6693c;

    /* renamed from: d, reason: collision with root package name */
    private final Ei.d f6694d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            c cVar = c.f6691f;
            AbstractC6492s.g(cVar, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return cVar;
        }

        private a() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6695a = new b();

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

    /* renamed from: Fi.c$c, reason: collision with other inner class name */
    static final class C0270c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C0270c f6696a = new C0270c();

        C0270c() {
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

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final d f6697a = new d();

        d() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Fi.a a10, Object obj) {
            AbstractC6492s.i(a10, "a");
            return Boolean.valueOf(AbstractC6492s.d(a10.e(), obj));
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final e f6698a = new e();

        e() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Fi.a a10, Object obj) {
            AbstractC6492s.i(a10, "a");
            return Boolean.valueOf(AbstractC6492s.d(a10.e(), obj));
        }
    }

    static {
        Hi.c cVar = Hi.c.f7979a;
        f6691f = new c(cVar, cVar, Ei.d.f4765d.a());
    }

    public c(Object obj, Object obj2, Ei.d hashMap) {
        AbstractC6492s.i(hashMap, "hashMap");
        this.f6692b = obj;
        this.f6693c = obj2;
        this.f6694d = hashMap;
    }

    private final Ci.e q() {
        return new l(this);
    }

    @Override // Ci.g
    public g.a c() {
        return new Fi.d(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f6694d.containsKey(obj);
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
        return map instanceof c ? this.f6694d.t().k(((c) obj).f6694d.t(), b.f6695a) : map instanceof Fi.d ? this.f6694d.t().k(((Fi.d) obj).h().j(), C0270c.f6696a) : map instanceof Ei.d ? this.f6694d.t().k(((Ei.d) obj).t(), d.f6697a) : map instanceof Ei.f ? this.f6694d.t().k(((Ei.f) obj).j(), e.f6698a) : super.equals(obj);
    }

    @Override // Zg.AbstractC3674f
    public final Set f() {
        return q();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Fi.a aVar = (Fi.a) this.f6694d.get(obj);
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    @Override // Zg.AbstractC3674f
    public int h() {
        return this.f6694d.size();
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

    public final Object r() {
        return this.f6692b;
    }

    public final Ei.d s() {
        return this.f6694d;
    }

    @Override // Zg.AbstractC3674f
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Ci.e g() {
        return new n(this);
    }

    public final Object u() {
        return this.f6693c;
    }

    @Override // Zg.AbstractC3674f
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Ci.b i() {
        return new q(this);
    }
}
