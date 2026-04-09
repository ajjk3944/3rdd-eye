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
@Vi.m("network")
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u0000 R2\u00020\u0001:\u0002S2B\u0087\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u009d\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0013\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u001d\u0010'\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0011¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b-\u0010*J\u001a\u00100\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010,R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b=\u00105R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u00103\u001a\u0004\b?\u00105R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b:\u0010HR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\bI\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010J\u001a\u0004\bK\u0010LR \u0010\u0016\u001a\u00020\u00068\u0016X\u0096D¢\u0006\u0012\n\u0004\bI\u0010;\u0012\u0004\bM\u0010N\u001a\u0004\bF\u0010,R \u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bK\u0010O\u0012\u0004\bQ\u0010N\u001a\u0004\b8\u0010P¨\u0006T"}, d2 = {"Lmb/r;", "Lmb/x;", "", "isConfigured", "isRunning", "isInstalled", "", "version", "required", "harddriveRequired", "Lmb/g;", "installState", "Lmb/i;", "state", "Lmb/k;", "ui", "updateAvailable", "", "updateProgress", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmb/g;Lmb/i;Lmb/k;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "name", "Lmb/j;", "controllerType", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmb/g;Lmb/i;Lmb/k;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lmb/j;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_RETRIES, "(Lmb/r;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Boolean;", SnmpConfigurator.O_OPERATION, "()Ljava/lang/Boolean;", SnmpConfigurator.O_COMMUNITY, "q", "d", "p", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/lang/String;", "f", "k", "g", "h", "Lmb/g;", "i", "()Lmb/g;", "Lmb/i;", "l", "()Lmb/i;", "j", "Lmb/k;", "()Lmb/k;", "m", "Ljava/lang/Integer;", SnmpConfigurator.O_CONTEXT_NAME, "()Ljava/lang/Integer;", "getName$annotations", "()V", "Lmb/j;", "()Lmb/j;", "getControllerType$annotations", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.r, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class NetworkController extends x {

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

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final j controllerType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<NetworkController> CREATOR = new c();

    /* renamed from: mb.r$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53886a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53886a = aVar;
            H0 h02 = new H0("network", aVar, 13);
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
            return new Vi.b[]{bVarU, bVarU2, bVarU3, Wi.a.u(w02), Wi.a.u(c3710i), Wi.a.u(c3710i), Wi.a.u(g.b.f53790f), Wi.a.u(i.b.f53797f), ControllerUi.a.f53809a, Wi.a.u(w02), Wi.a.u(W.f25597a), w02, j.b.f53799f};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final NetworkController c(Yi.e decoder) {
            int i10;
            Boolean bool;
            j jVar;
            String str;
            ControllerUi controllerUi;
            i iVar;
            Boolean bool2;
            Integer num;
            g gVar;
            Boolean bool3;
            String str2;
            Boolean bool4;
            Boolean bool5;
            String str3;
            Boolean bool6;
            Boolean bool7;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            if (cVarC.B()) {
                C3710i c3710i = C3710i.f25639a;
                Boolean bool8 = (Boolean) cVarC.h(fVar, 0, c3710i, null);
                Boolean bool9 = (Boolean) cVarC.h(fVar, 1, c3710i, null);
                Boolean bool10 = (Boolean) cVarC.h(fVar, 2, c3710i, null);
                W0 w02 = W0.f25599a;
                String str4 = (String) cVarC.h(fVar, 3, w02, null);
                Boolean bool11 = (Boolean) cVarC.h(fVar, 4, c3710i, null);
                Boolean bool12 = (Boolean) cVarC.h(fVar, 5, c3710i, null);
                g gVar2 = (g) cVarC.h(fVar, 6, g.b.f53790f, null);
                i iVar2 = (i) cVarC.h(fVar, 7, i.b.f53797f, null);
                ControllerUi controllerUi2 = (ControllerUi) cVarC.p(fVar, 8, ControllerUi.a.f53809a, null);
                String str5 = (String) cVarC.h(fVar, 9, w02, null);
                Integer num2 = (Integer) cVarC.h(fVar, 10, W.f25597a, null);
                String strW = cVarC.w(fVar, 11);
                jVar = (j) cVarC.p(fVar, 12, j.b.f53799f, null);
                i10 = 8191;
                str = str5;
                num = num2;
                str3 = strW;
                iVar = iVar2;
                gVar = gVar2;
                controllerUi = controllerUi2;
                str2 = str4;
                bool3 = bool11;
                bool4 = bool10;
                bool5 = bool9;
                bool = bool8;
                bool2 = bool12;
            } else {
                Boolean bool13 = null;
                Boolean bool14 = null;
                j jVar2 = null;
                String str6 = null;
                ControllerUi controllerUi3 = null;
                i iVar3 = null;
                Boolean bool15 = null;
                Integer num3 = null;
                g gVar3 = null;
                Boolean bool16 = null;
                String strW2 = null;
                boolean z10 = true;
                String str7 = null;
                int i11 = 0;
                Boolean bool17 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    switch (iK) {
                        case -1:
                            bool6 = bool14;
                            z10 = false;
                            bool14 = bool6;
                        case 0:
                            bool6 = bool14;
                            bool13 = (Boolean) cVarC.h(fVar, 0, C3710i.f25639a, bool13);
                            i11 |= 1;
                            bool14 = bool6;
                        case 1:
                            bool7 = bool13;
                            bool14 = (Boolean) cVarC.h(fVar, 1, C3710i.f25639a, bool14);
                            i11 |= 2;
                            bool13 = bool7;
                        case 2:
                            bool7 = bool13;
                            bool17 = (Boolean) cVarC.h(fVar, 2, C3710i.f25639a, bool17);
                            i11 |= 4;
                            bool13 = bool7;
                        case 3:
                            bool7 = bool13;
                            str7 = (String) cVarC.h(fVar, 3, W0.f25599a, str7);
                            i11 |= 8;
                            bool13 = bool7;
                        case 4:
                            bool7 = bool13;
                            bool16 = (Boolean) cVarC.h(fVar, 4, C3710i.f25639a, bool16);
                            i11 |= 16;
                            bool13 = bool7;
                        case 5:
                            bool7 = bool13;
                            bool15 = (Boolean) cVarC.h(fVar, 5, C3710i.f25639a, bool15);
                            i11 |= 32;
                            bool13 = bool7;
                        case 6:
                            bool7 = bool13;
                            gVar3 = (g) cVarC.h(fVar, 6, g.b.f53790f, gVar3);
                            i11 |= 64;
                            bool13 = bool7;
                        case 7:
                            bool7 = bool13;
                            iVar3 = (i) cVarC.h(fVar, 7, i.b.f53797f, iVar3);
                            i11 |= 128;
                            bool13 = bool7;
                        case 8:
                            bool7 = bool13;
                            controllerUi3 = (ControllerUi) cVarC.p(fVar, 8, ControllerUi.a.f53809a, controllerUi3);
                            i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            bool13 = bool7;
                        case 9:
                            bool7 = bool13;
                            str6 = (String) cVarC.h(fVar, 9, W0.f25599a, str6);
                            i11 |= 512;
                            bool13 = bool7;
                        case 10:
                            num3 = (Integer) cVarC.h(fVar, 10, W.f25597a, num3);
                            i11 |= 1024;
                            bool13 = bool13;
                        case 11:
                            bool7 = bool13;
                            strW2 = cVarC.w(fVar, 11);
                            i11 |= 2048;
                            bool13 = bool7;
                        case 12:
                            bool7 = bool13;
                            jVar2 = (j) cVarC.p(fVar, 12, j.b.f53799f, jVar2);
                            i11 |= 4096;
                            bool13 = bool7;
                        default:
                            throw new UnknownFieldException(iK);
                    }
                }
                i10 = i11;
                bool = bool13;
                jVar = jVar2;
                str = str6;
                controllerUi = controllerUi3;
                iVar = iVar3;
                bool2 = bool15;
                num = num3;
                gVar = gVar3;
                bool3 = bool16;
                str2 = str7;
                bool4 = bool17;
                bool5 = bool14;
                str3 = strW2;
            }
            cVarC.b(fVar);
            return new NetworkController(i10, bool, bool5, bool4, str2, bool3, bool2, gVar, iVar, controllerUi, str, num, str3, jVar, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, NetworkController value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            NetworkController.r(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.r$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53886a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mb.r$c */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkController createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
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
            return new NetworkController(boolValueOf, boolValueOf2, boolValueOf3, string, boolValueOf4, boolValueOf5, parcel.readInt() == 0 ? null : g.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()), ControllerUi.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NetworkController[] newArray(int i10) {
            return new NetworkController[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkController(int i10, Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, Boolean bool5, g gVar, i iVar, ControllerUi controllerUi, String str2, Integer num, String str3, j jVar, R0 r02) {
        super(i10, r02);
        if (256 != (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES)) {
            C0.a(i10, PSKKeyManager.MAX_KEY_LENGTH_BYTES, a.f53886a.a());
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
        this.name = (i10 & 2048) == 0 ? "network" : str3;
        this.controllerType = (i10 & 4096) == 0 ? j.NETWORK : jVar;
    }

    public static final /* synthetic */ void r(NetworkController self, Yi.d output, Xi.f serialDesc) {
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
        if (output.o(serialDesc, 11) || !AbstractC6492s.d(self.getName(), "network")) {
            output.y(serialDesc, 11, self.getName());
        }
        if (!output.o(serialDesc, 12) && self.getControllerType() == j.NETWORK) {
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
        if (!(other instanceof NetworkController)) {
            return false;
        }
        NetworkController networkController = (NetworkController) other;
        return AbstractC6492s.d(this.isConfigured, networkController.isConfigured) && AbstractC6492s.d(this.isRunning, networkController.isRunning) && AbstractC6492s.d(this.isInstalled, networkController.isInstalled) && AbstractC6492s.d(this.version, networkController.version) && AbstractC6492s.d(this.required, networkController.required) && AbstractC6492s.d(this.harddriveRequired, networkController.harddriveRequired) && this.installState == networkController.installState && this.state == networkController.state && AbstractC6492s.d(this.ui, networkController.ui) && AbstractC6492s.d(this.updateAvailable, networkController.updateAvailable) && AbstractC6492s.d(this.updateProgress, networkController.updateProgress);
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
        return iHashCode9 + (num != null ? num.hashCode() : 0);
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
        return "NetworkController(isConfigured=" + this.isConfigured + ", isRunning=" + this.isRunning + ", isInstalled=" + this.isInstalled + ", version=" + this.version + ", required=" + this.required + ", harddriveRequired=" + this.harddriveRequired + ", installState=" + this.installState + ", state=" + this.state + ", ui=" + this.ui + ", updateAvailable=" + this.updateAvailable + ", updateProgress=" + this.updateProgress + ")";
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkController(Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, Boolean bool5, g gVar, i iVar, ControllerUi ui2, String str2, Integer num) {
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
        this.name = "network";
        this.controllerType = j.NETWORK;
    }
}
