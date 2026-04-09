package rb;

import Vi.n;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@n
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 12\u00020\u0001:\u0002\u0015#B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\"R(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b#\u0010\u001f\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\"R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\"R(\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b+\u0010\u001f\u0012\u0004\b.\u0010'\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010\u0018¨\u00062"}, d2 = {"Lrb/d;", "", "", "model", "firmwareVersion", "version", "deviceId", "controller", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lrb/d;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getModel", "setModel", "(Ljava/lang/String;)V", SnmpConfigurator.O_BIND_ADDRESS, "getFirmwareVersion", "setFirmwareVersion", "getFirmwareVersion$annotations", "()V", SnmpConfigurator.O_COMMUNITY, "getVersion", "setVersion", "d", "getDeviceId", "setDeviceId", "getDeviceId$annotations", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getController", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rb.d, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class SupportPinTraceMeta {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String model;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String firmwareVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String version;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String deviceId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String controller;

    /* renamed from: rb.d$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60219a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f60219a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.traces.model.SupportPinTraceMeta", aVar, 5);
            h02.p("model", true);
            h02.p("firmware_version", true);
            h02.p("version", true);
            h02.p("anonymous_device_id", true);
            h02.p("controller", true);
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
            return new Vi.b[]{w02, w02, w02, w02, w02};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final SupportPinTraceMeta c(Yi.e decoder) {
            String str;
            String strW;
            String strW2;
            String str2;
            String str3;
            int i10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            if (cVarC.B()) {
                String strW3 = cVarC.w(fVar, 0);
                String strW4 = cVarC.w(fVar, 1);
                String strW5 = cVarC.w(fVar, 2);
                str = strW3;
                strW = cVarC.w(fVar, 3);
                strW2 = cVarC.w(fVar, 4);
                str2 = strW5;
                str3 = strW4;
                i10 = 31;
            } else {
                String strW6 = null;
                String strW7 = null;
                String strW8 = null;
                String strW9 = null;
                String strW10 = null;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        strW6 = cVarC.w(fVar, 0);
                        i11 |= 1;
                    } else if (iK == 1) {
                        strW10 = cVarC.w(fVar, 1);
                        i11 |= 2;
                    } else if (iK == 2) {
                        strW9 = cVarC.w(fVar, 2);
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
                str = strW6;
                strW = strW7;
                strW2 = strW8;
                str2 = strW9;
                str3 = strW10;
                i10 = i11;
            }
            cVarC.b(fVar);
            return new SupportPinTraceMeta(i10, str, str3, str2, strW, strW2, (R0) null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, SupportPinTraceMeta value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            SupportPinTraceMeta.a(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: rb.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f60219a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SupportPinTraceMeta(int i10, String str, String str2, String str3, String str4, String str5, R0 r02) {
        if ((i10 & 1) == 0) {
            this.model = "";
        } else {
            this.model = str;
        }
        if ((i10 & 2) == 0) {
            this.firmwareVersion = "";
        } else {
            this.firmwareVersion = str2;
        }
        if ((i10 & 4) == 0) {
            this.version = "";
        } else {
            this.version = str3;
        }
        if ((i10 & 8) == 0) {
            this.deviceId = "";
        } else {
            this.deviceId = str4;
        }
        if ((i10 & 16) == 0) {
            this.controller = "protect";
        } else {
            this.controller = str5;
        }
    }

    public static final /* synthetic */ void a(SupportPinTraceMeta self, Yi.d output, Xi.f serialDesc) {
        if (output.o(serialDesc, 0) || !AbstractC6492s.d(self.model, "")) {
            output.y(serialDesc, 0, self.model);
        }
        if (output.o(serialDesc, 1) || !AbstractC6492s.d(self.firmwareVersion, "")) {
            output.y(serialDesc, 1, self.firmwareVersion);
        }
        if (output.o(serialDesc, 2) || !AbstractC6492s.d(self.version, "")) {
            output.y(serialDesc, 2, self.version);
        }
        if (output.o(serialDesc, 3) || !AbstractC6492s.d(self.deviceId, "")) {
            output.y(serialDesc, 3, self.deviceId);
        }
        if (!output.o(serialDesc, 4) && AbstractC6492s.d(self.controller, "protect")) {
            return;
        }
        output.y(serialDesc, 4, self.controller);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportPinTraceMeta)) {
            return false;
        }
        SupportPinTraceMeta supportPinTraceMeta = (SupportPinTraceMeta) other;
        return AbstractC6492s.d(this.model, supportPinTraceMeta.model) && AbstractC6492s.d(this.firmwareVersion, supportPinTraceMeta.firmwareVersion) && AbstractC6492s.d(this.version, supportPinTraceMeta.version) && AbstractC6492s.d(this.deviceId, supportPinTraceMeta.deviceId) && AbstractC6492s.d(this.controller, supportPinTraceMeta.controller);
    }

    public int hashCode() {
        return (((((((this.model.hashCode() * 31) + this.firmwareVersion.hashCode()) * 31) + this.version.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.controller.hashCode();
    }

    public String toString() {
        return "SupportPinTraceMeta(model=" + this.model + ", firmwareVersion=" + this.firmwareVersion + ", version=" + this.version + ", deviceId=" + this.deviceId + ", controller=" + this.controller + ")";
    }

    public SupportPinTraceMeta(String model, String firmwareVersion, String version, String deviceId, String controller) {
        AbstractC6492s.i(model, "model");
        AbstractC6492s.i(firmwareVersion, "firmwareVersion");
        AbstractC6492s.i(version, "version");
        AbstractC6492s.i(deviceId, "deviceId");
        AbstractC6492s.i(controller, "controller");
        this.model = model;
        this.firmwareVersion = firmwareVersion;
        this.version = version;
        this.deviceId = deviceId;
        this.controller = controller;
    }

    public /* synthetic */ SupportPinTraceMeta(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) == 0 ? str4 : "", (i10 & 16) != 0 ? "protect" : str5);
    }
}
