package gb;

import Zi.C0;
import Zi.C3704f;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import gb.Apps;
import gb.C5891g;
import gb.C5892h;
import gb.UnadoptedOsDevicesSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import mb.Hardware;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 G2\u00020\u0001:\u0002\u001b!BS\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010 \u001a\u0004\b#\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010&\u0012\u0004\b)\u0010 \u001a\u0004\b'\u0010(R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010 \u001a\u0004\b,\u0010-R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010 \u001a\u0004\b1\u00102R\u0013\u00104\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b*\u0010\u001eR\u0013\u00106\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b5\u0010\u001eR\u0013\u00108\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b7\u0010\u001eR\u0013\u0010:\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b9\u0010\u001eR\u0013\u0010>\u001a\u0004\u0018\u00010;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0013\u0010?\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u0013\u0010C\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010F\u001a\u0004\u0018\u00010D8F¢\u0006\u0006\u001a\u0004\b/\u0010E¨\u0006H"}, d2 = {"Lgb/l;", "", "", "seen0", "", "type", "Lgb/b;", "apps", "Lgb/g;", "settings", "Lgb/h;", "system", "", "Lgb/o;", "unadoptedUnifiOSDevices", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lgb/b;Lgb/g;Lgb/h;Ljava/util/List;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "m", "(Lgb/l;LYi/d;LXi/f;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getType$annotations", "()V", SnmpConfigurator.O_BIND_ADDRESS, "Lgb/b;", SnmpConfigurator.O_COMMUNITY, "()Lgb/b;", "getApps$annotations", "Lgb/g;", "getSettings", "()Lgb/g;", "getSettings$annotations", "d", "Lgb/h;", "j", "()Lgb/h;", "getSystem$annotations", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/util/List;", "l", "()Ljava/util/List;", "getUnadoptedUnifiOSDevices$annotations", "deviceId", "i", "name", "k", "timeZone", "h", "mac", "Lmb/p;", "f", "()Lmb/p;", "hardware", "anonymousDeviceId", "Lgb/p;", "g", "()Lgb/p;", "latestUpdate", "Lmb/m;", "()Lmb/m;", "deviceState", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Vi.b[] f47803f = {null, null, null, null, new C3704f(UnadoptedOsDevicesSource.a.f47827a)};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Apps apps;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C5891g settings;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C5892h system;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List unadoptedUnifiOSDevices;

    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f47809a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f47809a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.client.http.models.SystemInfoUpdate", aVar, 5);
            h02.p("type", false);
            h02.p("apps", true);
            h02.p("settings", true);
            h02.p("system", true);
            h02.p("unadoptedUnifiOSDevices", true);
            descriptor = h02;
        }

        private a() {
        }

        @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
        public final Xi.f a() {
            return descriptor;
        }

        @Override // Zi.M
        public final Vi.b[] d() {
            return new Vi.b[]{W0.f25599a, Wi.a.u(Apps.a.f47762a), Wi.a.u(C5891g.a.f47781a), Wi.a.u(C5892h.a.f47785a), Wi.a.u(l.f47803f[4])};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final l c(Yi.e decoder) {
            int i10;
            String str;
            Apps apps;
            C5891g c5891g;
            C5892h c5892h;
            List list;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = l.f47803f;
            String strW = null;
            if (cVarC.B()) {
                String strW2 = cVarC.w(fVar, 0);
                Apps apps2 = (Apps) cVarC.h(fVar, 1, Apps.a.f47762a, null);
                C5891g c5891g2 = (C5891g) cVarC.h(fVar, 2, C5891g.a.f47781a, null);
                C5892h c5892h2 = (C5892h) cVarC.h(fVar, 3, C5892h.a.f47785a, null);
                list = (List) cVarC.h(fVar, 4, bVarArr[4], null);
                str = strW2;
                c5892h = c5892h2;
                c5891g = c5891g2;
                i10 = 31;
                apps = apps2;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Apps apps3 = null;
                C5891g c5891g3 = null;
                C5892h c5892h3 = null;
                List list2 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        strW = cVarC.w(fVar, 0);
                        i11 |= 1;
                    } else if (iK == 1) {
                        apps3 = (Apps) cVarC.h(fVar, 1, Apps.a.f47762a, apps3);
                        i11 |= 2;
                    } else if (iK == 2) {
                        c5891g3 = (C5891g) cVarC.h(fVar, 2, C5891g.a.f47781a, c5891g3);
                        i11 |= 4;
                    } else if (iK == 3) {
                        c5892h3 = (C5892h) cVarC.h(fVar, 3, C5892h.a.f47785a, c5892h3);
                        i11 |= 8;
                    } else {
                        if (iK != 4) {
                            throw new UnknownFieldException(iK);
                        }
                        list2 = (List) cVarC.h(fVar, 4, bVarArr[4], list2);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                str = strW;
                apps = apps3;
                c5891g = c5891g3;
                c5892h = c5892h3;
                list = list2;
            }
            cVarC.b(fVar);
            return new l(i10, str, apps, c5891g, c5892h, list, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, l value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            l.m(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: gb.l$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f47809a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ l(int i10, String str, Apps apps, C5891g c5891g, C5892h c5892h, List list, R0 r02) {
        if (1 != (i10 & 1)) {
            C0.a(i10, 1, a.f47809a.a());
        }
        this.type = str;
        if ((i10 & 2) == 0) {
            this.apps = null;
        } else {
            this.apps = apps;
        }
        if ((i10 & 4) == 0) {
            this.settings = null;
        } else {
            this.settings = c5891g;
        }
        if ((i10 & 8) == 0) {
            this.system = null;
        } else {
            this.system = c5892h;
        }
        if ((i10 & 16) == 0) {
            this.unadoptedUnifiOSDevices = null;
        } else {
            this.unadoptedUnifiOSDevices = list;
        }
    }

    public static final /* synthetic */ void m(l self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f47803f;
        output.y(serialDesc, 0, self.type);
        if (output.o(serialDesc, 1) || self.apps != null) {
            output.t(serialDesc, 1, Apps.a.f47762a, self.apps);
        }
        if (output.o(serialDesc, 2) || self.settings != null) {
            output.t(serialDesc, 2, C5891g.a.f47781a, self.settings);
        }
        if (output.o(serialDesc, 3) || self.system != null) {
            output.t(serialDesc, 3, C5892h.a.f47785a, self.system);
        }
        if (!output.o(serialDesc, 4) && self.unadoptedUnifiOSDevices == null) {
            return;
        }
        output.t(serialDesc, 4, bVarArr[4], self.unadoptedUnifiOSDevices);
    }

    public final String b() {
        C5891g c5891g = this.settings;
        if (c5891g != null) {
            return c5891g.getAnonymousDeviceId();
        }
        return null;
    }

    /* renamed from: c, reason: from getter */
    public final Apps getApps() {
        return this.apps;
    }

    public final String d() {
        C5889e c5889eC;
        C5892h c5892h = this.system;
        if (c5892h == null || (c5889eC = c5892h.getInfo()) == null) {
            return null;
        }
        return c5889eC.getDeviceId();
    }

    public final mb.m e() {
        C5892h c5892h = this.system;
        if (c5892h != null) {
            return c5892h.getDeviceState();
        }
        return null;
    }

    public final Hardware f() {
        C5889e c5889eC;
        C5892h c5892h = this.system;
        if (c5892h == null || (c5889eC = c5892h.getInfo()) == null) {
            return null;
        }
        return c5889eC.getHardware();
    }

    public final Version g() {
        C5889e c5889eC;
        C5892h c5892h = this.system;
        if (c5892h == null || (c5889eC = c5892h.getInfo()) == null) {
            return null;
        }
        return c5889eC.getLatestUpdate();
    }

    public final String h() {
        C5889e c5889eC;
        C5892h c5892h = this.system;
        if (c5892h == null || (c5889eC = c5892h.getInfo()) == null) {
            return null;
        }
        return c5889eC.getMac();
    }

    public final String i() {
        C5891g c5891g = this.settings;
        if (c5891g != null) {
            return c5891g.getName();
        }
        return null;
    }

    /* renamed from: j, reason: from getter */
    public final C5892h getSystem() {
        return this.system;
    }

    public final String k() {
        C5891g c5891g = this.settings;
        if (c5891g != null) {
            return c5891g.getTimeZone();
        }
        return null;
    }

    /* renamed from: l, reason: from getter */
    public final List getUnadoptedUnifiOSDevices() {
        return this.unadoptedUnifiOSDevices;
    }
}
