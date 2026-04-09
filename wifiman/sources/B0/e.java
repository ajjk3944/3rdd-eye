package b0;

import T.A0;
import T.AbstractC3557u;
import T.AbstractC3565y;
import T.F1;
import Y.t;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class e extends Y.d implements A0 {

    /* renamed from: g, reason: collision with root package name */
    public static final b f32665g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    private static final e f32666h;

    public static final class a extends Y.f implements A0.a {

        /* renamed from: g, reason: collision with root package name */
        private e f32667g;

        public a(e eVar) {
            super(eVar);
            this.f32667g = eVar;
        }

        @Override // Y.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof AbstractC3557u) {
                return s((AbstractC3557u) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof F1) {
                return t((F1) obj);
            }
            return false;
        }

        @Override // Y.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof AbstractC3557u) {
                return u((AbstractC3557u) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof AbstractC3557u) ? obj2 : v((AbstractC3557u) obj, (F1) obj2);
        }

        @Override // Y.f
        /* renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public e g() {
            e eVar;
            if (i() == this.f32667g.s()) {
                eVar = this.f32667g;
            } else {
                p(new a0.e());
                eVar = new e(i(), size());
            }
            this.f32667g = eVar;
            return eVar;
        }

        @Override // Y.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof AbstractC3557u) {
                return w((AbstractC3557u) obj);
            }
            return null;
        }

        public /* bridge */ boolean s(AbstractC3557u abstractC3557u) {
            return super.containsKey(abstractC3557u);
        }

        public /* bridge */ boolean t(F1 f12) {
            return super.containsValue(f12);
        }

        public /* bridge */ F1 u(AbstractC3557u abstractC3557u) {
            return (F1) super.get(abstractC3557u);
        }

        public /* bridge */ F1 v(AbstractC3557u abstractC3557u, F1 f12) {
            return (F1) super.getOrDefault(abstractC3557u, f12);
        }

        public /* bridge */ F1 w(AbstractC3557u abstractC3557u) {
            return (F1) super.remove(abstractC3557u);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return e.f32666h;
        }

        private b() {
        }
    }

    static {
        t tVarA = t.f24503e.a();
        AbstractC6492s.g(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f32666h = new e(tVarA, 0);
    }

    public e(t tVar, int i10) {
        super(tVar, i10);
    }

    public /* bridge */ F1 A(AbstractC3557u abstractC3557u) {
        return (F1) super.get(abstractC3557u);
    }

    public /* bridge */ F1 B(AbstractC3557u abstractC3557u, F1 f12) {
        return (F1) super.getOrDefault(abstractC3557u, f12);
    }

    @Override // T.A0
    public A0 F(AbstractC3557u abstractC3557u, F1 f12) {
        t.b bVarP = s().P(abstractC3557u.hashCode(), abstractC3557u, f12, 0);
        return bVarP == null ? this : new e(bVarP.a(), size() + bVarP.b());
    }

    @Override // T.InterfaceC3563x
    public Object b(AbstractC3557u abstractC3557u) {
        return AbstractC3565y.b(this, abstractC3557u);
    }

    @Override // Y.d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC3557u) {
            return y((AbstractC3557u) obj);
        }
        return false;
    }

    @Override // Zg.AbstractC3674f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof F1) {
            return z((F1) obj);
        }
        return false;
    }

    @Override // Y.d, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof AbstractC3557u) {
            return A((AbstractC3557u) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC3557u) ? obj2 : B((AbstractC3557u) obj, (F1) obj2);
    }

    @Override // T.A0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public a c() {
        return new a(this);
    }

    public /* bridge */ boolean y(AbstractC3557u abstractC3557u) {
        return super.containsKey(abstractC3557u);
    }

    public /* bridge */ boolean z(F1 f12) {
        return super.containsValue(f12);
    }
}
