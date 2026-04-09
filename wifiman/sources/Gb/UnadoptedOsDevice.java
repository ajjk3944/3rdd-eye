package gb;

import Zi.C3710i;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 12\u00020\u0001:\u0002\u0016#BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001f\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001f\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010\"\u001a\u0004\b+\u0010,R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010*\u0012\u0004\b0\u0010\"\u001a\u0004\b/\u0010,¨\u00062"}, d2 = {"Lgb/m;", "", "", GenericAddress.TYPE_IP, "mac", "name", "", "stackable", "updateRequiredToStack", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lgb/m;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIp", "getIp$annotations", "()V", SnmpConfigurator.O_BIND_ADDRESS, "getMac", "getMac$annotations", SnmpConfigurator.O_COMMUNITY, "getName", "getName$annotations", "d", "Ljava/lang/Boolean;", "getStackable", "()Ljava/lang/Boolean;", "getStackable$annotations", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getUpdateRequiredToStack", "getUpdateRequiredToStack$annotations", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gb.m, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class UnadoptedOsDevice {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ip;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mac;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean stackable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean updateRequiredToStack;

    /* renamed from: gb.m$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f47815a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f47815a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.client.http.models.UnadoptedOsDevice", aVar, 5);
            h02.p(GenericAddress.TYPE_IP, true);
            h02.p("mac", true);
            h02.p("name", true);
            h02.p("stackable", true);
            h02.p("updateRequiredToStack", true);
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
            Vi.b bVarU = Wi.a.u(w02);
            Vi.b bVarU2 = Wi.a.u(w02);
            Vi.b bVarU3 = Wi.a.u(w02);
            C3710i c3710i = C3710i.f25639a;
            return new Vi.b[]{bVarU, bVarU2, bVarU3, Wi.a.u(c3710i), Wi.a.u(c3710i)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final UnadoptedOsDevice c(Yi.e decoder) {
            int i10;
            String str;
            String str2;
            String str3;
            Boolean bool;
            Boolean bool2;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            String str4 = null;
            if (cVarC.B()) {
                W0 w02 = W0.f25599a;
                String str5 = (String) cVarC.h(fVar, 0, w02, null);
                String str6 = (String) cVarC.h(fVar, 1, w02, null);
                String str7 = (String) cVarC.h(fVar, 2, w02, null);
                C3710i c3710i = C3710i.f25639a;
                str3 = str7;
                bool = (Boolean) cVarC.h(fVar, 3, c3710i, null);
                bool2 = (Boolean) cVarC.h(fVar, 4, c3710i, null);
                i10 = 31;
                str2 = str6;
                str = str5;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str8 = null;
                String str9 = null;
                Boolean bool3 = null;
                Boolean bool4 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        str4 = (String) cVarC.h(fVar, 0, W0.f25599a, str4);
                        i11 |= 1;
                    } else if (iK == 1) {
                        str8 = (String) cVarC.h(fVar, 1, W0.f25599a, str8);
                        i11 |= 2;
                    } else if (iK == 2) {
                        str9 = (String) cVarC.h(fVar, 2, W0.f25599a, str9);
                        i11 |= 4;
                    } else if (iK == 3) {
                        bool3 = (Boolean) cVarC.h(fVar, 3, C3710i.f25639a, bool3);
                        i11 |= 8;
                    } else {
                        if (iK != 4) {
                            throw new UnknownFieldException(iK);
                        }
                        bool4 = (Boolean) cVarC.h(fVar, 4, C3710i.f25639a, bool4);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                str = str4;
                str2 = str8;
                str3 = str9;
                bool = bool3;
                bool2 = bool4;
            }
            cVarC.b(fVar);
            return new UnadoptedOsDevice(i10, str, str2, str3, bool, bool2, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, UnadoptedOsDevice value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            UnadoptedOsDevice.a(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: gb.m$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f47815a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UnadoptedOsDevice(int i10, String str, String str2, String str3, Boolean bool, Boolean bool2, R0 r02) {
        if ((i10 & 1) == 0) {
            this.ip = null;
        } else {
            this.ip = str;
        }
        if ((i10 & 2) == 0) {
            this.mac = null;
        } else {
            this.mac = str2;
        }
        if ((i10 & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i10 & 8) == 0) {
            this.stackable = null;
        } else {
            this.stackable = bool;
        }
        if ((i10 & 16) == 0) {
            this.updateRequiredToStack = null;
        } else {
            this.updateRequiredToStack = bool2;
        }
    }

    public static final /* synthetic */ void a(UnadoptedOsDevice self, Yi.d output, Xi.f serialDesc) {
        if (output.o(serialDesc, 0) || self.ip != null) {
            output.t(serialDesc, 0, W0.f25599a, self.ip);
        }
        if (output.o(serialDesc, 1) || self.mac != null) {
            output.t(serialDesc, 1, W0.f25599a, self.mac);
        }
        if (output.o(serialDesc, 2) || self.name != null) {
            output.t(serialDesc, 2, W0.f25599a, self.name);
        }
        if (output.o(serialDesc, 3) || self.stackable != null) {
            output.t(serialDesc, 3, C3710i.f25639a, self.stackable);
        }
        if (!output.o(serialDesc, 4) && self.updateRequiredToStack == null) {
            return;
        }
        output.t(serialDesc, 4, C3710i.f25639a, self.updateRequiredToStack);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnadoptedOsDevice)) {
            return false;
        }
        UnadoptedOsDevice unadoptedOsDevice = (UnadoptedOsDevice) other;
        return AbstractC6492s.d(this.ip, unadoptedOsDevice.ip) && AbstractC6492s.d(this.mac, unadoptedOsDevice.mac) && AbstractC6492s.d(this.name, unadoptedOsDevice.name) && AbstractC6492s.d(this.stackable, unadoptedOsDevice.stackable) && AbstractC6492s.d(this.updateRequiredToStack, unadoptedOsDevice.updateRequiredToStack);
    }

    public int hashCode() {
        String str = this.ip;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mac;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.stackable;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.updateRequiredToStack;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "UnadoptedOsDevice(ip=" + this.ip + ", mac=" + this.mac + ", name=" + this.name + ", stackable=" + this.stackable + ", updateRequiredToStack=" + this.updateRequiredToStack + ")";
    }

    public UnadoptedOsDevice(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        this.ip = str;
        this.mac = str2;
        this.name = str3;
        this.stackable = bool;
        this.updateRequiredToStack = bool2;
    }
}
