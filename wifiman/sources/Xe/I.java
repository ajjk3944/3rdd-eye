package xe;

import Ae.p;
import Je.b;
import S8.e;
import Ye.e;
import Zg.AbstractC3689v;
import a8.C3772b;
import ef.AbstractC5460b;
import f2.AbstractC5496B;
import f2.AbstractC5507f;
import f2.C5510i;
import ff.EnumC5821b;
import h9.C5969a;
import java.util.List;
import jf.C6323f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import nf.e;
import org.snmp4j.smi.GenericAddress;
import p000if.C6148a;
import sf.C7951b;
import xe.I;

/* loaded from: classes4.dex */
public abstract class I {

    public static final class A extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final A f65723a = new A();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65724b = "speedtestFeedback";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65725c = AbstractC3689v.e(AbstractC5507f.a("id", new InterfaceC6835l() { // from class: xe.d0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.A.c((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65726d = 8;

        private A() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46671h);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        @Override // Ae.p.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String k(com.ui.wifiman.ui.speedtest.feedback.c params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "id")) {
                return String.valueOf(params.a());
            }
            return null;
        }

        public final com.ui.wifiman.ui.speedtest.feedback.c e(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            Object objD = handle.d("id");
            AbstractC6492s.f(objD);
            return new com.ui.wifiman.ui.speedtest.feedback.c(((Number) objD).longValue());
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof A);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String g(com.ui.wifiman.ui.speedtest.feedback.c cVar) {
            return p.a.C0028a.b(this, cVar);
        }

        public int hashCode() {
            return 85128404;
        }

        @Override // Ae.p.a
        public List j() {
            return f65725c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65724b;
        }

