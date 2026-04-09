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
import lb.Gateway;
import lb.Iot;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002 #BM\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b#\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b \u0010)R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010)¨\u0006-"}, d2 = {"Llb/o;", "", "", "seen0", "", "region", "accountId", "Llb/f;", "iot", "Llb/e;", "apiGateway", "apiGatewayUI", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Llb/f;Llb/e;Llb/e;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_COMMUNITY, "(Llb/o;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getRegion", SnmpConfigurator.O_BIND_ADDRESS, "getAccountId", "Llb/f;", "()Llb/f;", "d", "Llb/e;", "()Llb/e;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getApiGatewayUI", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lb.o, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class UnifiCloudAccess {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String region;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Iot iot;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Gateway apiGateway;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Gateway apiGatewayUI;

    /* renamed from: lb.o$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f52521a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f52521a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.UnifiCloudAccess", aVar, 5);
            h02.p("region", false);
            h02.p("accountId", false);
            h02.p("iot", false);
            h02.p("apiGateway", false);
            h02.p("apiGatewayUI", false);
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
            Gateway.a aVar = Gateway.a.f52491a;
            return new Vi.b[]{w02, w02, Iot.a.f52497a, aVar, aVar};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final UnifiCloudAccess c(Yi.e decoder) {
            int i10;
            String str;
            String str2;
            Iot fVar;
            Gateway gateway;
            Gateway gateway2;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar2 = descriptor;
            Yi.c cVarC = decoder.c(fVar2);
            String strW = null;
            if (cVarC.B()) {
                String strW2 = cVarC.w(fVar2, 0);
                String strW3 = cVarC.w(fVar2, 1);
                Iot fVar3 = (Iot) cVarC.p(fVar2, 2, Iot.a.f52497a, null);
                Gateway.a aVar = Gateway.a.f52491a;
                str = strW2;
                gateway = (Gateway) cVarC.p(fVar2, 3, aVar, null);
                gateway2 = (Gateway) cVarC.p(fVar2, 4, aVar, null);
                fVar = fVar3;
                str2 = strW3;
                i10 = 31;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String strW4 = null;
                Iot fVar4 = null;
                Gateway gateway3 = null;
                Gateway gateway4 = null;
                while (z10) {
                    int iK = cVarC.k(fVar2);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        strW = cVarC.w(fVar2, 0);
                        i11 |= 1;
                    } else if (iK == 1) {
                        strW4 = cVarC.w(fVar2, 1);
                        i11 |= 2;
                    } else if (iK == 2) {
                        fVar4 = (Iot) cVarC.p(fVar2, 2, Iot.a.f52497a, fVar4);
                        i11 |= 4;
                    } else if (iK == 3) {
                        gateway3 = (Gateway) cVarC.p(fVar2, 3, Gateway.a.f52491a, gateway3);
                        i11 |= 8;
                    } else {
                        if (iK != 4) {
                            throw new UnknownFieldException(iK);
                        }
                        gateway4 = (Gateway) cVarC.p(fVar2, 4, Gateway.a.f52491a, gateway4);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                str = strW;
                str2 = strW4;
                fVar = fVar4;
                gateway = gateway3;
                gateway2 = gateway4;
            }
            cVarC.b(fVar2);
            return new UnifiCloudAccess(i10, str, str2, fVar, gateway, gateway2, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, UnifiCloudAccess value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            UnifiCloudAccess.c(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: lb.o$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f52521a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UnifiCloudAccess(int i10, String str, String str2, Iot fVar, Gateway gateway, Gateway gateway2, R0 r02) {
        if (31 != (i10 & 31)) {
            C0.a(i10, 31, a.f52521a.a());
        }
        this.region = str;
        this.accountId = str2;
        this.iot = fVar;
        this.apiGateway = gateway;
        this.apiGatewayUI = gateway2;
    }

    public static final /* synthetic */ void c(UnifiCloudAccess self, Yi.d output, Xi.f serialDesc) {
        output.y(serialDesc, 0, self.region);
        output.y(serialDesc, 1, self.accountId);
        output.q(serialDesc, 2, Iot.a.f52497a, self.iot);
        Gateway.a aVar = Gateway.a.f52491a;
        output.q(serialDesc, 3, aVar, self.apiGateway);
        output.q(serialDesc, 4, aVar, self.apiGatewayUI);
    }

    /* renamed from: a, reason: from getter */
    public final Gateway getApiGateway() {
        return this.apiGateway;
    }

    /* renamed from: b, reason: from getter */
    public final Iot getIot() {
        return this.iot;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiCloudAccess)) {
            return false;
        }
        UnifiCloudAccess unifiCloudAccess = (UnifiCloudAccess) other;
        return AbstractC6492s.d(this.region, unifiCloudAccess.region) && AbstractC6492s.d(this.accountId, unifiCloudAccess.accountId) && AbstractC6492s.d(this.iot, unifiCloudAccess.iot) && AbstractC6492s.d(this.apiGateway, unifiCloudAccess.apiGateway) && AbstractC6492s.d(this.apiGatewayUI, unifiCloudAccess.apiGatewayUI);
    }

    public int hashCode() {
        return (((((((this.region.hashCode() * 31) + this.accountId.hashCode()) * 31) + this.iot.hashCode()) * 31) + this.apiGateway.hashCode()) * 31) + this.apiGatewayUI.hashCode();
    }

    public String toString() {
        return "UnifiCloudAccess(region=" + this.region + ", accountId=" + this.accountId + ", iot=" + this.iot + ", apiGateway=" + this.apiGateway + ", apiGatewayUI=" + this.apiGatewayUI + ")";
    }
}
