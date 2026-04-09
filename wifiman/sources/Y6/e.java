package Y6;

import Y6.h;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
abstract class e extends h {

    /* renamed from: b, reason: collision with root package name */
    public static final h.d f24652b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final h f24653a;

    class a implements h.d {
        a() {
        }

        @Override // Y6.h.d
        public h a(Type type, Set set, r rVar) {
            Class clsG = v.g(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (clsG == List.class || clsG == Collection.class) {
                return e.m(type, rVar).g();
            }
            if (clsG == Set.class) {
                return e.o(type, rVar).g();
            }
            return null;
        }
    }

    class b extends e {
        b(h hVar) {
            super(hVar, null);
        }

        @Override // Y6.h
        public /* bridge */ /* synthetic */ Object b(k kVar) {
            return super.l(kVar);
        }

        @Override // Y6.h
        public /* bridge */ /* synthetic */ void j(o oVar, Object obj) {
            super.p(oVar, (Collection) obj);
        }

        @Override // Y6.e
        Collection n() {
            return new ArrayList();
        }
    }

    class c extends e {
        c(h hVar) {
            super(hVar, null);
        }

        @Override // Y6.h
        public /* bridge */ /* synthetic */ Object b(k kVar) {
            return super.l(kVar);
        }

        @Override // Y6.h
        public /* bridge */ /* synthetic */ void j(o oVar, Object obj) {
            super.p(oVar, (Collection) obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Y6.e
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public Set n() {
            return new LinkedHashSet();
        }
    }

    /* synthetic */ e(h hVar, a aVar) {
        this(hVar);
    }

    static h m(Type type, r rVar) {
        return new b(rVar.d(v.c(type, Collection.class)));
    }

    static h o(Type type, r rVar) {
        return new c(rVar.d(v.c(type, Collection.class)));
    }

    public Collection l(k kVar) {
        Collection collectionN = n();
        kVar.a();
        while (kVar.s()) {
            collectionN.add(this.f24653a.b(kVar));
        }
        kVar.h();
        return collectionN;
    }

    abstract Collection n();

    public void p(o oVar, Collection collection) {
        oVar.a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f24653a.j(oVar, it.next());
        }
        oVar.p();
    }

    public String toString() {
        return this.f24653a + ".collection()";
    }

    private e(h hVar) {
        this.f24653a = hVar;
    }
}
