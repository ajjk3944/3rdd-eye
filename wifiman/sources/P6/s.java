package P6;

import G6.E;
import G6.G;
import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class s extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final G f18098a;

    /* renamed from: b, reason: collision with root package name */
    final gg.s f18099b;

    /* renamed from: c, reason: collision with root package name */
    final gg.s f18100c;

    /* renamed from: d, reason: collision with root package name */
    private final x f18101d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.y f18102e;

    class a implements kg.n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(Long l10) {
            return Boolean.valueOf(l10.longValue() == 0);
        }
    }

    class b implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f18103a;

        b(x xVar) {
            this.f18103a = xVar;
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(Long l10) {
            return !this.f18103a.b();
        }
    }

    class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ gg.s f18104a;

        class a implements kg.n {
            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public G.a apply(Boolean bool) {
                return bool.booleanValue() ? G.a.READY : G.a.LOCATION_SERVICES_NOT_ENABLED;
            }
        }

        c(gg.s sVar) {
            this.f18104a = sVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gg.s apply(E.b bVar) {
            return bVar != E.b.f6993c ? gg.s.h0(G.a.BLUETOOTH_NOT_ENABLED) : this.f18104a.i0(new a());
        }
    }

    class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gg.s apply(Boolean bool) {
            s sVar = s.this;
            gg.s sVarV = s.i1(sVar.f18098a, sVar.f18099b, sVar.f18100c).v();
            return bool.booleanValue() ? sVarV.G0(1L) : sVarV;
        }
    }

    protected s(G g10, gg.s sVar, gg.s sVar2, x xVar, gg.y yVar) {
        this.f18098a = g10;
        this.f18099b = sVar;
        this.f18100c = sVar2;
        this.f18101d = xVar;
        this.f18102e = yVar;
    }

    static gg.s i1(G g10, gg.s sVar, gg.s sVar2) {
        return sVar.I0(g10.c() ? E.b.f6993c : E.b.f6994d).O0(new c(sVar2));
    }

    private static gg.z j1(x xVar, gg.y yVar) {
        return gg.s.g0(0L, 1L, TimeUnit.SECONDS, yVar).V0(new b(xVar)).n().A(new a());
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        if (this.f18098a.b()) {
            j1(this.f18101d, this.f18102e).v(new d()).d(xVar);
        } else {
            xVar.c(InterfaceC6043c.r());
            xVar.a();
        }
    }
}
