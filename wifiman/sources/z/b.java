package Z;

import W.f;
import Y.d;
import Zg.AbstractC3679k;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class b extends AbstractC3679k implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f25063e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f25064f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final b f25065g;

    /* renamed from: b, reason: collision with root package name */
    private final Object f25066b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f25067c;

    /* renamed from: d, reason: collision with root package name */
    private final d f25068d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return b.f25065g;
        }

        private a() {
        }
    }

    static {
        a0.c cVar = a0.c.f25713a;
        f25065g = new b(cVar, cVar, d.f24478d.a());
    }

    public b(Object obj, Object obj2, d dVar) {
        this.f25066b = obj;
        this.f25067c = obj2;
        this.f25068d = dVar;
    }

    @Override // java.util.Collection, java.util.Set, W.f
    public f add(Object obj) {
        if (this.f25068d.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new b(obj, obj, this.f25068d.u(obj, new Z.a()));
        }
        Object obj2 = this.f25067c;
        Object obj3 = this.f25068d.get(obj2);
        AbstractC6492s.f(obj3);
        return new b(this.f25066b, obj, this.f25068d.u(obj2, ((Z.a) obj3).e(obj)).u(obj, new Z.a(obj2)));
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f25068d.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new c(this.f25066b, this.f25068d);
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f25068d.size();
    }

    @Override // java.util.Collection, java.util.Set, W.f
    public f remove(Object obj) {
        Z.a aVar = (Z.a) this.f25068d.get(obj);
        if (aVar == null) {
            return this;
        }
        d dVarV = this.f25068d.v(obj);
        if (aVar.b()) {
            Object obj2 = dVarV.get(aVar.d());
            AbstractC6492s.f(obj2);
            dVarV = dVarV.u(aVar.d(), ((Z.a) obj2).e(aVar.c()));
        }
        if (aVar.a()) {
            Object obj3 = dVarV.get(aVar.c());
            AbstractC6492s.f(obj3);
            dVarV = dVarV.u(aVar.c(), ((Z.a) obj3).f(aVar.d()));
        }
        return new b(!aVar.b() ? aVar.c() : this.f25066b, !aVar.a() ? aVar.d() : this.f25067c, dVarV);
    }
}
