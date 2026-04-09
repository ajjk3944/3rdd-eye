package c1;

import j$.util.Map;
import u0.k1;
import u0.q2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k extends z0.d {
    public l g;

    @Override // z0.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final l a() {
        z0.j jVar = this.f37810c;
        l lVar = this.g;
        if (jVar != lVar.f37803a) {
            this.f37809b = new b1.b();
            lVar = new l(this.f37810c, this.f37813f);
        }
        this.g = lVar;
        return lVar;
    }

    @Override // z0.d, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof k1) {
            return super.containsKey((k1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof q2) {
            return super.containsValue((q2) obj);
        }
        return false;
    }

    @Override // z0.d, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof k1) {
            return (q2) super.get((k1) obj);
        }
        return null;
    }

    @Override // z0.d, java.util.Map, j$.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof k1) ? obj2 : (q2) Map.CC.$default$getOrDefault(this, (k1) obj, (q2) obj2);
    }

    @Override // z0.d, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof k1) {
            return (q2) super.remove((k1) obj);
        }
        return null;
    }
}
