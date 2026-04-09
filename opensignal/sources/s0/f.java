package s0;

import java.util.Iterator;
import java.util.Map;
import m1.d0;

/* loaded from: classes.dex */
public final class f extends mq.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21834a;

    /* renamed from: d, reason: collision with root package name */
    public final v0.g f21835d;

    public /* synthetic */ f(int i10, v0.g gVar) {
        this.f21834a = i10;
        this.f21835d = gVar;
    }

    @Override // mq.h
    public final int a() {
        switch (this.f21834a) {
        }
        return this.f21835d.c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f21834a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f21834a) {
            case 0:
                this.f21835d.clear();
                break;
            default:
                this.f21835d.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f21834a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                v0.g gVar = this.f21835d;
                Object obj2 = gVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && gVar.containsKey(entry.getKey());
            default:
                return this.f21835d.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f21834a) {
            case 0:
                return new d0(this.f21835d);
            default:
                l[] lVarArr = new l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    lVarArr[i10] = new m(1);
                }
                return new g(this.f21835d, lVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f21834a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f21835d.remove(entry.getKey(), entry.getValue());
            default:
                v0.g gVar = this.f21835d;
                if (!gVar.containsKey(obj)) {
                    return false;
                }
                gVar.remove(obj);
                return true;
        }
    }
}
