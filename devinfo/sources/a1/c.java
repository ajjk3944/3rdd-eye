package a1;

import java.util.Collection;
import java.util.Iterator;
import nk.k;
import zj.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends i implements Collection, ok.b {

    /* renamed from: a, reason: collision with root package name */
    public b f158a;

    /* renamed from: b, reason: collision with root package name */
    public Object f159b;

    /* renamed from: c, reason: collision with root package name */
    public Object f160c;

    /* renamed from: d, reason: collision with root package name */
    public final z0.d f161d;

    public c(b bVar) {
        this.f158a = bVar;
        this.f159b = bVar.f155a;
        this.f160c = bVar.f156b;
        this.f161d = bVar.f157c.a();
    }

    @Override // zj.i
    public final int a() {
        z0.d dVar = this.f161d;
        dVar.getClass();
        return dVar.f37813f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        z0.d dVar = this.f161d;
        if (dVar.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.f159b = obj;
            this.f160c = obj;
            dVar.put(obj, new a());
            return true;
        }
        V v10 = dVar.get(this.f160c);
        k.b(v10);
        dVar.put(this.f160c, new a(((a) v10).f152a, obj));
        dVar.put(obj, new a(this.f160c));
        this.f160c = obj;
        return true;
    }

    public final b c() {
        z0.b bVarA = this.f161d.a();
        b bVar = this.f158a;
        if (bVarA != bVar.f157c) {
            bVar = new b(this.f159b, this.f160c, bVarA);
        }
        this.f158a = bVar;
        return bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f161d.clear();
        b1.b bVar = b1.b.f1632a;
        this.f159b = bVar;
        this.f160c = bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f161d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new e(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        z0.d dVar = this.f161d;
        a aVar = (a) dVar.remove(obj);
        if (aVar == null) {
            return false;
        }
        Object obj2 = aVar.f153b;
        Object obj3 = aVar.f152a;
        b1.b bVar = b1.b.f1632a;
        if (obj3 != bVar) {
            V v10 = dVar.get(obj3);
            k.b(v10);
            dVar.put(obj3, new a(((a) v10).f152a, obj2));
        } else {
            this.f159b = obj2;
        }
        if (obj2 == bVar) {
            this.f160c = obj3;
            return true;
        }
        V v11 = dVar.get(obj2);
        k.b(v11);
        dVar.put(obj2, new a(obj3, ((a) v11).f153b));
        return true;
    }
}
