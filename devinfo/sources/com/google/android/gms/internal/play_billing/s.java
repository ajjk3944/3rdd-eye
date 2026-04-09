package com.google.android.gms.internal.play_billing;

import j$.util.Map;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class s implements Map, Serializable, j$.util.Map {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20223a;

    /* renamed from: b, reason: collision with root package name */
    public transient AbstractCollection f20224b;

    /* renamed from: c, reason: collision with root package name */
    public transient AbstractCollection f20225c;

    /* renamed from: d, reason: collision with root package name */
    public transient AbstractCollection f20226d;

    public /* synthetic */ s(int i4) {
        this.f20223a = i4;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.f20223a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        int i4 = this.f20223a;
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        int i4 = this.f20223a;
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        int i4 = this.f20223a;
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f20223a) {
            case 0:
                if (get(obj) != null) {
                }
                break;
            default:
                if (get(obj) != null) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f20223a) {
            case 0:
                z zVar = (z) this.f20226d;
                if (zVar == null) {
                    a0 a0Var = (a0) this;
                    z zVar2 = new z(a0Var.f20072f, 1, a0Var.g);
                    this.f20226d = zVar2;
                    zVar = zVar2;
                }
                return zVar.contains(obj);
            default:
                ud.l lVar = (ud.l) this.f20226d;
                if (lVar == null) {
                    ud.m mVar = (ud.m) this;
                    ud.l lVar2 = new ud.l(mVar.f35320f, 1, mVar.g);
                    this.f20226d = lVar2;
                    lVar = lVar2;
                }
                return lVar.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f20223a) {
            case 0:
                x xVar = (x) this.f20224b;
                if (xVar != null) {
                    return xVar;
                }
                a0 a0Var = (a0) this;
                x xVar2 = new x(a0Var, a0Var.f20072f, a0Var.g);
                this.f20224b = xVar2;
                return xVar2;
            default:
                ud.j jVar = (ud.j) this.f20224b;
                if (jVar != null) {
                    return jVar;
                }
                ud.m mVar = (ud.m) this;
                ud.j jVar2 = new ud.j(mVar, mVar.f35320f, mVar.g);
                this.f20224b = jVar2;
                return jVar2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f20223a) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof java.util.Map) {
                    return entrySet().equals(((java.util.Map) obj).entrySet());
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof java.util.Map)) {
                    return false;
                }
                return ((ud.f) entrySet()).equals(((java.util.Map) obj).entrySet());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        int i4 = this.f20223a;
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.f20223a) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            default:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.f20223a) {
            case 0:
                x xVar = (x) this.f20224b;
                if (xVar == null) {
                    a0 a0Var = (a0) this;
                    x xVar2 = new x(a0Var, a0Var.f20072f, a0Var.g);
                    this.f20224b = xVar2;
                    xVar = xVar2;
                }
                Iterator it = xVar.iterator();
                int iHashCode = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    iHashCode += next != null ? next.hashCode() : 0;
                }
                return iHashCode;
            default:
                ud.j jVar = (ud.j) this.f20224b;
                if (jVar == null) {
                    ud.m mVar = (ud.m) this;
                    ud.j jVar2 = new ud.j(mVar, mVar.f35320f, mVar.g);
                    this.f20224b = jVar2;
                    jVar = jVar2;
                }
                Iterator it2 = jVar.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    i4 = ~(~(i4 + (next2 != null ? next2.hashCode() : 0)));
                }
                return i4;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f20223a) {
            case 0:
                if (((a0) this).size() == 0) {
                }
                break;
            default:
                if (((ud.m) this).size() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f20223a) {
            case 0:
                y yVar = (y) this.f20225c;
                if (yVar != null) {
                    return yVar;
                }
                a0 a0Var = (a0) this;
                y yVar2 = new y(a0Var, new z(a0Var.f20072f, 0, a0Var.g));
                this.f20225c = yVar2;
                return yVar2;
            default:
                ud.k kVar = (ud.k) this.f20225c;
                if (kVar != null) {
                    return kVar;
                }
                ud.m mVar = (ud.m) this;
                ud.k kVar2 = new ud.k(mVar, new ud.l(mVar.f35320f, 0, mVar.g));
                this.f20225c = kVar2;
                return kVar2;
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i4 = this.f20223a;
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f20223a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        switch (this.f20223a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        int i4 = this.f20223a;
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        int i4 = this.f20223a;
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        int i4 = this.f20223a;
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        int i4 = this.f20223a;
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        switch (this.f20223a) {
            case 0:
                int i4 = ((a0) this).g;
                if (i4 < 0) {
                    throw new IllegalArgumentException(je.u.r(i4, "size cannot be negative but was: "));
                }
                StringBuilder sb2 = new StringBuilder((int) Math.min(i4 * 8, 1073741824L));
                sb2.append('{');
                Iterator it = ((x) entrySet()).iterator();
                boolean z3 = true;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z3) {
                        sb2.append(", ");
                    }
                    sb2.append(entry.getKey());
                    sb2.append('=');
                    sb2.append(entry.getValue());
                    z3 = false;
                }
                sb2.append('}');
                return sb2.toString();
            default:
                int i10 = ((ud.m) this).g;
                com.bumptech.glide.f.g(i10, "size");
                StringBuilder sb3 = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
                sb3.append('{');
                ac.h hVarL = ((ud.j) entrySet()).iterator();
                boolean z10 = true;
                while (true) {
                    ud.b bVar = (ud.b) hVarL;
                    if (!bVar.hasNext()) {
                        sb3.append('}');
                        return sb3.toString();
                    }
                    Map.Entry entry2 = (Map.Entry) bVar.next();
                    if (!z10) {
                        sb3.append(", ");
                    }
                    sb3.append(entry2.getKey());
                    sb3.append('=');
                    sb3.append(entry2.getValue());
                    z10 = false;
                }
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.f20223a) {
            case 0:
                z zVar = (z) this.f20226d;
                if (zVar != null) {
                    return zVar;
                }
                a0 a0Var = (a0) this;
                z zVar2 = new z(a0Var.f20072f, 1, a0Var.g);
                this.f20226d = zVar2;
                return zVar2;
            default:
                ud.l lVar = (ud.l) this.f20226d;
                if (lVar != null) {
                    return lVar;
                }
                ud.m mVar = (ud.m) this;
                ud.l lVar2 = new ud.l(mVar.f35320f, 1, mVar.g);
                this.f20226d = lVar2;
                return lVar2;
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.f20223a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        int i4 = this.f20223a;
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
