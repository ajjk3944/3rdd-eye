package z0;

import j$.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d extends zj.h implements Map {

    /* renamed from: a, reason: collision with root package name */
    public b f37808a;

    /* renamed from: b, reason: collision with root package name */
    public b1.b f37809b = new b1.b();

    /* renamed from: c, reason: collision with root package name */
    public j f37810c;

    /* renamed from: d, reason: collision with root package name */
    public Object f37811d;

    /* renamed from: e, reason: collision with root package name */
    public int f37812e;

    /* renamed from: f, reason: collision with root package name */
    public int f37813f;

    public d(b bVar) {
        this.f37808a = bVar;
        this.f37810c = bVar.f37803a;
        this.f37813f = bVar.f37804b;
    }

    public b a() {
        j jVar = this.f37810c;
        b bVar = this.f37808a;
        if (jVar != bVar.f37803a) {
            this.f37809b = new b1.b();
            bVar = new b(this.f37810c, this.f37813f);
        }
        this.f37808a = bVar;
        return bVar;
    }

    public final void b(int i4) {
        this.f37813f = i4;
        this.f37812e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f37810c = j.f37821e;
        b(0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f37810c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f37810c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f37811d = null;
        this.f37810c = this.f37810c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f37811d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        b bVarA = null;
        b bVar = map instanceof b ? (b) map : null;
        if (bVar == null) {
            d dVar = map instanceof d ? (d) map : null;
            if (dVar != null) {
                bVarA = dVar.a();
            }
        } else {
            bVarA = bVar;
        }
        if (bVarA == null) {
            super.putAll(map);
            return;
        }
        b1.a aVar = new b1.a();
        aVar.f1631a = 0;
        int i4 = this.f37813f;
        j jVar = this.f37810c;
        j jVar2 = bVarA.f37803a;
        nk.k.c(jVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f37810c = jVar.m(jVar2, 0, aVar, this);
        int i10 = (bVarA.f37804b + i4) - aVar.f1631a;
        if (i4 != i10) {
            b(i10);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i4 = this.f37813f;
        j jVarO = this.f37810c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (jVarO == null) {
            jVarO = j.f37821e;
        }
        this.f37810c = jVarO;
        return i4 != this.f37813f;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f37811d = null;
        j jVarN = this.f37810c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (jVarN == null) {
            jVarN = j.f37821e;
        }
        this.f37810c = jVarN;
        return this.f37811d;
    }
}
