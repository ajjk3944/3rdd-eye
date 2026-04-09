package mb;

import Zi.C3710i;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W;
import Zi.W0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import mb.ControllerUi;
import mb.g;
import mb.i;
import mb.j;
import org.conscrypt.PSKKeyManager;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Vi.m("unknown")
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b'\b\u0081\b\u0018\u0000 S2\u00020\u0001:\u0002T2B\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0097\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0013\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u001d\u0010'\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0011¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b-\u0010*J\u001a\u00100\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010,R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u00105R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b@\u00105R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b:\u0010IR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\bJ\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010K\u001a\u0004\bL\u0010MR \u0010\u0016\u001a\u00020\u00068\u0016X\u0096D¢\u0006\u0012\n\u0004\bJ\u0010;\u0012\u0004\bN\u0010O\u001a\u0004\bG\u0010,R \u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bL\u0010P\u0012\u0004\bR\u0010O\u001a\u0004\b8\u0010Q¨\u0006U"}, d2 = {"Lmb/E;", "Lmb/x;", "", "isConfigured", "isRunning", "isInstalled", "", "version", "required", "harddriveRequired", "Lmb/g;", "installState", "Lmb/i;", "state", "Lmb/k;", "ui", "updateAvailable", "", "updateProgress", "<init>", "(ZZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmb/g;Lmb/i;Lmb/k;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "name", "Lmb/j;", "controllerType", "LZi/R0;", "serializationConstructorMarker", "(IZZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmb/g;Lmb/i;Lmb/k;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lmb/j;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_RETRIES, "(Lmb/E;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Z", SnmpConfigurator.O_OPERATION, "()Ljava/lang/Boolean;", SnmpConfigurator.O_COMMUNITY, "q", "d", "p", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/lang/String;", "f", "Ljava/lang/Boolean;", "k", "g", "h", "Lmb/g;", "i", "()Lmb/g;", "Lmb/i;", "l", "()Lmb/i;", "j", "Lmb/k;", "()Lmb/k;", "m", "Ljava/lang/Integer;", SnmpConfigurator.O_CONTEXT_NAME, "()Ljava/lang/Integer;", "getName$annotations", "()V", "Lmb/j;", "()Lmb/j;", "getControllerType$annotations", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.E, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class UnknownController extends x {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isConfigured;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRunning;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isInstalled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String version;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean required;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean harddriveRequired;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final g installState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final i state;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final ControllerUi ui;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updateAvailable;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer updateProgress;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final j controllerType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<UnknownController> CREATOR = new c();

    /* renamed from: mb.E$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53718a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53718a = aVar;
            H0 h02 = new H0("unknown", aVar, 13);
            h02.p("isConfigured", true);
            h02.p("isRunning", true);
            h02.p("isInstalled", true);
            h02.p("version", true);
            h02.p("required", true);
            h02.p("harddriveRequired", true);
            h02.p("installState", true);
            h02.p("state", true);
            h02.p("ui", true);
            h02.p("updateAvailable", true);
            h02.p("updateProgress", true);
            h02.p("name", true);
            h02.p("controllerType", true);
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
            C3710i c3710i = C3710i.f25639a;
            W0 w02 = W0.f25599a;
            return new Vi.b[]{c3710i, c3710i, c3710i, Wi.a.u(w02), Wi.a.u(c3710i), Wi.a.u(c3710i), Wi.a.u(g.b.f53790f), Wi.a.u(i.b.f53797f), ControllerUi.a.f53809a, Wi.a.u(w02), Wi.a.u(W.f25597a), w02, j.b.f53799f};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final UnknownController c(Yi.e decoder) {
            boolean z10;
            int i10;
            String str;
            j jVar;
            Integer num;
            String str2;
            i iVar;
            ControllerUi kVar;
            g gVar;
            Boolean bool;
            Boolean bool2;
            String str3;
            boolean z11;
            boolean z12;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            int i11 = 10;
            char c10 = '\t';
            if (cVarC.B()) {
                boolean zU = cVarC.u(fVar, 0);
                boolean zU2 = cVarC.u(fVar, 1);
                boolean zU3 = cVarC.u(fVar, 2);
                W0 w02 = W0.f25599a;
                String str4 = (String) cVarC.h(fVar, 3, w02, null);
                C3710i c3710i = C3710i.f25639a;
                Boolean bool3 = (Boolean) cVarC.h(fVar, 4, c3710i, null);
                Boolean bool4 = (Boolean) cVarC.h(fVar, 5, c3710i, null);
                g gVar2 = (g) cVarC.h(fVar, 6, g.b.f53790f, null);
                i iVar2 = (i) cVarC.h(fVar, 7, i.b.f53797f, null);
                ControllerUi kVar2 = (ControllerUi) cVarC.p(fVar, 8, ControllerUi.a.f53809a, null);
                String str5 = (String) cVarC.h(fVar, 9, w02, null);
                Integer num2 = (Integer) cVarC.h(fVar, 10, W.f25597a, null);
                String strW = cVarC.w(fVar, 11);
                jVar = (j) cVarC.p(fVar, 12, j.b.f53799f, null);
                i10 = 8191;
                bool = bool4;
                num = num2;
                str2 = str5;
                iVar = iVar2;
                gVar = gVar2;
                kVar = kVar2;
                str = str4;
                str3 = strW;
                bool2 = bool3;
                z11 = zU3;
                z12 = zU2;
                z10 = zU;
            } else {
                String str6 = null;
                j jVar2 = null;
                Integer num3 = null;
                String str7 = null;
                i iVar3 = null;
                ControllerUi kVar3 = null;
                g gVar3 = null;
                String strW2 = null;
                boolean z13 = true;
                boolean zU4 = false;
                boolean zU5 = false;
                boolean zU6 = false;
                Boolean bool5 = null;
                int i12 = 0;
                Boolean bool6 = null;
                while (z13) {
                    int iK = cVarC.k(fVar);
                    switch (iK) {
                        case -1:
                            z13 = false;
                        case 0:
                            i12 |= 1;
                            zU4 = cVarC.u(fVar, 0);
                            i11 = 10;
                            c10 = '\t';
                        case 1:
                            zU6 = cVarC.u(fVar, 1);
                            i12 |= 2;
                            i11 = 10;
                            c10 = '\t';
                        case 2:
                            zU5 = cVarC.u(fVar, 2);
                            i12 |= 4;
                            i11 = 10;
                            c10 = '\t';
                        case 3:
                            str6 = (String) cVarC.h(fVar, 3, W0.f25599a, str6);
                            i12 |= 8;
                            i11 = 10;
                            c10 = '\t';
                        case 4:
                            bool6 = (Boolean) cVarC.h(fVar, 4, C3710i.f25639a, bool6);
                            i12 |= 16;
                            i11 = 10;
                            c10 = '\t';
                        case 5:
                            bool5 = (Boolean) cVarC.h(fVar, 5, C3710i.f25639a, bool5);
                            i12 |= 32;
                            i11 = 10;
                            c10 = '\t';
                        case 6:
                            gVar3 = (g) cVarC.h(fVar, 6, g.b.f53790f, gVar3);
                            i12 |= 64;
                            i11 = 10;
                            c10 = '\t';
                        case 7:
                            iVar3 = (i) cVarC.h(fVar, 7, i.b.f53797f, iVar3);
                            i12 |= 128;
                            i11 = 10;
                            c10 = '\t';
                        case 8:
                            kVar3 = (ControllerUi) cVarC.p(fVar, 8, ControllerUi.a.f53809a, kVar3);
                            i12 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            i11 = 10;
                            c10 = '\t';
                        case 9:
                            str7 = (String) cVarC.h(fVar, 9, W0.f25599a, str7);
                            i12 |= 512;
                            c10 = '\t';
                            i11 = 10;
                        case 10:
                            num3 = (Integer) cVarC.h(fVar, i11, W.f25597a, num3);
                            i12 |= 1024;
                            c10 = '\t';
                        case 11:
                            strW2 = cVarC.w(fVar, 11);
                            i12 |= 2048;
                            c10 = '\t';
                        case 12:
                            jVar2 = (j) cVarC.p(fVar, 12, j.b.f53799f, jVar2);
                            i12 |= 4096;
                            c10 = '\t';
                        default:
                            throw new UnknownFieldException(iK);
                    }
                }
                z10 = zU4;
                i10 = i12;
                str = str6;
                jVar = jVar2;
                num = num3;
                str2 = str7;
                iVar = iVar3;
                kVar = kVar3;
                gVar = gVar3;
                bool = bool5;
                bool2 = bool6;
                str3 = strW2;
                z11 = zU5;
                z12 = zU6;
            }
            cVarC.b(fVar);
            return new UnknownController(i10, z10, z12, z11, str, bool2, bool, gVar, iVar, kVar, str2, num, str3, jVar, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, UnknownController value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            UnknownController.r(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.E$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53718a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mb.E$c */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UnknownController createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            AbstractC6492s.i(parcel, "parcel");
            boolean z10 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            boolean z12 = parcel.readInt() != 0;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UnknownController(z10, z11, z12, string, boolValueOf, boolValueOf2, parcel.readInt() == 0 ? null : g.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()), ControllerUi.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UnknownController[] newArray(int i10) {
            return new UnknownController[i10];
        }
    }

    public /* synthetic */ UnknownController(int i10, boolean z10, boolean z11, boolean z12, String str, Boolean bool, Boolean bool2, g gVar, i iVar, ControllerUi kVar, String str2, Integer num, String str3, j jVar, R0 r02) {
        super(i10, r02);
        if ((i10 & 1) == 0) {
            this.isConfigured = false;
        } else {
            this.isConfigured = z10;
        }
        if ((i10 & 2) == 0) {
            this.isRunning = false;
        } else {
            this.isRunning = z11;
        }
        if ((i10 & 4) == 0) {
            this.isInstalled = false;
        } else {
            this.isInstalled = z12;
        }
        if ((i10 & 8) == 0) {
            this.version = null;
        } else {
            this.version = str;
        }
        if ((i10 & 16) == 0) {
            this.required = null;
        } else {
            this.required = bool;
        }
        if ((i10 & 32) == 0) {
            this.harddriveRequired = null;
        } else {
            this.harddriveRequired = bool2;
        }
        if ((i10 & 64) == 0) {
            this.installState = null;
        } else {
            this.installState = gVar;
        }
        if ((i10 & 128) == 0) {
            this.state = null;
        } else {
            this.state = iVar;
        }
        this.ui = (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 ? new ControllerUi(MqttTopic.TOPIC_LEVEL_SEPARATOR, "/dead/end", MqttTopic.TOPIC_LEVEL_SEPARATOR, null, 0, "", null) : kVar;
        if ((i10 & 512) == 0) {
            this.updateAvailable = null;
        } else {
            this.updateAvailable = str2;
        }
        if ((i10 & 1024) == 0) {
            this.updateProgress = null;
        } else {
            this.updateProgress = num;
        }
        this.name = (i10 & 2048) == 0 ? "unknown" : str3;
        this.controllerType = (i10 & 4096) == 0 ? j.UNKNOWN : jVar;
    }

    public static final /* synthetic */ void r(UnknownController self, Yi.d output, Xi.f serialDesc) {
        x.g(self, output, serialDesc);
        if (output.o(serialDesc, 0) || self.o().booleanValue()) {
            output.i(serialDesc, 0, self.o().booleanValue());
        }
        if (output.o(serialDesc, 1) || self.q().booleanValue()) {
            output.i(serialDesc, 1, self.q().booleanValue());
        }
        if (output.o(serialDesc, 2) || self.p().booleanValue()) {
            output.i(serialDesc, 2, self.p().booleanValue());
        }
        if (output.o(serialDesc, 3) || self.getVersion() != null) {
            output.t(serialDesc, 3, W0.f25599a, self.getVersion());
        }
        if (output.o(serialDesc, 4) || self.getRequired() != null) {
            output.t(serialDesc, 4, C3710i.f25639a, self.getRequired());
        }
        if (output.o(serialDesc, 5) || self.getHarddriveRequired() != null) {
            output.t(serialDesc, 5, C3710i.f25639a, self.getHarddriveRequired());
        }
        if (output.o(serialDesc, 6) || self.getInstallState() != null) {
            output.t(serialDesc, 6, g.b.f53790f, self.getInstallState());
        }
        if (output.o(serialDesc, 7) || self.getState() != null) {
            output.t(serialDesc, 7, i.b.f53797f, self.getState());
        }
        if (output.o(serialDesc, 8) || !AbstractC6492s.d(self.getUi(), new ControllerUi(MqttTopic.TOPIC_LEVEL_SEPARATOR, "/dead/end", MqttTopic.TOPIC_LEVEL_SEPARATOR, null, 0, "", null))) {
            output.q(serialDesc, 8, ControllerUi.a.f53809a, self.getUi());
        }
        if (output.o(serialDesc, 9) || self.getUpdateAvailable() != null) {
            output.t(serialDesc, 9, W0.f25599a, self.getUpdateAvailable());
        }
        if (output.o(serialDesc, 10) || self.getUpdateProgress() != null) {
            output.t(serialDesc, 10, W.f25597a, self.getUpdateProgress());
        }
        if (output.o(serialDesc, 11) || !AbstractC6492s.d(self.getName(), "unknown")) {
            output.y(serialDesc, 11, self.getName());
        }
        if (!output.o(serialDesc, 12) && self.getControllerType() == j.UNKNOWN) {
            return;
        }
        output.q(serialDesc, 12, j.b.f53799f, self.getControllerType());
    }

    @Override // mb.x
    /* renamed from: d, reason: from getter */
    public j getControllerType() {
        return this.controllerType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // mb.x
    /* renamed from: e, reason: from getter */
    public ControllerUi getUi() {
        return this.ui;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnknownController)) {
            return false;
        }
        UnknownController unknownController = (UnknownController) other;
        return this.isConfigured == unknownController.isConfigured && this.isRunning == unknownController.isRunning && this.isInstalled == unknownController.isInstalled && AbstractC6492s.d(this.version, unknownController.version) && AbstractC6492s.d(this.required, unknownController.required) && AbstractC6492s.d(this.harddriveRequired, unknownController.harddriveRequired) && this.installState == unknownController.installState && this.state == unknownController.state && AbstractC6492s.d(this.ui, unknownController.ui) && AbstractC6492s.d(this.updateAvailable, unknownController.updateAvailable) && AbstractC6492s.d(this.updateProgress, unknownController.updateProgress);
    }

    @Override // mb.x
    /* renamed from: f, reason: from getter */
    public String getVersion() {
        return this.version;
    }

    /* renamed from: h, reason: from getter */
    public Boolean getHarddriveRequired() {
        return this.harddriveRequired;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isConfigured) * 31) + Boolean.hashCode(this.isRunning)) * 31) + Boolean.hashCode(this.isInstalled)) * 31;
        String str = this.version;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.required;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.harddriveRequired;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        g gVar = this.installState;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        i iVar = this.state;
        int iHashCode6 = (((iHashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.ui.hashCode()) * 31;
        String str2 = this.updateAvailable;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.updateProgress;
        return iHashCode7 + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public g getInstallState() {
        return this.installState;
    }

    /* renamed from: j, reason: from getter */
    public String getName() {
        return this.name;
    }

    /* renamed from: k, reason: from getter */
    public Boolean getRequired() {
        return this.required;
    }

    /* renamed from: l, reason: from getter */
    public i getState() {
        return this.state;
    }

    /* renamed from: m, reason: from getter */
    public String getUpdateAvailable() {
        return this.updateAvailable;
    }

    /* renamed from: n, reason: from getter */
    public Integer getUpdateProgress() {
        return this.updateProgress;
    }

    public Boolean o() {
        return Boolean.valueOf(this.isConfigured);
    }

    public Boolean p() {
        return Boolean.valueOf(this.isInstalled);
    }

    public Boolean q() {
        return Boolean.valueOf(this.isRunning);
    }

    public String toString() {
        return "UnknownController(isConfigured=" + this.isConfigured + ", isRunning=" + this.isRunning + ", isInstalled=" + this.isInstalled + ", version=" + this.version + ", required=" + this.required + ", harddriveRequired=" + this.harddriveRequired + ", installState=" + this.installState + ", state=" + this.state + ", ui=" + this.ui + ", updateAvailable=" + this.updateAvailable + ", updateProgress=" + this.updateProgress + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC6492s.i(dest, "dest");
        dest.writeInt(this.isConfigured ? 1 : 0);
        dest.writeInt(this.isRunning ? 1 : 0);
        dest.writeInt(this.isInstalled ? 1 : 0);
        dest.writeString(this.version);
        Boolean bool = this.required;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.harddriveRequired;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        g gVar = this.installState;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
        i iVar = this.state;
        if (iVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iVar.name());
        }
        this.ui.writeToParcel(dest, flags);
        dest.writeString(this.updateAvailable);
        Integer num = this.updateProgress;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownController(boolean z10, boolean z11, boolean z12, String str, Boolean bool, Boolean bool2, g gVar, i iVar, ControllerUi ui2, String str2, Integer num) {
        super(null);
        AbstractC6492s.i(ui2, "ui");
        this.isConfigured = z10;
        this.isRunning = z11;
        this.isInstalled = z12;
        this.version = str;
        this.required = bool;
        this.harddriveRequired = bool2;
        this.installState = gVar;
        this.state = iVar;
        this.ui = ui2;
        this.updateAvailable = str2;
        this.updateProgress = num;
        this.name = "unknown";
        this.controllerType = j.UNKNOWN;
    }
}
