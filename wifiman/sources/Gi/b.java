package Gi;

import Ci.h;
import Zg.AbstractC3679k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class b extends AbstractC3679k implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final a f7505e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final b f7506f;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7507b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f7508c;

    /* renamed from: d, reason: collision with root package name */
    private final Ei.d f7509d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return b.f7506f;
        }

        private a() {
        }
    }

    /* renamed from: Gi.b$b, reason: collision with other inner class name */
    static final class C0302b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C0302b f7510a = new C0302b();

        C0302b() {
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

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7511a = new c();

        c() {
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

    static {
        Hi.c cVar = Hi.c.f7979a;
        f7506f = new b(cVar, cVar, Ei.d.f4765d.a());
    }

    public b(Object obj, Object obj2, Ei.d hashMap) {
        AbstractC6492s.i(hashMap, "hashMap");
        this.f7507b = obj;
        this.f7508c = obj2;
        this.f7509d = hashMap;
    }

    public final Ei.d C() {
        return this.f7509d;
    }

    public final Object J() {
        return this.f7508c;
    }

    @Override // java.util.Collection, java.util.Set, Ci.h
    public h addAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        if (elements.isEmpty()) {
            return this;
        }
        h.a aVarC = c();
        aVarC.addAll(elements);
        return aVarC.a();
    }

    @Override // Ci.h
    public h.a c() {
        return new Gi.c(this);
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f7509d.containsKey(obj);
    }

    @Override // Zg.AbstractC3679k, java.util.Collection, java.util.Set
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
        return set instanceof b ? this.f7509d.t().k(((b) obj).f7509d.t(), C0302b.f7510a) : set instanceof Gi.c ? this.f7509d.t().k(((Gi.c) obj).s().j(), c.f7511a) : super.equals(obj);
    }

    @Override // Zg.AbstractC3679k, java.util.Collection, java.util.Set
    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new d(this.f7507b, this.f7509d);
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f7509d.size();
    }

    public final Object y() {
        return this.f7507b;
    }
}
