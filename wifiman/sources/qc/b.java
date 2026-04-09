package Qc;

import Cd.j;
import Dc.k;
import Qc.a;
import gg.y;
import gg.z;
import hg.InterfaceC6043c;
import inet.ipaddr.g;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class b extends Qc.a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f19285h = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private final j.a f19286d;

    /* renamed from: e, reason: collision with root package name */
    private final y f19287e;

    /* renamed from: f, reason: collision with root package name */
    private final String f19288f;

    /* renamed from: g, reason: collision with root package name */
    private final k f19289g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: Qc.b$b, reason: collision with other inner class name */
    static final class C0680b implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f19290a;

        C0680b(g gVar) {
            this.f19290a = gVar;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("UBNT HTTP DISCOVERY - CHECK " + this.f19290a + " - subscribed", null, 2, null);
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f19291a;

        c(g gVar) {
            this.f19291a = gVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Boolean httpSpeedtestAvailable) {
            AbstractC6492s.i(httpSpeedtestAvailable, "httpSpeedtestAvailable");
            Z7.b.h("UBNT HTTP DISCOVERY - CHECK " + this.f19291a + " - " + httpSpeedtestAvailable, null, 2, null);
            return httpSpeedtestAvailable.booleanValue() ? new C6556a(new a.b(this.f19291a, System.currentTimeMillis(), Long.MAX_VALUE)) : new C6556a(null);
        }
    }

    public b(a.C0679a params, j.a localSpeedtestAvailabilityChecker, y yVar) {
        AbstractC6492s.i(params, "params");
        AbstractC6492s.i(localSpeedtestAvailabilityChecker, "localSpeedtestAvailabilityChecker");
        this.f19286d = localSpeedtestAvailabilityChecker;
        this.f19287e = yVar;
        this.f19288f = "UbntHttpSt";
        this.f19289g = params.a();
    }

    @Override // Dc.t
    public k h() {
        return this.f19289g;
    }

    @Override // Dc.t
    protected String i() {
        return this.f19288f;
    }

    @Override // Dc.t
    protected y k() {
        return this.f19287e;
    }

    @Override // Dc.t
    protected z m(g ip) {
        AbstractC6492s.i(ip, "ip");
        z zVarA = this.f19286d.a(ip, 500L).n(new C0680b(ip)).A(new c(ip));
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }
}
