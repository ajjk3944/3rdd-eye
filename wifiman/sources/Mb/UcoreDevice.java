package mb;

import Zg.AbstractC3689v;
import Zi.C0;
import Zi.C3704f;
import Zi.C3709h0;
import Zi.C3710i;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import mb.AvailableControllers;
import mb.Device;
import mb.z;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0081\b\u0018\u0000 @2\u00020\u0001:\u0002'*Bm\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b*\u0010?¨\u0006A"}, d2 = {"Lmb/y;", "", "", "seen0", "", "id", "", "owner", "", "lastConnectionStateChange", "hardwareId", "Lmb/z;", "shadow", "Lmb/c;", "availableControllers", "", "Lmb/x;", "controllers", "Lmb/l;", "device", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;ZJLjava/lang/String;Lmb/z;Lmb/c;Ljava/util/List;Lmb/l;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_COMMUNITY, "(Lmb/y;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getId", SnmpConfigurator.O_BIND_ADDRESS, "Z", "getOwner", "()Z", "J", "getLastConnectionStateChange", "()J", "d", "getHardwareId", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lmb/z;", "f", "Lmb/c;", "getAvailableControllers", "()Lmb/c;", "getAvailableControllers$annotations", "()V", "g", "Ljava/util/List;", "h", "Lmb/l;", "()Lmb/l;", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.y, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class UcoreDevice {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Vi.b[] f53934i = {null, null, null, null, null, null, new C3704f(x.INSTANCE.serializer()), null};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean owner;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lastConnectionStateChange;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hardwareId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final z shadow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AvailableControllers availableControllers;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List controllers;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Device device;

    /* renamed from: mb.y$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53943a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53943a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.devices.UcoreDevice", aVar, 8);
            h02.p("id", false);
            h02.p("owner", false);
            h02.p("lastConnectionStateChange", false);
            h02.p("hardwareId", false);
            h02.p("shadow", false);
            h02.p("userData", false);
            h02.p("controllers", true);
            h02.p("device", true);
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
            Vi.b bVar = UcoreDevice.f53934i[6];
            W0 w02 = W0.f25599a;
            return new Vi.b[]{w02, C3710i.f25639a, C3709h0.f25636a, w02, z.a.f53946a, AvailableControllers.a.f53765a, bVar, Device.a.f53835a};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final UcoreDevice c(Yi.e decoder) {
            int i10;
            Device device;
            List list;
            AvailableControllers availableControllers;
            boolean z10;
            String str;
            String str2;
            z zVar;
            long j10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = UcoreDevice.f53934i;
            int i11 = 7;
            if (cVarC.B()) {
                String strW = cVarC.w(fVar, 0);
                boolean zU = cVarC.u(fVar, 1);
                long jQ = cVarC.q(fVar, 2);
                String strW2 = cVarC.w(fVar, 3);
                z zVar2 = (z) cVarC.p(fVar, 4, z.a.f53946a, null);
                AvailableControllers availableControllers2 = (AvailableControllers) cVarC.p(fVar, 5, AvailableControllers.a.f53765a, null);
                list = (List) cVarC.p(fVar, 6, bVarArr[6], null);
                str = strW;
                device = (Device) cVarC.p(fVar, 7, Device.a.f53835a, null);
                availableControllers = availableControllers2;
                str2 = strW2;
                zVar = zVar2;
                i10 = 255;
                z10 = zU;
                j10 = jQ;
            } else {
                boolean z11 = true;
                int i12 = 0;
                Device device2 = null;
                List list2 = null;
                z zVar3 = null;
                long jQ2 = 0;
                String strW3 = null;
                String strW4 = null;
                AvailableControllers availableControllers3 = null;
                boolean zU2 = false;
                while (z11) {
                    int iK = cVarC.k(fVar);
                    switch (iK) {
                        case -1:
                            z11 = false;
                            i11 = 7;
                        case 0:
                            i12 |= 1;
                            strW3 = cVarC.w(fVar, 0);
                            i11 = 7;
                        case 1:
                            i12 |= 2;
                            zU2 = cVarC.u(fVar, 1);
                            i11 = 7;
                        case 2:
                            jQ2 = cVarC.q(fVar, 2);
                            i12 |= 4;
                            i11 = 7;
                        case 3:
                            strW4 = cVarC.w(fVar, 3);
                            i12 |= 8;
                        case 4:
                            zVar3 = (z) cVarC.p(fVar, 4, z.a.f53946a, zVar3);
                            i12 |= 16;
                        case 5:
                            availableControllers3 = (AvailableControllers) cVarC.p(fVar, 5, AvailableControllers.a.f53765a, availableControllers3);
                            i12 |= 32;
                        case 6:
                            list2 = (List) cVarC.p(fVar, 6, bVarArr[6], list2);
                            i12 |= 64;
                        case 7:
                            device2 = (Device) cVarC.p(fVar, i11, Device.a.f53835a, device2);
                            i12 |= 128;
                        default:
                            throw new UnknownFieldException(iK);
                    }
                }
                i10 = i12;
                device = device2;
                list = list2;
                availableControllers = availableControllers3;
                z10 = zU2;
                str = strW3;
                str2 = strW4;
                zVar = zVar3;
                j10 = jQ2;
            }
            cVarC.b(fVar);
            return new UcoreDevice(i10, str, z10, j10, str2, zVar, availableControllers, list, device, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, UcoreDevice value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            UcoreDevice.c(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.y$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53943a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UcoreDevice(int i10, String str, boolean z10, long j10, String str2, z zVar, AvailableControllers availableControllers, List list, Device device, R0 r02) {
        Device device2;
        if (63 != (i10 & 63)) {
            C0.a(i10, 63, a.f53943a.a());
        }
        this.id = str;
        this.owner = z10;
        this.lastConnectionStateChange = j10;
        this.hardwareId = str2;
        this.shadow = zVar;
        this.availableControllers = availableControllers;
        if ((i10 & 64) == 0) {
            List controllers = zVar.getState().getReported().getControllers();
            ArrayList arrayList = new ArrayList();
            for (Object obj : controllers) {
                if (!(((x) obj) instanceof UnknownController)) {
                    arrayList.add(obj);
                }
            }
            this.controllers = arrayList;
        } else {
            this.controllers = list;
        }
        if ((i10 & 128) == 0) {
            String str3 = this.id;
            boolean z11 = this.owner;
            long j11 = this.lastConnectionStateChange;
            String str4 = this.hardwareId;
            String name = this.shadow.getState().getReported().getName();
            String mac = this.shadow.getState().getReported().getMac();
            String ip = this.shadow.getState().getReported().getIp();
            List addresses = this.shadow.getState().getReported().getAddresses();
            List listL = addresses == null ? AbstractC3689v.l() : addresses;
            String hostname = this.shadow.getState().getReported().getHostname();
            String directConnectDomain = this.shadow.getState().getReported().getDirectConnectDomain();
            String version = this.shadow.getState().getReported().getVersion();
            boolean zD = AbstractC6492s.d(this.shadow.getState().getReported().getState(), "connected");
            boolean z12 = this.shadow.getState().getReported().getDeviceState() == m.UPGRADING;
            List list2 = this.controllers;
            List apps = this.shadow.getState().getReported().getApps();
            ControllerLocation location = this.shadow.getState().getReported().getLocation();
            Hardware hardware = this.shadow.getState().getReported().getHardware();
            String ncaToken = this.shadow.getState().getReported().getNcaToken();
            AvailableControllers availableControllers2 = this.availableControllers;
            String timezone = this.shadow.getState().getReported().getTimezone();
            ControllerFeatures features = this.shadow.getState().getReported().getFeatures();
            FirmwareUpdate firmwareUpdate = this.shadow.getState().getReported().getFirmwareUpdate();
            device2 = new Device(str3, z11, j11, str4, name, mac, ip, listL, hostname, directConnectDomain, version, zD, z12, list2, apps, location, hardware, ncaToken, availableControllers2, timezone, features, firmwareUpdate != null ? firmwareUpdate.getLatestAvailableVersion() : null, this.shadow.getState().getReported().getUidb(), this.shadow.getState().getReported().getAnonid());
        } else {
            device2 = device;
        }
        this.device = device2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void c(mb.UcoreDevice r33, Yi.d r34, Xi.f r35) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.UcoreDevice.c(mb.y, Yi.d, Xi.f):void");
    }

    /* renamed from: b, reason: from getter */
    public final Device getDevice() {
        return this.device;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UcoreDevice)) {
            return false;
        }
        UcoreDevice ucoreDevice = (UcoreDevice) other;
        return AbstractC6492s.d(this.id, ucoreDevice.id) && this.owner == ucoreDevice.owner && this.lastConnectionStateChange == ucoreDevice.lastConnectionStateChange && AbstractC6492s.d(this.hardwareId, ucoreDevice.hardwareId) && AbstractC6492s.d(this.shadow, ucoreDevice.shadow) && AbstractC6492s.d(this.availableControllers, ucoreDevice.availableControllers);
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + Boolean.hashCode(this.owner)) * 31) + Long.hashCode(this.lastConnectionStateChange)) * 31) + this.hardwareId.hashCode()) * 31) + this.shadow.hashCode()) * 31) + this.availableControllers.hashCode();
    }

    public String toString() {
        return "UcoreDevice(id=" + this.id + ", owner=" + this.owner + ", lastConnectionStateChange=" + this.lastConnectionStateChange + ", hardwareId=" + this.hardwareId + ", shadow=" + this.shadow + ", availableControllers=" + this.availableControllers + ")";
    }
}
