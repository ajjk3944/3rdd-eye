package z0;

import java.util.Iterator;
import java.util.Map;
import v1.e0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends zj.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37817a;

    /* renamed from: b, reason: collision with root package name */
    public final d f37818b;

    public /* synthetic */ f(int i4, d dVar) {
        this.f37817a = i4;
        this.f37818b = dVar;
    }

    @Override // zj.i
    public final int a() {
        switch (this.f37817a) {
            case 0:
                d dVar = this.f37818b;
                dVar.getClass();
                return dVar.f37813f;
            default:
                d dVar2 = this.f37818b;
                dVar2.getClass();
                return dVar2.f37813f;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f37817a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f37817a) {
            case 0:
                this.f37818b.clear();
                break;
            default:
                this.f37818b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f37817a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    d dVar = this.f37818b;
                    Object obj2 = dVar.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && dVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f37818b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f37817a) {
            case 0:
                return new e0(this.f37818b);
            default:
                k[] kVarArr = new k[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    kVarArr[i4] = new l(1);
                }
                return new g(this.f37818b, kVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f37817a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f37818b.remove(entry.getKey(), entry.getValue());
            default:
                d dVar = this.f37818b;
                if (!dVar.containsKey(obj)) {
                    return false;
                }
                dVar.remove(obj);
                return true;
        }
    }
}
