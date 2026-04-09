package mb;

import Zi.C0;
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
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Vi.m("users")
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b1\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0002^2B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0097\u0001\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0006\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u001d\u0010'\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b-\u0010*J\u001a\u00100\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010,R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\u0012\n\u0004\b;\u00103\u0012\u0004\b=\u00106\u001a\u0004\b<\u0010,R \u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b9\u0010>\u0012\u0004\b@\u00106\u001a\u0004\b;\u0010?R \u0010\u000e\u001a\u00020\r8\u0016X\u0096D¢\u0006\u0012\n\u0004\b4\u0010A\u0012\u0004\bD\u00106\u001a\u0004\bB\u0010CR \u0010\u000f\u001a\u00020\r8\u0016X\u0096D¢\u0006\u0012\n\u0004\bE\u0010A\u0012\u0004\bG\u00106\u001a\u0004\bF\u0010CR \u0010\u0010\u001a\u00020\r8\u0016X\u0096D¢\u0006\u0012\n\u0004\bH\u0010A\u0012\u0004\bJ\u00106\u001a\u0004\bI\u0010CR\"\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bK\u0010L\u0012\u0004\bN\u00106\u001a\u0004\bM\u0010CR\"\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b<\u0010L\u0012\u0004\bO\u00106\u001a\u0004\bH\u0010CR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bM\u0010P\u0012\u0004\bR\u00106\u001a\u0004\bK\u0010QR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bV\u00106\u001a\u0004\bS\u0010UR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bW\u00103\u0012\u0004\bX\u00106\u001a\u0004\bW\u0010,R\"\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bY\u0010Z\u0012\u0004\b\\\u00106\u001a\u0004\bY\u0010[¨\u0006_"}, d2 = {"Lmb/F;", "Lmb/x;", "", "version", "Lmb/k;", "ui", "<init>", "(Ljava/lang/String;Lmb/k;)V", "", "seen0", "name", "Lmb/j;", "controllerType", "", "isConfigured", "isRunning", "isInstalled", "required", "harddriveRequired", "Lmb/g;", "installState", "Lmb/i;", "state", "updateAvailable", "updateProgress", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Lmb/k;Ljava/lang/String;Lmb/j;ZZZLjava/lang/Boolean;Ljava/lang/Boolean;Lmb/g;Lmb/i;Ljava/lang/String;Ljava/lang/Integer;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_RETRIES, "(Lmb/F;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "f", "getVersion$annotations", "()V", SnmpConfigurator.O_COMMUNITY, "Lmb/k;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()Lmb/k;", "d", "j", "getName$annotations", "Lmb/j;", "()Lmb/j;", "getControllerType$annotations", "Z", SnmpConfigurator.O_OPERATION, "()Ljava/lang/Boolean;", "isConfigured$annotations", "g", "q", "isRunning$annotations", "h", "p", "isInstalled$annotations", "i", "Ljava/lang/Boolean;", "k", "getRequired$annotations", "getHarddriveRequired$annotations", "Lmb/g;", "()Lmb/g;", "getInstallState$annotations", "l", "Lmb/i;", "()Lmb/i;", "getState$annotations", "m", "getUpdateAvailable$annotations", SnmpConfigurator.O_CONTEXT_NAME, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getUpdateProgress$annotations", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.F, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class UsersController extends x {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String version;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ControllerUi ui;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j controllerType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isConfigured;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isRunning;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean isInstalled;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Boolean required;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Boolean harddriveRequired;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final g installState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final i state;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String updateAvailable;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Integer updateProgress;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<UsersController> CREATOR = new c();

    /* renamed from: mb.F$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53732a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53732a = aVar;
            H0 h02 = new H0("users", aVar, 13);
            h02.p("uiVersion", true);
            h02.p("ui", false);
            h02.p("name", true);
            h02.p("controllerType", true);
            h02.p("isConfigured", true);
            h02.p("isRunning", true);
            h02.p("isInstalled", true);
            h02.p("required", true);
            h02.p("harddriveRequired", true);
            h02.p("installState", true);
            h02.p("state", true);
            h02.p("updateAvailable", true);
            h02.p("updateProgress", true);
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
            C3710i c3710i = C3710i.f25639a;
            return new Vi.b[]{bVarU, ControllerUi.a.f53809a, w02, j.b.f53799f, c3710i, c3710i, c3710i, Wi.a.u(c3710i), Wi.a.u(c3710i), Wi.a.u(g.b.f53790f), Wi.a.u(i.b.f53797f), Wi.a.u(w02), Wi.a.u(W.f25597a)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final UsersController c(Yi.e decoder) {
            String str;
            int i10;
            ControllerUi controllerUi;
            Integer num;
            String str2;
            g gVar;
            i iVar;
            Boolean bool;
            Boolean bool2;
            j jVar;
            String str3;
            boolean z10;
            boolean z11;
            boolean z12;
            char c10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            int i11 = 10;
            int i12 = 9;
            char c11 = '\b';
            if (cVarC.B()) {
                W0 w02 = W0.f25599a;
                String str4 = (String) cVarC.h(fVar, 0, w02, null);
                ControllerUi controllerUi2 = (ControllerUi) cVarC.p(fVar, 1, ControllerUi.a.f53809a, null);
                String strW = cVarC.w(fVar, 2);
                j jVar2 = (j) cVarC.p(fVar, 3, j.b.f53799f, null);
                boolean zU = cVarC.u(fVar, 4);
                boolean zU2 = cVarC.u(fVar, 5);
                boolean zU3 = cVarC.u(fVar, 6);
                C3710i c3710i = C3710i.f25639a;
                Boolean bool3 = (Boolean) cVarC.h(fVar, 7, c3710i, null);
                Boolean bool4 = (Boolean) cVarC.h(fVar, 8, c3710i, null);
                g gVar2 = (g) cVarC.h(fVar, 9, g.b.f53790f, null);
                i iVar2 = (i) cVarC.h(fVar, 10, i.b.f53797f, null);
                String str5 = (String) cVarC.h(fVar, 11, w02, null);
                num = (Integer) cVarC.h(fVar, 12, W.f25597a, null);
                i10 = 8191;
                controllerUi = controllerUi2;
                iVar = iVar2;
                gVar = gVar2;
                bool2 = bool3;
                z10 = zU3;
                z11 = zU2;
                jVar = jVar2;
                bool = bool4;
                z12 = zU;
                str3 = strW;
                str = str4;
                str2 = str5;
            } else {
                String str6 = null;
                ControllerUi controllerUi3 = null;
                Integer num2 = null;
                String str7 = null;
                g gVar3 = null;
                i iVar3 = null;
                Boolean bool5 = null;
                String strW2 = null;
                boolean z13 = true;
                boolean zU4 = false;
                boolean zU5 = false;
                boolean zU6 = false;
                Boolean bool6 = null;
                int i13 = 0;
                j jVar3 = null;
                while (z13) {
                    int iK = cVarC.k(fVar);
                    switch (iK) {
                        case -1:
                            z13 = false;
                            i12 = 9;
                            c11 = '\b';
                        case 0:
                            str6 = (String) cVarC.h(fVar, 0, W0.f25599a, str6);
                            i13 |= 1;
                            i11 = 10;
                            i12 = 9;
                            c11 = '\b';
                        case 1:
                            controllerUi3 = (ControllerUi) cVarC.p(fVar, 1, ControllerUi.a.f53809a, controllerUi3);
                            i13 |= 2;
                            i11 = 10;
                            i12 = 9;
                            c11 = '\b';
                        case 2:
                            strW2 = cVarC.w(fVar, 2);
                            i13 |= 4;
                            i11 = 10;
                            i12 = 9;
                            c11 = '\b';
                        case 3:
                            jVar3 = (j) cVarC.p(fVar, 3, j.b.f53799f, jVar3);
                            i13 |= 8;
                            i11 = 10;
                            i12 = 9;
                            c11 = '\b';
                        case 4:
                            zU6 = cVarC.u(fVar, 4);
                            i13 |= 16;
                            i11 = 10;
                            c11 = '\b';
                        case 5:
                            zU5 = cVarC.u(fVar, 5);
                            i13 |= 32;
                            i11 = 10;
                            c11 = '\b';
                        case 6:
                            c10 = 7;
                            zU4 = cVarC.u(fVar, 6);
                            i13 |= 64;
                            i11 = 10;
                            c11 = '\b';
                        case 7:
                            c10 = 7;
                            bool6 = (Boolean) cVarC.h(fVar, 7, C3710i.f25639a, bool6);
                            i13 |= 128;
                            i11 = 10;
                            c11 = '\b';
                        case 8:
                            bool5 = (Boolean) cVarC.h(fVar, 8, C3710i.f25639a, bool5);
                            i13 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            c11 = '\b';
                            i11 = 10;
                        case 9:
                            gVar3 = (g) cVarC.h(fVar, i12, g.b.f53790f, gVar3);
                            i13 |= 512;
                            c11 = '\b';
                        case 10:
                            iVar3 = (i) cVarC.h(fVar, i11, i.b.f53797f, iVar3);
                            i13 |= 1024;
                            c11 = '\b';
                        case 11:
                            str7 = (String) cVarC.h(fVar, 11, W0.f25599a, str7);
                            i13 |= 2048;
                            c11 = '\b';
                        case 12:
                            num2 = (Integer) cVarC.h(fVar, 12, W.f25597a, num2);
                            i13 |= 4096;
                            c11 = '\b';
                        default:
                            throw new UnknownFieldException(iK);
                    }
                }
                str = str6;
                i10 = i13;
                controllerUi = controllerUi3;
                num = num2;
                str2 = str7;
                gVar = gVar3;
                iVar = iVar3;
                bool = bool5;
                bool2 = bool6;
                jVar = jVar3;
                str3 = strW2;
                z10 = zU4;
                z11 = zU5;
                z12 = zU6;
            }
            cVarC.b(fVar);
            return new UsersController(i10, str, controllerUi, str3, jVar, z12, z11, z10, bool2, bool, gVar, iVar, str2, num, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, UsersController value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            UsersController.r(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.F$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53732a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mb.F$c */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UsersController createFromParcel(Parcel parcel) {
            AbstractC6492s.i(parcel, "parcel");
            return new UsersController(parcel.readString(), ControllerUi.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UsersController[] newArray(int i10) {
            return new UsersController[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UsersController(int i10, String str, ControllerUi controllerUi, String str2, j jVar, boolean z10, boolean z11, boolean z12, Boolean bool, Boolean bool2, g gVar, i iVar, String str3, Integer num, R0 r02) {
        super(i10, r02);
        if (2 != (i10 & 2)) {
            C0.a(i10, 2, a.f53732a.a());
        }
        if ((i10 & 1) == 0) {
            this.version = null;
        } else {
            this.version = str;
        }
        this.ui = controllerUi;
        this.name = (i10 & 4) == 0 ? "users" : str2;
        this.controllerType = (i10 & 8) == 0 ? j.USERS : jVar;
        if ((i10 & 16) == 0) {
            this.isConfigured = true;
        } else {
            this.isConfigured = z10;
        }
        if ((i10 & 32) == 0) {
            this.isRunning = true;
        } else {
            this.isRunning = z11;
        }
        if ((i10 & 64) == 0) {
            this.isInstalled = true;
        } else {
            this.isInstalled = z12;
        }
        if ((i10 & 128) == 0) {
            this.required = null;
        } else {
            this.required = bool;
        }
        if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.harddriveRequired = null;
        } else {
            this.harddriveRequired = bool2;
        }
        if ((i10 & 512) == 0) {
            this.installState = null;
        } else {
            this.installState = gVar;
        }
        if ((i10 & 1024) == 0) {
            this.state = null;
        } else {
            this.state = iVar;
        }
        if ((i10 & 2048) == 0) {
            this.updateAvailable = null;
        } else {
            this.updateAvailable = str3;
        }
        if ((i10 & 4096) == 0) {
            this.updateProgress = null;
        } else {
            this.updateProgress = num;
        }
    }

    public static final /* synthetic */ void r(UsersController self, Yi.d output, Xi.f serialDesc) {
        x.g(self, output, serialDesc);
        if (output.o(serialDesc, 0) || self.getVersion() != null) {
            output.t(serialDesc, 0, W0.f25599a, self.getVersion());
        }
        output.q(serialDesc, 1, ControllerUi.a.f53809a, self.getUi());
        if (output.o(serialDesc, 2) || !AbstractC6492s.d(self.getName(), "users")) {
            output.y(serialDesc, 2, self.getName());
        }
        if (output.o(serialDesc, 3) || self.getControllerType() != j.USERS) {
            output.q(serialDesc, 3, j.b.f53799f, self.getControllerType());
        }
        if (output.o(serialDesc, 4) || !self.o().booleanValue()) {
            output.i(serialDesc, 4, self.o().booleanValue());
        }
        if (output.o(serialDesc, 5) || !self.q().booleanValue()) {
            output.i(serialDesc, 5, self.q().booleanValue());
        }
        if (output.o(serialDesc, 6) || !self.p().booleanValue()) {
            output.i(serialDesc, 6, self.p().booleanValue());
        }
        if (output.o(serialDesc, 7) || self.getRequired() != null) {
            output.t(serialDesc, 7, C3710i.f25639a, self.getRequired());
        }
        if (output.o(serialDesc, 8) || self.getHarddriveRequired() != null) {
            output.t(serialDesc, 8, C3710i.f25639a, self.getHarddriveRequired());
        }
        if (output.o(serialDesc, 9) || self.getInstallState() != null) {
            output.t(serialDesc, 9, g.b.f53790f, self.getInstallState());
        }
        if (output.o(serialDesc, 10) || self.getState() != null) {
            output.t(serialDesc, 10, i.b.f53797f, self.getState());
        }
        if (output.o(serialDesc, 11) || self.getUpdateAvailable() != null) {
            output.t(serialDesc, 11, W0.f25599a, self.getUpdateAvailable());
        }
        if (!output.o(serialDesc, 12) && self.getUpdateProgress() == null) {
            return;
        }
        output.t(serialDesc, 12, W.f25597a, self.getUpdateProgress());
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
        if (!(other instanceof UsersController)) {
            return false;
        }
        UsersController usersController = (UsersController) other;
        return AbstractC6492s.d(this.version, usersController.version) && AbstractC6492s.d(this.ui, usersController.ui);
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
        String str = this.version;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.ui.hashCode();
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
        return "UsersController(version=" + this.version + ", ui=" + this.ui + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC6492s.i(dest, "dest");
        dest.writeString(this.version);
        this.ui.writeToParcel(dest, flags);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsersController(String str, ControllerUi ui2) {
        super(null);
        AbstractC6492s.i(ui2, "ui");
        this.version = str;
        this.ui = ui2;
        this.name = "users";
        this.controllerType = j.USERS;
        this.isConfigured = true;
        this.isRunning = true;
        this.isInstalled = true;
    }
}
