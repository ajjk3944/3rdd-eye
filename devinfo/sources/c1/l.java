package c1;

import j$.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import u0.i1;
import u0.k1;
import u0.q2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l extends z0.b implements i1, Map {

    /* renamed from: d, reason: collision with root package name */
    public static final l f2565d = new l(z0.j.f37821e, 0);

    @Override // z0.b
    public final z0.d a() {
        k kVar = new k(this);
        kVar.g = this;
        return kVar;
    }

    public final l c(k1 k1Var, q2 q2Var) {
        t7.m mVarU = this.f37803a.u(k1Var, k1Var.hashCode(), q2Var, 0);
        return mVarU == null ? this : new l((z0.j) mVarU.f34474c, this.f37804b + mVarU.f34473b);
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

    @Override // z0.b, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof k1) {
            return super.containsKey((k1) obj);
        }
        return false;
    }

    @Override // zj.f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof q2) {
            return super.containsValue((q2) obj);
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // z0.b, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof k1) {
            return (q2) super.get((k1) obj);
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof k1) ? obj2 : (q2) Map.CC.$default$getOrDefault(this, (k1) obj, (q2) obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
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
}
