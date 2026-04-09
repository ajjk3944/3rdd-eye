package Y;

import Y.t;
import Zg.AbstractC3674f;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
public class d extends AbstractC3674f implements Map, InterfaceC6944a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f24478d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f24479e = 8;

    /* renamed from: f, reason: collision with root package name */
    private static final d f24480f = new d(t.f24503e.a(), 0);

    /* renamed from: b, reason: collision with root package name */
    private final t f24481b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24482c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            d dVar = d.f24480f;
            AbstractC6492s.g(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }

        private a() {
        }
    }

    public d(t tVar, int i10) {
        this.f24481b = tVar;
        this.f24482c = i10;
    }

    private final W.d q() {
        return new n(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f24481b.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // Zg.AbstractC3674f
    public final Set f() {
        return q();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f24481b.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // Zg.AbstractC3674f
    public int h() {
        return this.f24482c;
    }

    @Override // Zg.AbstractC3674f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public W.d g() {
        return new p(this);
    }

    public final t s() {
        return this.f24481b;
    }

    @Override // Zg.AbstractC3674f
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public W.b i() {
        return new r(this);
    }

    public d u(Object obj, Object obj2) {
        t.b bVarP = this.f24481b.P(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return bVarP == null ? this : new d(bVarP.a(), size() + bVarP.b());
    }

    public d v(Object obj) {
        t tVarQ = this.f24481b.Q(obj != null ? obj.hashCode() : 0, obj, 0);
        return this.f24481b == tVarQ ? this : tVarQ == null ? f24478d.a() : new d(tVarQ, size() - 1);
    }
}
