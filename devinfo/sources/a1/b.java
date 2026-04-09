package a1;

import java.util.Iterator;
import nk.k;
import zj.j;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends j implements x0.b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f154d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f155a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f156b;

    /* renamed from: c, reason: collision with root package name */
    public final z0.b f157c;

    static {
        b1.b bVar = b1.b.f1632a;
        f154d = new b(bVar, bVar, z0.b.f37802c);
    }

    public b(Object obj, Object obj2, z0.b bVar) {
        this.f155a = obj;
        this.f156b = obj2;
        this.f157c = bVar;
    }

    public final b a(Object obj) {
        z0.b bVar = this.f157c;
        if (bVar.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new b(obj, obj, bVar.b(obj, new a()));
        }
        Object obj2 = this.f156b;
        Object obj3 = bVar.get(obj2);
        k.b(obj3);
        return new b(this.f155a, obj, bVar.b(obj2, new a(((a) obj3).f152a, obj)).b(obj, new a(obj2)));
    }

    public final b c(Object obj) {
        z0.b bVarB = this.f157c;
        a aVar = (a) bVarB.get(obj);
        if (aVar == null) {
            return this;
        }
        Object obj2 = aVar.f152a;
        Object obj3 = aVar.f153b;
        z0.j jVar = bVarB.f37803a;
        z0.j jVarV = jVar.v(obj != null ? obj.hashCode() : 0, 0, obj);
        if (jVar != jVarV) {
            bVarB = jVarV == null ? z0.b.f37802c : new z0.b(jVarV, bVarB.f37804b - 1);
        }
        b1.b bVar = b1.b.f1632a;
        if (obj2 != bVar) {
            Object obj4 = bVarB.get(obj2);
            k.b(obj4);
            bVarB = bVarB.b(obj2, new a(((a) obj4).f152a, obj3));
        }
        if (obj3 != bVar) {
            Object obj5 = bVarB.get(obj3);
            k.b(obj5);
            bVarB = bVarB.b(obj3, new a(obj2, ((a) obj5).f153b));
        }
        Object obj6 = obj2 != bVar ? this.f155a : obj3;
        if (obj3 != bVar) {
            obj2 = this.f156b;
        }
        return new b(obj6, obj2, bVarB);
    }

    @Override // zj.a, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f157c.containsKey(obj);
    }

    @Override // zj.a
    public final int getSize() {
        z0.b bVar = this.f157c;
        bVar.getClass();
        return bVar.f37804b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new d(this.f155a, this.f157c);
    }
}