        public String toString() {
            return "SpeedtestFeedback";
        }
    }

    public static final class B extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final B f65727a = new B();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65728b = "speedtestResult";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65729c = AbstractC3689v.o(AbstractC5507f.a("id", new InterfaceC6835l() { // from class: xe.e0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.B.d((C5510i) obj);
            }
        }), AbstractC5507f.a("just_finished", new InterfaceC6835l() { // from class: xe.f0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.B.e((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65730d = 8;

        private B() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J d(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46671h);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J e(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46677n);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof B);
        }

        @Override // Ae.p.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String k(C6323f params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "id")) {
                return String.valueOf(params.a());
            }
            if (AbstractC6492s.d(argName, "just_finished")) {
                return String.valueOf(params.b());
            }
            return null;
        }

        public final C6323f g(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            Object objD = handle.d("id");
            AbstractC6492s.f(objD);
            long jLongValue = ((Number) objD).longValue();
            Object objD2 = handle.d("just_finished");
            AbstractC6492s.f(objD2);
            return new C6323f(jLongValue, ((Boolean) objD2).booleanValue());
        }

        public int hashCode() {
            return -1010116308;
        }

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public String h(C6323f c6323f) {
            return p.a.C0028a.b(this, c6323f);
        }

        @Override // Ae.p.a
        public List j() {
            return f65729c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65728b;
        }

        public String toString() {
            return "SpeedtestResult";
        }
    }

    public static final class C extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final C f65731a = new C();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65732b = "speedtestResults";

        private C() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65732b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C);
        }

        public int hashCode() {
            return -1248834361;
        }

        public String toString() {
            return "SpeedtestResults";
        }
    }

    public static final class D extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final D f65733a = new D();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65734b = "speedtestServerPicker";

        private D() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65734b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof D);
        }

        public int hashCode() {
            return 2034773888;
        }

        public String toString() {
            return "SpeedtestServerPicker";
        }
    }

    public static final class E extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final E f65735a = new E();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65736b = "teleportDelete";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65737c = AbstractC3689v.e(AbstractC5507f.a("console_id", new InterfaceC6835l() { // from class: xe.g0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.E.c((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65738d = 8;

        private E() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        @Override // Ae.p.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String k(com.ui.wifiman.ui.teleport.consoles.b params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "console_id")) {
                return params.b();
            }
            return null;
        }

        public final com.ui.wifiman.ui.teleport.consoles.b e(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            Object objD = handle.d("console_id");
            AbstractC6492s.f(objD);
            return new com.ui.wifiman.ui.teleport.consoles.b((String) objD);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof E);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String g(com.ui.wifiman.ui.teleport.consoles.b bVar) {
            return p.a.C0028a.b(this, bVar);
        }

        public int hashCode() {
            return 1766595149;
        }

        @Override // Ae.p.a
        public List j() {
            return f65737c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65736b;
        }

        public String toString() {
            return "TeleportConsoleDelete";
        }
    }

    public static final class F extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final F f65739a = new F();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65740b = "teleportUnavailable";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65741c = AbstractC3689v.e(AbstractC5507f.a("console_id", new InterfaceC6835l() { // from class: xe.h0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.F.c((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65742d = 8;

        private F() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        @Override // Ae.p.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String k(com.ui.wifiman.ui.teleport.consoles.v params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "console_id")) {
                return params.b();
            }
            return null;
        }

        public final com.ui.wifiman.ui.teleport.consoles.v e(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            Object objD = handle.d("console_id");
            AbstractC6492s.f(objD);
            return new com.ui.wifiman.ui.teleport.consoles.v((String) objD);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof F);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String g(com.ui.wifiman.ui.teleport.consoles.v vVar) {
            return p.a.C0028a.b(this, vVar);
        }

        public int hashCode() {
            return -2009212690;
        }

        @Override // Ae.p.a
        public List j() {
            return f65741c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65740b;
        }

        public String toString() {
            return "TeleportConsoleUnavailable";
        }
    }

    public static final class G extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final G f65743a = new G();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65744b = "teleportInvitation";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65745c = AbstractC3689v.e(AbstractC5507f.a("token", new InterfaceC6835l() { // from class: xe.i0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.G.c((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65746d = 8;

        private G() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        @Override // Ae.p.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String k(C7951b params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "token")) {
                return params.a();
            }
            return null;
        }

        public final C7951b e(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            Object objD = handle.d("token");
            AbstractC6492s.f(objD);
            return new C7951b((String) objD);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof G);
        }

        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public String f(C7951b c7951b) {
            return p.a.C0028a.b(this, c7951b);
        }

        public int hashCode() {
            return -209787122;
        }

        @Override // Ae.p.a
        public List j() {
            return f65745c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65744b;
        }

        public String toString() {
            return "TeleportInvitation";
        }
    }

    public static final class H extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final H f65747a = new H();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65748b = "teleportInvitationPasteFailed";

        private H() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65748b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof H);
        }

        public int hashCode() {
            return 1771344066;
        }

        public String toString() {
            return "TeleportInvitationPasteFailed";
        }
    }

    /* renamed from: xe.I$I, reason: collision with other inner class name */
    public static final class C2328I extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final C2328I f65749a = new C2328I();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65750b = "teleportQuickActionExplanationAdd";

        private C2328I() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65750b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2328I);
        }

        public int hashCode() {
            return -1179805117;
        }

        public String toString() {
            return "TeleportQuickSettingsExplanationAdd";
        }
    }

    public static final class J extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final J f65751a = new J();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65752b = "teleportQuickActionExplanationRemove";

        private J() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65752b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof J);
        }

        public int hashCode() {
            return -1368859742;
        }

        public String toString() {
            return "TeleportQuickSettingsExplanationRemove";
        }
    }

    public static final class K extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final K f65753a = new K();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65754b = "teleportVpnProfile";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65755c = AbstractC3689v.e(AbstractC5507f.a("connect", new InterfaceC6835l() { // from class: xe.j0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.K.c((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65756d = 8;

        private K() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46677n);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        @Override // Ae.p.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String k(com.ui.wifiman.ui.teleport.L params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "connect")) {
                return String.valueOf(params.a());
            }
            return null;
        }

        public final com.ui.wifiman.ui.teleport.L e(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            Object objD = handle.d("connect");
            AbstractC6492s.f(objD);
            return new com.ui.wifiman.ui.teleport.L(((Boolean) objD).booleanValue());
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof K);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String g(com.ui.wifiman.ui.teleport.L l10) {
            return p.a.C0028a.b(this, l10);
        }

        public int hashCode() {
            return -1830874742;
        }

        @Override // Ae.p.a
        public List j() {
            return f65755c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65754b;
        }

        public String toString() {
            return "TeleportVPNProfile";
        }
    }

    public static final class L extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final L f65757a = new L();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65758b = "unitSystemConfig";

        private L() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65758b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof L);
        }

        public int hashCode() {
            return -538176929;
        }

        public String toString() {
            return "UnitSystemConfig";
        }
    }

    public static final class M extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final M f65759a = new M();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65760b = "wifiNetwork";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65761c = AbstractC3689v.e(AbstractC5507f.a("bssid", new InterfaceC6835l() { // from class: xe.k0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.M.c((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65762d = 8;

        private M() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        @Override // Ae.p.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String k(xf.d params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "bssid")) {
                return params.a().d("");
            }
            return null;
        }

        public final xf.d e(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            C5969a.b bVar = C5969a.f48518b;
            Object objD = handle.d("bssid");
            AbstractC6492s.f(objD);
            C5969a c5969aE = bVar.e((String) objD);
            AbstractC6492s.f(c5969aE);
            return new xf.d(c5969aE);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof M);
        }

        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public String f(xf.d dVar) {
            return p.a.C0028a.b(this, dVar);
        }

        public int hashCode() {
            return -1894432450;
        }

        @Override // Ae.p.a
        public List j() {
            return f65761c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65760b;
        }

        public String toString() {
            return "WifiAccessPointDetail";
        }
    }

    public static final class N extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final N f65763a = new N();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65764b = "wifiChannel";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65765c = AbstractC3689v.o(AbstractC5507f.a("band", new InterfaceC6835l() { // from class: xe.l0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.N.g((C5510i) obj);
            }
        }), AbstractC5507f.a("num", new InterfaceC6835l() { // from class: xe.m0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.N.h((C5510i) obj);
            }
        }), AbstractC5507f.a("width", new InterfaceC6835l() { // from class: xe.n0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.N.i((C5510i) obj);
            }
        }), AbstractC5507f.a("rCenter", new InterfaceC6835l() { // from class: xe.o0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.N.m((C5510i) obj);
            }
        }), AbstractC5507f.a("r2Center", new InterfaceC6835l() { // from class: xe.p0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.N.n((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65766d = 8;

        private N() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J g(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J h(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46667d);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J i(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J m(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J n(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            navArgument.b(true);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof N);
        }

        public int hashCode() {
            return 512893685;
        }

        @Override // Ae.p.a
        public List j() {
            return f65765c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65764b;
        }

        @Override // Ae.p.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public String k(com.ui.wifiman.ui.wifi.channel.b params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            switch (argName.hashCode()) {
                case 109446:
                    if (argName.equals("num")) {
                        return String.valueOf(params.a().d());
                    }
                    return null;
                case 3016245:
                    if (argName.equals("band")) {
                        return params.a().a().name();
                    }
                    return null;
                case 111024999:
                    if (argName.equals("rCenter")) {
                        return String.valueOf(params.a().e().a());
                    }
                    return null;
                case 113126854:
                    if (argName.equals("width")) {
                        return params.a().b().name();
                    }
                    return null;
                case 257246837:
                    if (!argName.equals("r2Center")) {
                        return null;
                    }
                    e.b bVarE = params.a().e();
                    e.b.a aVar = bVarE instanceof e.b.a ? (e.b.a) bVarE : null;
                    if (aVar != null) {
                        return Integer.valueOf(aVar.e()).toString();
                    }
                    return null;
                default:
                    return null;
            }
        }

        public final com.ui.wifiman.ui.wifi.channel.b p(androidx.lifecycle.E handle) {
            e.b c0729b;
            Integer numQ;
            Integer numQ2;
            Integer numQ3;
            AbstractC6492s.i(handle, "handle");
            String str = (String) handle.d("band");
            if (str == null) {
                throw new IllegalStateException("Missing band value");
            }
            S8.c cVarValueOf = S8.c.valueOf(str);
            Integer num = (Integer) handle.d("num");
            if (num == null) {
                throw new IllegalStateException("Missing num value");
            }
            int iIntValue = num.intValue();
            String str2 = (String) handle.d("width");
            if (str2 == null) {
                throw new IllegalStateException("Missing bandwidth value");
            }
            S8.d dVarValueOf = S8.d.valueOf(str2);
            if (handle.c("r2Center")) {
                Object objD = handle.d("width");
                AbstractC6492s.f(objD);
                S8.d dVarValueOf2 = S8.d.valueOf((String) objD);
                String str3 = (String) handle.d("rCenter");
                if (str3 == null || (numQ2 = kotlin.text.t.q(str3)) == null) {
                    throw new IllegalStateException("Missing freq center value");
                }
                int iIntValue2 = numQ2.intValue();
                String str4 = (String) handle.d("r2Center");
                if (str4 == null || (numQ3 = kotlin.text.t.q(str4)) == null) {
                    throw new IllegalStateException("Missing freq center2 value");
                }
                c0729b = new e.b.a(dVarValueOf2, iIntValue2, numQ3.intValue());
            } else {
                Object objD2 = handle.d("width");
                AbstractC6492s.f(objD2);
                S8.d dVarValueOf3 = S8.d.valueOf((String) objD2);
                String str5 = (String) handle.d("rCenter");
                if (str5 == null || (numQ = kotlin.text.t.q(str5)) == null) {
                    throw new IllegalStateException("Missing freq center value");
                }
                c0729b = new e.b.C0729b(dVarValueOf3, numQ.intValue());
            }
            return new com.ui.wifiman.ui.wifi.channel.b(new S8.e(cVarValueOf, iIntValue, c0729b, dVarValueOf));
        }

        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public String r(com.ui.wifiman.ui.wifi.channel.b bVar) {
            return p.a.C0028a.b(this, bVar);
        }

        public String toString() {
            return "WifiChannelDetail";
        }
    }

    public static final class O extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final O f65767a = new O();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65768b = "wifiNetwork";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65769c = AbstractC3689v.e(AbstractC5507f.a("ssid", new InterfaceC6835l() { // from class: xe.q0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.O.c((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65770d = 8;

        private O() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        @Override // Ae.p.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String k(Cf.c params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "ssid")) {
                return params.a();
            }
            return null;
        }

        public final Cf.c e(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            Object objD = handle.d("ssid");
            AbstractC6492s.f(objD);
            return new Cf.c((String) objD);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof O);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String g(Cf.c cVar) {
            return p.a.C0028a.b(this, cVar);
        }

        public int hashCode() {
            return -1871039520;
        }

        @Override // Ae.p.a
        public List j() {
            return f65769c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65768b;
        }

        public String toString() {
            return "WifiNetworkDetail";
        }
    }

    public static final class P extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final P f65771a = new P();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65772b = "wifiNetworkDisplayPrefs";

        private P() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65772b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof P);
        }

        public int hashCode() {
            return -933382307;
        }

        public String toString() {
            return "WifiNetworkDisplayPrefs";
        }
    }

    public static final class Q extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final Q f65773a = new Q();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65774b = "scanDisplayPrefsChanQuality";

        private Q() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65774b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Q);
        }

        public int hashCode() {
            return -2120180762;
        }

        public String toString() {
            return "WifiScanDisplayPrefsChannelQuality";
        }
    }

    public static final class R extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final R f65775a = new R();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65776b = "scanDisplayPrefsNetworks";

        private R() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65776b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof R);
        }

        public int hashCode() {
            return -1210999569;
        }

        public String toString() {
            return "WifiScanDisplayPrefsNetworks";
        }
    }

    /* renamed from: xe.I$a, reason: case insensitive filesystem */
    public static final class C8467a extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final C8467a f65777a = new C8467a();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65778b = "appFeedback";

        private C8467a() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65778b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8467a);
        }

        public int hashCode() {
            return 1038431772;
        }

        public String toString() {
            return "AppFeedback";
        }
    }

    /* renamed from: xe.I$b, reason: case insensitive filesystem */
    public static final class C8468b extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final C8468b f65779a = new C8468b();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65780b = "appPreferences";

        private C8468b() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65780b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8468b);
        }

        public int hashCode() {
            return -1730938623;
        }

        public String toString() {
            return "AppPreferences";
        }
    }

    /* renamed from: xe.I$c, reason: case insensitive filesystem */
    public static final class C8469c extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final C8469c f65781a = new C8469c();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65782b = "appWizard";

        private C8469c() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65782b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8469c);
        }

        public int hashCode() {
            return 1578125762;
        }

        public String toString() {
            return "AppWizard";
        }
    }

    /* renamed from: xe.I$d, reason: case insensitive filesystem */
    public static final class C8470d extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final C8470d f65783a = new C8470d();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65784b = "devPreferences";

        private C8470d() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65784b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8470d);
        }

        public int hashCode() {
            return 754314893;
        }

        public String toString() {
            return "DevPreferences";
        }
    }

    /* renamed from: xe.I$e, reason: case insensitive filesystem */
    public static final class C8471e extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final C8471e f65785a = new C8471e();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65786b = "detail";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65787c = AbstractC3689v.o(AbstractC5507f.a("type", new InterfaceC6835l() { // from class: xe.J
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.C8471e.d((C5510i) obj);
            }
        }), AbstractC5507f.a("id", new InterfaceC6835l() { // from class: xe.K
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.C8471e.e((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65788d = 8;

        private C8471e() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J d(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J e(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            navArgument.b(true);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8471e);
        }

        @Override // Ae.p.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String k(Je.b params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "type")) {
                if (params instanceof b.C0408b) {
                    return "id";
                }
                if (params instanceof b.c) {
                    return GenericAddress.TYPE_IP;
                }
                if (params instanceof b.a) {
                    return "gateway";
                }
                if (params instanceof b.d) {
                    return "myself";
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!AbstractC6492s.d(argName, "id")) {
                return null;
            }
            if (params instanceof b.C0408b) {
                return C3772b.f25747c.c(((b.C0408b) params).a());
            }
            if (params instanceof b.c) {
                return String.valueOf(((b.c) params).a());
            }
            if ((params instanceof b.a) || (params instanceof b.d)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final Je.b g(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            String str = (String) handle.d("type");
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1059117320) {
                    if (iHashCode != -189118908) {
                        if (iHashCode != 3355) {
                            if (iHashCode == 3367 && str.equals(GenericAddress.TYPE_IP)) {
                                inet.ipaddr.g gVarP = new inet.ipaddr.n((String) handle.d("id")).p();
                                AbstractC6492s.h(gVarP, "toAddress(...)");
                                return new b.c(gVarP);
                            }
                        } else if (str.equals("id")) {
                            C3772b.a aVar = C3772b.f25747c;
                            Object objD = handle.d("id");
                            AbstractC6492s.f(objD);
                            return new b.C0408b(aVar.a((String) objD));
                        }
                    } else if (str.equals("gateway")) {
                        return b.a.f10008b;
                    }
                } else if (str.equals("myself")) {
                    return b.d.f10011b;
                }
            }
            throw new IllegalStateException("invalid param");
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public String i(Je.b bVar) {
            return p.a.C0028a.b(this, bVar);
        }

        public int hashCode() {
            return 686561201;
        }

        @Override // Ae.p.a
        public List j() {
            return f65787c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65786b;
        }

        public String toString() {
            return "DeviceDetail";
        }
    }

    /* renamed from: xe.I$f, reason: case insensitive filesystem */
    public static final class C8472f extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final C8472f f65789a = new C8472f();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65790b = "deviceEdit";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65791c = AbstractC3689v.e(AbstractC5507f.a("mac", new InterfaceC6835l() { // from class: xe.L
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.C8472f.c((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65792d = 8;

        private C8472f() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        @Override // Ae.p.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String k(Je.m params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "mac")) {
                return params.b().d("");
            }
            return null;
        }

        public final Je.m e(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            C5969a.b bVar = C5969a.f48518b;
            Object objD = handle.d("mac");
            AbstractC6492s.f(objD);
            C5969a c5969aE = bVar.e((String) objD);
            AbstractC6492s.f(c5969aE);
            return new Je.m(c5969aE);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8472f);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String g(Je.m mVar) {
            return p.a.C0028a.b(this, mVar);
        }

        public int hashCode() {
            return -35011222;
        }

        @Override // Ae.p.a
        public List j() {
            return f65791c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65790b;
        }

        public String toString() {
            return "DeviceEdit";
        }
    }

    /* renamed from: xe.I$g, reason: case insensitive filesystem */
    public static final class C8473g extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final C8473g f65793a = new C8473g();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65794b = "directConsoleConnectionExpl";

        private C8473g() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65794b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8473g);
        }

        public int hashCode() {
            return 2091319735;
        }

        public String toString() {
            return "DirectConsoleConnectionExplanation";
        }
    }

    /* renamed from: xe.I$h, reason: case insensitive filesystem */
    public static final class C8474h extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final C8474h f65795a = new C8474h();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65796b = "signalMapperFloorplan";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65797c = AbstractC3689v.o(AbstractC5507f.a("ssid", new InterfaceC6835l() { // from class: xe.O
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.C8474h.d((C5510i) obj);
            }
        }), AbstractC5507f.a("bssid", new InterfaceC6835l() { // from class: xe.P
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.C8474h.e((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65798d = 8;

        private C8474h() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J d(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            navArgument.b(true);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J e(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            navArgument.b(true);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8474h);
        }

        @Override // Ae.p.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String k(Ye.e params, String argName) {
            C5969a c5969aA;
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "ssid")) {
                e.b bVar = params instanceof e.b ? (e.b) params : null;
                if (bVar != null) {
                    return bVar.a();
                }
                return null;
            }
            if (!AbstractC6492s.d(argName, "bssid")) {
                return null;
            }
            e.a aVar = params instanceof e.a ? (e.a) params : null;
            if (aVar == null || (c5969aA = aVar.a()) == null) {
                return null;
            }
            return c5969aA.d("");
        }

        public final Ye.e g(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            String str = (String) handle.d("ssid");
            if (str != null) {
                return new e.b(str);
            }
            String str2 = (String) handle.d("bssid");
            if (str2 == null) {
                throw new IllegalStateException("invalid params");
            }
            C5969a c5969aE = C5969a.f48518b.e(str2);
            AbstractC6492s.f(c5969aE);
            return new e.a(c5969aE);
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public String i(Ye.e eVar) {
            return p.a.C0028a.b(this, eVar);
        }

        public int hashCode() {
            return -1737866229;
        }

        @Override // Ae.p.a
        public List j() {
            return f65797c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65796b;
        }

        public String toString() {
            return "Floorplan";
        }
    }

    public static final class i extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f65799a = new i();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65800b = "signalMapperFloorplanDelete";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65801c = AbstractC3689v.e(AbstractC5507f.a("id", new InterfaceC6835l() { // from class: xe.Q
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.i.c((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65802d = 8;

        private i() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46671h);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        @Override // Ae.p.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String k(Ve.a params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "id")) {
                return String.valueOf(params.a());
            }
            return null;
        }

        public final Ve.a e(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            Object objD = handle.d("id");
            AbstractC6492s.f(objD);
            return new Ve.a(((Number) objD).longValue());
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String g(Ve.a aVar) {
            return p.a.C0028a.b(this, aVar);
        }

        public int hashCode() {
            return 139936150;
        }

        @Override // Ae.p.a
        public List j() {
            return f65801c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65800b;
        }

        public String toString() {
            return "FloorplanDelete";
        }
    }

    /* renamed from: xe.I$j, reason: case insensitive filesystem */
    public static final class C8475j extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final C8475j f65803a = new C8475j();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65804b = "signalMapperFloorplanDetail";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65805c = AbstractC3689v.e(AbstractC5507f.a("id", new InterfaceC6835l() { // from class: xe.S
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.C8475j.c((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65806d = 8;

        private C8475j() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46671h);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        @Override // Ae.p.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String k(We.a params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "id")) {
                return String.valueOf(params.a());
            }
            return null;
        }

        public final We.a e(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            Object objD = handle.d("id");
            AbstractC6492s.f(objD);
            return new We.a(((Number) objD).longValue());
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8475j);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String g(We.a aVar) {
            return p.a.C0028a.b(this, aVar);
        }

        public int hashCode() {
            return 140170300;
        }

        @Override // Ae.p.a
        public List j() {
            return f65805c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65804b;
        }

        public String toString() {
            return "FloorplanDetail";
        }
    }

    /* renamed from: xe.I$k, reason: case insensitive filesystem */
    public static final class C8476k extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final C8476k f65807a = new C8476k();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65808b = "signalMapperFloorplanSave";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65809c = AbstractC3689v.e(AbstractC5507f.a("id", new InterfaceC6835l() { // from class: xe.T
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.C8476k.c((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65810d = 8;

        private C8476k() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46671h);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        @Override // Ae.p.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String k(Xe.a params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "id")) {
                return String.valueOf(params.a());
            }
            return null;
        }

        public final Xe.a e(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            Object objD = handle.d("id");
            AbstractC6492s.f(objD);
            return new Xe.a(((Number) objD).longValue());
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8476k);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String g(Xe.a aVar) {
            return p.a.C0028a.b(this, aVar);
        }

        public int hashCode() {
            return 308968488;
        }

        @Override // Ae.p.a
        public List j() {
            return f65809c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65808b;
        }

        public String toString() {
            return "FloorplanSave";
        }
    }

    /* renamed from: xe.I$l, reason: case insensitive filesystem */
    public static final class C8477l extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final C8477l f65811a = new C8477l();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65812b = "ispDetail";

        private C8477l() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65812b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8477l);
        }

        public int hashCode() {
            return 389028685;
        }

        public String toString() {
            return "IspDetail";
        }
    }

    /* renamed from: xe.I$m, reason: case insensitive filesystem */
    public static final class C8478m extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final C8478m f65813a = new C8478m();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65814b = "networkHosts";

        private C8478m() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65814b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8478m);
        }

        public int hashCode() {
            return 2017013671;
        }

        public String toString() {
            return "NetworkHosts";
        }
    }

    /* renamed from: xe.I$n, reason: case insensitive filesystem */
    public static final class C8479n extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final C8479n f65815a = new C8479n();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65816b = "networkHostsAdd";

        private C8479n() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65816b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8479n);
        }

        public int hashCode() {
            return -2033099910;
        }

        public String toString() {
            return "NetworkHostsAdd";
        }
    }

    /* renamed from: xe.I$o, reason: case insensitive filesystem */
    public static final class C8480o extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final C8480o f65817a = new C8480o();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65818b = "permissionExplanation";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65819c = AbstractC3689v.e(AbstractC5507f.a("type", new InterfaceC6835l() { // from class: xe.U
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.C8480o.c((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65820d = 8;

        private C8480o() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        @Override // Ae.p.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String k(Oe.a params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "type")) {
                return params.name();
            }
            return null;
        }

        public final Oe.a e(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            Object objD = handle.d("type");
            AbstractC6492s.f(objD);
            return Oe.a.valueOf((String) objD);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8480o);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String g(Oe.a aVar) {
            return p.a.C0028a.b(this, aVar);
        }

        public int hashCode() {
            return 271594144;
        }

        @Override // Ae.p.a
        public List j() {
            return f65819c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65818b;
        }

        public String toString() {
            return "PermissionExplanation";
        }
    }

    /* renamed from: xe.I$p, reason: case insensitive filesystem */
    public static final class C8481p extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final C8481p f65821a = new C8481p();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65822b = "root";

        private C8481p() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65822b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8481p);
        }

        public int hashCode() {
            return -1576069044;
        }

        public String toString() {
            return "Root";
        }
    }

    /* renamed from: xe.I$q, reason: case insensitive filesystem */
    public static final class C8482q extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final C8482q f65823a = new C8482q();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65824b = "ssoAccountLogout";

        private C8482q() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65824b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8482q);
        }

        public int hashCode() {
            return -920402766;
        }

        public String toString() {
            return "SSOAccountLogout";
        }
    }

    /* renamed from: xe.I$r, reason: case insensitive filesystem */
    public static final class C8483r extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final C8483r f65825a = new C8483r();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65826b = "ssoAccountPicker";

        private C8483r() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65826b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C8483r);
        }

        public int hashCode() {
            return -811550794;
        }

        public String toString() {
            return "SSOAccountPicker";
        }
    }

    public static final class s extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final s f65827a = new s();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65828b = "ssoAccountSettings";

        private s() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65828b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public int hashCode() {
            return -337690293;
        }

        public String toString() {
            return "SSOAccountSettings";
        }
    }

    public static final class t extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final t f65829a = new t();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65830b = "settings";

        private t() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65830b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public int hashCode() {
            return -1198616947;
        }

        public String toString() {
            return "Settings";
        }
    }

    public static final class u extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final u f65831a = new u();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65832b = "signalApComparisonConfig";

        private u() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65832b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public int hashCode() {
            return 1525289516;
        }

        public String toString() {
            return "SignalApComparisonConfig";
        }
    }

    public static final class v extends I implements p.b {

        /* renamed from: a, reason: collision with root package name */
        public static final v f65833a = new v();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65834b = "signalMapperPlaceAdd";

        private v() {
            super(null);
        }

        @Override // Ae.p
        public String a() {
            return f65834b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof v);
        }

        public int hashCode() {
            return 1597127628;
        }

        public String toString() {
            return "SignalPlaceAdd";
        }
    }

    public static final class w extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final w f65835a = new w();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65836b = "signalMapperPlaceDetail";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65837c = AbstractC3689v.e(AbstractC5507f.a("id", new InterfaceC6835l() { // from class: xe.V
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.w.c((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65838d = 8;

        private w() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        @Override // Ae.p.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String k(com.ui.wifiman.ui.signal.D params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "id")) {
                return params.a();
            }
            return null;
        }

        public final com.ui.wifiman.ui.signal.D e(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            Object objD = handle.d("id");
            AbstractC6492s.f(objD);
            return new com.ui.wifiman.ui.signal.D((String) objD);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String g(com.ui.wifiman.ui.signal.D d10) {
            return p.a.C0028a.b(this, d10);
        }

        public int hashCode() {
            return 468844870;
        }

        @Override // Ae.p.a
        public List j() {
            return f65837c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65836b;
        }

        public String toString() {
            return "SignalPlaceDetail";
        }
    }

    public static final class x extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final x f65839a = new x();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65840b = "speedFactorExplanation";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65841c = AbstractC3689v.e(AbstractC5507f.a("topic", new InterfaceC6835l() { // from class: xe.W
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.x.c((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65842d = 8;

        private x() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        @Override // Ae.p.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String k(AbstractC5460b params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (!AbstractC6492s.d(argName, "topic")) {
                return null;
            }
            if (params instanceof AbstractC5460b.AbstractC1746b.C1747b) {
                return "wifi_overall";
            }
            if (params instanceof AbstractC5460b.AbstractC1746b.d) {
                return "wifi_spectrum";
            }
            if (params instanceof AbstractC5460b.AbstractC1746b.c) {
                return "wifi_radio_capability";
            }
            if (params instanceof AbstractC5460b.AbstractC1746b.a) {
                return "wifi_channel_health";
            }
            if (params instanceof AbstractC5460b.a.C1745a) {
                return "cellular_signal";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        public final AbstractC5460b e(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            String str = (String) handle.d("topic");
            if (str != null) {
                switch (str.hashCode()) {
                    case -1309800675:
                        if (str.equals("cellular_signal")) {
                            return AbstractC5460b.a.C1745a.f46389b;
                        }
                        break;
                    case -4293758:
                        if (str.equals("wifi_channel_health")) {
                            return AbstractC5460b.AbstractC1746b.a.f46390b;
                        }
                        break;
                    case 307020219:
                        if (str.equals("wifi_spectrum")) {
                            return AbstractC5460b.AbstractC1746b.d.f46393b;
                        }
                        break;
                    case 372870435:
                        if (str.equals("wifi_overall")) {
                            return AbstractC5460b.AbstractC1746b.C1747b.f46391b;
                        }
                        break;
                    case 1390726086:
                        if (str.equals("wifi_radio_capability")) {
                            return AbstractC5460b.AbstractC1746b.c.f46392b;
                        }
                        break;
                }
            }
            throw new IllegalStateException("invalid param");
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof x);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String g(AbstractC5460b abstractC5460b) {
            return p.a.C0028a.b(this, abstractC5460b);
        }

        public int hashCode() {
            return -571342559;
        }

        @Override // Ae.p.a
        public List j() {
            return f65841c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65840b;
        }

        public String toString() {
            return "SpeedFactorExplanationDestination";
        }
    }

    public static final class y extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final y f65843a = new y();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65844b = "speedtest";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65845c = AbstractC3689v.o(AbstractC5507f.a("type", new InterfaceC6835l() { // from class: xe.X
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.y.g((C5510i) obj);
            }
        }), AbstractC5507f.a("host", new InterfaceC6835l() { // from class: xe.Y
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.y.h((C5510i) obj);
            }
        }), AbstractC5507f.a("port", new InterfaceC6835l() { // from class: xe.Z
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.y.i((C5510i) obj);
            }
        }), AbstractC5507f.a("name", new InterfaceC6835l() { // from class: xe.a0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.y.m((C5510i) obj);
            }
        }), AbstractC5507f.a("model", new InterfaceC6835l() { // from class: xe.b0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.y.n((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65846d = 8;

        private y() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J g(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J h(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            navArgument.b(true);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J i(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            navArgument.b(true);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J m(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            navArgument.b(true);
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J n(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            navArgument.b(true);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public int hashCode() {
            return -1667873745;
        }

        @Override // Ae.p.a
        public List j() {
            return f65845c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65844b;
        }

        @Override // Ae.p.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public String k(nf.e params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            switch (argName.hashCode()) {
                case 3208616:
                    if (!argName.equals("host") || (params instanceof e.c)) {
                        return null;
                    }
                    if (params instanceof e.d) {
                        return ((e.d) params).a().toString();
                    }
                    if (params instanceof e.a) {
                        return ((e.a) params).a().toString();
                    }
                    if (params instanceof e.b) {
                        return ((e.b) params).b().toString();
                    }
                    throw new NoWhenBranchMatchedException();
                case 3373707:
                    if (!argName.equals("name") || (params instanceof e.c) || (params instanceof e.d)) {
                        return null;
                    }
                    if (params instanceof e.b) {
                        return ((e.b) params).a();
                    }
                    if (params instanceof e.a) {
                        return ((e.a) params).c();
                    }
                    throw new NoWhenBranchMatchedException();
                case 3446913:
                    if (!argName.equals("port") || (params instanceof e.c) || (params instanceof e.d) || (params instanceof e.b)) {
                        return null;
                    }
                    if (params instanceof e.a) {
                        return String.valueOf(((e.a) params).d());
                    }
                    throw new NoWhenBranchMatchedException();
                case 3575610:
                    if (!argName.equals("type")) {
                        return null;
                    }
                    if (params instanceof e.c) {
                        return "internet";
                    }
                    if (params instanceof e.d) {
                        return "direct";
                    }
                    if (params instanceof e.a) {
                        return "app2app";
                    }
                    if (params instanceof e.b) {
                        return "combined";
                    }
                    throw new NoWhenBranchMatchedException();
                case 104069929:
                    if (!argName.equals("model") || (params instanceof e.c) || (params instanceof e.d) || (params instanceof e.b)) {
                        return null;
                    }
                    if (params instanceof e.a) {
                        return ((e.a) params).b();
                    }
                    throw new NoWhenBranchMatchedException();
                default:
                    return null;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        public final nf.e p(androidx.lifecycle.E handle) throws NumberFormatException {
            nf.e dVar;
            AbstractC6492s.i(handle, "handle");
            String str = (String) handle.d("type");
            if (str != null) {
                switch (str.hashCode()) {
                    case -1331586071:
                        if (str.equals("direct")) {
                            Object objD = handle.d("host");
                            AbstractC6492s.f(objD);
                            inet.ipaddr.g gVarP = new inet.ipaddr.n((String) objD).p();
                            AbstractC6492s.h(gVarP, "toAddress(...)");
                            dVar = new e.d(gVarP);
                            return dVar;
                        }
                        break;
                    case -794970544:
                        if (str.equals("app2app")) {
                            Object objD2 = handle.d("host");
                            AbstractC6492s.f(objD2);
                            inet.ipaddr.g gVarP2 = new inet.ipaddr.n((String) objD2).p();
                            AbstractC6492s.h(gVarP2, "toAddress(...)");
                            Object objD3 = handle.d("port");
                            AbstractC6492s.f(objD3);
                            int i10 = Integer.parseInt((String) objD3);
                            Object objD4 = handle.d("name");
                            AbstractC6492s.f(objD4);
                            Object objD5 = handle.d("model");
                            AbstractC6492s.f(objD5);
                            dVar = new e.a(gVarP2, i10, (String) objD4, (String) objD5);
                            return dVar;
                        }
                        break;
                    case -612455675:
                        if (str.equals("combined")) {
                            Object objD6 = handle.d("host");
                            AbstractC6492s.f(objD6);
                            inet.ipaddr.g gVarP3 = new inet.ipaddr.n((String) objD6).p();
                            AbstractC6492s.h(gVarP3, "toAddress(...)");
                            Object objD7 = handle.d("name");
                            AbstractC6492s.f(objD7);
                            dVar = new e.b(gVarP3, (String) objD7);
                            return dVar;
                        }
                        break;
                    case 570410817:
                        if (str.equals("internet")) {
                            return e.c.f54652a;
                        }
                        break;
                }
            }
            throw new IllegalStateException("Invalid params");
        }

        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public String q(nf.e eVar) {
            return p.a.C0028a.b(this, eVar);
        }

        public String toString() {
            return "Speedtest";
        }
    }

    public static final class z extends I implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public static final z f65847a = new z();

        /* renamed from: b, reason: collision with root package name */
        private static final String f65848b = "speedtestError";

        /* renamed from: c, reason: collision with root package name */
        private static final List f65849c = AbstractC3689v.e(AbstractC5507f.a("type", new InterfaceC6835l() { // from class: xe.c0
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.z.c((C5510i) obj);
            }
        }));

        /* renamed from: d, reason: collision with root package name */
        public static final int f65850d = 8;

        private z() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(C5510i navArgument) {
            AbstractC6492s.i(navArgument, "$this$navArgument");
            navArgument.c(AbstractC5496B.f46680q);
            return Yg.J.f24997a;
        }

        @Override // Ae.p
        public String a() {
            return p.a.C0028a.a(this);
        }

        @Override // Ae.p.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String k(C6148a params, String argName) {
            AbstractC6492s.i(params, "params");
            AbstractC6492s.i(argName, "argName");
            if (AbstractC6492s.d(argName, "type")) {
                return params.b().toString();
            }
            return null;
        }

        public final C6148a e(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            Object objD = handle.d("type");
            AbstractC6492s.f(objD);
            return new C6148a(EnumC5821b.valueOf((String) objD));
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof z);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String g(C6148a c6148a) {
            return p.a.C0028a.b(this, c6148a);
        }

        public int hashCode() {
            return 787079961;
        }

        @Override // Ae.p.a
        public List j() {
            return f65849c;
        }

        @Override // Ae.p.a
        public String l() {
            return f65848b;
        }

        public String toString() {
            return "SpeedtestError";
        }
    }

    public /* synthetic */ I(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private I() {
    }
}
