package rf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Zg.AbstractC3689v;
import com.ui.wifiman.ui.component.network.C5219q;
import com.ui.wifiman.ui.teleport.y;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class f implements C5219q.c {

    /* renamed from: a, reason: collision with root package name */
    private final e f60422a;

    /* renamed from: b, reason: collision with root package name */
    private final e f60423b;

    /* renamed from: c, reason: collision with root package name */
    private final com.ui.wifiman.ui.teleport.y f60424c;

    /* renamed from: d, reason: collision with root package name */
    private final List f60425d;

    static final class a implements InterfaceC6839p {
        a() {
        }

        public final long a(InterfaceC3540l interfaceC3540l, int i10) {
            long jF;
            interfaceC3540l.U(-1378117919);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1378117919, i10, -1, "com.ui.wifiman.ui.teleport.component.TeleportTunnelNetworkTopology.State.<get-connectionColor>.<anonymous> (TeleportTunnelNetworkTopology.kt:81)");
            }
            com.ui.wifiman.ui.teleport.y yVarG = f.this.g();
            if (yVarG instanceof y.c) {
                interfaceC3540l.U(510038364);
                jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().i();
                interfaceC3540l.J();
            } else if (yVarG instanceof y.b) {
                interfaceC3540l.U(510041436);
                jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f();
                interfaceC3540l.J();
            } else {
                if (!(yVarG instanceof y.a)) {
                    interfaceC3540l.U(510034885);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(510044508);
                jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().f();
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return jF;
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C6733v0.g(a((InterfaceC3540l) obj, ((Number) obj2).intValue()));
        }
    }

    public f(e console, e myself, com.ui.wifiman.ui.teleport.y tunnelState) {
        AbstractC6492s.i(console, "console");
        AbstractC6492s.i(myself, "myself");
        AbstractC6492s.i(tunnelState, "tunnelState");
        this.f60422a = console;
        this.f60423b = myself;
        this.f60424c = tunnelState;
        this.f60425d = AbstractC3689v.e(Yg.z.a(myself, C5219q.a.WIRELESS));
    }

    public static /* synthetic */ f e(f fVar, e eVar, e eVar2, com.ui.wifiman.ui.teleport.y yVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = fVar.f60422a;
        }
        if ((i10 & 2) != 0) {
            eVar2 = fVar.f60423b;
        }
        if ((i10 & 4) != 0) {
            yVar = fVar.f60424c;
        }
        return fVar.d(eVar, eVar2, yVar);
    }

    @Override // com.ui.wifiman.ui.component.network.C5219q.c
    public List a() {
        return this.f60425d;
    }

    @Override // com.ui.wifiman.ui.component.network.C5219q.c
    public InterfaceC6839p c() {
        return new a();
    }

    public final f d(e console, e myself, com.ui.wifiman.ui.teleport.y tunnelState) {
        AbstractC6492s.i(console, "console");
        AbstractC6492s.i(myself, "myself");
        AbstractC6492s.i(tunnelState, "tunnelState");
        return new f(console, myself, tunnelState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC6492s.d(this.f60422a, fVar.f60422a) && AbstractC6492s.d(this.f60423b, fVar.f60423b) && AbstractC6492s.d(this.f60424c, fVar.f60424c);
    }

    @Override // com.ui.wifiman.ui.component.network.C5219q.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public e b() {
        return this.f60422a;
    }

    public final com.ui.wifiman.ui.teleport.y g() {
        return this.f60424c;
    }

    public int hashCode() {
        return (((this.f60422a.hashCode() * 31) + this.f60423b.hashCode()) * 31) + this.f60424c.hashCode();
    }

    public String toString() {
        return "State(console=" + this.f60422a + ", myself=" + this.f60423b + ", tunnelState=" + this.f60424c + ")";
    }
}
