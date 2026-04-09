package K8;

import Id.c;
import K8.b;
import L0.C3174d;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import com.ubnt.usurvey.R;
import ec.AbstractC5452a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import mh.q;
import s9.d;
import vf.C8224d;

/* loaded from: classes3.dex */
public abstract class b {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10467a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C8224d.a c(int i10, String str) {
            AbstractC6492s.i(str, "<unused var>");
            return new C8224d.a("report", "");
        }

        public final CharSequence b(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(1858572079);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1858572079, i10, -1, "com.ubnt.usurvey.ui.teleport.tunnel.message.<anonymous> (TeleportTunnelConnectionFailedReason.kt:28)");
            }
            C8224d c8224d = C8224d.f63596a;
            String string = it.getString(R.string.teleport_tunnel_error_unknown_message);
            AbstractC6492s.h(string, "getString(...)");
            long jA = c8224d.a(interfaceC3540l, C8224d.f63597b);
            interfaceC3540l.U(1449219840);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6839p() { // from class: K8.a
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return b.a.c(((Integer) obj).intValue(), (String) obj2);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            C3174d c3174dD = C8224d.d(c8224d, string, jA, null, (InterfaceC6839p) objF, 4, null);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return c3174dD;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return b((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* renamed from: K8.b$b, reason: collision with other inner class name */
    static final class C0418b implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final C0418b f10468a = new C0418b();

        C0418b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C8224d.a c(int i10, String str) {
            AbstractC6492s.i(str, "<unused var>");
            return new C8224d.a("report", "");
        }

        public final CharSequence b(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(658232920);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(658232920, i10, -1, "com.ubnt.usurvey.ui.teleport.tunnel.message.<anonymous> (TeleportTunnelConnectionFailedReason.kt:42)");
            }
            C8224d c8224d = C8224d.f63596a;
            String string = it.getString(R.string.teleport_tunnel_error_io_message);
            AbstractC6492s.h(string, "getString(...)");
            long jA = c8224d.a(interfaceC3540l, C8224d.f63597b);
            interfaceC3540l.U(1449241888);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6839p() { // from class: K8.c
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return b.C0418b.c(((Integer) obj).intValue(), (String) obj2);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            C3174d c3174dD = C8224d.d(c8224d, string, jA, null, (InterfaceC6839p) objF, 4, null);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return c3174dD;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return b((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final s9.d a(Id.c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        if (cVar instanceof c.h) {
            return new d.a("unknown", a.f10467a);
        }
        if ((cVar instanceof c.b) || (cVar instanceof c.a) || (cVar instanceof c.g)) {
            return new d.a("tunnelConnection", C0418b.f10468a);
        }
        if (cVar instanceof c.f) {
            return new d.b(R.string.teleport_tunnel_error_teleport_disabled_message);
        }
        if (cVar instanceof c.d) {
            return new d.b(R.string.teleport_tunnel_error_teleport_host_offline_message);
        }
        if (cVar instanceof c.e) {
            return new d.b(R.string.teleport_tunnel_error_teleport_token_invalid_message);
        }
        if (cVar instanceof c.C0373c) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AbstractC5452a b(Id.c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        if (cVar instanceof c.h) {
            return new AbstractC5452a.C1741a(R.string.teleport_tunnel_error_unknown_title, new Object[0]);
        }
        if ((cVar instanceof c.b) || (cVar instanceof c.a) || (cVar instanceof c.g)) {
            return new AbstractC5452a.C1741a(R.string.teleport_tunnel_error_io_title, new Object[0]);
        }
        if (cVar instanceof c.f) {
            return new AbstractC5452a.C1741a(R.string.teleport_tunnel_error_teleport_disabled_title, new Object[0]);
        }
        if (cVar instanceof c.d) {
            return new AbstractC5452a.C1741a(R.string.teleport_tunnel_error_teleport_host_offline_title, new Object[0]);
        }
        if (cVar instanceof c.e) {
            return new AbstractC5452a.C1741a(R.string.teleport_tunnel_error_teleport_token_invalid_title, new Object[0]);
        }
        if (cVar instanceof c.C0373c) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AbstractC5452a c(Id.c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        return new AbstractC5452a.C1741a(R.string.teleport, new Object[0]);
    }

    public static final s9.d d(Id.c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        if (cVar instanceof c.h) {
            return new d.b(R.string.teleport_tunnel_error_unknown_title);
        }
        if ((cVar instanceof c.b) || (cVar instanceof c.a) || (cVar instanceof c.g)) {
            return new d.b(R.string.teleport_tunnel_error_io_title);
        }
        if (cVar instanceof c.f) {
            return new d.b(R.string.teleport_tunnel_error_teleport_disabled_title);
        }
        if (cVar instanceof c.d) {
            return new d.b(R.string.teleport_tunnel_error_teleport_host_offline_title);
        }
        if (cVar instanceof c.e) {
            return new d.b(R.string.teleport_tunnel_error_teleport_token_invalid_title);
        }
        if (cVar instanceof c.C0373c) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
