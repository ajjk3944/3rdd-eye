package Gi;

import Ci.h;
import Ei.f;
import Zg.AbstractC3678j;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class c extends AbstractC3678j implements h.a {

    /* renamed from: a, reason: collision with root package name */
    private Gi.b f7512a;

    /* renamed from: b, reason: collision with root package name */
    private Object f7513b;

    /* renamed from: c, reason: collision with root package name */
    private Object f7514c;

    /* renamed from: d, reason: collision with root package name */
    private final f f7515d;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7516a = new a();

        a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Gi.a aVar, Gi.a aVar2) {
            AbstractC6492s.i(aVar, "<anonymous parameter 0>");
            AbstractC6492s.i(aVar2, "<anonymous parameter 1>");
            return Boolean.TRUE;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7517a = new b();

        b() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Gi.a aVar, Gi.a aVar2) {
            AbstractC6492s.i(aVar, "<anonymous parameter 0>");
            AbstractC6492s.i(aVar2, "<anonymous parameter 1>");
            return Boolean.TRUE;
        }
    }

    public c(Gi.b set) {
        AbstractC6492s.i(set, "set");
        this.f7512a = set;
        this.f7513b = set.y();
        this.f7514c = set.J();
        this.f7515d = set.C().c();
    }

    @Override // Ci.h.a
    public h a() {
        Gi.b bVar = this.f7512a;
        if (bVar != null) {
            Hi.a.a(this.f7515d.h() != null);
            Hi.a.a(this.f7513b == bVar.y());
            Hi.a.a(this.f7514c == bVar.J());
            return bVar;
        }
        Hi.a.a(this.f7515d.h() == null);
        Gi.b bVar2 = new Gi.b(this.f7513b, this.f7514c, this.f7515d.a());
        this.f7512a = bVar2;
        return bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        if (this.f7515d.containsKey(obj)) {
            return false;
        }
        this.f7512a = null;
        if (isEmpty()) {
            this.f7513b = obj;
            this.f7514c = obj;
            this.f7515d.put(obj, new Gi.a());
            return true;
        }
        V v10 = this.f7515d.get(this.f7514c);
        AbstractC6492s.f(v10);
        this.f7515d.put(this.f7514c, ((Gi.a) v10).e(obj));
        this.f7515d.put(obj, new Gi.a(this.f7514c));
        this.f7514c = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (!this.f7515d.isEmpty()) {
            this.f7512a = null;
        }
        this.f7515d.clear();
        Hi.c cVar = Hi.c.f7979a;
        this.f7513b = cVar;
        this.f7514c = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f7515d.containsKey(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        return set instanceof Gi.b ? this.f7515d.j().k(((Gi.b) obj).C().t(), a.f7516a) : set instanceof c ? this.f7515d.j().k(((c) obj).f7515d.j(), b.f7517a) : super.equals(obj);
    }

    @Override // Zg.AbstractC3678j
    public int g() {
        return this.f7515d.size();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new e(this);
    }

    public final Object j() {
        return this.f7513b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Gi.a aVar = (Gi.a) this.f7515d.remove(obj);
        if (aVar == null) {
            return false;
        }
        this.f7512a = null;
        if (aVar.b()) {
            V v10 = this.f7515d.get(aVar.d());
            AbstractC6492s.f(v10);
            this.f7515d.put(aVar.d(), ((Gi.a) v10).e(aVar.c()));
        } else {
            this.f7513b = aVar.c();
        }
        if (!aVar.a()) {
            this.f7514c = aVar.d();
            return true;
        }
        V v11 = this.f7515d.get(aVar.c());
        AbstractC6492s.f(v11);
        this.f7515d.put(aVar.c(), ((Gi.a) v11).f(aVar.d()));
        return true;
    }

    public final f s() {
        return this.f7515d;
    }
}
