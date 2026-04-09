package gb;

import Zi.C3704f;
import Zi.C3710i;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import gb.Address;
import gb.UnadoptedOsDevice;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u0002\"'Bc\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010&\u001a\u0004\b)\u0010*R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010#\u0012\u0004\b-\u0010&\u001a\u0004\b,\u0010\u001cR(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010(\u0012\u0004\b.\u0010&\u001a\u0004\b'\u0010*R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010/\u0012\u0004\b2\u0010&\u001a\u0004\b0\u00101R\"\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010/\u0012\u0004\b4\u0010&\u001a\u0004\b3\u00101¨\u00066"}, d2 = {"Lgb/o;", "", "", "seen0", "", "model", "", "Lgb/m;", "devices", "name", "Lgb/a;", "addresses", "", "stackable", "updateRequiredToStack", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "h", "(Lgb/o;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "d", "getModel$annotations", "()V", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/util/List;", SnmpConfigurator.O_COMMUNITY, "()Ljava/util/List;", "getDevices$annotations", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getName$annotations", "getAddresses$annotations", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "getStackable$annotations", "g", "getUpdateRequiredToStack$annotations", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gb.o, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class UnadoptedOsDevicesSource {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Vi.b[] f47820g = {null, new C3704f(UnadoptedOsDevice.a.f47815a), null, new C3704f(Address.C1776a.f47758a), null, null};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String model;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List devices;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List addresses;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean stackable;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean updateRequiredToStack;

    /* renamed from: gb.o$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f47827a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f47827a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.client.http.models.UnadoptedOsDevicesSource", aVar, 6);
            h02.p("model", true);
            h02.p("devices", true);
            h02.p("name", true);
            h02.p("addresses", true);
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
            Vi.b[] bVarArr = UnadoptedOsDevicesSource.f47820g;
            W0 w02 = W0.f25599a;
            Vi.b bVarU = Wi.a.u(w02);
            Vi.b bVarU2 = Wi.a.u(bVarArr[1]);
            Vi.b bVarU3 = Wi.a.u(w02);
            Vi.b bVarU4 = Wi.a.u(bVarArr[3]);
            C3710i c3710i = C3710i.f25639a;
            return new Vi.b[]{bVarU, bVarU2, bVarU3, bVarU4, Wi.a.u(c3710i), Wi.a.u(c3710i)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final UnadoptedOsDevicesSource c(Yi.e decoder) {
            int i10;
            String str;
            List list;
            String str2;
            List list2;
            Boolean bool;
            Boolean bool2;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = UnadoptedOsDevicesSource.f47820g;
            int i11 = 5;
            String str3 = null;
            if (cVarC.B()) {
                W0 w02 = W0.f25599a;
                String str4 = (String) cVarC.h(fVar, 0, w02, null);
                List list3 = (List) cVarC.h(fVar, 1, bVarArr[1], null);
                String str5 = (String) cVarC.h(fVar, 2, w02, null);
                List list4 = (List) cVarC.h(fVar, 3, bVarArr[3], null);
                C3710i c3710i = C3710i.f25639a;
                Boolean bool3 = (Boolean) cVarC.h(fVar, 4, c3710i, null);
                list2 = list4;
                str2 = str5;
                bool2 = (Boolean) cVarC.h(fVar, 5, c3710i, null);
                bool = bool3;
                i10 = 63;
                list = list3;
                str = str4;
            } else {
                boolean z10 = true;
                int i12 = 0;
                List list5 = null;
                String str6 = null;
                List list6 = null;
                Boolean bool4 = null;
                Boolean bool5 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    switch (iK) {
                        case -1:
                            z10 = false;
                            i11 = 5;
                        case 0:
                            str3 = (String) cVarC.h(fVar, 0, W0.f25599a, str3);
                            i12 |= 1;
                            i11 = 5;
                        case 1:
                            list5 = (List) cVarC.h(fVar, 1, bVarArr[1], list5);
                            i12 |= 2;
                        case 2:
                            str6 = (String) cVarC.h(fVar, 2, W0.f25599a, str6);
                            i12 |= 4;
                        case 3:
                            list6 = (List) cVarC.h(fVar, 3, bVarArr[3], list6);
                            i12 |= 8;
                        case 4:
                            bool4 = (Boolean) cVarC.h(fVar, 4, C3710i.f25639a, bool4);
                            i12 |= 16;
                        case 5:
                            bool5 = (Boolean) cVarC.h(fVar, i11, C3710i.f25639a, bool5);
                            i12 |= 32;
                        default:
                            throw new UnknownFieldException(iK);
                    }
                }
                i10 = i12;
                str = str3;
                list = list5;
                str2 = str6;
                list2 = list6;
                bool = bool4;
                bool2 = bool5;
            }
            cVarC.b(fVar);
            return new UnadoptedOsDevicesSource(i10, str, list, str2, list2, bool, bool2, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, UnadoptedOsDevicesSource value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            UnadoptedOsDevicesSource.h(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: gb.o$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f47827a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UnadoptedOsDevicesSource(int i10, String str, List list, String str2, List list2, Boolean bool, Boolean bool2, R0 r02) {
        if ((i10 & 1) == 0) {
            this.model = null;
        } else {
            this.model = str;
        }
        if ((i10 & 2) == 0) {
            this.devices = null;
        } else {
            this.devices = list;
        }
        if ((i10 & 4) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i10 & 8) == 0) {
            this.addresses = null;
        } else {
            this.addresses = list2;
        }
        if ((i10 & 16) == 0) {
            this.stackable = null;
        } else {
            this.stackable = bool;
        }
        if ((i10 & 32) == 0) {
            this.updateRequiredToStack = null;
        } else {
            this.updateRequiredToStack = bool2;
        }
    }

    public static final /* synthetic */ void h(UnadoptedOsDevicesSource self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f47820g;
        if (output.o(serialDesc, 0) || self.model != null) {
            output.t(serialDesc, 0, W0.f25599a, self.model);
        }
        if (output.o(serialDesc, 1) || self.devices != null) {
            output.t(serialDesc, 1, bVarArr[1], self.devices);
        }
        if (output.o(serialDesc, 2) || self.name != null) {
            output.t(serialDesc, 2, W0.f25599a, self.name);
        }
        if (output.o(serialDesc, 3) || self.addresses != null) {
            output.t(serialDesc, 3, bVarArr[3], self.addresses);
        }
        if (output.o(serialDesc, 4) || self.stackable != null) {
            output.t(serialDesc, 4, C3710i.f25639a, self.stackable);
        }
        if (!output.o(serialDesc, 5) && self.updateRequiredToStack == null) {
            return;
        }
        output.t(serialDesc, 5, C3710i.f25639a, self.updateRequiredToStack);
    }

    /* renamed from: b, reason: from getter */
    public final List getAddresses() {
        return this.addresses;
    }

    /* renamed from: c, reason: from getter */
    public final List getDevices() {
        return this.devices;
    }

    /* renamed from: d, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnadoptedOsDevicesSource)) {
            return false;
        }
        UnadoptedOsDevicesSource unadoptedOsDevicesSource = (UnadoptedOsDevicesSource) other;
        return AbstractC6492s.d(this.model, unadoptedOsDevicesSource.model) && AbstractC6492s.d(this.devices, unadoptedOsDevicesSource.devices) && AbstractC6492s.d(this.name, unadoptedOsDevicesSource.name) && AbstractC6492s.d(this.addresses, unadoptedOsDevicesSource.addresses) && AbstractC6492s.d(this.stackable, unadoptedOsDevicesSource.stackable) && AbstractC6492s.d(this.updateRequiredToStack, unadoptedOsDevicesSource.updateRequiredToStack);
    }

    /* renamed from: f, reason: from getter */
    public final Boolean getStackable() {
        return this.stackable;
    }

    /* renamed from: g, reason: from getter */
    public final Boolean getUpdateRequiredToStack() {
        return this.updateRequiredToStack;
    }

    public int hashCode() {
        String str = this.model;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.devices;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.addresses;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.stackable;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.updateRequiredToStack;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "UnadoptedOsDevicesSource(model=" + this.model + ", devices=" + this.devices + ", name=" + this.name + ", addresses=" + this.addresses + ", stackable=" + this.stackable + ", updateRequiredToStack=" + this.updateRequiredToStack + ")";
    }
}
