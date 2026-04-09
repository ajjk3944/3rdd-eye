package mb;

import Zi.C0;
import Zi.C3704f;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import com.google.ar.core.ImageMetadata;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import mb.ControllerFeatures;
import mb.ControllerLocation;
import mb.FirmwareUpdate;
import mb.Hardware;
import mb.UiDb;
import mb.m;
import mb.x;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.transport.TLSTM;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0001\u0018\u0000 S2\u00020\u0001:\u0002,0Bë\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J'\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b8\u0010-\u001a\u0004\b:\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b<\u0010/R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b0\u0010?R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\b6\u0010?R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\b4\u0010?R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b.\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b:\u0010G\u001a\u0004\bC\u0010HR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010-\u0012\u0004\bJ\u0010A\u001a\u0004\bI\u0010/R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\bK\u0010/R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b1\u0010L\u001a\u0004\b=\u0010MR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bI\u0010-\u001a\u0004\b;\u0010/R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b5\u0010N\u001a\u0004\bB\u0010OR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bK\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010-\u001a\u0004\b2\u0010/¨\u0006T"}, d2 = {"Lmb/B;", "", "", "seen0", "", "hostname", "name", "version", "state", "Lmb/m;", "deviceState", GenericAddress.TYPE_IP, "mac", "", "addresses", "Lmb/x;", "controllers", "apps", "Lmb/h;", "location", "Lmb/p;", "hardware", "ncaToken", "timezone", "Lmb/f;", "features", "directConnectDomain", "Lmb/o;", "firmwareUpdate", "Lmb/C;", "uidb", "anonid", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmb/m;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lmb/h;Lmb/p;Ljava/lang/String;Ljava/lang/String;Lmb/f;Ljava/lang/String;Lmb/o;Lmb/C;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_SECURITY_NAME, "(Lmb/B;LYi/d;LXi/f;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "k", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_OPERATION, SnmpConfigurator.O_COMMUNITY, SnmpConfigurator.O_TIMEOUT, "d", "q", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lmb/m;", "f", "()Lmb/m;", "l", "g", SnmpConfigurator.O_CONTEXT_NAME, "h", "Ljava/util/List;", "()Ljava/util/List;", "getAddresses$annotations", "()V", "i", "j", "Lmb/h;", "m", "()Lmb/h;", "Lmb/p;", "()Lmb/p;", "p", "getNcaToken$annotations", SnmpConfigurator.O_RETRIES, "Lmb/f;", "()Lmb/f;", "Lmb/o;", "()Lmb/o;", "Lmb/C;", "s", "()Lmb/C;", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6786B {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: t, reason: collision with root package name */
    private static final Vi.b[] f53676t;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String hostname;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String version;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m deviceState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String ip;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String mac;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List addresses;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List controllers;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List apps;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ControllerLocation location;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Hardware hardware;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String ncaToken;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String timezone;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final ControllerFeatures features;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final String directConnectDomain;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final FirmwareUpdate firmwareUpdate;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final UiDb uidb;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final String anonid;

    /* renamed from: mb.B$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53696a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53696a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.devices.UcoreState", aVar, 19);
            h02.p("hostname", true);
            h02.p("name", true);
            h02.p("version", false);
            h02.p("state", false);
            h02.p("deviceState", true);
            h02.p(GenericAddress.TYPE_IP, true);
            h02.p("mac", true);
            h02.p("ipAddrs", true);
            h02.p("controllers", false);
            h02.p("apps", false);
            h02.p("location", true);
            h02.p("hardware", true);
            h02.p("auth_token", true);
            h02.p("timezone", true);
            h02.p("features", true);
            h02.p("directConnectDomain", true);
            h02.p("firmwareUpdate", true);
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
            Vi.b[] bVarArr = C6786B.f53676t;
            W0 w02 = W0.f25599a;
            return new Vi.b[]{Wi.a.u(w02), Wi.a.u(w02), w02, w02, Wi.a.u(m.b.f53836f), Wi.a.u(w02), Wi.a.u(w02), Wi.a.u(bVarArr[7]), bVarArr[8], bVarArr[9], Wi.a.u(ControllerLocation.a.f53796a), Wi.a.u(Hardware.a.f53858a), Wi.a.u(w02), Wi.a.u(w02), Wi.a.u(ControllerFeatures.a.f53789a), Wi.a.u(w02), Wi.a.u(FirmwareUpdate.a.f53853a), Wi.a.u(UiDb.a.f53700a), Wi.a.u(w02)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C6786B c(Yi.e decoder) {
            String str;
            int i10;
            List list;
            Hardware pVar;
            String str2;
            UiDb c6787c;
            FirmwareUpdate oVar;
            ControllerFeatures c6793f;
            String str3;
            ControllerLocation hVar;
            List list2;
            String str4;
            String str5;
            String str6;
            String str7;
            m mVar;
            String str8;
            String str9;
            List list3;
            String str10;
            List list4;
            int i11;
            Vi.b[] bVarArr;
            String str11;
            List list5;
            List list6;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr2 = C6786B.f53676t;
            ControllerFeatures c6793f2 = null;
            if (cVarC.B()) {
                W0 w02 = W0.f25599a;
                String str12 = (String) cVarC.h(fVar, 0, w02, null);
                String str13 = (String) cVarC.h(fVar, 1, w02, null);
                String strW = cVarC.w(fVar, 2);
                String strW2 = cVarC.w(fVar, 3);
                m mVar2 = (m) cVarC.h(fVar, 4, m.b.f53836f, null);
                String str14 = (String) cVarC.h(fVar, 5, w02, null);
                String str15 = (String) cVarC.h(fVar, 6, w02, null);
                List list7 = (List) cVarC.h(fVar, 7, bVarArr2[7], null);
                List list8 = (List) cVarC.p(fVar, 8, bVarArr2[8], null);
                List list9 = (List) cVarC.p(fVar, 9, bVarArr2[9], null);
                ControllerLocation hVar2 = (ControllerLocation) cVarC.h(fVar, 10, ControllerLocation.a.f53796a, null);
                Hardware pVar2 = (Hardware) cVarC.h(fVar, 11, Hardware.a.f53858a, null);
                String str16 = (String) cVarC.h(fVar, 12, w02, null);
                String str17 = (String) cVarC.h(fVar, 13, w02, null);
                ControllerFeatures c6793f3 = (ControllerFeatures) cVarC.h(fVar, 14, ControllerFeatures.a.f53789a, null);
                String str18 = (String) cVarC.h(fVar, 15, w02, null);
                FirmwareUpdate oVar2 = (FirmwareUpdate) cVarC.h(fVar, 16, FirmwareUpdate.a.f53853a, null);
                c6787c = (UiDb) cVarC.h(fVar, 17, UiDb.a.f53700a, null);
                str10 = (String) cVarC.h(fVar, 18, w02, null);
                i10 = 524287;
                str5 = strW;
                list3 = list7;
                list = list8;
                str7 = str13;
                str = str12;
                str8 = str14;
                str9 = str15;
                hVar = hVar2;
                str6 = strW2;
                str2 = str16;
                oVar = oVar2;
                c6793f = c6793f3;
                str3 = str18;
                str4 = str17;
                pVar = pVar2;
                mVar = mVar2;
                list2 = list9;
            } else {
                boolean z10 = true;
                int i12 = 0;
                List list10 = null;
                String str19 = null;
                Hardware pVar3 = null;
                String str20 = null;
                UiDb c6787c2 = null;
                FirmwareUpdate oVar3 = null;
                String str21 = null;
                ControllerLocation hVar3 = null;
                List list11 = null;
                List list12 = null;
                String str22 = null;
                String strW3 = null;
                String strW4 = null;
                String str23 = null;
                String str24 = null;
                m mVar3 = null;
                String str25 = null;
                String str26 = null;
                while (z10) {
                    List list13 = list12;
                    int iK = cVarC.k(fVar);
                    switch (iK) {
                        case -1:
                            bVarArr = bVarArr2;
                            str11 = str19;
                            list5 = list13;
                            z10 = false;
                            list12 = list5;
                            str19 = str11;
                            bVarArr2 = bVarArr;
                        case 0:
                            bVarArr = bVarArr2;
                            str11 = str19;
                            list5 = list13;
                            str23 = (String) cVarC.h(fVar, 0, W0.f25599a, str23);
                            i12 |= 1;
                            list10 = list10;
                            str24 = str24;
                            list12 = list5;
                            str19 = str11;
                            bVarArr2 = bVarArr;
                        case 1:
                            bVarArr = bVarArr2;
                            str11 = str19;
                            list5 = list13;
                            str24 = (String) cVarC.h(fVar, 1, W0.f25599a, str24);
                            i12 |= 2;
                            list10 = list10;
                            mVar3 = mVar3;
                            list12 = list5;
                            str19 = str11;
                            bVarArr2 = bVarArr;
                        case 2:
                            bVarArr = bVarArr2;
                            str11 = str19;
                            list5 = list13;
                            list6 = list10;
                            strW3 = cVarC.w(fVar, 2);
                            i12 |= 4;
                            list10 = list6;
                            list12 = list5;
                            str19 = str11;
                            bVarArr2 = bVarArr;
                        case 3:
                            bVarArr = bVarArr2;
                            str11 = str19;
                            list5 = list13;
                            list6 = list10;
                            strW4 = cVarC.w(fVar, 3);
                            i12 |= 8;
                            list10 = list6;
                            list12 = list5;
                            str19 = str11;
                            bVarArr2 = bVarArr;
                        case 4:
                            bVarArr = bVarArr2;
                            str11 = str19;
                            list5 = list13;
                            mVar3 = (m) cVarC.h(fVar, 4, m.b.f53836f, mVar3);
                            i12 |= 16;
                            list10 = list10;
                            str25 = str25;
                            list12 = list5;
                            str19 = str11;
                            bVarArr2 = bVarArr;
                        case 5:
                            bVarArr = bVarArr2;
                            str11 = str19;
                            list5 = list13;
                            str25 = (String) cVarC.h(fVar, 5, W0.f25599a, str25);
                            i12 |= 32;
                            list10 = list10;
                            str26 = str26;
                            list12 = list5;
                            str19 = str11;
                            bVarArr2 = bVarArr;
                        case 6:
                            bVarArr = bVarArr2;
                            str11 = str19;
                            list6 = list10;
                            list5 = list13;
                            str26 = (String) cVarC.h(fVar, 6, W0.f25599a, str26);
                            i12 |= 64;
                            list10 = list6;
                            list12 = list5;
                            str19 = str11;
                            bVarArr2 = bVarArr;
                        case 7:
                            str11 = str19;
                            bVarArr = bVarArr2;
                            i12 |= 128;
                            list12 = (List) cVarC.h(fVar, 7, bVarArr2[7], list13);
                            list10 = list10;
                            str19 = str11;
                            bVarArr2 = bVarArr;
                        case 8:
                            String str27 = str19;
                            List list14 = (List) cVarC.p(fVar, 8, bVarArr2[8], list10);
                            i12 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            list10 = list14;
                            str19 = str27;
                            list12 = list13;
                        case 9:
                            list4 = list10;
                            list11 = (List) cVarC.p(fVar, 9, bVarArr2[9], list11);
                            i12 |= 512;
                            list12 = list13;
                            list10 = list4;
                        case 10:
                            list4 = list10;
                            hVar3 = (ControllerLocation) cVarC.h(fVar, 10, ControllerLocation.a.f53796a, hVar3);
                            i12 |= 1024;
                            list12 = list13;
                            list10 = list4;
                        case 11:
                            list4 = list10;
                            pVar3 = (Hardware) cVarC.h(fVar, 11, Hardware.a.f53858a, pVar3);
                            i12 |= 2048;
                            list12 = list13;
                            list10 = list4;
                        case 12:
                            list4 = list10;
                            str20 = (String) cVarC.h(fVar, 12, W0.f25599a, str20);
                            i12 |= 4096;
                            list12 = list13;
                            list10 = list4;
                        case 13:
                            list4 = list10;
                            str22 = (String) cVarC.h(fVar, 13, W0.f25599a, str22);
                            i12 |= 8192;
                            list12 = list13;
                            list10 = list4;
                        case 14:
                            list4 = list10;
                            c6793f2 = (ControllerFeatures) cVarC.h(fVar, 14, ControllerFeatures.a.f53789a, c6793f2);
                            i12 |= TLSTM.TLS_MAX_FRAGMENT_SIZE;
                            list12 = list13;
                            list10 = list4;
                        case 15:
                            list4 = list10;
                            str21 = (String) cVarC.h(fVar, 15, W0.f25599a, str21);
                            i11 = 32768;
                            i12 |= i11;
                            list12 = list13;
                            list10 = list4;
                        case 16:
                            list4 = list10;
                            oVar3 = (FirmwareUpdate) cVarC.h(fVar, 16, FirmwareUpdate.a.f53853a, oVar3);
                            i11 = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                            i12 |= i11;
                            list12 = list13;
                            list10 = list4;
                        case 17:
                            list4 = list10;
                            c6787c2 = (UiDb) cVarC.h(fVar, 17, UiDb.a.f53700a, c6787c2);
                            i11 = 131072;
                            i12 |= i11;
                            list12 = list13;
                            list10 = list4;
                        case 18:
                            list4 = list10;
                            str19 = (String) cVarC.h(fVar, 18, W0.f25599a, str19);
                            i11 = 262144;
                            i12 |= i11;
                            list12 = list13;
                            list10 = list4;
                        default:
                            throw new UnknownFieldException(iK);
                    }
                }
                str = str23;
                i10 = i12;
                list = list10;
                pVar = pVar3;
                str2 = str20;
                c6787c = c6787c2;
                oVar = oVar3;
                c6793f = c6793f2;
                str3 = str21;
                hVar = hVar3;
                list2 = list11;
                str4 = str22;
                str5 = strW3;
                str6 = strW4;
                str7 = str24;
                mVar = mVar3;
                str8 = str25;
                str9 = str26;
                list3 = list12;
                str10 = str19;
            }
            cVarC.b(fVar);
            return new C6786B(i10, str, str7, str5, str6, mVar, str8, str9, list3, list, list2, hVar, pVar, str2, str4, c6793f, str3, oVar, c6787c, str10, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, C6786B value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            C6786B.u(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.B$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53696a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C3704f c3704f = new C3704f(W0.f25599a);
        x.Companion companion = x.INSTANCE;
        f53676t = new Vi.b[]{null, null, null, null, null, null, null, c3704f, new C3704f(companion.serializer()), new C3704f(companion.serializer()), null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ C6786B(int i10, String str, String str2, String str3, String str4, m mVar, String str5, String str6, List list, List list2, List list3, ControllerLocation hVar, Hardware pVar, String str7, String str8, ControllerFeatures c6793f, String str9, FirmwareUpdate oVar, UiDb c6787c, String str10, R0 r02) {
        if (780 != (i10 & 780)) {
            C0.a(i10, 780, a.f53696a.a());
        }
        if ((i10 & 1) == 0) {
            this.hostname = null;
        } else {
            this.hostname = str;
        }
        if ((i10 & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        this.version = str3;
        this.state = str4;
        if ((i10 & 16) == 0) {
            this.deviceState = null;
        } else {
            this.deviceState = mVar;
        }
        if ((i10 & 32) == 0) {
            this.ip = null;
        } else {
            this.ip = str5;
        }
        if ((i10 & 64) == 0) {
            this.mac = null;
        } else {
            this.mac = str6;
        }
        if ((i10 & 128) == 0) {
            this.addresses = null;
        } else {
            this.addresses = list;
        }
        this.controllers = list2;
        this.apps = list3;
        if ((i10 & 1024) == 0) {
            this.location = null;
        } else {
            this.location = hVar;
        }
        if ((i10 & 2048) == 0) {
            this.hardware = null;
        } else {
            this.hardware = pVar;
        }
        if ((i10 & 4096) == 0) {
            this.ncaToken = null;
        } else {
            this.ncaToken = str7;
        }
        if ((i10 & 8192) == 0) {
            this.timezone = null;
        } else {
            this.timezone = str8;
        }
        if ((i10 & TLSTM.TLS_MAX_FRAGMENT_SIZE) == 0) {
            this.features = null;
        } else {
            this.features = c6793f;
        }
        if ((32768 & i10) == 0) {
            this.directConnectDomain = null;
        } else {
            this.directConnectDomain = str9;
        }
        if ((65536 & i10) == 0) {
            this.firmwareUpdate = null;
        } else {
            this.firmwareUpdate = oVar;
        }
        if ((131072 & i10) == 0) {
            this.uidb = null;
        } else {
            this.uidb = c6787c;
        }
        if ((i10 & 262144) == 0) {
            this.anonid = null;
        } else {
            this.anonid = str10;
        }
    }

    public static final /* synthetic */ void u(C6786B self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f53676t;
        if (output.o(serialDesc, 0) || self.hostname != null) {
            output.t(serialDesc, 0, W0.f25599a, self.hostname);
        }
        if (output.o(serialDesc, 1) || self.name != null) {
            output.t(serialDesc, 1, W0.f25599a, self.name);
        }
        output.y(serialDesc, 2, self.version);
        output.y(serialDesc, 3, self.state);
        if (output.o(serialDesc, 4) || self.deviceState != null) {
            output.t(serialDesc, 4, m.b.f53836f, self.deviceState);
        }
        if (output.o(serialDesc, 5) || self.ip != null) {
            output.t(serialDesc, 5, W0.f25599a, self.ip);
        }
        if (output.o(serialDesc, 6) || self.mac != null) {
            output.t(serialDesc, 6, W0.f25599a, self.mac);
        }
        if (output.o(serialDesc, 7) || self.addresses != null) {
            output.t(serialDesc, 7, bVarArr[7], self.addresses);
        }
        output.q(serialDesc, 8, bVarArr[8], self.controllers);
        output.q(serialDesc, 9, bVarArr[9], self.apps);
        if (output.o(serialDesc, 10) || self.location != null) {
            output.t(serialDesc, 10, ControllerLocation.a.f53796a, self.location);
        }
        if (output.o(serialDesc, 11) || self.hardware != null) {
            output.t(serialDesc, 11, Hardware.a.f53858a, self.hardware);
        }
        if (output.o(serialDesc, 12) || self.ncaToken != null) {
            output.t(serialDesc, 12, W0.f25599a, self.ncaToken);
        }
        if (output.o(serialDesc, 13) || self.timezone != null) {
            output.t(serialDesc, 13, W0.f25599a, self.timezone);
        }
        if (output.o(serialDesc, 14) || self.features != null) {
            output.t(serialDesc, 14, ControllerFeatures.a.f53789a, self.features);
        }
        if (output.o(serialDesc, 15) || self.directConnectDomain != null) {
            output.t(serialDesc, 15, W0.f25599a, self.directConnectDomain);
        }
        if (output.o(serialDesc, 16) || self.firmwareUpdate != null) {
            output.t(serialDesc, 16, FirmwareUpdate.a.f53853a, self.firmwareUpdate);
        }
        if (output.o(serialDesc, 17) || self.uidb != null) {
            output.t(serialDesc, 17, UiDb.a.f53700a, self.uidb);
        }
        if (!output.o(serialDesc, 18) && self.anonid == null) {
            return;
        }
        output.t(serialDesc, 18, W0.f25599a, self.anonid);
    }

    /* renamed from: b, reason: from getter */
    public final List getAddresses() {
        return this.addresses;
    }

    /* renamed from: c, reason: from getter */
    public final String getAnonid() {
        return this.anonid;
    }

    /* renamed from: d, reason: from getter */
    public final List getApps() {
        return this.apps;
    }

    /* renamed from: e, reason: from getter */
    public final List getControllers() {
        return this.controllers;
    }

    /* renamed from: f, reason: from getter */
    public final m getDeviceState() {
        return this.deviceState;
    }

    /* renamed from: g, reason: from getter */
    public final String getDirectConnectDomain() {
        return this.directConnectDomain;
    }

    /* renamed from: h, reason: from getter */
    public final ControllerFeatures getFeatures() {
        return this.features;
    }

    /* renamed from: i, reason: from getter */
    public final FirmwareUpdate getFirmwareUpdate() {
        return this.firmwareUpdate;
    }

    /* renamed from: j, reason: from getter */
    public final Hardware getHardware() {
        return this.hardware;
    }

    /* renamed from: k, reason: from getter */
    public final String getHostname() {
        return this.hostname;
    }

    /* renamed from: l, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* renamed from: m, reason: from getter */
    public final ControllerLocation getLocation() {
        return this.location;
    }

    /* renamed from: n, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* renamed from: o, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: p, reason: from getter */
    public final String getNcaToken() {
        return this.ncaToken;
    }

    /* renamed from: q, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: r, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    /* renamed from: s, reason: from getter */
    public final UiDb getUidb() {
        return this.uidb;
    }

    /* renamed from: t, reason: from getter */
    public final String getVersion() {
        return this.version;
    }
}
