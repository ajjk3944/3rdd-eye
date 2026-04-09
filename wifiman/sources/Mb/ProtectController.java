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
import org.snmp4j.transport.TLSTM;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Vi.m("protect")
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0002V4B\u009f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016B±\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0015\u0010\u001dJ'\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\u00020#2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0011¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b/\u0010,J\u001a\u00102\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u00107R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010.R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\b?\u00107R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u00105\u001a\u0004\bA\u00107R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b<\u0010JR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\bK\u0010.R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bK\u0010=\u001a\u0004\bO\u0010.R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u00105\u001a\u0004\b\u0014\u00107R \u0010\u0018\u001a\u00020\u00068\u0016X\u0096D¢\u0006\u0012\n\u0004\b6\u0010=\u0012\u0004\bP\u0010Q\u001a\u0004\bH\u0010.R \u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b;\u0010R\u0012\u0004\bT\u0010Q\u001a\u0004\b:\u0010S¨\u0006W"}, d2 = {"Lmb/s;", "Lmb/x;", "", "isConfigured", "isRunning", "isInstalled", "", "version", "required", "harddriveRequired", "Lmb/g;", "installState", "Lmb/i;", "state", "Lmb/k;", "ui", "updateAvailable", "", "updateProgress", "uiVersion", "isGeofencingEnabled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmb/g;Lmb/i;Lmb/k;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "name", "Lmb/j;", "controllerType", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmb/g;Lmb/i;Lmb/k;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lmb/j;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_RETRIES, "(Lmb/s;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Boolean;", SnmpConfigurator.O_OPERATION, "()Ljava/lang/Boolean;", SnmpConfigurator.O_COMMUNITY, "q", "d", "p", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/lang/String;", "f", "k", "g", "h", "Lmb/g;", "i", "()Lmb/g;", "Lmb/i;", "l", "()Lmb/i;", "j", "Lmb/k;", "()Lmb/k;", "m", "Ljava/lang/Integer;", SnmpConfigurator.O_CONTEXT_NAME, "()Ljava/lang/Integer;", "getUiVersion", "getName$annotations", "()V", "Lmb/j;", "()Lmb/j;", "getControllerType$annotations", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.s, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class ProtectController extends x {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isConfigured;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isRunning;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isInstalled;

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

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uiVersion;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isGeofencingEnabled;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final j controllerType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ProtectController> CREATOR = new c();

    /* renamed from: mb.s$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53902a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53902a = aVar;
            H0 h02 = new H0("protect", aVar, 15);
            h02.p("isConfigured", true);
            h02.p("isRunning", true);
            h02.p("isInstalled", true);
            h02.p("version", true);
            h02.p("required", true);
            h02.p("harddriveRequired", true);
            h02.p("installState", true);
            h02.p("state", true);
            h02.p("ui", false);
            h02.p("updateAvailable", true);
            h02.p("updateProgress", true);
            h02.p("uiVersion", true);
            h02.p("isGeofencingEnabled", true);
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
            Vi.b bVarU = Wi.a.u(c3710i);
            Vi.b bVarU2 = Wi.a.u(c3710i);
            Vi.b bVarU3 = Wi.a.u(c3710i);
            W0 w02 = W0.f25599a;
            return new Vi.b[]{bVarU, bVarU2, bVarU3, Wi.a.u(w02), Wi.a.u(c3710i), Wi.a.u(c3710i), Wi.a.u(g.b.f53790f), Wi.a.u(i.b.f53797f), ControllerUi.a.f53809a, Wi.a.u(w02), Wi.a.u(W.f25597a), Wi.a.u(w02), Wi.a.u(c3710i), w02, j.b.f53799f};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final ProtectController c(Yi.e decoder) {
            int i10;
            Boolean bool;
            String str;
            j jVar;
            Boolean bool2;
            Integer num;
            String str2;
            ControllerUi controllerUi;
            g gVar;
            String str3;
            i iVar;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Boolean bool6;
            String str4;
            Boolean bool7;
            Boolean bool8;
            Boolean bool9;
            Boolean bool10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            j jVar2 = null;
            if (cVarC.B()) {
                C3710i c3710i = C3710i.f25639a;
                Boolean bool11 = (Boolean) cVarC.h(fVar, 0, c3710i, null);
                Boolean bool12 = (Boolean) cVarC.h(fVar, 1, c3710i, null);
                Boolean bool13 = (Boolean) cVarC.h(fVar, 2, c3710i, null);
                W0 w02 = W0.f25599a;
                String str5 = (String) cVarC.h(fVar, 3, w02, null);
                Boolean bool14 = (Boolean) cVarC.h(fVar, 4, c3710i, null);
                Boolean bool15 = (Boolean) cVarC.h(fVar, 5, c3710i, null);
                g gVar2 = (g) cVarC.h(fVar, 6, g.b.f53790f, null);
                i iVar2 = (i) cVarC.h(fVar, 7, i.b.f53797f, null);
                ControllerUi controllerUi2 = (ControllerUi) cVarC.p(fVar, 8, ControllerUi.a.f53809a, null);
                String str6 = (String) cVarC.h(fVar, 9, w02, null);
                Integer num2 = (Integer) cVarC.h(fVar, 10, W.f25597a, null);
                String str7 = (String) cVarC.h(fVar, 11, w02, null);
                Boolean bool16 = (Boolean) cVarC.h(fVar, 12, c3710i, null);
                String strW = cVarC.w(fVar, 13);
                jVar = (j) cVarC.p(fVar, 14, j.b.f53799f, null);
                i10 = 32767;
                bool = bool11;
                str3 = str7;
                gVar = gVar2;
                str2 = str6;
                iVar = iVar2;
                controllerUi = controllerUi2;
                bool3 = bool15;
                str = str5;
                str4 = strW;
                bool6 = bool14;
                bool5 = bool13;
                bool2 = bool16;
                num = num2;
                bool4 = bool12;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Boolean bool17 = null;
                String str8 = null;
                Boolean bool18 = null;
                Boolean bool19 = null;
                Boolean bool20 = null;
                Integer num3 = null;
                String str9 = null;
                ControllerUi controllerUi3 = null;
                g gVar3 = null;
                String str10 = null;
                i iVar3 = null;
                Boolean bool21 = null;
                String strW2 = null;
                Boolean bool22 = null;
                while (z10) {
                    Boolean bool23 = bool18;
                    int iK = cVarC.k(fVar);
                    switch (iK) {
                        case -1:
                            bool8 = bool17;
                            bool9 = bool19;
                            bool10 = bool23;
                            z10 = false;
                            bool18 = bool10;
                            bool19 = bool9;
                            bool17 = bool8;
                        case 0:
                            bool8 = bool17;
                            bool9 = bool19;
                            bool10 = bool23;
                            bool22 = (Boolean) cVarC.h(fVar, 0, C3710i.f25639a, bool22);
                            i11 |= 1;
                            bool18 = bool10;
                            bool19 = bool9;
                            bool17 = bool8;
                        case 1:
                            bool8 = bool17;
                            bool9 = bool19;
                            bool18 = (Boolean) cVarC.h(fVar, 1, C3710i.f25639a, bool23);
                            i11 |= 2;
                            bool19 = bool9;
                            bool17 = bool8;
                        case 2:
                            i11 |= 4;
                            bool19 = (Boolean) cVarC.h(fVar, 2, C3710i.f25639a, bool19);
                            bool17 = bool17;
                            bool18 = bool23;
                        case 3:
                            bool7 = bool19;
                            str8 = (String) cVarC.h(fVar, 3, W0.f25599a, str8);
                            i11 |= 8;
                            bool18 = bool23;
                            bool19 = bool7;
                        case 4:
                            bool7 = bool19;
                            bool17 = (Boolean) cVarC.h(fVar, 4, C3710i.f25639a, bool17);
                            i11 |= 16;
                            bool18 = bool23;
                            bool19 = bool7;
                        case 5:
                            bool7 = bool19;
                            bool21 = (Boolean) cVarC.h(fVar, 5, C3710i.f25639a, bool21);
                            i11 |= 32;
                            bool18 = bool23;
                            bool19 = bool7;
                        case 6:
                            bool7 = bool19;
                            gVar3 = (g) cVarC.h(fVar, 6, g.b.f53790f, gVar3);
                            i11 |= 64;
                            bool18 = bool23;
                            bool19 = bool7;
                        case 7:
                            bool7 = bool19;
                            iVar3 = (i) cVarC.h(fVar, 7, i.b.f53797f, iVar3);
                            i11 |= 128;
                            bool18 = bool23;
                            bool19 = bool7;
                        case 8:
                            bool7 = bool19;
                            controllerUi3 = (ControllerUi) cVarC.p(fVar, 8, ControllerUi.a.f53809a, controllerUi3);
                            i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            bool18 = bool23;
                            bool19 = bool7;
                        case 9:
                            bool7 = bool19;
                            str9 = (String) cVarC.h(fVar, 9, W0.f25599a, str9);
                            i11 |= 512;
                            bool18 = bool23;
                            bool19 = bool7;
                        case 10:
                            bool7 = bool19;
                            num3 = (Integer) cVarC.h(fVar, 10, W.f25597a, num3);
                            i11 |= 1024;
                            bool18 = bool23;
                            bool19 = bool7;
                        case 11:
                            bool7 = bool19;
                            str10 = (String) cVarC.h(fVar, 11, W0.f25599a, str10);
                            i11 |= 2048;
                            bool18 = bool23;
                            bool19 = bool7;
                        case 12:
                            bool7 = bool19;
                            bool20 = (Boolean) cVarC.h(fVar, 12, C3710i.f25639a, bool20);
                            i11 |= 4096;
                            bool18 = bool23;
                            bool19 = bool7;
                        case 13:
                            bool7 = bool19;
                            strW2 = cVarC.w(fVar, 13);
                            i11 |= 8192;
                            bool18 = bool23;
                            bool19 = bool7;
                        case 14:
                            bool7 = bool19;
                            jVar2 = (j) cVarC.p(fVar, 14, j.b.f53799f, jVar2);
                            i11 |= TLSTM.TLS_MAX_FRAGMENT_SIZE;
                            bool18 = bool23;
                            bool19 = bool7;
                        default:
                            throw new UnknownFieldException(iK);
                    }
                }
                i10 = i11;
                bool = bool22;
                str = str8;
                jVar = jVar2;
                bool2 = bool20;
                num = num3;
                str2 = str9;
                controllerUi = controllerUi3;
                gVar = gVar3;
                str3 = str10;
                iVar = iVar3;
                bool3 = bool21;
                bool4 = bool18;
                bool5 = bool19;
                bool6 = bool17;
                str4 = strW2;
            }
            cVarC.b(fVar);
            return new ProtectController(i10, bool, bool4, bool5, str, bool6, bool3, gVar, iVar, controllerUi, str2, num, str3, bool2, str4, jVar, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, ProtectController value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            ProtectController.r(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.s$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53902a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mb.s$c */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProtectController createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            AbstractC6492s.i(parcel, "parcel");
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
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            g gVarValueOf = parcel.readInt() == 0 ? null : g.valueOf(parcel.readString());
            i iVarValueOf = parcel.readInt() == 0 ? null : i.valueOf(parcel.readString());
            ControllerUi controllerUiCreateFromParcel = ControllerUi.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ProtectController(boolValueOf, boolValueOf2, boolValueOf3, string, boolValueOf4, boolValueOf5, gVarValueOf, iVarValueOf, controllerUiCreateFromParcel, string2, numValueOf, string3, boolValueOf6);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProtectController[] newArray(int i10) {
            return new ProtectController[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProtectController(int i10, Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, Boolean bool5, g gVar, i iVar, ControllerUi controllerUi, String str2, Integer num, String str3, Boolean bool6, String str4, j jVar, R0 r02) {
        super(i10, r02);
        if (256 != (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES)) {
            C0.a(i10, PSKKeyManager.MAX_KEY_LENGTH_BYTES, a.f53902a.a());
        }
        if ((i10 & 1) == 0) {
            this.isConfigured = null;
        } else {
            this.isConfigured = bool;
        }
        if ((i10 & 2) == 0) {
            this.isRunning = null;
        } else {
            this.isRunning = bool2;
        }
        if ((i10 & 4) == 0) {
            this.isInstalled = null;
        } else {
            this.isInstalled = bool3;
        }
        if ((i10 & 8) == 0) {
            this.version = null;
        } else {
            this.version = str;
        }
        if ((i10 & 16) == 0) {
            this.required = null;
        } else {
            this.required = bool4;
        }
        if ((i10 & 32) == 0) {
            this.harddriveRequired = null;
        } else {
            this.harddriveRequired = bool5;
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
        this.ui = controllerUi;
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
        if ((i10 & 2048) == 0) {
            this.uiVersion = null;
        } else {
            this.uiVersion = str3;
        }
        if ((i10 & 4096) == 0) {
            this.isGeofencingEnabled = null;
        } else {
            this.isGeofencingEnabled = bool6;
        }
        this.name = (i10 & 8192) == 0 ? "protect" : str4;
        this.controllerType = (i10 & TLSTM.TLS_MAX_FRAGMENT_SIZE) == 0 ? j.PROTECT : jVar;
    }

    public static final /* synthetic */ void r(ProtectController self, Yi.d output, Xi.f serialDesc) {
        x.g(self, output, serialDesc);
        if (output.o(serialDesc, 0) || self.getIsConfigured() != null) {
            output.t(serialDesc, 0, C3710i.f25639a, self.getIsConfigured());
        }
        if (output.o(serialDesc, 1) || self.getIsRunning() != null) {
            output.t(serialDesc, 1, C3710i.f25639a, self.getIsRunning());
        }
        if (output.o(serialDesc, 2) || self.getIsInstalled() != null) {
            output.t(serialDesc, 2, C3710i.f25639a, self.getIsInstalled());
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
        output.q(serialDesc, 8, ControllerUi.a.f53809a, self.getUi());
        if (output.o(serialDesc, 9) || self.getUpdateAvailable() != null) {
            output.t(serialDesc, 9, W0.f25599a, self.getUpdateAvailable());
        }
        if (output.o(serialDesc, 10) || self.getUpdateProgress() != null) {
            output.t(serialDesc, 10, W.f25597a, self.getUpdateProgress());
        }
        if (output.o(serialDesc, 11) || self.uiVersion != null) {
            output.t(serialDesc, 11, W0.f25599a, self.uiVersion);
        }
        if (output.o(serialDesc, 12) || self.isGeofencingEnabled != null) {
            output.t(serialDesc, 12, C3710i.f25639a, self.isGeofencingEnabled);
        }
        if (output.o(serialDesc, 13) || !AbstractC6492s.d(self.getName(), "protect")) {
            output.y(serialDesc, 13, self.getName());
        }
        if (!output.o(serialDesc, 14) && self.getControllerType() == j.PROTECT) {
            return;
        }
        output.q(serialDesc, 14, j.b.f53799f, self.getControllerType());
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
        if (!(other instanceof ProtectController)) {
            return false;
        }
        ProtectController protectController = (ProtectController) other;
        return AbstractC6492s.d(this.isConfigured, protectController.isConfigured) && AbstractC6492s.d(this.isRunning, protectController.isRunning) && AbstractC6492s.d(this.isInstalled, protectController.isInstalled) && AbstractC6492s.d(this.version, protectController.version) && AbstractC6492s.d(this.required, protectController.required) && AbstractC6492s.d(this.harddriveRequired, protectController.harddriveRequired) && this.installState == protectController.installState && this.state == protectController.state && AbstractC6492s.d(this.ui, protectController.ui) && AbstractC6492s.d(this.updateAvailable, protectController.updateAvailable) && AbstractC6492s.d(this.updateProgress, protectController.updateProgress) && AbstractC6492s.d(this.uiVersion, protectController.uiVersion) && AbstractC6492s.d(this.isGeofencingEnabled, protectController.isGeofencingEnabled);
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
        Boolean bool = this.isConfigured;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isRunning;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isInstalled;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.version;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool4 = this.required;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.harddriveRequired;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        g gVar = this.installState;
        int iHashCode7 = (iHashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        i iVar = this.state;
        int iHashCode8 = (((iHashCode7 + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.ui.hashCode()) * 31;
        String str2 = this.updateAvailable;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.updateProgress;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.uiVersion;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool6 = this.isGeofencingEnabled;
        return iHashCode11 + (bool6 != null ? bool6.hashCode() : 0);
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

    /* renamed from: o, reason: from getter */
    public Boolean getIsConfigured() {
        return this.isConfigured;
    }

    /* renamed from: p, reason: from getter */
    public Boolean getIsInstalled() {
        return this.isInstalled;
    }

    /* renamed from: q, reason: from getter */
    public Boolean getIsRunning() {
        return this.isRunning;
    }

    public String toString() {
        return "ProtectController(isConfigured=" + this.isConfigured + ", isRunning=" + this.isRunning + ", isInstalled=" + this.isInstalled + ", version=" + this.version + ", required=" + this.required + ", harddriveRequired=" + this.harddriveRequired + ", installState=" + this.installState + ", state=" + this.state + ", ui=" + this.ui + ", updateAvailable=" + this.updateAvailable + ", updateProgress=" + this.updateProgress + ", uiVersion=" + this.uiVersion + ", isGeofencingEnabled=" + this.isGeofencingEnabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC6492s.i(dest, "dest");
        Boolean bool = this.isConfigured;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isRunning;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isInstalled;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.version);
        Boolean bool4 = this.required;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.harddriveRequired;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool5.booleanValue() ? 1 : 0);
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
        dest.writeString(this.uiVersion);
        Boolean bool6 = this.isGeofencingEnabled;
        if (bool6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool6.booleanValue() ? 1 : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProtectController(Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, Boolean bool5, g gVar, i iVar, ControllerUi ui2, String str2, Integer num, String str3, Boolean bool6) {
        super(null);
        AbstractC6492s.i(ui2, "ui");
        this.isConfigured = bool;
        this.isRunning = bool2;
        this.isInstalled = bool3;
        this.version = str;
        this.required = bool4;
        this.harddriveRequired = bool5;
        this.installState = gVar;
        this.state = iVar;
        this.ui = ui2;
        this.updateAvailable = str2;
        this.updateProgress = num;
        this.uiVersion = str3;
        this.isGeofencingEnabled = bool6;
        this.name = "protect";
        this.controllerType = j.PROTECT;
    }
}
