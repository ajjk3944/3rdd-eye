package lb;

import Zi.C0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002\u001e\u0014BM\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0017¨\u0006("}, d2 = {"Llb/f;", "", "", "seen0", "", "host", "sitesListTop", "pingTopic", "credentialsProvider", "deviceRole", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(Llb/f;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getSitesListTop", SnmpConfigurator.O_COMMUNITY, "getPingTopic", "d", "getCredentialsProvider", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getDeviceRole", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lb.f, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class Iot {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String host;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sitesListTop;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pingTopic;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String credentialsProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceRole;

    /* renamed from: lb.f$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f52497a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f52497a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.Iot", aVar, 5);
            h02.p("host", false);
            h02.p("sitesListTop", true);
            h02.p("pingTopic", false);
            h02.p("credentialsProvider", false);
            h02.p("deviceRole", false);
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
            W0 w02 = W0.f25599a;
            return new Vi.b[]{w02, Wi.a.u(w02), w02, w02, w02};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Iot c(Yi.e decoder) {
            int i10;
            String str;
            String str2;
            String str3;
            String strW;
            String strW2;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            String strW3 = null;
            if (cVarC.B()) {
                String strW4 = cVarC.w(fVar, 0);
                String str4 = (String) cVarC.h(fVar, 1, W0.f25599a, null);
                String strW5 = cVarC.w(fVar, 2);
                str = strW4;
                strW = cVarC.w(fVar, 3);
                strW2 = cVarC.w(fVar, 4);
                str3 = strW5;
                str2 = str4;
                i10 = 31;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str5 = null;
                String strW6 = null;
                String strW7 = null;
                String strW8 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        strW3 = cVarC.w(fVar, 0);
                        i11 |= 1;
                    } else if (iK == 1) {
                        str5 = (String) cVarC.h(fVar, 1, W0.f25599a, str5);
                        i11 |= 2;
                    } else if (iK == 2) {
                        strW6 = cVarC.w(fVar, 2);
                        i11 |= 4;
                    } else if (iK == 3) {
                        strW7 = cVarC.w(fVar, 3);
                        i11 |= 8;
                    } else {
                        if (iK != 4) {
                            throw new UnknownFieldException(iK);
                        }
                        strW8 = cVarC.w(fVar, 4);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                str = strW3;
                str2 = str5;
                str3 = strW6;
                strW = strW7;
                strW2 = strW8;
            }
            cVarC.b(fVar);
            return new Iot(i10, str, str2, str3, strW, strW2, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, Iot value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            Iot.b(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: lb.f$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f52497a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Iot(int i10, String str, String str2, String str3, String str4, String str5, R0 r02) {
        if (29 != (i10 & 29)) {
            C0.a(i10, 29, a.f52497a.a());
        }
        this.host = str;
        if ((i10 & 2) == 0) {
            this.sitesListTop = null;
        } else {
            this.sitesListTop = str2;
        }
        this.pingTopic = str3;
        this.credentialsProvider = str4;
        this.deviceRole = str5;
    }

    public static final /* synthetic */ void b(Iot self, Yi.d output, Xi.f serialDesc) {
        output.y(serialDesc, 0, self.host);
        if (output.o(serialDesc, 1) || self.sitesListTop != null) {
            output.t(serialDesc, 1, W0.f25599a, self.sitesListTop);
        }
        output.y(serialDesc, 2, self.pingTopic);
        output.y(serialDesc, 3, self.credentialsProvider);
        output.y(serialDesc, 4, self.deviceRole);
    }

    /* renamed from: a, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Iot)) {
            return false;
        }
        Iot iot = (Iot) other;
        return AbstractC6492s.d(this.host, iot.host) && AbstractC6492s.d(this.sitesListTop, iot.sitesListTop) && AbstractC6492s.d(this.pingTopic, iot.pingTopic) && AbstractC6492s.d(this.credentialsProvider, iot.credentialsProvider) && AbstractC6492s.d(this.deviceRole, iot.deviceRole);
    }

    public int hashCode() {
        int iHashCode = this.host.hashCode() * 31;
        String str = this.sitesListTop;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.pingTopic.hashCode()) * 31) + this.credentialsProvider.hashCode()) * 31) + this.deviceRole.hashCode();
    }

    public String toString() {
        return "Iot(host=" + this.host + ", sitesListTop=" + this.sitesListTop + ", pingTopic=" + this.pingTopic + ", credentialsProvider=" + this.credentialsProvider + ", deviceRole=" + this.deviceRole + ")";
    }
}
