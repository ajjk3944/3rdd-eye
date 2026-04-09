package mb;

import Zg.AbstractC3689v;
import Zi.C3704f;
import Zi.C3709h0;
import Zi.C3710i;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.ar.core.ImageFormat;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import mb.AvailableControllers;
import mb.ControllerFeatures;
import mb.ControllerLocation;
import mb.Hardware;
import mb.UiDb;
import mb.x;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.transport.TLSTM;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b9\b\u0087\b\u0018\u0000 u2\u00020\u0001:\u0002ADB¥\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%B\u0095\u0002\b\u0010\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b$\u0010*J'\u00101\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102J\u001d\u00106\u001a\u0002002\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020&¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020&¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020&HÖ\u0001¢\u0006\u0004\b<\u00109J\u001a\u0010?\u001a\u00020\u00042\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010;R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010B\u001a\u0004\bM\u0010;R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u0010B\u001a\u0004\bO\u0010;R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010B\u001a\u0004\bP\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010B\u001a\u0004\bR\u0010;R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\bP\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u0010B\u001a\u0004\bV\u0010;R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u0010B\u001a\u0004\bX\u0010;R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bY\u0010;R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010E\u001a\u0004\bZ\u0010GR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010E\u001a\u0004\b[\u0010GR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f8\u0006¢\u0006\f\n\u0004\b1\u0010S\u001a\u0004\bH\u0010UR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\f8\u0006¢\u0006\f\n\u0004\b\\\u0010S\u001a\u0004\b]\u0010UR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\bQ\u0010`R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bN\u0010cR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bd\u0010B\u001a\u0004\bW\u0010;R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bi\u0010B\u001a\u0004\bj\u0010;R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bL\u0010mR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bn\u0010B\u001a\u0004\bo\u0010;R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bt\u0010B\u001a\u0004\bD\u0010;¨\u0006v"}, d2 = {"Lmb/l;", "Landroid/os/Parcelable;", "", "id", "", "owner", "", "lastConnectionStateChange", "hardwareId", "name", "mac", GenericAddress.TYPE_IP, "", "addresses", "hostname", "directConnectDomain", "version", "isConnected", "isUpdating", "Lmb/x;", "controllers", "apps", "Lmb/h;", "location", "Lmb/p;", "hardware", "ncaToken", "Lmb/c;", "availableControllers", "timezone", "Lmb/f;", "features", "latestAvailableVersion", "Lmb/C;", "uidb", "anonid", "<init>", "(Ljava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Lmb/h;Lmb/p;Ljava/lang/String;Lmb/c;Ljava/lang/String;Lmb/f;Ljava/lang/String;Lmb/C;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Lmb/h;Lmb/p;Ljava/lang/String;Lmb/c;Ljava/lang/String;Lmb/f;Ljava/lang/String;Lmb/C;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_CONTEXT_NAME, "(Lmb/l;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "f", SnmpConfigurator.O_BIND_ADDRESS, "Z", "k", "()Z", SnmpConfigurator.O_COMMUNITY, "J", "getLastConnectionStateChange", "()J", "d", "getHardwareId", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "i", "h", "g", "getIp", "Ljava/util/List;", "getAddresses", "()Ljava/util/List;", "getHostname", "j", "getDirectConnectDomain", "getVersion", "l", "m", SnmpConfigurator.O_OPERATION, "getApps", "p", "Lmb/h;", "()Lmb/h;", "q", "Lmb/p;", "()Lmb/p;", SnmpConfigurator.O_RETRIES, "s", "Lmb/c;", "getAvailableControllers", "()Lmb/c;", SnmpConfigurator.O_TIMEOUT, "getTimezone", SnmpConfigurator.O_SECURITY_NAME, "Lmb/f;", "()Lmb/f;", SnmpConfigurator.O_VERSION, "getLatestAvailableVersion", "w", "Lmb/C;", "getUidb", "()Lmb/C;", "x", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.l, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class Device implements Parcelable {

    /* renamed from: y, reason: collision with root package name */
    private static final Vi.b[] f53810y;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean owner;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lastConnectionStateChange;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hardwareId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mac;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ip;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List addresses;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hostname;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String directConnectDomain;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String version;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isConnected;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUpdating;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final List controllers;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final List apps;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final ControllerLocation location;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final Hardware hardware;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ncaToken;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final AvailableControllers availableControllers;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timezone;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final ControllerFeatures features;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final String latestAvailableVersion;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final UiDb uidb;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final String anonid;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Device> CREATOR = new c();

    /* renamed from: mb.l$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53835a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53835a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.devices.Device", aVar, 24);
            h02.p("id", true);
            h02.p("owner", true);
            h02.p("lastConnectionStateChange", true);
            h02.p("hardwareId", true);
            h02.p("name", true);
            h02.p("mac", true);
            h02.p(GenericAddress.TYPE_IP, true);
            h02.p("addresses", true);
            h02.p("hostname", true);
            h02.p("directConnectDomain", true);
            h02.p("version", true);
            h02.p("isConnected", true);
            h02.p("isUpdating", true);
            h02.p("controllers", true);
            h02.p("apps", true);
            h02.p("location", true);
            h02.p("hardware", true);
            h02.p("ncaToken", true);
            h02.p("availableControllers", true);
            h02.p("timezone", true);
            h02.p("features", true);
            h02.p("latestAvailableVersion", true);
            h02.p("uidb", true);
            h02.p("anonid", true);
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
            Vi.b[] bVarArr = Device.f53810y;
            W0 w02 = W0.f25599a;
            Vi.b bVarU = Wi.a.u(w02);
            Vi.b bVarU2 = Wi.a.u(w02);
            Vi.b bVarU3 = Wi.a.u(w02);
            Vi.b bVar = bVarArr[7];
            Vi.b bVarU4 = Wi.a.u(w02);
            Vi.b bVarU5 = Wi.a.u(w02);
            Vi.b bVar2 = bVarArr[13];
            Vi.b bVar3 = bVarArr[14];
            Vi.b bVarU6 = Wi.a.u(ControllerLocation.a.f53796a);
            Vi.b bVarU7 = Wi.a.u(Hardware.a.f53858a);
            Vi.b bVarU8 = Wi.a.u(w02);
            Vi.b bVarU9 = Wi.a.u(AvailableControllers.a.f53765a);
            Vi.b bVarU10 = Wi.a.u(w02);
            Vi.b bVarU11 = Wi.a.u(ControllerFeatures.a.f53789a);
            Vi.b bVarU12 = Wi.a.u(w02);
            Vi.b bVarU13 = Wi.a.u(UiDb.a.f53700a);
            Vi.b bVarU14 = Wi.a.u(w02);
            C3710i c3710i = C3710i.f25639a;
            return new Vi.b[]{w02, c3710i, C3709h0.f25636a, w02, bVarU, bVarU2, bVarU3, bVar, bVarU4, bVarU5, w02, c3710i, c3710i, bVar2, bVar3, bVarU6, bVarU7, bVarU8, bVarU9, bVarU10, bVarU11, bVarU12, bVarU13, bVarU14};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Device c(Yi.e decoder) {
            String str;
            String str2;
            List list;
            ControllerLocation controllerLocation;
            String str3;
            String str4;
            int i10;
            String str5;
            AvailableControllers availableControllers;
            String str6;
            Hardware hardware;
            UiDb uiDb;
            ControllerFeatures controllerFeatures;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            boolean z10;
            List list2;
            String str12;
            List list3;
            boolean z11;
            boolean z12;
            long j10;
            List list4;
            int i11;
            ControllerFeatures controllerFeatures2;
            List list5;
            String str13;
            String str14;
            Vi.b[] bVarArr;
            List list6;
            ControllerFeatures controllerFeatures3;
            List list7;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr2 = Device.f53810y;
            if (cVarC.B()) {
                String strW = cVarC.w(fVar, 0);
                boolean zU = cVarC.u(fVar, 1);
                long jQ = cVarC.q(fVar, 2);
                String strW2 = cVarC.w(fVar, 3);
                W0 w02 = W0.f25599a;
                String str15 = (String) cVarC.h(fVar, 4, w02, null);
                String str16 = (String) cVarC.h(fVar, 5, w02, null);
                String str17 = (String) cVarC.h(fVar, 6, w02, null);
                List list8 = (List) cVarC.p(fVar, 7, bVarArr2[7], null);
                String str18 = (String) cVarC.h(fVar, 8, w02, null);
                String str19 = (String) cVarC.h(fVar, 9, w02, null);
                String strW3 = cVarC.w(fVar, 10);
                boolean zU2 = cVarC.u(fVar, 11);
                boolean zU3 = cVarC.u(fVar, 12);
                List list9 = (List) cVarC.p(fVar, 13, bVarArr2[13], null);
                List list10 = (List) cVarC.p(fVar, 14, bVarArr2[14], null);
                ControllerLocation controllerLocation2 = (ControllerLocation) cVarC.h(fVar, 15, ControllerLocation.a.f53796a, null);
                Hardware hardware2 = (Hardware) cVarC.h(fVar, 16, Hardware.a.f53858a, null);
                String str20 = (String) cVarC.h(fVar, 17, w02, null);
                AvailableControllers availableControllers2 = (AvailableControllers) cVarC.h(fVar, 18, AvailableControllers.a.f53765a, null);
                String str21 = (String) cVarC.h(fVar, 19, w02, null);
                ControllerFeatures controllerFeatures4 = (ControllerFeatures) cVarC.h(fVar, 20, ControllerFeatures.a.f53789a, null);
                String str22 = (String) cVarC.h(fVar, 21, w02, null);
                controllerFeatures = controllerFeatures4;
                uiDb = (UiDb) cVarC.h(fVar, 22, UiDb.a.f53700a, null);
                str3 = (String) cVarC.h(fVar, 23, w02, null);
                str6 = str20;
                str2 = str18;
                str = str15;
                str8 = strW2;
                i10 = 16777215;
                z10 = zU3;
                str11 = strW3;
                str12 = str19;
                str10 = str17;
                str9 = str16;
                z12 = zU2;
                availableControllers = availableControllers2;
                str5 = str21;
                hardware = hardware2;
                list3 = list9;
                controllerLocation = controllerLocation2;
                list = list10;
                list2 = list8;
                str7 = strW;
                z11 = zU;
                j10 = jQ;
                str4 = str22;
            } else {
                boolean z13 = true;
                ControllerFeatures controllerFeatures5 = null;
                List list11 = null;
                ControllerLocation controllerLocation3 = null;
                String str23 = null;
                String str24 = null;
                AvailableControllers availableControllers3 = null;
                String str25 = null;
                Hardware hardware3 = null;
                List list12 = null;
                String str26 = null;
                UiDb uiDb2 = null;
                String strW4 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                List list13 = null;
                String str30 = null;
                boolean zU4 = false;
                boolean zU5 = false;
                boolean zU6 = false;
                long jQ2 = 0;
                String strW5 = null;
                String strW6 = null;
                int i12 = 0;
                String str31 = null;
                while (z13) {
                    String str32 = str26;
                    int iK = cVarC.k(fVar);
                    switch (iK) {
                        case -1:
                            controllerFeatures2 = controllerFeatures5;
                            list5 = list12;
                            str13 = str30;
                            str14 = str32;
                            bVarArr = bVarArr2;
                            z13 = false;
                            str26 = str14;
                            list12 = list5;
                            bVarArr2 = bVarArr;
                            str30 = str13;
                            controllerFeatures5 = controllerFeatures2;
                        case 0:
                            controllerFeatures2 = controllerFeatures5;
                            list5 = list12;
                            str13 = str30;
                            str14 = str32;
                            bVarArr = bVarArr2;
                            strW5 = cVarC.w(fVar, 0);
                            i12 |= 1;
                            str26 = str14;
                            list12 = list5;
                            bVarArr2 = bVarArr;
                            str30 = str13;
                            controllerFeatures5 = controllerFeatures2;
                        case 1:
                            controllerFeatures2 = controllerFeatures5;
                            list5 = list12;
                            str13 = str30;
                            str14 = str32;
                            bVarArr = bVarArr2;
                            zU5 = cVarC.u(fVar, 1);
                            i12 |= 2;
                            str26 = str14;
                            list12 = list5;
                            bVarArr2 = bVarArr;
                            str30 = str13;
                            controllerFeatures5 = controllerFeatures2;
                        case 2:
                            controllerFeatures2 = controllerFeatures5;
                            list5 = list12;
                            str13 = str30;
                            str14 = str32;
                            bVarArr = bVarArr2;
                            jQ2 = cVarC.q(fVar, 2);
                            i12 |= 4;
                            str26 = str14;
                            list12 = list5;
                            bVarArr2 = bVarArr;
                            str30 = str13;
                            controllerFeatures5 = controllerFeatures2;
                        case 3:
                            controllerFeatures2 = controllerFeatures5;
                            list5 = list12;
                            str13 = str30;
                            str14 = str32;
                            bVarArr = bVarArr2;
                            strW6 = cVarC.w(fVar, 3);
                            i12 |= 8;
                            str26 = str14;
                            list12 = list5;
                            bVarArr2 = bVarArr;
                            str30 = str13;
                            controllerFeatures5 = controllerFeatures2;
                        case 4:
                            controllerFeatures2 = controllerFeatures5;
                            list5 = list12;
                            str13 = str30;
                            str14 = str32;
                            bVarArr = bVarArr2;
                            str27 = (String) cVarC.h(fVar, 4, W0.f25599a, str27);
                            i12 |= 16;
                            str28 = str28;
                            str26 = str14;
                            list12 = list5;
                            bVarArr2 = bVarArr;
                            str30 = str13;
                            controllerFeatures5 = controllerFeatures2;
                        case 5:
                            controllerFeatures2 = controllerFeatures5;
                            list5 = list12;
                            str13 = str30;
                            str14 = str32;
                            bVarArr = bVarArr2;
                            str28 = (String) cVarC.h(fVar, 5, W0.f25599a, str28);
                            i12 |= 32;
                            str29 = str29;
                            str26 = str14;
                            list12 = list5;
                            bVarArr2 = bVarArr;
                            str30 = str13;
                            controllerFeatures5 = controllerFeatures2;
                        case 6:
                            controllerFeatures2 = controllerFeatures5;
                            list5 = list12;
                            str13 = str30;
                            str14 = str32;
                            bVarArr = bVarArr2;
                            str29 = (String) cVarC.h(fVar, 6, W0.f25599a, str29);
                            i12 |= 64;
                            list13 = list13;
                            str26 = str14;
                            list12 = list5;
                            bVarArr2 = bVarArr;
                            str30 = str13;
                            controllerFeatures5 = controllerFeatures2;
                        case 7:
                            controllerFeatures2 = controllerFeatures5;
                            list5 = list12;
                            str13 = str30;
                            str14 = str32;
                            bVarArr = bVarArr2;
                            list13 = (List) cVarC.p(fVar, 7, bVarArr2[7], list13);
                            i12 |= 128;
                            str26 = str14;
                            list12 = list5;
                            bVarArr2 = bVarArr;
                            str30 = str13;
                            controllerFeatures5 = controllerFeatures2;
                        case 8:
                            list6 = list12;
                            str30 = (String) cVarC.h(fVar, 8, W0.f25599a, str30);
                            i12 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            controllerFeatures5 = controllerFeatures5;
                            str26 = str32;
                            list12 = list6;
                        case 9:
                            list6 = list12;
                            i12 |= 512;
                            str26 = (String) cVarC.h(fVar, 9, W0.f25599a, str32);
                            controllerFeatures5 = controllerFeatures5;
                            list12 = list6;
                        case 10:
                            controllerFeatures3 = controllerFeatures5;
                            list7 = list12;
                            strW4 = cVarC.w(fVar, 10);
                            i12 |= 1024;
                            list12 = list7;
                            controllerFeatures5 = controllerFeatures3;
                            str26 = str32;
                        case 11:
                            controllerFeatures3 = controllerFeatures5;
                            list7 = list12;
                            zU6 = cVarC.u(fVar, 11);
                            i12 |= 2048;
                            list12 = list7;
                            controllerFeatures5 = controllerFeatures3;
                            str26 = str32;
                        case 12:
                            controllerFeatures3 = controllerFeatures5;
                            list7 = list12;
                            zU4 = cVarC.u(fVar, 12);
                            i12 |= 4096;
                            list12 = list7;
                            controllerFeatures5 = controllerFeatures3;
                            str26 = str32;
                        case 13:
                            controllerFeatures3 = controllerFeatures5;
                            list12 = (List) cVarC.p(fVar, 13, bVarArr2[13], list12);
                            i12 |= 8192;
                            controllerFeatures5 = controllerFeatures3;
                            str26 = str32;
                        case 14:
                            list4 = list12;
                            list11 = (List) cVarC.p(fVar, 14, bVarArr2[14], list11);
                            i12 |= TLSTM.TLS_MAX_FRAGMENT_SIZE;
                            str26 = str32;
                            list12 = list4;
                        case 15:
                            list4 = list12;
                            controllerLocation3 = (ControllerLocation) cVarC.h(fVar, 15, ControllerLocation.a.f53796a, controllerLocation3);
                            i11 = 32768;
                            i12 |= i11;
                            str26 = str32;
                            list12 = list4;
                        case 16:
                            list4 = list12;
                            hardware3 = (Hardware) cVarC.h(fVar, 16, Hardware.a.f53858a, hardware3);
                            i11 = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                            i12 |= i11;
                            str26 = str32;
                            list12 = list4;
                        case 17:
                            list4 = list12;
                            str25 = (String) cVarC.h(fVar, 17, W0.f25599a, str25);
                            i11 = 131072;
                            i12 |= i11;
                            str26 = str32;
                            list12 = list4;
                        case 18:
                            list4 = list12;
                            availableControllers3 = (AvailableControllers) cVarC.h(fVar, 18, AvailableControllers.a.f53765a, availableControllers3);
                            i11 = 262144;
                            i12 |= i11;
                            str26 = str32;
                            list12 = list4;
                        case 19:
                            list4 = list12;
                            str31 = (String) cVarC.h(fVar, 19, W0.f25599a, str31);
                            i11 = ImageMetadata.LENS_APERTURE;
                            i12 |= i11;
                            str26 = str32;
                            list12 = list4;
                        case 20:
                            list4 = list12;
                            controllerFeatures5 = (ControllerFeatures) cVarC.h(fVar, 20, ControllerFeatures.a.f53789a, controllerFeatures5);
                            i11 = ImageMetadata.SHADING_MODE;
                            i12 |= i11;
                            str26 = str32;
                            list12 = list4;
                        case 21:
                            list4 = list12;
                            str24 = (String) cVarC.h(fVar, 21, W0.f25599a, str24);
                            i11 = 2097152;
                            i12 |= i11;
                            str26 = str32;
                            list12 = list4;
                        case ImageFormat.RGBA_FP16 /* 22 */:
                            list4 = list12;
                            uiDb2 = (UiDb) cVarC.h(fVar, 22, UiDb.a.f53700a, uiDb2);
                            i11 = 4194304;
                            i12 |= i11;
                            str26 = str32;
                            list12 = list4;
                        case 23:
                            list4 = list12;
                            str23 = (String) cVarC.h(fVar, 23, W0.f25599a, str23);
                            i11 = 8388608;
                            i12 |= i11;
                            str26 = str32;
                            list12 = list4;
                        default:
                            throw new UnknownFieldException(iK);
                    }
                }
                str = str27;
                str2 = str30;
                list = list11;
                controllerLocation = controllerLocation3;
                str3 = str23;
                str4 = str24;
                i10 = i12;
                str5 = str31;
                availableControllers = availableControllers3;
                str6 = str25;
                hardware = hardware3;
                uiDb = uiDb2;
                controllerFeatures = controllerFeatures5;
                str7 = strW5;
                str8 = strW6;
                str9 = str28;
                str10 = str29;
                str11 = strW4;
                z10 = zU4;
                list2 = list13;
                str12 = str26;
                list3 = list12;
                z11 = zU5;
                z12 = zU6;
                j10 = jQ2;
            }
            cVarC.b(fVar);
            return new Device(i10, str7, z11, j10, str8, str, str9, str10, list2, str2, str12, str11, z12, z10, list3, list, controllerLocation, hardware, str6, availableControllers, str5, controllerFeatures, str4, uiDb, str3, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, Device value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            Device.n(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.l$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53835a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mb.l$c */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Device createFromParcel(Parcel parcel) {
            AbstractC6492s.i(parcel, "parcel");
            String string = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            long j10 = parcel.readLong();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            boolean z12 = parcel.readInt() != 0;
            int i10 = parcel.readInt();
            boolean z13 = z11;
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            while (i11 != i10) {
                arrayList.add(parcel.readParcelable(Device.class.getClassLoader()));
                i11++;
                i10 = i10;
            }
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int i13 = 0;
            while (i13 != i12) {
                arrayList2.add(parcel.readParcelable(Device.class.getClassLoader()));
                i13++;
                i12 = i12;
            }
            return new Device(string, z10, j10, string2, string3, string4, string5, arrayListCreateStringArrayList, string6, string7, string8, z13, z12, arrayList, arrayList2, parcel.readInt() == 0 ? null : ControllerLocation.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Hardware.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : AvailableControllers.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : ControllerFeatures.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? UiDb.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Device[] newArray(int i10) {
            return new Device[i10];
        }
    }

    static {
        C3704f c3704f = new C3704f(W0.f25599a);
        x.Companion companion = x.INSTANCE;
        f53810y = new Vi.b[]{null, null, null, null, null, null, null, c3704f, null, null, null, null, null, new C3704f(companion.serializer()), new C3704f(companion.serializer()), null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ Device(int i10, String str, boolean z10, long j10, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, boolean z11, boolean z12, List list2, List list3, ControllerLocation controllerLocation, Hardware hardware, String str9, AvailableControllers availableControllers, String str10, ControllerFeatures controllerFeatures, String str11, UiDb uiDb, String str12, R0 r02) {
        this.id = (i10 & 1) == 0 ? "ID" : str;
        if ((i10 & 2) == 0) {
            this.owner = false;
        } else {
            this.owner = z10;
        }
        this.lastConnectionStateChange = (i10 & 4) == 0 ? 0L : j10;
        this.hardwareId = (i10 & 8) == 0 ? "" : str2;
        if ((i10 & 16) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i10 & 32) == 0) {
            this.mac = null;
        } else {
            this.mac = str4;
        }
        if ((i10 & 64) == 0) {
            this.ip = null;
        } else {
            this.ip = str5;
        }
        this.addresses = (i10 & 128) == 0 ? AbstractC3689v.l() : list;
        if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.hostname = null;
        } else {
            this.hostname = str6;
        }
        if ((i10 & 512) == 0) {
            this.directConnectDomain = null;
        } else {
            this.directConnectDomain = str7;
        }
        this.version = (i10 & 1024) == 0 ? "0.0" : str8;
        if ((i10 & 2048) == 0) {
            this.isConnected = false;
        } else {
            this.isConnected = z11;
        }
        if ((i10 & 4096) == 0) {
            this.isUpdating = false;
        } else {
            this.isUpdating = z12;
        }
        this.controllers = (i10 & 8192) == 0 ? AbstractC3689v.l() : list2;
        this.apps = (i10 & TLSTM.TLS_MAX_FRAGMENT_SIZE) == 0 ? AbstractC3689v.l() : list3;
        if ((32768 & i10) == 0) {
            this.location = null;
        } else {
            this.location = controllerLocation;
        }
        if ((65536 & i10) == 0) {
            this.hardware = null;
        } else {
            this.hardware = hardware;
        }
        if ((131072 & i10) == 0) {
            this.ncaToken = null;
        } else {
            this.ncaToken = str9;
        }
        if ((262144 & i10) == 0) {
            this.availableControllers = null;
        } else {
            this.availableControllers = availableControllers;
        }
        if ((524288 & i10) == 0) {
            this.timezone = null;
        } else {
            this.timezone = str10;
        }
        if ((1048576 & i10) == 0) {
            this.features = null;
        } else {
            this.features = controllerFeatures;
        }
        if ((2097152 & i10) == 0) {
            this.latestAvailableVersion = null;
        } else {
            this.latestAvailableVersion = str11;
        }
        if ((4194304 & i10) == 0) {
            this.uidb = null;
        } else {
            this.uidb = uiDb;
        }
        if ((i10 & 8388608) == 0) {
            this.anonid = null;
        } else {
            this.anonid = str12;
        }
    }

    public static final /* synthetic */ void n(Device self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f53810y;
        if (output.o(serialDesc, 0) || !AbstractC6492s.d(self.id, "ID")) {
            output.y(serialDesc, 0, self.id);
        }
        if (output.o(serialDesc, 1) || self.owner) {
            output.i(serialDesc, 1, self.owner);
        }
        if (output.o(serialDesc, 2) || self.lastConnectionStateChange != 0) {
            output.p(serialDesc, 2, self.lastConnectionStateChange);
        }
        if (output.o(serialDesc, 3) || !AbstractC6492s.d(self.hardwareId, "")) {
            output.y(serialDesc, 3, self.hardwareId);
        }
        if (output.o(serialDesc, 4) || self.name != null) {
            output.t(serialDesc, 4, W0.f25599a, self.name);
        }
        if (output.o(serialDesc, 5) || self.mac != null) {
            output.t(serialDesc, 5, W0.f25599a, self.mac);
        }
        if (output.o(serialDesc, 6) || self.ip != null) {
            output.t(serialDesc, 6, W0.f25599a, self.ip);
        }
        if (output.o(serialDesc, 7) || !AbstractC6492s.d(self.addresses, AbstractC3689v.l())) {
            output.q(serialDesc, 7, bVarArr[7], self.addresses);
        }
        if (output.o(serialDesc, 8) || self.hostname != null) {
            output.t(serialDesc, 8, W0.f25599a, self.hostname);
        }
        if (output.o(serialDesc, 9) || self.directConnectDomain != null) {
            output.t(serialDesc, 9, W0.f25599a, self.directConnectDomain);
        }
        if (output.o(serialDesc, 10) || !AbstractC6492s.d(self.version, "0.0")) {
            output.y(serialDesc, 10, self.version);
        }
        if (output.o(serialDesc, 11) || self.isConnected) {
            output.i(serialDesc, 11, self.isConnected);
        }
        if (output.o(serialDesc, 12) || self.isUpdating) {
            output.i(serialDesc, 12, self.isUpdating);
        }
        if (output.o(serialDesc, 13) || !AbstractC6492s.d(self.controllers, AbstractC3689v.l())) {
            output.q(serialDesc, 13, bVarArr[13], self.controllers);
        }
        if (output.o(serialDesc, 14) || !AbstractC6492s.d(self.apps, AbstractC3689v.l())) {
            output.q(serialDesc, 14, bVarArr[14], self.apps);
        }
        if (output.o(serialDesc, 15) || self.location != null) {
            output.t(serialDesc, 15, ControllerLocation.a.f53796a, self.location);
        }
        if (output.o(serialDesc, 16) || self.hardware != null) {
            output.t(serialDesc, 16, Hardware.a.f53858a, self.hardware);
        }
        if (output.o(serialDesc, 17) || self.ncaToken != null) {
            output.t(serialDesc, 17, W0.f25599a, self.ncaToken);
        }
        if (output.o(serialDesc, 18) || self.availableControllers != null) {
            output.t(serialDesc, 18, AvailableControllers.a.f53765a, self.availableControllers);
        }
        if (output.o(serialDesc, 19) || self.timezone != null) {
            output.t(serialDesc, 19, W0.f25599a, self.timezone);
        }
        if (output.o(serialDesc, 20) || self.features != null) {
            output.t(serialDesc, 20, ControllerFeatures.a.f53789a, self.features);
        }
        if (output.o(serialDesc, 21) || self.latestAvailableVersion != null) {
            output.t(serialDesc, 21, W0.f25599a, self.latestAvailableVersion);
        }
        if (output.o(serialDesc, 22) || self.uidb != null) {
            output.t(serialDesc, 22, UiDb.a.f53700a, self.uidb);
        }
        if (!output.o(serialDesc, 23) && self.anonid == null) {
            return;
        }
        output.t(serialDesc, 23, W0.f25599a, self.anonid);
    }

    /* renamed from: b, reason: from getter */
    public final String getAnonid() {
        return this.anonid;
    }

    /* renamed from: c, reason: from getter */
    public final List getControllers() {
        return this.controllers;
    }

    /* renamed from: d, reason: from getter */
    public final ControllerFeatures getFeatures() {
        return this.features;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final Hardware getHardware() {
        return this.hardware;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Device)) {
            return false;
        }
        Device device = (Device) other;
        return AbstractC6492s.d(this.id, device.id) && this.owner == device.owner && this.lastConnectionStateChange == device.lastConnectionStateChange && AbstractC6492s.d(this.hardwareId, device.hardwareId) && AbstractC6492s.d(this.name, device.name) && AbstractC6492s.d(this.mac, device.mac) && AbstractC6492s.d(this.ip, device.ip) && AbstractC6492s.d(this.addresses, device.addresses) && AbstractC6492s.d(this.hostname, device.hostname) && AbstractC6492s.d(this.directConnectDomain, device.directConnectDomain) && AbstractC6492s.d(this.version, device.version) && this.isConnected == device.isConnected && this.isUpdating == device.isUpdating && AbstractC6492s.d(this.controllers, device.controllers) && AbstractC6492s.d(this.apps, device.apps) && AbstractC6492s.d(this.location, device.location) && AbstractC6492s.d(this.hardware, device.hardware) && AbstractC6492s.d(this.ncaToken, device.ncaToken) && AbstractC6492s.d(this.availableControllers, device.availableControllers) && AbstractC6492s.d(this.timezone, device.timezone) && AbstractC6492s.d(this.features, device.features) && AbstractC6492s.d(this.latestAvailableVersion, device.latestAvailableVersion) && AbstractC6492s.d(this.uidb, device.uidb) && AbstractC6492s.d(this.anonid, device.anonid);
    }

    /* renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: g, reason: from getter */
    public final ControllerLocation getLocation() {
        return this.location;
    }

    /* renamed from: h, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + Boolean.hashCode(this.owner)) * 31) + Long.hashCode(this.lastConnectionStateChange)) * 31) + this.hardwareId.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mac;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ip;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.addresses.hashCode()) * 31;
        String str4 = this.hostname;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.directConnectDomain;
        int iHashCode6 = (((((((((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.version.hashCode()) * 31) + Boolean.hashCode(this.isConnected)) * 31) + Boolean.hashCode(this.isUpdating)) * 31) + this.controllers.hashCode()) * 31) + this.apps.hashCode()) * 31;
        ControllerLocation controllerLocation = this.location;
        int iHashCode7 = (iHashCode6 + (controllerLocation == null ? 0 : controllerLocation.hashCode())) * 31;
        Hardware hardware = this.hardware;
        int iHashCode8 = (iHashCode7 + (hardware == null ? 0 : hardware.hashCode())) * 31;
        String str6 = this.ncaToken;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        AvailableControllers availableControllers = this.availableControllers;
        int iHashCode10 = (iHashCode9 + (availableControllers == null ? 0 : availableControllers.hashCode())) * 31;
        String str7 = this.timezone;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ControllerFeatures controllerFeatures = this.features;
        int iHashCode12 = (iHashCode11 + (controllerFeatures == null ? 0 : controllerFeatures.hashCode())) * 31;
        String str8 = this.latestAvailableVersion;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        UiDb uiDb = this.uidb;
        int iHashCode14 = (iHashCode13 + (uiDb == null ? 0 : uiDb.hashCode())) * 31;
        String str9 = this.anonid;
        return iHashCode14 + (str9 != null ? str9.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: j, reason: from getter */
    public final String getNcaToken() {
        return this.ncaToken;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getOwner() {
        return this.owner;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsUpdating() {
        return this.isUpdating;
    }

    public String toString() {
        return "Device(id=" + this.id + ", owner=" + this.owner + ", lastConnectionStateChange=" + this.lastConnectionStateChange + ", hardwareId=" + this.hardwareId + ", name=" + this.name + ", mac=" + this.mac + ", ip=" + this.ip + ", addresses=" + this.addresses + ", hostname=" + this.hostname + ", directConnectDomain=" + this.directConnectDomain + ", version=" + this.version + ", isConnected=" + this.isConnected + ", isUpdating=" + this.isUpdating + ", controllers=" + this.controllers + ", apps=" + this.apps + ", location=" + this.location + ", hardware=" + this.hardware + ", ncaToken=" + this.ncaToken + ", availableControllers=" + this.availableControllers + ", timezone=" + this.timezone + ", features=" + this.features + ", latestAvailableVersion=" + this.latestAvailableVersion + ", uidb=" + this.uidb + ", anonid=" + this.anonid + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC6492s.i(dest, "dest");
        dest.writeString(this.id);
        dest.writeInt(this.owner ? 1 : 0);
        dest.writeLong(this.lastConnectionStateChange);
        dest.writeString(this.hardwareId);
        dest.writeString(this.name);
        dest.writeString(this.mac);
        dest.writeString(this.ip);
        dest.writeStringList(this.addresses);
        dest.writeString(this.hostname);
        dest.writeString(this.directConnectDomain);
        dest.writeString(this.version);
        dest.writeInt(this.isConnected ? 1 : 0);
        dest.writeInt(this.isUpdating ? 1 : 0);
        List list = this.controllers;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        List list2 = this.apps;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        ControllerLocation controllerLocation = this.location;
        if (controllerLocation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            controllerLocation.writeToParcel(dest, flags);
        }
        Hardware hardware = this.hardware;
        if (hardware == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hardware.writeToParcel(dest, flags);
        }
        dest.writeString(this.ncaToken);
        AvailableControllers availableControllers = this.availableControllers;
        if (availableControllers == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            availableControllers.writeToParcel(dest, flags);
        }
        dest.writeString(this.timezone);
        ControllerFeatures controllerFeatures = this.features;
        if (controllerFeatures == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            controllerFeatures.writeToParcel(dest, flags);
        }
        dest.writeString(this.latestAvailableVersion);
        UiDb uiDb = this.uidb;
        if (uiDb == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            uiDb.writeToParcel(dest, flags);
        }
        dest.writeString(this.anonid);
    }

    public Device(String id2, boolean z10, long j10, String hardwareId, String str, String str2, String str3, List addresses, String str4, String str5, String version, boolean z11, boolean z12, List controllers, List apps, ControllerLocation controllerLocation, Hardware hardware, String str6, AvailableControllers availableControllers, String str7, ControllerFeatures controllerFeatures, String str8, UiDb uiDb, String str9) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(hardwareId, "hardwareId");
        AbstractC6492s.i(addresses, "addresses");
        AbstractC6492s.i(version, "version");
        AbstractC6492s.i(controllers, "controllers");
        AbstractC6492s.i(apps, "apps");
        this.id = id2;
        this.owner = z10;
        this.lastConnectionStateChange = j10;
        this.hardwareId = hardwareId;
        this.name = str;
        this.mac = str2;
        this.ip = str3;
        this.addresses = addresses;
        this.hostname = str4;
        this.directConnectDomain = str5;
        this.version = version;
        this.isConnected = z11;
        this.isUpdating = z12;
        this.controllers = controllers;
        this.apps = apps;
        this.location = controllerLocation;
        this.hardware = hardware;
        this.ncaToken = str6;
        this.availableControllers = availableControllers;
        this.timezone = str7;
        this.features = controllerFeatures;
        this.latestAvailableVersion = str8;
        this.uidb = uiDb;
        this.anonid = str9;
    }
}
