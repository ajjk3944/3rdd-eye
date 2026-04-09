package E0;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* renamed from: E0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2636n {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3954a;

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f3955b = Yg.n.a(Yg.q.NONE, b.f3958a);

    /* renamed from: c, reason: collision with root package name */
    private final Comparator f3956c;

    /* renamed from: d, reason: collision with root package name */
    private final C0 f3957d;

    /* renamed from: E0.n$a */
    public static final class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(G g10, G g11) {
            int iK = AbstractC6492s.k(g10.L(), g11.L());
            return iK != 0 ? iK : AbstractC6492s.k(g10.hashCode(), g11.hashCode());
        }
    }

    /* renamed from: E0.n$b */
    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f3958a = new b();

        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return new LinkedHashMap();
        }
    }

    public C2636n(boolean z10) {
        this.f3954a = z10;
        a aVar = new a();
        this.f3956c = aVar;
        this.f3957d = new C0(aVar);
    }

    private final Map c() {
        return (Map) this.f3955b.getValue();
    }

    public final void a(G g10) {
        if (!g10.K0()) {
            B0.a.b("DepthSortedSet.add called on an unattached node");
        }
        if (this.f3954a) {
            Integer num = (Integer) c().get(g10);
            if (num == null) {
                c().put(g10, Integer.valueOf(g10.L()));
            } else {
                if (!(num.intValue() == g10.L())) {
                    B0.a.b("invalid node depth");
                }
            }
        }
        this.f3957d.add(g10);
    }

    public final boolean b(G g10) {
        boolean zContains = this.f3957d.contains(g10);
        if (this.f3954a) {
            if (!(zContains == c().containsKey(g10))) {
                B0.a.b("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final boolean d() {
        return this.f3957d.isEmpty();
    }

    public final G e() {
        G g10 = (G) this.f3957d.first();
        f(g10);
        return g10;
    }

    public final boolean f(G g10) {
        if (!g10.K0()) {
            B0.a.b("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.f3957d.remove(g10);
        if (this.f3954a) {
            if (!AbstractC6492s.d((Integer) c().remove(g10), zRemove ? Integer.valueOf(g10.L()) : null)) {
                B0.a.b("invalid node depth");
            }
        }
        return zRemove;
    }

    public String toString() {
        return this.f3957d.toString();
    }
}
