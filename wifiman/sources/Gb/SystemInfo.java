package gb;

import Zg.AbstractC3689v;
import Zi.C3704f;
import Zi.R0;
import Zi.W0;
import gb.Apps;
import gb.C5890f;
import gb.DirectRemoteConnectionState;
import gb.UnadoptedOsDevicesSource;
import gb.Version;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mb.Hardware;
import mb.m;
import mh.InterfaceC6824a;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 g2\u00020\u0001:\u000259B\u009b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\t\b\u0016¢\u0006\u0004\b\u0017\u0010\u0019B\u0099\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0017\u0010\u001eJ'\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*J¤\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b8\u0010\u0019\u001a\u0004\b7\u0010.R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u00106\u0012\u0004\b;\u0010\u0019\u001a\u0004\b:\u0010.R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u00106\u0012\u0004\b>\u0010\u0019\u001a\u0004\b=\u0010.R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u00106\u0012\u0004\bA\u0010\u0019\u001a\u0004\b@\u0010.R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010B\u0012\u0004\bE\u0010\u0019\u001a\u0004\bC\u0010DR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bJ\u0010\u0019\u001a\u0004\bH\u0010IR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u00106\u0012\u0004\bK\u0010\u0019\u001a\u0004\bF\u0010.R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bP\u0010\u0019\u001a\u0004\bN\u0010OR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b)\u0010Q\u0012\u0004\bR\u0010\u0019R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010S\u0012\u0004\bV\u0010\u0019\u001a\u0004\bT\u0010UR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bW\u0010X\u0012\u0004\b[\u0010\u0019\u001a\u0004\bY\u0010ZR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\\\u0010]\u0012\u0004\b`\u0010\u0019\u001a\u0004\b^\u0010_R#\u0010f\u001a\n\u0012\u0004\u0012\u00020a\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e¨\u0006h"}, d2 = {"Lgb/k;", "", "", "deviceId", "name", "timezone", "mac", "Lmb/p;", "hardware", "Lgb/b;", "apps", "anonymousDeviceId", "Lgb/d;", "directRemoteConnectionState", "", "Lgb/o;", "unadoptedUnifiOSDevices", "Lgb/f;", "owner", "Lgb/p;", "latestUpdate", "Lmb/m;", "deviceState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmb/p;Lgb/b;Ljava/lang/String;Lgb/d;Ljava/util/List;Lgb/f;Lgb/p;Lmb/m;)V", "()V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmb/p;Lgb/b;Ljava/lang/String;Lgb/d;Ljava/util/List;Lgb/f;Lgb/p;Lmb/m;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "j", "(Lgb/k;LYi/d;LXi/f;)V", "Lgb/l;", "systemInfoUpdate", "i", "(Lgb/l;)Lgb/k;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmb/p;Lgb/b;Ljava/lang/String;Lgb/d;Ljava/util/List;Lgb/f;Lgb/p;Lmb/m;)Lgb/k;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getDeviceId", "getDeviceId$annotations", SnmpConfigurator.O_BIND_ADDRESS, "getName", "getName$annotations", SnmpConfigurator.O_COMMUNITY, "getTimezone", "getTimezone$annotations", "d", "getMac", "getMac$annotations", "Lmb/p;", "getHardware", "()Lmb/p;", "getHardware$annotations", "f", "Lgb/b;", "g", "()Lgb/b;", "getApps$annotations", "getAnonymousDeviceId$annotations", "h", "Lgb/d;", "getDirectRemoteConnectionState", "()Lgb/d;", "getDirectRemoteConnectionState$annotations", "Ljava/util/List;", "getUnadoptedUnifiOSDevices$annotations", "Lgb/f;", "getOwner", "()Lgb/f;", "getOwner$annotations", "k", "Lgb/p;", "getLatestUpdate", "()Lgb/p;", "getLatestUpdate$annotations", "l", "Lmb/m;", "getDeviceState", "()Lmb/m;", "getDeviceState$annotations", "Lgb/n;", "m", "LYg/m;", "getUnadoptedUniFiOSDeviceList", "()Ljava/util/List;", "unadoptedUniFiOSDeviceList", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gb.k, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class SystemInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: n, reason: collision with root package name */
    private static final Vi.b[] f47788n = {null, null, null, null, null, null, null, null, new C3704f(UnadoptedOsDevicesSource.a.f47827a), null, null, null};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timezone;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mac;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Hardware hardware;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Apps apps;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String anonymousDeviceId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final DirectRemoteConnectionState directRemoteConnectionState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List unadoptedUnifiOSDevices;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final C5890f owner;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Version latestUpdate;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final mb.m deviceState;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Yg.m unadoptedUniFiOSDeviceList;

    /* renamed from: gb.k$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f47802a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SystemInfo(int i10, String str, String str2, String str3, String str4, Hardware pVar, Apps apps, String str5, DirectRemoteConnectionState c5888d, List list, C5890f c5890f, Version pVar2, mb.m mVar, R0 r02) {
        List list2 = null;
        byte b10 = 0;
        byte b11 = 0;
        if ((i10 & 1) == 0) {
            this.deviceId = null;
        } else {
            this.deviceId = str;
        }
        if ((i10 & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i10 & 4) == 0) {
            this.timezone = null;
        } else {
            this.timezone = str3;
        }
        if ((i10 & 8) == 0) {
            this.mac = null;
        } else {
            this.mac = str4;
        }
        if ((i10 & 16) == 0) {
            this.hardware = null;
        } else {
            this.hardware = pVar;
        }
        if ((i10 & 32) == 0) {
            this.apps = new Apps(list2, (List) (b11 == true ? 1 : 0), 3, (DefaultConstructorMarker) (b10 == true ? 1 : 0));
        } else {
            this.apps = apps;
        }
        if ((i10 & 64) == 0) {
            this.anonymousDeviceId = null;
        } else {
            this.anonymousDeviceId = str5;
        }
        if ((i10 & 128) == 0) {
            this.directRemoteConnectionState = null;
        } else {
            this.directRemoteConnectionState = c5888d;
        }
        if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.unadoptedUnifiOSDevices = null;
        } else {
            this.unadoptedUnifiOSDevices = list;
        }
        if ((i10 & 512) == 0) {
            this.owner = null;
        } else {
            this.owner = c5890f;
        }
        if ((i10 & 1024) == 0) {
            this.latestUpdate = null;
        } else {
            this.latestUpdate = pVar2;
        }
        if ((i10 & 2048) == 0) {
            this.deviceState = null;
        } else {
            this.deviceState = mVar;
        }
        this.unadoptedUniFiOSDeviceList = Yg.n.b(new InterfaceC6824a() { // from class: gb.i
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return SystemInfo.c(this.f47786a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(SystemInfo systemInfo) {
        ArrayList arrayList;
        UnadoptedOsDevices nVar;
        List list = systemInfo.unadoptedUnifiOSDevices;
        if (list == null) {
            return null;
        }
        List<UnadoptedOsDevicesSource> list2 = list;
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list2, 10));
        for (UnadoptedOsDevicesSource oVar : list2) {
            if (oVar.getDevices() != null) {
                nVar = new UnadoptedOsDevices(oVar.getModel(), oVar.getDevices());
            } else {
                String strD = oVar.getModel();
                List listB = oVar.getAddresses();
                if (listB != null) {
                    List<Address> list3 = listB;
                    arrayList = new ArrayList(AbstractC3689v.w(list3, 10));
                    for (Address c5885a : list3) {
                        arrayList.add(new UnadoptedOsDevice(c5885a.getIp(), c5885a.getMac(), oVar.getName(), oVar.getStackable(), oVar.getUpdateRequiredToStack()));
                    }
                } else {
                    arrayList = null;
                }
                nVar = new UnadoptedOsDevices(strD, arrayList);
            }
            arrayList2.add(nVar);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List h(SystemInfo systemInfo) {
        ArrayList arrayList;
        UnadoptedOsDevices nVar;
        List list = systemInfo.unadoptedUnifiOSDevices;
        if (list == null) {
            return null;
        }
        List<UnadoptedOsDevicesSource> list2 = list;
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list2, 10));
        for (UnadoptedOsDevicesSource oVar : list2) {
            if (oVar.getDevices() != null) {
                nVar = new UnadoptedOsDevices(oVar.getModel(), oVar.getDevices());
            } else {
                String strD = oVar.getModel();
                List listB = oVar.getAddresses();
                if (listB != null) {
                    List<Address> list3 = listB;
                    arrayList = new ArrayList(AbstractC3689v.w(list3, 10));
                    for (Address c5885a : list3) {
                        arrayList.add(new UnadoptedOsDevice(c5885a.getIp(), c5885a.getMac(), oVar.getName(), oVar.getStackable(), oVar.getUpdateRequiredToStack()));
                    }
                } else {
                    arrayList = null;
                }
                nVar = new UnadoptedOsDevices(strD, arrayList);
            }
            arrayList2.add(nVar);
        }
        return arrayList2;
    }

    public static final /* synthetic */ void j(SystemInfo self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f47788n;
        if (output.o(serialDesc, 0) || self.deviceId != null) {
            output.t(serialDesc, 0, W0.f25599a, self.deviceId);
        }
        if (output.o(serialDesc, 1) || self.name != null) {
            output.t(serialDesc, 1, W0.f25599a, self.name);
        }
        if (output.o(serialDesc, 2) || self.timezone != null) {
            output.t(serialDesc, 2, W0.f25599a, self.timezone);
        }
        int i10 = 3;
        if (output.o(serialDesc, 3) || self.mac != null) {
            output.t(serialDesc, 3, W0.f25599a, self.mac);
        }
        if (output.o(serialDesc, 4) || self.hardware != null) {
            output.t(serialDesc, 4, Hardware.a.f53858a, self.hardware);
        }
        if (output.o(serialDesc, 5) || !AbstractC6492s.d(self.apps, new Apps((List) null, (List) (0 == true ? 1 : 0), i10, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            output.q(serialDesc, 5, Apps.a.f47762a, self.apps);
        }
        if (output.o(serialDesc, 6) || self.anonymousDeviceId != null) {
            output.t(serialDesc, 6, W0.f25599a, self.anonymousDeviceId);
        }
        if (output.o(serialDesc, 7) || self.directRemoteConnectionState != null) {
            output.t(serialDesc, 7, DirectRemoteConnectionState.a.f47768a, self.directRemoteConnectionState);
        }
        if (output.o(serialDesc, 8) || self.unadoptedUnifiOSDevices != null) {
            output.t(serialDesc, 8, bVarArr[8], self.unadoptedUnifiOSDevices);
        }
        if (output.o(serialDesc, 9) || self.owner != null) {
            output.t(serialDesc, 9, C5890f.a.f47777a, self.owner);
        }
        if (output.o(serialDesc, 10) || self.latestUpdate != null) {
            output.t(serialDesc, 10, Version.a.f47831a, self.latestUpdate);
        }
        if (!output.o(serialDesc, 11) && self.deviceState == null) {
            return;
        }
        output.t(serialDesc, 11, m.b.f53836f, self.deviceState);
    }

    public final SystemInfo e(String deviceId, String name, String timezone, String mac, Hardware hardware, Apps apps, String anonymousDeviceId, DirectRemoteConnectionState directRemoteConnectionState, List unadoptedUnifiOSDevices, C5890f owner, Version latestUpdate, mb.m deviceState) {
        AbstractC6492s.i(apps, "apps");
        return new SystemInfo(deviceId, name, timezone, mac, hardware, apps, anonymousDeviceId, directRemoteConnectionState, unadoptedUnifiOSDevices, owner, latestUpdate, deviceState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SystemInfo)) {
            return false;
        }
        SystemInfo systemInfo = (SystemInfo) other;
        return AbstractC6492s.d(this.deviceId, systemInfo.deviceId) && AbstractC6492s.d(this.name, systemInfo.name) && AbstractC6492s.d(this.timezone, systemInfo.timezone) && AbstractC6492s.d(this.mac, systemInfo.mac) && AbstractC6492s.d(this.hardware, systemInfo.hardware) && AbstractC6492s.d(this.apps, systemInfo.apps) && AbstractC6492s.d(this.anonymousDeviceId, systemInfo.anonymousDeviceId) && AbstractC6492s.d(this.directRemoteConnectionState, systemInfo.directRemoteConnectionState) && AbstractC6492s.d(this.unadoptedUnifiOSDevices, systemInfo.unadoptedUnifiOSDevices) && AbstractC6492s.d(this.owner, systemInfo.owner) && AbstractC6492s.d(this.latestUpdate, systemInfo.latestUpdate) && this.deviceState == systemInfo.deviceState;
    }

    /* renamed from: f, reason: from getter */
    public final String getAnonymousDeviceId() {
        return this.anonymousDeviceId;
    }

    /* renamed from: g, reason: from getter */
    public final Apps getApps() {
        return this.apps;
    }

    public int hashCode() {
        String str = this.deviceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.timezone;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mac;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Hardware pVar = this.hardware;
        int iHashCode5 = (((iHashCode4 + (pVar == null ? 0 : pVar.hashCode())) * 31) + this.apps.hashCode()) * 31;
        String str5 = this.anonymousDeviceId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DirectRemoteConnectionState c5888d = this.directRemoteConnectionState;
        int iHashCode7 = (iHashCode6 + (c5888d == null ? 0 : c5888d.hashCode())) * 31;
        List list = this.unadoptedUnifiOSDevices;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        C5890f c5890f = this.owner;
        int iHashCode9 = (iHashCode8 + (c5890f == null ? 0 : c5890f.hashCode())) * 31;
        Version pVar2 = this.latestUpdate;
        int iHashCode10 = (iHashCode9 + (pVar2 == null ? 0 : pVar2.hashCode())) * 31;
        mb.m mVar = this.deviceState;
        return iHashCode10 + (mVar != null ? mVar.hashCode() : 0);
    }

    public final SystemInfo i(l systemInfoUpdate) {
        DirectRemoteConnectionState c5888dB;
        C5890f c5890fE;
        C5889e c5889eC;
        AbstractC6492s.i(systemInfoUpdate, "systemInfoUpdate");
        String strD = systemInfoUpdate.d();
        if (strD == null) {
            strD = this.deviceId;
        }
        String str = strD;
        String strI = systemInfoUpdate.i();
        if (strI == null) {
            strI = this.name;
        }
        String str2 = strI;
        String strK = systemInfoUpdate.k();
        if (strK == null) {
            strK = this.timezone;
        }
        String str3 = strK;
        String strH = systemInfoUpdate.h();
        if (strH == null) {
            strH = this.mac;
        }
        String str4 = strH;
        Hardware pVarF = systemInfoUpdate.f();
        if (pVarF == null) {
            pVarF = this.hardware;
        }
        Hardware pVar = pVarF;
        Apps appsC = systemInfoUpdate.getApps();
        if (appsC == null) {
            appsC = this.apps;
        }
        Apps apps = appsC;
        String strB = systemInfoUpdate.b();
        if (strB == null) {
            strB = this.anonymousDeviceId;
        }
        String str5 = strB;
        C5892h c5892hJ = systemInfoUpdate.getSystem();
        if (c5892hJ == null || (c5888dB = c5892hJ.getDirectRemoteConnectionState()) == null) {
            c5888dB = this.directRemoteConnectionState;
        }
        DirectRemoteConnectionState c5888d = c5888dB;
        List listL = systemInfoUpdate.getUnadoptedUnifiOSDevices();
        if (listL == null) {
            listL = this.unadoptedUnifiOSDevices;
        }
        List list = listL;
        C5892h c5892hJ2 = systemInfoUpdate.getSystem();
        if (c5892hJ2 == null || (c5889eC = c5892hJ2.getInfo()) == null || (c5890fE = c5889eC.getOwner()) == null) {
            c5890fE = this.owner;
        }
        C5890f c5890f = c5890fE;
        Version pVarG = systemInfoUpdate.g();
        if (pVarG == null) {
            pVarG = this.latestUpdate;
        }
        Version pVar2 = pVarG;
        mb.m mVarE = systemInfoUpdate.e();
        if (mVarE == null) {
            mVarE = this.deviceState;
        }
        return e(str, str2, str3, str4, pVar, apps, str5, c5888d, list, c5890f, pVar2, mVarE);
    }

    public String toString() {
        return "SystemInfo(deviceId=" + this.deviceId + ", name=" + this.name + ", timezone=" + this.timezone + ", mac=" + this.mac + ", hardware=" + this.hardware + ", apps=" + this.apps + ", anonymousDeviceId=" + this.anonymousDeviceId + ", directRemoteConnectionState=" + this.directRemoteConnectionState + ", unadoptedUnifiOSDevices=" + this.unadoptedUnifiOSDevices + ", owner=" + this.owner + ", latestUpdate=" + this.latestUpdate + ", deviceState=" + this.deviceState + ")";
    }

    public SystemInfo(String str, String str2, String str3, String str4, Hardware pVar, Apps apps, String str5, DirectRemoteConnectionState c5888d, List list, C5890f c5890f, Version pVar2, mb.m mVar) {
        AbstractC6492s.i(apps, "apps");
        this.deviceId = str;
        this.name = str2;
        this.timezone = str3;
        this.mac = str4;
        this.hardware = pVar;
        this.apps = apps;
        this.anonymousDeviceId = str5;
        this.directRemoteConnectionState = c5888d;
        this.unadoptedUnifiOSDevices = list;
        this.owner = c5890f;
        this.latestUpdate = pVar2;
        this.deviceState = mVar;
        this.unadoptedUniFiOSDeviceList = Yg.n.b(new InterfaceC6824a() { // from class: gb.j
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return SystemInfo.h(this.f47787a);
            }
        });
    }

    public /* synthetic */ SystemInfo(String str, String str2, String str3, String str4, Hardware pVar, Apps apps, String str5, DirectRemoteConnectionState c5888d, List list, C5890f c5890f, Version pVar2, mb.m mVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Apps apps2;
        byte b10 = 0;
        byte b11 = 0;
        byte b12 = 0;
        String str6 = (i10 & 1) != 0 ? null : str;
        String str7 = (i10 & 2) != 0 ? null : str2;
        String str8 = (i10 & 4) != 0 ? null : str3;
        String str9 = (i10 & 8) != 0 ? null : str4;
        Hardware pVar3 = (i10 & 16) != 0 ? null : pVar;
        if ((i10 & 32) != 0) {
            apps2 = new Apps((List) (b12 == true ? 1 : 0), (List) (b11 == true ? 1 : 0), 3, (DefaultConstructorMarker) (b10 == true ? 1 : 0));
        } else {
            apps2 = apps;
        }
        this(str6, str7, str8, str9, pVar3, apps2, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : c5888d, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : list, (i10 & 512) != 0 ? null : c5890f, (i10 & 1024) != 0 ? null : pVar2, (i10 & 2048) == 0 ? mVar : null);
    }

    public SystemInfo() {
        this("", "", (String) null, (String) null, (Hardware) null, (Apps) null, (String) null, (DirectRemoteConnectionState) null, (List) null, (C5890f) null, (Version) null, (mb.m) null, 4092, (DefaultConstructorMarker) null);
    }
}
