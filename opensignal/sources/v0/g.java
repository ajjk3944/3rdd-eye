package v0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import n0.j2;

/* loaded from: classes.dex */
public final class g extends mq.g {

    /* renamed from: a, reason: collision with root package name */
    public u0.b f23742a = new u0.b();

    /* renamed from: d, reason: collision with root package name */
    public s0.k f23743d;

    /* renamed from: g, reason: collision with root package name */
    public Object f23744g;

    /* renamed from: r, reason: collision with root package name */
    public int f23745r;

    /* renamed from: x, reason: collision with root package name */
    public int f23746x;

    /* renamed from: y, reason: collision with root package name */
    public h f23747y;

    public g(h hVar) {
        this.f23743d = hVar.f21826a;
        this.f23746x = hVar.f21827d;
        this.f23747y = hVar;
    }

    @Override // mq.g
    public final Set a() {
        return new s0.f(0, this);
    }

    @Override // mq.g
    public final Set b() {
        return new s0.f(1, this);
    }

    @Override // mq.g
    public final int c() {
        return this.f23746x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f23743d = s0.k.f21840e;
        i(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof androidx.compose.runtime.d) {
            return f((androidx.compose.runtime.d) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof j2) {
            return super.containsValue((j2) obj);
        }
        return false;
    }

    @Override // mq.g
    public final Collection d() {
        return new nq.h(1, this);
    }

    public final h e() {
        s0.k kVar = this.f23743d;
        h hVar = this.f23747y;
        if (kVar != hVar.f21826a) {
            this.f23742a = new u0.b();
            hVar = new h(this.f23743d, c());
        }
        this.f23747y = hVar;
        return hVar;
    }

    public final boolean f(Object obj) {
        return this.f23743d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object g(Object obj) {
        return this.f23743d.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof androidx.compose.runtime.d) {
            return (j2) g((androidx.compose.runtime.d) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof androidx.compose.runtime.d) ? obj2 : (j2) super.getOrDefault((androidx.compose.runtime.d) obj, (j2) obj2);
    }

    public final Object h(Object obj) {
        this.f23744g = null;
        s0.k kVarN = this.f23743d.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (kVarN == null) {
            kVarN = s0.k.f21840e;
        }
        this.f23743d = kVarN;
        return this.f23744g;
    }

    public final void i(int i10) {
        this.f23746x = i10;
        this.f23745r++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f23744g = null;
        this.f23743d = this.f23743d.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f23744g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [s0.c] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        h hVarE = null;
        h hVar = map instanceof s0.c ? (s0.c) map : null;
        if (hVar == null) {
            g gVar = map instanceof g ? (g) map : null;
            if (gVar != null) {
                hVarE = gVar.e();
            }
        } else {
            hVarE = hVar;
        }
        if (hVarE == null) {
            super.putAll(map);
            return;
        }
        u0.a aVar = new u0.a();
        aVar.f23136a = 0;
        int i10 = this.f23746x;
        s0.k kVar = this.f23743d;
        s0.k kVar2 = hVarE.f21826a;
        br.l.c(kVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f23743d = kVar.m(kVar2, 0, aVar, this);
        int i11 = (hVarE.f21827d + i10) - aVar.f23136a;
        if (i10 != i11) {
            i(i11);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iC = c();
        s0.k kVarO = this.f23743d.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (kVarO == null) {
            kVarO = s0.k.f21840e;
        }
        this.f23743d = kVarO;
        return iC != c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof androidx.compose.runtime.d) {
            return (j2) h((androidx.compose.runtime.d) obj);
        }
        return null;
    }
}
