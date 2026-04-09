package nb;

import Vi.n;
import Zi.C0;
import Zi.C3704f;
import Zi.C3710i;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import nb.C6921d;
import org.snmp4j.util.SnmpConfigurator;

@n
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002\u001c BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eBe\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b%\u0010\u001f¨\u0006,"}, d2 = {"Lnb/h;", "Lnb/e;", "", "offer", "", "Lnb/d;", "iceServers", "client", "clientVersion", "os", "", "useTrickle", "event", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "f", "(Lnb/h;LYi/d;LXi/f;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getOffer", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/util/List;", "getIceServers", "()Ljava/util/List;", SnmpConfigurator.O_COMMUNITY, "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Z", "getUseTrickle", "()Z", "g", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends AbstractC6922e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Vi.b[] f54535h = {null, new C3704f(C6921d.a.f54531a), null, null, null, null, null};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String offer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List iceServers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String client;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String clientVersion;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String os;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean useTrickle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String event;

    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f54543a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f54543a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.mqtt.OfferRequest", aVar, 7);
            h02.p("offer", false);
            h02.p("iceServers", false);
            h02.p("client", false);
            h02.p("clientVersion", false);
            h02.p("os", false);
            h02.p("useTrickle", true);
            h02.p("event", true);
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
            Vi.b bVar = h.f54535h[1];
            W0 w02 = W0.f25599a;
            return new Vi.b[]{w02, bVar, w02, w02, w02, C3710i.f25639a, w02};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final h c(Yi.e decoder) {
            boolean z10;
            int i10;
            String str;
            List list;
            String str2;
            String str3;
            String str4;
            String strW;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = h.f54535h;
            if (cVarC.B()) {
                String strW2 = cVarC.w(fVar, 0);
                List list2 = (List) cVarC.p(fVar, 1, bVarArr[1], null);
                String strW3 = cVarC.w(fVar, 2);
                String strW4 = cVarC.w(fVar, 3);
                String strW5 = cVarC.w(fVar, 4);
                boolean zU = cVarC.u(fVar, 5);
                list = list2;
                str = strW2;
                strW = cVarC.w(fVar, 6);
                z10 = zU;
                str3 = strW4;
                str4 = strW5;
                str2 = strW3;
                i10 = 127;
            } else {
                boolean z11 = true;
                boolean zU2 = false;
                String strW6 = null;
                List list3 = null;
                String strW7 = null;
                String strW8 = null;
                String strW9 = null;
                String strW10 = null;
                int i11 = 0;
                while (z11) {
                    int iK = cVarC.k(fVar);
                    switch (iK) {
                        case -1:
                            z11 = false;
                            continue;
                        case 0:
                            strW6 = cVarC.w(fVar, 0);
                            i11 |= 1;
                            continue;
                        case 1:
                            list3 = (List) cVarC.p(fVar, 1, bVarArr[1], list3);
                            i11 |= 2;
                            break;
                        case 2:
                            strW7 = cVarC.w(fVar, 2);
                            i11 |= 4;
                            break;
                        case 3:
                            strW8 = cVarC.w(fVar, 3);
                            i11 |= 8;
                            break;
                        case 4:
                            strW9 = cVarC.w(fVar, 4);
                            i11 |= 16;
                            break;
                        case 5:
                            zU2 = cVarC.u(fVar, 5);
                            i11 |= 32;
                            break;
                        case 6:
                            strW10 = cVarC.w(fVar, 6);
                            i11 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iK);
                    }
                }
                z10 = zU2;
                i10 = i11;
                str = strW6;
                list = list3;
                str2 = strW7;
                str3 = strW8;
                str4 = strW9;
                strW = strW10;
            }
            cVarC.b(fVar);
            return new h(i10, str, list, str2, str3, str4, z10, strW, (R0) null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, h value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            h.f(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: nb.h$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f54543a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ h(int i10, String str, List list, String str2, String str3, String str4, boolean z10, String str5, R0 r02) {
        if (31 != (i10 & 31)) {
            C0.a(i10, 31, a.f54543a.a());
        }
        this.offer = str;
        this.iceServers = list;
        this.client = str2;
        this.clientVersion = str3;
        this.os = str4;
        if ((i10 & 32) == 0) {
            this.useTrickle = false;
        } else {
            this.useTrickle = z10;
        }
        if ((i10 & 64) == 0) {
            this.event = "offer";
        } else {
            this.event = str5;
        }
    }

    public static final /* synthetic */ void f(h self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f54535h;
        output.y(serialDesc, 0, self.offer);
        output.q(serialDesc, 1, bVarArr[1], self.iceServers);
        output.y(serialDesc, 2, self.getClient());
        output.y(serialDesc, 3, self.getClientVersion());
        output.y(serialDesc, 4, self.getOs());
        if (output.o(serialDesc, 5) || self.useTrickle) {
            output.i(serialDesc, 5, self.useTrickle);
        }
        if (!output.o(serialDesc, 6) && AbstractC6492s.d(self.getEvent(), "offer")) {
            return;
        }
        output.y(serialDesc, 6, self.getEvent());
    }

    /* renamed from: b, reason: from getter */
    public String getClient() {
        return this.client;
    }

    /* renamed from: c, reason: from getter */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /* renamed from: d, reason: from getter */
    public String getEvent() {
        return this.event;
    }

    /* renamed from: e, reason: from getter */
    public String getOs() {
        return this.os;
    }

    public /* synthetic */ h(String str, List list, String str2, String str3, String str4, boolean z10, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2, str3, str4, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? "offer" : str5);
    }

    public h(String offer, List iceServers, String client, String clientVersion, String os, boolean z10, String event) {
        AbstractC6492s.i(offer, "offer");
        AbstractC6492s.i(iceServers, "iceServers");
        AbstractC6492s.i(client, "client");
        AbstractC6492s.i(clientVersion, "clientVersion");
        AbstractC6492s.i(os, "os");
        AbstractC6492s.i(event, "event");
        this.offer = offer;
        this.iceServers = iceServers;
        this.client = client;
        this.clientVersion = clientVersion;
        this.os = os;
        this.useTrickle = z10;
        this.event = event;
    }
}
